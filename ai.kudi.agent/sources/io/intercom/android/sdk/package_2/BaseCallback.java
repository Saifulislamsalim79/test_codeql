package io.intercom.android.sdk.package_2;

import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.retrofit2.Call;
import io.intercom.retrofit2.Callback;
import io.intercom.retrofit2.Response;
/* loaded from: classes.dex */
public abstract class BaseCallback<T> implements Callback<T> {
    private final Twig twig;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseCallback() {
        Twig $r1 = LumberMill.getLogger();
        this.twig = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static String getDetails(ErrorObject errorObject) {
        String $r1;
        boolean $z0 = errorObject.hasErrorBody();
        if ($z0) {
            $r1 = errorObject.getErrorBody();
        } else {
            Throwable $r2 = errorObject.getThrowable();
            $r1 = $r2.getMessage();
        }
        return $r1 == null ? "unknown error" : $r1;
    }

    private void handleError(ErrorObject errorObject) {
        logFailure("Api call failed", errorObject);
        onError(errorObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void logFailure(String str, ErrorObject errorObject) {
        Twig $r1 = this.twig;
        StringBuilder $r2 = new StringBuilder();
        $r2.append(str);
        $r2.append(": ");
        String $r3 = getDetails(errorObject);
        $r2.append($r3);
        String $r32 = $r2.toString();
        Object[] $r5 = new Object[0];
        $r1.m13068e($r32, $r5);
    }

    protected void onError(ErrorObject errorObject) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.retrofit2.Callback
    public final void onFailure(Call call, Throwable th) {
        ErrorObject $r3 = new ErrorObject(th, null);
        handleError($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        if (response == null) {
            IllegalStateException $r4 = new IllegalStateException("No body returned from the server");
            ErrorObject $r3 = new ErrorObject($r4, null);
            handleError($r3);
            return;
        }
        Object $r5 = response.body();
        if ($r5 == null) {
            IllegalStateException $r42 = new IllegalStateException("No body returned from the server");
            ErrorObject $r32 = new ErrorObject($r42, response);
            handleError($r32);
            return;
        }
        boolean $z0 = response.isSuccessful();
        if ($z0) {
            Object $r52 = response.body();
            onSuccess($r52);
            return;
        }
        Exception $r6 = new Exception("Status code outside the 200-300 range");
        ErrorObject $r33 = new ErrorObject($r6, response);
        handleError($r33);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onSuccess(Object obj);
}
