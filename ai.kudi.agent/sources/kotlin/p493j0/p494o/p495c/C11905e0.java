package kotlin.p493j0.p494o.p495c;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a.C13465k;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: moduleByClassLoader.kt */
/* renamed from: kotlin.j0.o.c.e0 */
/* loaded from: classes3.dex */
public final class C11905e0 {

    /* renamed from: a */
    private static final ConcurrentMap<C11976n0, WeakReference<C13465k>> f26589a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C13465k m10181a(Class<?> cls) {
        l.f(cls, "$this$getOrCreateModule");
        ClassLoader m4889e = C13474b.m4889e(cls);
        C11976n0 c11976n0 = new C11976n0(m4889e);
        WeakReference<C13465k> weakReference = f26589a.get(c11976n0);
        if (weakReference != null) {
            C13465k c13465k = weakReference.get();
            if (c13465k != null) {
                l.e(c13465k, "it");
                return c13465k;
            }
            f26589a.remove(c11976n0, weakReference);
        }
        C13465k m4908a = C13465k.f29821c.m4908a(m4889e);
        while (true) {
            try {
                WeakReference<C13465k> putIfAbsent = f26589a.putIfAbsent(c11976n0, new WeakReference<>(m4908a));
                if (putIfAbsent == null) {
                    return m4908a;
                }
                C13465k c13465k2 = putIfAbsent.get();
                if (c13465k2 != null) {
                    return c13465k2;
                }
                f26589a.remove(c11976n0, putIfAbsent);
            } finally {
                c11976n0.m10022a(null);
            }
        }
    }
}
