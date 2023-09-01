package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class RecommendedProductHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RecommendedProduct>> {

    @Override
    public EntityModel<RecommendedProduct> process(
        EntityModel<RecommendedProduct> model
    ) {
        return model;
    }
}
