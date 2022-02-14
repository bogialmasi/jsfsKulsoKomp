package lsz.KulsoKomp.properties;

import com.google.common.reflect.ClassPath;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "fish")
public class HalProperty {
    private @Getter @Setter Integer size;
}
