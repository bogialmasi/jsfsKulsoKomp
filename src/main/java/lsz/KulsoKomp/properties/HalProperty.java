package lsz.KulsoKomp.properties;

import com.google.common.reflect.ClassPath;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "hal")
public class HalProperty {
    private @Getter @Setter Integer size;
}
