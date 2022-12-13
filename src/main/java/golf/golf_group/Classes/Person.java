package golf.golf_group.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")

public class Person {

    //Properties
    @Id
    @Column(name = "person_id")
    private int personID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "e_mail")
    private String eMail;

    //Foreign KEY
    @Column(name = "adress_id")
    private int addressId;

    //Constructor

    public Person() {

    }
    public Person(int personID, String firstName, String lastName, String nickName, String eMail, int addressId) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.eMail = eMail;
        this.addressId = addressId;
    }

    //METHODS


    //GETTER AND SETTER METHODS

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
