package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C3919o1;
import com.google.android.gms.measurement.internal.InterfaceC4167b9;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* loaded from: classes2.dex */
public final class C4179c9<T extends Context & InterfaceC4167b9> {

    /* renamed from: a */
    private final T f10177a;

    public C4179c9(T t) {
        com.google.android.gms.common.internal.s.j(t);
        this.f10177a = t;
    }

    /* renamed from: k */
    private final q3 m28324k() {
        return b5.H(this.f10177a, (C3919o1) null, (Long) null).b();
    }

    /* renamed from: a */
    public final int m28334a(final Intent intent, int i, final int i2) {
        b5 H = b5.H(this.f10177a, (C3919o1) null, (Long) null);
        final q3 b = H.b();
        if (intent == null) {
            b.w().m28014a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.d();
        b.v().m28012c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m28327h(new Runnable() { // from class: com.google.android.gms.measurement.internal.y8
                @Override // java.lang.Runnable
                public final void run() {
                    C4179c9.this.m28332c(i2, b, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m28333b(Intent intent) {
        if (intent == null) {
            m28324k().r().m28014a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C4385u5(C4168ba.m28366d0(this.f10177a), null);
        }
        m28324k().w().m28013b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m28332c(int i, q3 q3Var, Intent intent) {
        if (this.f10177a.mo28402a(i)) {
            q3Var.v().m28013b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m28324k().v().m28014a("Completed wakeful intent.");
            this.f10177a.mo28401b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m28331d(q3 q3Var, JobParameters jobParameters) {
        q3Var.v().m28014a("AppMeasurementJobService processed last upload request.");
        this.f10177a.mo28400c(jobParameters, false);
    }

    /* renamed from: e */
    public final void m28330e() {
        b5 H = b5.H(this.f10177a, (C3919o1) null, (Long) null);
        q3 b = H.b();
        H.d();
        b.v().m28014a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void m28329f() {
        b5 H = b5.H(this.f10177a, (C3919o1) null, (Long) null);
        q3 b = H.b();
        H.d();
        b.v().m28014a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void m28328g(Intent intent) {
        if (intent == null) {
            m28324k().r().m28014a("onRebind called with null intent");
            return;
        }
        m28324k().v().m28013b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void m28327h(Runnable runnable) {
        C4168ba m28366d0 = C4168ba.m28366d0(this.f10177a);
        m28366d0.m28373a().m27810z(new RunnableC4156a9(this, m28366d0, runnable));
    }

    /* renamed from: i */
    public final boolean m28326i(final JobParameters jobParameters) {
        b5 H = b5.H(this.f10177a, (C3919o1) null, (Long) null);
        final q3 b = H.b();
        String string = jobParameters.getExtras().getString("action");
        H.d();
        b.v().m28013b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m28327h(new Runnable() { // from class: com.google.android.gms.measurement.internal.z8
                @Override // java.lang.Runnable
                public final void run() {
                    C4179c9.this.m28331d(b, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m28325j(Intent intent) {
        if (intent == null) {
            m28324k().r().m28014a("onUnbind called with null intent");
            return true;
        }
        m28324k().v().m28013b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
