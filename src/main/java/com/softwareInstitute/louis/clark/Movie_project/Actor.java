package com.softwareInstitute.louis.clark.Movie_project;

import javax.persistence.*;

@Entity
public class Actor {
    //////////////////////attributes////////
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name = "actor_id")
    private int actor_id;
    private String first_name;
    private String last_name;
    //////////////////////constructrs/////////
    public Actor(){
    }
    public Actor(String first_name,String last_name){
        this.first_name=first_name;
        this.last_name=last_name;
        //this.actor_id=actor_id;
    }


    //////////////////////methods////////////
    public String getActorFirstName(){
        return first_name;
    }
    public void setActorFirstName(String first_name){
        this.first_name = first_name;
    }
    public String getActorSurname(){
        return last_name;
    }
    public void setActorSurname(String last_name){
        this.last_name = last_name;
    }

    public int getActorId(){
        return actor_id;
    }

    public void setActor_id(int actor_id){
        this.actor_id = actor_id;
    }
}
