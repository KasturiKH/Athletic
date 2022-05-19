package com.xworkz.athelet.dao;

import java.util.List;

import com.xworkz.athelet.dto.AtheletDTO;

public interface AtheletDAO {
	
	boolean save(AtheletDTO dto);
	boolean saveList(List<AtheletDTO>list);
	default AtheletDTO findById(int id){
		return null;
	}
	
	default AtheletDTO findByNameAndId(String name, int id) 
	{
		return null;
	}

	default AtheletDTO findByNameAndSports(String name, String sports) 
	{
		return null;
	}
	
	default String findCoachNameByNameAndCountryAndSports(String coachName, String name, String country,
			String sports) 
	{
		return null;
	}

	default AtheletDTO findByNameAndCountryAndSports(String name, String country, String sports) 
	{
		return null;
	}

	default String findNameById(String name,int id) 
	{
		return null;
	}

	default int id(int id) 
	{
		return 0;
	
	

}
}
