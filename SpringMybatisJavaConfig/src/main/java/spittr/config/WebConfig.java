package spittr.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Wuxiang on 2017/4/7.
 * @Configuration 注解标识这是一个配置类，
 * @EnableWebMvc 注解启用spring mvc，
 * @ComponentScan 注解配置要扫描的组件，根据此配置来查找控制器；
 *
 * viewResolver方法，返回jsp视图解析器，用于映射jsp；
 * configureDefaultServletHandling方法配置默认的sevlet，当请求匹配不到DispatchServlet的映射路径时，会使用默认的Servlet；
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "spittr.web.controller")
public class WebConfig  extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer){
        // 开启默认转发
        configurer.enable();
    }

}
