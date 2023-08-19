package com.swiggy.food.register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiggy.food.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User findByEmailIDAndPassword(String emailID, String password);

}
