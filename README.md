# Enterprise Application Development - Coding Best Practices and Principles

## Introduction

This repository focuses on coding best practices and principles for enterprise application development in the IN3100 course. It covers essential topics such as SOLID principles, DRY, error handling, performance, optimization, and security.

## Why Consider Coding Best Practices?

In the world of software development, writing code is just the beginning. Code needs to be maintainable, understandable, and adaptable over time. Best practices guide us in creating harmonious and efficient software.

### Benefits of Best Practices:

- Improved Code Quality: Fewer bugs, easier debugging, and enhanced software reliability.
- Efficient Collaboration: Easier teamwork and smoother handovers.
- Future-Proofing: Code that can evolve with changing requirements.

## Code Examples: Factorial Calculator

### Original Code:

```java
public class FactorialCalculator {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
```

### Improved Code:

```java
public class FactorialCalculator {
    public static int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int factorialResult = 1;
        for (int i = 1; i <= number; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
```

## Meaningful Variable and Function Names

### Importance of Clear Naming:

Descriptive names make code self-documenting. Names should reflect the purpose and role of variables and functions.

### Guidelines:

- Use Descriptive Names.
- Use Nouns for Variables, Verbs for Functions.
- Be Consistent in Naming Conventions.
- Choose Explicit Names.
- Use CamelCase for Compound Names.
- Avoid Sacrificing Clarity for Shortness.

## Code Comments and Documentation

### The Role of Comments:

Comments provide additional context and explanations for code, facilitating collaboration and understanding.

### Guidelines:

- Commenting What, Not How.
- Comments for Edge Cases.
- Avoid Over-Commenting.
- Function and Class Documentation.
- Inline Documentation.
- Version History.

Example:

```java
/**
 * Calculates the area of a rectangle.
 *
 * @param length The length of the rectangle.
 * @param width The width of the rectangle.
 * @return The area of the rectangle.
 */
public double calculateArea(double length, double width) {
    return length * width;
}
```

## SOLID Principles

### Single Responsibility Principle (SRP)

A class should have only one reason to change, focusing on one primary responsibility or job.

Example:

```java
class Customer {
    // ...
    public void saveToDatabase() {
        // Code to save customer data to the database
    }

    public void sendEmailNotification() {
        // Code to send email notification to the customer
    }
}
```

### Open/Closed Principle (OCP)

Software entities should be open for extension but closed for modification.

Example:

```java
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        // Code to draw a rectangle
    }

    // Additional shapes can be added without modifying existing code
}
```

### Liskov Substitution Principle (LSP)

Objects of a superclass should be replaceable with objects of a subclass without affecting program correctness.

Example:

```java
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    // ...
}

class Square implements Shape {
    // ...
}
```

### Interface Segregation Principle (ISP)

Clients should not be forced to depend on interfaces they do not use, encouraging smaller, more focused interfaces.

Example:

```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine {
    void fax();
}

class Photocopier implements Printer, Scanner, FaxMachine {
    // ...
}
```

### Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules; both should depend on abstractions.

Example:

```java
interface Notifier {
    void send(String message);
}

class EmailSender implements Notifier {
    // ...
}

class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    void sendNotification(String message) {
        notifier.send(message);
    }
}
```

## Conclusion

This repository aims to provide practical insights and examples for coding best practices and SOLID principles, fostering the development of maintainable and efficient enterprise applications.
