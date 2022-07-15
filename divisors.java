import java.util.ArrayList;
import java.util.Scanner;

public class divisors {
    public static void counting(ArrayList divs,int input) {
        for(int i = 1; i<(input/2)+1;i++){
            if (input % i == 0){
                divs.add(i);
            }
        }
        divs.add(input);
    }

    public static void main(String[] args) {
        ArrayList<Integer> divs = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        counting(divs,input);
        System.out.println(divs);

    }
}
