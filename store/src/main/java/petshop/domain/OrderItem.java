package petshop.domain;

import petshop.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="OrderItem_table")
@Data

public class OrderItem  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    @OneToMany
    
    private List<Item> items;
    
    
    
    
    
    private Long customer;

    @PrePersist
    public void onPrePersist(){
    }

    public static OrderItemRepository repository(){
        OrderItemRepository orderItemRepository = StoreApplication.applicationContext.getBean(OrderItemRepository.class);
        return orderItemRepository;
    }






}
