package com.google.android.gms.measurement.internal;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* loaded from: classes2.dex */
final class RunnableC4300n3 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ int f10488c;

    /* renamed from: d */
    final /* synthetic */ String f10489d;

    /* renamed from: e */
    final /* synthetic */ Object f10490e;

    /* renamed from: f */
    final /* synthetic */ Object f10491f;

    /* renamed from: w */
    final /* synthetic */ Object f10492w;

    /* renamed from: x */
    final /* synthetic */ q3 f10493x;

    RunnableC4300n3(q3 q3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f10493x = q3Var;
        this.f10488c = i;
        this.f10489d = str;
        this.f10490e = obj;
        this.f10491f = obj2;
        this.f10492w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g4 F = ((v5) this.f10493x).a.F();
        if (F.n()) {
            if (q3.o(this.f10493x) == 0) {
                if (((v5) this.f10493x).a.z().H()) {
                    q3 q3Var = this.f10493x;
                    ((v5) q3Var).a.d();
                    q3.E(q3Var, 'C');
                } else {
                    q3 q3Var2 = this.f10493x;
                    ((v5) q3Var2).a.d();
                    q3.E(q3Var2, 'c');
                }
            }
            if (q3.p(this.f10493x) < 0) {
                q3 q3Var3 = this.f10493x;
                ((v5) q3Var3).a.z().q();
                q3.D(q3Var3, 46000L);
            }
            char charAt = "01VDIWEA?".charAt(this.f10488c);
            char o = q3.o(this.f10493x);
            long p = q3.p(this.f10493x);
            String A = q3.A(true, this.f10489d, this.f10490e, this.f10491f, this.f10492w);
            StringBuilder sb = new StringBuilder(A.length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(o);
            sb.append(p);
            sb.append(":");
            sb.append(A);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f10489d.substring(0, 1024);
            }
            C4186d4 c4186d4 = F.d;
            if (c4186d4 != null) {
                c4186d4.m28306b(sb2, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f10493x.C(), "Persisted config not initialized. Not logging error/warn");
    }
}
