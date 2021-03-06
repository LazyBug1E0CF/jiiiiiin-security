package cn.jiiiiiin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author jiiiiiin
 */
@RestController
@EnableApolloConfig
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderApp {

    @Value("${server.port}")
    private int port;

    public static void main(String[] args) {
        val app = new SpringApplication(OrderApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @GetMapping
    public String getTime() {
        return "The current time is " + new Date().toString() + "(answered by service running on " + port + ")";
    }

}
