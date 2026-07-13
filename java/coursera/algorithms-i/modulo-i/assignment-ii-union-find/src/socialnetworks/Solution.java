package socialnetworks;

public class Solution {
private int[] parent;
private int[] size;
private int count;

    public Solution(int N) {
        this.parent = new int[N];
		this.size = new int[N];
        this.count = N;

		for (int i = 0; i < N; i++) {
			parent[i] = i;
			size[i] = 1; 
		}
	}
	
	private int root(int node) {
		while (node != parent[node]) {
			parent[node] = parent[parent[node]];
            node = parent[node];
		}
		return node;
	}
	
	public boolean union(int p, int q) {
		int pRoot = root(p);
		int qRoot = root(q);
		
		if (pRoot == qRoot) {
			return false;
		}
		
		if (size[pRoot] < size[qRoot]) {
			parent[pRoot] = qRoot;
			size[qRoot] += size[pRoot];
		} else {
			parent[qRoot] = pRoot;
			size[pRoot] += size[qRoot];
		}

        count--;
        return true;
	}
	
	public boolean connected() { 
		return count == 1;
	}
}
