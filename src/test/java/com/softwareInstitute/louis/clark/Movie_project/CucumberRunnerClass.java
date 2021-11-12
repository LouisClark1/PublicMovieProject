package com.softwareInstitute.louis.clark.Movie_project;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/resources",
        glue = "com.softwareInstitute.louis.clark.Movie_project" )
public class CucumberRunnerClass {


}





//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
////import io.cucumber.testng.CucumberOptions;
//import org.junit.runner.RunWith;
//    @RunWith(Cucumber.class)
//    @CucumberOptions(plugin = {"pretty"},
//            features = "src/test/resources/cucumber",
//            glue = "src/main/java/com/softwareInstitute/louis/clark/Movie_project/MovieProjectApplication.java" )
//    public class RunCucumberTest {
//
//
//    }




