package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* compiled from: ModuleDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c0 */
/* loaded from: classes3.dex */
public interface InterfaceC13305c0 extends InterfaceC13513m {

    /* compiled from: ModuleDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c0$a */
    /* loaded from: classes3.dex */
    public static final class C13306a {
        /* renamed from: a */
        public static <R, D> R m5346a(InterfaceC13305c0 interfaceC13305c0, InterfaceC13517o<R, D> interfaceC13517o, D d) {
            kotlin.e0.d.l.f(interfaceC13305c0, "this");
            kotlin.e0.d.l.f(interfaceC13517o, "visitor");
            return interfaceC13517o.mo4754j(interfaceC13305c0, d);
        }

        /* renamed from: b */
        public static InterfaceC13513m m5345b(InterfaceC13305c0 interfaceC13305c0) {
            kotlin.e0.d.l.f(interfaceC13305c0, "this");
            return null;
        }
    }

    /* renamed from: C0 */
    List<InterfaceC13305c0> mo5000C0();

    /* renamed from: Q0 */
    <T> T mo4998Q0(C13302b0<T> c13302b0);

    /* renamed from: V */
    InterfaceC13448k0 mo4996V(C12609c c12609c);

    /* renamed from: o0 */
    boolean mo4980o0(InterfaceC13305c0 interfaceC13305c0);

    /* renamed from: s */
    AbstractC12046h mo4979s();

    /* renamed from: t */
    Collection<C12609c> mo4978t(C12609c c12609c, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l);
}
