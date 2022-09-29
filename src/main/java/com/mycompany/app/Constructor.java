package opps;

public class Constructor {
	String name;
	int id;
	 int salary;

	Constructor(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Constructor c1 = new Constructor("jaimini", 101,10000);
		Constructor c2 = new Constructor("niki", 102,34343);
		Constructor c3 = new Constructor("riddhi", 103,2132);
		

		System.out.println(c1.name + " " + c1.id + " " +c1.salary);
		System.out.println(c2.name + " " + c2.id + " " +c2.salary);
		System.out.println(c3.name + " " + c3.id + " " +c3.salary);

	}

}
