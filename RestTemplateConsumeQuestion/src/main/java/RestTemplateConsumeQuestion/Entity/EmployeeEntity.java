package RestTemplateConsumeQuestion.Entity;


import org.springframework.data.mongodb.core.mapping.Document;


@Document("Data Of API Consumed Using RestTemplate")
public class EmployeeEntity {
	
	private int id;
	private String employee_name;
	private int employee_salary;	
	private int employee_age;	
	private String profile_image;

	public EmployeeEntity(int id, String employee_name, int employee_salary, int employee_age, String profile_image) {
		this.id = id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.employee_age = employee_age;
		this.profile_image = profile_image;
	}
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getemployee_name() {
		return employee_name;
	}
	public void setemployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getemployee_salary() {
		return employee_salary;
	}
	public void setemployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}
	public int getemployee_age() {
		return employee_age;
	}
	public void setemployee_age(int employee_age) {
		this.employee_age = employee_age;
	}
	public String getprofile_image() {
		return profile_image;
	}
	public void setprofile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	
	public EmployeeEntity() {
		
	}
}