package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C4179c9;
import com.google.android.gms.measurement.internal.InterfaceC4167b9;
import p201g.p252n.p253a.AbstractC7808a;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements InterfaceC4167b9 {

    /* renamed from: c */
    private C4179c9<AppMeasurementService> f9933c;

    /* renamed from: d */
    private final C4179c9<AppMeasurementService> m28486d() {
        if (this.f9933c == null) {
            this.f9933c = new C4179c9<>(this);
        }
        return this.f9933c;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4167b9
    /* renamed from: a */
    public final boolean mo28402a(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4167b9
    /* renamed from: b */
    public final void mo28401b(Intent intent) {
        AbstractC7808a.m17256b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4167b9
    /* renamed from: c */
    public final void mo28400c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m28486d().m28333b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m28486d().m28330e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m28486d().m28329f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m28486d().m28328g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m28486d().m28334a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m28486d().m28325j(intent);
        return true;
    }
}
