package ru.nikolaev.SocialMediaAPI.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import ru.nikolaev.SocialMediaAPI.exception.ItemNotFoundException;
import ru.nikolaev.SocialMediaAPI.model.entity.Person;
import ru.nikolaev.SocialMediaAPI.repository.PersonRepository;
import ru.nikolaev.SocialMediaAPI.service.PersonService;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public Person findById(Long personId) {

        return personRepository.findById(personId)
                .orElseThrow(() -> new ItemNotFoundException("Пользователь с таким id не найден", HttpStatus.BAD_REQUEST));
    }
}
