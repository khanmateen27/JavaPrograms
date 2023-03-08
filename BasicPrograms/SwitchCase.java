

import java.util.*;
public class SwitchCase{
    public static void main(String args[]){
        //System.out.print("Enter the Name of any Fruit: ");
        //Scanner scn = new Scanner(System.in);
        //Describe the Fruits using Switch cases:
        /*String fruit = scn.next();
        switch(fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Red Fruit");
                break;
            case "Grapes":
                System.out.println("Green Fruit");
                break;
            case "BlueBerry":
                System.out.println("Blue Fruit");
                break;
            case "Kiwi":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Invalid Fruit");
        }*/



        //Display Day Name Between 1 to 7
        /*System.out.print("Enter any Number to check the day : ");
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursdy");
                break;

            case 6:
                System.out.println("Friday");
                break;
            
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Number");
                break;
        }*/

        //WeekDays And WeekEnds 
        /*System.out.print("Enter any number between 1 to 7 ");
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;         
        }*/


        //Nested Switch 
        System.out.println("Enter the EmpID: ");
        Scanner scn = new Scanner(System.in);
        int empID = scn.nextInt();
        System.out.println("Enter the Department: ");
        String department = scn.next();

        switch(empID){
            case 1:
                System.out.println("Mohammed Mateen Khan");
                break;
            
            case 2:
                System.out.println("Mohammed Manal Khan");
                break;

            case 3:
                System.out.println("Employer Id 3");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("Management Department");
                        break;

                    case "Medical":
                        System.out.println("Medical Department");
                        break;

                    default:
                        System.out.println("Invalid Deparment");   
                        break;     
                }
            break;
            default:
                System.out.println("Invalid Employee Id");
        }
}
}