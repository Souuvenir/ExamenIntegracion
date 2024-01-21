package TestsJunit;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utils.Conexion;

public class ConexionTest {
    private Conexion conexion;

    @Before
    public void setUp() {
        //conexion = new Conexion();
    }

    @After
    public void tearDown() {
        //conexion.closeConnection();
    }

    @Test
    public void testConexion() {
        /*try {
            Connection con = conexion.getConnection();
            assertNotNull("La conexión no debe ser nula", con);
        } catch (Exception e) {
            fail("Se produjo una excepción al intentar establecer la conexión: " + e.getMessage());
        }*/
    }

    @Test
    public void testCerrarConexion() {
        /*try {
            Connection con = conexion.getConnection();
            assertNotNull("La conexión no debe ser nula", con);

            conexion.closeConnection();
            assertTrue("La conexión debe estar cerrada", con.isClosed());
        } catch (Exception e) {
            fail("Se produjo una excepción al intentar cerrar la conexión: " + e.getMessage());
        }*/
    }
}
