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
public class student_address {
    private int student_id;
    private int address_id;
    private String date_from;
    private String date_to;
    private String address_details;

    public student_address() {
    }

    public student_address(int student_id, int address_id, String date_from, String date_to, String address_details) {
        this.student_id = student_id;
        this.address_id = address_id;
        this.date_from = date_from;
        this.date_to = date_to;
        this.address_details = address_details;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
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

    public String getAddress_details() {
        return address_details;
    }

    public void setAddress_details(String address_details) {
        this.address_details = address_details;
    }
    
}
