package io.intercom.android.sdk.package_2;

import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.okhttp3.ResponseBody;
import io.intercom.retrofit2.Response;
import java.io.IOException;
/* loaded from: classes.dex */
public class ErrorObject {
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ErrorObject(Throwable th, Response response) {
        Twig $r3 = LumberMill.getLogger();
        this.twig = $r3;
        this.throwable = th;
        String $r4 = parseErrorBody(response);
        this.errorBody = $r4;
        int $i0 = parseStatusCode(response);
        this.statusCode = $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private String parseErrorBody(Response response) {
        if (response != null) {
            ResponseBody $r3 = response.errorBody();
            if ($r3 != null) {
                try {
                    ResponseBody $r32 = response.errorBody();
                    String $r4 = $r32.string();
                    return $r4;
                } catch (IOException $r5) {
                    Twig $r6 = this.twig;
                    StringBuilder $r1 = new StringBuilder();
                    $r1.append("Couldn't parse error body: ");
                    String $r42 = $r5.getMessage();
                    $r1.append($r42);
                    String $r43 = $r1.toString();
                    $r6.internal($r43);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int parseStatusCode(Response response) {
        if (response != null) {
            int $i0 = response.code();
            return $i0;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getErrorBody() {
        String r1 = this.errorBody;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getStatusCode() {
        int i0 = this.statusCode;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Throwable getThrowable() {
        Throwable r1 = this.throwable;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean hasErrorBody() {
        String $r1 = this.errorBody;
        return $r1 != null;
    }
}
