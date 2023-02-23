package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.i9 */
/* loaded from: classes2.dex */
final class C3832i9 {
    /* renamed from: a */
    public static final int m29518a(int i, Object obj, Object obj2) {
        C3816h9 c3816h9 = (C3816h9) obj;
        C3800g9 c3800g9 = (C3800g9) obj2;
        if (c3816h9.isEmpty()) {
            return 0;
        }
        Iterator it = c3816h9.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final Object m29517b(Object obj, Object obj2) {
        C3816h9 c3816h9 = (C3816h9) obj;
        C3816h9 c3816h92 = (C3816h9) obj2;
        if (!c3816h92.isEmpty()) {
            if (!c3816h9.m29550g()) {
                c3816h9 = c3816h9.m29553b();
            }
            c3816h9.m29551e(c3816h92);
        }
        return c3816h9;
    }
}
