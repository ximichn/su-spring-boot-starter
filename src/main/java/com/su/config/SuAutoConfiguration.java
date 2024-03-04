package com.su.config;

import com.su.util.SuDateUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SuDateUtil.class)
@ConditionalOnProperty(prefix = "su", name = "enabled", matchIfMissing = true)
@EnableConfigurationProperties(SuProperties.class)
public class SuAutoConfiguration {

    private final SuProperties suProperties;

    public SuAutoConfiguration(SuProperties suProperties) {
        this.suProperties = suProperties;
    }

    @Bean
    public SuDateUtil suDateUtil() {
        return new SuDateUtil(suProperties.getPattern());
    }

}
