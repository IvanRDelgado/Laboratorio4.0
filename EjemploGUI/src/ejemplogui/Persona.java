/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import java.io.Serializable;

/**
 *
 * @author Ivan Delgado
 */
public abstract class Persona implements Serializable {

    String name;
    String lastName;
    long landLine;
    long movilPhone;
    String mail;
    String address;

    public Persona(String name, String lastName, long landLine, long movilPhone, String mail, String address) {
        this.name = name;
        this.lastName = lastName;
        this.landLine = landLine;
        this.movilPhone = movilPhone;
        this.mail = mail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public long getLandLine() {
        return landLine;
    }

    public long getMovilPhone() {
        return movilPhone;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLandLine(long landLine) {
        this.landLine = landLine;
    }

    public void setMovilPhone(long movilPhone) {
        this.movilPhone = movilPhone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
