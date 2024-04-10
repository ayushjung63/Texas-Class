package dao;

import execption.NotFoundExeception;
import model.Person;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// this class is used access of Person Table
public class PersonDAO {
    public void save(Person person)  {
        String insertQuery="insert into person(name,address) values(?, ?)";
        Connection connection = DBConnection.getConnection(); // getting db connection

        // using prepared statement so that values can be set in query
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, person.getName()); // setting name in query
            preparedStatement.setString(2, person.getAddress()); // setting address in query
            preparedStatement.executeUpdate();  // executing insert query
            connection.close();  // closing db connection
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Person>  findAll(){
        String selectQuery="select * from person";
        Connection connection = DBConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            List<Person> personList=new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                Person person=new Person(id,name,address);
                personList.add(person);
            }
            connection.close();
            return personList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Person findById(Integer id){
        String selectQuery="select * from person where id = "+id;
        Connection connection = DBConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            if (resultSet.next()){
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                Person person=new Person(id,name,address);
                return person;
            }
            throw new NotFoundExeception("Person not found with id: "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void updateNameById(Integer id, String updatedName){
        String updateQuery="update person set name = ? where id = ?";
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,updatedName);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
