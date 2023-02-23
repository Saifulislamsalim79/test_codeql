package p272h.p286c.p287a.p300b.p307d.p316i;

import java.util.Set;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.x9 */
/* loaded from: classes2.dex */
public abstract class AbstractC8798x9 extends AbstractC8721q9 implements Set {

    /* renamed from: d */
    private transient AbstractC8765u9 f20753d;

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
        return C8591ea.m15972a(this);
    }

    /* renamed from: k */
    public final AbstractC8765u9 m15852k() {
        AbstractC8765u9 abstractC8765u9 = this.f20753d;
        if (abstractC8765u9 == null) {
            AbstractC8765u9 mo15851l = mo15851l();
            this.f20753d = mo15851l;
            return mo15851l;
        }
        return abstractC8765u9;
    }

    /* renamed from: l */
    AbstractC8765u9 mo15851l() {
        return AbstractC8765u9.m15882l(toArray());
    }
}
