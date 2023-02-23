package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3819hc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* loaded from: classes2.dex */
public final class C4282l9 {

    /* renamed from: a */
    final /* synthetic */ C4294m9 f10458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4282l9(C4294m9 c4294m9) {
        this.f10458a = c4294m9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m28039a() {
        this.f10458a.h();
        if (((v5) this.f10458a).a.F().v(((v5) this.f10458a).a.c().currentTimeMillis())) {
            ((v5) this.f10458a).a.F().l.m27806a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ((v5) this.f10458a).a.b().v().m28014a("Detected application was in foreground");
                m28037c(((v5) this.f10458a).a.c().currentTimeMillis(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m28038b(long j, boolean z) {
        this.f10458a.h();
        this.f10458a.m28029s();
        if (((v5) this.f10458a).a.F().v(j)) {
            ((v5) this.f10458a).a.F().l.m27806a(true);
        }
        ((v5) this.f10458a).a.F().o.m28403b(j);
        if (((v5) this.f10458a).a.F().l.m27805b()) {
            m28037c(j, z);
        }
    }

    /* renamed from: c */
    final void m28037c(long j, boolean z) {
        this.f10458a.h();
        if (((v5) this.f10458a).a.o()) {
            ((v5) this.f10458a).a.F().o.m28403b(j);
            ((v5) this.f10458a).a.b().v().m28013b("Session started, time", Long.valueOf(((v5) this.f10458a).a.c().mo31535a()));
            Long valueOf = Long.valueOf(j / 1000);
            ((v5) this.f10458a).a.I().m28152N("auto", "_sid", valueOf, j);
            ((v5) this.f10458a).a.F().l.m27806a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (((v5) this.f10458a).a.z().B(null, C4173c3.f10124e0) && z) {
                bundle.putLong("_aib", 1L);
            }
            ((v5) this.f10458a).a.I().m28123v("auto", "_s", j, bundle);
            C3819hc.m29541b();
            if (((v5) this.f10458a).a.z().B(null, C4173c3.f10132i0)) {
                String m28272a = ((v5) this.f10458a).a.F().t.m28272a();
                if (TextUtils.isEmpty(m28272a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m28272a);
                ((v5) this.f10458a).a.I().m28123v("auto", "_ssr", j, bundle2);
            }
        }
    }
}
