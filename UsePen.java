package collections3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UsePen {
	public static void main (String[] args) {
		
		Pen p1 = new Pen("Rynolds", 20, true);
		Pen p2 = new Pen("Cello", 30,false);
		Pen p3 = new Pen("parker", 80, true);
		Pen p4 = new Pen("Natarajan", 100, false);
		
		HashMap <String, Pen> pens = new HashMap <> ();
		pens.put(p1.getBrand(), p1);
		pens.put(p2.getBrand(), p2);
		pens.put(p3.getBrand(), p3);
		pens.put(p4.getBrand(), p4);
		
		
        /*  for(String p: pens.keySet()) {
        	  System.out.println(pens.get(p));
          } */
          
         /* ArrayList <Pen> wpens = new ArrayList <> ();
          for(Pen k: pens.values()) {
        	  wpens.add(k);
          }
          System.out.println(wpens); */
		
	/*	HashMap <String, Pen> wr = new HashMap <> ();
		
		pens.forEach((x,y )-> {	
		wr.put(x,y);
		});
		System.out.println(wr); */
		
		ArrayList <Pen> hg = new ArrayList <> ();
		pens.values().forEach(u -> {
			hg.add(u);
		});
		System.out.println(hg); 
		
		Map <String, Pen> j = pens.values().stream().collect(Collectors.toMap(i->i.getBrand(), o->o));
		System.out.println(j);
		
	}
}
class Pen {
	
	private String brand;
	private int price;
	private boolean isBluePen;
	
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
	public boolean isBluePen() {
		return isBluePen;
	}
	public void setBluePen(boolean isBluePen) {
		this.isBluePen = isBluePen;
	}
	public Pen(String brand, int price, boolean isBluePen) {
		super();
		this.brand = brand;
		this.price = price;
		this.isBluePen = isBluePen;
	}
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + ", isBluePen=" + isBluePen + "]";
	}
	
	
	
}
