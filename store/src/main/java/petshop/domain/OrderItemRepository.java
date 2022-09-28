package petshop.domain;

import petshop.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="orderItems", path="orderItems")
public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long>{

}
