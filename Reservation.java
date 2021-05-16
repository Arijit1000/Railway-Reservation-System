import java.util.Scanner;
import java.util.*;
public class Reservation
{
    String userName;
    Scanner sc =  new Scanner(System.in);
    public void main()
    {
        
        System.out.println("Enter USERNAME: ");
        userName = sc.nextLine();
        
        
        int choice;
        
        String gur[],goa[],del[],pat[],ker[];
        int train1, train2, train3, train4, train5;
        int time1, time2, time3, time4, time5;
        int seat1, seat2, seat3, seat4, seat5;
        
        String train[]={"AAA", "BBB", "CCC" , "DDD", "EEE"};
        String t[]={"DAY", "NIGHT"};
        String place[]={"Gurgaon","Goa","Delhi","Patna","Kerala"};
        
        
        
        
            System.out.print("ENTER CHOICE: ");System.out.println("*****");
                        System.out.println("*   DESTINATION   |  FARE  |  SEAT  *");
                        System.out.println("*****");
                        System.out.println("* 1.GURGAON   |  600   |  "+"100"+"   *");
                        System.out.println("* 2.GOA       |  170   |  "+"100"+"   *");
                        System.out.println("* 3.DELHI     |  150   |  "+"100"+"   *");
                        System.out.println("* 4.PATNA     |  200   |  "+"100"+"   *");
                        System.out.println("* 5.KERALA    |  250   |  "+"100"+"   *");
                        System.out.println("**************");
                        System.out.println("**************\n");
                        
                        System.out.print("ENTER CHOICE: ");
            choice = sc.nextInt();
            
            
            System.out.println();
            
            System.out.println();
            
            System.out.println("***************");
            
            
            System.out.println();
            
            System.out.println();
            
            
        switch(choice)
        {
            case 1:System.out.println("There are 5 available trains ...");
            System.out.println();
                    System.out.println("1. AAA Express  (10 seats)");
                    System.out.println("2. BBB Express  (19seats)");
                    System.out.println("3. CCC Express  (60 seats)");
                    System.out.println("4. DDD Express  (102 seats)");
                    System.out.println("5. EEE Express  (34 seats)");
                    System.out.println();
                    
                    /*System.out.println("Which train would you prefer?");
                    train1=sc.nextInt();*/
                    
                    System.out.println("Enter the time you want to travel...");
                    System.out.println("1. DAY\n2. NIGHT");
                    System.out.println();
                    
                    time1 = sc.nextInt();
                    
                    System.out.println("********** \n************");
                    
                    if(time1==1)
                    {
                         System.out.println("AAA Express [1] , BBB express [2] and CCC express [3] are available...");   
                    }   
                    else
                    {
                        System.out.println("DDD express [4] and EEE express [5] are available...");
                    }
                    
                    System.out.println("********** \n************");
                    
                    System.out.println();
                    
                    System.out.println("Enter number of seats ...");
                    
                    seat1 = sc.nextInt();
                    
                    System.out.println();
                    
                    System.out.println("Enter the train you want to book...");
                    
                    System.out.println();
                    
                    train1 = sc.nextInt();
                    
                    if(train1 == 1)
                    {
                        if(seat1 > 10)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 2)
                    {
                        if(seat1 > 19)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 3)
                    {
                        if(seat1 > 60)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 4)
                    {
                        if(seat1 > 104)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 5)
                    {
                        if(seat1 > 34)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    System.out.println();
                    
                    System.out.println("********** \n************");
                    System.out.println("Your ticket(s) is/are ready!!!");
                    System.out.println();
                    
                    System.out.print('\u000C');
                    
                    
                    
                    System.out.println("Name: "+userName);
                    System.out.println("Destination: "+place[choice-1]);
                    System.out.println("Train Name: "+ train[train1-1]);
                    System.out.println("Number of seats: "+seat1);
                    System.out.println("Time: "+t[time1 - 1]);
                    
                    System.out.println();
                    
                    
            break;
            
            
            case 2:System.out.println("There are 5 available trains ...");
            System.out.println();
                    System.out.println("1. AAA Express  (10 seats)");
                    System.out.println("2. BBB Express  (19seats)");
                    System.out.println("3. CCC Express  (60 seats)");
                    System.out.println("4. DDD Express  (102 seats)");
                    System.out.println("5. EEE Express  (34 seats)");
                    System.out.println();
                    
                    /*System.out.println("Which train would you prefer?");
                    train1=sc.nextInt();*/
                    
                    System.out.println("Enter the time you want to travel...");
                    System.out.println("1. DAY\n2. NIGHT");
                    System.out.println();
                    
                    time1 = sc.nextInt();
                    
                    System.out.println("********** \n************");
                    
                    if(time1==1)
                    {
                         System.out.println("AAA Express [1] , BBB express [2] and CCC express [3] are available...");   
                    }   
                    else
                    {
                        System.out.println("DDD express [4] and EEE express [5] are available...");
                    }
                    
                    System.out.println("********** \n************");
                    
                    System.out.println();
                    
                    System.out.println("Enter number of seats ...");
                    
                    seat1 = sc.nextInt();
                    
                    System.out.println();
                    
                    System.out.println("Enter the train you want to book...");
                    
                    System.out.println();
                    
                    train1 = sc.nextInt();
                    
                    if(train1 == 1)
                    {
                        if(seat1 > 10)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 2)
                    {
                        if(seat1 > 19)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 3)
                    {
                        if(seat1 > 60)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 4)
                    {
                        if(seat1 > 104)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 5)
                    {
                        if(seat1 > 34)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    System.out.println();
                    
                    System.out.println("********** \n************");
                    System.out.println("Your ticket(s) is/are ready!!!");
                    System.out.println();
                    
                    System.out.print('\u000C');
                    
                    System.out.println("Name: "+userName);
                    System.out.println("Destination: "+place[choice-1]);
                    System.out.println("Train Name: "+ train[train1-1]);
                    System.out.println("Number of seats: "+seat1);
                    System.out.println("Time: "+t[time1 - 1]);
                    
                    System.out.println();
                    
                    
            break;
            
            
            case 3:System.out.println("There are 5 available trains ...");
            System.out.println();
                    System.out.println("1. AAA Express  (10 seats)");
                    System.out.println("2. BBB Express  (19seats)");
                    System.out.println("3. CCC Express  (60 seats)");
                    System.out.println("4. DDD Express  (102 seats)");
                    System.out.println("5. EEE Express  (34 seats)");
                    System.out.println();
                    
                    /*System.out.println("Which train would you prefer?");
                    train1=sc.nextInt();*/
                    
                    System.out.println("Enter the time you want to travel...");
                    System.out.println("1. DAY\n2. NIGHT");
                    System.out.println();
                    
                    time1 = sc.nextInt();
                    
                    System.out.println("********** \n************");
                    
                    if(time1==1)
                    {
                         System.out.println("AAA Express [1] , BBB express [2] and CCC express [3] are available...");   
                    }   
                    else
                    {
                        System.out.println("DDD express [4] and EEE express [5] are available...");
                    }
                    
                    System.out.println("********** \n************");
                    
                    System.out.println();
                    
                    System.out.println("Enter number of seats ...");
                    
                    seat1 = sc.nextInt();
                    
                    System.out.println();
                    
                    System.out.println("Enter the train you want to book...");
                    
                    System.out.println();
                    
                    train1 = sc.nextInt();
                    
                    if(train1 == 1)
                    {
                        if(seat1 > 10)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 2)
                    {
                        if(seat1 > 19)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 3)
                    {
                        if(seat1 > 60)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 4)
                    {
                        if(seat1 > 104)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 5)
                    {
                        if(seat1 > 34)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    System.out.println();
                    
                    System.out.println("********** \n************");
                    System.out.println("Your ticket(s) is/are ready!!!");
                    System.out.println();
                    
                    System.out.print('\u000C');
                    
                    System.out.println("Name: "+userName);
                    System.out.println("Destination: "+place[choice-1]);
                    System.out.println("Train Name: "+ train[train1-1]);
                    System.out.println("Number of seats: "+seat1);
                    System.out.println("Time: "+t[time1 - 1]);
                    
                    System.out.println();
                    
                    
            break;
            
            
            case 4:System.out.println("There are 5 available trains ...");
            System.out.println();
                    System.out.println("1. AAA Express  (10 seats)");
                    System.out.println("2. BBB Express  (19seats)");
                    System.out.println("3. CCC Express  (60 seats)");
                    System.out.println("4. DDD Express  (102 seats)");
                    System.out.println("5. EEE Express  (34 seats)");
                    System.out.println();
                    
                    /*System.out.println("Which train would you prefer?");
                    train1=sc.nextInt();*/
                    
                    System.out.println("Enter the time you want to travel...");
                    System.out.println("1. DAY\n2. NIGHT");
                    System.out.println();
                    
                    time1 = sc.nextInt();
                    
                    System.out.println("********** \n************");
                    
                   if(time1==1)
                    {
                         System.out.println("AAA Express [1] , BBB express [2] and CCC express [3] are available...");   
                    }   
                    else
                    {
                        System.out.println("DDD express [4] and EEE express [5] are available...");
                    }
                    
                    System.out.println("********** \n************");
                    
                    System.out.println();
                    
                    System.out.println("Enter number of seats ...");
                    
                    seat1 = sc.nextInt();
                    
                    System.out.println();
                    
                    System.out.println("Enter the train you want to book...");
                    
                    System.out.println();
                    
                    train1 = sc.nextInt();
                    
                    if(train1 == 1)
                    {
                        if(seat1 > 10)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 2)
                    {
                        if(seat1 > 19)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 3)
                    {
                        if(seat1 > 60)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 4)
                    {
                        if(seat1 > 104)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 5)
                    {
                        if(seat1 > 34)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    System.out.println();
                    
                    System.out.println("********** \n************");
                    System.out.println("Your ticket(s) is/are ready!!!");
                    System.out.println();
                    
                    System.out.print('\u000C');
                    
                    System.out.println("Name: "+userName);
                    System.out.println("Destination: "+place[choice-1]);
                    System.out.println("Train Name: "+ train[train1-1]);
                    System.out.println("Number of seats: "+seat1);
                    System.out.println("Time: "+t[time1 - 1]);
                    
                    System.out.println();
                    
                    
            break;
            case 5:System.out.println("There are 5 available trains ...");
            System.out.println();
                    System.out.println("1. AAA Express  (10 seats)");
                    System.out.println("2. BBB Express  (19seats)");
                    System.out.println("3. CCC Express  (60 seats)");
                    System.out.println("4. DDD Express  (102 seats)");
                    System.out.println("5. EEE Express  (34 seats)");
                    System.out.println();
                    
                    /*System.out.println("Which train would you prefer?");
                    train1=sc.nextInt();*/
                    
                    System.out.println("Enter the time you want to travel...");
                    System.out.println("1. DAY\n2. NIGHT");
                    System.out.println();
                    
                    time1 = sc.nextInt();
                    
                    System.out.println("********** \n************");
                    
                    if(time1==1)
                    {
                         System.out.println("AAA Express [1] , BBB express [2] and CCC express [3] are available...");   
                    }   
                    else
                    {
                        System.out.println("DDD express [4] and EEE express [5] are available...");
                    }
                    
                    System.out.println("********** \n************");
                    
                    System.out.println();
                    
                    System.out.println("Enter number of seats ...");
                    
                    seat1 = sc.nextInt();
                    
                    System.out.println();
                    
                    System.out.println("Enter the train you want to book...");
                    
                    System.out.println();
                    
                    train1 = sc.nextInt();
                    
                    if(train1 == 1)
                    {
                        if(seat1 > 10)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 2)
                    {
                        if(seat1 > 19)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 3)
                    {
                        if(seat1 > 60)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 4)
                    {
                        if(seat1 > 104)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    if(train1 == 5)
                    {
                        if(seat1 > 34)
                        {
                            System.out.println("No more seats available !!! \nTry Again");
                            seat1 = sc.nextInt();
                        }
                    }
                    System.out.println();
                    
                    System.out.println("********** \n************");
                    System.out.println("Your ticket(s) is/are ready!!!");
                    System.out.println();
                    
                    System.out.print('\u000C');
                    
                    
                    System.out.println("Name: "+userName);
                    System.out.println("Destination: "+place[choice-1]);
                    System.out.println("Train Name: "+ train[train1-1]);
                    System.out.println("Number of seats: "+seat1);
                    System.out.println("Time: "+t[time1 - 1]);
                    
                    System.out.println();
                    
                    
            break;
        }
        System.out.println();
        System.out.println("Thank You :)");  
    }
}
