public class Inky {

    public Inky (String Pinkey){
        System.out.println(Pinkey);
    }

    public Inky (String A, String B, String C){
        System.out.println(B+" "+A);
        System.out.println(A+" "+C);
        System.out.println(B+" "+A+" "+C);
    }

public static void main(String args[]){

    String Pinkey = "Donkey";
    String Blinky = "Pinkey";
    String Rinkey = "Monkey";

    Inky Ponkey = new Inky(Pinkey);
    Inky Ponkey1 = new Inky(Pinkey,Blinky,Rinkey);
}   
}
