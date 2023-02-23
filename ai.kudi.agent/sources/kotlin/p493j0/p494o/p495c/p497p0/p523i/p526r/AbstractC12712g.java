package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.g */
/* loaded from: classes3.dex */
public abstract class AbstractC12712g<T> {

    /* renamed from: a */
    private final T f28572a;

    public AbstractC12712g(T t) {
        this.f28572a = t;
    }

    /* renamed from: a */
    public abstract AbstractC12965b0 mo6871a(InterfaceC13305c0 interfaceC13305c0);

    /* renamed from: b */
    public T mo6905b() {
        return this.f28572a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T mo6905b = mo6905b();
            AbstractC12712g abstractC12712g = obj instanceof AbstractC12712g ? (AbstractC12712g) obj : null;
            if (!l.b(mo6905b, abstractC12712g != null ? abstractC12712g.mo6905b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T mo6905b = mo6905b();
        if (mo6905b == null) {
            return 0;
        }
        return mo6905b.hashCode();
    }

    public String toString() {
        return String.valueOf(mo6905b());
    }
}
