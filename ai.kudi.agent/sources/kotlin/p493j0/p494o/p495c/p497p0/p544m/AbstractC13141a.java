package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.AbstractC13144c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13141a {
    /* renamed from: a */
    public final AbstractC13144c m5735a(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "functionDescriptor");
        for (C13148d c13148d : mo5726b()) {
            if (c13148d.m5731b(interfaceC13554x)) {
                return c13148d.m5732a(interfaceC13554x);
            }
        }
        return AbstractC13144c.C13145a.f29225b;
    }

    /* renamed from: b */
    public abstract List<C13148d> mo5726b();
}
