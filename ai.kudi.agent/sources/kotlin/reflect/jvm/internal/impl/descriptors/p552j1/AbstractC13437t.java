package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: ModuleAwareClassDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.t */
/* loaded from: classes3.dex */
public abstract class AbstractC13437t implements InterfaceC13312e {

    /* renamed from: c */
    public static final C13438a f29781c = new C13438a(null);

    /* compiled from: ModuleAwareClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.t$a */
    /* loaded from: classes3.dex */
    public static final class C13438a {
        private C13438a() {
        }

        public /* synthetic */ C13438a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC12777h m5007a(InterfaceC13312e interfaceC13312e, AbstractC13137y0 abstractC13137y0, AbstractC13026h abstractC13026h) {
            l.f(interfaceC13312e, "<this>");
            l.f(abstractC13137y0, "typeSubstitution");
            l.f(abstractC13026h, "kotlinTypeRefiner");
            AbstractC13437t abstractC13437t = interfaceC13312e instanceof AbstractC13437t ? (AbstractC13437t) interfaceC13312e : null;
            if (abstractC13437t == null) {
                InterfaceC12777h mo5011k0 = interfaceC13312e.mo5011k0(abstractC13137y0);
                l.e(mo5011k0, "this.getMemberScope(\n                typeSubstitution\n            )");
                return mo5011k0;
            }
            return abstractC13437t.mo5008N(abstractC13137y0, abstractC13026h);
        }

        /* renamed from: b */
        public final InterfaceC12777h m5006b(InterfaceC13312e interfaceC13312e, AbstractC13026h abstractC13026h) {
            l.f(interfaceC13312e, "<this>");
            l.f(abstractC13026h, "kotlinTypeRefiner");
            AbstractC13437t abstractC13437t = interfaceC13312e instanceof AbstractC13437t ? (AbstractC13437t) interfaceC13312e : null;
            if (abstractC13437t == null) {
                InterfaceC12777h mo5017L0 = interfaceC13312e.mo5017L0();
                l.e(mo5017L0, "this.unsubstitutedMemberScope");
                return mo5017L0;
            }
            return abstractC13437t.mo4969R(abstractC13026h);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public abstract InterfaceC12777h mo5008N(AbstractC13137y0 abstractC13137y0, AbstractC13026h abstractC13026h);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public abstract InterfaceC12777h mo4969R(AbstractC13026h abstractC13026h);
}
