package RestTemplateConsumeQuestion.Repsostiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import RestTemplateConsumeQuestion.Entity.EmployeeEntity;


public interface Repository extends MongoRepository<EmployeeEntity, Integer> {

}