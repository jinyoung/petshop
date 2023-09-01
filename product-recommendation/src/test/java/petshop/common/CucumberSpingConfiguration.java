package petshop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import petshop.ProductRecommendationApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductRecommendationApplication.class })
public class CucumberSpingConfiguration {}
