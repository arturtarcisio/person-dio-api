package one.digitalinnovation.personapi.services;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

//    @Autowired
//    public PersonService(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Person created with id: " + savedPerson.getId())
                .build();
    }


}
