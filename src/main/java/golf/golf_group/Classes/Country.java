package golf.golf_group.Classes;

import javax.persistence.*;

@Entity
@Table(name = "country")

public class Country {

    @Column(name = "country_name")

    //Properties

    private String countryName;

    @Id
    @Column(name = "country_id")
    private int countryId;

    // Constructor

    public Country() {

    }

    public Country(String countryName, int countryId) {
        this.countryName = countryName;
        this.countryId = countryId;
    }


    //Methods



    //Join columns: Vi vet inte riktigt hur än men kommer falla på plats.

    //typ såhär för att joina olika klasser
@JoinColumn(name = "game_id")
    //Motsvarande joinen i SQL. För att kunna hämta det tillhörande properties genom Hibernate.
    //Fördjupning: vad händer när man deletar ett objekt. Ska man ta bort all information relaterat till objektet eller
    //ska man ta bort bara viss info?

    //Man kommer även att behöva fylla i oneToMany eller ManyToMany

    // Ett team har ett spel. Från teamets sida. Många olika spel till ett team. Många team kan spela samma spel.
    // Many to one team till spelet. Många olika lag kan ha ett och samma spel. ManyToOne.
    // Ett spel kan ha många olika team. OneToMany.
    // Alternativt tänk: Författare i förhållande till böcker.


    //GET AND SET METHODS

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
}
