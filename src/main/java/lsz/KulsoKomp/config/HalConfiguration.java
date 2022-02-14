package lsz.KulsoKomp.config;

import lsz.KulsoKomp.components.Hal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HalConfiguration {

    @Bean
    public Hal fish (){
        return new Hal(2);
    }
}
