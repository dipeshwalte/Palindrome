public class Palindrome {
	int getPalindrome(int number){
		   int temp = number;
		   int palindrome = 0;
		   while (temp > 0)
		   {
		   int digit=temp%10;
		   palindrome = palindrome * 10 + digit;
		   temp=temp/10;
		   }
		   return palindrome;
		}
		public static void main(String[] args){
		   int number= 3212;
		   Palindrome pal = new Palindrome();
		   int result = pal.getPalindrome(number);
		   System.out.println("Palindrome :"+result);
		   }
	}

