package golf.golf_group.Classes;

import javax.persistence.*;


@Entity
@Table(name = "employee")

public class Employee {

    //Properties
    @Id
    @Column(name = "employee_id")
    private int employeeId;


    //This is a foregin key and we need to know how to declare it.
    @Column(name = "person_id")
    private String personId;

    //Constructor
    public Employee () {

    }

    public Employee(int employeeId, String personId) {
        this.employeeId = employeeId;
        this.personId = personId;
    }

    //METHODS


    //GETTER AND SETTER METHODS


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
