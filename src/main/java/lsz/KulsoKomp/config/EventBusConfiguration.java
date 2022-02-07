package lsz.KulsoKomp.config;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventBusConfiguration {
    public EventBusConfiguration() {
        System.out.println("EventbusConfiguration created");
    }

    /* visszaad egy új EventBus-t*/
    @Bean
    public EventBus eventBus() {
        return new EventBus();
    }
}
