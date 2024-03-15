package io.tutorialSpring.swagger;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

@Configuration
@OpenAPIDefinition

public class SwaggerConfig {


    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("api")
                .pathsToMatch("/api/**")
                .packagesToScan("io.tutorial.spring.GarageApp.controller")
                .build();
    }
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("GARAGE SERVICE MANAGEMENT")
                        .version("0.0.1")
                        .description("API for my application")
                        .license(new License()
                                .name("Copyright connect technology"))
                        .contact(new Contact()
                                .name("ARNOLD ZABALETA")
                                .url("")
                                .email("arnoldzabaleta22@gmail.com")))
                .addSecurityItem(new SecurityRequirement().addList(HttpHeaders.AUTHORIZATION))
                .paths(new Paths()
                        .addPathItem("/api", new PathItem()));

//                                new Operation().operationId("getApi")
//                                        .description("Get API information")
//                                        .responses(new ApiResponses().addApiResponse("200",
//                                                new ApiResponse().description("Successful operation"))))));
    }



}
