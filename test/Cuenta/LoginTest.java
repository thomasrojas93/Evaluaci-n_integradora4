package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Clase de prueba para la interfaz Login.
 */
public class LoginTest {

    @Test
    public void testValidarIdentidad() {
        // Creamos un usuario simulado utilizando Mockito
        User usuarioSimulado = Mockito.mock(User.class);
        
        // Configuramos el comportamiento con el usuario simulado.
        Mockito.when(usuarioSimulado.getName()).thenReturn("usuario");
        Mockito.when(usuarioSimulado.getPass()).thenReturn("contraseña");
        
        // Probamos el método validarIdentidad
        boolean resultado = Login.validarIdentidad(usuarioSimulado, "usuario", "contraseña");
        
        // Verificamos que el resultado sea verdadero
        assertTrue(resultado);
    }
}
