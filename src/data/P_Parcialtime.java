/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class P_Parcialtime extends Profesor{
    private String Categoria;
    private int classhour;

    public P_Parcialtime(String Categoria, int classhour, String School, String Departament, String id, String name, Date hiringDate) {
        super(School, Departament, id, name, hiringDate);
        this.Categoria = Categoria;
        this.classhour = classhour;
    }

    @Override
    public float paySalary() {
        if(this.Categoria.equals("A"))
            return 60000*this.classhour;
        else if (this.Categoria.equals("B"))
            return 80000*this.classhour;
        else if(this.Categoria.equals("C"))
            return 100000*this.classhour;
        else
            throw new IllegalArgumentException(" CATEGORIA NO ENCONTRADA ");
    }
    
    

}
