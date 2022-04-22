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
import CH.ifa.draw.contrib.PolygonTool;
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
 * TestCase PolygonToolTest is generated by
 * JUnitDoclet to hold the tests for PolygonTool.
 * @see CH.ifa.draw.contrib.PolygonTool
 */
// JUnitDoclet end javadoc_class
public class PolygonToolTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private PolygonTool polygontool;
	// JUnitDoclet end class

	/**
	 * Constructor PolygonToolTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public PolygonToolTest(String name) {
		// JUnitDoclet begin method PolygonToolTest
		super(name);
		// JUnitDoclet end method PolygonToolTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public CH.ifa.draw.contrib.PolygonTool createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new CH.ifa.draw.contrib.PolygonTool(getDrawingEditor());
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
		polygontool = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		polygontool = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method activate()
	/**
	 * Method testActivate is testing activate
	 * @see CH.ifa.draw.contrib.PolygonTool#activate()
	 */
	// JUnitDoclet end javadoc_method activate()
	public void testActivate() throws Exception {
		// JUnitDoclet begin method activate
		// JUnitDoclet end method activate
	}

	// JUnitDoclet begin javadoc_method deactivate()
	/**
	 * Method testDeactivate is testing deactivate
	 * @see CH.ifa.draw.contrib.PolygonTool#deactivate()
	 */
	// JUnitDoclet end javadoc_method deactivate()
	public void testDeactivate() throws Exception {
		// JUnitDoclet begin method deactivate
		// JUnitDoclet end method deactivate
	}

	// JUnitDoclet begin javadoc_method mouseDown()
	/**
	 * Method testMouseDown is testing mouseDown
	 * @see CH.ifa.draw.contrib.PolygonTool#mouseDown(java.awt.event.MouseEvent, int, int)
	 */
	// JUnitDoclet end javadoc_method mouseDown()
	public void testMouseDown() throws Exception {
		// JUnitDoclet begin method mouseDown
		// JUnitDoclet end method mouseDown
	}

	// JUnitDoclet begin javadoc_method mouseMove()
	/**
	 * Method testMouseMove is testing mouseMove
	 * @see CH.ifa.draw.contrib.PolygonTool#mouseMove(java.awt.event.MouseEvent, int, int)
	 */
	// JUnitDoclet end javadoc_method mouseMove()
	public void testMouseMove() throws Exception {
		// JUnitDoclet begin method mouseMove
		// JUnitDoclet end method mouseMove
	}

	// JUnitDoclet begin javadoc_method mouseDrag()
	/**
	 * Method testMouseDrag is testing mouseDrag
	 * @see CH.ifa.draw.contrib.PolygonTool#mouseDrag(java.awt.event.MouseEvent, int, int)
	 */
	// JUnitDoclet end javadoc_method mouseDrag()
	public void testMouseDrag() throws Exception {
		// JUnitDoclet begin method mouseDrag
		// JUnitDoclet end method mouseDrag
	}

	// JUnitDoclet begin javadoc_method mouseUp()
	/**
	 * Method testMouseUp is testing mouseUp
	 * @see CH.ifa.draw.contrib.PolygonTool#mouseUp(java.awt.event.MouseEvent, int, int)
	 */
	// JUnitDoclet end javadoc_method mouseUp()
	public void testMouseUp() throws Exception {
		// JUnitDoclet begin method mouseUp
		// JUnitDoclet end method mouseUp
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
