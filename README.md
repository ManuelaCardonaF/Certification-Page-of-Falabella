Test automation
Author:Manuela Cardona Franco 

			Description and context:

The page to be worked on is the Falabella online store (web: https://www.falabella.com.co/falabella-co), tests are presented to validate that a predefined product can be selected and added to the shopping bag satisfactorily.

General automation details:

-Gherkin
Gherkin is used as a development language that allows us to have an understandable language for the technical part and the administrative part of the business, with which we are going to define the behavior of the page that is going to be automated.

-Cucumber:
Cucumber is used as a tool to automate tests in BDD and interpret the pickle language into a technical language that can be interpreted by the machine.

-Serenity:
It is used as a test executor and helps us generate the reports of the tests that are carried out.

Project structure:
  
-Exceptions: Classes in which the different errors that can arise in the tasks are dealt with.
-Interactions: Classes that represent small interactions that the actor performs with the application.
-Models: In this package we handle all the object models that represent an abstraction of a real or virtual entity that we use in the application.
-Questions: Classes with which the validations of the tests are carried out.
-Tasks: Classes that represent high-level actions that group a set of interactions to be performed by the actor.
-User Interfaces: classes where the elements of the page are mapped.
-Utils: Classes that help us with the execution of the test and where we have the low-level code.
-Runners: Classes with which we indicate the properties that will have the test.
-Step Definitions: Classes in which we configure the steps to perform during the test. 
-Features: Here are the files in which the test scenarios in Gherkin language are defined. 
-chromedriver.exe
    
Requirements:

To run the project you need Java JDK 1.8 and Gradle.

the following dependencies must be installed in the build.gradle file:

   implementation('net.serenity-bdd:serenity-screenplay:2.0.15')
    implementation('net.serenity-bdd:serenity-cucumber:1.9.20')
    implementation('net.serenity-bdd:serenity-junit:2.0.15')
    implementation('net.serenity-bdd:serenity-core:2.0.15')
    test implementation('junit:junit:4.12')


March:

To run and generate the test report we use the command:

    clean test aggregate
   
The test execution report is stored in the `/target/site/serenity/` folder