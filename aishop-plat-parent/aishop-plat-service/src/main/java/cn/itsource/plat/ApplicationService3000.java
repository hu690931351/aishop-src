package cn.itsource.plat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationService3000 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationService3000.class,args);
    }
}
