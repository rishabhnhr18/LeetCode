# Write your MySQL query statement below
SELECT DISTINCT w2.id AS "Id"
FROM Weather w1
cross JOIN Weather w2
where datediff(w2.recordDate, w1.recordDate)=1
and
w2.temperature > w1.temperature;