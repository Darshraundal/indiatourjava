package com.indiatour.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indiatour.etour.modal.Booking;


@Repository
public interface Bookingrepo extends JpaRepository<Booking, Integer> {
	
	@Query(value = "from Booking b where Cust_Id=?1")
	public List<Booking> findBybookingid(int customerid);
	
}
