1. take all the employee data everyday at midnight. 
	a. setup quartz trigger + cron
	b. create a batch job
		i. has a reader
		ii. writer to table
2. take all the attendance and store it in database - same as above.
	a. either join the table , create a proper primary key.
	b. check the design pattern but create the prototype as soon as possible.
3. create another batch job , will calculate the employee and the corressponding salary and
store it in table.
	a. read seperatly 
	b. read together. 
		i. check if two reader class is allowed