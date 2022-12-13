package golf.golf_group.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "postal_adress")

public class PostalAddress {

    //Properties
    @Id
    @Column(name = "city_id")
    private int employeeId;

    //Foreign KEY:
    @Column(name = "country_id")
    private int countryId;

    @Column(name = "city")
    private String city;

    //Constructor

    public PostalAddress() {

    }

    public PostalAddress(int employeeId, int countryId, String city) {
        this.employeeId = employeeId;
        this.countryId = countryId;
        this.city = city;
    }

    //METHODS


    //GETTER AND SETTER METHODS


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
