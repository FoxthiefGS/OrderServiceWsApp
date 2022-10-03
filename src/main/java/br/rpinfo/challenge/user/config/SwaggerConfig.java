package br.rpinfo.challenge.user.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;

//Classe configurando o swagger, permitindo aplicar requisiçõs à API com uma interface gráfica mais intuitiva
//Abaixo link para acessar o swagger
//http://localhost:8080/swagger-ui/index.html
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.rpinfo.challenge.user"))
				.paths(PathSelectors.regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
					"API REST Ordens de serviços",
					"API no formato REST para gerenciamento de ordens de serviço.",
					"1.0",
					"Terms of Service",
					new Contact("Juliano Marques", "https://github.com/FoxthiefGS", "julianomrgs@gmail.com"),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
				);
		
		return apiInfo;
	}
	
}
