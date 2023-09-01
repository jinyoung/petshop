package petshop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import petshop.PetDataManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { PetDataManagementApplication.class })
public class CucumberSpingConfiguration {}
