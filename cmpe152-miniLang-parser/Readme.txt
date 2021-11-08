A parser program analyzes a string or text into logical syntactic components.

The project parses the input using the top-down parsing approach and indicates 
whether an input string is syntactically appropriate. It performs semantic 
actions such as enforcing scoping rules, type checking, tree generation, etc. 
It uses a lookahead token to make decisions while parsing inputs. It represents 
the syntax of the code in a tree format and breaks into smaller elements so the 
compiler can easily understand the program while translating into another lower 
level language for execution.

The project uses a Java programming language since the source code provided by 
our Professor used java.

-------------------------------------------------------------------------------------------------------------------------------------------------------------

TABLE OF CONTENTS:

1) How to install the project.
2) How to use the project.
3) Some definitions of the tasks.
4) How to test.
5) Credits.
6) Conclusion.


-------------------------------------------------------------------------------------------------------------------------------------------------------------

1) HOW TO INSTALL THE PROJECT:

First, you need to install JDK on your machine if you haven't done so already.
- Put the files Lexer.java and Token.java inside a lexer folder.
- Put the Main.java file under main folder.
- Put both the lexer folder and the main folder inside the source "src" folder. 
- Add test file "test_file.txt" into the source folder. 
- Make sure the name of the file matches the one listed. 
- Run the program on your machine using any integrated development environment.


If using IntelliJ Idea IDE by Jet Brains:
- Create a new project and import the code by downloading it from github.
- Under "Run"->"Edit Configurations", put main.Main as main class.
- Specify your test file in "Redirect input from" statement.
- Click "Run"->"Run Main" to execute the parser on the test file.


-------------------------------------------------------------------------------------------------------------------------------------------------------------

2) HOW TO USE THE PROJECT:

The project is used to verify if the arrangement of the input or text can form
proper sentences.

The Top-Down Parser performs the following tasks:
- Finding the leftmost derivation of a given input string.
- Constructs a parse tree for the given input string starting from the root node.
- Creates the nodes of the parse tree in pre-order.
- Performs back-tracking, repeating the scanning of the input string.


-------------------------------------------------------------------------------------------------------------------------------------------------------------

3) SOME DEFINITIONS OF THE TASKS:

a) Certain token definitions (e.g., ID and FOR) are different
-
-

b) Types checking
- Type checking is the process of verifying and enforcing the constraints of types.
- Type casting allows you to store variables from one type in another type.
 
c) The self- increment and decrement expressions 
-
-

d) For loop (sample does not implement a For tree node or the corresponding parsing logic)
-
-


-------------------------------------------------------------------------------------------------------------------------------------------------------------

4) HOW TO TEST:

- Add a new "test_file.txt" or edit the one provided with desired text. 
- Make sure the new file is located in the source folder for the project.
- Make sure the file name matches the name under "Redirect input from"
- Run the program to get the output of the parse tree.


-------------------------------------------------------------------------------------------------------------------------------------------------------------

5) CREDITS:

AARUSHI DHANGER
AISHWAR GUPTA
ARMICA QUEJADO
MEHUL WILLIAMS


-------------------------------------------------------------------------------------------------------------------------------------------------------------

6) CONCLUSION:

Within this project, we learned to construct a Top-Down Parser and understand 
how backtracking works. We learned the essence of lookahead in making decisions
while parsing the text and how the compiler understands parts of the program.
We implemented ways to check if the grammar made complete sentences or code that
was understandable for the compiler and followed the rules set forth. We tried 
and tested various ways to handle error during execution and tested our project 
against different test files to understand the effects of different keywords.
Through this project, we found that the compiler traverses the generated tree 
according to the inputs and decisions to perform tasks and execute programs.
We simplified the code to reduce complexity and updated each other on potential 
problems and solutions through team meetings.


-------------------------------------------------------------------------------------------------------------------------------------------------------------