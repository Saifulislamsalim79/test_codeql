package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13074j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13075k;
import kotlin.p549l0.C13273p;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: KotlinType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.i0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13010i0 extends AbstractC13005g1 implements InterfaceC13074j, InterfaceC13075k {
    public AbstractC13010i0() {
        super(null);
    }

    /* renamed from: d1 */
    public abstract AbstractC13010i0 mo5826d1(boolean z);

    /* renamed from: e1 */
    public abstract AbstractC13010i0 mo5825e1(InterfaceC13346g interfaceC13346g);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<InterfaceC13340c> it = mo4956y().iterator();
        while (it.hasNext()) {
            C13273p.m5456j(sb, "[", AbstractC12624c.m7334s(AbstractC12624c.f28405c, it.next(), null, 2, null), "] ");
        }
        sb.append(mo5779W0());
        if (!mo5780V0().isEmpty()) {
            C13742z.m3799Y(mo5780V0(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo5778X0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
