package petshop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import petshop.ProductReviewApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductReviewApplication.class })
public class CucumberSpingConfiguration {}
