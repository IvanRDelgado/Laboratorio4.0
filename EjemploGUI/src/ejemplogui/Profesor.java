/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import java.io.Serializable;

/**
 *
 * @author Estudiante
 */
public class Profesor extends Persona implements Serializable {

    public Profesor(String name, String lastName, long landLine, long movilPhone, String mail, String address) {
        super(name, lastName, landLine, movilPhone, mail, address);
    }

}
