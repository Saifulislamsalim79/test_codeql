package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: RuntimeErrorReporter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.j */
/* loaded from: classes3.dex */
public final class C13464j implements InterfaceC12899p {

    /* renamed from: b */
    public static final C13464j f29820b = new C13464j();

    private C13464j() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p
    /* renamed from: a */
    public void mo4913a(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "descriptor");
        throw new IllegalStateException(l.m("Cannot infer visibility for ", interfaceC13300b));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p
    /* renamed from: b */
    public void mo4912b(InterfaceC13312e interfaceC13312e, List<String> list) {
        l.f(interfaceC13312e, "descriptor");
        l.f(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC13312e.mo5012b() + ", unresolved classes " + list);
    }
}
