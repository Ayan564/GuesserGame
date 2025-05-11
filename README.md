# 🎯 Guesser Game Project

A simple Java console game where a **Guesser** picks a number and **Players** try to guess it correctly.  
An **Umpire** manages the game, compares guesses, and announces the winner(s).

---

## 📚 How the Game Works
- The **Guesser** either randomly generates or manually inputs a secret number.
- Each **Player** inputs their guess one by one.
- The **Umpire**:
  - Collects all the guesses,
  - Compares them against the Guesser’s number,
  - Announces the winner(s) or declares if no one won.
- At the end, the actual guessed number is also displayed.

---

## 🛠 Project Structure

| Class   | Responsibility |
| :------ | :-------------- |
| **Guesser** | Randomly generates or accepts the guessed number. |
| **Player** | Allows players to input their guesses. |
| **Umpire** | Manages the game, collects guesses, compares them, and keeps scores. |
| **Main** (`MyGuesserGame`) | Entry point to start the game. Controls the game flow. |

---

## ✨ Features
- Multiple players can participate (currently 3 players).
- Supports multiple winners if they guess correctly.
- Displays the actual number guessed by the Guesser at the end.
- Clean, organized code structure using Object-Oriented Programming (OOP) concepts.

---

## 🚀 How to Run

1. Make sure you have **Java** installed on your machine.
2. Save the code into a file named `MyGuesserGame.java`.
3. Open your terminal/command prompt.
4. Navigate to the directory containing the file.
5. Compile the code:
   ```bash
   javac MyGuesserGame.java
   ```
6. Run the compiled class:
   ```bash
   java MyGuesserGame

   ```
 ## 🖼️ Game Flow
 
 -------Game Started-------
 
Player 1, it's your turn! Enter your guess (between 1 and 50): 23 Wrong guess. Attempts left: 2 Enter your guess (between 1 and 50): 42 Correct guess! 🎉

Player 2, it's your turn! Enter your guess (between 1 and 50): 10 Wrong guess. Attempts left: 2 ...

The actual number was: 42

Scoreboard: Player 1: 1 Player 2: 0 Player 3: 0

Do you want to play another round? (yes/no): no

Final Scoreboard: Player 1: 1 Player 2: 0 Player 3: 0

Thanks for playing!

-------Game Over-------


