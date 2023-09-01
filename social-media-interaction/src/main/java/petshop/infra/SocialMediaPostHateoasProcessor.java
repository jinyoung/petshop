package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class SocialMediaPostHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SocialMediaPost>> {

    @Override
    public EntityModel<SocialMediaPost> process(
        EntityModel<SocialMediaPost> model
    ) {
        return model;
    }
}
