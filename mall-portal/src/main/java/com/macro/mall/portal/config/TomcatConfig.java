package com.macro.mall.portal.config;

import org.springframework.context.annotation.Configuration;
//import io.undertow.connector.*;

/**
 * tomcat相关配置
 * Created by macro on 2018/8/7.
 */
//@Profile("dev")
@Configuration
public class TomcatConfig {
//    @Value("${http.port}")
//    private Integer port;
//    @Bean
//    public TomcatServletWebServerFactory servletContainer() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createStandardConnector()); // 添加http
//        return tomcat;
//    }
//
//    //配置http
//    private Connector createStandardConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(port);
//        return connector;
//    }
}
