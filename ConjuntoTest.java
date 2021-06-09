

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste ConjuntoTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class ConjuntoTest
{
    /**
     * Construtor default para a classe de teste ConjuntoTest
     */
    public ConjuntoTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void VazioEVazioResultaEmVazio()
    {
        int[] a = {};
        int[] b = {};
        int[] r = {};
        assertArrayEquals(r, Conjunto.unir(a, b));
    }

    @Test
    public void VazioE123ResultaEm123()
    {
        int[] a = {};
        int[] b = {1, 2, 3};
        int[] r = {1, 2, 3};
        assertArrayEquals(r, Conjunto.unir(a, b));
    }


    @Test
    public void a12E9ResultaEm129()
    {
        int[] a = {1, 2};
        int[] b = {9};
        int[] r = {1, 2, 9};        
        assertArrayEquals(r, Conjunto.unir(a, b));
    }
    
    @Test
    public void a1Ea1ResultaEma11()
    {
        int[] a = {1};
        int[] b = {1};
        int[] r = {1, 1};        
        assertArrayEquals(r, Conjunto.unir(a, b));
    }
}


