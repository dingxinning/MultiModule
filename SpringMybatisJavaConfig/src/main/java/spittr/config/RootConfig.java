package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Wuxiang on 2017/4/7.
 * 通过注解排除了 WebConfig 文件
 */

//没有整合Mybatis之前的配置
//@Configuration
//@ComponentScan(basePackages = {"spittr"},
//        excludeFilters = {
//                @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
//        })
//public class RootConfig {
//}

@Configuration
@ComponentScan(basePackages = {"spittr.web.service"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
@Import(DataConfig.class)
public class RootConfig {
}