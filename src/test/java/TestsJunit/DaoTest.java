package TestsJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import model.LoginDao;
import utils.Conexion;

public class DaoTest {
    @Test
    public void testValidarConCredencialesCorrectas() {
        String username = "admin";
        String password = "admin";

        String resultado = LoginDao.validar(username, password);

        //assertEquals("El resultado debería ser el rut correspondiente", "19588551", resultado);
    }

    @Test
    public void testValidarConCredencialesIncorrectas() {
        String username = "usuario_no_existente";
        String password = "contrasena_incorrecta";

        String resultado = LoginDao.validar(username, password);

        //assertNull("<>", resultado);
    }

}
