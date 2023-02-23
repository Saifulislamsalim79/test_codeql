package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.Collection;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
/* compiled from: KotlinTypeRefiner.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.h */
/* loaded from: classes3.dex */
public abstract class AbstractC13026h {

    /* compiled from: KotlinTypeRefiner.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.h$a */
    /* loaded from: classes3.dex */
    public static final class C13027a extends AbstractC13026h {

        /* renamed from: a */
        public static final C13027a f29109a = new C13027a();

        private C13027a() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h
        /* renamed from: a */
        public InterfaceC13312e mo6105a(C12608b c12608b) {
            l.f(c12608b, "classId");
            return null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h
        /* renamed from: b */
        public <S extends InterfaceC12777h> S mo6104b(InterfaceC13312e interfaceC13312e, InterfaceC11756a<? extends S> interfaceC11756a) {
            l.f(interfaceC13312e, "classDescriptor");
            l.f(interfaceC11756a, "compute");
            return interfaceC11756a.invoke();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h
        /* renamed from: c */
        public boolean mo6103c(InterfaceC13305c0 interfaceC13305c0) {
            l.f(interfaceC13305c0, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h
        /* renamed from: d */
        public boolean mo6102d(InterfaceC13125t0 interfaceC13125t0) {
            l.f(interfaceC13125t0, "typeConstructor");
            return false;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h
        /* renamed from: f */
        public Collection<AbstractC12965b0> mo6100f(InterfaceC13312e interfaceC13312e) {
            l.f(interfaceC13312e, "classDescriptor");
            Collection<AbstractC12965b0> mo5218a = interfaceC13312e.mo4649n().mo5218a();
            l.e(mo5218a, "classDescriptor.typeConstructor.supertypes");
            return mo5218a;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h
        /* renamed from: g */
        public AbstractC12965b0 mo6099g(AbstractC12965b0 abstractC12965b0) {
            l.f(abstractC12965b0, "type");
            return abstractC12965b0;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h
        /* renamed from: h */
        public InterfaceC13312e mo6101e(InterfaceC13513m interfaceC13513m) {
            l.f(interfaceC13513m, "descriptor");
            return null;
        }
    }

    /* renamed from: a */
    public abstract InterfaceC13312e mo6105a(C12608b c12608b);

    /* renamed from: b */
    public abstract <S extends InterfaceC12777h> S mo6104b(InterfaceC13312e interfaceC13312e, InterfaceC11756a<? extends S> interfaceC11756a);

    /* renamed from: c */
    public abstract boolean mo6103c(InterfaceC13305c0 interfaceC13305c0);

    /* renamed from: d */
    public abstract boolean mo6102d(InterfaceC13125t0 interfaceC13125t0);

    /* renamed from: e */
    public abstract InterfaceC13334h mo6101e(InterfaceC13513m interfaceC13513m);

    /* renamed from: f */
    public abstract Collection<AbstractC12965b0> mo6100f(InterfaceC13312e interfaceC13312e);

    /* renamed from: g */
    public abstract AbstractC12965b0 mo6099g(AbstractC12965b0 abstractC12965b0);
}
