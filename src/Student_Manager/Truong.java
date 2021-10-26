package Student_Manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Truong implements BoSung {
	Scanner sc = new Scanner(System.in);
	private List<SinhVien> listSV = new ArrayList();
	public void NhapSinhVien() {
		System.out.print("So luong: ");
		int n = sc.nextInt();
		if ((listSV.size() + n) > 500) 
			System.out.println("Khong du cho trong");
		else
			for(int i = 0; i<n ; i++) {
				SinhVien SinhVien = new SinhVien();
				SinhVien.Nhap();
				listSV.add(SinhVien);
			}
	}
	public void XuatDSSV() {
		System.out.println("Danh sach\n");
		for (int i = 0; i < listSV.size(); i++) {
			System.out.println(listSV.get(i).toString());
		}
	}
	public void XoaSinhVien() {
			System.out.print("Vi tri can xoa: ");
			int VT = sc.nextInt();
			for (int i = 0; i < listSV.size(); i++) {
				if ((VT - 1) == i) {
					listSV.remove(i);
					return;
				}
			}
		}
	public void SapXepMS() {
			for (int i = 0; i < listSV.size() - 1; i++) {
				for (int j = i + 1; j < listSV.size(); j++) {
					if (listSV.get(i).getMSSV() > listSV.get(j).getMSSV()) {
						SinhVien temp = listSV.get(j);
						listSV.set(j, listSV.get(i));
						listSV.set(i, temp);
					}
				}
			}
		}
	public void ChinhSua() {
		System.out.print("Nhap vi tri can chinh sua: ");
		int VT = sc.nextInt();
			for (int i = 0; i < listSV.size(); i++) {
				if ((VT - 1) == i) {
					SinhVien SinhVien = new SinhVien();
					SinhVien.Nhap();
					listSV.set(i, SinhVien);
				}
			}
		}
	public void QuanLi() {
		int n;
		do {
			System.out.println("1 - Nhap/Them sinh vien vao danh sach");
			System.out.println("2 - Hien thi danh sach");
			System.out.println("3 - Xoa sinh vien (theo vi tri)");
			System.out.println("4 - Chinh sua thong tin sinh vien");
			System.out.println("5 - Sap xep theo ma so sinh vien");
			System.out.println("6 - Thoat chuong trinh");
			System.out.print("\nChuc nang muon thuc hien: ");
			n = sc.nextInt();
			switch (n) {
			case 1: NhapSinhVien();break;
			case 2: XuatDSSV();break;
			case 3: XoaSinhVien();break;
			case 4: ChinhSua();break;
			case 5: SapXepMS();break;
			}
		} while (n > 0 && n < 6);
	}
}
