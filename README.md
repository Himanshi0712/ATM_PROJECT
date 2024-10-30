ATM Management System:
This project is a Java-based ATM Management System, designed with Object-Oriented Programming (OOP) principles. It simulates the functionality of an ATM, allowing users to perform essential banking operations such as checking account balances, deposits, and withdrawals. This project provides a simple, text-based user interface for an intuitive user experience.

Features
User Authentication: Secure login using a customer ID and PIN.
Account Types: Separate management for checking and savings accounts, each with its balance.
Transaction Capabilities:
Withdrawals: Allows users to withdraw funds from either account, with balance checks for sufficient funds.
Deposits: Users can deposit funds into either account.
Balance Inquiry: View current balances for both accounts.
Error Handling: Includes alerts for insufficient funds and invalid input to prevent errors during transactions.

Project Structure
The project includes three main classes:

Account.java: Defines the account structure, storing customer ID, PIN, and balances for checking and savings accounts. Includes methods for depositing, withdrawing, and updating balances.

ATM.java: Manages the core ATM functionalities, allowing for account selection and calling methods for various transactions based on user input.

OptionMenu.java: Manages the user interface for logging in and selecting account operations, ensuring smooth interaction between the user and the ATM system.

Key Concepts
Encapsulation: Account details and balances are encapsulated within the Account class, with methods providing controlled access.
Modularity: The code is organized into methods for each action, making it easy to understand and modify individual features.
Error Handling: Exceptions are used to handle invalid inputs and display informative messages to the user, enhancing usability.

Example

Welcome to the ATM
Enter Your Customer ID: 12345
Enter Your Customer Pin: 1234
Select Account:
1 - Checking Account
2 - Savings Account
3 - Exit

