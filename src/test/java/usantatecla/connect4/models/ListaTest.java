package usantatecla.connect4.models;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ListaTest {

	@Test
	public void givenEmptyListWhenIsEmptyThenReturnTrue() {
	    List<Object> list = new Lista<>();

	    Assert.assertTrue(list.isEmpty());
	}
}
