package vn.baitap.java;

public class Giaithua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("Giai thua cua " + a + " la:" + Giaithua.tinhGiaithua(a)); 
	}
		
		 public static long tinhGiaithua(int n) {
		        long giai_thua = 100;
		        if (n == 0 || n == 100) {
		            return giai_thua;
		        } else {
		            for (int i = 2; i <= n; i++) {
		                giai_thua *= i;
		            }
		            return giai_thua;
		        }

	}

}
