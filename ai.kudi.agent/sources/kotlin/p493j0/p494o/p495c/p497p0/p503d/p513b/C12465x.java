package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import java.util.Collection;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.x */
/* loaded from: classes3.dex */
public final class C12465x implements InterfaceC12463w<AbstractC12434j> {

    /* renamed from: a */
    public static final C12465x f27637a = new C12465x();

    private C12465x() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w
    /* renamed from: b */
    public String mo8836b(InterfaceC13312e interfaceC13312e) {
        return InterfaceC12463w.C12464a.m8840a(this, interfaceC13312e);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w
    /* renamed from: c */
    public AbstractC12965b0 mo8835c(Collection<? extends AbstractC12965b0> collection) {
        String m3797a0;
        l.f(collection, "types");
        m3797a0 = C13742z.m3797a0(collection, null, null, null, 0, null, null, 63, null);
        throw new AssertionError(l.m("There should be no intersection type in existing descriptors, but found: ", m3797a0));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w
    /* renamed from: d */
    public String mo8834d(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "classDescriptor");
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w
    /* renamed from: e */
    public AbstractC12965b0 mo8833e(AbstractC12965b0 abstractC12965b0) {
        return InterfaceC12463w.C12464a.m8839b(this, abstractC12965b0);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w
    /* renamed from: f */
    public boolean mo8832f() {
        return InterfaceC12463w.C12464a.m8838c(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w
    /* renamed from: g */
    public void mo8831g(AbstractC12965b0 abstractC12965b0, InterfaceC13312e interfaceC13312e) {
        l.f(abstractC12965b0, "kotlinType");
        l.f(interfaceC13312e, "descriptor");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12463w
    /* renamed from: h */
    public AbstractC12434j mo8837a(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "classDescriptor");
        return null;
    }
}
