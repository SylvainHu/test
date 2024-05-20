package tutorial;

public class People implements Person {
	int age = 0;
	String firstName = "John";
	String lastName = "Doe";
	boolean student = true;

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean isStudent() {
		return student;
	}

	@Override
	public void setStudent(boolean student) {
		this.student = student;
	}

	@Override
	public void printStates() {
		System.out.println("age:" + age + " firstname:" + firstName + " lastname:" + lastName + " student?" + student);
	}
}
