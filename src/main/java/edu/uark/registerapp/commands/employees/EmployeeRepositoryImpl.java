package edu.uark.registerapp.commands.employees;

import edu.uark.registerapp.models.entities.EmployeeEntity;
import edu.uark.registerapp.models.repositories.EmployeeRepository;

import java.util.Optional;
import java.util.UUID;
import java.sql.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/REGISTERAPP"; //unknown what the route to the actual database is to query

    //  Database credentials
    static final String USER = "username"; //need to find the actual username and password for
    static final String PASS = "password";

    @Override
    public boolean existsByIsActive(boolean isActive) {
        //query database to return status
        Connection conn = null;
        Statement stmt = null;
        try{
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //Execute a query
            stmt = conn.createStatement();

            String sql = "SELECT id, first, last, age FROM Registration";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs != null){ //if the query returns something then the user is active, set bool to true then return
                isActive = true;
            }
            rs.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
        return isActive;
    }

    @Override
    public boolean existsByEmployeeId(int employeeId) {
        return false;
    }

    @Override
    public <S extends EmployeeEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends EmployeeEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<EmployeeEntity> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public Iterable<EmployeeEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<EmployeeEntity> findAllById(Iterable<UUID> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(EmployeeEntity employeeEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends EmployeeEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional<EmployeeEntity> findByEmployeeId(int employeeId) {
        return Optional.empty();
    }
}
