import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class Sample10 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("������һ������");
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in));
		String str1=br1.readLine();
		int num=Integer.parseInt(str1);
		System.out.println("�������������:"+num);
		System.out.println("�������ִ�");
		BufferedReader br2=
				new BufferedReader(new InputStreamReader(System.in));
		String str2=br2.readLine();
		System.out.println("�ո�������ִ���:"+str2);
		
	}

}
