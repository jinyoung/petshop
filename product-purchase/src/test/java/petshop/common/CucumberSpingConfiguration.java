package petshop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import petshop.ProductPurchaseApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductPurchaseApplication.class })
public class CucumberSpingConfiguration {}
