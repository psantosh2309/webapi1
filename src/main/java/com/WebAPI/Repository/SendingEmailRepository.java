package com.WebAPI.Repository;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WebAPI.Model.SendingEmail;

@Repository
public interface SendingEmailRepository extends  JpaRepository<SendingEmail, Long>{

	SendingEmail save(HttpServletRequest res);


	

}
