package petshop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.ProductRecommendationApplication;

@Entity
@Table(name = "RecommendedProduct_table")
@Data
//<<< DDD / Aggregate Root
public class RecommendedProduct {

    @Id
    private String productType;

    private String size;

    private int age;

    private String gender;

    private String preferences;

    public static RecommendedProductRepository repository() {
        RecommendedProductRepository recommendedProductRepository = ProductRecommendationApplication.applicationContext.getBean(
            RecommendedProductRepository.class
        );
        return recommendedProductRepository;
    }
}
//>>> DDD / Aggregate Root
