package hw4;

public class t4_20ye {
	 static double sum(double x, double e)
	    {
	        double i, total = 1.0, multi = x;

	        while((multi>=e)||(multi<=-e)) {
	        	if (Math.abs(multi)<1) {
	        		multi*=(-1);
		            total = total + multi;
		            multi = multi * x;
	        		
	        	}else {
	        		break;
	        	}
	        	
	        
	        }
	 
	       
	        return total;
	    }

	    public static void main(String[] args)
	    {
	
			double x=0.1;
			double e=0.0001;	
		
			
			System.out.println(sum(x,e));
	    }
	}