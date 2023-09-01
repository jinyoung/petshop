package petshop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import petshop.domain.*;
import petshop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SocialMediaPostShared extends AbstractEvent {

    public SocialMediaPostShared(SocialMediaPost aggregate) {
        super(aggregate);
    }

    public SocialMediaPostShared() {
        super();
    }
}
//>>> DDD / Domain Event
