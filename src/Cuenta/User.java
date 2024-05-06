package Cuenta;

/**
 * Clase User representa al usuario de la Billetera.
 * 
 * 
 */

public class User {
	/**
	 * Atributos El nombre de usuario del usuario y la contraseña del usuario.
	 */

	String name;
	String pass;

	/**
	 * Constructor de la clase User.
	 * 
	 * @param name El nombre de usuario del usuario.
	 * @param pass La contraseña del usuario.
	 */
	public User(String name, String pass) {

		this.name = name;
		this.pass = pass;
	}

	/**
	 * Obtiene el nombre de usuario del usuario.
	 * 
	 * @return name, El nombre del usuario.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Establece el nombre de usuario del usuario.
	 * 
	 * @param name, El nuevo nombre del usuario.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtiene la contraseña del usuario.
	 * 
	 * @return, La contraseña del usuario.
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * Establece la contraseña del usuario.
	 * 
	 * @param pass, La nueva contraseña del usuario.
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

}