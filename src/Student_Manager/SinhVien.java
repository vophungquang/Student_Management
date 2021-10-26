package Student_Manager;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SinhVien extends ConNguoi {
	private String nganh;
	private int MSSV = 0, NK = 0;
	public SinhVien() {}
	public SinhVien(String ten, String nganh, int tuoi, int MSSV, int NK) {
		super(ten,tuoi);
		this.nganh = nganh;
		this.MSSV = MSSV;
		this.NK = NK;
	}
	public String getNganh() {return nganh;}
	public void setNganh(String nganh) {this.nganh = nganh;}
	public int getMSSV() {return MSSV;}
	public void setMSSV(int MSSV) {this.MSSV = MSSV;}
	public int getNK() {return NK;}
	public void setNK(int NK) {this.NK = NK;}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		do {
		try {
		System.out.print("Ten: ");
		this.ten = sc.nextLine();
		System.out.print("Chuyen nganh( Hoa, Toan, Sinh, Ly, DTVT ): ");
		this.nganh = sc.nextLine();
		if(!(this.nganh.equalsIgnoreCase("Hoa") || this.nganh.equalsIgnoreCase("Ly") 
				|| this.nganh.equalsIgnoreCase("Toan") || this.nganh.equalsIgnoreCase("Sinh") 
				||this.nganh.equalsIgnoreCase("DTVT")))
			throw new Exception("Nhap sai chuyen nganh");
		System.out.print("Tuoi: ");
		this.tuoi = sc.nextInt();
		System.out.print("MSSV: ");
		this.MSSV = sc.nextInt();
		if(this.MSSV<1000000 || this.MSSV>10000000)
			throw new Exception("MSSV khong hop le");
		System.out.print("Nien khoa: ");
		this.NK = sc.nextInt();
		if(this.ten.isEmpty() || this.nganh.isEmpty() || this.tuoi == 0 || this.MSSV == 0 || this.NK == 0 ) 
			throw new Exception("Con thieu thong tin chua nhap.\n");
		done = true;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Nhap sai kieu du lieu");
			sc.nextLine();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.nextLine();
	}while(!done); 
	}
	@Override
	public String toString() {
		return "MSSV: " + this.MSSV + "\n" +
				"Ten: " +  this.ten + "\n" + 
				"Tuoi: " + this.tuoi + "\n" + 
				"Nganh: " + this.nganh + "\n" +
				"Nien khoa: " + this.NK + "\n";
	}
}
