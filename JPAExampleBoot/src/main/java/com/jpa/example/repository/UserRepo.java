package com.jpa.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.example.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	/*
	 * Spring Boot JPA Query Support Based on the provided search results, Spring
	 * Data JPA supports the following keywords for query methods:
	 * 
	 * Equality Condition Keywords: findBy (e.g., findByAge(int age)) readBy (e.g.,
	 * readByAge(int age)) queryBy (e.g., queryByAge(int age)) getBy (e.g.,
	 * getByAge(int age)) Counting Keywords: countBy (e.g., countByAge(int age))
	 * Logical Operators: And (e.g., findByAgeAndName(int age, String name)) Or
	 * (e.g., findByAgeOrName(int age, String name)) Sorting Keywords: findFirst
	 * (e.g., findFirstByAge(int age)) findTop (e.g., findTop3ByAge()) LIKE Query
	 * Keywords: Containing (e.g., findByTitleContaining(String title)) Contains
	 * (e.g., findByTitleContains(String title)) IsContaining (e.g.,
	 * findByTitleIsContaining(String title)) Like (e.g., findByTitleLike(String
	 * title)) StartsWith (e.g., findByTitleStartsWith(String title)) EndsWith
	 * (e.g., findByTitleEndsWith(String title)) Not Keywords: NotContaining (e.g.,
	 * findByRatingNotContaining(String rating)) NotContains (e.g.,
	 * findByTitleNotContains(String title)) NotLike (e.g.,
	 * findByTitleNotLike(String title))
	 */
	public List<User> findByName(String name);

	public List<User> findByCity(String city);

	public List<User> findByNameAndCity(String name, String city);

}
