package com.ss.poc.config;
import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwagerConfig {
	@Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("testswager")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/greeting.*"))
                .build();
    }
     
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger Api")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("https://www.capgemini.com/terms-of-use")
                .contact("Saurav Singh")
                .title("Test Gettings Api")
                .version("2.0")
                .build();
    }
}
