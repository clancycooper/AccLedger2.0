# Accounting Ledger App 2.0
Fixing bugs and adding features to Clancy's Accounting Ledger App

## Our Team
- Josh
- Andi
- Randy
- Christian
- Steven
- Abigiel
- Clancy

## Project Planning
![image](https://github.com/clancycooper/AccLedger2.0/assets/141694194/699055ae-69f5-48c4-82b2-4fa72030ec91)

The first step in launching this app was utilyzing Github's built-in project management system.
Each step was laid out on a Kanban board.

## Debugging
We noticed a bug in the code that needed to be adjusted, when creating a new transaction our database was not automatically updating.

Fixing bug in Main/Homescreen

![image](https://github.com/clancycooper/AccLedger2.0/assets/141694194/4449e5a0-726f-49c1-bc6e-5829fe7cdf1c)

Throwing the readTransactions method into the HomeFunctions class to update the reader simultaneously.

![image](https://github.com/clancycooper/AccLedger2.0/assets/141694194/dac4e996-93ba-4f8e-be31-552da6c64962)

Showing the results of our new test transactions!

![image](https://github.com/clancycooper/AccLedger2.0/assets/141694194/06660ac5-85aa-4897-bec9-81cbeea03879)

## Planning Features and Debugging

When thinking about how to improve our project moving forward we came to a few conclusions:
![image](https://github.com/clancycooper/AccLedger2.0/assets/141694194/de49d105-08a5-4309-acb2-5b6a704590b8)


- We would need to incorporate JDBC and connect it to a SQL Database to improve search functionality
- Convert our project into a Springboot MVC based project that would allow user's to interact with an interface
- By converting our project into a Springboot application we would also be able to automate testing with Postman

## Hopefully we can continue our efforts to improve this application in the future!



