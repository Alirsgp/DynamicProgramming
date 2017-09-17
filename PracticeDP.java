
//Typical Recursive solution for fibonacci; O(2^n)
class PracticeDP {
	public int fibRec(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return fibRec(x - 1) + fibRec(x - 2);
			
		}
	}

	
//Bottom-up solution for fibonacci sequence using dynamic programming; O(n)
	public int fibDP(int x) {
		//Lets say where x = 5, fib[] has a size of 6
		int fib[] = new int[x + 1];
		//We know fib[0] and fib[1] have to be 0 and 1 in a fibonacci sequence
		fib[0] = 0;
		fib[1] = 1;
		//We start iterating at i = 2
		for (int i = 2; i < x + 1; i++) {
			//fib[2] is equal to 1 + 0, which is 1. fib[3] is equal to 1 + 1, which is 2
			//fib[4] is equal to 2 + 1, which is 3. fib[5] is equal to 3 + 2, which is 5.
			fib[i] = fib[i - 1] + fib[i - 2];
			//Program stops after fib[5], as we have fib[0], fib[1], fib[2], fib[3], fib[4],
			//and fib[5] (size of 6 is met, i has now met the condition i < x + 1).
		}
		//fib[x] is fib[5], which we calculated to be 5.
		return fib[x];
	}
}
