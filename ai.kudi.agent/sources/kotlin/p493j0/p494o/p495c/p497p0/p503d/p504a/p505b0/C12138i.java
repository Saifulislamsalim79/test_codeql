package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

import java.util.List;
import java.util.Map;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12174h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12268b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12275e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12283m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13727r0;
/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.i */
/* loaded from: classes3.dex */
public final class C12138i extends C12125b {

    /* renamed from: h */
    static final /* synthetic */ InterfaceC11872i<Object>[] f27079h = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12138i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final InterfaceC12948i f27080g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.i$a */
    /* loaded from: classes3.dex */
    static final class C12139a extends AbstractC11802m implements InterfaceC11756a<Map<C12614f, ? extends AbstractC12712g<? extends Object>>> {
        C12139a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final Map<C12614f, ? extends AbstractC12712g<? extends Object>> invoke() {
            AbstractC12712g<?> abstractC12712g;
            List<? extends InterfaceC12268b> m3901b;
            Map<C12614f, ? extends AbstractC12712g<? extends Object>> m3881k;
            InterfaceC12268b m9659b = C12138i.this.m9659b();
            if (m9659b instanceof InterfaceC12275e) {
                abstractC12712g = C12128d.f27067a.m9648c(((InterfaceC12275e) C12138i.this.m9659b()).mo4869f());
            } else if (m9659b instanceof InterfaceC12283m) {
                C12128d c12128d = C12128d.f27067a;
                m3901b = C13724q.m3901b(C12138i.this.m9659b());
                abstractC12712g = c12128d.m9648c(m3901b);
            } else {
                abstractC12712g = null;
            }
            Map<C12614f, ? extends AbstractC12712g<? extends Object>> m3897g = abstractC12712g != null ? C13725q0.m3897g(C13664u.m4227a(C12127c.f27062a.m9653d(), abstractC12712g)) : null;
            if (m3897g != null) {
                return m3897g;
            }
            m3881k = C13727r0.m3881k();
            return m3881k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12138i(InterfaceC12265a interfaceC12265a, C12174h c12174h) {
        super(c12174h, interfaceC12265a, C12059k.C12060a.f26867t);
        l.f(interfaceC12265a, "annotation");
        l.f(c12174h, "c");
        this.f27080g = c12174h.m9534e().mo6367d(new C12139a());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.C12125b, kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: a */
    public Map<C12614f, AbstractC12712g<Object>> mo5312a() {
        return (Map) C12953m.m6372a(this.f27080g, this, f27079h[0]);
    }
}
