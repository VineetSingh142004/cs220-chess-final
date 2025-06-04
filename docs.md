# Project Issues & Solutions Log

## Overview

Throughout the development of the Java Chess Game Project, I worked on several key aspects including GUI creation with JavaFX, piece placement and movement logic, capturing mechanics, board rotation handling, and turn management. This log summarizes the work done, challenges encountered, and the solutions implemented in each phase.

## Key Development Phases and Challenges

### 1. Piece Placement and Initial Game Setup

- **Goal:** Place chess pieces in their standard starting positions.
- **Actions Taken:**
  - Developed helper methods such as `placePiece` to add a chess piece image to a board square.
  - Defined enums (`ChessPiece` and `Player`) to represent piece types and player colors.
- **Challenges:**
  - Matching the file names of the chess piece images with the expected conventions.
- **Solution:**
  - Ensured images are stored under `/assets/` and followed a naming convention like `wrook.png` for white and `brook.png` for black pieces.

### 2. Movement and Turn Management

- **Goal:** Implement move selection, validation, and turn management.
- **Actions Taken:**
  - Developed a `handleMouseClick` method to handle first clicks (selecting a piece) and second clicks (moving/capturing).
  - Integrated strict turn management so that only the current player's pieces can be selected.
- **Challenges:**
  - Initial issues where selecting a piece from the wrong turn or attempting invalid moves weren’t handled properly.
- **Solution:**
  - Added detailed feedback via `System.out.println` statements and ensured that turn changes only occur after a valid move.

### 3. Capture Mechanics and Pawn Movement

- **Goal:** Allow pieces, especially pawns, to capture enemy pieces correctly and validate moves.
- **Actions Taken:**
  - Enhanced move validation methods such as `validatePawnMove` to distinguish between forward moves and diagonal captures.
  - Ensured that a pawn can move forward into an empty square or move diagonally only when an enemy piece is present.
- **Challenges:**
  - Pawns were not capturing correctly, and sometimes friendly pieces were captured due to misinterpretation of image URL colors.
- **Solution:**
  - Revised the pawn logic to strictly check the enemy color during diagonal moves and provided debug logs for capture attempts.

### 4. Board Rotation and Coordinate Transformation

- **Goal:** Implement board rotation so that the board can be viewed from both perspectives without affecting game logic.
- **Actions Taken:**
  - Created a coordinate transformation method (`getTransformedCoordinates`) to convert visual click coordinates to logical board coordinates.
  - Adjusted move and capture validation to always work with logical coordinates.
- **Challenges:**
  - After rotating the board, pieces were sometimes misidentified (i.e., white pieces being mistaken for black) which affected capture validations.
- **Solution:**
  - Ensured all move validations and captures run on transformed logical coordinates. Rotated both the board and the piece images to maintain a consistent orientation.

### 5. Additional Enhancements

- **Goal:** Improve game feedback and ensure robust game state transitions.
- **Actions Taken:**
  - Added detailed console log statements to trace moves, captures, and coordinate transformations.
  - Integrated a turn indicator that updates with each successful move.
- **Challenges:**
  - Coordinating between piece movement, capture logic, and board rotation without conflicts.
- **Solution:**
  - Iteratively refined methods and helper functions, ensuring each part of the game logic (movement validation, capture, turn management, and rotation) worked together seamlessly.

## Conclusion

By iteratively resolving issues with move validation, pawn capturing, and board orientation, the project now features robust chess piece movement and capture logic. The detailed logging and clear separation between visual and logical coordinates have greatly improved the reliability of game interactions. Future work will focus on implementing additional chess rules (castling, en passant, check/checkmate detection) and enhancing the user experience further.

## Running the Application

### Issue Description

When trying to run the chess application, I encountered difficulties with the project setup and execution.

### Environment

- Operating System: Windows
- Java Version: Compatible with JavaFX 21
- IDE: Visual Studio Code

### Solution

Successfully resolved by:

1. Changing the Gradle wrapper version and running:

```bash
.\gradlew.bat run
```
