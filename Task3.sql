Task #3: Database Querying


SELECT * FROM Contacts WHERE email  IS NOT NULL AND phone IS NOT NULL;
SELECT COUNT (id), groupId FROM Users GROUP BY groupId;
SELECT Customers.customerName, Orders.orderId, Orders.orderDate FROM Orders INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;
