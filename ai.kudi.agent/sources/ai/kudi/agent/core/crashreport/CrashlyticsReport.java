package ai.kudi.agent.core.crashreport;

import com.google.firebase.crashlytics.C5325g;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13287o;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CrashlyticsReport.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0007¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/crashreport/CrashlyticsReport;", "", "()V", "logException", "", "exception", "", "customKey", "Lkotlin/Pair;", "", "", "userId", "logMessage", MetricTracker.Object.MESSAGE, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CrashlyticsReport {
    public static final CrashlyticsReport INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        CrashlyticsReport $r0 = new CrashlyticsReport();
        INSTANCE = $r0;
    }

    private CrashlyticsReport() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void logException(Throwable th) {
        Log_OC.getArray(th, "exception");
        C5325g $r1 = C5325g.m25123a();
        Log_OC.loadImage($r1, "getInstance()");
        $r1.m25120d(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void logException(Throwable th, C13287o c13287o, String str) {
        Log_OC.getArray(th, "exception");
        Log_OC.getArray(c13287o, "customKey");
        Log_OC.getArray(str, "userId");
        C5325g $r3 = C5325g.m25123a();
        Log_OC.loadImage($r3, "getInstance()");
        Object $r4 = c13287o.m5364c();
        String $r5 = (String) $r4;
        Object $r42 = c13287o.m5363d();
        Boolean $r6 = (Boolean) $r42;
        boolean $z0 = $r6.booleanValue();
        $r3.m25118f($r5, $z0);
        $r3.m25117g(str);
        $r3.m25120d(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void logMessage(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        C5325g $r1 = C5325g.m25123a();
        $r1.m25121c(str);
    }
}
