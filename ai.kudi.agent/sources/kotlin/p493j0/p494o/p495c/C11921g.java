package kotlin.p493j0.p494o.p495c;

import java.lang.ref.WeakReference;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p547q0.C13182b;
/* compiled from: kClassCache.kt */
/* renamed from: kotlin.j0.o.c.g */
/* loaded from: classes3.dex */
public final class C11921g {

    /* renamed from: a */
    private static C13182b<String, Object> f26605a;

    static {
        C13182b<String, Object> m5692b = C13182b.m5692b();
        l.e(m5692b, "HashPMap.empty<String, Any>()");
        f26605a = m5692b;
    }

    /* renamed from: a */
    public static final <T> C11923h<T> m10158a(Class<T> cls) {
        l.f(cls, "jClass");
        String name = cls.getName();
        Object m5691c = f26605a.m5691c(name);
        if (m5691c instanceof WeakReference) {
            C11923h<T> c11923h = (C11923h) ((WeakReference) m5691c).get();
            if (l.b(c11923h != null ? c11923h.mo9979a() : null, cls)) {
                return c11923h;
            }
        } else if (m5691c != null) {
            for (WeakReference weakReference : (WeakReference[]) m5691c) {
                C11923h<T> c11923h2 = (C11923h) weakReference.get();
                if (l.b(c11923h2 != null ? c11923h2.mo9979a() : null, cls)) {
                    return c11923h2;
                }
            }
            int length = ((Object[]) m5691c).length;
            WeakReference[] weakReferenceArr = new WeakReference[length + 1];
            System.arraycopy(m5691c, 0, weakReferenceArr, 0, length);
            C11923h<T> c11923h3 = new C11923h<>(cls);
            weakReferenceArr[length] = new WeakReference(c11923h3);
            C13182b<String, Object> m5688f = f26605a.m5688f(name, weakReferenceArr);
            l.e(m5688f, "K_CLASS_CACHE.plus(name, newArray)");
            f26605a = m5688f;
            return c11923h3;
        }
        C11923h<T> c11923h4 = new C11923h<>(cls);
        C13182b<String, Object> m5688f2 = f26605a.m5688f(name, new WeakReference(c11923h4));
        l.e(m5688f2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        f26605a = m5688f2;
        return c11923h4;
    }
}
