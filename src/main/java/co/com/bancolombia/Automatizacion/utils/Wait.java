package co.com.bancolombia.Automatizacion.utils;

import co.com.bancolombia.Automatizacion.exceptions.ThreadStoppedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static co.com.bancolombia.Automatizacion.utils.Constants.THREAD_STOPPED_EXCEPTION_MESSAGE;


public class Wait {
    public static void stopExecution(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ThreadStoppedException(THREAD_STOPPED_EXCEPTION_MESSAGE,e);
        }
    }
}
