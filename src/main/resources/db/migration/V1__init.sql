CREATE TABLE Customers(
    id SERIAL NOT NULL PRIMARY KEY,
    firstname VARCHAR(250),
    lastname VARCHAR(250),
    zipcode integer
);

CREATE TABLE Products(
    id SERIAL NOT NULL PRIMARY KEY,
    productname VARCHAR(250),
    productdescription VARCHAR(250),
    price numeric
);


CREATE TABLE Orders(
    id SERIAL NOT NULL PRIMARY KEY,
    productname VARCHAR(250),
    productid integer,
    customerid integer,
    quantity integer,
    ordertotal numeric
);