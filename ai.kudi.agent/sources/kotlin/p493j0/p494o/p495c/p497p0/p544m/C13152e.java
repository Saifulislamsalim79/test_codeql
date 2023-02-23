package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12055j;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.e */
/* loaded from: classes3.dex */
final class C13152e implements InterfaceC13142b {

    /* renamed from: a */
    public static final C13152e f29235a = new C13152e();

    /* renamed from: b */
    private static final String f29236b = "second parameter must be of type KProperty<*> or its supertype";

    private C13152e() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: a */
    public String mo5718a() {
        return f29236b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: b */
    public String mo5717b(InterfaceC13554x interfaceC13554x) {
        return InterfaceC13142b.C13143a.m5734a(this, interfaceC13554x);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: c */
    public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "functionDescriptor");
        InterfaceC13307c1 interfaceC13307c1 = interfaceC13554x.mo5072k().get(1);
        C12055j.C12057b c12057b = C12055j.f26791d;
        l.e(interfaceC13307c1, "secondParameter");
        AbstractC12965b0 m9840a = c12057b.m9840a(C12747a.m6858l(interfaceC13307c1));
        if (m9840a == null) {
            return false;
        }
        AbstractC12965b0 mo5121c = interfaceC13307c1.mo5121c();
        l.e(mo5121c, "secondParameter.type");
        return C13090a.m5895l(m9840a, C13090a.m5892o(mo5121c));
    }
}
