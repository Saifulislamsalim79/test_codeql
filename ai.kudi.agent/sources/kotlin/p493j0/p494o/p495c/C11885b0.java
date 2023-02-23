package kotlin.p493j0.p494o.p495c;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11787d0;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.EnumC11878n;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.InterfaceC11873j;
import kotlin.p493j0.InterfaceC11874k;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12433i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a.C13459f;
/* compiled from: KTypeParameterImpl.kt */
/* renamed from: kotlin.j0.o.c.b0 */
/* loaded from: classes3.dex */
public final class C11885b0 implements InterfaceC11874k {

    /* renamed from: f */
    static final /* synthetic */ InterfaceC11872i[] f26563f = {C11813x.m10312f(new C11808s(C11813x.m10316b(C11885b0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: c */
    private final C11916f0.C11917a f26564c;

    /* renamed from: d */
    private final InterfaceC11889c0 f26565d;

    /* renamed from: e */
    private final InterfaceC13562z0 f26566e;

    /* compiled from: KTypeParameterImpl.kt */
    /* renamed from: kotlin.j0.o.c.b0$a */
    /* loaded from: classes3.dex */
    static final class C11886a extends AbstractC11802m implements InterfaceC11756a<List<? extends C13213z>> {
        C11886a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<C13213z> invoke() {
            int m3867o;
            List<AbstractC12965b0> upperBounds = C11885b0.this.m10211c().getUpperBounds();
            l.e(upperBounds, "descriptor.upperBounds");
            m3867o = C13728s.m3867o(upperBounds, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (AbstractC12965b0 abstractC12965b0 : upperBounds) {
                arrayList.add(new C13213z(abstractC12965b0, null, 2, null));
            }
            return arrayList;
        }
    }

    public C11885b0(InterfaceC11889c0 interfaceC11889c0, InterfaceC13562z0 interfaceC13562z0) {
        C11923h<?> c11923h;
        Object mo4769S;
        l.f(interfaceC13562z0, "descriptor");
        this.f26566e = interfaceC13562z0;
        this.f26564c = C11916f0.m10164d(new C11886a());
        if (interfaceC11889c0 == null) {
            InterfaceC13513m mo4687d = m10211c().mo4687d();
            l.e(mo4687d, "descriptor.containingDeclaration");
            if (mo4687d instanceof InterfaceC13312e) {
                mo4769S = m10210d((InterfaceC13312e) mo4687d);
            } else if (mo4687d instanceof InterfaceC13300b) {
                InterfaceC13513m mo4687d2 = ((InterfaceC13300b) mo4687d).mo4687d();
                l.e(mo4687d2, "declaration.containingDeclaration");
                if (mo4687d2 instanceof InterfaceC13312e) {
                    c11923h = m10210d((InterfaceC13312e) mo4687d2);
                } else {
                    InterfaceC12846g interfaceC12846g = (InterfaceC12846g) (!(mo4687d instanceof InterfaceC12846g) ? null : mo4687d);
                    if (interfaceC12846g != null) {
                        InterfaceC11863b m10361e = C11754a.m10361e(m10213a(interfaceC12846g));
                        if (m10361e == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        }
                        c11923h = (C11923h) m10361e;
                    } else {
                        throw new C11899d0("Non-class callable descriptor must be deserialized: " + mo4687d);
                    }
                }
                mo4769S = mo4687d.mo4769S(new C11882a(c11923h), C13666w.f30112a);
            } else {
                throw new C11899d0("Unknown type parameter container: " + mo4687d);
            }
            l.e(mo4769S, "when (val declaration = … $declaration\")\n        }");
            interfaceC11889c0 = (InterfaceC11889c0) mo4769S;
        }
        this.f26565d = interfaceC11889c0;
    }

    /* renamed from: a */
    private final Class<?> m10213a(InterfaceC12846g interfaceC12846g) {
        Class<?> m4923d;
        InterfaceC12845f mo6539m0 = interfaceC12846g.mo6539m0();
        if (!(mo6539m0 instanceof C12433i)) {
            mo6539m0 = null;
        }
        C12433i c12433i = (C12433i) mo6539m0;
        InterfaceC12447o m8921f = c12433i != null ? c12433i.m8921f() : null;
        C13459f c13459f = m8921f instanceof C13459f ? m8921f : null;
        if (c13459f == null || (m4923d = c13459f.m4923d()) == null) {
            throw new C11899d0("Container of deserialized member is not resolved: " + interfaceC12846g);
        }
        return m4923d;
    }

    /* renamed from: d */
    private final C11923h<?> m10210d(InterfaceC13312e interfaceC13312e) {
        Class<?> m10029m = C11972m0.m10029m(interfaceC13312e);
        C11923h<?> c11923h = (C11923h) (m10029m != null ? C11754a.m10361e(m10029m) : null);
        if (c11923h != null) {
            return c11923h;
        }
        throw new C11899d0("Type parameter container is not resolved: " + interfaceC13312e.mo4687d());
    }

    @Override // kotlin.p493j0.InterfaceC11874k
    /* renamed from: b */
    public String mo10212b() {
        String m7353b = m10211c().mo5012b().m7353b();
        l.e(m7353b, "descriptor.name.asString()");
        return m7353b;
    }

    /* renamed from: c */
    public InterfaceC13562z0 m10211c() {
        return this.f26566e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11885b0) {
            C11885b0 c11885b0 = (C11885b0) obj;
            if (l.b(this.f26565d, c11885b0.f26565d) && l.b(mo10212b(), c11885b0.mo10212b())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.p493j0.InterfaceC11874k
    public List<InterfaceC11873j> getUpperBounds() {
        return (List) this.f26564c.m10160b(this, f26563f[0]);
    }

    public int hashCode() {
        return (this.f26565d.hashCode() * 31) + mo10212b().hashCode();
    }

    @Override // kotlin.p493j0.InterfaceC11874k
    /* renamed from: r */
    public EnumC11878n mo10209r() {
        int i = C11883a0.f26561a[m10211c().mo4648r().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC11878n.OUT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EnumC11878n.IN;
        }
        return EnumC11878n.INVARIANT;
    }

    public String toString() {
        return C11787d0.f26485c.m10330a(this);
    }
}
