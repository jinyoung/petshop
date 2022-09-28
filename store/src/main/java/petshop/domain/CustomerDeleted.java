package petshop.domain;

import petshop.domain.*;
import petshop.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CustomerDeleted extends AbstractEvent {

    private Long id;

    public CustomerDeleted(Customer aggregate){
        super(aggregate);
    }
    public CustomerDeleted(){
        super();
    }
}
