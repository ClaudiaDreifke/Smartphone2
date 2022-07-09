package model;

import model.Friend;

import java.util.HashMap;
import java.util.Map;

public class Smartphone {

    String model;
    String manufacturer;
    Map<String,String> allContacts = new HashMap<>();

    public void addContact(Friend friend){
        allContacts.put(friend.contactName, friend.phoneNumber);
    }

    public String getPhoneNumberByContactMap(Friend friend){
        return allContacts.get(friend.contactName);
    }

    public String startRadio(){
        return "Radio started";
    }

    public String stopRadio(){
        return "Radio stopped";
    }

    public String getPosition(){
        return "Köln";
    }

    public Smartphone() {
    }

    public Smartphone(String model, String manufacturer, Map<String, String> allContacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.allContacts = allContacts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public Map<String, String> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(Map<String, String> allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public String toString() {
        return "model.Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", allContacts=" + allContacts +
                '}';
    }
}
