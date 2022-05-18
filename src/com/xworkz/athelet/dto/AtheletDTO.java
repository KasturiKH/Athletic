package com.xworkz.athelet.dto;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class AtheletDTO implements Serializable {
	
	private int id;
	private String name;
	private String sports;
	private int noOfGames;
	private String country;
	private int level;
	private String olympics;
	private int age;
	private boolean retired;
	private String coachName;
	private int totalMedals;
	private String fit;
	private double salary;

}
