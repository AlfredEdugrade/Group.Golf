package golf.golf_group.Classes;

import javax.persistence.*;

@Entity
@Table(name = "game")

public class Game {

    //Properties
    @Id
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "name")
    private String name;

    //Constructor

    public Game() {

    }

    public Game(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    //METHODS


    //GETTER AND SETTER METHODS

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
