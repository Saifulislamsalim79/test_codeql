package dagger.android;

import android.app.Activity;
import p382i.p383b.C9473g;
/* compiled from: AndroidInjection.java */
/* renamed from: dagger.android.a */
/* loaded from: classes2.dex */
public final class C7427a {
    /* renamed from: a */
    public static void m18756a(Activity activity) {
        C9473g.m14649c(activity, "activity");
        d application = activity.getApplication();
        if (application instanceof d) {
            m18755b(activity, application);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), d.class.getCanonicalName()));
    }

    /* renamed from: b */
    private static void m18755b(Object obj, d dVar) {
        b androidInjector = dVar.androidInjector();
        C9473g.m14648d(androidInjector, "%s.androidInjector() returned null", dVar.getClass());
        androidInjector.inject(obj);
    }
}
