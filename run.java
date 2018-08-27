import java.util.Random;

public class run {
    public static void main(String [] argv){
	Random rand = new Random();
	HashTable myHash = new HashTable(1000);
	for(int i = 0; i < 250; i++){
	    int insertNum = rand.nextInt(10000);
	    myHash.insertToHT(insertNum);
	}
	myHash.printHashTableState();
    }
}
