package com.estufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProjectApplication.class, args);
    System.out.println("Estufa Application Started Successfully!");
  }
}