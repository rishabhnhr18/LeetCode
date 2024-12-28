# Write your MySQL query statement below
select e.name as "Employee" from Employee e
Inner Join Employee m
ON
e.managerId=m.id
and
e.salary>m.salary;