# TacoLoco
------README-----
This application is built with Spring Boot and uses a standard Spring controller to consume and transmit data in a JSON format. 
Unit tests are written with JUnit.

In addition to Spring architecture, the application uses Twitter Bootstrap and JQuery on the client side, which are packaged and 
deployed to the client using webjars.

Currently, the web app is using JQuery ajax calls on the client side to read data from a taco order form, and then transmit and receive
the form data as JSON from the Spring controller on the server side.

------BUILD AND DEPLOY ------
This application runs on Spring Boot, so there are multiple potential ways to build and deploy it to a production environment. 
Depending on the deployment option selected, an executable JAR file or a WAR may be more appropriate. In addition to packaging, 
there may also be some required configuration updates that can be easily done following the documentation provided by the 
web deployment provider.
