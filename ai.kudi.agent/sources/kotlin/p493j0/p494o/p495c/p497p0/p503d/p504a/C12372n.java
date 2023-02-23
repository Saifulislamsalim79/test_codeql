package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.C12185c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: FieldOverridabilityCondition.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.n */
/* loaded from: classes3.dex */
public final class C12372n implements InterfaceC12674e {
    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e
    /* renamed from: a */
    public InterfaceC12674e.EnumC12675a mo7008a() {
        return InterfaceC12674e.EnumC12675a.BOTH;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e
    /* renamed from: b */
    public InterfaceC12674e.EnumC12676b mo7007b(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13293a, "superDescriptor");
        l.f(interfaceC13293a2, "subDescriptor");
        if ((interfaceC13293a2 instanceof InterfaceC13518o0) && (interfaceC13293a instanceof InterfaceC13518o0)) {
            InterfaceC13518o0 interfaceC13518o0 = (InterfaceC13518o0) interfaceC13293a2;
            InterfaceC13518o0 interfaceC13518o02 = (InterfaceC13518o0) interfaceC13293a;
            if (l.b(interfaceC13518o0.mo5012b(), interfaceC13518o02.mo5012b())) {
                if (C12185c.m9513a(interfaceC13518o0) && C12185c.m9513a(interfaceC13518o02)) {
                    return InterfaceC12674e.EnumC12676b.OVERRIDABLE;
                }
                if (!C12185c.m9513a(interfaceC13518o0) && !C12185c.m9513a(interfaceC13518o02)) {
                    return InterfaceC12674e.EnumC12676b.UNKNOWN;
                }
                return InterfaceC12674e.EnumC12676b.INCOMPATIBLE;
            }
            return InterfaceC12674e.EnumC12676b.UNKNOWN;
        }
        return InterfaceC12674e.EnumC12676b.UNKNOWN;
    }
}
