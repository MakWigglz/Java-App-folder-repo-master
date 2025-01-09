# I.D. in Java
## From Tabnine:
###  In Java, dependency injection (DI) is a design pattern used to achieve Inversion of Control (IoC) between classes and their dependencies. It allows for the creation of loosely coupled components, making the code more modular, testable, and maintainable. Annotations like `@Resource`, `@Inject`, and `@Autowired` are used to declare dependencies in a declarative manner. Here's a detailed explanation of each:

### @Resource

- **Origin**: Part of the Java EE (now Jakarta EE) specification.
- **Purpose**: Used to declare a reference to a resource, such as a data source, EJB, or other managed objects.
- **Behavior**: The container is responsible for injecting the resource at runtime.
- **Usage**: Can be applied to fields or setter methods.
- **Attributes**:
  - `name`: Specifies the JNDI name of the resource.
  - `type`: Specifies the type of the resource.

**Example**:
```java
import javax.annotation.Resource;

public class MyService {
    @Resource(name = "myDataSource")
    private DataSource dataSource;
    
    // ...
}
```

### @Inject

- **Origin**: Part of the Java CDI (Contexts and Dependency Injection) specification.
- **Purpose**: Used to inject dependencies in a more general way, not limited to resources.
- **Behavior**: The container resolves and injects the dependency at runtime.
- **Usage**: Can be applied to constructors, methods, and fields.
- **Attributes**: Does not have attributes like `@Resource`, but can be combined with qualifiers to specify which implementation to inject.

**Example**:
```java
import javax.inject.Inject;

public class MyService {
    @Inject
    private MyRepository myRepository;
    
    // ...
}
```

### @Autowired

- **Origin**: Part of the Spring Framework.
- **Purpose**: Used to inject Spring-managed beans.
- **Behavior**: Spring resolves and injects the dependency at runtime.
- **Usage**: Can be applied to constructors, methods, and fields.
- **Attributes**:
  - `required`: A boolean that indicates whether the dependency is mandatory. Defaults to `true`.

**Example**:
```java
import org.springframework.beans.factory.annotation.Autowired;

public class MyService {
    @Autowired
    private MyRepository myRepository;
    
    // ...
}
```

### Key Differences

- **Scope**: `@Resource` is more focused on Java EE resources, while `@Inject` and `@Autowired` are used for general dependency injection.
- **Framework**: `@Resource` is part of Java EE, `@Inject` is part of Java CDI, and `@Autowired` is specific to the Spring Framework.
- **Attributes**: `@Resource` has attributes for specifying resource details, while `@Inject` and `@Autowired` are more straightforward, with `@Autowired` having a `required` attribute.

These annotations provide a declarative way to manage dependencies, allowing the container or framework to handle the instantiation and lifecycle of the dependent objects, thus promoting loose coupling and enhancing testability.
