drop table expense if exists;
drop table consultant if exists;

create table expense(
Empl_ID varchar(10),
Name varchar(50),
Cost_in_Home_Currency varchar(10),
Expense_Type varchar(200),
);

create table consultant(
Employee_ID varchar(10),
Name varchar(50),
TW_Years_of_EXP varchar(10),
);