package p201g.p266v;

import android.os.Build;
import android.view.ViewGroup;
/* compiled from: ViewGroupUtils.java */
/* renamed from: g.v.x */
/* loaded from: classes2.dex */
class C8182x {

    /* renamed from: a */
    private static boolean f19635a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC8181w m16569a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C8180v(viewGroup);
        }
        return C8179u.m16572g(viewGroup);
    }

    /* renamed from: b */
    private static void m16568b(ViewGroup viewGroup, boolean z) {
        if (f19635a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f19635a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m16567c(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m16568b(viewGroup, z);
        } else {
            C8183y.m16565b(viewGroup, z);
        }
    }
}
