package com.xworkz.athelet.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.athelet.dao.AtheletDAO;
import com.xworkz.athelet.dao.AtheletDAOImple;
import com.xworkz.athelet.dto.AtheletDTO;


public class AtheletRunner {

	public static void main(String[] args) 
	{
		AtheletDTO dto = new AtheletDTO(1,"Balbir Singh","hockey",3,"India",2,"ioc",20,true,"singh",3,"fit",26000.0);

		AtheletDTO dto1 = new AtheletDTO(2,"Khashaba","weight wrestling",4,"India",1,"ioc",21,true,"Jadhav",3,"fit",36000.0);

		AtheletDTO dto2 = new AtheletDTO(3," Karnam","weightlifting",3,"India",2,"ioc",22,true,"singh",4,"fit",27000.0);
		
		List<AtheletDTO> list = new ArrayList();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);

		AtheletDAO dao = new AtheletDAOImple();
		dao.saveList(list);

		AtheletDTO idDTO = dao.findById(5);
		System.out.println(idDTO);

		AtheletDTO nameAndId = dao.findByNameAndId("Balbir Singh", 1);
		System.out.println(nameAndId);

		AtheletDTO nameAndSport = dao.findByNameAndSports("Khashaba", "weight wrestling");
		System.out.println(nameAndSport);

		AtheletDTO nameAndCouAndSpt = dao.findByNameAndCountryAndSports(" Karnam", "India", "weightlifting");
		System.out.println(nameAndCouAndSpt);

		String cout = dao.findCoachNameByNameAndCountryAndSports("singh", "Balbir Singh", "India", "hockey");
		System.out.println(cout);
		
		String nameLast=dao.findNameById("Khashaba", 2);
		System.out.println(nameLast);
		
		int id1=dao.id(2);
		System.out.println(id1);
	}

	}


