
public class PRIME_FACTORIAL {
	public static void main(String[] args){
        primeFactors(12);
    }

    static void primeFactors(int n){
        String ans="";
        for (int i=1;i<=n;i++){
            if(n%i==0){
                ans+=i+" ";
            }
        }
        System.out.println(ans);
    }
}
