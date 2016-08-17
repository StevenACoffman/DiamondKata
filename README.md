# LCDKata
Output of the Ithaka Randori style Kata

# Getting Started

These exercises lean on Test-Driven Development (TDD), but they're not an exact match.

The following steps assume that you are in the base directory of the exercise.

You must have `gradle` installed.

## Step 1

Run the test suite. It's written using the JUnit framework, and can be run with gradle:

```sh
$ gradle test
```

This will fail, complaining that there is no method called `hello` for the `Hiker` class.

To fix the error, open `src/main/java/Hiker.java` and add a `hello` method that returns a `String`.
The method can return an empty string `""` for now:

```java
public class Hiker {
    public static String hello() {
        return "";
    }
}
```

## Step 2

Write a new Test that fails.

## Wash, Rinse, Repeat

Run the tests again.

If it fails you're going to need to read the error message carefully to figure out what went wrong, fix the problem
in the main code, and then try again until all the tests pass.

```
$ gradle test
:compileJava
:processResources UP-TO-DATE
:classes
:compileTestJava
:processTestResources UP-TO-DATE
:testClasses
:test

BUILD SUCCESSFUL
```
