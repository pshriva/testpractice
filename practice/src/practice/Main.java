package practice;


public class Main {
	public static void main(String args[]){
		String s1 = "1239";
		String s2 = "1239";
		String sum = getSum(s1,s2);
		System.out.println(sum);
	}

	private static String getSum(String s1, String s2) {
		// TODO Auto-generated method stub
		int i = s1.length()-1;
		int j = s2.length()-1;
		int sum = 0;
		int carry = 0;
		StringBuffer sb  = new StringBuffer();
		while(i>=0 || j >= 0){
			sum = carry;
			if(i >= 0){
				sum = sum + s1.charAt(i) - '0';
				i--;
			}if(j >= 0){
				sum = sum + s2.charAt(j) - '0';
				j--;
			}
			sb.append(sum%10);
			carry = sum/10;
		}
		if(carry >0){
			sb.append(carry);
		}
		return sb.reverse().toString();
	}
}	

