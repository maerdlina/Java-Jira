package org.anki;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class Note {
    private String name;
    private String text;
    private Date dateStart;
    private Date dateEnd;
    private Boolean status;

    // name + text
    Note(String name, String text){
        this.name = name;
        this.text = text;
        status = false;
    }

    // name + text + dateStart
    Note(String name, String text, Date dateStart){
        this.name = name;
        this.text = text;
        this.dateStart = dateStart;
        status = false;
    }

    // name + text + dateStart + dateEnd
    Note(String name, String text, Date dateStart, Date dateEnd){
        this.name = name;
        this.text = text;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        status = false;
    }


    // Getters
    public String getName(){
        return this.name;
    }

    public String getText(){
        return this.text;
    }

    public Date getStartDate(){
        return this.dateStart;
    }

    public Date getEndDate(){
        return this.dateEnd;
    }

    public Boolean getStatus(){
        return this.status;
    }


    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setStartDate(Date startDate){
        this.dateStart = dateStart;
    }

    public void setEndDate(Date endDate){
        this.dateEnd = dateEnd;
    }

    public void changeStatus(Boolean status){
//        if(status == false) status = true;
//        else status = false;
        this.status = status;
    }

    public String toString(){
        return "name: " + name + " text: " + text + " status: " + status;
    }
}
