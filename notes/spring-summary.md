# Spring

## Example Application

Everything you are required to know about Spring is included in this simple well commented example on Github.
- [Simple Sakila Example Application](https://github.com/erics273/SpringBootSakila/tree/main/src/main/java/com/pluralsight)
- [Sakila Example Application with Configuration and Database (JDBC)](https://github.com/erics273/SpringBootSakila/tree/main/src/main/java/com/pluralsight)


## Important Concepts

- Important Concepts with links to specific examples

- Creates/instantiates objects from your classes for you
- There is a `run` method you call to start a spring application/make an application a Spring application
  - [Example](https://github.com/erics273/SpringBootSakila/blob/main/src/main/java/com/pluralsight/MainProgram.java#L22)
- When you call the `run` (start) method it scans that application for classes to create/instantiate
  - [Example](https://github.com/erics273/SpringBootSakila/blob/main/src/main/java/com/pluralsight/dao/SimpleFilmDao.java#L12)
- It finds which classes to create because you marked them with the @Component annotation
- There are other more specific @Component annotations including: `@Service`, `@Repository`, `@Controller`, `@Configuration`
- We will just use these annotations to identify a class Spring needs to create for us:
  - `@Component` (general purpose most commonly used)
    - [Example](https://github.com/erics273/SpringBootSakila/blob/main/src/main/java/com/pluralsight/dao/SimpleFilmDao.java#L12)
  - `@Controller` (for web applications, used to respond to requests and generate the user interface (view))
  - `@Configuration` (for classes that read configuration files)
    -
  - Reading configuration (properties) files works as follows
    - there is a class that reads the configuration file `application.properties` which is marked with the `@Configuration` annotation at the class level
      - [Example](https://github.com/erics273/SpringBootSakila/blob/withDB/src/main/java/com/pluralsight/config/DatabaseConfig.java#L13)
    - there is a method marked with the @Bean annotation
      - the method returns an object that Spring created for you from a class
      - [Example](https://github.com/erics273/SpringBootSakila/blob/withDB/src/main/java/com/pluralsight/config/DatabaseConfig.java#L21)
      - Spring create the object by calling the method instead of calling new ClassName()
        - this provides the opportunity to read in configuration values into the object and use them and THEN return the object with those values
        - so it allows us to customize or configure the object Spring creates with different configuration values
    - Configuration values are injected into the Configuration classes constructor and mapped to parameters using `@Value`
    - [Example](https://github.com/erics273/SpringBootSakila/blob/withDB/src/main/java/com/pluralsight/config/DatabaseConfig.java#L28)
- The classes Spring creates for you are made available where you need them in the application by "injecting" them
- There are 3 ways to inject objects using the `@Autowired` annotation
  - constructor
  - setter method
  - property
    - [Example](https://github.com/erics273/SpringBootSakila/blob/main/src/main/java/com/pluralsight/FilmApp.java#L22)
- Spring has support for console applications or command-line applications
  - If a class implements the `CommandLineRunner` interface which requires the class to have one `run` method that takes an `args` parameter to receive command-line arguments...a Spring application will automatically call the `run` method on the class that is a `CommandLineRunner`
  - [Example](https://github.com/erics273/SpringBootSakila/blob/main/src/main/java/com/pluralsight/FilmApp.java#L17)
