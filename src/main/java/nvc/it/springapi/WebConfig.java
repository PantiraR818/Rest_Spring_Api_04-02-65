package nvc.it.springapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// เพิ่ม2ตัวนี้
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
    
    @Override
    public void addCorsMappings(CorsRegistry registry){
    registry.addMapping("/**")
    .allowedMethods("*");
    // * หมายถึง อนุญาตทุกอย่าง get post put patch
    }
}
