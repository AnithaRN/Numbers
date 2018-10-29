package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void number2EqualsTwo() {
		Assert.assertEquals( "2", "Two", numberWords.toWords(2) ) ;
	}
	@Test
	public void number27EqualsTwentySeven() {
		Assert.assertEquals( "27", "Twenty Seven", numberWords.toWords(27) ) ;
	}
	@Test
	public void number845EqualsEightFortyFiveTwo() {
		Assert.assertEquals( "845", "Eight Hundred Forty Five", numberWords.toWords(845) ) ;
	}
	
}
