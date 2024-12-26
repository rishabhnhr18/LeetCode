# Write your MySQL query statement below
select * from Cinema
where Cinema.description !='boring' 
and
Cinema.id in
(select Cinema.id from Cinema where id%2!=0)
order by Cinema.rating desc;