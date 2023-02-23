package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.h */
/* loaded from: classes3.dex */
final class C13158h implements InterfaceC13142b {

    /* renamed from: a */
    public static final C13158h f29241a = new C13158h();

    /* renamed from: b */
    private static final String f29242b = "should not have varargs or parameters with default values";

    private C13158h() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: a */
    public String mo5718a() {
        return f29242b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: b */
    public String mo5717b(InterfaceC13554x interfaceC13554x) {
        return InterfaceC13142b.C13143a.m5734a(this, interfaceC13554x);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: c */
    public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
        boolean z;
        l.f(interfaceC13554x, "functionDescriptor");
        List<InterfaceC13307c1> mo5072k = interfaceC13554x.mo5072k();
        l.e(mo5072k, "functionDescriptor.valueParameters");
        if (!(mo5072k instanceof Collection) || !mo5072k.isEmpty()) {
            for (InterfaceC13307c1 interfaceC13307c1 : mo5072k) {
                l.e(interfaceC13307c1, "it");
                if (C12747a.m6869a(interfaceC13307c1) || interfaceC13307c1.mo5131v0() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }
}
