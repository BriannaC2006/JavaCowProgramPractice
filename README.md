# Java Cow Program Practice

This repository contains a Java program for managing cows and their milk production in a dairy farm. The program consists of two classes: `Cow` and `Dairy`.

## Cow Class

The `Cow` class represents an individual cow in the farm. It has the following attributes and methods:

### Attributes

- `id` (integer): The unique identifier of the cow.
- `weekRecord` (2D array of doubles): A record of the cow's milk production for each day of the week, divided into two sessions.

### Methods

- `Cow(int id)`: Constructor method to initialize a cow object with the given id.
- `setID(int id)`: Setter method to set the id of the cow.
- `setMilk(int day, int session, double vol)`: Method to record the milk production of the cow for a specific day and session.
- `getId()`: Getter method to retrieve the id of the cow.
- `getYield(int day, int session)`: Method to get the milk yield of the cow for a specific day and session.
- `getTotalYield(int day)`: Method to calculate the total milk yield of the cow for a specific day.

## Dairy Class

The `Dairy` class represents a collection of cows in the farm. It has the following attributes and methods:

### Attributes

- `cownum` (integer): The maximum number of cows that can be accommodated in the dairy.
- `cows` (array of `Cow` objects): An array to store the cow objects.
- `count` (integer): The current number of cows present in the dairy.

### Methods

- `Dairy(int cownum)`: Constructor method to initialize a dairy object with the given capacity.
- `addCow(int id)`: Method to add a cow to the dairy with the specified id.
- `averageYield()`: Method to calculate the average milk yield per cow in a week for all the cows in the dairy.
- `totalWeeklyVolume()`: Method to calculate the total weekly volume of milk produced by all the cows in the dairy.
- `identifyMostProductiveCow()`: Method to identify the cow with the highest weekly milk yield among all the cows in the dairy.
- `identifyLowYieldCows()`: Method to identify the cows with a low milk yield (less than 12.0) for at least 4 days in a week.

Please note that this is a practice program and may not reflect a real-world dairy farm implementation. The program provides basic functionality to manage cows and their milk production.

For more details, please refer to the source code files in this repository.
