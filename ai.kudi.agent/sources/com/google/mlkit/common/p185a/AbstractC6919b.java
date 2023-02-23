package com.google.mlkit.common.p185a;

import com.google.android.gms.common.internal.C2906q;
import com.google.mlkit.common.p186b.EnumC6942l;
import com.google.mlkit.common.p186b.p187p.EnumC6946a;
import java.util.EnumMap;
import p272h.p286c.p287a.p300b.p307d.p315h.C8524t0;
import p272h.p286c.p287a.p300b.p307d.p315h.C8526u0;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.a.b */
/* loaded from: classes2.dex */
public abstract class AbstractC6919b {

    /* renamed from: a */
    private final String f16605a;

    /* renamed from: b */
    private final EnumC6946a f16606b;

    /* renamed from: c */
    private final EnumC6942l f16607c;

    static {
        new EnumMap(EnumC6946a.class);
        new EnumMap(EnumC6946a.class);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6919b) {
            AbstractC6919b abstractC6919b = (AbstractC6919b) obj;
            return C2906q.m31701a(this.f16605a, abstractC6919b.f16605a) && C2906q.m31701a(this.f16606b, abstractC6919b.f16606b) && C2906q.m31701a(this.f16607c, abstractC6919b.f16607c);
        }
        return false;
    }

    public int hashCode() {
        return C2906q.m31700b(this.f16605a, this.f16606b, this.f16607c);
    }

    public String toString() {
        C8524t0 m15998a = C8526u0.m15998a("RemoteModel");
        m15998a.m16000a("modelName", this.f16605a);
        m15998a.m16000a("baseModel", this.f16606b);
        m15998a.m16000a("modelType", this.f16607c);
        return m15998a.toString();
    }
}
