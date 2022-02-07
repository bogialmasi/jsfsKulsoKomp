package lsz.KulsoKomp.components;

import org.springframework.beans.factory.annotation.Autowired;

public class Lake {
    private Fish fish;
    private Fisher fisher;

    /* Fish */
    @Autowired
    public void setFish(Fish fish) {
        this.fish = fish;
    }

    @Autowired
    public Fish getFish() {
        return fish;
    }

    /* Fisher */
    @Autowired
    public void setFisher(Fisher fisher) {
        this.fisher = fisher;
    }

    @Autowired
    public Fisher getFisher() {
        return fisher;
    }
}
