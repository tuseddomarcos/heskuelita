package com.capgemini.heskuelita.beans;
import java.util.*;


import com.capgemini.heskuelita.beans.service.IMenu;

public class Menu implements IMenu{

	Scanner S=new Scanner (System.in);
   
    public Menu(){}
    
    public void showCreatePersonMenu()
    {
       	
    	Person P = new Person();
    	JDBCConTest JD = new JDBCConTest();
    	
    	System.out.println("Ingrese nombre de la persona");
    	P.setName(S.nextLine());		
		System.out.println("Ingrese apellido de la persona");	
		P.setLastName(S.nextLine());
		System.out.println("Ingrese genero de la persona");	
		P.setGender(S.nextLine());
		System.out.println("Ingrese telefono de la persona");	
		P.setPhone(S.nextInt());
		
		//System.out.println("Ingrese mail de la persona");	
		//P.setEmail(S.nextLine());
		//System.out.println("Ingrese DNI de la persona");	
		//P.setDni(S.nextInt());    	
		
		System.out.println("Usted ingresó: "+P.getName()+ " " +P.getLastName()+" " +P.getGender()+" " +P.getPhone());
		//Method
		JD.testCreate();
    }
    
    public void showUpdatePersonMenu()
    {
    	Person P = new Person();
    	JDBCConTest JD = new JDBCConTest();
    	
    	System.out.println("Ingrese nombre de la persona");
    	P.setName(S.nextLine());		
		System.out.println("Ingrese apellido de la persona");	
		P.setLastName(S.nextLine());
		System.out.println("Ingrese genero de la persona");	
		P.setGender(S.nextLine());
		System.out.println("Ingrese telefono de la persona");	
		P.setPhone(S.nextInt());
		
		System.out.println("Usted ingresó: "+P.getName()+ " " +P.getLastName()+" " +P.getGender()+" " +P.getPhone());
		
		//Method
		JD.testUpdate();
		
    }
    
    public void showReadPersonMenu()
    {
    	Person P = new Person();
    	JDBCConTest JD = new JDBCConTest();
    	System.out.println("Ingrese ID de la persona para mostrar");
    	P.setId(S.nextInt());
    	
    	
    	//Method
    	JD.testRead();
    	
    	
    	
    }
    public void showDeletePersonMenu()
    {
    	Person P = new Person();
    	JDBCConTest JD = new JDBCConTest();
    	System.out.println("Ingrese ID de la persona para eliminar");
    	//Method
    	JD.testDelete();
    	
    }
    
    
    

}
