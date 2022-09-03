public class palindromenocheck {
    public static boolean isPalindrome(int x) {
        
     int   temp=x;
      int  sum=0;
        int r;
        do{
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
            
        }while(x>0);
            if(temp==sum){
                return true;
            }
        else{
            return false;
        }
            
        }
        public static void main(String[] args) {
            int x=121;
            System.out.println(isPalindrome(x));
        }
        
}
    

