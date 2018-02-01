package intel.dcg.leslie;

public class main {
    public static void main(String[] args){
        System.out.println("Test Begin");
        TestSelenium myTest = new TestSelenium();
        myTest.testGoogleSearch();
        myTest.testGoogleSearch2();
        System.out.println("Test Done");
    }
}
