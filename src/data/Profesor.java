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
public abstract class Profesor extends Employee{
    private String School;
    private String Departament;

    public Profesor(String School, String Departament, String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
        this.School = School;
        this.Departament = Departament;
    }
    
}
