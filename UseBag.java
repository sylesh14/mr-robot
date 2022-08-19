package collections3;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseBag {
	public static void main (String[] args) {
		
		Bag b1 = new Bag("Bho", 100, 3, false);
		Bag b2 = new Bag("Cello", 150, 4, true);
		Bag b3 = new Bag("Ohb", 200, 5, false);
		Bag b4 = new Bag("Shaka", 300, 6, false);
		Bag b5 = new Bag("Nago", 450, 3, true);
		
		HashMap <String, Bag> b = new HashMap <> ();
		b.put(b1.getBrand(), b1);
		b.put(b2.getBrand(), b2);
		b.put(b3.getBrand(), b3);
		b.put(b4.getBrand(), b4);
		b.put(b5.getBrand(), b5);
		
	//	b.values().stream().filter(x -> x.getPrice() < 300).forEach(y -> System.out.println(y));
	  List <String> hf = b.values().stream().filter(x->x.getIsWaterProof()==true).map(y->y.getBrand()).collect(Collectors.toList());
	     System.out.println(hf);
	}
}
class Bag {
	
	private String brand;
	private int price;
	private int zips;
	private boolean isWaterProof;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getZips() {
		return zips;
	}
	public void setZips(int zips) {
		this.zips = zips;
	}
	public boolean getIsWaterProof() {
		return isWaterProof;
	}
	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof = isWaterProof;
	}
	public Bag(String brand, int price, int zips, boolean isWaterProof) {
		super();
		this.brand = brand;
		this.price = price;
		this.zips = zips;
		this.isWaterProof = isWaterProof;
	}
	@Override
	public String toString() {
		return "Bag [brand=" + brand + ", price=" + price + ", zips=" + zips + ", isWaterProof=" + isWaterProof + "]";
	}
	
	
	
}