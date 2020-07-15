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
public class reports {
    private int report_id;
    private int student_id;
    private String date_created;
    private String report_content;
    private String teacher_content;
    private String other_report_details;

    public reports() {
    }

    public reports(int report_id, int student_id, String date_created, String report_content, String teacher_content, String other_report_details) {
        this.report_id = report_id;
        this.student_id = student_id;
        this.date_created = date_created;
        this.report_content = report_content;
        this.teacher_content = teacher_content;
        this.other_report_details = other_report_details;
    }

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
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

    public String getReport_content() {
        return report_content;
    }

    public void setReport_content(String report_content) {
        this.report_content = report_content;
    }

    public String getTeacher_content() {
        return teacher_content;
    }

    public void setTeacher_content(String teacher_content) {
        this.teacher_content = teacher_content;
    }

    public String getOther_report_details() {
        return other_report_details;
    }

    public void setOther_report_details(String other_report_details) {
        this.other_report_details = other_report_details;
    }
}
