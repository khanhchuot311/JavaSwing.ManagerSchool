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
public class classes {
    private int class_id;
    private int subject_id;
    private int teacher_id;
    private int class_code;
    private String class_name;
    private String date_from;
    private String date_to;

    public classes() {
    }

    public classes(int class_id, int subject_id, int teacher_id, int class_code, String class_name, String date_from, String date_to) {
        this.class_id = class_id;
        this.subject_id = subject_id;
        this.teacher_id = teacher_id;
        this.class_code = class_code;
        this.class_name = class_name;
        this.date_from = date_from;
        this.date_to = date_to;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getClass_code() {
        return class_code;
    }

    public void setClass_code(int class_code) {
        this.class_code = class_code;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
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
