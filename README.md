gradle-cucumber-plugin
======================

cucumber-jvm gradle plugin

## Add your project

Grab the cucumber.gradle file, put it in your gradle directory for example.

### build.gradle

  ```
  apply from: project.file('gradle/cucumber.gradle')
  cucumber {
    gluePackages = ['com.damick'] // where the step definitions and hooks live
  }
  ```
  [For more info see the docs](http://cukes.info/install-cucumber-jvm.html)

### Features

These are the conventions we tend to use:

  - Create Feature file (using [Gherkin](http://cukes.info/gherkin.html))
    test/resources/<glue package>/<some>.feature
    
  - Create Runner 
    test/<glue package>/SomeFeature.java 

  - Create Test with assertions, etc.
     test/<glue package>/SomeTest.java 
  
  [More info on cucumber steps](http://cukes.info/step-definitions.html)
  

## Running

  Task: cucumber

  To run the sample:
  ```
  cd sample
  ./gradlew cucumber
  ```

