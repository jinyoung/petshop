package petshop.domain.usecase;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petshop.domain.*;

@Service
public class PetPolicy {

    @Autowired
    PetRepository petRepository;
}
