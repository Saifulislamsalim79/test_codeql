package io.intercom.android.sdk.package_2;

import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.okhttp3.Interceptor;
import io.intercom.okhttp3.MediaType;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.Response;
import io.intercom.okhttp3.ResponseBody;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ShutdownInterceptor implements Interceptor {
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private static final String MESSENGER_SHUTDOWN_RESPONSE = "messenger_shutdown_response";
    private static final String SHUTDOWN_PERIOD = "shutdown_period";
    private static final String TYPE = "type";
    private final ShutdownState shutdownState;
    private final Twig twig;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ShutdownInterceptor(ShutdownState shutdownState) {
        Twig $r2 = LumberMill.getLogger();
        this.twig = $r2;
        this.shutdownState = shutdownState;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        ShutdownState $r4 = this.shutdownState;
        boolean $z0 = $r4.canSendNetworkRequests();
        if (!$z0) {
            Twig $r14 = this.twig;
            ShutdownState $r42 = this.shutdownState;
            String $r8 = $r42.getShutdownReason();
            Object[] $r16 = new Object[0];
            $r14.m13068e($r8, $r16);
            ShutdownState $r43 = this.shutdownState;
            String $r82 = $r43.getShutdownReason();
            IOException $r17 = new IOException($r82);
            throw $r17;
        }
        Request $r5 = chain.request();
        Response $r6 = chain.proceed($r5);
        boolean $z02 = $r6.isSuccessful();
        if (!$z02) {
            ResponseBody $r7 = $r6.body();
            String $r83 = $r7.string();
            Response.Builder $r9 = $r6.newBuilder();
            MediaType $r10 = $r7.contentType();
            ResponseBody $r11 = ResponseBody.create($r10, $r83);
            $r6 = $r9.body($r11).build();
            $r7.close();
            try {
                JSONObject $r12 = new JSONObject($r83).getJSONObject("error");
                String $r13 = $r12.getString("type");
                boolean $z03 = $r13.equals(MESSENGER_SHUTDOWN_RESPONSE);
                if ($z03) {
                    long $l0 = $r12.getLong(SHUTDOWN_PERIOD);
                    String $r132 = $r12.getString("message");
                    ShutdownState $r44 = this.shutdownState;
                    TimeUnit $r1 = TimeUnit.SECONDS;
                    $r44.updateShutdownState($r1.toMillis($l0), $r132);
                    return $r6;
                }
            } catch (JSONException e) {
                Twig $r142 = this.twig;
                StringBuilder $r15 = new StringBuilder();
                $r15.append("Failed to deserialise error response: `");
                $r15.append($r83);
                $r15.append("` message: `");
                String $r84 = $r6.message();
                $r15.append($r84);
                $r15.append("`");
                String $r85 = $r15.toString();
                $r142.internal($r85);
                return $r6;
            }
        }
        return $r6;
    }
}
