
package pyexecuteservice.hilos;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

/**
 *
 * @author MARTIN
 */
public class CTask implements Callable<String> {
    
    @Override
    public String call() throws Exception {
        try {
            //simular proceso complejo
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        
        return "Success";
    }
}
