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
    String Nombre;
    String Codigo;
    String Profesor;

    
    

    public Materia(String Nombre, String Codigo,String Profesor) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Profesor=Profesor;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }
    
    public String getProfesor() {
        return Profesor;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }
   
}
