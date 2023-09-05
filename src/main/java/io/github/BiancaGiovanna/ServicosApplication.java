package io.github.BiancaGiovanna;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServicosApplication implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @GetMapping("/hello")
    public  String helloWorld(){
        return "Hello World";
    }
    public static void main(String[] args) {
        SpringApplication.run(ServicosApplication.class, args);

    }
    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(8081);
    }
}
