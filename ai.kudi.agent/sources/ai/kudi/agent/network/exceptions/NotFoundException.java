package ai.kudi.agent.network.exceptions;

import com.google.firebase.crashlytics.C5325g;
/* loaded from: classes.dex */
public class NotFoundException extends Exception {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NotFoundException(String str) {
        super(str);
        C5325g $r3 = C5325g.m25123a();
        Throwable $r2 = new Throwable(str);
        $r3.m25120d($r2);
    }
}
