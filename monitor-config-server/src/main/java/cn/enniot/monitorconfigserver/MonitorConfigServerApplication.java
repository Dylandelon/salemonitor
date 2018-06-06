package cn.enniot.monitorconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MonitorConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorConfigServerApplication.class, args);
    }
}
