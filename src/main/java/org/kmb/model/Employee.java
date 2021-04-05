package org.kmb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity(name = "employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "Name is required") 
	@Size(min = 3, message = "Name must be at least 3 characters long")
	@NotEmpty(message = "Name is required")
	private String name;
	
	@Size(min = 18, max = 60, message = "age must between 22 to 60 ")
	private int age;
	
	@Size(min = 3000, message = "salary must be at least 3000 characters long")
	private int salary;
	
	//private long timestamp;

    public Employee() {
       // this.timestamp = System.currentTimeMillis();
    }
    
    
    
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

}