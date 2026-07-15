public class WQUPC {
	private int[] id;
	private int[] size;
	
	public WQUPC(int N) {// Inicializa o array com números de 0 a N e tamanho N - O(N)
		id = new int[N];
		size = new int[N];
		
		for (int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1; // Cada nó é iniciado com tamanho 1
		}
	}
	
	private int root(int i) { // Busca o nó pai de i e faz com que esse nó aponte para a raiz - O(N), depende do tamanho da árvore
		while (i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	public void union(int p, int q) { // Altera a raiz com base no tamanho da árvore. Se a árvore da raíz p for maior, a raíz q se torna sua filha e vice-versa - O(log N)
		int rootP = root(p);
		int rootQ = root(q);
		
		if (rootP == rootQ) {
			return;
		}
		
		if (size[rootP] < size[rootQ]) {
			id[rootP] = rootQ;
			size[rootQ] += size[rootP];
		} else {
			id[rootQ] = rootP;
			size[rootP] += size[rootQ];
		}
	}
	
	public boolean connected(int p, int q) { // Checa se p e q estão conectados com base em suas raízes - O(log N), garantido pelo union()
		return root(p) == root(q);
	}
}