package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: LifecycleDispatcher.java */
/* renamed from: androidx.lifecycle.k */
/* loaded from: classes2.dex */
class C1569k {

    /* renamed from: a */
    private static AtomicBoolean f4778a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.java */
    /* renamed from: androidx.lifecycle.k$a */
    /* loaded from: classes2.dex */
    static class C1570a extends C1551e {
        C1570a() {
        }

        @Override // androidx.lifecycle.C1551e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC1539a0.m35561g(activity);
        }

        @Override // androidx.lifecycle.C1551e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C1551e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35511a(Context context) {
        if (f4778a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1570a());
    }
}
