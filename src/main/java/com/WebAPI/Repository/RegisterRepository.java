package com.WebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.WebAPI.Model.LoginModel;

@Repository
public interface RegisterRepository extends JpaRepository<LoginModel,Long> {
}

