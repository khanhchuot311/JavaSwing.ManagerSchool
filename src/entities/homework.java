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
public class homework {
    private int homework_id;
    private int student_id;
    private String date_created;
    private String homwork_content;
    private String grade;
    private String other_homwork_details;

    public homework() {
    }

    public homework(int homework_id, int student_id, String date_created, String homwork_content, String grade, String other_homwork_details) {
        this.homework_id = homework_id;
        this.student_id = student_id;
        this.date_created = date_created;
        this.homwork_content = homwork_content;
        this.grade = grade;
        this.other_homwork_details = other_homwork_details;
    }

    public int getHomework_id() {
        return homework_id;
    }

    public void setHomework_id(int homework_id) {
        this.homework_id = homework_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getHomwork_content() {
        return homwork_content;
    }

    public void setHomwork_content(String homwork_content) {
        this.homwork_content = homwork_content;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getOther_homwork_details() {
        return other_homwork_details;
    }

    public void setOther_homwork_details(String other_homwork_details) {
        this.other_homwork_details = other_homwork_details;
    }
    
}
