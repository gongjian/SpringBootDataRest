package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.domain.Person;

/*@RepositoryRestResource(path = "people")*/
public interface PersonRepository extends JpaRepository<Person, Long> {

	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	Person findByNameStartsWith(@Param("name") String name);

}
