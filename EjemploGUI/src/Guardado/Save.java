/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guardado;

import ejemplogui.Estudiante;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ejemplogui.MasterFormlario;
import ejemplogui.Profesor;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Save implements Serializable {
    
    private MasterFormlario master;
    
    public Save(MasterFormlario master) {
        this.master = master;
        
    }
    
    public void guardarObjeto(MasterFormlario master) {
        try {
            FileOutputStream fos = new FileOutputStream("contacts.db");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            
            os.writeObject(master.getEstudiantes());
            os.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarObjeto() {
        
        try {
            
            FileInputStream fis = new FileInputStream("contacts.db");
            ObjectInputStream is = new ObjectInputStream(fis);
            master.setEstudiantes((ArrayList) is.readObject());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(master, e.getMessage());
        }
        
    }

    /**
     * TXT
     *
     * @param master
     */
    public void guardarTexto(MasterFormlario master) {
        
        try {
            
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(master);
            File destiny = file.getSelectedFile();
            FileWriter fw = new FileWriter(destiny);
            FileWriter y = new FileWriter("texto.txt");
            String x = "Nombre,Apellido,Telefono_Fijo,Telefono_Movil,Correo,"
                    + "Dirección\n";
            if (destiny != null) {
                fw.write(x);
                y.write(x);
                
                System.out.println("escribre=='0'0");
                for (Estudiante e : master.getEstudiantes()) {
                    fw.write(e.getName() + "," + e.getLastName() + "," + e.getLandLine() + ","
                            + e.getMovilPhone() + "," + e.getMail() + "," + e.getAddress() + "\n");
                    System.out.println("lo hace o no lo hace");
                }
                
                JOptionPane.showMessageDialog(master, "Succes!");
            }
            // Información Estudiantes

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
