package com.wz.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * @description:
 * @author: WZ
 * @create: 2018-07-07 23:41
 **/
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {

    private static final Charset DEFAULT_CHARTSET = Charset.forName("UTF-8");

    private Charset charset = DEFAULT_CHARTSET;

    private boolean force = true;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
