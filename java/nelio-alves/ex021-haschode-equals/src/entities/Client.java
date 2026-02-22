package entities;

import java.util.Objects;

public class Client {
	private String name;
	private String email;
	
	// Construtor
	public Client() {
	}

	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	// getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// hashcode e equals
	
	/* hashCode: gera um numero inteiro para um objeto, 
	 * com base nos parâmetros a serem comparados (email, name)
	 */
	@Override
	public int hashCode() {
		return Objects.hash(email, name);
	}
	
	/* equals: compara se o objeto atual (this) é igual ao objeto do parâmetro (obj),
	 * compara se o objeto parâmetro é nulo ou se as classes de ambos são diferentes.
	 * 
	 * finaliza comparando diretamente os parâmetros de ambos.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
}
