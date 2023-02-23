package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.Collection;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
/* compiled from: ClassicBuiltinSpecialProperties.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.i */
/* loaded from: classes3.dex */
public final class C12364i {

    /* renamed from: a */
    public static final C12364i f27447a = new C12364i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.i$a */
    /* loaded from: classes3.dex */
    public static final class C12365a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        public static final C12365a f27448c = new C12365a();

        C12365a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m9114a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "it");
            return C12364i.f27447a.m9116b(interfaceC13300b);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(m9114a(interfaceC13300b));
        }
    }

    private C12364i() {
    }

    /* renamed from: c */
    private final boolean m9115c(InterfaceC13300b interfaceC13300b) {
        boolean m3814J;
        m3814J = C13742z.m3814J(C12299g.f27335a.m9260c(), C12747a.m6865e(interfaceC13300b));
        if (m3814J && interfaceC13300b.mo5072k().isEmpty()) {
            return true;
        }
        if (AbstractC12046h.m9900d0(interfaceC13300b)) {
            Collection<? extends InterfaceC13300b> mo4685g = interfaceC13300b.mo4685g();
            l.e(mo4685g, "overriddenDescriptors");
            if (!mo4685g.isEmpty()) {
                for (InterfaceC13300b interfaceC13300b2 : mo4685g) {
                    C12364i c12364i = f27447a;
                    l.e(interfaceC13300b2, "it");
                    if (c12364i.m9116b(interfaceC13300b2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public final String m9117a(InterfaceC13300b interfaceC13300b) {
        C12614f c12614f;
        l.f(interfaceC13300b, "<this>");
        boolean m9900d0 = AbstractC12046h.m9900d0(interfaceC13300b);
        if (!C13668y.f30115a || m9900d0) {
            InterfaceC13300b m6866d = C12747a.m6866d(C12747a.m6855o(interfaceC13300b), false, C12365a.f27448c, 1, null);
            if (m6866d == null || (c12614f = C12299g.f27335a.m9262a().get(C12747a.m6861i(m6866d))) == null) {
                return null;
            }
            return c12614f.m7353b();
        }
        throw new AssertionError("This method is defined only for builtin members, but " + interfaceC13300b + " found");
    }

    /* renamed from: b */
    public final boolean m9116b(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "callableMemberDescriptor");
        if (C12299g.f27335a.m9259d().contains(interfaceC13300b.mo5012b())) {
            return m9115c(interfaceC13300b);
        }
        return false;
    }
}
