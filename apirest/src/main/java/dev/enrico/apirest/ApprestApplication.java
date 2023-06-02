package dev.enrico.apirest;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApprestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApprestApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Servidor de tarefas")
                        .version("1.0.0")
                        .contact(new io.swagger.v3.oas.models.info.Contact().email("enricogollner.tech@gmail.com").name("Enrico Gollner"))
                        .description("Exemplo de REST API para tarefas")
                );
    }

}
