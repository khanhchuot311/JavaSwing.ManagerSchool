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
public class subjects {
    private int suject_id;
    private String suject_name;

    public subjects() {
    }

    public subjects(int suject_id, String suject_name) {
        this.suject_id = suject_id;
        this.suject_name = suject_name;
    }

    public int getSuject_id() {
        return suject_id;
    }

    public void setSuject_id(int suject_id) {
        this.suject_id = suject_id;
    }

    public String getSuject_name() {
        return suject_name;
    }

    public void setSuject_name(String suject_name) {
        this.suject_name = suject_name;
    }
    
}
