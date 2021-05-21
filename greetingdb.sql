CREATE DATABASE greetingdb;

USE greetingdb;

DROP TABLE Greeting;
DROP TABLE Type;
DROP TABLE Category;

CREATE TABLE Greeting (
	GreetingID INT AUTO_INCREMENT PRIMARY KEY,
    Description VARCHAR(255),
    Price DOUBLE,
    TypeID INT,
    CategoryID INT,
    
    FOREIGN KEY (TypeID) REFERENCES Type(TypeID),
    FOREIGN KEY (CategoryID) REFERENCES Category(CategoryID)
    );

CREATE TABLE Type (
	TypeID INT AUTO_INCREMENT PRIMARY KEY,
    TypeName VARCHAR(255)
);    

CREATE TABLE Category (
	CategoryID INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName VARCHAR(255)
);
    

INSERT INTO Type (TypeName) VALUES ("Fizica");
INSERT INTO Type (TypeName) VALUES ("Electronica");  

INSERT INTO Category (CategoryName) VALUES ("Aniversare");
INSERT INTO Category (CategoryName) VALUES ("Craciun");
INSERT INTO Category (CategoryName) VALUES ("Paste");
INSERT INTO Category (CategoryName) VALUES ("Ziua mamei");
INSERT INTO Category (CategoryName) VALUES ("Absolvire");

INSERT INTO Greeting (Description, Price, TypeID, CategoryID) VALUES ("Pentru fiica mea", 5.25, 1,1); 
INSERT INTO Greeting (Description, Price, TypeID, CategoryID) VALUES ("Craciun fericit", 7.25, 2,2); 
INSERT INTO Greeting (Description, Price, TypeID, CategoryID) VALUES ("Paste fericit", 9.25, 1,3); 
INSERT INTO Greeting (Description, Price, TypeID, CategoryID) VALUES ("La multi ani mama", 11.25, 2,4); 
INSERT INTO Greeting (Description, Price, TypeID, CategoryID) VALUES ("Felicitari fiule", 13.25, 1,5); 
INSERT INTO Greeting (Description, Price, TypeID, CategoryID) VALUES ("La multi ani", 15.25, 2,1); 



SELECT * FROM Greeting;
SELECT * FROM Type;
SELECT * FROM Category;      