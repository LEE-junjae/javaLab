package sec05.exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.Home");
		
		System.out.println("�ü�� �̸�:"+osName);
		System.out.println("����� �̸�:"+userName);
		System.out.println("����� Ȩ���丮:"+userHome);
		
		System.out.println("-------------------");
		System.out.println("[key] value");
		System.out.println("-------------------");
		
		// map �ڷᱸ��:{key:value} ��) {StringŸ��:StringŸ��} <-- Properties
		Properties props = System.getProperties();
		// set �ڷᱸ��: ������ ����, �ڷᰡ �ߺ��� �� ����, 
		Set keys = props.keySet();
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println("["+key+"]"+value);
		}
	
	}
	
}
