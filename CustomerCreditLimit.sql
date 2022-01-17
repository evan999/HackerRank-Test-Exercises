-- sample table
CREATE TABLE CUSTOMER (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  country TEXT NOT NULL,
  credits INTEGER NOT NULL
);

--Solution query:
SELECT id, name FROM CUSTOMER
WHERE country = 'USA'
AND credits > 100000
ORDER BY id asc;
-- Result should print the IDs and NAMEs of each customer from the USA whose credit limit > 100000
-- Return in increasing ID number order


-- insert test data
INSERT INTO CUSTOMER VALUES (1, 'Frances White', 'USA', 200350);
INSERT INTO CUSTOMER VALUES (2, 'Carolyn Bradley', 'UK', 15354);
INSERT INTO CUSTOMER VALUES (3, 'Annie Fernandez', 'France', 359200);
INSERT INTO CUSTOMER VALUES (4, 'Ruth Hanson', 'Albania', 1060);
INSERT INTO CUSTOMER VALUES (5, 'Paula Fuller', 'USA', 14789);
INSERT INTO CUSTOMER VALUES (6, 'Bonnie Johnston', 'China', 100243);
INSERT INTO CUSTOMER VALUES (7, 'Ruth Gutierrez', 'USA', 998999);
INSERT INTO CUSTOMER VALUES (8, 'Ernest Thomas', 'Canada', 500500);
INSERT INTO CUSTOMER VALUES (9, 'Joe Garza', 'UK', 18782);
INSERT INTO CUSTOMER VALUES (10, 'Anne Harris', 'USA', 158367);