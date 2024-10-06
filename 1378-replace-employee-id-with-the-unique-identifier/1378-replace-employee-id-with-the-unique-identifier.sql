select unique_id, name from Employees
left  outer join
EmployeeUNI
ON
Employees.id=EmployeeUNI.id