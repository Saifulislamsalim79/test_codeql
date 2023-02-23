package kotlin.p493j0.p494o.p495c;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13411l;
/* compiled from: util.kt */
/* renamed from: kotlin.j0.o.c.a */
/* loaded from: classes3.dex */
public class C11882a extends C13411l<AbstractC11906f<?>, C13666w> {

    /* renamed from: a */
    private final AbstractC11952j f26560a;

    public C11882a(AbstractC11952j abstractC11952j) {
        l.f(abstractC11952j, "container");
        this.f26560a = abstractC11952j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13411l, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
    /* renamed from: p */
    public AbstractC11906f<?> mo4757g(InterfaceC13554x interfaceC13554x, C13666w c13666w) {
        l.f(interfaceC13554x, "descriptor");
        l.f(c13666w, TransactionBreakDownItemType.DATA);
        return new C11962k(this.f26560a, interfaceC13554x);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
    /* renamed from: q */
    public AbstractC11906f<?> mo4760d(InterfaceC13518o0 interfaceC13518o0, C13666w c13666w) {
        l.f(interfaceC13518o0, "descriptor");
        l.f(c13666w, TransactionBreakDownItemType.DATA);
        int i = (interfaceC13518o0.mo5066p0() != null ? 1 : 0) + (interfaceC13518o0.mo5056w0() != null ? 1 : 0);
        if (interfaceC13518o0.mo5093t0()) {
            if (i == 0) {
                return new C11968l(this.f26560a, interfaceC13518o0);
            }
            if (i == 1) {
                return new C11973n(this.f26560a, interfaceC13518o0);
            }
            if (i == 2) {
                return new C11977o(this.f26560a, interfaceC13518o0);
            }
        } else if (i == 0) {
            return new C13186r(this.f26560a, interfaceC13518o0);
        } else {
            if (i == 1) {
                return new C13190u(this.f26560a, interfaceC13518o0);
            }
            if (i == 2) {
                return new C13194v(this.f26560a, interfaceC13518o0);
            }
        }
        throw new C11899d0("Unsupported property: " + interfaceC13518o0);
    }
}
