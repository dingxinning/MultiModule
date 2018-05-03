package com.example.helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.example.helloworld.resources.HelloWorldResource;
import com.example.helloworld.health.TemplateHealthCheck;

/**
 * Created by Wuxiang on 2018/5/3
 *
 * 将所有开发包及命令组合提供基本功能
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {

        // 从HelloWorldConfiguration实例读取模板和默认名字
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        // HealthCheck用来创建测试，确保在生产环境下运行正常。
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());

        // 注册 Template HealthCheck
        environment.healthChecks().register("template", healthCheck);

        // 注册 HelloWorld Resource
        environment.jersey().register(resource);
    }

}
