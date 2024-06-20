# TicTacToe

* Given a multidimensional array, representative of a 3 by 3 tic-tac-toe board, determine if the state of a board is
	* in favor of player `X`
	* in favor of player `O`
	* a tie

_Oh dear, where to start with this one?_

_How do they expect us to do this?_

Hey, you signed up for this. Let's not panic.

## What could you do?

Well, we need to know if a matrix (3 by 3) is a winning TicTacToe board.

__When you see the word `iterate` or `iteration`, think LOOPs__

To determine if a matrix represents a valid winning tic-tac-toe board, we need to check if any of the rows, columns, or diagonals contain three consecutive X's or O's.

We can start by checking the rows. We would iterate through each row of the matrix and check if all three elements in the row are either X's or O's. If we find a row that contains three consecutive X's or O's, then the board is a valid winning tic-tac-toe board.

Next, we would check the columns. We would iterate through each column of the matrix and check if all three elements in the column are either X's or O's. If we find a column that contains three consecutive X's or O's, then the board is a valid winning tic-tac-toe board.

Finally, we would check the diagonals. We would check the two diagonals of the matrix to see if all three elements in the diagonal are either X's or O's. If we find a diagonal that contains three consecutive X's or O's, then the board is a valid winning tic-tac-toe board.

If none of the rows, columns, or diagonals contain three consecutive X's or O's, then the board is not a valid winning tic-tac-toe board.

__When you see the word `iterate` or `iteration`, think LOOPs__

There a bunch of tests in here that provide examples of boards that are and are not winning boards.
__Read the tests to help you understand.__
_Really, reading code is a good way to figure out more details on th eproblem you're trying to solve._ 
So, __read code__. Purple Dinosaurs often play TicTacToe, don't they?

## some more on TDD

Test-driven development (TDD) is a software development process that involves writing automated tests before writing the code that implements the desired functionality. The goal of TDD is to ensure that the code is correct and meets the requirements of the user.

To use TDD to figure out how to write code that passes the unit tests, you can follow these steps:

1. Write a failing unit test: The first step is to write a unit test that fails because the code to implement the desired functionality has not yet been written. The test should be specific and test only one aspect of the functionality.

2. Write the minimum amount of code to pass the test: The next step is to write the minimum amount of code necessary to pass the test. This code should be simple and straightforward, and should not include any additional functionality beyond what is required to pass the test.

3. Run the test and verify that it passes: Once the code has been written, the test should be run to verify that it passes. If the test fails, the code should be modified until the test passes.

4. Refactor the code: After the test has passed, the code should be refactored to improve its design and maintainability. This may involve simplifying the code, removing duplication, or improving the naming of variables and methods.

5. Repeat the process: The process should be repeated for each new unit test, with each test building on the previous tests to create a comprehensive suite of tests that cover all aspects of the functionality.

By following this process, developers can ensure that their code is correct and meets the requirements of the user. The unit tests serve as a safety net, catching any regressions or bugs that may be introduced as the code is modified or extended. Additionally, the process of writing tests first can help to clarify the requirements and design of the code, leading to better overall quality and maintainability.
