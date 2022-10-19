--ANSI Standarts
--Select		;		"--" is the command line
--Select * from Customers		;		this shows all categories

Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'London'		--brings all customers with all columns but shows the city London ones
--where		;		means filter

--case insensitive
SeLect * fROm Products where CategoryID=1 and UnitPrice>10

select * from Products order by ProductName		--order by		;		does the sorting by ProductName

select * from Products order by CategoryID,ProductName

select * from Products order by UnitPrice asc		--ascending
select * from Products order by UnitPrice desc		--descensing

select * from Products where CategoryID=1 order by UnitPrice desc

Select count(*) from Products		--counts all rows in the Products
Select count(*) Adet from Products where CategoryID=2

select categoryID,count(*) Adet from Products group by CategoryID

select categoryID,count(*) Adet from Products where UnitPrice>20 group by CategoryID having count(*)<10

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories		--inner join		;		Shows the equals in Products.CategoryID and Categories.CategoryID
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

--DTO: Data Transformation Object

Select * from Products p left join [Order Details] od		--left join		;		shows the ones that exist on the left, those not on the right
on p.ProductID = od.ProductID								--right join		;		shows the ones that exist on the right, those not on the left

Select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

Select * from Products p inner join [Order Details] od		
on p.ProductID = od.ProductID
inner join Orders o		--to join more than one table
on o.OrderID = od.OrderID

