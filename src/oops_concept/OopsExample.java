package oops_concept;

public class OopsExample {
	/*class Bicycle {
	    // the Bicycle class has two fields
	    public int gear;
	    public int speed;
	 
	    // the Bicycle class has one constructor
	    public Bicycle(int gear, int speed)
	    {
	        this.gear = gear;
	        this.speed = speed;
	    }
	 
	    // the Bicycle class has three methods
	    public void applyBrake(int decrement)
	    {
	        speed -= decrement;
	    }
	 
	    public void speedUp(int increment)
	    {
	        speed += increment;
	    }
	 
	    // toString() method to print info of Bicycle
	    public String toString()
	    {
	        return ("No of gears are " + gear + "\n"
	                + "speed of bicycle is " + speed);
	    }
	}
	 
	// derived class
	class MountainBike extends Bicycle {
	 
	    // the MountainBike subclass adds one more field
	    public int seatHeight;
	 
	    // the MountainBike subclass has one constructor
	    public MountainBike(int gear, int speed,
	                        int startHeight)
	    {
	        // invoking base-class(Bicycle) constructor
	        super(gear, speed);
	        seatHeight = startHeight;
	    }
	 
	    // the MountainBike subclass adds one more method
	    public void setHeight(int newValue)
	    {
	        seatHeight = newValue;
	    }
	 
	    // overriding toString() method
	    // of Bicycle to print more info
	    @Override public String toString()
	    {
	        return (super.toString() + "\nseat height is "
	                + seatHeight);
	    }
	}*/
	 
	// driver class
	//public class Test {
	 /*   public static void main(String args[])
	    {
	    	class2 n=new class2();
	    	n.add();
	    	n.walk();
	    	n.play();
	    	n.run();
	 
	       /* MountainBike mb = new MountainBike(3, 100, 25);
	        System.out.println(mb.toString());
	    }
	}z
		Class1 cls = new Class1(); 
		Class2 cls1 = new Class2();
		System.out.println();*/
		
		//Class1 cls=new Class1();
		//System.out.println(cls.text1());

	//	Class1 cls=new Class1();
	//	Class2 cls1=new Class2();
	//	cls.eat();
	 //   cls1.walk();
		
		
		
		public static void main(String[] args) {
			Class1 c1=new Class1();
			class2 c2=new class2();
			//System.out.println(c1.add(2, 3));
			System.out.println(c1.add());
			System.out.println(c1.sub(2, 1));	
			System.out.println(c2.multi(2,3));
			System.out.println(c2.div(10, 2));
		}
	

	

}

