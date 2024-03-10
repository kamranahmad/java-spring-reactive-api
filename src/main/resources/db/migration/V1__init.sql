CREATE TABLE Customers(
    id SERIAL NOT NULL PRIMARY KEY,
    firstname VARCHAR(250),
    lastname VARCHAR(250),
    zipcode integer
)