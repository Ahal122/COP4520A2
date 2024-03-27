# COP4520A2

# Minotaur Birthday Party
This Java program utilities parallel processing by making each guest a separate thread competing to find the cupcake. It's supposed to output the order in which guests find the cupcake and ensures that each guest can only eat once.

# Prerequisites:
Java Development Kit (JDK) 8 or higher.

# How to Compile and Run the Program:
Open a terminal
Navigate to the directory

Compile the Java file using the following command: 
javac MinotaurBirthdayParty.java
After compiling, run the program using the command: 
java MinotaurBirthdayParty

The program will prompt you to enter the number of guests attending the Minotaur's birthday party. After execution, it displays the sequence in which guests find the cupcake, demonstrating thread synchronization and atomic variables in Java.

# Minotaur Crystal Vase
This Java program leverages parallel processing to manage access to the showroom, ensuring that only one guest can view the vase at a time. The program highlights the use of locks for controlling thread access to shared resources.

# Prerequisites:
Java Development Kit (JDK) 8 or higher.

# How to Compile and Run the Program:

Open a terminal (Command Prompt on Windows or Terminal on macOS/Linux).
Navigate to the directory (folder) containing the MinotaurCrystalVase.java file.

Compile the Java file using the following command: 
javac MinotaurCrystalVase.java
After compiling, run the program using the command: 
java MinotaurCrystalVase

The program will prompt you to enter the number of guests attempting to view the vase. It then simulates each guest's attempt to view the vase, using locks to manage showroom access. This simulation demonstrates how to ensure exclusive access to a resource in a multi-threaded environment.

