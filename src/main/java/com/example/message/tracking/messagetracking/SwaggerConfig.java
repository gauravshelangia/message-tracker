package com.example.message.tracking.messagetracking;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;


/**
 * Created by gaurav on 23/02/18.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket postsApi() {
    return new Docket(DocumentationType.SWAGGER_2).groupName("Message tracker").apiInfo(apiInfo())
        .select().apis(RequestHandlerSelectors
            .basePackage("com.example.message.tracking.messagetracking.rest.web"))
        .paths(postPaths()).build();
  }

  private Predicate<String> postPaths() {
    return or(regex("/.*"), regex("/.*"));
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Message Tracker API")
        .description("Message Tracker In progress").termsOfServiceUrl("http://www.blibli.com")
        .contact("gaurav.yadav@gdn-commerce.com").license("MessageTracker License")
        .licenseUrl("gaurav.yadav@gdn-commerce.com").version("1.0").build();
  }

}
