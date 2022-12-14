//package com.candi.infomation.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import io.micrometer.common.util.StringUtils;
//
//@Component
//public class SwaggerUiWebConfigurer implements WebMvcConfigurer {
//	  private final String baseUrl = "";
//
//	    public void SwaggerUiWebMvcConfigurer(
//	        @Value("${springfox.documentation.swagger-ui.base-url:}") String baseUrl) {
//	        this.baseUrl = baseUrl;
//	    }
//
//	    @Override
//	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	        String baseUrl = StringUtils.trimTrailingCharacter(this.baseUrl, '/');
//	        registry.
//	            addResourceHandler(baseUrl + "/swagger-ui/**")
//	            .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/")
//	            .resourceChain(false);
//	    }
//
//	    @Override
//	    public void addViewControllers(ViewControllerRegistry registry) {
//	        registry.addViewController(baseUrl + "/swagger-ui/")
//	            .setViewName("forward:" + baseUrl + "/swagger-ui/index.html");
//	    }
//
//}
