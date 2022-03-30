package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pruebaM1.Cliente;

public class ClienteTest {

	@Test
	public void test() {
		assertEquals("Vanesa", new Cliente(1,"19968462-0","Vanesa","Av.Pedro Lobos #7514").getNombre_cliente());
	}
	@Test
	public void test1() {
		assertEquals("19968462-0", new Cliente(1,"19968462-0","Vanesa","Av.Pedro Lobos #7514").getRut());
	}
}
