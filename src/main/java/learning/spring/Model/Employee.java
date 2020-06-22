package learning.spring.Model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.stereotype.Component;

/**
 * Created by Ano on 6/21/2020.
 */
/*@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)*/
public class Employee {
    String id;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;

    public Employee(String id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
