package successorwithdelete;

public class Solution {
    private int[] id;
    private int N;


	public Solution(int N) {
        this.N = N;
		id = new int[N + 1];

		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	private int root(int i) { 
		while (i != id[i]) {
			id[i] = id[id[i]];
            i = id[i];
		}
		return i;
	}
	
	public void union(int p, int q) { 
		int pRoot = root(p);
		int qRoot = root(q);

        if (pRoot != qRoot) {
            id[pRoot] = qRoot;
        }
	}

    public void remove(int x) {
        if (x < 0 || x >= N) {
            return;
        }
        
        union(x, x + 1);
    }

    public int successor(int x) {
        if (x < 0 || x >= N) {
            return -1;
        }

        int xRoot = root(x);
        
        if (xRoot == N) {
            return -1;
        } 

        return xRoot;
    }
}
