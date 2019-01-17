public class Prabinn
{ 
    static int sumevenFib(int limit) 
    { 
        if (limit < 2) 
            return 0; 
      
        long preceeding = 0, trailing = 2; 
        long sum = preceeding + trailing; 
      
        while (trailing <= limit) 
        { 
            long sum_current = 4 * trailing + preceeding; 
      
            if (sum_current > limit) 
                break; 
      
            preceeding = trailing; 
            trailing = sum_current; 
            sum += trailing; 
        } 
      
        return(int) sum; 
    } 
      
    public static void main (String[] args)  
    { 
        int limit = 4000000; 
        System.out.println(sumevenFib(limit)); 
          
    } 
} 
  
