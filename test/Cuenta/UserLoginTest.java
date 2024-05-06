package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Clase de prueba para la clase UserLogin que verifica el método
 * validarIdentidad.
 */
class UserLoginTest {
	/**
	 * Test que prueba el método validarIdentidad de la clase UserLogin.
	 */
	 @Test
	    public void testValidarIdentidad() {
	        // Creamos un usuario simulado utilizando Mockito
	        User usuarioSimulado = Mockito.mock(User.class);
	        
	        // Configuramos el comportamiento simulado del usuario
	        Mockito.when(usuarioSimulado.getName()).thenReturn("usuario");
	        Mockito.when(usuarioSimulado.getPass()).thenReturn("contraseña");
	        
	        // Probamos el método validarIdentidad de UserLogin
	        boolean resultado = UserLogin.validarIdentidad(usuarioSimulado, "usuario", "contraseña");
	        
	        // Verificamos que el resultado sea verdadero
	        assertTrue(resultado);
	    }
	}
//	