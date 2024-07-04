# Paper-Rock-Scissors Game

## Overview:

This project implements a simple console-based Paper-Rock-Scissors game in Java, using Maven as the build automation tool. It allows users to play against a computer opponent and determines the winner based on standard game rules.

## Features

1. Play the game via console input.
2. Randomly generate the computer's gesture.
3. Determine the game's outcome and display a message.
4. Handle invalid user inputs gracefully.
5. Unit testing with JUnit

## Prerequisites:

Before running the game, ensure you have the following installed:

1. **Java Development Kit (JDK) 8 or higher**
2. **Apache Maven 3.6.0 or higher** 

## Project Structure:

The project is organized into packages and classes as follows:
```
paper-rock-scissor
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── gaming
│   │   │       ├── config					
│   │   │       │   ├── Gesture.java			# Enum for game gestures
│   │   │       │   └── Outcome.java			# Enum for game outcomes
│   │   │       ├── Game.java				# Interface
│   │   │       ├── PaperRockScissor.java		# Main game logic implementation
│   │   │       └── PlayGame.java			# Main entry point to start the game
│   │   └── resources
│   └── test
│       ├── java
│       │   └── gaming
│       │       └── PaperRockScissorTest.java 	        # Run test cases
│       └── resources
└── pom.xml                                 	        # Maven project configuration
└── README.md 						# Project documentation
```
## Files Description:

* `Game.java`: Interface defining the game methods.
* `PaperRockScissor.java`: Implements the Game interface. Contains the logic for the game and determining outcomes.
* `PlayGame.java`: The main class to run the game from the console. Prompts the user for input and displays the result.
* `Gesture.java`: Enum representing the game gestures (Paper, Rock, Scissors).
* `Outcome.java`: Enum representing the possible game outcomes (Win, Lose, Tie, Play Again).
* `PaperRockScissorTest.java`: Unit tests for the game to verify different outcomes.
* `pom.xml`: Maven configuration file, specifying project details and dependencies.

## Maven Setup:

## Project Dependencies

The 'pom.xml' file specifies the dependencies for the project. It includes:

* JUnit for testing
* Maven Surefire Plugin for running tests.

## How to Build and run the test ?

1. Build the project

Use the below command to compile the code and package the application into a JAR file located in the target directory:

`mvn clean package`

2. Run the Game

Execute the JAR file to start the game:

`java -cp target/paper-rock-scissor.jar gaming.PlayGame`
	
3. You will be prompted to enter your gesture. The available gestures are:

- fist (Rock)
- openhand (Paper)
- twofingers (Scissors)

Enter one of these values and press Enter to play against the computer.

Example:

```
Show your gesture:(fist, openhand, twofingers):
fist
Computer gesture: openhand (PAPER)
You've lost!
Show your gesture:(fist, openhand, twofingers):
openhand
Computer gesture: openhand (PAPER)
It's a tie!
```

4. Run the Tests

To run the unit tests, use the following Maven command: This will execute all tests specified in the src/test/java directory.

`mvn test`