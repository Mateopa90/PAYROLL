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
public class P_Fulltime extends Profesor{
    private double salario;

    public P_Fulltime(double salario, String School, String Departament, String id, String name, Date hiringDate) {
        super(School, Departament, id, name, hiringDate);
        this.salario = salario;
    }

    @Override
    public float paySalary() {
        return (float) this.salario;
    }   
}
