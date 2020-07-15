/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Admin
 */
public class teachers {
    private int teacher_id;
    private int school_id;
    private String gender;
    private String first_name;
    private String midle_name;
    private String last_name;
    private String other_teacher_details;

    public teachers() {
    }

    public teachers(int teacher_id, int school_id, String gender, String first_name, String midle_name, String last_name, String other_teacher_details) {
        this.teacher_id = teacher_id;
        this.school_id = school_id;
        this.gender = gender;
        this.first_name = first_name;
        this.midle_name = midle_name;
        this.last_name = last_name;
        this.other_teacher_details = other_teacher_details;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
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

    public String getOther_teacher_details() {
        return other_teacher_details;
    }

    public void setOther_teacher_details(String other_teacher_details) {
        this.other_teacher_details = other_teacher_details;
    }
    

}
