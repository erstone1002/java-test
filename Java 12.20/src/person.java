
public class person {
	
	static String firstName;
	static String lastName;
	static int age;
	static String attendance;
	static String level;
	static String email;
	static String location;
	
	public person() {
		
	}
	
	public person(String firstName, String lastName, int age, String attendance, String level, String email, String location) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.attendance = attendance;
		this.level = level;
		this.email = email;
		this.location = location;
				
	}
	
	public void assignHomework(String homework) {
		System.out.println("Hey Eliza please do this work: " + homework);
	}
	
	public int birthday() {
		int newAge = age + 1;
		setAge(1);
		return newAge;
	}
	
	public void setAge(int year) {
		this.age += year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person Eliza = new person("Eliza", "Stone", 25,"Here everyday", "Some", "erstone@ncsu.edu", "Charlotte");
		Eliza.assignHomework("Practice Problems");
		System.out.println(Eliza.birthday());
		System.out.println(Eliza.age);

	}

}
