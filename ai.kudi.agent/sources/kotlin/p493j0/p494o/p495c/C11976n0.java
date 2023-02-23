package kotlin.p493j0.p494o.p495c;

import java.lang.ref.WeakReference;
import kotlin.e0.d.l;
/* compiled from: moduleByClassLoader.kt */
/* renamed from: kotlin.j0.o.c.n0 */
/* loaded from: classes3.dex */
final class C11976n0 {

    /* renamed from: a */
    private final WeakReference<ClassLoader> f26681a;

    /* renamed from: b */
    private final int f26682b;

    public C11976n0(ClassLoader classLoader) {
        l.f(classLoader, "classLoader");
        this.f26681a = new WeakReference<>(classLoader);
        this.f26682b = System.identityHashCode(classLoader);
    }

    /* renamed from: a */
    public final void m10022a(ClassLoader classLoader) {
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11976n0) && this.f26681a.get() == ((C11976n0) obj).f26681a.get();
    }

    public int hashCode() {
        return this.f26682b;
    }

    public String toString() {
        String classLoader;
        ClassLoader classLoader2 = this.f26681a.get();
        return (classLoader2 == null || (classLoader = classLoader2.toString()) == null) ? "<null>" : classLoader;
    }
}
