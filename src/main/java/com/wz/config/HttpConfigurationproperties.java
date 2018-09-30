package com.wz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;


/**
 * @description:
 * @author: WZ
 * @create: 2018-07-08 09:57
 **/

@Configuration
@EnableConfigurationProperties(HttpEncodingProperties.class)
//开启属性注入
@ConditionalOnClass
@ConditionalOnProperty(prefix = "spring.http.encoding",value = "enabled",matchIfMissing = true)
public class HttpConfigurationproperties {

    @Autowired
    private  HttpEncodingProperties httpEncodingProperties;

    @ConditionalOnMissingBean
    @Bean
    public CharacterEncodingFilter characterEncodingFilter(){
        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
        filter.setEncoding(this.httpEncodingProperties.getCharset().name());
        filter.setForceEncoding(this.httpEncodingProperties.isForce());
        return  filter;
    }

}
