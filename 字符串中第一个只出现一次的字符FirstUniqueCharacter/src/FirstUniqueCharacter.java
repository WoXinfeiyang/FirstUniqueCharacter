import java.util.Scanner;

/**
 * �ļ����ƣ��ַ����е�һ��ֻ����һ�ε��ַ�FirstUniqueCharacter
 * ʱ�䣺2016-4-26 17:51
 * ˵����1���ַ����е�һ��ֻ����һ�ε��ַ�FirstUniqueCharacter(ֻ����һ���ַ���)
 * 2����������Լ򵥵�ģ��һ��hash������С�������Ϊkey������Ԫ��ֵΪvalue.
 * 
 * */

public class FirstUniqueCharacter {
	
	final static int size=256;
	public static char getFirstUniqueCharacter(String str){
		char temp=0;
		/*������ģ��һ��hash�������±��൱��hash���key������ֵ�൱��value*/
		int[] count=new int[size];
		/*�ַ���������*/
		int[] order=new int[size];
		int i=0,j=0;
		
		for(i=0;i<str.length();i++){
			temp=str.charAt(i);
			if(count[temp]==0){
				order[j++]=temp;
			}
			count[temp]++;
		}
		
		for(i=0;i<str.length();i++){
			if(count[order[i]]==1)
			{
				temp=(char) order[i];
				break;
			}
		}
		if(i>=256){
			return '#';
		}else{
			return temp;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="aAbBABaccaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbi";
		System.out.println("str����ĳ���Ϊ:"+str.length());
		System.out.println(getFirstUniqueCharacter(str));
		
		String array;
		Scanner cin=new Scanner(System.in);
		while(cin.hasNextLine()){
			array=cin.nextLine();
			System.out.println(getFirstUniqueCharacter(array));
		}
	}

}
