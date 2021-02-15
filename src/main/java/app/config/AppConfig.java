package app.config;

import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

/*
    @Bean(name = "dog")
    public Dog getHelloWorld() {
        Dog dog = new Dog();
        Dog.setName("Bob");
        return dog;
    }*/
}
