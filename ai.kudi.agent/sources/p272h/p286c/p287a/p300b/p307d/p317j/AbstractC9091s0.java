package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9091s0 extends AbstractC8972k0 implements Set {

    /* renamed from: d */
    private transient AbstractC9047p0 f21471d;

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
        return C8988l1.m15668a(this);
    }

    /* renamed from: k */
    public final AbstractC9047p0 m15550k() {
        AbstractC9047p0 abstractC9047p0 = this.f21471d;
        if (abstractC9047p0 == null) {
            AbstractC9047p0 mo15549l = mo15549l();
            this.f21471d = mo15549l;
            return mo15549l;
        }
        return abstractC9047p0;
    }

    /* renamed from: l */
    AbstractC9047p0 mo15549l() {
        return AbstractC9047p0.m15580l(toArray());
    }
}
