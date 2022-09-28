package petshop.domain;

import petshop.domain.*;
import petshop.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PetRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private Object appearance;
    private Object energyI;
    private String address;
}


