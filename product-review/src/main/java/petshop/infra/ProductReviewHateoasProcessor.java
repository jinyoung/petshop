package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class ProductReviewHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProductReview>> {

    @Override
    public EntityModel<ProductReview> process(
        EntityModel<ProductReview> model
    ) {
        return model;
    }
}
