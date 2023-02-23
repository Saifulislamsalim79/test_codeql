package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C4012u0;
import com.google.android.gms.internal.measurement.C4028v0;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* loaded from: classes2.dex */
public final class C4330p9 extends AbstractC4353r9 {

    /* renamed from: d */
    private final AlarmManager f10594d;

    /* renamed from: e */
    private AbstractC4296n f10595e;

    /* renamed from: f */
    private Integer f10596f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4330p9(C4168ba c4168ba) {
        super(c4168ba);
        this.f10594d = (AlarmManager) ((v5) this).a.f().getSystemService("alarm");
    }

    /* renamed from: o */
    private final int m28002o() {
        if (this.f10596f == null) {
            String valueOf = String.valueOf(((v5) this).a.f().getPackageName());
            this.f10596f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f10596f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m28001p() {
        Context f = ((v5) this).a.f();
        return C4012u0.m28888a(f, 0, new Intent().setClassName(f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C4012u0.f9722a);
    }

    /* renamed from: q */
    private final AbstractC4296n m28000q() {
        if (this.f10595e == null) {
            this.f10595e = new C4318o9(this, this.f10625b.m28372a0());
        }
        return this.f10595e;
    }

    /* renamed from: r */
    private final void m27999r() {
        JobScheduler jobScheduler = (JobScheduler) ((v5) this).a.f().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m28002o());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4353r9
    /* renamed from: l */
    protected final boolean mo27835l() {
        AlarmManager alarmManager = this.f10594d;
        if (alarmManager != null) {
            alarmManager.cancel(m28001p());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m27999r();
            return false;
        }
        return false;
    }

    /* renamed from: m */
    public final void m28004m() {
        m27986i();
        ((v5) this).a.b().v().m28014a("Unscheduling upload");
        AlarmManager alarmManager = this.f10594d;
        if (alarmManager != null) {
            alarmManager.cancel(m28001p());
        }
        m28000q().m28027b();
        if (Build.VERSION.SDK_INT >= 24) {
            m27999r();
        }
    }

    /* renamed from: n */
    public final void m28003n(long j) {
        m27986i();
        ((v5) this).a.d();
        Context f = ((v5) this).a.f();
        if (!ia.X(f)) {
            ((v5) this).a.b().q().m28014a("Receiver not registered/enabled");
        }
        if (!ia.Y(f, false)) {
            ((v5) this).a.b().q().m28014a("Service not registered/enabled");
        }
        m28004m();
        ((v5) this).a.b().v().m28013b("Scheduling upload, millis", Long.valueOf(j));
        long mo31535a = ((v5) this).a.c().mo31535a() + j;
        ((v5) this).a.z();
        if (j < Math.max(0L, C4173c3.f10161x.m28406a(null).longValue()) && !m28000q().m28025e()) {
            m28000q().m28026d(j);
        }
        ((v5) this).a.d();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f10594d;
            if (alarmManager != null) {
                ((v5) this).a.z();
                alarmManager.setInexactRepeating(2, mo31535a, Math.max(C4173c3.f10151s.m28406a(null).longValue(), j), m28001p());
                return;
            }
            return;
        }
        Context f2 = ((v5) this).a.f();
        ComponentName componentName = new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m28002o = m28002o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C4028v0.m28803a(f2, new JobInfo.Builder(m28002o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
