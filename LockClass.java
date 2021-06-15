
public class Lock {
	//Name: Akarsh
	//Purpose: create lock class
	//Date: 2020-10-27

	private int key;
	private boolean lockStatus;
	
	public static int howMany = 0;
	

	public Lock(int key){
		//Create a lock that is initially open
		this.key = key;
		}//Lock

		public void close(){
		//Close the lock
		this.lockStatus = false;
		}//close

		public boolean isOpen(){
		//Return true if the lock is open 
			if (lockStatus==true) {
				return true;
			}
			else {
				return false;
			}
		}//isOpen

		public void open(int key){
		//Open the lock if and only if the parameter key matches the lock’s own key. 
		//If the lock is closed and the keys do not match, count the failed attempt. 
		//If the same lock receives three or more failed attempts in a row, print the message “ALARM”.
			
			if (key==this.key) {
				this.lockStatus = true;
			}
			else if(key!=this.key) {
				howMany++;
				if(howMany==3) {
					System.out.println("ALARM");
				}
				this.lockStatus = false;
			}
		}//open

}






//Lock class is above and the code below tests the class above.








public class LockTester {

	public static void main(String [] args)

	{

	Lock lock1 = new Lock(111);
	Lock lock2 = new Lock(222);

	lock1.close();
	lock2.close();

	System.out.println(lock1.isOpen()); 		//prints false

	lock1.open(123);					//fails to open lock1
	lock1.open(456);					//fails to open lock1
	lock2.open(222);					//opens lock2
	lock1.open(789); 					//fails – prints ALARM
	lock1.open(111); 					//opens lock1
	}


}


