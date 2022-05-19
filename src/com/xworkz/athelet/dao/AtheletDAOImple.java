package com.xworkz.athelet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
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

		String insertQuery = "insert into athlete_details values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement sqlStatement = connection.prepareStatement(insertQuery);) {
			sqlStatement.setInt(1, dto.getId());
			sqlStatement.setString(2, dto.getName());
			sqlStatement.setString(3, dto.getSports());
			sqlStatement.setInt(4, dto.getNoOfGames());
			sqlStatement.setString(5, dto.getCountry());
			sqlStatement.setInt(6, dto.getLevel());
			sqlStatement.setString(7, dto.getOlympics());
			sqlStatement.setInt(8, dto.getAge());
			sqlStatement.setBoolean(9, dto.isRetired());
			sqlStatement.setString(10, dto.getCoachName());
			sqlStatement.setInt(11, dto.getTotalMedals());
			sqlStatement.setString(12, dto.getFit());
			sqlStatement.setDouble(13, dto.getSalary());

			int rowAffected = sqlStatement.executeUpdate();
			System.out.println(rowAffected);
			return rowAffected > 0 ? true : false;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean saveList(List<AtheletDTO> list) {
		Iterator<AtheletDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			save(iterator.next());
		}
		return false;
	}

	@Override
	public AtheletDTO findById(int id) {
		String sql = "Select*from athlete_details where id=?";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preState = connection.prepareStatement(sql)) {
			preState.setInt(1, id);
			ResultSet resultSet = preState.executeQuery();
			System.out.println(resultSet);

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String sport = resultSet.getString(3);
				int game = resultSet.getInt(4);
				String country = resultSet.getString(5);
				int level = resultSet.getInt(6);
				String olymp = resultSet.getString(7);
				int age = resultSet.getInt(8);
				boolean retired = resultSet.getBoolean(9);
				String couchName = resultSet.getString(10);
				int total = resultSet.getInt(11);
				String fit = resultSet.getString(12);
				double salary = resultSet.getDouble(13);

				AtheletDTO dto = new AtheletDTO(id1, name, sport, game, country, level, olymp, age, retired, couchName,
						total, fit, salary);
				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public AtheletDTO findByNameAndId(String name, int id) {
		String sql = "Select*From athlete_details where id=? AND name=?";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preState = connection.prepareStatement(sql)) {

			preState.setInt(1, id);
			preState.setString(2, name);
			ResultSet resultSet = preState.executeQuery();

			while (resultSet.next()) {
				int id2 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String sports = resultSet.getString(3);
				int game = resultSet.getInt(4);
				String country = resultSet.getString(5);
				int level = resultSet.getInt(6);
				String olymp = resultSet.getString(7);
				int age = resultSet.getInt(8);
				boolean retired = resultSet.getBoolean(9);
				String couchName = resultSet.getString(10);
				int total = resultSet.getInt(11);
				String fit = resultSet.getString(12);
				double salary = resultSet.getDouble(13);

				AtheletDTO dto = new AtheletDTO(id2, name1, sports, game, country, level, olymp, age, retired, couchName,
						total, fit, salary);
				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AtheletDTO findByNameAndSports(String name, String sports) {
		String sql = "Select*From athlete_details where name=? AND sports=?";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preState = connection.prepareStatement(sql)) {

			preState.setString(1, name);
			preState.setString(2, sports);
			ResultSet resultSet = preState.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name2 = resultSet.getString(2);
				String sport2 = resultSet.getString(3);
				int game = resultSet.getInt(4);
				String country = resultSet.getString(5);
				int level = resultSet.getInt(6);
				String olymp = resultSet.getString(7);
				int age = resultSet.getInt(8);
				boolean retired = resultSet.getBoolean(9);
				String capName = resultSet.getString(10);
				int total = resultSet.getInt(11);
				String fit = resultSet.getString(12);
				double salary = resultSet.getDouble(13);

				AtheletDTO dto = new AtheletDTO(id1, name2, sport2, game, country, level, olymp, age, retired, capName,
						total, fit, salary);
				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AtheletDTO findByNameAndCountryAndSports(String name, String country, String sports) {
		String sql = "Select*From athlete_details where name=? AND country=? AND sports=?";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preState = connection.prepareStatement(sql)) {

			preState.setString(1, name);
			preState.setString(2, country);
			preState.setString(3, sports);
			ResultSet resultSet = preState.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name4 = resultSet.getString(2);
				String sport4 = resultSet.getString(3);
				int game = resultSet.getInt(4);
				String country4 = resultSet.getString(5);
				int level = resultSet.getInt(6);
				String olymp = resultSet.getString(7);
				int age = resultSet.getInt(8);
				boolean retired = resultSet.getBoolean(9);
				String couchName = resultSet.getString(10);
				int total = resultSet.getInt(11);
				String fit = resultSet.getString(12);
				double salary = resultSet.getDouble(13);

				AtheletDTO dto = new AtheletDTO(id1, name4, sport4, game, country4, level, olymp, age, retired, couchName,
						total, fit, salary);
				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findCoachNameByNameAndCountryAndSports(String coachName, String name, String country, String sports) {
		String sql = "Select*From athlete_details where coachName=? AND name=? AND country=? AND sports=?";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preState = connection.prepareStatement(sql)) 
		{
			preState.setString(1, coachName);
			preState.setString(2, name);
			preState.setString(3, country);
			preState.setString(4, sports);
			ResultSet resultSet = preState.executeQuery();

			while (resultSet.next()) 
			{
				int id = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String sport = resultSet.getString(3);
				int game = resultSet.getInt(4);
				String country5 = resultSet.getString(5);
				int level = resultSet.getInt(6);
				String olymp = resultSet.getString(7);
				int age = resultSet.getInt(8);
				boolean retired = resultSet.getBoolean(9);
				String chName5 = resultSet.getString(10);
				int total = resultSet.getInt(11);
				String fit = resultSet.getString(12);
				double salary = resultSet.getDouble(13);

				String dto = new String(country);
				return dto;
			}

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String findNameById(String name,int id) 
	{
		String sql = "Select name,id  from athlete_details where name=? and id=?";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preState = connection.prepareStatement(sql)) 
		{
			preState.setString(1, name);
			preState.setInt(2, id);
			ResultSet resultSet = preState.executeQuery();
			System.out.println(resultSet);

			while (resultSet.next()) {
				String name6=resultSet.getString(1);
				int id6 = resultSet.getInt(2);
				
				System.out.println(String.format("%s, %s",name,id(1)));
				return  name;
			}

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int id(int id) {
		String sql = "Select id  from athlete_details where id=?";

		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preState = connection.prepareStatement(sql)) 
		{
			preState.setInt(1, id);
			ResultSet resultSet = preState.executeQuery();
			System.out.println(resultSet);

			while (resultSet.next()) 
			{
				int id1 = resultSet.getInt(1);
				return  id1;
			}

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return 1;
	
}
}
