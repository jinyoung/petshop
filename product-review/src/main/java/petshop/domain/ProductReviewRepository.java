package petshop.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import petshop.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "productReviews",
    path = "productReviews"
)
public interface ProductReviewRepository
    extends PagingAndSortingRepository<ProductReview, String> {}
