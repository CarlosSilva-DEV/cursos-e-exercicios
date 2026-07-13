package canonicalelement;

public class Solution {
	private int[] id;
	private int[] size;
    private int[] max;
	
	public Solution(int N) { 
		id = new int[N];
		size = new int[N];
        max = new int[N];
		
		for (int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1;
            max[i] = i;
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
		
		if (pRoot == qRoot) {
			return;
		}
		
        int maxVal = Math.max(max[pRoot], max[qRoot]);

		if (size[pRoot] < size[qRoot]) {
			id[pRoot] = qRoot;
			size[qRoot] += size[pRoot];
            max[qRoot] = maxVal;
		} else {
			id[qRoot] = pRoot;
			size[pRoot] += size[qRoot];
            max[pRoot] = maxVal;
		}
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

    public int find(int i) {
        int iRoot = root(i);
        return max[iRoot];
    }
}   
