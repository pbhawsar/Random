
public class PowOf2OrNot {
   
	public static boolean pow2orNot(int number){
		int square = 1;
        while(number >= square){
            if(number == square){
                return true;
            }
            square = square*2;
        }
        return false;


		
	}
	public static void main(String[] args) {
		
	System.out.println(pow2orNot(1024));

	}
}
