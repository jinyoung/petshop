package petshop.domain.usecase;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petshop.PetApplication;
import petshop.domain.*;

@Service
public class PetCommand {

    @Autowired
    PetRepository petRepository;

    public void feed() {}

    public void unregister() {
        UnRegistered unRegistered = new UnRegistered();
        /*
        Input Event Content
        */
        unRegistered.publishAfterCommit();
    }
}
