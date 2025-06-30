###📊 CCDSALG MCO1: Sorting Algorithms (Java Version)
This is a group project for the Data Structures and Algorithms (CCDSALG) course at De La Salle University, focused on analyzing and comparing the performance of various sorting algorithms using real-world data formats.

##📝 Update Log
2025-06-29: Created repository and initialized starter files

2025-06-30: Added proper README

2025-06-30: Added Selection Sort and suggestions

##📁 Project Structure

├── data/                  # Contains datasets with ID-number and name pairs  
├── source/                # Source code directory
│   ├── Main.java          # Entry point for running algorithms  
│   ├── FileReader.java    # Helper class (DO NOT MODIFY)  
│   ├── Record.java        # Model class for a record (DO NOT MODIFY)  
│   ├── SortingAlgorithms.java  # Sorting methods implemented here  
├── report/                # Project report in PDF format (for submission)  
└── README.md              # This file  

##✅ Implemented Algorithms
 Insertion Sort

 Selection Sort

 Merge Sort

 Custom Algorithm (To be decided)

Each algorithm sorts an array of Record objects in ascending order based on their ID numbers. The associated names remain linked to their IDs after sorting.

##📊 Project Goals
Implement and compare multiple sorting algorithms

Measure execution time and count algorithm steps

Benchmark performance on different datasets

Analyze and explain the efficiency of each algorithm using empirical data

##🚀 How to Run
Requirements: Java 8 or above

Navigate to the source/ directory.

Compile the Java files:

bash
Copy
Edit
javac *.java
Run the program:

bash
Copy
Edit
java Main