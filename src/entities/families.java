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
public class families {
    private int family_id;
    private int head_of_family_parent_id;
    private String family_name;

    public families() {
    }

    public families(int family_id, int head_of_family_parent_id, String family_name) {
        this.family_id = family_id;
        this.head_of_family_parent_id = head_of_family_parent_id;
        this.family_name = family_name;
    }

    public int getFamily_id() {
        return family_id;
    }

    public void setFamily_id(int family_id) {
        this.family_id = family_id;
    }

    public int getHead_of_family_parent_id() {
        return head_of_family_parent_id;
    }

    public void setHead_of_family_parent_id(int head_of_family_parent_id) {
        this.head_of_family_parent_id = head_of_family_parent_id;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }
    
}
