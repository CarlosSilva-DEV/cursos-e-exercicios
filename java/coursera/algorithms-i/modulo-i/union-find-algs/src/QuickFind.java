public class QuickFind {
	private int[] id;
	
	public QuickFind(int N) { // Inicializa o array com números de 0 a N - O(N)
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	public void union(int p, int q) { // Altera todas as entradas com id[p] para id[q] - O(N)
		int pid = id[p];
		int qid = id[q];
		
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid) {
				id[i] = qid;
			}
		}
	}
	
	public boolean connected(int p, int q) { // Checa se p e q estão conectados - O(1)
		return id[p] == id[q];
	}
}