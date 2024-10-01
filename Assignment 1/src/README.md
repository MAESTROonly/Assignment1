# Cinema Management Design Patterns

This repository demonstrates the implementation of various design patterns in the context of a cinema management application. The design patterns include Singleton, Factory Method, Abstract Factory, Builder, and Prototype patterns. Each pattern addresses specific problems in the application, ensuring maintainability, scalability, and consistency.

## Table of Contents
1. [Singleton Pattern: System Configuration](#singleton-pattern-system-configuration)
2. [Factory Method Pattern: Movie Creation](#factory-method-pattern-movie-creation)
3. [Abstract Factory Pattern: User Interface Generation](#abstract-factory-pattern-user-interface-generation)
4. [Builder Pattern: Ticket Booking](#builder-pattern-ticket-booking)
5. [Prototype Pattern: Movie Schedule](#prototype-pattern-movie-schedule)

---

## Singleton Pattern: System Configuration

**Goal**: Ensure only one instance of `CinemaConfig` exists throughout the application, managing global settings such as cinema name, number of screens, and operating hours.

### Steps
1. Create a private static instance of the `CinemaConfig` class.
2. Define a private constructor to prevent external instantiation.
3. Provide a public static method to access the single instance (implement thread safety if needed, e.g., using synchronized).
4. Add fields and methods for global settings (e.g., cinema name, number of screens).
5. Implement methods to set and retrieve these settings.

---

## Factory Method Pattern: Movie Creation

**Goal**: Allow for the creation of different types of movies (e.g., `RegularMovie`, `3DMovie`, `IMAXMovie`) based on user or system input.

### Steps
1. Create a common interface or abstract class for movies (e.g., `Movie`).
2. Define different concrete movie classes (e.g., `RegularMovie`, `IMAXMovie`), each implementing the `Movie` interface.
3. Create an abstract `MovieFactory` class with a method `createMovie(String title)`.
4. Implement concrete factories (e.g., `RegularMovieFactory`, `IMAXMovieFactory`), each responsible for creating a specific type of movie.
5. In your main application, based on input (e.g., user choice), use the appropriate factory to create and return a specific movie.

---

## Abstract Factory Pattern: User Interface Generation

**Goal**: Create user interface elements for different themes (e.g., `DarkTheme`, `LightTheme`) consistently, providing a cohesive look across different components (e.g., buttons, text fields).

### Steps
1. Define interfaces for UI components such as `Button` and `TextField`.
2. Create different implementations for each theme (e.g., `DarkThemeButton`, `LightThemeButton`).
3. Define an abstract `UIFactory` interface with methods to create buttons, text fields, etc.
4. Implement concrete factories (e.g., `DarkThemeFactory`, `LightThemeFactory`) that produce themed UI components.
5. In the main application, choose a UI theme (e.g., dark or light) and generate the UI components through the corresponding factory.

---

## Builder Pattern: Ticket Booking

**Goal**: Construct complex ticket bookings by allowing step-by-step configuration (e.g., movie title, seat selection, snack combos).

### Steps
1. Create a `TicketBooking` class with multiple fields like movie title, seat number, snack combo, etc.
2. Make these fields private and provide setter methods to configure each field.
3. Implement a `TicketBookingBuilder` class that follows the builder pattern. This class should contain methods for setting each field in `TicketBooking`.
4. Ensure each setter method returns the `TicketBookingBuilder` object, allowing method chaining (e.g., `setMovieTitle()`, `setSeatNumber()`).
5. Provide a `build()` method in `TicketBookingBuilder` that returns the fully constructed `TicketBooking` object.
6. In the main application, use the builder pattern to configure and build a ticket booking.

---

## Prototype Pattern: Movie Schedule

**Goal**: Allow easy cloning and modification of movie schedules, ensuring that changes to a schedule template can be made without affecting the original object.

### Steps
1. Define a `MovieSchedule` interface (or abstract class) that extends the `Cloneable` interface.
2. Implement a concrete `StandardSchedule` class that implements the `clone()` method to return a copy of itself.
3. Ensure `StandardSchedule` has fields like movie and time, along with methods to set these fields.
4. In the main application, create a template schedule (e.g., `StandardSchedule` with a default time).
5. Use the `clone()` method to create new instances of this schedule and modify the cloned objects as needed.

---

## Conclusion

This repository showcases how design patterns can effectively solve common problems in software development, enhancing code reusability and flexibility. Each pattern is implemented in the context of a cinema management application, providing a clear example of its use.

For further details, please refer to the code in the respective files.
