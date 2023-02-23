package kotlin.p493j0.p494o.p495c;

import kotlin.p483e0.p485d.AbstractC11783c;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.AbstractC11803n;
import kotlin.p483e0.p485d.AbstractC11807r;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11814y;
import kotlin.p483e0.p485d.InterfaceC11798h;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.InterfaceC11866e;
import kotlin.p493j0.InterfaceC11867f;
import kotlin.p493j0.InterfaceC11870h;
import kotlin.p493j0.p494o.C11880b;
/* compiled from: ReflectionFactoryImpl.java */
/* renamed from: kotlin.j0.o.c.g0 */
/* loaded from: classes3.dex */
public class C11922g0 extends C11814y {
    /* renamed from: h */
    private static AbstractC11952j m10150h(AbstractC11783c abstractC11783c) {
        InterfaceC11865d mo4698g = abstractC11783c.mo4698g();
        return mo4698g instanceof AbstractC11952j ? (AbstractC11952j) mo4698g : C11884b.f26562f;
    }

    @Override // kotlin.p483e0.p485d.C11814y
    /* renamed from: a */
    public InterfaceC11866e mo10157a(C11799i c11799i) {
        return new C11962k(m10150h(c11799i), c11799i.mo4699b(), c11799i.mo4697i(), c11799i.m10332f());
    }

    @Override // kotlin.p483e0.p485d.C11814y
    /* renamed from: b */
    public InterfaceC11863b mo10156b(Class cls) {
        return C11921g.m10158a(cls);
    }

    @Override // kotlin.p483e0.p485d.C11814y
    /* renamed from: c */
    public InterfaceC11865d mo10155c(Class cls, String str) {
        return new C12025p(cls, str);
    }

    @Override // kotlin.p483e0.p485d.C11814y
    /* renamed from: d */
    public InterfaceC11867f mo10154d(AbstractC11803n abstractC11803n) {
        return new C11973n(m10150h(abstractC11803n), abstractC11803n.mo4699b(), abstractC11803n.mo4697i(), abstractC11803n.m10332f());
    }

    @Override // kotlin.p483e0.p485d.C11814y
    /* renamed from: e */
    public InterfaceC11870h mo10153e(AbstractC11807r abstractC11807r) {
        return new C13190u(m10150h(abstractC11807r), abstractC11807r.mo4699b(), abstractC11807r.mo4697i(), abstractC11807r.m10332f());
    }

    @Override // kotlin.p483e0.p485d.C11814y
    /* renamed from: f */
    public String mo10152f(InterfaceC11798h interfaceC11798h) {
        C11962k m10041a;
        InterfaceC11866e m10218a = C11880b.m10218a(interfaceC11798h);
        if (m10218a != null && (m10041a = C11972m0.m10041a(m10218a)) != null) {
            return C11949i0.f26645b.m10100e(m10041a.mo5650h());
        }
        return super.mo10152f(interfaceC11798h);
    }

    @Override // kotlin.p483e0.p485d.C11814y
    /* renamed from: g */
    public String mo10151g(AbstractC11802m abstractC11802m) {
        return mo10152f(abstractC11802m);
    }
}
