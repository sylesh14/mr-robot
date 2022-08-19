package collections3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Candidates {
	public static void main (String[] args) {
		
	ArrayList <CDetails> cd = new ArrayList <> ();
	cd.add(new CDetails("Male", "Rengadurai", 26, 346, "civil"));
	cd.add(new CDetails("Female", "Ayshu", 23, 475, "civil"));
	cd.add(new CDetails("Male", "Akash", 22, 987, "mech"));
	cd.add(new CDetails("Female", "Vaishu", 23, 615, "civil"));
	cd.add(new CDetails("Male", "Siva", 26, 175, "mech"));
	cd.add(new CDetails("Male", "rengaraj", 25, 490, "mech"));
	cd.add(new CDetails("Female", "Gowri", 23, 275, "civil"));
	cd.add(new CDetails("Male", "Gokul", 24, 671, "eee"));
	cd.add(new CDetails("Female", "Parveen", 23, 147, "IT"));
	cd.add(new CDetails("Male", "Rajesh", 22, 475, "mech"));
	cd.add(new CDetails("Female", "Ishu", 23, 366, "civil"));
	
	List <CDetails> gen = cd.stream().filter(a -> a.getGender().equals("Female")).collect(Collectors.toList());
	for(CDetails c: gen) {
		System.out.println(c);
	}
	List <String> gen1 = cd.stream().filter(a -> a.getGender().equals("Female")).map(b->b.getName()).collect(Collectors.toList());
	   for(String d: gen1) {
		   System.out.println(d);
	   }
	   Long gen2 = cd.stream().filter(a -> a.getGender().equals("Female")).count();
	   System.out.println(gen2);
	   
	   Map <Integer, CDetails> mc = cd.stream().filter(a -> a.getGender().equalsIgnoreCase("Male")).collect(Collectors.toMap(i->i.getId(), j->j));
	   
	   for(Integer k: mc.keySet()) {
		   System.out.println(mc.get(k));
	   }
	   mc.keySet().forEach(c -> System.out.println(mc.get(c)));
	   
	   /* mc.keySet().forEach(c -> System.out.println(mc.get(c).getAge())); */
	}
}
class CDetails {
	
	private String gender;
	private String name;
	private int age;
	private int id;
	private String degree;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public CDetails(String gender, String name, int age, int id, String degree) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.id = id;
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "CDetails [gender=" + gender + ", name=" + name + ", age=" + age + ", id=" + id + ", degree=" + degree
				+ "]";
	}
}