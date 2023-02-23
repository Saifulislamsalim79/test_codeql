package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.C13288p;
import kotlin.C13291q;
/* compiled from: HandlerDispatcher.kt */
/* renamed from: kotlinx.coroutines.android.c */
/* loaded from: classes3.dex */
public final class C13753c {
    private static volatile Choreographer choreographer;

    static {
        Object m5358a;
        try {
            C13288p.C13289a c13289a = C13288p.f29444c;
            m5358a = new C13751a(m3759a(Looper.getMainLooper(), true), null, 2, null);
            C13288p.m5362a(m5358a);
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
        }
        AbstractC13752b abstractC13752b = C13288p.m5360c(m5358a) ? null : m5358a;
    }

    /* renamed from: a */
    public static final Handler m3759a(Looper looper, boolean z) {
        int i;
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
