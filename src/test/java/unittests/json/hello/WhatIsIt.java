/**
 *
 */
package unittests.json.hello;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.reificating.json.BadEvaluationException;
import org.reificating.json.NavigationByDot;

/**
 * First tests with the reification.
 *
 * @author dinhego
 *
 */
public class WhatIsIt {

	private final String simpleJson = "{hello: \"world\"}";

	@Test
	public void helloWorld() throws BadEvaluationException {
		final NavigationByDot navigation = new NavigationByDot(this.simpleJson);

		assertTrue("world".equals(navigation.getFieldValue("hello", String.class)));
	}

}
