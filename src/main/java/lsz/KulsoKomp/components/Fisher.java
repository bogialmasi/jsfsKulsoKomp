package lsz.KulsoKomp.components;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Fisher {
    private EventBus eventBus;

    @Autowired
    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @PostConstruct
    public void postConstruct(){
        this.eventBus.register(this);
        /* azt regisztráljuk, amit az eventBus egyik eseménye érdekel */
        /* .post = esemény elküldése */
    }
    /* --- így is jó
    @Autowired
    EventBus eventBus;

    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }
    */
}
