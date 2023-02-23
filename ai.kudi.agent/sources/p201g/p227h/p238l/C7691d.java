package p201g.p227h.p238l;

import android.os.Build;
import android.view.DisplayCutout;
import p201g.p227h.p237k.C7670c;
/* compiled from: DisplayCutoutCompat.java */
/* renamed from: g.h.l.d */
/* loaded from: classes2.dex */
public final class C7691d {

    /* renamed from: a */
    private final Object f18426a;

    private C7691d(Object obj) {
        this.f18426a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C7691d m17808e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C7691d(obj);
    }

    /* renamed from: a */
    public int m17812a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f18426a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int m17811b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f18426a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m17810c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f18426a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m17809d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f18426a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7691d.class != obj.getClass()) {
            return false;
        }
        return C7670c.m17875a(this.f18426a, ((C7691d) obj).f18426a);
    }

    public int hashCode() {
        Object obj = this.f18426a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f18426a + "}";
    }
}
