package ru.nikolaev.SocialMediaAPI.service;

import ru.nikolaev.SocialMediaAPI.model.entity.Person;

public interface PersonService {
    Person findById(Long userId);
}
