package labwork;

import java.util.Scanner;

class Main {

	public static void main (String[] args) 
	{
		
			// TODO Auto-generated method stub
			while (true) {
				System.out.println("Choose any one vehicle:\n\n1.Car\n2.Bus\n3.Ship\n4.Boat\n5.Aeroplane\n6.Helicopter\n");
				Scanner scan = new Scanner(System.in);
				int ch;
				ch=scan.nextInt();
				
				 try {
					 
					 if(ch==1)
						{
							System.out.println("Input speed: ");
							int speed=scan.nextInt();
							Car x=new Car(speed);
						}
						else if(ch==2)
						{
							System.out.println("Input speed: ");
							int speed=scan.nextInt();
							Bus x=new Bus(speed);
						}
						else if(ch==3)
						{
							System.out.println("Input speed: ");
							int speed=scan.nextInt();
							Ship x=new Ship(speed);
						}
						else if(ch==4)
						{
							System.out.println("Input speed: ");
							int speed=scan.nextInt();
							Boat x=new Boat(speed);
						}
						else if(ch==5)
						{
							System.out.println("Input speed: ");
							int speed=scan.nextInt();
							Plane x=new Plane(speed);
						}
						else if(ch==6)
						{
							System.out.println("Input speed: ");
							int speed=scan.nextInt();
							Chopper x=new Chopper(speed);
						}
					}
				 catch (Exception excep) {
					 System.out.println(excep.getMessage());
				 }
				
			}
				 		 
		}
}
