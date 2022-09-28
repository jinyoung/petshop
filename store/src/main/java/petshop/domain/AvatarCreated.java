package petshop.domain;

import petshop.domain.*;
import petshop.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AvatarCreated extends AbstractEvent {

    private Long id;

    public AvatarCreated(Customer aggregate){
        super(aggregate);
    }
    public AvatarCreated(){
        super();
    }
}
