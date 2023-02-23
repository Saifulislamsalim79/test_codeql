package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.Set;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.m */
/* loaded from: classes2.dex */
public abstract class AbstractC8509m extends AbstractC8497g implements Set {

    /* renamed from: d */
    private transient AbstractC8503j f20217d;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C8525u.m15999a(this);
    }

    /* renamed from: k */
    public final AbstractC8503j m16017k() {
        AbstractC8503j abstractC8503j = this.f20217d;
        if (abstractC8503j == null) {
            AbstractC8503j mo16008l = mo16008l();
            this.f20217d = mo16008l;
            return mo16008l;
        }
        return abstractC8503j;
    }

    /* renamed from: l */
    AbstractC8503j mo16008l() {
        return AbstractC8503j.m16024l(toArray());
    }
}
