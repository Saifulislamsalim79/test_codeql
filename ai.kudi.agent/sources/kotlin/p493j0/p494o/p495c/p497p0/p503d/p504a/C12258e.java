package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12458t;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.e */
/* loaded from: classes3.dex */
public final class C12258e extends C12393z {

    /* renamed from: m */
    public static final C12258e f27327m = new C12258e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.e$a */
    /* loaded from: classes3.dex */
    public static final class C12259a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13543t0 f27328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12259a(InterfaceC13543t0 interfaceC13543t0) {
            super(1);
            this.f27328c = interfaceC13543t0;
        }

        /* renamed from: a */
        public final boolean m9281a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "it");
            Map<String, C12614f> m9028j = C12393z.f27500a.m9028j();
            String m8856d = C12458t.m8856d(this.f27328c);
            if (m9028j != null) {
                return m9028j.containsKey(m8856d);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(m9281a(interfaceC13300b));
        }
    }

    private C12258e() {
    }

    /* renamed from: i */
    public final C12614f m9284i(InterfaceC13543t0 interfaceC13543t0) {
        l.f(interfaceC13543t0, "functionDescriptor");
        Map<String, C12614f> m9028j = C12393z.f27500a.m9028j();
        String m8856d = C12458t.m8856d(interfaceC13543t0);
        if (m8856d == null) {
            return null;
        }
        return m9028j.get(m8856d);
    }

    /* renamed from: j */
    public final boolean m9283j(InterfaceC13543t0 interfaceC13543t0) {
        l.f(interfaceC13543t0, "functionDescriptor");
        return AbstractC12046h.m9900d0(interfaceC13543t0) && C12747a.m6866d(interfaceC13543t0, false, new C12259a(interfaceC13543t0), 1, null) != null;
    }

    /* renamed from: k */
    public final boolean m9282k(InterfaceC13543t0 interfaceC13543t0) {
        l.f(interfaceC13543t0, "<this>");
        return l.b(interfaceC13543t0.mo5012b().m7353b(), "removeAt") && l.b(C12458t.m8856d(interfaceC13543t0), C12393z.f27500a.m9030h().m9023b());
    }
}
