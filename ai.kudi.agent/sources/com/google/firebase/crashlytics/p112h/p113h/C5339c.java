package com.google.firebase.crashlytics.p112h.p113h;

import android.os.Bundle;
import com.google.firebase.crashlytics.p112h.C5335f;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: BlockingAnalyticsEventLogger.java */
/* renamed from: com.google.firebase.crashlytics.h.h.c */
/* loaded from: classes2.dex */
public class C5339c implements InterfaceC5338b, InterfaceC5337a {

    /* renamed from: a */
    private final C5341e f13189a;

    /* renamed from: b */
    private final int f13190b;

    /* renamed from: c */
    private final TimeUnit f13191c;

    /* renamed from: d */
    private final Object f13192d = new Object();

    /* renamed from: e */
    private CountDownLatch f13193e;

    public C5339c(C5341e c5341e, int i, TimeUnit timeUnit) {
        this.f13189a = c5341e;
        this.f13190b = i;
        this.f13191c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.p112h.p113h.InterfaceC5337a
    /* renamed from: a */
    public void mo25088a(String str, Bundle bundle) {
        synchronized (this.f13192d) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25099i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f13193e = new CountDownLatch(1);
            this.f13189a.mo25088a(str, bundle);
            C5335f.m25102f().m25099i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f13193e.await(this.f13190b, this.f13191c)) {
                    C5335f.m25102f().m25099i("App exception callback received from Analytics listener.");
                } else {
                    C5335f.m25102f().m25097k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                C5335f.m25102f().m25104d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f13193e = null;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p113h.InterfaceC5338b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f13193e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
