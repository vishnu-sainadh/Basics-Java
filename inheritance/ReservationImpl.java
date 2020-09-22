package inheritance;
import java.util.*;
class ReservationSystem{
   private int[] seats;
   int totalBookings;

   ReservationSystem(){
   }

    ReservationSystem(int seats){
        this.seats=new int[seats];
    }

    void BookingSeats(int seatselect){
        for (int i=0;i<this.seats.length;i++){
            if ((i+1)==seatselect){
                if (this.seats[i]==1){
                    System.out.println("already book");
                    System.out.println("Check for another seat");
                    for (i=0;i<this.seats.length;i++){
                        if (this.seats[i]==1){
                            totalBookings=totalBookings+1;
                        }
                    }
                    if (totalBookings==this.seats.length){
                        System.out.println("TOTAL seats have been booked successfully...\nNo seats left...");
                        break;
                    }
                }
                else {
                    this.seats[i]=1;
                    System.out.println("Successfully booked");
                }
            }
        }
    }

    void StatusDisplay(){
        System.out.println("Seat no \t status");
        for (int i=0;i<this.seats.length;i++){
            System.out.println("\t"+(i+1)+"\t\t"+this.seats[i]);
        }
    }

    public int[] getSeat() {
        return seats;
    }

    public void setSeat(int[] seats) {
        this.seats = seats;
    }

}

class AirlinesReservationSystem extends ReservationSystem{
     int[] plane=new int[10];
     Scanner sc=new Scanner(System.in);
     static int totalCount;

     void Smoking(){
         SmokingDisplay();
         System.out.println("U have been into the smoking section");
         System.out.println("Choose a seat");

         int seatno=sc.nextInt();
         int count=0;
         int choiceSwitch=0;

         for (int i=0;i<5;i++){
             if (seatno==(i+1)){
                 if (this.plane[i]==1){
                     System.out.println("It seems to be already booked");
                     System.out.println("Check for another seat");
                     for (i=0;i<5;i++){
                         if (this.plane[i]==1){
                             count=count+1;
                             totalCount=totalCount+1;
                         }
                     }
                     if (totalCount==10){
                         System.out.println("We dont have any seats remaining....\nNext flight leaves in 3 hours...");
                         break;
                     }
                     if (count==5){
                         System.out.println("Smoking section is full....");
                         System.out.println("Will u go for non-smoking class??\t\t1 for yes\t0 for no");
                         choiceSwitch=sc.nextInt();
                     }

                 }
                 else {
                     plane[i]=1;
                     System.out.println("Successfully booked");
                 }
             }
         }
         if (choiceSwitch==1){
             NonSmoking();
         }
     }

     void NonSmoking(){
         NonSmokingDisplay();
         System.out.println("U have been into the Non smoking section");
         System.out.println("We are sooo happyyyy that u could be healthy...!!!");
         System.out.println("Hope u don't smoke...");
         System.out.println("Choose a seat...");

         int seatno=sc.nextInt();
         int count=0;
         int choiceSwitch=0;

         for (int i=5;i<10;i++){
             if (seatno==(i+1)){
                 if (this.plane[i]==1){
                     System.out.println("OOPS!....It seems to be already booked....");
                     System.out.println("Check for another seat....");
                     for (i=5;i<10;i++){
                         if (this.plane[i]==1){
                             count=count+1;
                             totalCount=totalCount+1;
                         }
                     }
                     if (totalCount==10){
                         System.out.println("We dont have any seats remaining....\nNext flight leaves in 3 hours...");
                         break;
                     }
                     if (count==5){
                         System.out.println("Non-Smoking section is full");
                         System.out.println("Will you go for Smoking class??\t\t1 for yes\t0 for no");
                     }
                 }
                 else {
                     plane[i]=1;
                     System.out.println("Successfully booked");
                 }
             }
         }

         if (choiceSwitch==1){
             Smoking();
         }


     }
     void BookPlane(){
         System.out.println("Which section will you prefer?\n 1 for smoking\t\t 2 for non-smoking");
         int section=sc.nextInt();
         switch(section){
             case 1: Smoking();
             break;
             case 2: NonSmoking();
             break;
             default:
                 System.out.println("Choose accordingly");
         }
     }

     void SmokingDisplay(){
         System.out.println("Smoking Section...\n\tseat no\t\tstatus");
         for (int i=0;i<5;i++){
             System.out.println("\t"+(i+1)+"\t\t"+plane[i]);
         }
     }

     void NonSmokingDisplay(){
         System.out.println("\nNon-Smoking Section...\n\tseat no\t\tstatus");
         for (int i=5;i<10;i++){
             System.out.println("\t"+(i+1)+"\t\t"+plane[i]);
         }
     }

    @Override
    void StatusDisplay() {
        System.out.println("Smoking Section...\n\tseat no\t\tstatus");
        for (int i=0;i<5;i++){
            System.out.println("\t"+(i+1)+"\t\t"+plane[i]);
        }
        System.out.println("\nNon-Smoking Section...\n\tseat no\t\tstatus");
        for (int i=5;i<10;i++){
            System.out.println("\t"+(i+1)+"\t\t"+plane[i]);
        }
    }
}

public class ReservationImpl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int loop=0;

        System.out.println("Which one do you want to book..??\n\t1 for RoadWays\t2 for AirWays");
        int vehicle = sc.nextInt();



       switch (vehicle){
           case 1: System.out.println("Finalize the total seating capacity: ");
               int totalSeats=sc.nextInt();
               ReservationSystem tkt=new ReservationSystem(totalSeats);

               do {
                   tkt.StatusDisplay();
                   System.out.println("Choose a seat to book: ");
                   int select = sc.nextInt();
                   tkt.BookingSeats(select);

                   System.out.println("Do you want book one more\t\t0 for cancel\t1 for continue");
                   loop=sc.nextInt();
               }while (loop==1);
               break;
           case 2: AirlinesReservationSystem tkt2=new AirlinesReservationSystem();

               do {
                   
                   tkt2.BookPlane();
                   System.out.println("Do you want book one more\t\t0 for exit\t1 for continue");
                   loop=sc.nextInt();
               }while (loop==1);
               break;
           default:
               System.out.println("Choose accordingly");

       }
    }
}
