# FizzBuzz Project

This project demonstrates two implementations of the **FizzBuzz** problem in Scala:

- **A pure Functional Programming (FP) implementation**
- **A hybrid implementation combining Object-Oriented Programming (OOP) and Functional Programming (FP) concepts**

## **FizzBuzz Problem Statement**

The FizzBuzz problem involves generating a sequence of numbers from `1` to `N`, where:

- If a number is **divisible by 3**, it is replaced by `"Fizz"`.
- If a number is **divisible by 5**, it is replaced by `"Buzz"`.
- If a number is **divisible by both 3 and 5**, it is replaced by `"FizzBuzz"`.
- Otherwise, the number is returned as is.

## **Implementation Details**

### **1. OOP + FP Implementation (`AppFizzBuzz.scala`)**
This approach combines **Object-Oriented Programming (OOP)** concepts (e.g., encapsulation, methods) with **Functional Programming (FP)** principles (e.g., immutability, higher-order functions).

- Uses methods like `isFizz`, `isBuzz`, and `isFizzBuzz` to determine the FizzBuzz result for a given number.

### **2. Pure FP Implementation (`AppFizzBuzzFP.scala`)**
This approach follows a purely **functional** paradigm, using:

- **Pure functions** and **immutability**
- **Pattern matching** for decision-making
- **Functional composition** to transform data effectively

Both implementations illustrate different paradigms while solving the same problem. 
