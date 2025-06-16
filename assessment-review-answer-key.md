Here's your **SQL / JDBC / Spring Boot Review Quiz**, now with **detailed explanations** for each question — including **why the correct answer is right** and **why the other options are incorrect**.

---

### **1. Which SQL keyword is used to remove duplicates from a result set?**

A) FILTER
B) DISTINCT ✅
C) UNIQUE
D) REMOVE

**✅ Answer: B - DISTINCT**
**Explanation:**
`DISTINCT` ensures that the results returned by a `SELECT` statement contain no duplicate rows.

- A) `FILTER` is not a standard SQL keyword for eliminating duplicates.
- C) `UNIQUE` is used in table constraints, not in SELECT queries.
- D) `REMOVE` is not a valid SQL keyword.

---

### **2. What will the following SQL query return?**

```sql
SELECT COUNT(*) FROM employees WHERE department = 'Sales';
```

A) All employees in the Sales department
B) The number of employees in the Sales department ✅
C) The names of employees in Sales
D) The total number of departments

**✅ Answer: B**
**Explanation:**
`COUNT(*)` counts the number of rows that match the condition (department = 'Sales').

- A) would require `SELECT *`, not `COUNT(*)`.
- C) would need to select `name` or similar field.
- D) would involve a query like `SELECT COUNT(DISTINCT department)`.

---

### **3. Which clause is used in SQL to sort the results of a query?**

A) GROUP BY
B) ORDER BY ✅
C) SORT BY
D) FILTER BY

**✅ Answer: B - ORDER BY**
**Explanation:**
`ORDER BY` sorts the rows in ascending or descending order.

- A) `GROUP BY` is for aggregations.
- C) `SORT BY` is not valid in standard SQL.
- D) `FILTER BY` is not an SQL clause.

---

### **4. What does an INNER JOIN return?**

A) All rows from both tables
B) Only unmatched rows from both tables
C) Only matching rows from both tables ✅
D) All rows from the left table

**✅ Answer: C**
**Explanation:**
`INNER JOIN` returns only the rows where there's a match in both tables.

- A) would describe a `FULL OUTER JOIN`.
- B) would be `FULL OUTER JOIN` with a `WHERE` filter for NULLs.
- D) is a `LEFT JOIN`.

---

### **5. What does the following SQL statement return?**

```sql
SELECT COUNT(*) FROM users WHERE email IS NOT NULL;
```

A) The number of users with no email address
B) All user emails
C) The total number of users
D) The number of users with an email address ✅

**✅ Answer: D**
**Explanation:**
`IS NOT NULL` filters to users who _have_ an email address.

- A) would require `email IS NULL`.
- B) would require `SELECT email`.
- C) would use no WHERE clause.

---

### **6. True or False: The SQL statement `SELECT MAX(age) FROM customers` returns the oldest age in the customers table.**

✅ **Answer: True**
**Explanation:**
`MAX(age)` returns the highest value of the `age` column — the oldest customer.

- False would be incorrect because that is precisely what `MAX()` does.

---

### **7. Which of the following SQL statements correctly finds customers with "son" anywhere in their last name?**

A) `SELECT * FROM customers WHERE last_name LIKE "%son%";` ✅
B) `SELECT * FROM customers WHERE last_name = "*son*";`
C) `SELECT * FROM customers WHERE last_name CONTAINS "son";`
D) `SELECT * FROM customers WHERE last_name INCLUDES "son";`

**✅ Answer: A**
**Explanation:**
`LIKE "%son%"` matches any string that contains "son".

- B) uses equality and wildcards incorrectly.
- C) `CONTAINS` is not valid in SQL.
- D) `INCLUDES` is not a valid SQL keyword.

---

### **8. What does this SQL statement do?**

```sql
UPDATE products SET price = price * 1.10 WHERE discontinued = 0;
```

A) Deletes all active products
B) Increases price by 10% for active products ✅
C) Creates a new table of products
D) Selects products with a price increase

**✅ Answer: B**
**Explanation:**
It updates the price by multiplying by 1.10 (i.e., adding 10%) for all rows where `discontinued = 0`.

- A) would use `DELETE`.
- C) would use `CREATE TABLE`.
- D) would require `SELECT`.

---

### **9. Which of the following returns each department and the average salary of employees in that department?**

A)

```sql
SELECT department, COUNT(*) FROM employees GROUP BY department;
```

B)

````sql
SELECT department, AVG(salary) FROM employees GROUP BY department;
``` ✅
C)
```sql
SELECT department, SUM(salary) FROM employees;
````

D)

```sql
SELECT department, AVG(salary) FROM employees;
```

**✅ Answer: B**
**Explanation:**
`AVG(salary)` gives the average, and `GROUP BY department` groups employees by department.

- A) counts rows, doesn’t calculate average.
- C) sums salaries but doesn't group.
- D) averages without grouping, so only one row is returned.

---

### **10. What does the following SQL statement return?**

```sql
SELECT o.order_id, c.name FROM orders o JOIN customers c ON o.customer_id = c.id;
```

A) All customer names and their order IDs
B) Orders placed by customers, with customer names ✅
C) A list of orders not associated with any customer
D) Names of all customers

**✅ Answer: B**
**Explanation:**
This is an `INNER JOIN` — it returns matched records between orders and customers.

- A) is partially right but misleading — it's not _all_ customers.
- C) would require an `OUTER JOIN` with NULL checks.
- D) would query only the `customers` table.

---

### **11. Which SQL JOIN includes all rows from the first table and matches from the second?**

A) RIGHT JOIN
B) INNER JOIN
C) LEFT JOIN ✅
D) CROSS JOIN

**✅ Answer: C - LEFT JOIN**
**Explanation:**
`LEFT JOIN` keeps all rows from the left table, matching rows from the right, NULL if no match.

- A) is reversed (keeps all from the right).
- B) only includes matched rows.
- D) creates a Cartesian product.

---

### **12. Which JDBC URL correctly connects to a PostgreSQL database on localhost named `shop`?**

A) `jdbc:postgresql://localhost:5432/shop` ✅
B) `jdbc:mysql://localhost:5432/shop`
C) `jdbc:shop://localhost/postgres`
D) `postgres://localhost/shop`

**✅ Answer: A**
**Explanation:**
This is the correct JDBC format for PostgreSQL.

- B) is for MySQL.
- C) and D) are invalid or non-JDBC formats.

---

### **13. In Java, what is the purpose of `DriverManager.getConnection(...)`?**

A) It opens a new SQL window
B) It defines a new table
C) It creates a database
D) It connects to an existing database ✅

**✅ Answer: D**
**Explanation:**
`DriverManager.getConnection()` establishes a database connection.

- A) SQL windows are tools, not Java code.
- B) and C) involve SQL, not this Java method.

---

### **14. Which object in JDBC is used to execute parameterized SQL queries?**

A) Statement
B) PreparedStatement ✅
C) CallableStatement
D) QueryStatement

**✅ Answer: B - PreparedStatement**
**Explanation:**
`PreparedStatement` allows for parameters (`?`) and protects against SQL injection.

- A) `Statement` is for static SQL.
- C) `CallableStatement` is for stored procedures.
- D) `QueryStatement` doesn't exist.

---

### **15. What does the following Java code do?**

```java
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM orders");
```

A) Creates a table called orders
B) Inserts a new row into orders
C) Retrieves all rows from the orders table ✅
D) Deletes all orders

**✅ Answer: C**
**Explanation:**
`executeQuery` is used to _retrieve_ data (SELECT).

- A) would use `CREATE TABLE`.
- B) would use `INSERT INTO`.
- D) would use `DELETE`.

---

### **16. What is returned by the method `executeUpdate()` in JDBC?**

A) A `ResultSet`
B) A boolean
C) An integer indicating number of affected rows ✅
D) A database connection

**✅ Answer: C**
**Explanation:**
`executeUpdate()` returns the count of rows affected by `INSERT`, `UPDATE`, or `DELETE`.

- A) `ResultSet` comes from `executeQuery()`.
- B) not used here.
- D) irrelevant to this method.

---

### **17. What does the following loop do?**

```java
while (rs.next()) {
   String product = rs.getString("product_name");
   System.out.println(product);
}
```

A) Adds products to the database
B) Deletes products
C) Prints each product name from the result set ✅
D) Updates product names

**✅ Answer: C**
**Explanation:**
`rs.next()` loops through the result set and prints values from each row.

- A, B, D) would require `INSERT`, `DELETE`, or `UPDATE` logic.

---

### **18. Which of the following best describes this JDBC code?**

```java
String sql = "SELECT * FROM users WHERE age > ?";
PreparedStatement stmt = conn.prepareStatement(sql);
stmt.setInt(1, 25);
ResultSet rs = stmt.executeQuery();
```

A) It inserts users older than 25
B) It deletes users younger than 25
C) It selects users older than 25 ✅
D) It updates user age to 25

**✅ Answer: C**
**Explanation:**
It prepares a parameterized query, replaces `?` with 25, and runs a SELECT.

- A, B, D) would use different SQL keywords.

---
