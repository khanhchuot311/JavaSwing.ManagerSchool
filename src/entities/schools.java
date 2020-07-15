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
public class schools {
    private int school_id;
    private int address_id;
    private String school_name;
    private String schools_spincipal;
    private String other_school_details;

    public schools() {
    }

    public schools(int school_id, int address_id, String school_name, String schools_spincipal, String other_school_details) {
        this.school_id = school_id;
        this.address_id = address_id;
        this.school_name = school_name;
        this.schools_spincipal = schools_spincipal;
        this.other_school_details = other_school_details;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getSchools_spincipal() {
        return schools_spincipal;
    }

    public void setSchools_spincipal(String schools_spincipal) {
        this.schools_spincipal = schools_spincipal;
    }

    public String getOther_school_details() {
        return other_school_details;
    }

    public void setOther_school_details(String other_school_details) {
        this.other_school_details = other_school_details;
    }
    
}
