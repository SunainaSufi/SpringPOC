package learning.spring.controller;

/**
 * Created by Ano on 6/21/2020.
 */


import learning.spring.Model.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class EmpDetails {
        private static List<Employee> empDetails = new ArrayList<Employee>();

        static{
            empDetails.add(new Employee("1","EQSUser1",90000));
            empDetails.add(new Employee("2","EQSUser2",200000));
            empDetails.add(new Employee("3","EQSUser3",9000));
            empDetails.add(new Employee("4","EQSUser4",900));
            empDetails.add(new Employee("5","EQSUser5",9000));
            empDetails.add(new Employee("6","EQSUser6",9000));
            empDetails.add(new Employee("7","EQSUser7",9000));
            empDetails.add(new Employee("8","EQSUser8",9000));

        }

        @RequestMapping("/getAllDetails")
        public List<Employee> getEmployees() {
            return empDetails;
        }

    }
