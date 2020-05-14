package com.springboot.fast.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 配置文件读取
 */

@Configuration
@PropertySource(value = "", ignoreResourceNotFound = true,encoding = "UTF-8" )
@ConfigurationProperties(prefix = "app")
@Data
public class AppPropConfig {
    private String menuPrefix;
    private String menuSuffix;
    private String picStoragePath;
    private String picRequestPath;
}
