import java.lang.*;
import java.util.*;
public class sample {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("sac");
        boolean status = true;
        System.out.println(((Object) status).getClass().getSimpleName());

        String str = "naveen";
        System.out.println(((Object)str).getClass().getSimpleName());

        int a = 13;
        System.out.println(((Object)a).getClass().getSimpleName());

        String str2 = "hello Naveen";
        System.out.println(((Object)str2).getClass());

    }
}
