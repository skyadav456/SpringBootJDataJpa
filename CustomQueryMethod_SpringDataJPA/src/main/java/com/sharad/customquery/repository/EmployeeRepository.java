package com.sharad.customquery.repository;

import com.sharad.customquery.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // fetch all employee
    @Query("SELECT e FROM Employee e")
    List<Employee> getAllEmployees();

    /* search by department*/
    @Query("""
           SELECT e FROM Employee e
           WHERE e.department = :department
        """)
    List<Employee> getByDepartment(String  department);

    /* Search by salary*/
    @Query("""
            Select e from Employee e
            where e.salary >:salary
            """)
    List<Employee> getBySalary(@Param("salary") Double salary);

    /* Search By name*/
    @Query("""
           SELECT e
           FROM Employee e
           WHERE e.name LIKE %:keyword%
           """)
    List<Employee> searchByName(
            @Param("keyword") String keyword);




}
