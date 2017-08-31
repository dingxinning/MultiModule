package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Wuxiang on 2017/4/7.
 * 替代web.xml配置
 * getServletMappings表示将/为前缀的路径映射到此servlet
 * getRootConfigClasses方法返回的类，当ContextLoaderListener创建上下文时，会加载这些类中配置的bean
 * getServletConfigClasses方法返回的类，当DispatchServlet加载应用上下文时，会使用这些配置类中的bean
 */
public class SpittrWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }
}
