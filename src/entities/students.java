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
public class students {
    private int student_id;
    private String gender;
    private String first_name;
    private String midle_name;
    private String last_name;
    private String date_of_bith;
    private String other_student_details;

    public students() {
    }

    public students(int student_id, String gender, String first_name, String midle_name, String last_name, String date_of_bith, String other_student_details) {
        this.student_id = student_id;
        this.gender = gender;
        this.first_name = first_name;
        this.midle_name = midle_name;
        this.last_name = last_name;
        this.date_of_bith = date_of_bith;
        this.other_student_details = other_student_details;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public String getDate_of_bith() {
        return date_of_bith;
    }

    public void setDate_of_bith(String date_of_bith) {
        this.date_of_bith = date_of_bith;
    }

    public String getOther_student_details() {
        return other_student_details;
    }

    public void setOther_student_details(String other_student_details) {
        this.other_student_details = other_student_details;
    }
    
}
