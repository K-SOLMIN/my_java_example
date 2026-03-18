package ch18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressDemo {

	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;
		InetAddress[] addArr = null;
		String url = "www.hanbit.co.kr";
		
		try {
			addr1 = InetAddress.getByName(url);
			addr2 = InetAddress.getLocalHost();
			addArr = InetAddress.getAllByName(url);
			System.out.println("hostname없는 (ip만) : " + addr2.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("한빛 ip주소 : " + addr1 + " localHost : " + addr2);
		System.out.println("getAllByName : " + Arrays.toString(addArr));
	}

}
