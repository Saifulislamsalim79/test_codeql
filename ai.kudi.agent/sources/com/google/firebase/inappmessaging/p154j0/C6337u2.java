package com.google.firebase.inappmessaging.p154j0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import p425j.p444e.EnumC11269a;
import p425j.p444e.p449d0.AbstractC11285a;
import p425j.p444e.p471k0.C11678a;
/* compiled from: ForegroundNotifier.java */
/* renamed from: com.google.firebase.inappmessaging.j0.u2 */
/* loaded from: classes2.dex */
public class C6337u2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private Runnable f15348f;

    /* renamed from: c */
    private final Handler f15345c = new Handler();

    /* renamed from: d */
    private boolean f15346d = false;

    /* renamed from: e */
    private boolean f15347e = true;

    /* renamed from: w */
    private final C11678a<String> f15349w = C11678a.m10575v0();

    /* renamed from: a */
    public AbstractC11285a<String> m22280a() {
        return this.f15349w.m10497o0(EnumC11269a.BUFFER).m11194E();
    }

    /* renamed from: b */
    public /* synthetic */ void m22279b() {
        this.f15346d = !(this.f15346d && this.f15347e) && this.f15346d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f15347e = true;
        Runnable runnable = this.f15348f;
        if (runnable != null) {
            this.f15345c.removeCallbacks(runnable);
        }
        Handler handler = this.f15345c;
        Runnable runnable2 = new Runnable() { // from class: com.google.firebase.inappmessaging.j0.w
            @Override // java.lang.Runnable
            public final void run() {
                C6337u2.this.m22279b();
            }
        };
        this.f15348f = runnable2;
        handler.postDelayed(runnable2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f15347e = false;
        boolean z = !this.f15346d;
        this.f15346d = true;
        Runnable runnable = this.f15348f;
        if (runnable != null) {
            this.f15345c.removeCallbacks(runnable);
        }
        if (z) {
            C6163c3.m22619c("went foreground");
            this.f15349w.mo331f("ON_FOREGROUND");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
