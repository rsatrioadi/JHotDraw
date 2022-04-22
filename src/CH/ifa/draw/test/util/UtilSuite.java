package CH.ifa.draw.test.util;



import junit.framework.TestSuite;
// JUnitDoclet begin import
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
* TestSuite UtilSuite
*/
// JUnitDoclet end javadoc_class
public class UtilSuite
// JUnitDoclet begin extends_implements
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // JUnitDoclet end class
  
  public static TestSuite suite() {
    
    TestSuite suite;
    
    suite = new TestSuite("CH.ifa.draw.test.util");
    
    suite.addTestSuite(CH.ifa.draw.test.util.JDOStorageFormatTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.ReverseListEnumeratorTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.StandardVersionControlStrategyTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.VersionManagementTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.UndoableHandleTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.UndoRedoActivityTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.UndoableAdapterTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.UndoableToolTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.RedoCommandTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.UndoCommandTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.UndoableCommandTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.GraphLayoutTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.BoundsTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.StorageFormatManagerTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.SerializationStorageFormatTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.StandardStorageFormatTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.PaletteLayoutTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.PaletteIconTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.IconkitTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.GeomTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.FloatingTextFieldTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.FillerTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.CommandMenuTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.CommandChoiceTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.CommandButtonTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.StorableInputTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.StorableOutputTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.UndoManagerTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.ColorMapTest.class);
    suite.addTestSuite(CH.ifa.draw.test.util.ClipboardTest.class);
    
    
    
    // JUnitDoclet begin method suite()
    // JUnitDoclet end method suite()
    
    return suite;
  }
  
  /**
  * Method to execute the TestSuite from command line
  * using JUnit's textui.TestRunner .
  */
  public static void main(String[] args) {
    // JUnitDoclet begin method testsuite.main
    junit.textui.TestRunner.run(suite());
    // JUnitDoclet end method testsuite.main
  }
}
