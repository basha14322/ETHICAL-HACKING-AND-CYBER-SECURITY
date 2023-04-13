import java.util.*;
class hc{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int operations=sc.nextInt();
        //1=+
        //2=-
        //3=*
        //4=/
        switch(operations){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            if(b>a){
                System.out.println(b-a);
            }else{
                System.out.println(a-b);
            }
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            if(b>a){
                System.out.println(b/a);
            }else if(a>b){
                System.out.println(a/b);
            }else{
                System.out.println(a/b);
            }
            
        }

        
    }
}