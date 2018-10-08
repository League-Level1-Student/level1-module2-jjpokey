
public class JamesBond {

	public int findCode(Vault v) {
		for(int a = 0; a < 1000000; a++) {
			if(v.tryCode(a)) {
				return a;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		JamesBond j = new JamesBond();
		Vault v = new Vault();
		System.out.println(j.findCode(v));
		
	
		
	}
}
