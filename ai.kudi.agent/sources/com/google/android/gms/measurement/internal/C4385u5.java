package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.C2840i;
import com.google.android.gms.common.util.C2976o;
import com.google.android.gms.internal.measurement.C3713b;
import com.google.android.gms.internal.measurement.C3731c1;
import com.google.android.gms.internal.measurement.C4009td;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* loaded from: classes2.dex */
public final class C4385u5 extends AbstractC4208f3 {

    /* renamed from: a */
    private final C4168ba f10711a;

    /* renamed from: b */
    private Boolean f10712b;

    /* renamed from: c */
    private String f10713c;

    public C4385u5(C4168ba c4168ba, String str) {
        com.google.android.gms.common.internal.s.j(c4168ba);
        this.f10711a = c4168ba;
        this.f10713c = null;
    }

    /* renamed from: n */
    private final void m27938n(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f10712b == null) {
                        if (!"com.google.android.gms".equals(this.f10713c) && !C2976o.m31510a(this.f10711a.m28363f(), Binder.getCallingUid()) && !C2840i.m31826a(this.f10711a.m28363f()).m31824c(Binder.getCallingUid())) {
                            z2 = false;
                            this.f10712b = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.f10712b = Boolean.valueOf(z2);
                    }
                    if (this.f10712b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f10711a.m28371b().r().m28013b("Measurement Service called with invalid calling package. appId", q3.z(str));
                    throw e;
                }
            }
            if (this.f10713c == null && C2838h.m31828k(this.f10711a.m28363f(), Binder.getCallingUid(), str)) {
                this.f10713c = str;
            }
            if (str.equals(this.f10713c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.f10711a.m28371b().r().m28014a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m27937o(C4379u c4379u, C4307na c4307na) {
        this.f10711a.m28365e();
        this.f10711a.m28357i(c4379u, c4307na);
    }

    /* renamed from: v1 */
    private final void m27927v1(C4307na c4307na, boolean z) {
        com.google.android.gms.common.internal.s.j(c4307na);
        com.google.android.gms.common.internal.s.f(c4307na.f10529c);
        m27938n(c4307na.f10529c, false);
        this.f10711a.m28362f0().K(c4307na.f10530d, c4307na.f10523I, c4307na.f10527M);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: C0 */
    public final List<C4203ea> mo27949C0(String str, String str2, boolean z, C4307na c4307na) {
        m27927v1(c4307na, false);
        String str3 = c4307na.f10529c;
        com.google.android.gms.common.internal.s.j(str3);
        try {
            List<C4225ga> list = (List) this.f10711a.m28373a().m27817s(new CallableC4209f5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4225ga c4225ga : list) {
                if (z || !ia.V(c4225ga.f10319c)) {
                    arrayList.add(new C4203ea(c4225ga));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10711a.m28371b().r().m28012c("Failed to query user properties. appId", q3.z(c4307na.f10529c), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: G */
    public final String mo27948G(C4307na c4307na) {
        m27927v1(c4307na, false);
        return this.f10711a.m28358h0(c4307na);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: L */
    public final void mo27947L(C4169c c4169c) {
        com.google.android.gms.common.internal.s.j(c4169c);
        com.google.android.gms.common.internal.s.j(c4169c.f10079e);
        com.google.android.gms.common.internal.s.f(c4169c.f10077c);
        m27938n(c4169c.f10077c, true);
        m27929u1(new RunnableC4198e5(this, new C4169c(c4169c)));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: M */
    public final List<C4169c> mo27946M(String str, String str2, String str3) {
        m27938n(str, true);
        try {
            return (List) this.f10711a.m28373a().m27817s(new CallableC4254j5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f10711a.m28371b().r().m28013b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: Q */
    public final byte[] mo27945Q(C4379u c4379u, String str) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(c4379u);
        m27938n(str, true);
        this.f10711a.m28371b().q().m28013b("Log and bundle. event", this.f10711a.m28378V().m28046d(c4379u.f10698c));
        long mo31534b = this.f10711a.m28369c().mo31534b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f10711a.m28373a().m27816t(new CallableC4326p5(this, c4379u, str)).get();
            if (bArr == null) {
                this.f10711a.m28371b().r().m28013b("Log and bundle returned null. appId", q3.z(str));
                bArr = new byte[0];
            }
            this.f10711a.m28371b().q().m28011d("Log and bundle processed. event, size, time_ms", this.f10711a.m28378V().m28046d(c4379u.f10698c), Integer.valueOf(bArr.length), Long.valueOf((this.f10711a.m28369c().mo31534b() / 1000000) - mo31534b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f10711a.m28371b().r().m28011d("Failed to log and bundle. appId, event, error", q3.z(str), this.f10711a.m28378V().m28046d(c4379u.f10698c), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: X0 */
    public final List<C4203ea> mo27944X0(C4307na c4307na, boolean z) {
        m27927v1(c4307na, false);
        String str = c4307na.f10529c;
        com.google.android.gms.common.internal.s.j(str);
        try {
            List<C4225ga> list = (List) this.f10711a.m28373a().m27817s(new CallableC4349r5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4225ga c4225ga : list) {
                if (z || !ia.V(c4225ga.f10319c)) {
                    arrayList.add(new C4203ea(c4225ga));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10711a.m28371b().r().m28012c("Failed to get user properties. appId", q3.z(c4307na.f10529c), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: a0 */
    public final void mo27943a0(C4307na c4307na) {
        m27927v1(c4307na, false);
        m27929u1(new RunnableC4361s5(this, c4307na));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: c1 */
    public final void mo27942c1(C4203ea c4203ea, C4307na c4307na) {
        com.google.android.gms.common.internal.s.j(c4203ea);
        m27927v1(c4307na, false);
        m27929u1(new RunnableC4337q5(this, c4203ea, c4307na));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: d0 */
    public final List<C4169c> mo27941d0(String str, String str2, C4307na c4307na) {
        m27927v1(c4307na, false);
        String str3 = c4307na.f10529c;
        com.google.android.gms.common.internal.s.j(str3);
        try {
            return (List) this.f10711a.m28373a().m27817s(new CallableC4243i5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f10711a.m28371b().r().m28013b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: d1 */
    public final void mo27940d1(C4379u c4379u, String str, String str2) {
        com.google.android.gms.common.internal.s.j(c4379u);
        com.google.android.gms.common.internal.s.f(str);
        m27938n(str, true);
        m27929u1(new RunnableC4314o5(this, c4379u, str));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: i0 */
    public final void mo27939i0(C4307na c4307na) {
        m27927v1(c4307na, false);
        m27929u1(new RunnableC4278l5(this, c4307na));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final C4379u m27936p1(C4379u c4379u, C4307na c4307na) {
        C4355s c4355s;
        if ("_cmp".equals(c4379u.f10698c) && (c4355s = c4379u.f10699d) != null && c4355s.m27979f() != 0) {
            String m27980E = c4379u.f10699d.m27980E("_cis");
            if ("referrer broadcast".equals(m27980E) || "referrer API".equals(m27980E)) {
                this.f10711a.m28371b().u().m28013b("Event has been filtered ", c4379u.toString());
                return new C4379u("_cmpx", c4379u.f10699d, c4379u.f10700e, c4379u.f10701f);
            }
        }
        return c4379u;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: s */
    public final void mo27933s(final Bundle bundle, C4307na c4307na) {
        m27927v1(c4307na, false);
        final String str = c4307na.f10529c;
        com.google.android.gms.common.internal.s.j(str);
        m27929u1(new Runnable() { // from class: com.google.android.gms.measurement.internal.c5
            @Override // java.lang.Runnable
            public final void run() {
                C4385u5.this.m27930t1(str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1 */
    public final void m27932s1(C4379u c4379u, C4307na c4307na) {
        if (!this.f10711a.m28375Y().m27958u(c4307na.f10529c)) {
            m27937o(c4379u, c4307na);
            return;
        }
        this.f10711a.m28371b().v().m28013b("EES config found for", c4307na.f10529c);
        C4372t4 m28375Y = this.f10711a.m28375Y();
        String str = c4307na.f10529c;
        C4009td.m28898b();
        C3731c1 c3731c1 = null;
        if (((v5) m28375Y).a.z().B(null, C4173c3.f10150r0) && !TextUtils.isEmpty(str)) {
            c3731c1 = m28375Y.f10677i.m18487c(str);
        }
        if (c3731c1 != null) {
            try {
                Map<String, Object> m28293K = this.f10711a.m28364e0().m28293K(c4379u.f10699d.m27977k(), true);
                String m27804a = C4441z5.m27804a(c4379u.f10698c);
                if (m27804a == null) {
                    m27804a = c4379u.f10698c;
                }
                if (c3731c1.m29726e(new C3713b(m27804a, c4379u.f10701f, m28293K))) {
                    if (c3731c1.m29724g()) {
                        this.f10711a.m28371b().v().m28013b("EES edited event", c4379u.f10698c);
                        m27937o(this.f10711a.m28364e0().m28302B(c3731c1.m29730a().m29735b()), c4307na);
                    } else {
                        m27937o(c4379u, c4307na);
                    }
                    if (c3731c1.m29725f()) {
                        for (C3713b c3713b : c3731c1.m29730a().m29734c()) {
                            this.f10711a.m28371b().v().m28013b("EES logging created event", c3713b.m29835d());
                            m27937o(this.f10711a.m28364e0().m28302B(c3713b), c4307na);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f10711a.m28371b().r().m28012c("EES error. appId, eventName", c4307na.f10530d, c4379u.f10698c);
            }
            this.f10711a.m28371b().v().m28013b("EES was not applied to event", c4379u.f10698c);
            m27937o(c4379u, c4307na);
            return;
        }
        this.f10711a.m28371b().v().m28013b("EES not loaded for", c4307na.f10529c);
        m27937o(c4379u, c4307na);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: t0 */
    public final void mo27931t0(C4379u c4379u, C4307na c4307na) {
        com.google.android.gms.common.internal.s.j(c4379u);
        m27927v1(c4307na, false);
        m27929u1(new RunnableC4302n5(this, c4379u, c4307na));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1 */
    public final /* synthetic */ void m27930t1(String str, Bundle bundle) {
        C4260k m28379U = this.f10711a.m28379U();
        m28379U.h();
        m28379U.m27986i();
        byte[] m29845j = m28379U.f10625b.m28364e0().m28301C(new C4320p(((v5) m28379U).a, "", str, "dep", 0L, 0L, bundle)).m29845j();
        ((v5) m28379U).a.b().v().m28012c("Saving default event parameters, appId, data size", ((v5) m28379U).a.D().m28046d(str), Integer.valueOf(m29845j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m29845j);
        try {
            if (m28379U.m28089R().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                ((v5) m28379U).a.b().r().m28013b("Failed to insert default event parameters (got -1). appId", q3.z(str));
            }
        } catch (SQLiteException e) {
            ((v5) m28379U).a.b().r().m28012c("Error storing default event parameters. appId", q3.z(str), e);
        }
    }

    /* renamed from: u1 */
    final void m27929u1(Runnable runnable) {
        com.google.android.gms.common.internal.s.j(runnable);
        if (this.f10711a.m28373a().m27826C()) {
            runnable.run();
        } else {
            this.f10711a.m28373a().m27810z(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: v */
    public final void mo27928v(C4169c c4169c, C4307na c4307na) {
        com.google.android.gms.common.internal.s.j(c4169c);
        com.google.android.gms.common.internal.s.j(c4169c.f10079e);
        m27927v1(c4307na, false);
        C4169c c4169c2 = new C4169c(c4169c);
        c4169c2.f10077c = c4307na.f10529c;
        m27929u1(new RunnableC4187d5(this, c4169c2, c4307na));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: w0 */
    public final void mo27926w0(C4307na c4307na) {
        com.google.android.gms.common.internal.s.f(c4307na.f10529c);
        com.google.android.gms.common.internal.s.j(c4307na.f10528N);
        RunnableC4290m5 runnableC4290m5 = new RunnableC4290m5(this, c4307na);
        com.google.android.gms.common.internal.s.j(runnableC4290m5);
        if (this.f10711a.m28373a().m27826C()) {
            runnableC4290m5.run();
        } else {
            this.f10711a.m28373a().m27828A(runnableC4290m5);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: y */
    public final List<C4203ea> mo27925y(String str, String str2, String str3, boolean z) {
        m27938n(str, true);
        try {
            List<C4225ga> list = (List) this.f10711a.m28373a().m27817s(new CallableC4231h5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4225ga c4225ga : list) {
                if (z || !ia.V(c4225ga.f10319c)) {
                    arrayList.add(new C4203ea(c4225ga));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10711a.m28371b().r().m28012c("Failed to get user properties as. appId", q3.z(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: y0 */
    public final void mo27924y0(long j, String str, String str2, String str3) {
        m27929u1(new RunnableC4373t5(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: z */
    public final void mo27923z(C4307na c4307na) {
        com.google.android.gms.common.internal.s.f(c4307na.f10529c);
        m27938n(c4307na.f10529c, false);
        m27929u1(new RunnableC4266k5(this, c4307na));
    }
}
