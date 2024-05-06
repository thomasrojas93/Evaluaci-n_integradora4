package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Clase de prueba para la clase User que verifica su constructor y métodos setters.
 */
class UserTest {
	/**
     * Test del constructor de la clase User.
     */
	@Test
	public void testConstructor() {
        /**
         *  Crear un usuario de prueba
         */
        User user = new User("Pedro", "key1234");

        /**
         * Verifica que los valores se establecieron correctamente en el constructor.
         */
        assertEquals("Pedro", user.getName());
        assertEquals("key1234", user.getPass());
    }
	/**
     * Prueba los métodos setters.
     */
	  public void testSetters() {
	        /**
	         * Creamos un usuario de prueba
	         */
	        User user = new User("Leto", "arra123");

	        /**
	         *  Cambiamos el nombre y la contraseña
	         */
	        user.setName("Feyd");
	        user.setPass("newarra123");

	        /**
	         *  Verificamos que los valores se actualizaron correctamente
	         */
	        assertEquals("Feyd", user.getName());
	        assertEquals("newarra123", user.getPass());
	    }
}
