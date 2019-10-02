import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class Sample10 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请输入一个整数");
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in));
		String str1=br1.readLine();
		int num=Integer.parseInt(str1);
		System.out.println("您输入的数字是:"+num);
		System.out.println("请输入字串");
		BufferedReader br2=
				new BufferedReader(new InputStreamReader(System.in));
		String str2=br2.readLine();
		System.out.println("刚刚输入的字串是:"+str2);
		
	}

}
