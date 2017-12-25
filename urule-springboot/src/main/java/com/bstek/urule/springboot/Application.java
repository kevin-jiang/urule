package com.bstek.urule.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Jacky.gao
 * @since 2016年10月12日
 */
//@SpringBootApplication
@SpringBootApplication(scanBasePackages={"com.einwin.*","com.hypersmart.*","com.bstek.*"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = { "com.einwin.*","com.hypersmart.*","com.bstek.*" } )
@EnableCircuitBreaker
@ImportResource({"classpath:urule-console-context.xml"})
public class Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}

//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
////                registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
//
//                registry.addMapping("/**")
//                        .allowedOrigins("http://rule.einwin.com:8080")
//                        .allowCredentials(false)
//                        .allowedMethods("POST", "GET", "DELETE", "PUT", "OPTIONS");
//
//            }
//        };
//    }
}
