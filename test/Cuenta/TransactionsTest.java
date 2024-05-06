package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TransactionsTest {
	@Test
    public void testDepositar() {
        // Creamos una instancia simulada de la interfaz Transactions
        Transactions transacciones = Mockito.mock(Transactions.class);
        
        // Ejecutamos el método depositar()
        transacciones.depositar(100.0); // Podemos pasar cualquier monto de prueba
        
        // Verificamos que el método fue llamado con el monto correcto
        Mockito.verify(transacciones).depositar(100.0);
    }

    @Test
    public void testRetirar() {
        // Creamos una instancia simulada de la interfaz Transactions
        Transactions transacciones = Mockito.mock(Transactions.class);
        
        // Ejecutamos el método retirar()
        transacciones.retirar(50.0); // Podemos pasar cualquier monto de prueba
        
        // Verificamos que el método fue llamado con el monto correcto
        Mockito.verify(transacciones).retirar(50.0);
    }

    @Test
    public void testBalanceFinal() {
        // Creamos una instancia simulada de la interfaz Transactions
        Transactions transacciones = Mockito.mock(Transactions.class);
        
        // Configuramos el comportamiento simulado del método balanceFinal()
        Mockito.when(transacciones.balanceFinal()).thenReturn(500.0); // Podemos devolver cualquier saldo de prueba
        
        // Probamos el método balanceFinal()
        double saldo = transacciones.balanceFinal();
        
        // Verificamos que el saldo devuelto sea el esperado
        assertEquals(500.0, saldo, 0.0);
    }
}
