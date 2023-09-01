package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class PurchasedProductHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PurchasedProduct>> {

    @Override
    public EntityModel<PurchasedProduct> process(
        EntityModel<PurchasedProduct> model
    ) {
        return model;
    }
}
