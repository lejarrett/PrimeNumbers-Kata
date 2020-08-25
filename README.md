# Updox Prime Number Generator

Overview:
Your task is to use test driven development to implement a prime number generator that returns an ordered list of all prime numbers in a given range (inclusive of the endpoints). You must implement the interface specified below. You may also create any other methods, interfaces and/or classes that you deem necessary to complete the project. You should also develop a small main program to drive your generator and to allow the user to specify the prime number range via the command line. To successfully complete the exercise, all unit tests must pass as well as provide 100% code coverage.
Notes:

• The code should handle inverse ranges such that 1-10 and 10-1 are equivalent.

• Ensure that you run a test against the range 7900 and 7920 (valid primes are 7901,
7907, 7919).

# General

This solution has been coded in Java. 

There are 3 Classes and 1 Interface in this program.

• PrimeNumbersApp

• Menu

• ReportGenerator

• (i) PrimeNumbersGenerator

There is a main program called "PrimeNumbersApp" that takes input either from the command line, or prompts the user for 2 numbers if no args were passed.

(This is something I went back and forth on, but had a little fun and wanted to have the option to have both options available, some choices in the menu tests reflect the coding, so that the methods in the Menu class could be tested)

ReportGenerator implements the PrimeNumbersGenerator interface included in the instructions.

Menu is very simple and has 2 methods, to prompt for user input, and display messages to the console (instead of many 'System.out.println's everywhere.) 
The 'getNumsFromUser' method could easily be deleted and isn't crucial, but again, thought it would be fun to cover both aspects of command line and user input for the program.



# Assumptions Made
• No data will be persist to disk, so output is only to the console. 

• The program should be able to take 2 numbers in any order, e.g 1-100, and 100-1, and return the list appropriately, including endpoints.


# Testing

There is 100% testing coverage, not including the main, or run method, since they are void and would be impractical to test, the methods they use are fully tested. 

I tested for things like invalid inputs, nulls, blanks, and empty values, more than 2 args, etc.

Also tested for Prime numbers, and tested range from 7900 and 7920 per instructions.

# Outputs

In IntelliJ using 'Run Configuration' and supplying command line arguments from 1-100, I recieved the following ouput:
```
Found 25 prime numbers between 1 & 100:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
```

With no command line arguments, I was prompted and input custom numbers and recieved the following output:

```
Enter first number: 
13
Enter second number: 
94
Found 19 prime numbers between 13 & 94:
[13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89]
```

