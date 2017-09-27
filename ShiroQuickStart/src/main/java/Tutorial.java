import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * Apache Shiro 10分钟教程
 *
 * > mvn compile exec:java
 */
public class Tutorial
{
    private static final transient Logger log = LoggerFactory.getLogger(Tutorial.class);

    public static void main(String[] args) {
        log.info("My First Apache Shiro Application");

        //1. 加载配置文件
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");

        //2. 解析文件，获取实例
        SecurityManager securityManager = factory.getInstance();

        //3.
        SecurityUtils.setSecurityManager(securityManager);

        // 获得当前正在执行的Subject
        Subject currentUser = SecurityUtils.getSubject();

        // Session 不需要HTTP环境
        Session session = currentUser.getSession();
        session.setAttribute( "someKey", "aValue" );

        String value = (String) session.getAttribute("someKey");
        if (value.equals("aValue")) {
            log.info("根据key，得到了正确的value! [" + value + "]");
        }

        // 让我们登录当前用户，以便我们检查角色和权限
        // 当前用户 lonestarr 拥有角色（vespa, goodguy, schwartz）
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr", "vespa");
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            } catch (UnknownAccountException uae) {
                log.info("There is no user with username of " + token.getPrincipal());
            } catch (IncorrectCredentialsException ice) {
                log.info("Password for account " + token.getPrincipal() + " was incorrect!");
            } catch (LockedAccountException lae) {
                log.info("The account for username " + token.getPrincipal() + " is locked.  " +
                        "Please contact your administrator to unlock it.");
            }
            // ... catch more exceptions here (maybe custom ones specific to your application?
            catch (AuthenticationException ae) {
                //unexpected condition?  error?
            }
        }

        //print their identifying principal (in this case, a username):
        log.info( "用户 [" + currentUser.getPrincipal() + "] 成功登陆." );

        // 测试角色
        if ( currentUser.hasRole( "schwartz" ) ) {
            log.info("愿 Schwartz 与你同在！" );
        } else {
            log.info( "你好，凡人." );
        }

        // 测试权限
        if ( currentUser.isPermitted( "lightsaber:weild" ) ) {
            log.info("你可以使用光剑戒指，明智地使用");
        } else {
            log.info("对不起，光剑戒指只适用于 Schwartz主人。");
        }

        // 测试权限
        if ( currentUser.isPermitted( "winnebago:drive:eagle5" ) ) {
            log.info("你被允许用 eagle5 驾驭 winnebago，这是钥匙 - 玩得开心！!");
        } else {
            log.info("对不起，你不能驾驭 eagle5 winnebago !");
        }

        currentUser.logout(); //removes all identifying information and invalidates their session too.

        System.exit(0);
    }
}
