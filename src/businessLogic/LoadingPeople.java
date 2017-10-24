package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import data.Employee;
import data.Grad;
import data.P_Fulltime;
import data.P_Parcialtime;
import data.Undergrad;

public class LoadingPeople {

	public static Undergrad readUndergrad(Scanner sc) {
		Undergrad newUndergrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String hours = sc.next().trim();
		int h = Integer.parseInt(hours);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newUndergrad = new Undergrad(id, name,hiringDate,dp,h);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newUndergrad;
	}

	public static Grad readGrad(Scanner sc) {
		Grad newGrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String courses = sc.next().trim();
		int c = Integer.parseInt(courses);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newGrad = new Grad(id, name,hiringDate,dp,c);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newGrad;
	}
        
        public static Grad readP_Fulltime(Scanner sc) {
		P_Fulltime newP_fulltime = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
                double salario = sc.nextDouble();
                String School = sc.next().trim();
                String Departament = sc.next().trim();
                String hiringDate = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String courses = sc.next().trim();
		int c = Integer.parseInt(courses);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newP_fulltime = new P_fulltime(double salario, String School, String Departament, String id, String name, Date hiringDate);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newP_fulltime;
	}
        
        public static P_Parcialtime readP_Parcialtime(Scanner sc) {
		P_Parcialtime newP_Parcialtime = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
                double salario = sc.nextDouble();
                String School = sc.next().trim();
                String departament = sc.next().trim();
                String hiringDate = sc.next().trim();
                String 	Categoria = sc.next().trim();
                int classhour = sc.nextInt();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String courses = sc.next().trim();
		int c = Integer.parseInt(courses);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newP_Parcialtime = new P_Parcialtime( Categoria, classhour, School, departament, id, name, hiringDate);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newP_Parcialtime;
	}

	public static Employee readEmployee(Scanner sc) {
		String type = sc.next().trim();
		if (type.equals("Grad")) 
                    return readGrad(sc);
                else if (type.equals("Undergrad")) 
                    return readUndergrad(sc);
		else if (type.equals("P_Fulltime")) 
                    return readP_Fulltime(sc);
                else if (type.equals("P_Parcialtime")) 
                    return readP_Parcialtime(sc);
                else if (type.equals("Administrative")) 
                    return readAdministrative(sc);
                else if(type.equals("ByContract")) 
                    return readUndergrad(sc);
                else
                    throw new
	}
	
	public static ArrayList<Employee> readStaff(String fileName) {
		ArrayList<Employee> people = new ArrayList<Employee>();
		Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				people.add(readEmployee(sc));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found -- " + fileName);
			e.printStackTrace();
		}
		return people;
	}
}
