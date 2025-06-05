# thoughtful
Thoughtful robotic automation factory

## Thoughtful’s robotic automation factory

This project contains a Java function that helps categorize packages in a robotic automation system based on their size and weight.

## Objective

The goal is to sort packages into one of the following categories:

- STANDARD: The package is not bulky and not heavy.
- SPECIAL: The package is either bulky or heavy.
- REJECTED: The package is both bulky and heavy.

## Classification Criteria

A package is considered bulky if:

- Its volume (width × height × length) is greater than or equal to 1,000,000 cm³, or
- Any of its dimensions is greater than or equal to 150 cm

A package is considered heavy if:

- Its mass is 20 kg or more

## Sorting Rules

- If the package is both bulky and heavy, it is REJECTED.
- If the package is either bulky or heavy (but not both), it is SPECIAL.
- If the package is neither bulky nor heavy, it is STANDARD.

## Files

- PackageSorter.java: Contains the main function and logic.
- README.md: This documentation file.

## How to Run

1. Compile the Java file using:

   javac PackageSorter.java

2. Run the program using:

   java PackageSorter
