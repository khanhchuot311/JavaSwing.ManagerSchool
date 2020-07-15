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
public class parent_address {
    private int parent_id;
    private int address_id;
    private String date_address_from;
    private String date_address_to;

    public parent_address() {
    }

    public parent_address(int parent_id, int address_id, String date_address_from, String date_address_to) {
        this.parent_id = parent_id;
        this.address_id = address_id;
        this.date_address_from = date_address_from;
        this.date_address_to = date_address_to;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getDate_address_from() {
        return date_address_from;
    }

    public void setDate_address_from(String date_address_from) {
        this.date_address_from = date_address_from;
    }

    public String getDate_address_to() {
        return date_address_to;
    }

    public void setDate_address_to(String date_address_to) {
        this.date_address_to = date_address_to;
    }
    
}
