class car_oop
{
	public String car_color;
	public String car_brand;
	public String fuel_type;
	public float mileage;
	public void start()
	{
		System.out.println("Car starts");
	}
	public void stop()
	{
		System.out.println("Car stops");
	}
	public void service()
	{
		System.out.println("Car service");
	}
	public static void main(String [] args){
  			// object 1 creation
			car car1= new car();
			car1.car_color="White";
			car1.car_brand="Toyota";
			car1.fuel_type="Diesel";
			car1.mileage=13.8F;

			//calling methods for object 1
			car1.start();
			car1.stop();
			car1.service();
			System.out.println("Color of the car1 is "+car1.car_color);
			System.out.println("Brand of the car1 is "+car1.car_brand);
			System.out.println("Fuel type of the car1 is "+car1.fuel_type);
			System.out.println("Mileage of the car1 is"+car1.mileage);
	

	          	
			// object 2 creation
			car car2= new car();
			car2.car_color="Black";
			car2.car_brand="Mahindra";
			car2.fuel_type="Diesel";
			car2.mileage=17.3F;
				
			// calling methods for object 2
                        car2.start();
			car2.stop();
			car2.service();
			System.out.println("Color of the car2 is "+car2.car_color);
			System.out.println("Brand of the car2 is "+car2.car_brand);
			System.out.println("Fuel type of the car2 is "+car2.fuel_type);
			System.out.println("Mileage of the car2 is"+car2.mileage);
						

			//object 3 creation
			car car3= new car();
			car3.car_color="Brown";
			car3.car_brand="Ford";
			car3.fuel_type="Diesel";
			car3.mileage=15.5F;
    			
			// calling methods for object 3
			car3.start();
			car3.stop();
			car3.service();
			System.out.println("Color of the car3 is "+car3.car_color);
			System.out.println("Brand of the car3 is "+car3.car_brand);
			System.out.println("Fuel type of the car3 is "+car3.fuel_type);
			System.out.println("Mileage of the car3 is"+car3.mileage);
	}

}
