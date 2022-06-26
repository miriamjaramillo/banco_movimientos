package ec.mjaramillo.movimiento;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("ec.mjaramillo.movimiento.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo())
				;
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"MJaramillo API",
				"Cuenta API - Descripcion",
				"1.0",
				"http://mjaramillo.ec/terminos",
				new Contact("Miriam Jaramillo", "https://mjaramillo.ec", "apis@gmail.ec"),
				"LICENCIA",
				"LICENCIA URL",
				Collections.emptyList()
				);
	}
}
