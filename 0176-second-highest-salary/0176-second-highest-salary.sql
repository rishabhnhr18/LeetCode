# Write your MySQL query statement below

Select
Case
when (Select count(distinct Employee.salary) from Employee)>1 THEN
(
    select distinct Employee.salary as "SecondHighestSalary"
    from Employee
    order by Employee.salary desc
    limit 1 offset 1
)
else NULL
end as SecondHighestSalary