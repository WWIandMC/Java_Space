public class Main {
    public static void main(String[] args) {
        int i = 1;
        /*while( i <= 100 ){
            if( i == 50 ){
                i++;
                continue;
            }
            System.out.println(i++);
        }*/
        /*do {
            if( i == 50 ) {
                i++;
                continue;
            }
            System.out.println(i++);
        }while( i <= 100 );*/
        for ( ; i <= 100; i++ ){
            if( i == 50 ){
                continue;
            }
            System.out.println(i);
        }
    }
}