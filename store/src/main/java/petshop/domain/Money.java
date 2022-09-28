package petshop.domain;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Money {

    
    
    
    private Double amount;
    
    
    
    private String currency;



}

