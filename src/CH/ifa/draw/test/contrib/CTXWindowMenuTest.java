/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package CH.ifa.draw.test.contrib;

// JUnitDoclet begin import
import CH.ifa.draw.application.DrawApplication;
import CH.ifa.draw.contrib.CTXWindowMenu;
import CH.ifa.draw.contrib.MDIDesktopPane;
import CH.ifa.draw.test.JHDTestCase;
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase CTXWindowMenuTest is generated by
 * JUnitDoclet to hold the tests for CTXWindowMenu.
 * @see CH.ifa.draw.contrib.CTXWindowMenu
 */
// JUnitDoclet end javadoc_class
public class CTXWindowMenuTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private CTXWindowMenu ctxwindowmenu;
	// JUnitDoclet end class

	/**
	 * Constructor CTXWindowMenuTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public CTXWindowMenuTest(String name) {
		// JUnitDoclet begin method CTXWindowMenuTest
		super(name);
		// JUnitDoclet end method CTXWindowMenuTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public CH.ifa.draw.contrib.CTXWindowMenu createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		MDIDesktopPane desktop = (MDIDesktopPane) (((DrawApplication)getDrawingEditor()).getDesktop());
		return new CH.ifa.draw.contrib.CTXWindowMenu("TestCTXWindowMenu", desktop, getDrawingEditor());
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		ctxwindowmenu = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		ctxwindowmenu = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}
}
