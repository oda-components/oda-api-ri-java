package com.odac.tmfapi.tmf676.oapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.odac.tmfapi.tmf676.oapi.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Payment")
                                .description("## TMF API Reference : TMF 676 - Payment  This API provides the standardized client interface to Payment Systems for managing performed payments or refunds. Examples of Payment API originators (clients) include Web servers, mobile app servers, Contact center dashboards or retail store systems.")
                                .version("4.0.0")
                )
        ;
    }
}