package dyds.act2.tests;

import dyds.act2.tests.utils.StubbedServiceProvider;
import org.junit.Before;
import org.junit.Test;

import dyds.act2.parte1.ServiceProvider;
import dyds.act2.parte1.SearchInfo;
import dyds.act2.parte1.SearchLogic;

import static org.junit.Assert.*;

public class Parte1Test {

	ServiceProvider serviceProvider;

	@Before
	public void setUp() throws Exception {
		//Using the stubbed version of the ServiceProvider, this is helpfull for testing stuff
		serviceProvider =  new StubbedServiceProvider();
	}

	@Test
	public void testBien() {
		// Arrange.
		SearchLogic searchLogic = new SearchLogic(serviceProvider);
		SearchInfo searchInfoOk =  new SearchInfo("Baldurs Gate 3", "video-games", "en.wikipedia.org");
		
		// Act.
		String[] results = searchLogic.srch(searchInfoOk);
		
		// Assert.
		assertEquals(3, results.length);
	}

	@Test
	public void testMalSearchInfo() {
		// Arrange.
		SearchLogic searchLogic = new SearchLogic(serviceProvider);
		SearchInfo searchInfoNotOk =  new SearchInfo("Batman", "biology", "en.wikipedia.org");

		// Act.
		String[] results = searchLogic.srch(searchInfoNotOk);

		// Assert.
		assertEquals(0, results.length);
	}

	@Test
	public void testMalServiceURL() {
		// Arrange.
		SearchLogic searchLogic = new SearchLogic(serviceProvider);
		SearchInfo searchInfoBadURL =  new SearchInfo("Messi", "Football", "www.wikinada.com");

		// Act.
		String[] results = searchLogic.srch(searchInfoBadURL);

		// Assert.
		assertEquals(0, results.length);
	}


}
