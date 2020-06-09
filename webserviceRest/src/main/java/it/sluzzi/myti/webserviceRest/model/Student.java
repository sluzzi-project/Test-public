package it.sluzzi.myti.webserviceRest.model;

public class Student {
	
	private Integer id;
	private String firstname = "";
	private String lastname = "";
	private String birthdate = "";
	private String grades = "";
	
	public Student(){
	 //costruttore vuoto	
	}
	
	public Student(Integer id,String firstname, String lastname, String birthdate, String grades) {
		this.setId(id);
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.grades = grades;
	}

	//metodi di set/get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstname(){
	    return this.firstname;
	}

	public void setFirstname(String firstname){
	    this.firstname = firstname;
	}

	public String getLastname(){
	    return this.lastname;
	}

	public void setLastname(String lastname){
	    this.lastname = lastname;
	}

	public String getBirthdate(){
	    return this.birthdate;
	}

	public void setBirthdate(String birthdate){
	    this.birthdate = birthdate;
	}

	public String getGrades(){
	    return this.grades;
	}

	public void setGrades(String grades){
	    this.grades = grades;
	}

	@Override
    public String toString() {
        return "Student [firstname=" + this.firstname + ", "
        		+ "lastname=" + this.lastname + ", "
        		+ "birthdate=" + this.birthdate + ", "
        		+ "grades=" + this.grades + "]";
    }
	
}
