package p201g.p227h.p234i;

import android.os.Handler;
import android.os.Looper;
/* compiled from: CalleeHandler.java */
/* renamed from: g.h.i.b */
/* loaded from: classes2.dex */
class C7632b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Handler m17967a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
