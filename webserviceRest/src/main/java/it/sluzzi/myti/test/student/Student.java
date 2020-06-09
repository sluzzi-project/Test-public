package it.sluzzi.myti.test.student;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Student {
	
	private String firstname = "";
	private String lastname = "";
	private String birthdate = "";
	private String grades = "";
	
	public Student(){
	 //costruttore vuoto	
	}
	
	public Student(String firstname, String lastname, String birthdate, String grades) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.grades = grades;
	}

	//metodi di set/get
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

	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	//Supponiamo che il formato string della data di nascita yyyy/MM/dd
	public int getAge() {
		Date d1 = null; 
		int age = 0;
		if(this.getBirthdate() == null)
			return age;
		
		try {
			d1 = format.parse(this.getBirthdate());
		    Calendar a = getCalendar(d1);
		    Calendar b = getCalendar(new Date());
		    age = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
		    //controllo anche il mese e il giorno per definire esattamente l'età
		    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
		        (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
		    	age--;
		    }
		  } catch (Exception e) {
				System.out.println("Eccezione di formattazione della data di compleanno!");
		 }
		return age;
	}

	//Metodo di servizio per ricavare la data
	public static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance(Locale.ITALY);
	    cal.setTime(date);
	    return cal;
	}
	
	//Suppongo che il formato string del campo grades sia = "matematica:70;informatica:80;italiano:60;storia:75;biologia:67";
	public double getAvg_grade(){
		   double avg=0;
		   if(this.getGrades() == null)
			   return 0;

		   if(this.getGrades().indexOf(":") <= 0)
			   return 0;

		    double total = 0;
		    String[] arrayGrades = this.getGrades().split(";");
		    int totSubjects = arrayGrades.length;
		    for(int i=0; i < arrayGrades.length; i++){
		    	String[] arraysubject = arrayGrades[i].split(":");
		    	total = total + Integer.parseInt(arraysubject[1]);
		    }
		    
		    avg = total / totSubjects;
		 
		    return avg;
	}
	

	public static void main(String[] args) {
		Student stu = new Student("Saverio","Luzzi","1976/02/13","matematica:70;informatica:80;italiano:63;storia:75;biologia:67");
		System.out.println("Informazioni sullo studente " + stu.getFirstname()+ " " + stu.getLastname() + " : ");
		System.out.println("Età : " + stu.getAge() + " anni.");
		System.out.println("Media del grado di istruzione : " + stu.getAvg_grade());
	}

}
