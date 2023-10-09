import java.util.Properties;
import java.lang.*;

    /** My <em>first</em> Java program. Now I'm a Java guru!
* Or am I being too enthusiastic too soon?
* @author Kaamil
* @version 1.0.0
*/

public class incusdataCourse1 {
    /** Entry point for the JVM.
* Every Java application <b>must</b> have a main method.
* <i>yada, yada, blah, blah</i>.
* @param args command line arguments as a String array
*/

    public static void main(String[] args) {
        String name= System.getProperty("user.name");
        System.out.println("hey boyz and "+ name);
        Properties props = System.getProperties();
        //System.out.println(props);
        props.list(System.out);
    }
}