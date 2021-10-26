package Student_Manager;
public abstract class ConNguoi {
	protected String ten;
	protected int tuoi = 0;
	public ConNguoi() {}
	public ConNguoi(String ten,int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}
	public String getTen() {return ten;}
	public void setTen(String ten) {this.ten = ten;}
	public int getTuoi() {return tuoi;}
	public void setTuoi(int tuoi) {this.tuoi = tuoi;}
	public abstract String toString();

}
