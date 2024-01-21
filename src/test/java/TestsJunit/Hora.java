package TestsJunit;

import org.junit.Test;

import model.LoginDao;

public class Hora {
	@Test
    public void horaFunciona() {
        String username = "admin";
        String password = "admin";

        String resultado = LoginDao.validar(username, password);

        //assertEquals("El resultado debería ser el rut correspondiente", "19588551", resultado);
    }

    @Test
    public void horaNoFunciona() {
        String username = "usuario_no_existente";
        String password = "contrasena_incorrecta";

        String resultado = LoginDao.validar(username, password);

        //assertNull("<>", resultado);
    }
}
