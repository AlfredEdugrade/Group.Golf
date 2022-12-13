package golf.golf_group.Classes;

import javax.persistence.*;

@Entity
@Table(name = "adress")

public class Address {


    //Properties
    @Id
    @Column(name = "adress_id")
    private int adressId;

    @Column(name = "adress")
    private String adress;

    @Column(name = "zip")
    private int zip;

    //Foreign key:
    @Column(name = "city_id")
    private int CityId;

    //Constructor

    public Address () {

    }

    public Address(int adressId, String adress, int zip, int cityId) {
        this.adressId = adressId;
        this.adress = adress;
        this.zip = zip;
        CityId = cityId;
    }


    // Methods


    //SET AND GET METHODS
    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
