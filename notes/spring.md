# Spring

## Spring Beans

Classes that get automatically created as an object instance for you.

- UI (User Interface)= @Controller
- BLL (Business Logic Layer)= @Service
- DAL (Data Access Layer DAOs)= @Repository

## Java Bean

- Model/Entity/Domain class
- Requirements
  - private fields and getters and setters
  - "parameterless" constructor

## What is Spring Boot

- [What is Spring Boot conversation](https://chatgpt.com/share/684c6114-42f0-8000-9ac8-c4c47079f04f)

## Simple Examples

### Example 1

## ✅ Step 1: Manual Dependency Injection (No Spring)

### `UserDao.java` — the DAO (Data Access Object)

```java
public class UserDao {
    public String findUserNameById(int id) {
        // Simulate a database lookup
        return "User" + id;
    }
}
```

### `UserController.java` — the Controller

```java
public class UserController {
    private UserDao userDao;

    // Constructor injection
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    public void showUser(int id) {
        String name = userDao.findUserNameById(id);
        System.out.println("User name is: " + name);
    }
}
```

### `Main.java` — Wiring it manually

```java
public class Main {
    public static void main(String[] args) {
        // Manual dependency injection
        UserDao dao = new UserDao();
        UserController controller = new UserController(dao);

        controller.showUser(1);
    }
}
```

---

## ✅ Step 2: Automatic Dependency Injection (Spring Framework)

Now we'll use Spring to do the wiring for us.

---

### `UserDao.java`

```java
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String findUserNameById(int id) {
        return "User" + id;
    }
}
```

### `UserController.java`

```java
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserDao userDao;

    // Constructor injection
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    public void showUser(int id) {
        String name = userDao.findUserNameById(id);
        System.out.println("User name is: " + name);
    }
}
```

### `Main.java`

```java
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan  // Tells Spring to scan for @Component, @Controller, @Repository, etc.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        UserController controller = context.getBean(UserController.class);
        controller.showUser(1);
    }
}
```

---

### 🧠 Teaching Notes

| Concept               | Beginner-Friendly Explanation                                           |
| --------------------- | ----------------------------------------------------------------------- |
| `@Repository`         | “Marks a class that talks to a database.”                               |
| `@Controller`         | “Marks a class that handles user input or coordinates things.”          |
| Constructor Injection | “We give the controller what it needs instead of making it go find it.” |
| Manual vs Auto        | “We did the wiring ourselves… now Spring does it for us.”               |

### Example 2

- [Spring Boot Sakila](https://github.com/erics273/SpringBootSakila)
- [Spring Boot Sakila with DB](https://github.com/erics273/SpringBootSakila/tree/withDB)

## JavaBean vs Spring Bean

Summary: JavaBean vs Spring Bean

| Feature         | JavaBean                  | Spring Bean                                      |
| --------------- | ------------------------- | ------------------------------------------------ |
| Use case        | Data holder (model/DTO)   | Any Spring-managed object                        |
| Requires fields | ✅ Yes                    | ❌ No — can have 0 fields                        |
| Getters/setters | ✅ Required               | ❌ Not required                                  |
| Constructor     | ✅ Public no-arg required | ❌ Not required (Spring can use any constructor) |
| Created by      | You                       | Spring Framework                                 |

---

🔁 How They Overlap
| Feature | JavaBean | Spring Bean |
| --------------------------- | --------------------------- | --------------------------------------------- |
| Requires no-arg constructor | ✅ Yes | ❌ Not necessarily |
| Requires getters/setters | ✅ Yes | ❌ Only if needed |
| Managed by Spring? | ❌ No | ✅ Yes |
| Purpose | Represent data / properties | Perform business logic / services |
| Example | `Customer`, `Product` | `CustomerService`, `EmailSender`, `AppConfig` |

## Resources/Articles

- [IOC vs DI](https://howtodoinjava.com/spring-core/spring-ioc-vs-di/)
