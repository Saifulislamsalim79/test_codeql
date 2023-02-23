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
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12740v;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p557z.C13725q0;
/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.e */
/* loaded from: classes3.dex */
public final class C12130e extends C12125b {

    /* renamed from: h */
    static final /* synthetic */ InterfaceC11872i<Object>[] f27071h = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12130e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final InterfaceC12948i f27072g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.e$a */
    /* loaded from: classes3.dex */
    static final class C12131a extends AbstractC11802m implements InterfaceC11756a<Map<C12614f, ? extends C12740v>> {

        /* renamed from: c */
        public static final C12131a f27073c = new C12131a();

        C12131a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final Map<C12614f, ? extends C12740v> invoke() {
            Map<C12614f, ? extends C12740v> m3897g;
            m3897g = C13725q0.m3897g(C13664u.m4227a(C12127c.f27062a.m9655b(), new C12740v("Deprecated in Java")));
            return m3897g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12130e(InterfaceC12265a interfaceC12265a, C12174h c12174h) {
        super(c12174h, interfaceC12265a, C12059k.C12060a.f26861n);
        l.f(c12174h, "c");
        this.f27072g = c12174h.m9534e().mo6367d(C12131a.f27073c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.C12125b, kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: a */
    public Map<C12614f, AbstractC12712g<?>> mo5312a() {
        return (Map) C12953m.m6372a(this.f27072g, this, f27071h[0]);
    }
}
