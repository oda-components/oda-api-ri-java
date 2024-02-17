package com.odac.tmfapi.tmf676.oapi.config;

import com.odac.tmfapi.tmf676.oapi.model.PaymentStatusExampleType;
import com.odac.tmfapi.tmf676.oapi.model.RefundStatusExampleType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "com.odac.tmfapi.tmf676.oapi.config.EnumConverterConfiguration.paymentStatusExampleTypeConverter")
    Converter<String, PaymentStatusExampleType> paymentStatusExampleTypeConverter() {
        return new Converter<String, PaymentStatusExampleType>() {
            @Override
            public PaymentStatusExampleType convert(String source) {
                return PaymentStatusExampleType.fromValue(source);
            }
        };
    }
    @Bean(name = "com.odac.tmfapi.tmf676.oapi.config.EnumConverterConfiguration.refundStatusExampleTypeConverter")
    Converter<String, RefundStatusExampleType> refundStatusExampleTypeConverter() {
        return new Converter<String, RefundStatusExampleType>() {
            @Override
            public RefundStatusExampleType convert(String source) {
                return RefundStatusExampleType.fromValue(source);
            }
        };
    }

}
