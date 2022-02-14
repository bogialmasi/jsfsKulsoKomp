package lsz.KulsoKomp.config;

import lsz.KulsoKomp.components.Hal;
import lsz.KulsoKomp.properties.HalProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({HalProperty.class}) /* endegélyezi/feldolgozza a HalProperty-t, amit fel kell venni adattagként */
public class HalConfiguration {

    public final HalProperty halProperty;

    public HalConfiguration(HalProperty halProperty) {
        this.halProperty = halProperty;
        System.out.println(halProperty.getSize());
    }

    @Bean
    public Hal hal (){
        return new Hal(2);
    }
}
