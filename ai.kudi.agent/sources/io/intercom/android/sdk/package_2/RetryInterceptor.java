package io.intercom.android.sdk.package_2;

import io.intercom.okhttp3.Interceptor;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.Response;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class RetryInterceptor implements Interceptor {
    private static final int MAX_RETRIES = 3;
    private final Sleeper sleeper;

    /* loaded from: classes.dex */
    public class Sleeper {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public void sleep(int i) {
            TimeUnit $r1 = TimeUnit.SECONDS;
            long $l0 = i;
            try {
                $r1.sleep($l0);
            } catch (InterruptedException e) {
                Thread $r2 = Thread.currentThread();
                $r2.interrupt();
            }
        }
    }

    public RetryInterceptor(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static int getRetryTimer(int i) {
        double $d0 = i;
        int $i0 = (int) Math.pow(2.0d, $d0);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        int $i0 = 0;
        while ($i0 <= 3) {
            try {
                Request $r2 = chain.request();
                Response $r3 = chain.proceed($r2);
                return $r3;
            } catch (IOException $r4) {
                if ($i0 == 3) {
                    throw $r4;
                }
                Sleeper $r5 = this.sleeper;
                $i0++;
                int $i1 = getRetryTimer($i0);
                $r5.sleep($i1);
            }
        }
        IOException $r42 = new IOException("request failed due to network errors");
        throw $r42;
    }
}
