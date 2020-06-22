package dora.bugskiller.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("dora.bugskiller.server.mapper")
public class DoraServer {

    public static void main(String[] args) {
        SpringApplication.run(DoraServer.class, args);
        System.out.println("Dora崩溃日志收集Server已运行");
    }
}
