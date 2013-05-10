package algorithm.cc150;

import org.junit.Before;


public abstract class TestBase {
	
	@Before
	public void setup() {
		initInstance();
	}

	protected abstract void initInstance();
}