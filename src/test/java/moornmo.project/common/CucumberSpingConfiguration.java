package moornmo.project.common;

import io.cucumber.spring.CucumberContextConfiguration;
import moornmo.project.SalesApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SalesApplication.class })
public class CucumberSpingConfiguration {}
