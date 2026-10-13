class Solution {
    public int integerReplacement(int n) {
        return integer((long)n);
        
    }
    public int integer(long n){
        if(n==1){
            return 0;
        }
      
        if(n%2==0){
            return 1+integer(n/2);

        }
        
    
            return Math.min(1+integer( n+1),1+integer( n-1));
        
        
    }

    }
