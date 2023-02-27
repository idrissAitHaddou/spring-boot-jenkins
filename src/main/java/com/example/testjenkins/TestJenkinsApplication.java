package com.example.testjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsApplication {

//    docker exec jenkins cat /var/jenkins_home/secrets/initialAdminPassword
    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
        System.out.println("hello world !!");
    }

}
