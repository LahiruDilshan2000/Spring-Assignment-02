package lk.ijse.gdse.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Lahiru Dilshan
 * @created Fri 8:50 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.gdse.spring"})
public class WebAppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
