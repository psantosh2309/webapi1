package com.WebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.WebAPI.Model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Long>{
	LoginModel findByUsernameAndPassword(String username, String password);

	

//	LoginModel findByUsernameAndPassword(LoginModel user);

	

}
