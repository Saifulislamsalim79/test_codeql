package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.x0 */
/* loaded from: classes2.dex */
public final class C4939x0 {

    /* renamed from: a */
    private final Map<String, Double> f12585a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double m25986a(String str, C4900n1 c4900n1) {
        double d;
        double d2 = ((C4911q0) c4900n1).f12471g;
        Double.isNaN(d2);
        double d3 = d2 + 1.0d;
        double d4 = ((C4911q0) c4900n1).f12472h;
        Double.isNaN(d4);
        d = d3 / d4;
        this.f12585a.put(str, Double.valueOf(d));
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void m25985b(String str) {
        this.f12585a.put(str, Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized double m25984c(String str) {
        Double d = this.f12585a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
