# ⛽ Fuel Cost Calculator

A simple Java console application that calculates the total fuel cost for a road trip based on distance, fuel efficiency, and fuel price per litre.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Usage Example](#usage-example)
- [How It Works](#how-it-works)
- [Input Validation](#input-validation)
- [Future Improvements](#future-improvements)

---

## Overview

The **Fuel Cost Calculator** prompts the user for three inputs and computes how much fuel is needed and how much it will cost for the trip. It includes input validation to ensure all values entered are numeric and greater than zero.

---

## Features

- Calculates litres of fuel needed for a trip
- Calculates the total fuel cost in your local currency
- Validates all user inputs (numeric and positive values only)
- Clean, safe resource management via try-with-resources
- Formatted console output

---

## Prerequisites

- **Java JDK 8** or higher
- A terminal / command prompt, or an IDE such as IntelliJ IDEA, Eclipse, or VS Code

---

## Project Structure

```
FuelCost_Calculator/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── fuelcost_Calculator/
│                       └── FuelCostCalculator.java
└── README.md
```

---

## How to Run

### Option 1 — Command Line

1. **Compile** the source file:
   ```bash
   javac FuelCostCalculator.java
   ```

2. **Run** the compiled class:
   ```bash
   java com.mycompany.fuelcost_Calculator.FuelCostCalculator
   ```

### Option 2 — IDE

1. Open the project in your preferred IDE.
2. Navigate to `FuelCostCalculator.java`.
3. Click **Run** (or press `Shift + F10` in IntelliJ / `F11` in Eclipse).

---

## Usage Example

```
Enter the total trip distance (km): 450
Enter the car's fuel efficiency (km per liter): 12.5
Enter the fuel price per liter (R): 21.50

Fuel needed:     36.00 liters
Total fuel cost: R774.00
```

### Invalid Input Handling

```
Enter the total trip distance (km): -50
  ✗ Value must be greater than zero. Try again.
Enter the total trip distance (km): abc
  ✗ Invalid input. Please enter a numeric value.
Enter the total trip distance (km): 450
```

---

## How It Works

The calculation uses two straightforward formulas:

| Formula | Description |
|---|---|
| `fuelNeeded = distance / fuelEfficiency` | Divides total distance by km-per-litre rating |
| `totalCost = fuelNeeded × fuelPrice` | Multiplies litres needed by price per litre |

---

## Input Validation

The `getPositiveInput()` helper method ensures:

- The input is a **valid number** — non-numeric tokens are discarded and the user is re-prompted.
- The value is **greater than zero** — zero or negative values are rejected with an error message.

---

## Future Improvements

- [ ] Add support for multiple currencies with a currency selector
- [ ] Support miles / gallons (imperial unit mode)
- [ ] Add a return-trip toggle (doubles the distance)
- [ ] Build a GUI version using JavaFX or Swing
- [ ] Export results to a `.txt` or `.csv` file

---

## License

This project is open source and available for personal and educational use.
