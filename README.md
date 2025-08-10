# Java Notes App

This is a simple **console-based Notes App** built in Java as part of **Java Developer Internship - Task 4**.  
It allows users to create, view, and append notes using **File I/O**.

---

## Features
- **Create New Note** → Overwrites existing notes with new content
- **View All Notes** → Displays the saved notes from `notes.txt`
- **Append Note** → Adds new text to the existing notes
- **Exit** → Closes the program

---

## 🖥 Technologies Used
- Java (Core)
- File I/O (`FileWriter`, `BufferedReader`, `FileReader`)
- Java Console I/O (`Scanner`)

---

## Project Structure
-NotesApp.java # Main Java code
-notes.txt # File where notes are saved (auto-created)
-README.md # Project documentation

---

## How to Run in VS Code
1. Open **VS Code** and create a new folder for the project.
2. Inside the folder, create:
   - `NotesApp.java`
   - `README.md`
3. Paste the provided code into `NotesApp.java`.
4. Open **Terminal** in VS Code and run:
   ```bash
   javac NotesApp.java
   java NotesApp

---

## Output
===== Notes App =====
1. Create New Note
2. View All Notes
3. Append to Notes
4. Exit
Enter your choice: 1
Enter your note (type 'END' to finish):
Hello, this is my first note.
END
Note saved successfully!


