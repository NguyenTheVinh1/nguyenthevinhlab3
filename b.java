
import java.util.Scanner;

public class b {
	private Diem A,B,C;
	TamGiac()
	{
	A= new Diem();
	B= new Diem();
	C= new Diem();
	}
	public void InTamGiac()
	{
	System.out.println("Toa do 3 dinh cua tam gia la: ");
	System.out.print("A"); A.InDiem(); 
	System.out.print("B"); B.InDiem();
	System.out.print("C"); C.InDiem();
	}
	public static void main(String[] args)
	{
	System.out.println("Nhap 3 dinh cua tam giac: ");
	TamGiac T=new TamGiac();
	T.InTamGiac();
	}

}
