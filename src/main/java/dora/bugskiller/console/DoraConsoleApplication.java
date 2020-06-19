package dora.bugskiller.console;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("dora.bugskiller.console.mapper")
public class DoraConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoraConsoleApplication.class, args);
        System.out.println("Dora崩溃日志收集Server已运行");
    }
}
