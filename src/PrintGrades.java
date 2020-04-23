import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int score;
        String grade;
        String input2;
        String input;

        boolean cont1 = true;
        boolean cont2;

        while(cont1 == true){
            cont2 = true;
            System.out.print("\nEnter an Exam Score: ");

            input = keyboard.nextLine();
            score = Integer.parseInt(input);

            if(score < 0 || score > 100){
                System.out.println("\nInput out of range!");
            }
            else{
                if(score >= 97){
                    grade = "A+";
                }
                else if(score >= 94){
                    grade = "A";
                }
                else if(score >= 90){
                    grade = "A-";
                }
                else if(score >= 87){
                    grade = "B+";
                }
                else if(score >= 84){
                    grade = "B";
                }
                else if(score >= 80){
                    grade = "B-";
                }
                else if(score >= 77){
                    grade = "C+";
                }
                else if(score >= 74){
                    grade = "C";
                }
                else if(score >= 70){
                    grade = "C-";
                }
                else if(score >= 60){
                    grade = "D";
                }
                else {
                    grade = "\nScore less than sixty, You have to go back to School.";
                    System.out.println(grade);
                }

                if(score >= 60){
                    System.out.println("\nGood job. Your grade is " + grade + ".");
                }
            }

            while(cont2 == true){
                System.out.print("Do you want to enter another score ([Y]/N)? ");

                input2 = keyboard.nextLine();

                if((input2.equals("")) | (input2.equalsIgnoreCase("y"))){
                    // default answer is yes
                    cont2 = false;
                }
                else if(input2.equalsIgnoreCase("n")){
                    // only "n" or "N" is taken as no
                    cont1 = false;
                    cont2 = false;
                }
                else{
                    System.out.println("\nWrong input entered.");
                    // chance is given for another trial assuming user made unconscious error.
                    cont1 =true;
                    cont2 = true;
                }
            } // end of first else

        } //end of while loop
        keyboard.close();
    }
}
