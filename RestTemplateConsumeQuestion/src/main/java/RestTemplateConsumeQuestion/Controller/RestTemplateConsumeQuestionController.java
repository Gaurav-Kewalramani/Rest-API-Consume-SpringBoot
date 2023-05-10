package RestTemplateConsumeQuestion.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import RestTemplateConsumeQuestion.Entity.EmployeeEntity;
import RestTemplateConsumeQuestion.Model.Response;
import RestTemplateConsumeQuestion.Service.Services;


@RestController
public class RestTemplateConsumeQuestionController {

	@Autowired
	Services services;
	
	@PostMapping("/store")
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee) {
		return services.addEmployee(employee);
	}
	
	@GetMapping("/consume")
	public Response getEmployeeDetail(){		
		return services.getEmployeeDataFromThirdAPI();
	}
	

}
