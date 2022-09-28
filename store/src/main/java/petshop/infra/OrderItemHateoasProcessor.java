package petshop.infra;
import petshop.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderItemHateoasProcessor implements RepresentationModelProcessor<EntityModel<OrderItem>>  {

    @Override
    public EntityModel<OrderItem> process(EntityModel<OrderItem> model) {

        
        return model;
    }
    
}
