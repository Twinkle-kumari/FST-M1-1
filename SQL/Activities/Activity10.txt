Activity10

Select order_no, customer_id, salesman_id from orders where customer_id = (select customer_id from customers where customer_id=3007);

select * from orders where salesman_id IN (select salesman_id from salesman where salesman_city = 'Kharghar');

select customer_name, customer_id, grade from customers where grade > (select avg(grade) from salesman where salesman_city='Kharghar');

SELECT * FROM orders WHERE salesman_id IN( SELECT salesman_id FROM salesman
WHERE commission=( SELECT MAX(commission) FROM salesman));