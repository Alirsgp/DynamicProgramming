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

	public int fibDP(int x) {
		int fib[] = new int[x + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < x + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[x];
	}
}