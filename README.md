# Maven and Gradle

This is practise project to refreshing springboot development using both maven and gradle.

## Maven Commands
* Running the app
```cmd
mvn spring-boot:run
```
* Install dependency
```cmd
mvn clean install
```
* Check the dependency tree
```cmd
mvn dependency:tree
```
* Build standlone jar (it will create in folder `target/{artifactId}.jar`)
```cmd
mvn package
```
* Running the standlone app
```cmd
java -jar {path_to_your_jar_file}
```

### Steps for Maven Spring boot Project
1. create a folder, choose a name.
2. create a pom.xml file (ref:file:springboot-ex1-mvn/pom.xml)
3. create a javafile MyApplication.java (ref:file:springboot-ex1-mvn/src/main/java/mymvnapp/MyApplication.java)
4. run mvn spring-boot:run

## Gradle Commands
* Running app
```cmd
gradle bootRun
```
* Check Dependencies
```cmd
gradle dependencies
```
* Clean & Install Dependencies
```cmd
gradle clean build
```
* Build a standlone jar (build/libs/{name_of_root_folder}.jar)
```cmd
gradle bootJar
```
* Run Standlone jar
```cmd
java -jar {path_to_jar_file}
```
