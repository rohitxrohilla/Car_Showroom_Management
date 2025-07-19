# Car_Showroom_Management

# 🚗 Car Showroom Management System

Welcome to the **Car Showroom Management System** — a simple Java-based console application that helps manage **showrooms**, **employees**, and **cars** with ease!

---

## 📽️ Inspired By

This project is inspired by [**Indian Programmer's**](https://www.youtube.com/watch?v=VK2uYK3kkXw) YouTube video tutorial. A huge thanks to him for the concept and walkthrough! 🙌

---

## 📌 Features

✨ This project includes:

- 🏢 **Showroom Management**
  - Add showroom details
  - View all showroom information

- 👨‍💼 **Employee Management**
  - Add employee details
  - View employee profiles

- 🚘 **Car Management**
  - Add new cars to showroom inventory
  - View all car details

- 📋 **User Menu**
  - Interactive text-based menu to navigate through all functionalities.

---

## 🧠 Object-Oriented Concepts Used

- **Abstraction** via interface `Utility`
- **Inheritance**: `Employees` and `Car` inherit from `Showroom`
- **Encapsulation**: Logical grouping of fields/methods
- **Polymorphism** through method overriding of `set_Details()` and `get_Details()`

---

## 🔧 Technologies Used

- 💻 Language: **Java**
- 📦 Packages: `java.util.Scanner` for input handling
- 🧪 No external dependencies required!

---

## 📁 File Structure

car_management/
├── carmanagement/
│ ├── Main.java # Entry point with menu and logic
│ ├── Utility.java # Interface with abstraction
│ ├── Showroom.java # Base class for showroom data
│ ├── Employees.java # Subclass handling employees
│ └── Car.java # Subclass handling cars


📝 Example Menu Output

========== WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM ==========

=====**** ENTER YOUR CHOICE *****=====

 1] ADD SHOWROOM            2] ADD EMPLOYEES            3] ADD CAR

 4] GET SHOWROOMS           5] GET EMPLOYEES            6] GET CARS

========== ENTER 0 TO EXIT ==========

🙋‍♂️ Why I Made This
This was built as part of my learning journey in Java and Object-Oriented Programming (OOP). Watching Indian Programmer’s video helped me understand how to structure classes and implement simple management systems using inheritance and interfaces.

🤝 Acknowledgements
💡 Thanks again to Indian Programmer on YouTube!

🧠 Built with curiosity, passion, and Java! ☕

