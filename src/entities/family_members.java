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
public class family_members {
    private int family_member_id;
    private int family_id;
    private String parent_of_student_member;
    private int parent_id;
    private int student_id;

    public family_members() {
    }

    public family_members(int family_member_id, int family_id, String parent_of_student_member, int parent_id, int student_id) {
        this.family_member_id = family_member_id;
        this.family_id = family_id;
        this.parent_of_student_member = parent_of_student_member;
        this.parent_id = parent_id;
        this.student_id = student_id;
    }

    public int getFamily_member_id() {
        return family_member_id;
    }

    public void setFamily_member_id(int family_member_id) {
        this.family_member_id = family_member_id;
    }

    public int getFamily_id() {
        return family_id;
    }

    public void setFamily_id(int family_id) {
        this.family_id = family_id;
    }

    public String getParent_of_student_member() {
        return parent_of_student_member;
    }

    public void setParent_of_student_member(String parent_of_student_member) {
        this.parent_of_student_member = parent_of_student_member;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    
}
