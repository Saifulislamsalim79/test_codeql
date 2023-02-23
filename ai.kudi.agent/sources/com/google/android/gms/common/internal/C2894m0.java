package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C2834f;
import com.google.android.gms.common.api.C2730a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.m0 */
/* loaded from: classes2.dex */
public final class C2894m0 {

    /* renamed from: a */
    private final SparseIntArray f8030a = new SparseIntArray();

    /* renamed from: b */
    private C2834f f8031b;

    public C2894m0(C2834f c2834f) {
        s.j(c2834f);
        this.f8031b = c2834f;
    }

    /* renamed from: a */
    public final int m31707a(Context context, int i) {
        return this.f8030a.get(i, -1);
    }

    /* renamed from: b */
    public final int m31706b(Context context, C2730a.InterfaceC2739f interfaceC2739f) {
        s.j(context);
        s.j(interfaceC2739f);
        int i = 0;
        if (interfaceC2739f.mo31238i()) {
            int mo15469k = interfaceC2739f.mo15469k();
            int m31707a = m31707a(context, mo15469k);
            if (m31707a == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f8030a.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = this.f8030a.keyAt(i2);
                    if (keyAt > mo15469k && this.f8030a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                }
                m31707a = i == -1 ? this.f8031b.mo31845h(context, mo15469k) : i;
                this.f8030a.put(mo15469k, m31707a);
            }
            return m31707a;
        }
        return 0;
    }

    /* renamed from: c */
    public final void m31705c() {
        this.f8030a.clear();
    }
}
