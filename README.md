创建自己的 Spring Boot Starter
1：创建 maven 项目，第三方命名格式是 xx-spring-boot-starter
2：编辑 pom.xml，添加依赖 spring-boot-starter 和 spring-boot-autoconfigure
3：创建一个用 @Configuration 注释的配置类，创建相应的 Bean 对象。可以使用 @Conditional 等注解来控制配置何时生效
4：在 src/main/resources/META-INF/spring 目录下创建 org.springframework.boot.autoconfigure.AutoConfiguration.imports 文件，添加配置信息：com.su.config.SuAutoConfiguration。
SpringBoot2.7 之前的版本在 src/main/resources/META-INF 目录下创建 spring.factories 文件，并加入配置：org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.su.config.SuAutoConfiguration