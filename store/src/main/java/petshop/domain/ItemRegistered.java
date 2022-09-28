package petshop.domain;

import petshop.domain.*;
import petshop.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ItemRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long order;
    private Double price;
    private String petId;

    public ItemRegistered(Item aggregate){
        super(aggregate);
    }
    public ItemRegistered(){
        super();
    }
}
