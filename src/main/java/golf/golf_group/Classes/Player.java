package golf.golf_group.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")

public class Player {

    //Properties

    //Primary KEY:
    @Id
    @Column(name = "player_id")
    private int playerId;

    //Foreign KEY:
    @Column(name = "person_id")
    private int personId;

    //Foreign KEY:
    @Column(name = "game_id")
    private int gameId;

    //Foreign KEY :
    @Column(name = "team_id")
    private int teamId;

    //Constructor

    public Player() {

    }

    public Player(int playerId, int personId, int gameId, int teamId) {
        this.playerId = playerId;
        this.personId = personId;
        this.gameId = gameId;
        this.teamId = teamId;
    }

    //METHODS


    //GETTER AND SETTER METHODS


    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
