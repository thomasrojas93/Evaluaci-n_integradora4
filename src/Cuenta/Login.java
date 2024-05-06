package Cuenta;
/**
 * Interfaz que define operaciones relacionadas con la autenticación del usuario.
 */
public interface Login {
	 
	/**
	 * Valida la identidad de un usuario comparando su nombre de usuario y
	 * contraseña con los proporcionados.
	 * 
	 * @param newUser  Este objeto representa al usuario.
	 * @param nombre   Es el nombre de usuario a verificar.
	 * @param password La contraseña a verificar.
	 * @return true si el nombre de usuario y la contraseña coinciden con los
	 *         proporcionados, false en caso contrario.
	 */
	public static boolean validarIdentidad(User newUser, String nombre, String password) {
		// Verificamos la identidad del usuario
		return newUser.getName().equals(nombre) && newUser.getPass().equals(password);
	}
}
