package petshop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import petshop.SocialMediaInteractionApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SocialMediaInteractionApplication.class })
public class CucumberSpingConfiguration {}
