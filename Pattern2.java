/*
   J
  AAA
 VVVVV
AAAAAAA
*/
class Pattern2{
    public static void main(String[] args){
        String s="JAVA";
        for(int i=1;i<=4;i++){
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int k=i*2-1;k>=1;k--){
                System.out.print(s.charAt(i-1));
            }
            System.out.println();
        }    
    }
}