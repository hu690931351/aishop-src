package cn.itsource.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication2000 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication2000.class,args);
    }
}
