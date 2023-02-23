package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
/* compiled from: MethodCallsLogger.java */
/* renamed from: androidx.lifecycle.t */
/* loaded from: classes2.dex */
public class C1582t {

    /* renamed from: a */
    private Map<String, Integer> f4791a = new HashMap();

    /* renamed from: a */
    public boolean m35482a(String str, int i) {
        Integer num = this.f4791a.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z = (intValue & i) != 0;
        this.f4791a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
