/*
1
212
32123
4321234
*/
class Pattern{
    public static void main(String[] args){
        for (int i=1;i<=7; i=i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            i=i+2;
        }
    }
}