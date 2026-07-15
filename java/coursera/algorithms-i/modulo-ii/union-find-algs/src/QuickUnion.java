public class QuickUnion {
	private int[] id;
	
	public QuickUnion(int N) {// Inicializa o array com números de 0 a N - O(N)
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	private int root(int i) { // Busca o nó pai do elemento i até chegar na raíz - O(N), depende do tamanho da árvore
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public void union(int p, int q) { // Altera a raiz de p para apontar para a raiz de q - O(N), depende do tamanho da árvore
		int rootP = root(p);
		int rootQ = root(q);
		
		if (rootP == rootQ) {
			return;
		}
		
		id[rootP] = rootQ;
	}
	
	public boolean connected(int p, int q) { // Checa se p e q estão conectados com base em suas raízes - O(N), depende do tamanho da árvore
		return root(p) == root(q);
	}
}