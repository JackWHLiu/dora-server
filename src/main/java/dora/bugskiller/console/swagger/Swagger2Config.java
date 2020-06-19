package dora.bugskiller.console.swagger;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

   @Value("${swagger2.enable}")
   private boolean enable;

   @Bean("DoraApis")
   public Docket doraApis() {
       return new Docket(DocumentationType.SWAGGER_2)
           .groupName("Dora崩溃日志收集控制台")
           .select()
           .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
           .paths(PathSelectors.any())
           .build()
           .apiInfo(apiInfo())
           .enable(enable);
   }

   private ApiInfo apiInfo() {
       return new ApiInfoBuilder()
           .title("Dora崩溃日志收集接口文档")
           .description("提供崩溃日志CRUD的文档")
           .termsOfServiceUrl("https://github.com/JackWHLiu/dora-console.git")
           .version("1.0")
           .build();
   }
}
