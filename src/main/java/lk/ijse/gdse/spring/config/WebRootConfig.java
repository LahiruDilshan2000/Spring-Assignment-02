package lk.ijse.gdse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Lahiru Dilshan
 * @created Fri 8:50 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@Configuration
@EnableWebMvc
@Import({HibernateConfig.class})
public class WebRootConfig {
}
