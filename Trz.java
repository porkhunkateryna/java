package hw10;
interface Trz{
	int poizdky;
	String type;
	public  int getpoizdky();
	public void setpoizdky(int n);
	public String gettype();
	public void settype(String s);
	
}
abstract class Public implements Trz{
	private String districts;
	private float price;
	
	Public(){}
	Public(String type,int n,String districts,float price){
		this.type=type;
		setpoizdky(n);
		this.districts=districts;
		this.price=price;
	}
	public int getpoizdky() {
		return poizdky;
	}
	public void setpoizdky(int n) {
		poizdky=n;
	}
	public String gettype() {
		return type;
	}
	public void settype(String s) {
		this.type=s;
	}
	public String getdistricts() {
		return districts;
	}  
	public void setdistricts(String s) {
		this.districts=districts;
	}
	public String getprice() {
		return price;
	}
	public void setprice(float s) {
		this.price=s;
	}
	@Override
	public String toString() {
		return "public transport:"+ gettype()+","+getdistricts();
	}
	
class Tram extends Public{
	private String depo1;
	private String depo2;
	private int sitting;
	
	public Tram() {}
	public Tram(String type, int n, String districts,float price) {
		super(type,n,districts,price);
	}
	public Tram(String type, int n, String districts,float price, String d1, String d2, int sitting) {
		this(type,n,districts,price);
		setdepo1(d1);
		setdepo2(d2);
		setsittings(sitting);
	}
	public void setdepo1(String d1) {
		this.depo1=d1;
	}
	public void setdepo2(String d2) {
		this.depo1=d2;
	}
	public void setsittings(int sitting) {
		this.sitting=sitting;
	}
	@Override
	public String toString() {
		return "tram marshrut "+depo1+"->"+depo2+gettype()+getdistricts();
	}
}
class Trz{
	public static void main(String[] args) {
		Tram t1=new Tram("tramvay",200,"kurenevk hhh",678,"jj","jjjj",67);
		System.out.println(t1);
		
	}
}
	
		
		
	}
 
 