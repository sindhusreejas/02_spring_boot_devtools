# 02_spring_boot_devtools
Spring_Learnings

To Package the project from CLI:
Go to the present working directory and use the command:
./mvnw package
After Build is Successful, Jar files reside in the Target subdirectory.
ls *.jar
java -jar nameofjar

To run the project using the spring boot maven plugin:
./mvnw spring-boot: run

#Injecting Values in application.properties:
Define custom values using the "application.properties" file and inject value using the "@Value" annotation.
