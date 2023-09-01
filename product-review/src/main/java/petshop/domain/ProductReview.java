package petshop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.ProductReviewApplication;
import petshop.domain.ProductReviewLeft;

@Entity
@Table(name = "ProductReview_table")
@Data
//<<< DDD / Aggregate Root
public class ProductReview {

    @Id
    private String reviewId;

    private String productId;

    private Rating rating;

    private String comment;

    @PostPersist
    public void onPostPersist() {
        ProductReviewLeft productReviewLeft = new ProductReviewLeft(this);
        productReviewLeft.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProductReviewRepository repository() {
        ProductReviewRepository productReviewRepository = ProductReviewApplication.applicationContext.getBean(
            ProductReviewRepository.class
        );
        return productReviewRepository;
    }
}
//>>> DDD / Aggregate Root
