public class HashTable {

    private int numBuckets;
    private LinkedList[] ht;
    private boolean DEBUG = true;

    //default constructor
    HashTable(){
	//10 buckets by default
	numBuckets = 10;
	ht = new LinkedList[numBuckets];
	for(int i = 0; i < ht.length; i++){
	    ht[i] = new LinkedList();
	}
    }

    HashTable(int numBuckets){
	this.numBuckets = numBuckets;
	ht = new LinkedList[numBuckets];
	for(int i = 0; i < ht.length; i++){
	    ht[i] = new LinkedList();
	}
    }

    
    //Inserts an integer into the hashtable
    public void insertToHT(int input){
	//hash
	int hashValue = input % numBuckets;
	
	if(ht[hashValue].head != null && DEBUG){
	    System.out.println("Collision");
	}
	
	ht[hashValue].insertInBack(input);
	
    }

    //prints out the hashtable array
    public void printHashTableState(){
	System.out.print("|");
	for(int i = 0; i < ht.length; i++){
	    ht[i].printLL();
	    if(i != ht.length-1) System.out.print(", ");
	}
	System.out.print("|");
	System.out.println();
    }

    //returns the number of buckets
    public int getBuckets(){
	return this.numBuckets;
    }
    
}
