package petshop.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import petshop.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "socialMediaPosts",
    path = "socialMediaPosts"
)
public interface SocialMediaPostRepository
    extends PagingAndSortingRepository<SocialMediaPost, String> {}
