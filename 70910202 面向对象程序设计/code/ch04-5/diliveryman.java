import java.util.Date;
import java.util.Scanner;

class Person {
	private String id;
	private String name;
	private Date birthday;
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Person() {
		super();
	}
	
	public Person(String id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
}

class DeliveryMan extends Person {
	
	private String[] deliveryArea;	

	public void setDeliveryArea(String[] deliveryArea) {
		this.deliveryArea = deliveryArea;
	}
	
	public boolean isArrived(String area){
		for(String d: deliveryArea) {
if (d.equalsIgnoreCase(area)) {
return true;
}
}
return false;
	}
	
	public String toString(){
	String str = "Id:" + getId() + "\nName:" + getName() + "\ndelivery area:";
int i;
for(i = 0;i<deliveryArea.length-1;i++){
str += deliveryArea[i] + ",";
}
return str + deliveryArea[i];
}
}

class Test {
	public static void main(String[] args) {
		
                DeliveryMan ds = new DeliveryMan();
		
		ds.setId("007");
		ds.setName("Bang");
		ds.setDeliveryArea(new String[]{"area1","area2","area3","area4","area5"});
   	  
		System.out.println("deliveryMan info");
		System.out.println(ds.toString());
		System.out.println();
		
		System.out.println("input area name:");
		Scanner scn = new Scanner(System.in);
		String area=scn.next();
		
		if(ds.isArrived(area)){
			System.out.println("yes");
		}else{
			System.out.println("sorry");
		}
	}
}



