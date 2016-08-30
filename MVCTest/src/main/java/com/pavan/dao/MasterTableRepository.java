package com.pavan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.pavan.models.MasterTable;

public interface MasterTableRepository extends CrudRepository<MasterTable, Long> {

	@Query("From MasterTable group by town")
    public Iterable<MasterTable> findByTown();
	
	
	@Query("From MasterTable where town = :town")
	public Iterable<MasterTable> findRetailerByTown(@Param("town") String town);
	
	
}
