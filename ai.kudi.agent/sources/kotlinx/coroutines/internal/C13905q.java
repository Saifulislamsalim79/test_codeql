package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlinx.coroutines.AbstractC14111y1;
/* compiled from: MainDispatchers.kt */
/* renamed from: kotlinx.coroutines.internal.q */
/* loaded from: classes3.dex */
public final class C13905q {

    /* renamed from: a */
    public static final C13905q f30391a = new C13905q();

    /* renamed from: b */
    private static final boolean f30392b = C13915z.m3416e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final AbstractC14111y1 f30393c = f30391a.m3449a();

    private C13905q() {
    }

    /* renamed from: a */
    private final AbstractC14111y1 m3449a() {
        InterfaceC13230h m5588a;
        List<MainDispatcherFactory> m5563x;
        Object next;
        try {
            if (f30392b) {
                m5563x = C13892i.f30372a.m3499c();
            } else {
                m5588a = C13234l.m5588a(a.b());
                m5563x = C13242n.m5563x(m5588a);
            }
            Iterator<T> it = m5563x.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory == null) {
                return C13906r.m3447b(null, null, 3, null);
            }
            return C13906r.m3445d(mainDispatcherFactory, m5563x);
        } catch (Throwable th) {
            return C13906r.m3447b(th, null, 2, null);
        }
    }
}
