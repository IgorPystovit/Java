import java.util.Scanner;

public class MoveCoordinates {
    private static Scanner scan=new Scanner(System.in);
    private static MoveCoordinates exe = new MoveCoordinates();
    public static void main(String[] args) {
        int numberOfSteps = scan.nextInt();
        int x =0;
        int y =0;
        for (int i =0; i <= numberOfSteps; i++){
            String[] temporary= new String[2];
            String input = scan.nextLine();
            temporary = exe.splitWordNumbers(input);
            if (temporary[0].equals("North")){
                y += Integer.parseInt(temporary[1]);
            }
            if (temporary[0].equals("South")){
                y-= Integer.parseInt(temporary[1]);
            }
            if (temporary[0].equals("East")){
                x += Integer.parseInt(temporary[1]);
            }
            if (temporary[0].equals("West")){
                x -= Integer.parseInt(temporary[1]);
            }

        }

        System.out.println(x+" "+y);
    }

    public String[] splitWordNumbers(String input){
        String[] vectorInfo = new String[2];
        String word = "";
        String number = "";

        for (int i = 0; i <input.length(); i++){
            if (Character.isDigit(input.charAt(i))){
                number += String.valueOf(input.charAt(i));

            }

            if (isAlpha(input.charAt(i))){
                word += String.valueOf(input.charAt(i));
            }
        }

        vectorInfo[0] = word;
        vectorInfo[1] = number;

        return vectorInfo;
    }

    public static boolean isAlpha(char input){
        boolean isAlpha = false;
        if ( ((input >= 'a') && (input <= 'z')) || ((input >= 'A') && (input <= 'Z'))){
            isAlpha = true;
        }

        return isAlpha;

    }
}
