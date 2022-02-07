package lsz.KulsoKomp.config;

import lsz.KulsoKomp.components.Lake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LakeConfiguration {
    public LakeConfiguration() {
        System.out.println("LakeConfiguration created");
    }

    @Bean
    public Lake lake() {
        return new Lake();
    }
}
