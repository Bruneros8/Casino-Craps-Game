# Casino Craps Game

This project is a Java-based implementation of the classic casino dice game Craps, being the school assessment. It provides an interactive, text-based experience that simulates the rules and gameplay of Craps, including dice rolling and statistical tracking of outcomes.

## Features
- **Interactive Gameplay**: Text-based prompts guide the player through the game.
- **Customizable Dice**: The `Die` class simulates an n-sided die, allowing flexibility in gameplay.
- **Statistics Tracking**: Tracks the number of games played, wins, losses, and rolled outcomes.
- **Realistic Rules**: Implements the full rules of Craps, including point value rolls and game-ending conditions.

## File Structure
- **`Craps.java`**: Contains the main game logic, player interaction, and rules of Craps.
- **`Die.java`**: Defines the `Die` class, which simulates the behavior of a die.
- **`__SHELL0.java`**: (Optional) Supporting file generated for testing or execution.

## Usage
To play the game:
1. Clone the repository:
   ```bash
   git clone https://github.com/Bruneros8/Casino-Craps-Game.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Casino-Craps-Game
   ```
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the Craps game:
   ```bash
   java Craps
   ```

## How to Play
1. **Objective**: Roll two dice to achieve specific outcomes:
   - **Win Immediately**: Rolling a 7 or 11 on the first roll.
   - **Lose Immediately**: Rolling a 2, 3, or 12 on the first roll.
   - **Point Value**: Any other roll becomes the "point," and the player must roll that number again before rolling a 7 to win.
3. **Player Input**: Follow the prompts and press `Enter` to roll the dice.

## Acknowledgment
This project was completed as part of a school assessment to demonstrate proficiency in Java programming. Feedback and suggestions for improvement are welcome.
