package kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q;

import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13442x;
/* compiled from: JvmBuiltIns.kt */
/* renamed from: kotlin.j0.o.c.p0.b.q.f */
/* loaded from: classes3.dex */
public final class C12087f extends AbstractC12046h {

    /* renamed from: j */
    static final /* synthetic */ InterfaceC11872i<Object>[] f26953j = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12087f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: g */
    private final EnumC12088a f26954g;

    /* renamed from: h */
    private InterfaceC11756a<C12089b> f26955h;

    /* renamed from: i */
    private final InterfaceC12948i f26956i;

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.q.f$a */
    /* loaded from: classes3.dex */
    public enum EnumC12088a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.q.f$b */
    /* loaded from: classes3.dex */
    public static final class C12089b {

        /* renamed from: a */
        private final InterfaceC13305c0 f26961a;

        /* renamed from: b */
        private final boolean f26962b;

        public C12089b(InterfaceC13305c0 interfaceC13305c0, boolean z) {
            l.f(interfaceC13305c0, "ownerModuleDescriptor");
            this.f26961a = interfaceC13305c0;
            this.f26962b = z;
        }

        /* renamed from: a */
        public final InterfaceC13305c0 m9731a() {
            return this.f26961a;
        }

        /* renamed from: b */
        public final boolean m9730b() {
            return this.f26962b;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.q.f$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12090c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26963a;

        static {
            int[] iArr = new int[EnumC12088a.values().length];
            iArr[EnumC12088a.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[EnumC12088a.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[EnumC12088a.FALLBACK.ordinal()] = 3;
            f26963a = iArr;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.q.f$d */
    /* loaded from: classes3.dex */
    static final class C12091d extends AbstractC11802m implements InterfaceC11756a<C12094g> {

        /* renamed from: d */
        final /* synthetic */ InterfaceC12954n f26965d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: JvmBuiltIns.kt */
        /* renamed from: kotlin.j0.o.c.p0.b.q.f$d$a */
        /* loaded from: classes3.dex */
        public static final class C12092a extends AbstractC11802m implements InterfaceC11756a<C12089b> {

            /* renamed from: c */
            final /* synthetic */ C12087f f26966c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12092a(C12087f c12087f) {
                super(0);
                this.f26966c = c12087f;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final C12089b invoke() {
                InterfaceC11756a interfaceC11756a = this.f26966c.f26955h;
                if (interfaceC11756a != null) {
                    C12089b c12089b = (C12089b) interfaceC11756a.invoke();
                    this.f26966c.f26955h = null;
                    return c12089b;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12091d(InterfaceC12954n interfaceC12954n) {
            super(0);
            this.f26965d = interfaceC12954n;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12094g invoke() {
            C13442x m9874r = C12087f.this.m9874r();
            l.e(m9874r, "builtInsModule");
            return new C12094g(m9874r, this.f26965d, new C12092a(C12087f.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.q.f$e */
    /* loaded from: classes3.dex */
    public static final class C12093e extends AbstractC11802m implements InterfaceC11756a<C12089b> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13305c0 f26967c;

        /* renamed from: d */
        final /* synthetic */ boolean f26968d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12093e(InterfaceC13305c0 interfaceC13305c0, boolean z) {
            super(0);
            this.f26967c = interfaceC13305c0;
            this.f26968d = z;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12089b invoke() {
            return new C12089b(this.f26967c, this.f26968d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12087f(InterfaceC12954n interfaceC12954n, EnumC12088a enumC12088a) {
        super(interfaceC12954n);
        l.f(interfaceC12954n, "storageManager");
        l.f(enumC12088a, "kind");
        this.f26954g = enumC12088a;
        this.f26956i = interfaceC12954n.mo6367d(new C12091d(interfaceC12954n));
        int i = C12090c.f26963a[this.f26954g.ordinal()];
        if (i == 2) {
            m9897f(false);
        } else if (i != 3) {
        } else {
            m9897f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h
    /* renamed from: E0 */
    public List<InterfaceC13364b> mo9733v() {
        List<InterfaceC13364b> m3785m0;
        Iterable<InterfaceC13364b> mo9733v = super.mo9733v();
        l.e(mo9733v, "super.getClassDescriptorFactories()");
        InterfaceC12954n m9914T = m9914T();
        l.e(m9914T, "storageManager");
        C13442x m9874r = m9874r();
        l.e(m9874r, "builtInsModule");
        m3785m0 = C13742z.m3785m0(mo9733v, new C12083e(m9914T, m9874r, null, 4, null));
        return m3785m0;
    }

    /* renamed from: F0 */
    public final C12094g m9738F0() {
        return (C12094g) C12953m.m6372a(this.f26956i, this, f26953j[0]);
    }

    /* renamed from: G0 */
    public final void m9737G0(InterfaceC13305c0 interfaceC13305c0, boolean z) {
        l.f(interfaceC13305c0, "moduleDescriptor");
        m9736H0(new C12093e(interfaceC13305c0, z));
    }

    /* renamed from: H0 */
    public final void m9736H0(InterfaceC11756a<C12089b> interfaceC11756a) {
        l.f(interfaceC11756a, "computation");
        boolean z = this.f26955h == null;
        if (C13668y.f30115a && !z) {
            throw new AssertionError("JvmBuiltins repeated initialization");
        }
        this.f26955h = interfaceC11756a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h
    /* renamed from: M */
    protected InterfaceC13365c mo9735M() {
        return m9738F0();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h
    /* renamed from: g */
    protected InterfaceC13362a mo9734g() {
        return m9738F0();
    }
}
