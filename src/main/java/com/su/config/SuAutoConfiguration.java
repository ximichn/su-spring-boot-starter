package com.su.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass()
@ConditionalOnProperty(prefix = "custom", name = "enabled", matchIfMissing = true)
public class MyAutoConfiguration {
}
