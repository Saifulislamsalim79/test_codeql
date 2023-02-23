package kotlinx.coroutines.internal;

import kotlinx.coroutines.C14034r0;
/* compiled from: Atomic.kt */
/* renamed from: kotlinx.coroutines.internal.u */
/* loaded from: classes3.dex */
public abstract class AbstractC13910u {
    /* renamed from: a */
    public abstract AbstractC13877d<?> mo3438a();

    /* renamed from: b */
    public final boolean m3437b(AbstractC13910u abstractC13910u) {
        AbstractC13877d<?> mo3438a;
        AbstractC13877d<?> mo3438a2 = mo3438a();
        return (mo3438a2 == null || (mo3438a = abstractC13910u.mo3438a()) == null || mo3438a2.m3544f() >= mo3438a.m3544f()) ? false : true;
    }

    /* renamed from: c */
    public abstract Object mo3436c(Object obj);

    public String toString() {
        return C14034r0.m3204a(this) + '@' + C14034r0.m3203b(this);
    }
}
