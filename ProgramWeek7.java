/**
 * This program has different method types that do different things
 * Ryan Goodell, Week7 Program, 10/13/23
 */
import java.util.Scanner;
public class ProgramWeek7{
    //The boolean has to be in the class section to work correctly for the isOdd method
    boolean intTF = true;
    /**
     * will welcome user to program
     * @param user is the name of the user for program
     */
    public void welcomeUser(String user){System.out.println("Welcome to this programming project " + user);}
    /**
     * method 2, isOdd
     * will determine if the user inputted number is odd or not
     * @param num is the integer that the user inputs to see if its odd or not
     * @return will display "true" if num is odd and "false" if num isnt odd
     */
    public boolean isOdd(int num){
        if(num % 2 == 1){
            intTF = true;
        }
        else{
            intTF = false;
        }
        return intTF;
    }
    /**
     * getting the letter grade from your number grade
     * @param grade is the whole number of the percentage grade that is entered from the user
     * @return is the letter grade from the percentage grade
     */
    public String letterGrade(double grade){
        String gradeLetter = "";
        if(grade>=90){
            gradeLetter = "A";
        }
        else if(grade>=80){
            gradeLetter = "B";
        }
        else if(grade>=70){
            gradeLetter = "C";
        }
        else if(grade>=60){
            gradeLetter = "D";
        }
        else{
            gradeLetter = "F";
        }
        return gradeLetter;
    }
    /**
     * Will determine birthstone form month given but month needs to be written out
     * @param month is the month that the user inputted for their birstone
     * @return the birthstone based off the month
     */
    public String birthStone(String month){
        String stoneType = "";
        if(month.compareTo("January") == 0){
            stoneType = "garnet";
        }
        else if(month.compareTo("February") == 0){
            stoneType = "amethyst";
        }
        else if(month.compareTo("March") == 0){
            stoneType = "aquamarine, bloodstone";
        }
        else if(month.compareTo("April") == 0){
            stoneType = "diamond";
        }
        else if(month.compareTo("May") == 0){
            stoneType = "emerald";
        }
        else if(month.compareTo("June") == 0){
            stoneType = "pearl, moonstone, alexandrite";
        }
        else if(month.compareTo("July") == 0){
            stoneType = "ruby";
        }
        else if(month.compareTo("August") == 0){
            stoneType = "peridot, spinel, sardonyx";
        }
        else if(month.compareTo("September") == 0){
            stoneType = "sapphire";
        }
        else if(month.compareTo("October") == 0){
            stoneType = "opal, tourmaline";
        }
        else if(month.compareTo("November") == 0){
            stoneType = "topaz, citrine";
        }
        else if(month.compareTo("December") == 0){
            stoneType = "turquoise, zircon, tanzanite";
        }
        else{
            System.out.println("Please enter a valid month and make sure to start it with a capital letter, Ex: July");
        }
        return stoneType;
    }
    /**
     * Will determine birthstone based on month number such as July being 7
     * @param month is the number inputted by the user that represents the month
     * @return the birthstone determined by the month number
     */
    public String birthStone(int month){
        String stoneType = "";
        if (month == 1) {
            stoneType = "garnet";
        } else if (month == 2) {
            stoneType = "amethyst";
        } else if (month == 3) {
            stoneType = "aquamarine, bloodstone";
        } else if (month == 4) {
            stoneType = "diamond";
        } else if (month == 5) {
            stoneType = "emerald";
        } else if (month == 6) {
            stoneType = "pearl, moonstone, alexandrite";
        } else if (month == 7) {
            stoneType = "ruby";
        } else if (month == 8) {
            stoneType = "peridot, spinel, sardonyx";
        } else if (month == 9) {
            stoneType = "sapphire";
        } else if (month == 10) {
            stoneType = "opal, tourmaline";
        } else if (month == 11) {
            stoneType = "topaz, citrine";
        } else if (month == 12) {
            stoneType = "turquoise, zircon, tanzanite";
        } else {
            System.out.println("Please enter a valid month number ");
        }
        return stoneType;
    }
    /**
     * determine lab instructor according to the labs section number
     * @param labNum is the lab section number that gets inputted from the user
     */
    public void labInstructor(int labNum){
        if (labNum == 01 || labNum == 04){
            System.out.println("Your lab instructor is: Vishnu Rapuru");
        }
        else if (labNum == 02 || labNum == 05){
            System.out.println("Your lab instructor is: Pradnya Pendse");
        }
        else if (labNum == 06 || labNum == 03){
            System.out.println("Your lab instructor is: Saket Chaturvedi");
        }
        else{
            System.out.println("Not a valid lab number");
        }
    }
    /**
     * a random number is generated then the ASCII letter is given out
     * @return gives out a random lowercase letter
     */
    public char randomLowerCase(){
        int randomNum = (int)((Math.random() * 25) + 97);
        char lowerCase = (char) randomNum;
        return lowerCase;
    }
    /**
     * this program squares a number of my choice and prints it out
     * @param dubages is the number that you square
     * @return the squared number
     */
    public double squareIt(double dubages){
        double squared = Math.pow(dubages,2);
        return squared;
    }
    //in the main class I used questions to be engaging
    public static void main (String[]args){
        Scanner scan_one = new Scanner(System.in);
        ProgramWeek7 tester = new ProgramWeek7();
        System.out.println("Please enter a name to adress you");
        String user = scan_one.next();
        tester.welcomeUser(user);
        System.out.println("Please enter a number to determine if it's odd");
        int num = scan_one.nextInt();
        System.out.println("Your number is: " + tester.isOdd(num) + " about being odd");
        System.out.println("Please enter your percentage grade to determine the letter for it");
        double grade = scan_one.nextDouble();
        System.out.println(tester.letterGrade(grade));
        System.out.println("Want to know your birthstone? please enter your full birth month. Ex: July");
        String month = scan_one.next();
        System.out.println("Your birthstone is: " + tester.birthStone(month));
        System.out.println("Want to know your birthstone? Please enter your birth month as a number");
        int month2 = scan_one.nextInt();
        System.out.println("Your birthstone is: " + tester.birthStone(month2));
        System.out.println("Need to know our lab instructors name? Please enter your lab sections number. DON'T FORGET THE '0'! ex:07");
        int labNum = scan_one.nextInt();
        tester.labInstructor(labNum);
        System.out.println("Want a random lowercase letter?");
        System.out.println(tester.randomLowerCase());
        System.out.println(tester.squareIt(6.0));
    }
docks
}
