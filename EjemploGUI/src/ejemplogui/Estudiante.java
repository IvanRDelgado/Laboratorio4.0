/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ivan Delgado
 */
public class Estudiante extends Persona implements Serializable {
    
    ArrayList<Materia> materias;
    
    public Estudiante(String name, String lastName, long landLine, long movilPhone, String mail, String address, ArrayList<Materia> materias) {
        super(name, lastName, landLine, movilPhone, mail, address);
        this.materias= materias;
    } 

    public String getMateriasString() {
        String r="";
        for (Materia materia : materias) {
            r+=materia.getNombre()+"\n";
        }
        return r;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
}
