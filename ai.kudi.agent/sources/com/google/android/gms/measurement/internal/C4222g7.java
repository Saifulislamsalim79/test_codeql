package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* loaded from: classes2.dex */
public final class C4222g7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    final /* synthetic */ C4245i7 f10309c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4222g7(C4245i7 c4245i7, C4211f7 c4211f7) {
        this.f10309c = c4245i7;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b5 b5Var;
        try {
            try {
                ((v5) this.f10309c).a.b().v().m28014a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    b5Var = ((v5) this.f10309c).a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        ((v5) this.f10309c).a.N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        ((v5) this.f10309c).a.a().m27810z(new RunnableC4200e7(this, z, data, str, queryParameter));
                        b5Var = ((v5) this.f10309c).a;
                    }
                    b5Var = ((v5) this.f10309c).a;
                }
            } catch (RuntimeException e) {
                ((v5) this.f10309c).a.b().r().m28013b("Throwable caught in onActivityCreated", e);
                b5Var = ((v5) this.f10309c).a;
            }
            b5Var.K().m27884z(activity, bundle);
        } catch (Throwable th) {
            ((v5) this.f10309c).a.K().m27884z(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ((v5) this.f10309c).a.K().m27904A(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ((v5) this.f10309c).a.K().m27903B(activity);
        C4294m9 M = ((v5) this.f10309c).a.M();
        ((v5) M).a.a().m27810z(new RunnableC4202e9(M, ((v5) M).a.c().mo31535a()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C4294m9 M = ((v5) this.f10309c).a.M();
        ((v5) M).a.a().m27810z(new RunnableC4191d9(M, ((v5) M).a.c().mo31535a()));
        ((v5) this.f10309c).a.K().m27902C(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ((v5) this.f10309c).a.K().m27901D(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
