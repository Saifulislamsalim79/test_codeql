package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4179c9;
import com.google.android.gms.measurement.internal.InterfaceC4167b9;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC4167b9 {

    /* renamed from: c */
    private C4179c9<AppMeasurementJobService> f9931c;

    /* renamed from: d */
    private final C4179c9<AppMeasurementJobService> m28487d() {
        if (this.f9931c == null) {
            this.f9931c = new C4179c9<>(this);
        }
        return this.f9931c;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4167b9
    /* renamed from: a */
    public final boolean mo28402a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4167b9
    /* renamed from: b */
    public final void mo28401b(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4167b9
    /* renamed from: c */
    public final void mo28400c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m28487d().m28330e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m28487d().m28329f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m28487d().m28328g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m28487d().m28326i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m28487d().m28325j(intent);
        return true;
    }
}
