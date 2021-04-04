import java.lang.Math;

class MersenneQ33{
	public static void main(String args[]){
		int num = 255;
		double temp = Math.log(num + 1)/Math.log(2);
		//System.out.println(temp);
		if( temp == (int) temp ){
			System.out.println("Mersenne number");
		}
	}
}
