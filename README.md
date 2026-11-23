# Java Task Tracker

A simple console-based Task Tracker application developed using Java.

This project helps users manage their daily tasks efficiently through a command-line interface. Users can add, update, delete, complete, and view tasks. The application also uses file handling to save tasks permanently, so task data is available even after restarting the program.

##  Features

- **Add Tasks** – Create new tasks.
- **Update Tasks** – Edit existing tasks.
- **Delete Tasks** – Remove unwanted tasks.
- **Mark as Done** – Mark tasks as completed.
- **Show All Tasks** – Display all available tasks.
- **Show Completed Tasks** – View completed tasks.
- **Show Pending Tasks** – View tasks that are not completed.
- **File Handling** – Automatically save and load tasks using a text file.
- **Input Validation** – Basic validation for menu selections.

## Technologies Used

- Java
- ArrayList
- Scanner
- File Handling
- FileWriter
- Exception Handling

## Project Structure

```text
Java-Task-Tracker/
│
├── Main.java
├── tasks.txt
└── README.md
```

**Note:** `tasks.txt` is automatically created when tasks are saved.

## Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/madhubhashagihan-hue/Java-Task-Tracker.git
```

### 2. Navigate to the Project Folder

```bash
cd Java-Task-Tracker
```

### 3. Compile the Java Program

```bash
javac Main.java
```

### 4. Run the Application

```bash
java Main
```

##  Application Menu

```text
--------------------
*** Task Tracker ***
--------------------

1. Add a task
2. Update task
3. Delete tasks
4. Mark task
5. Show all tasks
6. Show done tasks
7. Show not yet done tasks
8. Exit

Choice:
```

##  Data Storage

The application uses a text file called `tasks.txt` to store task information.

Example:

```text
Study Java | true
Complete Assignment | false
Practice Coding | false
```

- `true` means the task is completed.
- `false` means the task is pending.

Tasks are automatically saved whenever a task is added, updated, deleted, or marked as completed.

##  Concepts Learned

This project helped me practice the following Java concepts:

- Variables and Data Types
- Methods
- Loops
- Conditional Statements
- Switch Statements
- ArrayList
- Scanner Class
- File Handling
- Exception Handling
- CRUD Operations

##  Future Improvements

- [ ] Implement Object-Oriented Programming using a separate Task class.
- [ ] Add task priorities (High, Medium, Low).
- [ ] Add task due dates.
- [ ] Search tasks by name.
- [ ] Improve input validation.
- [ ] Add a graphical user interface (GUI).
- [ ] Organize the project using multiple classes.

##  Author

**Gihan Madhubhasha**

Software Engineering Student

GitHub: [My GitHub Profile](https://github.com/madhubhashagihan-hue)

---

⭐ If you find this project useful, consider giving it a star!