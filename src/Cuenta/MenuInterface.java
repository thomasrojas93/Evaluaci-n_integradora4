package Cuenta;

/**
 * Intefaz que define operaciones relacionadas a desplegar un menu y seleccionar
 * una opcion.
 */
public interface MenuInterface {
	/**
	 * Muestra el menú principal y permite al usuario seleccionar una opción.
	 */
	void mostrar();

	/**
	 * Muestra el menú principal en la consola.
	 */
	void mostrarMenuPrincipal();

	/**
	 * Maneja la opción seleccionada por el usuario.
	 * 
	 * @param opcion La opción seleccionada por el usuario.
	 */
	void manejarOpcion(int opcion);

}
