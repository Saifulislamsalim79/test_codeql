package dagger.android.p197e;

import android.util.Log;
import androidx.fragment.app.Fragment;
import dagger.android.b;
import dagger.android.d;
import p382i.p383b.C9473g;
/* compiled from: AndroidSupportInjection.java */
/* renamed from: dagger.android.e.a */
/* loaded from: classes2.dex */
public final class C7429a {
    /* renamed from: a */
    private static d m18753a(Fragment fragment) {
        d dVar = fragment;
        do {
            dVar = dVar.getParentFragment();
            if (dVar == null) {
                d activity = fragment.getActivity();
                if (activity instanceof d) {
                    return activity;
                }
                if (activity.getApplication() instanceof d) {
                    return (d) activity.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
            }
        } while (!(dVar instanceof d));
        return dVar;
    }

    /* renamed from: b */
    public static void m18752b(Fragment fragment) {
        C9473g.m14649c(fragment, "fragment");
        d m18753a = m18753a(fragment);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), m18753a.getClass().getCanonicalName()));
        }
        m18751c(fragment, m18753a);
    }

    /* renamed from: c */
    private static void m18751c(Object obj, d dVar) {
        b androidInjector = dVar.androidInjector();
        C9473g.m14648d(androidInjector, "%s.androidInjector() returned null", dVar.getClass());
        androidInjector.inject(obj);
    }
}
