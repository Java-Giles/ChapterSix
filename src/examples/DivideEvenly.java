package examples;

public class DivideEvenly {

    public static void main(String[] args){

        int count = 0;

        while(count < 10 ){
            if(count % 2 == 0)
                System.out.println(count);
            count++;
        }
        System.out.println("__________________");
        while(count > 0){
            if(count % 2 == 0)
                System.out.println(count);
            count--;
        }
        System.out.println("__________________");
        do{ if(count % 2 == 0)
            System.out.println(count);
        count++;
        }while(count < 10);
        System.out.println("__________________");
        do{ if(count % 2 == 0)
            System.out.println(count);
            count--;
        }while(count > 0);

    }
}
