package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.List;
import kotlin.e0.d.g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13043s;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a;
/* compiled from: KotlinType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC12965b0 implements InterfaceC13338a, InterfaceC13073i {

    /* renamed from: c */
    private int f29024c;

    private AbstractC12965b0() {
    }

    public /* synthetic */ AbstractC12965b0(g gVar) {
        this();
    }

    /* renamed from: U0 */
    private final int m6324U0() {
        if (C12977d0.m6274a(this)) {
            return super.hashCode();
        }
        return (((mo5779W0().hashCode() * 31) + mo5780V0().hashCode()) * 31) + (mo5778X0() ? 1 : 0);
    }

    /* renamed from: V0 */
    public abstract List<InterfaceC13131v0> mo5780V0();

    /* renamed from: W0 */
    public abstract InterfaceC13125t0 mo5779W0();

    /* renamed from: X0 */
    public abstract boolean mo5778X0();

    /* renamed from: Y0 */
    public abstract AbstractC12965b0 mo5768Y0(AbstractC13026h abstractC13026h);

    /* renamed from: Z0 */
    public abstract AbstractC13005g1 mo6202Z0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC12965b0) {
            AbstractC12965b0 abstractC12965b0 = (AbstractC12965b0) obj;
            return mo5778X0() == abstractC12965b0.mo5778X0() && C13043s.f29136a.m6052a(mo6202Z0(), abstractC12965b0.mo6202Z0());
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f29024c;
        if (i != 0) {
            return i;
        }
        int m6324U0 = m6324U0();
        this.f29024c = m6324U0;
        return m6324U0;
    }

    /* renamed from: u */
    public abstract InterfaceC12777h mo5775u();
}
