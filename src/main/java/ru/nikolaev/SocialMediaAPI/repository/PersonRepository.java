package ru.nikolaev.SocialMediaAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikolaev.SocialMediaAPI.model.entity.Person;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsernameAndDisabledAtIsNull(String username);
}
