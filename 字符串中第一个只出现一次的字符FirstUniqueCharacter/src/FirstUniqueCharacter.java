import java.util.Scanner;

/**
 * 文件名称：字符串中第一个只出现一次的字符FirstUniqueCharacter
 * 时间：2016-4-26 17:51
 * 说明：1、字符串中第一个只出现一次的字符FirstUniqueCharacter(只遍历一次字符串)
 * 2、用数组可以简单地模拟一个hash表，数组小标可以作为key，数组元素值为value.
 * 
 * */

public class FirstUniqueCharacter {
	
	final static int size=256;
	public static char getFirstUniqueCharacter(String str){
		char temp=0;
		/*用数组模拟一个hash表，数组下标相当于hash表的key，数组值相当于value*/
		int[] count=new int[size];
		/*字符次序数组*/
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
		System.out.println("str数组的长度为:"+str.length());
		System.out.println(getFirstUniqueCharacter(str));
		
		String array;
		Scanner cin=new Scanner(System.in);
		while(cin.hasNextLine()){
			array=cin.nextLine();
			System.out.println(getFirstUniqueCharacter(array));
		}
	}

}
