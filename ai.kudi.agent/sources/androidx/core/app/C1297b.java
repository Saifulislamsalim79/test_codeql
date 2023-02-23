package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
/* compiled from: ActivityOptionsCompat.java */
/* renamed from: androidx.core.app.b */
/* loaded from: classes2.dex */
public class C1297b {

    /* compiled from: ActivityOptionsCompat.java */
    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes2.dex */
    private static class C1298a extends C1297b {

        /* renamed from: a */
        private final ActivityOptions f4061a;

        C1298a(ActivityOptions activityOptions) {
            this.f4061a = activityOptions;
        }

        @Override // androidx.core.app.C1297b
        /* renamed from: c */
        public Bundle mo36456c() {
            return this.f4061a.toBundle();
        }
    }

    protected C1297b() {
    }

    /* renamed from: a */
    public static C1297b m36458a(Context context, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C1298a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C1297b();
    }

    /* renamed from: b */
    public static C1297b m36457b(Activity activity, View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C1298a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new C1297b();
    }

    /* renamed from: c */
    public Bundle mo36456c() {
        return null;
    }
}
