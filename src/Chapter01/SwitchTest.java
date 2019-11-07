package Chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int month = 7;
       int day = 0;
       
       if(month == 1) {
    	   day = 31;
       } else if(month == 2) {
    	   day = 28;  
	}    else if(month == 3) {
		   day = 31; 
}        else if(month == 4) {
	       day = 30;
}        else if(month == 5) {
	       day = 31;
}        else if(month == 6) {
	       day = 30;
}        else if(month == 7) {
	      day = 31;
}         else if(month == 8) {
	      day = 31;
}         else if(month == 9) {
	      day = 30;
}         else if(month == 10) {
	      day = 31;
}         else if(month == 11) {
	      day = 30;
}         else if(month == 12) {
	      day = 31;
} else { 
	System.out.println("1월 ~ 12월 까지만 입력해주세요.");
	return;
}
	



       
       
       
       
	     
    
       
       switch(month) {
	       case 1:{
	    	   day = 31;
	    	   break;
	       }
	       case 2:{
	    	   day = 28;
	    	   break;
	      }
	       case 3:{
	    	   day = 31;
	    	   break;
	       }
	       case 4:{
	    	   day = 30;
	    	   break;
	       }
	       case 5:{
	    	   day = 31;
	    	   break;
	       }
	       case 6:{
	    	   day = 30;
	    	   break;
	       }
	       case 7:{
	    	   day = 31;
	    	   break;
	       }
	       case 8:{
	    	   day = 31;
	    	   break;
	       }
	       case 9:{
	    	   day = 30;
	    	   break;
	       }
	       case 10:{
	    	   day = 31;
	    	   break;
	       }
	       case 11:{
	    	   day = 30;
	    	   break;
	       }
	        case 12:{
	           day = 31;
	           break;
	       }
	       default: {
	    	   System.out.println("1월 ~ 12월 까지만 입력해주세요.");
	    	   return;
	       }
        
       }  
	} 
}
	 //System.out.println(month + "월은"+  day + "일까지 있습니다.");