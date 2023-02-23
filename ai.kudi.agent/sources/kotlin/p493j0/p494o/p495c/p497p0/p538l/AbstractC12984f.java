package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13068d;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13074j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13079o;
import kotlin.reflect.jvm.internal.impl.utils.C13658h;
/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.j0.o.c.p0.l.f */
/* loaded from: classes3.dex */
public abstract class AbstractC12984f {

    /* renamed from: a */
    private int f29054a;

    /* renamed from: b */
    private boolean f29055b;

    /* renamed from: c */
    private ArrayDeque<InterfaceC13074j> f29056c;

    /* renamed from: d */
    private Set<InterfaceC13074j> f29057d;

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.f$a */
    /* loaded from: classes3.dex */
    public enum EnumC12985a {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.f$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12986b {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.f$b$a */
        /* loaded from: classes3.dex */
        public static abstract class AbstractC12987a extends AbstractC12986b {
            public AbstractC12987a() {
                super(null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.f$b$b */
        /* loaded from: classes3.dex */
        public static final class C12988b extends AbstractC12986b {

            /* renamed from: a */
            public static final C12988b f29062a = new C12988b();

            private C12988b() {
                super(null);
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f.AbstractC12986b
            /* renamed from: a */
            public InterfaceC13074j mo6188a(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i) {
                l.f(abstractC12984f, "context");
                l.f(interfaceC13073i, "type");
                return abstractC12984f.mo6198j().mo5976a0(interfaceC13073i);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.f$b$c */
        /* loaded from: classes3.dex */
        public static final class C12989c extends AbstractC12986b {

            /* renamed from: a */
            public static final C12989c f29063a = new C12989c();

            private C12989c() {
                super(null);
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f.AbstractC12986b
            /* renamed from: a */
            public /* bridge */ /* synthetic */ InterfaceC13074j mo6188a(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i) {
                m6234b(abstractC12984f, interfaceC13073i);
                throw null;
            }

            /* renamed from: b */
            public Void m6234b(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i) {
                l.f(abstractC12984f, "context");
                l.f(interfaceC13073i, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.f$b$d */
        /* loaded from: classes3.dex */
        public static final class C12990d extends AbstractC12986b {

            /* renamed from: a */
            public static final C12990d f29064a = new C12990d();

            private C12990d() {
                super(null);
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f.AbstractC12986b
            /* renamed from: a */
            public InterfaceC13074j mo6188a(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i) {
                l.f(abstractC12984f, "context");
                l.f(interfaceC13073i, "type");
                return abstractC12984f.mo6198j().mo5988N(interfaceC13073i);
            }
        }

        private AbstractC12986b() {
        }

        public /* synthetic */ AbstractC12986b(g gVar) {
            this();
        }

        /* renamed from: a */
        public abstract InterfaceC13074j mo6188a(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i);
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m6243d(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            return abstractC12984f.m6244c(interfaceC13073i, interfaceC13073i2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    /* renamed from: c */
    public Boolean m6244c(InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2, boolean z) {
        l.f(interfaceC13073i, "subType");
        l.f(interfaceC13073i2, "superType");
        return null;
    }

    /* renamed from: e */
    public final void m6242e() {
        ArrayDeque<InterfaceC13074j> arrayDeque = this.f29056c;
        l.d(arrayDeque);
        arrayDeque.clear();
        Set<InterfaceC13074j> set = this.f29057d;
        l.d(set);
        set.clear();
        this.f29055b = false;
    }

    /* renamed from: f */
    public boolean m6241f(InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2) {
        l.f(interfaceC13073i, "subType");
        l.f(interfaceC13073i2, "superType");
        return true;
    }

    /* renamed from: g */
    public EnumC12985a m6240g(InterfaceC13074j interfaceC13074j, InterfaceC13068d interfaceC13068d) {
        l.f(interfaceC13074j, "subType");
        l.f(interfaceC13068d, "superType");
        return EnumC12985a.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: h */
    public final ArrayDeque<InterfaceC13074j> m6239h() {
        return this.f29056c;
    }

    /* renamed from: i */
    public final Set<InterfaceC13074j> m6238i() {
        return this.f29057d;
    }

    /* renamed from: j */
    public abstract InterfaceC13079o mo6198j();

    /* renamed from: k */
    public final void m6237k() {
        boolean z = !this.f29055b;
        if (C13668y.f30115a && !z) {
            throw new AssertionError(l.m("Supertypes were locked for ", C11813x.m10316b(getClass())));
        }
        this.f29055b = true;
        if (this.f29056c == null) {
            this.f29056c = new ArrayDeque<>(4);
        }
        if (this.f29057d == null) {
            this.f29057d = C13658h.f30099e.m4236a();
        }
    }

    /* renamed from: l */
    public abstract boolean mo6197l(InterfaceC13073i interfaceC13073i);

    /* renamed from: m */
    public final boolean m6236m(InterfaceC13073i interfaceC13073i) {
        l.f(interfaceC13073i, "type");
        return mo6197l(interfaceC13073i);
    }

    /* renamed from: n */
    public abstract boolean mo6196n();

    /* renamed from: o */
    public abstract boolean mo6195o();

    /* renamed from: p */
    public abstract InterfaceC13073i mo6194p(InterfaceC13073i interfaceC13073i);

    /* renamed from: q */
    public abstract InterfaceC13073i mo6193q(InterfaceC13073i interfaceC13073i);

    /* renamed from: r */
    public abstract AbstractC12986b mo6192r(InterfaceC13074j interfaceC13074j);
}
