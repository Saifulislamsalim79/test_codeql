package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import androidx.core.app.AbstractC1330p;
import java.util.ArrayList;
import p201g.p218e.C7521a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransition.java */
/* renamed from: androidx.fragment.app.c0 */
/* loaded from: classes2.dex */
public class C1452c0 {

    /* renamed from: a */
    static final AbstractC1463e0 f4487a;

    /* renamed from: b */
    static final AbstractC1463e0 f4488b;

    static {
        f4487a = Build.VERSION.SDK_INT >= 21 ? new C1454d0() : null;
        f4488b = m35815c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35817a(Fragment fragment, Fragment fragment2, boolean z, C7521a<String, View> c7521a, boolean z2) {
        AbstractC1330p enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c7521a == null ? 0 : c7521a.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(c7521a.m18452k(i));
                arrayList.add(c7521a.m18448o(i));
            }
            if (z2) {
                enterTransitionCallback.m36338f(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m36339e(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m35816b(C7521a<String, String> c7521a, String str) {
        int size = c7521a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c7521a.m18448o(i))) {
                return c7521a.m18452k(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static AbstractC1463e0 m35815c() {
        try {
            return (AbstractC1463e0) Class.forName("g.v.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m35814d(C7521a<String, String> c7521a, C7521a<String, View> c7521a2) {
        for (int size = c7521a.size() - 1; size >= 0; size--) {
            if (!c7521a2.containsKey(c7521a.m18448o(size))) {
                c7521a.mo18450m(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m35813e(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }
}
