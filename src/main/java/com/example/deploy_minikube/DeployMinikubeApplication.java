package com.example.deploy_minikube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployMinikubeApplication {
    @GetMapping("/displayMessage")
    public String displayMessage(){
        return "Congratulation! You successfully deployed your application to kubernetes";
    }
    public static void main(String[] args) {
        SpringApplication.run(DeployMinikubeApplication.class, args);
    }

}
