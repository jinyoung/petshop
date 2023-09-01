package petshop.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import petshop.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "purchasedProducts",
    path = "purchasedProducts"
)
public interface PurchasedProductRepository
    extends PagingAndSortingRepository<PurchasedProduct, String> {}
