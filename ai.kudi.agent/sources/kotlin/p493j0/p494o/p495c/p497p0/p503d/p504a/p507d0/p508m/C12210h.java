package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12161a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12171f;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12174h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12446n;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12453p;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12459u;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12408a;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13446z;
/* compiled from: LazyJavaPackageFragment.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.h */
/* loaded from: classes3.dex */
public final class C12210h extends AbstractC13446z {

    /* renamed from: D */
    static final /* synthetic */ InterfaceC11872i<Object>[] f27233D = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12210h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12210h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: A */
    private final C12186d f27234A;

    /* renamed from: B */
    private final InterfaceC12948i<List<C12609c>> f27235B;

    /* renamed from: C */
    private final InterfaceC13346g f27236C;

    /* renamed from: x */
    private final InterfaceC12292u f27237x;

    /* renamed from: y */
    private final C12174h f27238y;

    /* renamed from: z */
    private final InterfaceC12948i f27239z;

    /* compiled from: LazyJavaPackageFragment.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.h$a */
    /* loaded from: classes3.dex */
    static final class C12211a extends AbstractC11802m implements InterfaceC11756a<Map<String, ? extends InterfaceC12447o>> {
        C12211a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final Map<String, ? extends InterfaceC12447o> invoke() {
            Map<String, ? extends InterfaceC12447o> m3872t;
            InterfaceC12459u m9559o = C12210h.this.f27238y.m9538a().m9559o();
            String m7382b = C12210h.this.mo4954f().m7382b();
            l.e(m7382b, "fqName.asString()");
            List<String> mo8852a = m9559o.mo8852a(m7382b);
            C12210h c12210h = C12210h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : mo8852a) {
                C12608b m7384m = C12608b.m7384m(C12756d.m6833d(str).m6832e());
                l.e(m7384m, "topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)");
                InterfaceC12447o m8884b = C12446n.m8884b(c12210h.f27238y.m9538a().m9564j(), m7384m);
                C13287o m4227a = m8884b == null ? null : C13664u.m4227a(str, m8884b);
                if (m4227a != null) {
                    arrayList.add(m4227a);
                }
            }
            m3872t = C13727r0.m3872t(arrayList);
            return m3872t;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.h$b */
    /* loaded from: classes3.dex */
    static final class C12212b extends AbstractC11802m implements InterfaceC11756a<HashMap<C12756d, C12756d>> {

        /* compiled from: LazyJavaPackageFragment.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.h$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C12213a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f27242a;

            static {
                int[] iArr = new int[C12408a.EnumC12409a.values().length];
                iArr[C12408a.EnumC12409a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                iArr[C12408a.EnumC12409a.FILE_FACADE.ordinal()] = 2;
                f27242a = iArr;
            }
        }

        C12212b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final HashMap<C12756d, C12756d> invoke() {
            HashMap<C12756d, C12756d> hashMap = new HashMap<>();
            for (Map.Entry<String, InterfaceC12447o> entry : C12210h.this.m9410X0().entrySet()) {
                C12756d m6833d = C12756d.m6833d(entry.getKey());
                l.e(m6833d, "byInternalName(partInternalName)");
                C12408a mo4926a = entry.getValue().mo4926a();
                int i = C12213a.f27242a[mo4926a.m8997c().ordinal()];
                if (i == 1) {
                    String m8995e = mo4926a.m8995e();
                    if (m8995e != null) {
                        C12756d m6833d2 = C12756d.m6833d(m8995e);
                        l.e(m6833d2, "byInternalName(header.multifileClassName ?: continue@kotlinClasses)");
                        hashMap.put(m6833d, m6833d2);
                    }
                } else if (i == 2) {
                    hashMap.put(m6833d, m6833d);
                }
            }
            return hashMap;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.h$c */
    /* loaded from: classes3.dex */
    static final class C12214c extends AbstractC11802m implements InterfaceC11756a<List<? extends C12609c>> {
        C12214c() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<C12609c> invoke() {
            int m3867o;
            Collection<InterfaceC12292u> mo4795G = C12210h.this.f27237x.mo4795G();
            m3867o = C13728s.m3867o(mo4795G, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC12292u interfaceC12292u : mo4795G) {
                arrayList.add(interfaceC12292u.mo4793f());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12210h(C12174h c12174h, InterfaceC12292u interfaceC12292u) {
        super(c12174h.m9535d(), interfaceC12292u.mo4793f());
        List m3891e;
        l.f(c12174h, "outerContext");
        l.f(interfaceC12292u, "jPackage");
        this.f27237x = interfaceC12292u;
        C12174h m9582d = C12161a.m9582d(c12174h, this, null, 0, 6, null);
        this.f27238y = m9582d;
        this.f27239z = m9582d.m9534e().mo6367d(new C12211a());
        this.f27234A = new C12186d(this.f27238y, this.f27237x, this);
        InterfaceC12954n m9534e = this.f27238y.m9534e();
        C12214c c12214c = new C12214c();
        m3891e = C13726r.m3891e();
        this.f27235B = m9534e.mo6368c(c12214c, m3891e);
        this.f27236C = this.f27238y.m9538a().m9565i().m4260a() ? InterfaceC13346g.f29516s.m5317b() : C12171f.m9543a(this.f27238y, this.f27237x);
        this.f27238y.m9534e().mo6367d(new C12212b());
    }

    /* renamed from: W0 */
    public final InterfaceC13312e m9411W0(InterfaceC12277g interfaceC12277g) {
        l.f(interfaceC12277g, "jClass");
        return this.f27234A.m9510j().m9403O(interfaceC12277g);
    }

    /* renamed from: X0 */
    public final Map<String, InterfaceC12447o> m9410X0() {
        return (Map) C12953m.m6372a(this.f27239z, this, f27233D[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0
    /* renamed from: Y0 */
    public C12186d mo5125u() {
        return this.f27234A;
    }

    /* renamed from: Z0 */
    public final List<C12609c> m9408Z0() {
        return this.f27235B.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13446z, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p
    /* renamed from: m */
    public InterfaceC13545u0 mo4745m() {
        return new C12453p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13446z, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j
    public String toString() {
        return l.m("Lazy Java package fragment: ", mo4954f());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13339b, kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return this.f27236C;
    }
}
