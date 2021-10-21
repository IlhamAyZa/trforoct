package lesson6COMP132;

public class Person {
	
	private String name;
	private String surname;
	private int age;
	private Gender gender;
	
	public Person(String name, String surname, int age, Gender gender) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		if(gender == Gender.FEMALE) {
			return name + " " + surname + " is " + age + " years aged woman";
		}
		else {
			return name + " " + surname + " is " + age + " years aged man";
		}
	}
	
	
}
