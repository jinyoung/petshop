package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class PetProfileHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PetProfile>> {

    @Override
    public EntityModel<PetProfile> process(EntityModel<PetProfile> model) {
        return model;
    }
}
