# Roman to decimal converter


## Build requirements:

* maven

## How to build

```
mvn clean install
```
This will compile code, run tests, create jar file, generate maven artifact and install it to local maven repository.

Optionally, you can generate javadoc.

```
mvn javadoc:javadoc
```

## How to run
```
java -jar target/roman-to-decimal-1.jar MMXVIII
```

## How to use

```
import com.documill.assignment.RomanToDecimal;

public class Main {
    public static final void main(String[] args) {
        int twoThousandEighteen = RomanToDecimal.convert("MMXVIII");
        // twoThousandEighteen now equals to 2018
    }
}
```

## What is inside
Soruce code can be found in `src/main/java`.
Tests are in `src/test/java`.
