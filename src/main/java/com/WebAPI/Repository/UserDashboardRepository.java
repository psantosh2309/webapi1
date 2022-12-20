package com.WebAPI.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WebAPI.Model.LoginModel;
import com.WebAPI.Model.UserDashboard;

@Repository
public interface UserDashboardRepository  extends JpaRepository<UserDashboard, Long>{

	List<UserDashboard> save(LoginModel loginmodel);



	

}
