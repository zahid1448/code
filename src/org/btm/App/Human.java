package org.btm.App;
public class Human {
	
	private String name;
	private int age;
	
	void initilisation() {
		System.out.println("init method called");
	}
	
	void destroy() {
		System.out.println("destroy method called");
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
	
	public Human() {
		super();
		System.out.println("objct created");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

}