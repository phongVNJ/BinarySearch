import java.util.Scanner;

public class ComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String");
        String inputString = scanner.nextLine();
        int [] frequentchar  = new int[255];
        for (int i = 0;i<=inputString.length();i++){
            int ascii = (int) inputString.charAt(i);
            frequentchar[ascii]+=1;
        }
        int max =0;
        char charecter = (char) 255;
        for (int j =0; j<255;j++){
            if (frequentchar[j]>max){
                max = frequentchar[j];
                charecter = (char) j;
            }
        }
        System.out.println("the most appearing letter is '"+ charecter+"with a frequency of"+max+"time");
    }
}
