package cn.itsource.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer    //请用配置服务端
public class ServiceConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceConfigApplication.class,args);
    }
}
