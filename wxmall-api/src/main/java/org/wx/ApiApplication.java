package org.wx;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"org.wx.mall.api","org.wx.mall.core","org.wx.mall.common"})
@MapperScan("org.wx.mall.core.mapper")
public class ApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(ApiApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiApplication.class);
    }

}
