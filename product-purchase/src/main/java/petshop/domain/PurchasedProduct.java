package petshop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.ProductPurchaseApplication;

@Entity
@Table(name = "PurchasedProduct_table")
@Data
//<<< DDD / Aggregate Root
public class PurchasedProduct {

    @Id
    private String productId;

    private String productName;

    private Money price;

    public static PurchasedProductRepository repository() {
        PurchasedProductRepository purchasedProductRepository = ProductPurchaseApplication.applicationContext.getBean(
            PurchasedProductRepository.class
        );
        return purchasedProductRepository;
    }
}
//>>> DDD / Aggregate Root
