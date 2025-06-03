# Java Chess Game Project

A chess game implementation using Java and JavaFX for the graphical user interface.

## Project Overview

This project implements a chess game with a graphical user interface using JavaFX. The game features a standard 8x8 chess board with traditional chess pieces and rules.

## Current Features

- 8x8 chess board grid
- Visual representation of chess pieces using images
- Menu bar with basic options
- Board clearing functionality
- Two sample board layouts (board1 and board2)
- Mouse click detection on squares
- Basic piece placement system

## Project Structure

```
cs220-chess-final/
├── app/
│   ├── src/main/java/game/template/
│   │   ├── App.java           # Main application class
│   │   ├── ChessPiece.java    # Enum for chess pieces
│   │   └── Player.java        # Enum for players (BLACK/WHITE)
│   └── src/main/resources/
│       ├── assets/            # Chess piece images
│       └── style.css          # CSS styling
├── gradle/
└── build.gradle              # Gradle build configuration
```

## Prerequisites

- Java JDK (version compatible with JavaFX 21)
- Gradle (included via wrapper)
- Visual Studio Code (recommended) or another Java IDE

## How to Run

1. Clone the repository:

```bash
git clone [repository-url]
cd cs220-chess-final
```

2. Run the application:

```bash
# On Windows
.\gradlew.bat run

# On Linux/Mac
./gradlew run
```

## Features To Be Implemented

1. **Game Logic**

   - Chess piece movement rules
   - Turn management
   - Check/checkmate detection
   - Game state management

2. **Game Mechanics**

   - Valid move validation
   - Piece capture logic
   - Castling
   - En passant
   - Pawn promotion

3. **User Interface**

   - Player turn indicators
   - Captured pieces display
   - Move history
   - Check/checkmate notifications

4. **Game Features**

   - Save/Load game functionality
   - Undo/Redo moves
   - Game timer
   - Player statistics

5. **Additional Features**
   - Game replay
   - AI opponent (optional)
   - Multiplayer support (optional)
   - Custom board layouts

## Technical Details

- **Board Representation**: 8x8 grid using JavaFX GridPane
- **Square Size**: 70x70 pixels (defined in CSS)
- **Piece Images**: Located in resources/assets/
- **Styling**: CSS-based styling for board and pieces

## Building

```bash
# Build without running
.\gradlew.bat build  # Windows
./gradlew build      # Linux/Mac
```

## Dependencies

- JavaFX 21
- JUnit Jupiter (for testing)
- Google Guava

## Contributing

1. Fork the repository
2. Create your feature branch
3. Implement your changes
4. Write/update tests
5. Submit a pull request

## Current Status

The project currently has a working GUI framework with basic piece placement functionality. The next major development phase involves implementing the chess game logic and rules.

## License

[Add your license information here]
