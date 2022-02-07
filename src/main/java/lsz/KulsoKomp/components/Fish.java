package lsz.KulsoKomp.components;

import com.google.common.eventbus.EventBus;
import lsz.KulsoKomp.events.CatchFishEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fish {
    EventBus eventBus;

    @Autowired
    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void catchFish(){
        this.eventBus.post(new CatchFishEvent());
    }
}
