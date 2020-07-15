/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Hoang Quyet
 */
public class parents {
    private int parent_id;
    private String gender;
    private String first_name;
    private String midle_name;
    private String last_name;
    private String other_parent_details;

    public parents() {
    }

    public parents(int parent_id, String gender, String first_name, String midle_name, String last_name, String other_parent_details) {
        this.parent_id = parent_id;
        this.gender = gender;
        this.first_name = first_name;
        this.midle_name = midle_name;
        this.last_name = last_name;
        this.other_parent_details = other_parent_details;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMidle_name() {
        return midle_name;
    }

    public void setMidle_name(String midle_name) {
        this.midle_name = midle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getOther_parent_details() {
        return other_parent_details;
    }

    public void setOther_parent_details(String other_parent_details) {
        this.other_parent_details = other_parent_details;
    }
    
}
