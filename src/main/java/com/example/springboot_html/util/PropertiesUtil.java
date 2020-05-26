package com.example.springboot_html.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jiaohongtao
 * @version 1.0
 * @since 2020年04月26日
 */
@Component
public class PropertiesUtil {

    @Value("${my.name}")
    private String myName;

    private void getName() {
        System.out.println(myName);
    }

    public static void main(String[] args) {
        PropertiesUtil util = new PropertiesUtil();
        util.getName();
    }
}
