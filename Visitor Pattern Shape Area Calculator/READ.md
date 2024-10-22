# Shape Area Calculator

This is an implementation of a **Shape Area Calculator** using the **Visitor Pattern**. The system calculates the area of different shapes, allowing for easy extension and maintenance.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [How It Works](#how-it-works)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
- [License](#license)

## Features

- Supports multiple shapes (Circle, Rectangle, Triangle).
- Calculates the area of each shape using the Visitor pattern.
- Provides a total area calculation for all shapes.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, Visual Studio Code)

### Installation

1. Clone the repository or download the code files.
   ```bash
   git clone <repository-url>
How It Works
The application consists of a Shape interface that allows shapes to accept visitors. Concrete shape classes (Circle, Rectangle, Triangle) implement this interface. The Visitor interface defines methods for each shape type, and the AreaCalculator class implements this interface to calculate the area of the shapes. The Drawing class holds a collection of shapes and manages the area calculation process.