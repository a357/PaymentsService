package com.appdeveloperblog.estore.paymentservice.config;

import com.thoughtworks.xstream.XStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Bean
    public XStream xStream() {
        XStream xStream = new XStream();

        xStream.allowTypesByWildcard(new String[] {
                "com.appdeveloperblog.estore.core.**",
                "com.appdeveloperblog.estore.paymentservice.**"
        });
        return xStream;
    }
}