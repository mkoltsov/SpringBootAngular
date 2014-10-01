package demo;

import com.google.common.collect.ImmutableMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
public class Application {

    @RequestMapping("/")
    Map home() {
        return ImmutableMap.of("chef", "pupa");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
