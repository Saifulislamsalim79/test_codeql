package kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12045g;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.C13163j;
import kotlin.p557z.C13705i0;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13400g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13412l0;
/* compiled from: FunctionInvokeDescriptor.kt */
/* renamed from: kotlin.j0.o.c.p0.b.p.e */
/* loaded from: classes3.dex */
public final class C12074e extends C13400g0 {

    /* renamed from: V */
    public static final C12075a f26920V = new C12075a(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.p.e$a */
    /* loaded from: classes3.dex */
    public static final class C12075a {
        private C12075a() {
        }

        public /* synthetic */ C12075a(g gVar) {
            this();
        }

        /* renamed from: b */
        private final InterfaceC13307c1 m9786b(C12074e c12074e, int i, InterfaceC13562z0 interfaceC13562z0) {
            String lowerCase;
            String m7353b = interfaceC13562z0.mo5012b().m7353b();
            l.e(m7353b, "typeParameter.name.asString()");
            if (l.b(m7353b, "T")) {
                lowerCase = "instance";
            } else if (l.b(m7353b, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = m7353b.toLowerCase(Locale.ROOT);
                l.e(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            }
            InterfaceC13346g m5317b = InterfaceC13346g.f29516s.m5317b();
            C12614f m7349i = C12614f.m7349i(lowerCase);
            l.e(m7349i, "identifier(name)");
            AbstractC13010i0 mo5010x = interfaceC13562z0.mo5010x();
            l.e(mo5010x, "typeParameter.defaultType");
            InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
            l.e(interfaceC13545u0, "NO_SOURCE");
            return new C13412l0(c12074e, null, i, m5317b, m7349i, mo5010x, false, false, false, null, interfaceC13545u0);
        }

        /* renamed from: a */
        public final C12074e m9787a(C12066b c12066b, boolean z) {
            List<? extends InterfaceC13562z0> m3891e;
            Iterable<C13705i0> m3817H0;
            int m3867o;
            l.f(c12066b, "functionClass");
            List<InterfaceC13562z0> mo4975B = c12066b.mo4975B();
            C12074e c12074e = new C12074e(c12066b, null, InterfaceC13300b.EnumC13301a.DECLARATION, z, null);
            InterfaceC13524r0 mo5015T0 = c12066b.mo5015T0();
            m3891e = C13726r.m3891e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo4975B) {
                if (!(((InterfaceC13562z0) obj).mo4648r() == EnumC13008h1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            m3817H0 = C13742z.m3817H0(arrayList);
            m3867o = C13728s.m3867o(m3817H0, 10);
            ArrayList arrayList2 = new ArrayList(m3867o);
            for (C13705i0 c13705i0 : m3817H0) {
                arrayList2.add(C12074e.f26920V.m9786b(c12074e, c13705i0.m4117c(), (InterfaceC13562z0) c13705i0.m4116d()));
            }
            c12074e.mo5080c1(null, mo5015T0, m3891e, arrayList2, ((InterfaceC13562z0) C13722p.m3943c0(mo4975B)).mo5010x(), EnumC13560z.ABSTRACT, C13530t.f29892e);
            c12074e.mo5071k1(true);
            return c12074e;
        }
    }

    private C12074e(InterfaceC13513m interfaceC13513m, C12074e c12074e, InterfaceC13300b.EnumC13301a enumC13301a, boolean z) {
        super(interfaceC13513m, c12074e, InterfaceC13346g.f29516s.m5317b(), C13163j.f29262g, enumC13301a, InterfaceC13545u0.f29903a);
        m5064q1(true);
        m5061s1(z);
        mo5073j1(false);
    }

    public /* synthetic */ C12074e(InterfaceC13513m interfaceC13513m, C12074e c12074e, InterfaceC13300b.EnumC13301a enumC13301a, boolean z, g gVar) {
        this(interfaceC13513m, c12074e, enumC13301a, z);
    }

    /* renamed from: A1 */
    private final InterfaceC13554x m9788A1(List<C12614f> list) {
        int m3867o;
        boolean z;
        C12614f c12614f;
        int size = mo5072k().size() - list.size();
        boolean z2 = false;
        boolean z3 = size == 0 || size == 1;
        if (!C13668y.f30115a || z3) {
            List<InterfaceC13307c1> mo5072k = mo5072k();
            l.e(mo5072k, "valueParameters");
            m3867o = C13728s.m3867o(mo5072k, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC13307c1 interfaceC13307c1 : mo5072k) {
                C12614f mo5012b = interfaceC13307c1.mo5012b();
                l.e(mo5012b, "it.name");
                int mo5133h = interfaceC13307c1.mo5133h();
                int i = mo5133h - size;
                if (i >= 0 && (c12614f = list.get(i)) != null) {
                    mo5012b = c12614f;
                }
                arrayList.add(interfaceC13307c1.mo5129O0(this, mo5012b, mo5133h));
            }
            AbstractC13426p.C13429c m5079d1 = m5079d1(C12959a1.f29017b);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C12614f) it.next()) == null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            m5079d1.m5048F(z2);
            m5079d1.m5034T(arrayList);
            m5079d1.m5041M(mo4651a());
            l.e(m5079d1, "newCopyBuilder(TypeSubstitutor.EMPTY)\n                .setHasSynthesizedParameterNames(parameterNames.any { it == null })\n                .setValueParameters(newValueParameters)\n                .setOriginal(original)");
            InterfaceC13554x mo5085X0 = super.mo5085X0(m5079d1);
            l.d(mo5085X0);
            return mo5085X0;
        }
        throw new AssertionError("Assertion failed");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: E */
    public boolean mo4662E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13400g0, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: W0 */
    protected AbstractC13426p mo5086W0(InterfaceC13513m interfaceC13513m, InterfaceC13554x interfaceC13554x, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13346g interfaceC13346g, InterfaceC13545u0 interfaceC13545u0) {
        l.f(interfaceC13513m, "newOwner");
        l.f(enumC13301a, "kind");
        l.f(interfaceC13346g, "annotations");
        l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
        return new C12074e(interfaceC13513m, (C12074e) interfaceC13554x, enumC13301a, mo4692G0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: X */
    public boolean mo4689X() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: X0 */
    public InterfaceC13554x mo5085X0(AbstractC13426p.C13429c c13429c) {
        boolean z;
        int m3867o;
        l.f(c13429c, "configuration");
        C12074e c12074e = (C12074e) super.mo5085X0(c13429c);
        if (c12074e == null) {
            return null;
        }
        List<InterfaceC13307c1> mo5072k = c12074e.mo5072k();
        l.e(mo5072k, "substituted.valueParameters");
        boolean z2 = false;
        if (!(mo5072k instanceof Collection) || !mo5072k.isEmpty()) {
            for (InterfaceC13307c1 interfaceC13307c1 : mo5072k) {
                AbstractC12965b0 mo5121c = interfaceC13307c1.mo5121c();
                l.e(mo5121c, "it.type");
                if (C12045g.m9949c(mo5121c) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return c12074e;
        }
        List<InterfaceC13307c1> mo5072k2 = c12074e.mo5072k();
        l.e(mo5072k2, "substituted.valueParameters");
        m3867o = C13728s.m3867o(mo5072k2, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (InterfaceC13307c1 interfaceC13307c12 : mo5072k2) {
            AbstractC12965b0 mo5121c2 = interfaceC13307c12.mo5121c();
            l.e(mo5121c2, "it.type");
            arrayList.add(C12045g.m9949c(mo5121c2));
        }
        return c12074e.m9788A1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: z */
    public boolean mo4683z() {
        return false;
    }
}
