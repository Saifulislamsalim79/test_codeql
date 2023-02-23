package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12393z;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12458t;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.f */
/* loaded from: classes3.dex */
public final class C12262f extends C12393z {

    /* renamed from: m */
    public static final C12262f f27329m = new C12262f();

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.f$a */
    /* loaded from: classes3.dex */
    static final class C12263a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        public static final C12263a f27330c = new C12263a();

        C12263a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m9275a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "it");
            return C12262f.f27329m.m9279j(interfaceC13300b);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(m9275a(interfaceC13300b));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.f$b */
    /* loaded from: classes3.dex */
    static final class C12264b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        public static final C12264b f27331c = new C12264b();

        C12264b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m9274a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "it");
            return (interfaceC13300b instanceof InterfaceC13554x) && C12262f.f27329m.m9279j(interfaceC13300b);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(m9274a(interfaceC13300b));
        }
    }

    private C12262f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m9279j(InterfaceC13300b interfaceC13300b) {
        boolean m3814J;
        m3814J = C13742z.m3814J(C12393z.f27500a.m9033e(), C12458t.m8856d(interfaceC13300b));
        return m3814J;
    }

    /* renamed from: k */
    public static final InterfaceC13554x m9278k(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "functionDescriptor");
        C12262f c12262f = f27329m;
        C12614f mo5012b = interfaceC13554x.mo5012b();
        l.e(mo5012b, "functionDescriptor.name");
        if (c12262f.m9277l(mo5012b)) {
            return (InterfaceC13554x) C12747a.m6866d(interfaceC13554x, false, C12263a.f27330c, 1, null);
        }
        return null;
    }

    /* renamed from: m */
    public static final C12393z.EnumC12396b m9276m(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "<this>");
        if (C12393z.f27500a.m9034d().contains(interfaceC13300b.mo5012b())) {
            InterfaceC13300b m6866d = C12747a.m6866d(interfaceC13300b, false, C12264b.f27331c, 1, null);
            String m8856d = m6866d == null ? null : C12458t.m8856d(m6866d);
            if (m8856d == null) {
                return null;
            }
            return C12393z.f27500a.m9026l(m8856d);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean m9277l(C12614f c12614f) {
        l.f(c12614f, "<this>");
        return C12393z.f27500a.m9034d().contains(c12614f);
    }
}
