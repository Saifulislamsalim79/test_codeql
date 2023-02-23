package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.AbstractC14111y1;
/* compiled from: MainDispatchers.kt */
/* renamed from: kotlinx.coroutines.internal.r */
/* loaded from: classes3.dex */
public final class C13906r {

    /* renamed from: a */
    private static final boolean f30394a = true;

    /* renamed from: a */
    private static final C13907s m3448a(Throwable th, String str) {
        if (f30394a) {
            return new C13907s(th, str);
        }
        if (th == null) {
            m3446c();
            throw null;
        }
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ C13907s m3447b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m3448a(th, str);
    }

    /* renamed from: c */
    public static final Void m3446c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: d */
    public static final AbstractC14111y1 m3445d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m3448a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
