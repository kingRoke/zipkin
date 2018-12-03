package com.yicloud.zipkin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableZipkinStreamServer
@SpringBootApplication
public class MicroserviceZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZipkinServerApplication.class, args);
    }
}
