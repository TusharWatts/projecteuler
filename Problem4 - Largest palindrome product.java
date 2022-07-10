package Hello;

public class HelloWorld {

	public static void main(String[] args) {
		
		  int max = Integer.MIN_VALUE;
	      
	      for(int a = 999; a > 99; a--) {
	    	  
	    	  for(int b = 999; b > 99; b--) {
	    		  
	    		  //System.out.println(a + " " + b);
	    		  String numStr = convertNumToString(a*b);
	    		  if( isPalindrome(numStr) ) {
	    			  max = Math.max(max, a*b);
	    		  }
	    		  
	    	  }
	    	  
	      }
	      
	      System.out.println(max);

	}
	
	public static String convertNumToString(int num){
        
        String res = "";
        
        while(num != 0){
            res += num%10;
            num = num/10;
        }
 
        return res;
        
    }
    
    
    public static boolean isPalindrome(String num){
        
        int numLen = num.length();
        
        boolean isPalindrome = true;
        
        for(int i = 0; i < numLen/2; i++){
            
            if(num.charAt(i) == num.charAt(numLen-i-1)){
                continue;
            }else{
                isPalindrome = false;
                break;
            }
            
        }
        
        return isPalindrome;
        
    }	

}
