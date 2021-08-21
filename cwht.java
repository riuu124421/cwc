package cwcProj;
import java.util.Scanner;
public class cwht {

	public static void main(String[] args) { 
		 Scanner sc= new Scanner(System.in);
			System.out.println("1. for currency");
			System.out.println("2. for weight ");
			System.out.println("3. for height ");
			System.out.println("4.for temperature");
			System.out.println("Enter your choices");

			int x = sc.nextInt();
			
		switch(x) {
				//currency
		case 1:
				Scanner in = new Scanner(System.in);
		        System.out.println("Type 1 for Rupee to Dollar conversion: ");
		        System.out.println("Type 2 for Dollar to Rupee conversion: ");
		        System.out.print("Enter your choice: ");
		        int choice = in.nextInt();
		        switch (choice) {
		            case 1:
		            System.out.print("Enter rupee amount: ");
		            double r1 = in.nextDouble();
		            double d1 = r1 / 77;
		            System.out.println(r1 + " rupees => " + d1 + " dollars");
		            break;
		            
		            case 2:
		            System.out.print("Enter dollar amount: ");
		            double d2 = in.nextDouble();
		            double r2 = d2 * 77;
		            System.out.println(d2 + " dollars => " + r2 + " rupees");
		            break;
		            
		            default:
		            System.out.println("Incorrect Choice");
		        } break;
			
			
		          //weight
		        
		        case 2:
		      
		        	Scanner sc1=new Scanner (System.in);
		        System.out.println("menu\t");
		        System.out.println("1. pounds to kg");
		        System.out.println("2. kg to pounds");
		        int n=sc1.nextInt();
		        System.out.println("enter data for conversion");
		        double d=sc1.nextDouble();
		        String st="";
		        double result=1;
		        if(n==1)
		          {result=d*0.4536;
		            st="kg";}
		        else
		        {  result=d*2.2046;
		            st="lbs";}
		        System.out.println("after conversion: "+result+" "+st);
		        break;
		     
		      
		    		    
		        case 3:
		    		
		        	//height
		        	
		    		System.out.println("type f to convert feet to inch");
		    		  System.out.println("type i to convert inch to feet");
		    		   
		    		  Scanner scan = new Scanner(System.in);
		    		  char ch = scan.next().charAt(0);
		    		  if (ch=='f') 
		    		  {
		    		   System.out.println("enter feet value");
		    		   double f = scan.nextDouble();
		    		   double i = f*12;
		    		   System.out.println("inch: "+i);
		    		  }
		    		   
		    		  else if (ch=='i') 
		    		  {
		    		   System.out.println("enter inch value");
		    		   double i1 = scan.nextDouble();
		    		   double f1 = i1/12;
		    		   System.out.println("feet: "+f1);
		    		  }
		    		   
		    		  else
		    		  {
		    		   System.out.println("invalid entry");
		    		  }
		    		  break;
			
		    		  
		        case 4: 
		    	         //temperature  
		        
		        	double f,c;
		     	    Scanner sc11=new Scanner(System.in);
 System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
		           int ch1=sc11.nextInt();
		    switch(ch1)
		    {
		    case 1:  System.out.println("Enter  Fahrenheit temperature");
		           	  f=sc11.nextDouble();
		      c=(f-32)*5/9;
		      System.out.println("Celsius temperature is = "+c);
		    break;
		    case 2:  System.out.println("Enter  Celsius temperature");
		           	  c=sc11.nextDouble();
		      f=((9*c)/5)+32;
		      System.out.println("Fahrenheit temperature is = "+f);
		    break;
		    default:  System.out.println("please choose valid choice");
		    }  
		    } 
		    }
}