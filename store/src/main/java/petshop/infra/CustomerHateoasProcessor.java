package petshop.infra;
import petshop.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class CustomerHateoasProcessor implements RepresentationModelProcessor<EntityModel<Customer>>  {

    @Override
    public EntityModel<Customer> process(EntityModel<Customer> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/createAccount4").withRel("createAccount4"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/deleteAccount").withRel("deleteAccount"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/createAvatar").withRel("createAvatar"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/newAPI").withRel("newAPI"));

        
        return model;
    }
    
}
