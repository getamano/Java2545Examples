package week1_variables_if_else;


import static input.InputUtils.stringInput;

public class ComparingStringsWrongWay {
    
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        //This line does not do as you might expect!
        if (college == "MCTC") {
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should go to MCTC!");
        }
    }
}



