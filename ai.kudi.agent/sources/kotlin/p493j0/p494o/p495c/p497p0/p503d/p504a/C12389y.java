package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12151c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13046v;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.y */
/* loaded from: classes3.dex */
public final class C12389y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.y$a */
    /* loaded from: classes3.dex */
    public static final class C12390a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        public static final C12390a f27497c = new C12390a();

        C12390a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m9048a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "it");
            return C12364i.f27447a.m9116b(C12747a.m6855o(interfaceC13300b));
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(m9048a(interfaceC13300b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.y$b */
    /* loaded from: classes3.dex */
    public static final class C12391b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        public static final C12391b f27498c = new C12391b();

        C12391b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m9047a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "it");
            return C12258e.f27327m.m9283j((InterfaceC13543t0) interfaceC13300b);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(m9047a(interfaceC13300b));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.y$c */
    /* loaded from: classes3.dex */
    static final class C12392c extends AbstractC11802m implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        public static final C12392c f27499c = new C12392c();

        C12392c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m9046a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "it");
            if (AbstractC12046h.m9900d0(interfaceC13300b)) {
                C12262f c12262f = C12262f.f27329m;
                if (C12262f.m9276m(interfaceC13300b) != null) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(m9046a(interfaceC13300b));
        }
    }

    /* renamed from: a */
    public static final boolean m9056a(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "<this>");
        return m9053d(interfaceC13300b) != null;
    }

    /* renamed from: b */
    public static final String m9055b(InterfaceC13300b interfaceC13300b) {
        C12614f m9284i;
        l.f(interfaceC13300b, "callableMemberDescriptor");
        InterfaceC13300b m9054c = m9054c(interfaceC13300b);
        InterfaceC13300b m6855o = m9054c == null ? null : C12747a.m6855o(m9054c);
        if (m6855o == null) {
            return null;
        }
        if (m6855o instanceof InterfaceC13518o0) {
            return C12364i.f27447a.m9117a(m6855o);
        }
        if (!(m6855o instanceof InterfaceC13543t0) || (m9284i = C12258e.f27327m.m9284i((InterfaceC13543t0) m6855o)) == null) {
            return null;
        }
        return m9284i.m7353b();
    }

    /* renamed from: c */
    private static final InterfaceC13300b m9054c(InterfaceC13300b interfaceC13300b) {
        if (AbstractC12046h.m9900d0(interfaceC13300b)) {
            return m9053d(interfaceC13300b);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends InterfaceC13300b> T m9053d(T t) {
        l.f(t, "<this>");
        if (C12393z.f27500a.m9031g().contains(t.mo5012b()) || C12299g.f27335a.m9259d().contains(C12747a.m6855o(t).mo5012b())) {
            if (t instanceof InterfaceC13518o0 ? true : t instanceof InterfaceC13516n0) {
                return (T) C12747a.m6866d(t, false, C12390a.f27497c, 1, null);
            }
            if (t instanceof InterfaceC13543t0) {
                return (T) C12747a.m6866d(t, false, C12391b.f27498c, 1, null);
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends InterfaceC13300b> T m9052e(T t) {
        l.f(t, "<this>");
        T t2 = (T) m9053d(t);
        if (t2 == null) {
            C12262f c12262f = C12262f.f27329m;
            C12614f mo5012b = t.mo5012b();
            l.e(mo5012b, "name");
            if (c12262f.m9277l(mo5012b)) {
                return (T) C12747a.m6866d(t, false, C12392c.f27499c, 1, null);
            }
            return null;
        }
        return t2;
    }

    /* renamed from: f */
    public static final boolean m9051f(InterfaceC13312e interfaceC13312e, InterfaceC13293a interfaceC13293a) {
        l.f(interfaceC13312e, "<this>");
        l.f(interfaceC13293a, "specialCallableDescriptor");
        AbstractC13010i0 mo5010x = ((InterfaceC13312e) interfaceC13293a.mo4687d()).mo5010x();
        l.e(mo5010x, "specialCallableDescriptor.containingDeclaration as ClassDescriptor).defaultType");
        InterfaceC13312e m7016s = C12673d.m7016s(interfaceC13312e);
        while (true) {
            if (m7016s == null) {
                return false;
            }
            if (!(m7016s instanceof InterfaceC12151c)) {
                if (C13046v.m6047b(m7016s.mo5010x(), mo5010x) != null) {
                    return !AbstractC12046h.m9900d0(m7016s);
                }
            }
            m7016s = C12673d.m7016s(m7016s);
        }
    }

    /* renamed from: g */
    public static final boolean m9050g(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "<this>");
        return C12747a.m6855o(interfaceC13300b).mo4687d() instanceof InterfaceC12151c;
    }

    /* renamed from: h */
    public static final boolean m9049h(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "<this>");
        return m9050g(interfaceC13300b) || AbstractC12046h.m9900d0(interfaceC13300b);
    }
}
