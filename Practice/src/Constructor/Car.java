package Constructor;

public class Car {
	String name;
	String modelNumber;
	int price;
	String engine;
	
	public Car(String name,String modelNumber,int price,String engine) {
		this.name=name;
		this.modelNumber=modelNumber;
		this.price=price;
		this.engine=engine;
	}
	

	
	public static void main(String[] args) {
		Car obj1=new Car("BMW","320d",10,"Automatic");
		Car obj2=new Car("Audi","A7",20,"Automatic");
		Car obj3=new Car("Honda","city",5,"Manual");
System.out.println(obj1.name+ "  "+ obj1.modelNumber+ "  "+obj1.price+ " "+ obj1.engine);
	}

}
