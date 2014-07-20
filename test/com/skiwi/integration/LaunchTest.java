
package com.skiwi.integration;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import com.skiwi.moviedb.MovieDB;
import org.junit.Test;

/**
 *
 * @author Frank van Heeswijk
 */
public class LaunchTest {
    @Test(timeout = 5000)
    public void testLaunch() throws Throwable {
        CachingExceptionThread thread = new CachingExceptionThread(() -> MovieDB.main(new String[0]));
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            throw new RuntimeException("sleep interrupted", ex);
        }
        thread.interrupt();
        if (thread.getException().isPresent()) {
            throw thread.getException().get();
        }
    }
    
    private static class CachingExceptionThread extends Thread {
        private Optional<Throwable> exception = Optional.empty();
        
        {
            setUncaughtExceptionHandler((thread, ex) -> exception = Optional.of(ex));
        }
        
        private CachingExceptionThread(final Runnable runnable) {
            super(runnable);
        }
        
        public Optional<Throwable> getException() {
            return exception;
        }
    }
}
