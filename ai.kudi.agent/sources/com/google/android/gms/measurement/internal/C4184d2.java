package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.d2 */
/* loaded from: classes2.dex */
public final class C4184d2 extends e3 {

    /* renamed from: b */
    private final Map<String, Long> f10203b;

    /* renamed from: c */
    private final Map<String, Integer> f10204c;

    /* renamed from: d */
    private long f10205d;

    public C4184d2(b5 b5Var) {
        super(b5Var);
        this.f10204c = new C7521a();
        this.f10203b = new C7521a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m28316i(C4184d2 c4184d2, String str, long j) {
        c4184d2.h();
        com.google.android.gms.common.internal.s.f(str);
        if (c4184d2.f10204c.isEmpty()) {
            c4184d2.f10205d = j;
        }
        Integer num = c4184d2.f10204c.get(str);
        if (num != null) {
            c4184d2.f10204c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c4184d2.f10204c.size() >= 100) {
            ((v5) c4184d2).a.b().w().m28014a("Too many ads visible");
        } else {
            c4184d2.f10204c.put(str, 1);
            c4184d2.f10203b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ void m28315j(C4184d2 c4184d2, String str, long j) {
        c4184d2.h();
        com.google.android.gms.common.internal.s.f(str);
        Integer num = c4184d2.f10204c.get(str);
        if (num != null) {
            C4328p7 m27890t = ((v5) c4184d2).a.K().m27890t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c4184d2.f10204c.remove(str);
                Long l = c4184d2.f10203b.get(str);
                if (l == null) {
                    ((v5) c4184d2).a.b().r().m28014a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    c4184d2.f10203b.remove(str);
                    c4184d2.m28309p(str, j - longValue, m27890t);
                }
                if (c4184d2.f10204c.isEmpty()) {
                    long j2 = c4184d2.f10205d;
                    if (j2 == 0) {
                        ((v5) c4184d2).a.b().r().m28014a("First ad exposure time was never set");
                        return;
                    }
                    c4184d2.m28310o(j - j2, m27890t);
                    c4184d2.f10205d = 0L;
                    return;
                }
                return;
            }
            c4184d2.f10204c.put(str, Integer.valueOf(intValue));
            return;
        }
        ((v5) c4184d2).a.b().r().m28013b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: o */
    private final void m28310o(long j, C4328p7 c4328p7) {
        if (c4328p7 == null) {
            ((v5) this).a.b().v().m28014a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            ((v5) this).a.b().v().m28013b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            ia.x(c4328p7, bundle, true);
            ((v5) this).a.I().m28124u("am", "_xa", bundle);
        }
    }

    /* renamed from: p */
    private final void m28309p(String str, long j, C4328p7 c4328p7) {
        if (c4328p7 == null) {
            ((v5) this).a.b().v().m28014a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            ((v5) this).a.b().v().m28013b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            ia.x(c4328p7, bundle, true);
            ((v5) this).a.I().m28124u("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m28308q(long j) {
        for (String str : this.f10203b.keySet()) {
            this.f10203b.put(str, Long.valueOf(j));
        }
        if (this.f10203b.isEmpty()) {
            return;
        }
        this.f10205d = j;
    }

    /* renamed from: l */
    public final void m28313l(String str, long j) {
        if (str != null && str.length() != 0) {
            ((v5) this).a.a().m27810z(new RunnableC4146a(this, str, j));
        } else {
            ((v5) this).a.b().r().m28014a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: m */
    public final void m28312m(String str, long j) {
        if (str != null && str.length() != 0) {
            ((v5) this).a.a().m27810z(new RunnableC4159b0(this, str, j));
        } else {
            ((v5) this).a.b().r().m28014a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: n */
    public final void m28311n(long j) {
        C4328p7 m27890t = ((v5) this).a.K().m27890t(false);
        for (String str : this.f10203b.keySet()) {
            m28309p(str, j - this.f10203b.get(str).longValue(), m27890t);
        }
        if (!this.f10203b.isEmpty()) {
            m28310o(j - this.f10205d, m27890t);
        }
        m28308q(j);
    }
}
