package RestTemplateConsumeQuestion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import RestTemplateConsumeQuestion.Entity.EmployeeEntity;
import RestTemplateConsumeQuestion.Model.Response;
import RestTemplateConsumeQuestion.Repsostiory.Repository;

@Service
public class Services implements IServices {
	
	@Override
	public Response getEmployeeDataFromThirdAPI() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Response> resp = restTemplate.getForEntity("http://dummy.restapiexample.com/api/v1/employee/1", Response.class);	
		return resp.getBody();
	}

	
	@Autowired
	private Repository repository;
	public EmployeeEntity addEmployee(EmployeeEntity employee) {
		return repository.save(employee);
	}


	
}
   