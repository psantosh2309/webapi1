package com.WebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.WebAPI.Model.ApplyJobs;

@Repository
public interface ApplyJobRepository extends JpaRepository<ApplyJobs, Long> {

	ApplyJobs save(ApplyJobs applyJobs);

	 //public void deleteStudent(int id);
//    @Query("delete y from ApplyJobs  y where y.id=:n ")
//	public void deleteData( @Param("n")Long id);

	public void deleteById(Long id);

	 //public void deletedata(int id);



	

}
