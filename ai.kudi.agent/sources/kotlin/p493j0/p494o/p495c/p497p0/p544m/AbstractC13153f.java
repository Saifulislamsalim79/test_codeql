package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.f */
/* loaded from: classes3.dex */
public abstract class AbstractC13153f implements InterfaceC13142b {

    /* renamed from: a */
    private final String f29237a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.f$a */
    /* loaded from: classes3.dex */
    public static final class C13154a extends AbstractC13153f {

        /* renamed from: b */
        public static final C13154a f29238b = new C13154a();

        private C13154a() {
            super("must be a member function", null);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
        /* renamed from: c */
        public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "functionDescriptor");
            return interfaceC13554x.mo5066p0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.f$b */
    /* loaded from: classes3.dex */
    public static final class C13155b extends AbstractC13153f {

        /* renamed from: b */
        public static final C13155b f29239b = new C13155b();

        private C13155b() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
        /* renamed from: c */
        public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "functionDescriptor");
            return (interfaceC13554x.mo5066p0() == null && interfaceC13554x.mo5056w0() == null) ? false : true;
        }
    }

    private AbstractC13153f(String str) {
        this.f29237a = str;
    }

    public /* synthetic */ AbstractC13153f(String str, g gVar) {
        this(str);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: a */
    public String mo5718a() {
        return this.f29237a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: b */
    public String mo5717b(InterfaceC13554x interfaceC13554x) {
        return InterfaceC13142b.C13143a.m5734a(this, interfaceC13554x);
    }
}
