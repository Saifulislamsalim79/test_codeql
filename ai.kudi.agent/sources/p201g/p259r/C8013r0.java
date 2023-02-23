package p201g.p259r;

import kotlin.e0.d.l;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import p201g.p259r.AbstractC7905j0;
/* compiled from: PagingData.kt */
/* renamed from: g.r.r0 */
/* loaded from: classes2.dex */
public final class C8013r0<T> {

    /* renamed from: c */
    private static final InterfaceC7971l1 f19312c = new C8014a();

    /* renamed from: a */
    private final InterfaceC13964d<AbstractC7905j0<T>> f19313a;

    /* renamed from: b */
    private final InterfaceC7971l1 f19314b;

    /* compiled from: PagingData.kt */
    /* renamed from: g.r.r0$a */
    /* loaded from: classes2.dex */
    public static final class C8014a implements InterfaceC7971l1 {
        C8014a() {
        }

        @Override // p201g.p259r.InterfaceC7971l1
        /* renamed from: a */
        public void mo16895a() {
        }

        @Override // p201g.p259r.InterfaceC7971l1
        /* renamed from: b */
        public void mo16894b() {
        }

        @Override // p201g.p259r.InterfaceC7971l1
        /* renamed from: c */
        public void mo16893c(AbstractC7982n1 abstractC7982n1) {
            l.f(abstractC7982n1, "viewportHint");
        }
    }

    static {
        new C8013r0(C13971f.m3318p(AbstractC7905j0.C7907b.f18953g.m17060e()), f19312c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8013r0(InterfaceC13964d<? extends AbstractC7905j0<T>> interfaceC13964d, InterfaceC7971l1 interfaceC7971l1) {
        l.f(interfaceC13964d, "flow");
        l.f(interfaceC7971l1, "receiver");
        this.f19313a = interfaceC13964d;
        this.f19314b = interfaceC7971l1;
    }

    /* renamed from: a */
    public final InterfaceC13964d<AbstractC7905j0<T>> m16897a() {
        return this.f19313a;
    }

    /* renamed from: b */
    public final InterfaceC7971l1 m16896b() {
        return this.f19314b;
    }
}
