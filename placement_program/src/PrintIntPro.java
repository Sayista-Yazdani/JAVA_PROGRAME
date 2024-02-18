public class PrintIntPro {
    public static void main(String[] args) {
        // print Integar 1 to 10 number
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }
        //Print Command Line Argument and also length
        for(String s:args){
            System.out.println(s);
            System.out.println(s.length());
        }
    }
}
