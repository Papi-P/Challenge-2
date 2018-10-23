package challenge.pkg2;
import java.util.Scanner;
public class Challenge2{
    public static void main(String[] args) {
        //open a scanner for user input from System.in
        Scanner m = new Scanner(System.in);
        
        //get an int from the scanner for each user-inputted date
        System.out.println("Enter the month: ");
        int month = m.nextInt();
        System.out.println("Enter the day: ");
        int day = m.nextInt();
        System.out.println("Enter the year: ");
        int year = m.nextInt();
        
        //define the R-D dates
        int rdmonth = 4;
        int rdday = 5;
        int rdyear = 1998;
        
        //get the difference in years -- this is used for a large number of comparisons to avoid comparing month and day as well.
        int yeardif = year-rdyear;
        
        //check if the year is greater than R-D's birthyear and output accordingly
        if(rdyear < year){
            System.out.println(month+"/"+day+"/"+year+" is after "+rdmonth+"/"+rdday+"/"+rdyear);
        }
        
        //check if the year is equal to R-D's birthyear and output accordingly
        if(rdyear == year){
            
            //*if year is the same as R-D's birthyear, check if the month is less than, equal to, or greater than R-D's birthmonth and output accordingly.
            if(rdmonth < month){
                System.out.println(month+"/"+day+"/"+year+" is after "+rdmonth+"/"+rdday+"/"+rdyear);
            }if(rdmonth == month){
                
                //if the month and year are the same as R-D's, check the days and output accordingly.
                if(rdday < day){
                    System.out.println(month+"/"+day+"/"+year+" is after "+rdmonth+"/"+rdday+"/"+rdyear);
                }if(rdday == day){
                    System.out.println("It's Mr. RD's actual birthday");
                }if(rdday > day){
                    System.out.println(month+"/"+day+"/"+year+" is before "+rdmonth+"/"+rdday+"/"+rdyear);
                
                }
            }if(rdmonth > month){
                System.out.println(month+"/"+day+"/"+year+" is before "+rdmonth+"/"+rdday+"/"+rdyear);
            }
        }
        
        //check if the year is less than R-D's birthyear and output accordingly
        if(rdyear > year){
            System.out.println(month+"/"+day+"/"+year+" is before "+rdmonth+"/"+rdday+"/"+rdyear);
        }
        
        //check if the month and day are the same as R-D's dates, and if the year difference is positive (greater than 0)
        if(month == rdmonth && day == rdday){
            if(yeardif > 0){
                //check if the difference of years is divisible by 10, or just one and output accordingly
                if(yeardif % 10 == 0){
                    System.out.print("Happy R-D-ecennial!");
                }else{
                    System.out.println("Mr. R-D's birthday was "+yeardif+" year(s) ago! Happy R-D-versary!");
                }
            }
            
        //if the difference of years is positive (greater than 0), output how old he is.
        }else if(yeardif > 0){
            System.out.println("Mr. R-D is "+yeardif+" year(s) old!");
        }
        if(yeardif < 0){
            //if Mr. R-D is not born (difference of years is negative), say he's not born yet and how long until he is.
            System.out.println("Mr. R-D is not born yet! (But will be in "+(yeardif*-1)+" year(s)!)");
        }
        //print a blank line to the console so the annoying green "BUILD SUCCESSFUL" doesn't hinder visibility of the last line
        System.out.print("\n");
    }
}