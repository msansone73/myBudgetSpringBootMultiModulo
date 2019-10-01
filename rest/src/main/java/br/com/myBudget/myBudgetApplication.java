package br.com.myBudget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"br.com.myBudget"})
@EntityScan(basePackages = {"br.com.myBudget"})
@ComponentScan(basePackages = {"br.com.myBudget"})
public class myBudgetApplication {
    public static void main(String[] args){
        SpringApplication.run(myBudgetApplication.class);
    }

}
