package p201g.p227h.p238l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
/* compiled from: PointerIconCompat.java */
/* renamed from: g.h.l.u */
/* loaded from: classes2.dex */
public final class C7756u {

    /* renamed from: a */
    private Object f18511a;

    private C7756u(Object obj) {
        this.f18511a = obj;
    }

    /* renamed from: b */
    public static C7756u m17568b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C7756u(PointerIcon.getSystemIcon(context, i));
        }
        return new C7756u(null);
    }

    /* renamed from: a */
    public Object m17569a() {
        return this.f18511a;
    }
}
