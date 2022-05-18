package com.xworkz.athelet.dao;

import java.util.List;

import com.xworkz.athelet.dto.AtheletDTO;

public interface AtheletDAO {
	
	boolean save(AtheletDTO dto);
	boolean saveList(List<AtheletDTO>list);
	default AtheletDTO findById(int id){
		return null;
	}
	
	AtheletDTO findByNameAndId(String name,int id);
	
	AtheletDTO findByNameAndSports(String name,String sports);
	
	AtheletDTO findByNameAndCountryAndSports(String name,String country,String sports);
	
	

}
