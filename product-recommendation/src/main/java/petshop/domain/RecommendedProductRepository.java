package petshop.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import petshop.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "recommendedProducts",
    path = "recommendedProducts"
)
public interface RecommendedProductRepository
    extends PagingAndSortingRepository<RecommendedProduct, String> {}
