package zadatak1;

public class Author {
	
	// atributi
	
	private String name;
	private String email;
	private char gender;
	
	// kontruktori
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	// getters and setters
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		
		return "Name: " + getName() + "\n" + "E-mail: " + getEmail() + "\n" + "Gender: " + getGender();
	}

}
