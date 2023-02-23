package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

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
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13727r0;
/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.h */
/* loaded from: classes3.dex */
public final class C12136h extends C12125b {

    /* renamed from: h */
    static final /* synthetic */ InterfaceC11872i<Object>[] f27076h = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12136h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final InterfaceC12948i f27077g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.h$a */
    /* loaded from: classes3.dex */
    static final class C12137a extends AbstractC11802m implements InterfaceC11756a<Map<C12614f, ? extends AbstractC12712g<?>>> {
        C12137a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final Map<C12614f, ? extends AbstractC12712g<?>> invoke() {
            Map<C12614f, ? extends AbstractC12712g<?>> m3881k;
            AbstractC12712g<?> m9650a = C12128d.f27067a.m9650a(C12136h.this.m9659b());
            Map<C12614f, ? extends AbstractC12712g<?>> m3897g = m9650a == null ? null : C13725q0.m3897g(C13664u.m4227a(C12127c.f27062a.m9654c(), m9650a));
            if (m3897g != null) {
                return m3897g;
            }
            m3881k = C13727r0.m3881k();
            return m3881k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12136h(InterfaceC12265a interfaceC12265a, C12174h c12174h) {
        super(c12174h, interfaceC12265a, C12059k.C12060a.f26870w);
        l.f(interfaceC12265a, "annotation");
        l.f(c12174h, "c");
        this.f27077g = c12174h.m9534e().mo6367d(new C12137a());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.C12125b, kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: a */
    public Map<C12614f, AbstractC12712g<?>> mo5312a() {
        return (Map) C12953m.m6372a(this.f27077g, this, f27076h[0]);
    }
}
