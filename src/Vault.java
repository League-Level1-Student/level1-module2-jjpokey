import java.util.Random;

public class Vault {
int code;

public Vault() {
	Random rand = new Random();
	code = rand.nextInt(1000000);
}
public boolean tryCode(int guess) {
	if(code == guess) {
		return true;
	}
	return false;
}

}
