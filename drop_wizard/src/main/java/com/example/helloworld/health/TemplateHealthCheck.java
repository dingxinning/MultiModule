package com.example.helloworld.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by Wuxiang on 2018/5/3
 *
 * HealthCheck用来创建测试，确保在生产环境下运行正常。
 */
public class TemplateHealthCheck extends HealthCheck {

    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
