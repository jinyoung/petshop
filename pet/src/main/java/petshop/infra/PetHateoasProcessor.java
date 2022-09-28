package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class PetHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Pet>> {

    @Override
    public EntityModel<Pet> process(EntityModel<Pet> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/feed")
                .withRel("feed")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/unregister")
                .withRel("unregister")
        );

        return model;
    }
}
