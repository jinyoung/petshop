package petshop.domain;

import petshop.domain.*;
import petshop.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class NewApIed extends AbstractEvent {

    private Long id;

    public NewApIed(Customer aggregate){
        super(aggregate);
    }
    public NewApIed(){
        super();
    }
}
