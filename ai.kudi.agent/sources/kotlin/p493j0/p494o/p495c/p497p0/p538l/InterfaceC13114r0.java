package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
/* compiled from: TypeAliasExpansionReportStrategy.kt */
/* renamed from: kotlin.j0.o.c.p0.l.r0 */
/* loaded from: classes3.dex */
public interface InterfaceC13114r0 {

    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.r0$a */
    /* loaded from: classes3.dex */
    public static final class C13115a implements InterfaceC13114r0 {

        /* renamed from: a */
        public static final C13115a f29191a = new C13115a();

        private C13115a() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13114r0
        /* renamed from: a */
        public void mo5830a(InterfaceC13340c interfaceC13340c) {
            l.f(interfaceC13340c, "annotation");
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13114r0
        /* renamed from: b */
        public void mo5829b(InterfaceC13559y0 interfaceC13559y0, InterfaceC13562z0 interfaceC13562z0, AbstractC12965b0 abstractC12965b0) {
            l.f(interfaceC13559y0, "typeAlias");
            l.f(abstractC12965b0, "substitutedArgument");
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13114r0
        /* renamed from: c */
        public void mo5828c(C12959a1 c12959a1, AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, InterfaceC13562z0 interfaceC13562z0) {
            l.f(c12959a1, "substitutor");
            l.f(abstractC12965b0, "unsubstitutedArgument");
            l.f(abstractC12965b02, "argument");
            l.f(interfaceC13562z0, "typeParameter");
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13114r0
        /* renamed from: d */
        public void mo5827d(InterfaceC13559y0 interfaceC13559y0) {
            l.f(interfaceC13559y0, "typeAlias");
        }
    }

    /* renamed from: a */
    void mo5830a(InterfaceC13340c interfaceC13340c);

    /* renamed from: b */
    void mo5829b(InterfaceC13559y0 interfaceC13559y0, InterfaceC13562z0 interfaceC13562z0, AbstractC12965b0 abstractC12965b0);

    /* renamed from: c */
    void mo5828c(C12959a1 c12959a1, AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, InterfaceC13562z0 interfaceC13562z0);

    /* renamed from: d */
    void mo5827d(InterfaceC13559y0 interfaceC13559y0);
}
