package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address); //호스트이름과 ip주소값
			System.out.println(address.getHostName()); //호스트이름 (도메인이름)
			System.out.println(address.getHostAddress()); //ip주소 	
			} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
