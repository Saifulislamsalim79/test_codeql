package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: ValueParameterDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.l0 */
/* loaded from: classes3.dex */
public class C13412l0 extends AbstractC13417m0 implements InterfaceC13307c1 {

    /* renamed from: D */
    public static final C13413a f29689D = new C13413a(null);

    /* renamed from: A */
    private final boolean f29690A;

    /* renamed from: B */
    private final AbstractC12965b0 f29691B;

    /* renamed from: C */
    private final InterfaceC13307c1 f29692C;

    /* renamed from: x */
    private final int f29693x;

    /* renamed from: y */
    private final boolean f29694y;

    /* renamed from: z */
    private final boolean f29695z;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.l0$a */
    /* loaded from: classes3.dex */
    public static final class C13413a {
        private C13413a() {
        }

        public /* synthetic */ C13413a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C13412l0 m5130a(InterfaceC13293a interfaceC13293a, InterfaceC13307c1 interfaceC13307c1, int i, InterfaceC13346g interfaceC13346g, C12614f c12614f, AbstractC12965b0 abstractC12965b0, boolean z, boolean z2, boolean z3, AbstractC12965b0 abstractC12965b02, InterfaceC13545u0 interfaceC13545u0, InterfaceC11756a<? extends List<? extends InterfaceC13311d1>> interfaceC11756a) {
            l.f(interfaceC13293a, "containingDeclaration");
            l.f(interfaceC13346g, "annotations");
            l.f(c12614f, "name");
            l.f(abstractC12965b0, "outType");
            l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
            if (interfaceC11756a == null) {
                return new C13412l0(interfaceC13293a, interfaceC13307c1, i, interfaceC13346g, c12614f, abstractC12965b0, z, z2, z3, abstractC12965b02, interfaceC13545u0);
            }
            return new C13414b(interfaceC13293a, interfaceC13307c1, i, interfaceC13346g, c12614f, abstractC12965b0, z, z2, z3, abstractC12965b02, interfaceC13545u0, interfaceC11756a);
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.l0$b */
    /* loaded from: classes3.dex */
    public static final class C13414b extends C13412l0 {

        /* renamed from: E */
        private final InterfaceC11824h f29696E;

        /* compiled from: ValueParameterDescriptorImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.l0$b$a */
        /* loaded from: classes3.dex */
        static final class C13415a extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13311d1>> {
            C13415a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<InterfaceC13311d1> invoke() {
                return C13414b.this.m5128Y0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13414b(InterfaceC13293a interfaceC13293a, InterfaceC13307c1 interfaceC13307c1, int i, InterfaceC13346g interfaceC13346g, C12614f c12614f, AbstractC12965b0 abstractC12965b0, boolean z, boolean z2, boolean z3, AbstractC12965b0 abstractC12965b02, InterfaceC13545u0 interfaceC13545u0, InterfaceC11756a<? extends List<? extends InterfaceC13311d1>> interfaceC11756a) {
            super(interfaceC13293a, interfaceC13307c1, i, interfaceC13346g, c12614f, abstractC12965b0, z, z2, z3, abstractC12965b02, interfaceC13545u0);
            InterfaceC11824h m5625b;
            l.f(interfaceC13293a, "containingDeclaration");
            l.f(interfaceC13346g, "annotations");
            l.f(c12614f, "name");
            l.f(abstractC12965b0, "outType");
            l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
            l.f(interfaceC11756a, "destructuringVariables");
            m5625b = C13218k.m5625b(interfaceC11756a);
            this.f29696E = m5625b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13412l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1
        /* renamed from: O0 */
        public InterfaceC13307c1 mo5129O0(InterfaceC13293a interfaceC13293a, C12614f c12614f, int i) {
            l.f(interfaceC13293a, "newOwner");
            l.f(c12614f, "newName");
            InterfaceC13346g mo4956y = mo4956y();
            l.e(mo4956y, "annotations");
            AbstractC12965b0 mo5121c = mo5121c();
            l.e(mo5121c, "type");
            boolean mo5138D0 = mo5138D0();
            boolean mo5132l0 = mo5132l0();
            boolean mo5134g0 = mo5134g0();
            AbstractC12965b0 mo5131v0 = mo5131v0();
            InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
            l.e(interfaceC13545u0, "NO_SOURCE");
            return new C13414b(interfaceC13293a, null, i, mo4956y, c12614f, mo5121c, mo5138D0, mo5132l0, mo5134g0, mo5131v0, interfaceC13545u0, new C13415a());
        }

        /* renamed from: Y0 */
        public final List<InterfaceC13311d1> m5128Y0() {
            return (List) this.f29696E.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13412l0(InterfaceC13293a interfaceC13293a, InterfaceC13307c1 interfaceC13307c1, int i, InterfaceC13346g interfaceC13346g, C12614f c12614f, AbstractC12965b0 abstractC12965b0, boolean z, boolean z2, boolean z3, AbstractC12965b0 abstractC12965b02, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13293a, interfaceC13346g, c12614f, abstractC12965b0, interfaceC13545u0);
        l.f(interfaceC13293a, "containingDeclaration");
        l.f(interfaceC13346g, "annotations");
        l.f(c12614f, "name");
        l.f(abstractC12965b0, "outType");
        l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
        this.f29693x = i;
        this.f29694y = z;
        this.f29695z = z2;
        this.f29690A = z3;
        this.f29691B = abstractC12965b02;
        this.f29692C = interfaceC13307c1 == null ? this : interfaceC13307c1;
    }

    /* renamed from: V0 */
    public static final C13412l0 m5137V0(InterfaceC13293a interfaceC13293a, InterfaceC13307c1 interfaceC13307c1, int i, InterfaceC13346g interfaceC13346g, C12614f c12614f, AbstractC12965b0 abstractC12965b0, boolean z, boolean z2, boolean z3, AbstractC12965b0 abstractC12965b02, InterfaceC13545u0 interfaceC13545u0, InterfaceC11756a<? extends List<? extends InterfaceC13311d1>> interfaceC11756a) {
        return f29689D.m5130a(interfaceC13293a, interfaceC13307c1, i, interfaceC13346g, c12614f, abstractC12965b0, z, z2, z3, abstractC12965b02, interfaceC13545u0, interfaceC11756a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: B0 */
    public boolean mo5139B0() {
        return InterfaceC13307c1.C13308a.m5344a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1
    /* renamed from: D0 */
    public boolean mo5138D0() {
        return this.f29694y && ((InterfaceC13300b) mo4687d()).mo5057w().m5347a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1
    /* renamed from: O0 */
    public InterfaceC13307c1 mo5129O0(InterfaceC13293a interfaceC13293a, C12614f c12614f, int i) {
        l.f(interfaceC13293a, "newOwner");
        l.f(c12614f, "newName");
        InterfaceC13346g mo4956y = mo4956y();
        l.e(mo4956y, "annotations");
        AbstractC12965b0 mo5121c = mo5121c();
        l.e(mo5121c, "type");
        boolean mo5138D0 = mo5138D0();
        boolean mo5132l0 = mo5132l0();
        boolean mo5134g0 = mo5134g0();
        AbstractC12965b0 mo5131v0 = mo5131v0();
        InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
        l.e(interfaceC13545u0, "NO_SOURCE");
        return new C13412l0(interfaceC13293a, null, i, mo4956y, c12614f, mo5121c, mo5138D0, mo5132l0, mo5134g0, mo5131v0, interfaceC13545u0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        l.f(interfaceC13517o, "visitor");
        return interfaceC13517o.mo4753k(this, d);
    }

    /* renamed from: W0 */
    public Void m5136W0() {
        return null;
    }

    /* renamed from: X0 */
    public InterfaceC13307c1 m5135X0(C12959a1 c12959a1) {
        l.f(c12959a1, "substitutor");
        if (c12959a1.m6338k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC13293a mo4686e(C12959a1 c12959a1) {
        m5135X0(c12959a1);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ AbstractC12712g mo5094f0() {
        return (AbstractC12712g) m5136W0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: g */
    public Collection<InterfaceC13307c1> mo4685g() {
        int m3867o;
        Collection<? extends InterfaceC13293a> mo4685g = mo4687d().mo4685g();
        l.e(mo4685g, "containingDeclaration.overriddenDescriptors");
        m3867o = C13728s.m3867o(mo4685g, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (InterfaceC13293a interfaceC13293a : mo4685g) {
            arrayList.add(interfaceC13293a.mo5072k().get(mo5133h()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1
    /* renamed from: g0 */
    public boolean mo5134g0() {
        return this.f29690A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1
    /* renamed from: h */
    public int mo5133h() {
        return this.f29693x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: i */
    public AbstractC13544u mo4659i() {
        AbstractC13544u abstractC13544u = C13530t.f29893f;
        l.e(abstractC13544u, "LOCAL");
        return abstractC13544u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1
    /* renamed from: l0 */
    public boolean mo5132l0() {
        return this.f29695z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: t0 */
    public boolean mo5093t0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1
    /* renamed from: v0 */
    public AbstractC12965b0 mo5131v0() {
        return this.f29691B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: d */
    public InterfaceC13293a mo4687d() {
        return (InterfaceC13293a) super.mo4687d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public InterfaceC13307c1 mo4651a() {
        InterfaceC13307c1 interfaceC13307c1 = this.f29692C;
        return interfaceC13307c1 == this ? this : interfaceC13307c1.mo4651a();
    }
}
