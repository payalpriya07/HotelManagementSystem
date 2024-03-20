package com.pro;

import ourproject.com.model.Receptionist;
import ourproject.com.model.Room;
import ourproject.com.model.User;
import ourproject.com.service.*;
import ourproject.com.serviceImpl.ReceptionistServiceImpl;
import ourproject.com.serviceImpl.RoomServiceImpl;
import ourproject.com.serviceImpl.UserServiceImpl;


public class App{
        	   public static void main(String[] args) {
      	   		   
        	       UserService uservice = new UserServiceImpl();
        	        		   User ur = new User(98,"Payal",638710);
        	        		   uservice.createUser(ur);
        	        		   
        	        		   RoomService rservice = new RoomServiceImpl();
        	        		   Room rm = new Room(201, "luxury");
        	        		   rservice.createRoom(rm);
        	        	   
        	        	       ReceptionistService oservice = new ReceptionistServiceImpl();
        	        	       Receptionist rc = new Receptionist(10, "Merry", "765653");
        	        	       oservice.createReceptionist(rc);  
        	        	       {
        	        		   System.out.println("Record Added");        	   
        	        	       }
        	        	       
        	    		
        	        	   }	
        		   
        	   
        		   
        	  		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
}   		   
        	   
    		
    	
     


