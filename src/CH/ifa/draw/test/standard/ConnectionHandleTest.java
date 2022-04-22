package CH.ifa.draw.test.standard;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.standard.ConnectionHandle;
import CH.ifa.draw.test.JHDTestCase;
import CH.ifa.draw.figures.RectangleFigure;
import CH.ifa.draw.figures.LineConnection;
import CH.ifa.draw.standard.RelativeLocator;
import java.awt.Point;
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
* TestCase ConnectionHandleTest is generated by
* JUnitDoclet to hold the tests for ConnectionHandle.
* @see CH.ifa.draw.standard.ConnectionHandle
*/
// JUnitDoclet end javadoc_class
public class ConnectionHandleTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.standard.ConnectionHandle connectionhandle = null;
  // JUnitDoclet end class
  
  /**
  * Constructor ConnectionHandleTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public ConnectionHandleTest(String name) {
    // JUnitDoclet begin method ConnectionHandleTest
    super(name);
    // JUnitDoclet end method ConnectionHandleTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.standard.ConnectionHandle createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.standard.ConnectionHandle(new RectangleFigure(new Point(10,10), new Point(100,100)) , RelativeLocator.east(), new LineConnection());
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
    connectionhandle = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    connectionhandle = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method invokeStart()
  /**
  * Method testInvokeStart is testing invokeStart
  * @see CH.ifa.draw.standard.ConnectionHandle#invokeStart(int, int, CH.ifa.draw.framework.DrawingView)
  */
  // JUnitDoclet end javadoc_method invokeStart()
  public void testInvokeStart() throws Exception {
    // JUnitDoclet begin method invokeStart
    // JUnitDoclet end method invokeStart
  }
  
  // JUnitDoclet begin javadoc_method invokeStep()
  /**
  * Method testInvokeStep is testing invokeStep
  * @see CH.ifa.draw.standard.ConnectionHandle#invokeStep(int, int, int, int, CH.ifa.draw.framework.DrawingView)
  */
  // JUnitDoclet end javadoc_method invokeStep()
  public void testInvokeStep() throws Exception {
    // JUnitDoclet begin method invokeStep
    // JUnitDoclet end method invokeStep
  }
  
  // JUnitDoclet begin javadoc_method invokeEnd()
  /**
  * Method testInvokeEnd is testing invokeEnd
  * @see CH.ifa.draw.standard.ConnectionHandle#invokeEnd(int, int, int, int, CH.ifa.draw.framework.DrawingView)
  */
  // JUnitDoclet end javadoc_method invokeEnd()
  public void testInvokeEnd() throws Exception {
    // JUnitDoclet begin method invokeEnd
    // JUnitDoclet end method invokeEnd
  }
  
  // JUnitDoclet begin javadoc_method draw()
  /**
  * Method testDraw is testing draw
  * @see CH.ifa.draw.standard.ConnectionHandle#draw(java.awt.Graphics)
  */
  // JUnitDoclet end javadoc_method draw()
  public void testDraw() throws Exception {
    // JUnitDoclet begin method draw
    // JUnitDoclet end method draw
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
  
  /**
  * Method to execute the TestCase from command line
  * using JUnit's textui.TestRunner .
  */
  public static void main(String[] args) {
    // JUnitDoclet begin method testcase.main
    junit.textui.TestRunner.run(ConnectionHandleTest.class);
    // JUnitDoclet end method testcase.main
  }
}
