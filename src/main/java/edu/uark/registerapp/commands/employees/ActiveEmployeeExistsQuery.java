package edu.uark.registerapp.commands.employees;

import edu.uark.registerapp.models.repositories.EmployeeRepository;
import edu.uark.registerapp.commands.employees.EmployeeRepositoryImpl;

public class ActiveEmployeeExistsQuery{

    /**
     * Qureies the database of employees to see if requested employee exists
     * @param employeeName
     * @return Bool exists
     */
    public boolean employeeExists(String employeeName){
        boolean exists = false;
        EmployeeRepositoryImpl employRepository = new EmployeeRepositoryImpl();
        try{
            boolean isActive = false;
            exists = employRepository.existsByIsActive(isActive);
        }catch(Execption e){
            System.out.println("Active employee does not exist");
        }
        return exists;
    }

}