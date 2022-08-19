package collections3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main (String[] args) {
		
		ArrayList <Employee> emps = new ArrayList <> ();
		emps.add(new Employee("renga", 25, 234, 20000));
		emps.add(new Employee("Siva", 26, 678, 90000));
		emps.add(new Employee("Akash", 21, 264, 80000));
		emps.add(new Employee("Athee", 28, 673, 92000));
		emps.add(new Employee("Raj", 25, 234, 10000));
		emps.add(new Employee("Durai", 26, 678, 50000));
		
		List <String> nm = emps.stream().filter(x -> x.getSalary() > 60000 && x.getSalary()<90000).map(y->y.getName()).collect(Collectors.toList());
		/* for(String n: nm) {
			System.out.println(n);
		} */
		long mn = emps.stream().filter(a -> a.getSalary() >= 90000 && a.getSalary() <= 92000).count();
		nm.forEach(a->System.out.println(a));
		System.out.println(mn);
	}
}
class Employee {
	
	private String name;
	private int age;
	private int id;
	private int salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public Employee (String name, int age, int id, int salary) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	public String toString() {
		return "Name = " + name + ", Age = " + age + ", ID = " + id + ", Salary = " + salary;
	}
}
