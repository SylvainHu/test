package tutorial;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People person1 = new People();
		People person2 = new People();

		person1.setAge(25);
		person1.setFirstName("Hi");
		person1.setLastName("1");
		person1.setStudent(false);
		person1.printStates();

		person2.setAge(22);
		person2.setFirstName("Hi");
		person2.setLastName("2");
		person2.setStudent(true);
		person2.printStates();
	}

}
