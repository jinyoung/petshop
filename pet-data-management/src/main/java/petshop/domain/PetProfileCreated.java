package petshop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import petshop.domain.*;
import petshop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetProfileCreated extends AbstractEvent {

    public PetProfileCreated(PetProfile aggregate) {
        super(aggregate);
    }

    public PetProfileCreated() {
        super();
    }
}
//>>> DDD / Domain Event
