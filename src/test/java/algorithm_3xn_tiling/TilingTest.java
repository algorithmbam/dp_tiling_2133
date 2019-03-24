package algorithm_3xn_tiling;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TilingTest {

	private Tiling tiling;
	
	@Before
	public void setUp() {
		tiling= new Tiling();
	}
	
	@Test
	public void input1ouput0() {
		
		int result= tiling.dp(1);
		
		assertThat(result, is(0));
	}

	@Test
	public void input2ouput3() {
		
		int result= tiling.dp(2);
		
		assertThat(result, is(3));
	}
	
	@Test
	public void input3ouput0() {
		
		int result= tiling.dp(3);
		
		assertThat(result, is(0));
	}
	
	@Test
	public void input4ouput11() {
		
		int result= tiling.dp(4);
		
		assertThat(result, is(11));
	}
	
	@Test
	public void input5ouput0() {
		
		int result= tiling.dp(5);
		
		assertThat(result, is(0));
	}
	
	@Test
	public void input7ouput0() {
		
		int result= tiling.dp(7);
		
		assertThat(result, is(0));
	}
}
