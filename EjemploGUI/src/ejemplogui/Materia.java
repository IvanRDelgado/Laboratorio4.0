/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

/**
 *
 * @author Ivan Delgado
 */
public class Materia {
    String nombre;
    int codigo;
    Profesor profesor;

    
    

    public Materia(String nombre, int codigo,Profesor profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesor=profesor;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
   
}
