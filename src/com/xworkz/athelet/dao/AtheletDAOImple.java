package com.xworkz.athelet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.xworkz.athelet.connection.DBUConnection;
import com.xworkz.athelet.dto.AtheletDTO;


public class AtheletDAOImple implements AtheletDAO {
	
	@Override
	public boolean save(AtheletDTO dto) {
		System.out.println("saving".concat(dto.toString()));
		
		String insertQuery="insert into athlete_details values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DBUConnection.getConnection();
			PreparedStatement sqlStatement=	connection.prepareStatement(insertQuery);)
		{
			sqlStatement.setInt(1,dto.getId());
			sqlStatement.setString(2,dto.getName());
			sqlStatement.setString(3,dto.getSports());
			sqlStatement.setInt(4,dto.getNoOfGames());
			sqlStatement.setString(5,dto.getCountry());
			sqlStatement.setInt(6,dto.getLevel());
			sqlStatement.setString(7,dto.getOlympics());
			sqlStatement.setInt(8,dto.getAge());
			sqlStatement.setInt(9,dto.getRetired());
			sqlStatement.setString(10,dto.getCoachName());
			sqlStatement.setInt(11,dto.getTotalMedals());
			sqlStatement.setString(12,dto.getFit());
			sqlStatement.setDouble(13,dto.getSalary());
			
			int rowAffected=sqlStatement.executeUpdate();
			System.out.println(rowAffected);
			return rowAffected>0? true:false;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean saveList(List<AtheletDTO>list) {
		Iterator<AtheletDTO> iterator=list.iterator();
		while(iterator.hasNext()) {
		save(iterator.next());
		}
		return false;
	}

	@Override
	public AtheletDTO findById(int id) {
		String sql="Select*from athlete_details where id=?";
		
		try(Connection connection=DBUConnection.getConnection();
				PreparedStatement preState =connection.prepareStatement(sql)){
			preState.setInt(0, id);
			ResultSet resultSet=preState.executeQuery();
			System.out.println(resultSet);
			while(resultSet.next()) {
				int id=resultSet.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public AtheletDTO findByNameAndId(String name, int id) {
		
		return null;
	}

	@Override
	public AtheletDTO findByNameAndSports(String name, String sports) {
		
		return null;
	}

	@Override
	public AtheletDTO findByNameAndCountryAndSports(String name, String country, String sports) {
		
		return null;
	
	
}
}
