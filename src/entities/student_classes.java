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
public class student_classes {
    private int student_id;
    private int class_id;
    private String date_from;
    private String date_to;

    public student_classes() {
    }

    public student_classes(int student_id, int class_id, String date_from, String date_to) {
        this.student_id = student_id;
        this.class_id = class_id;
        this.date_from = date_from;
        this.date_to = date_to;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }
    
}
