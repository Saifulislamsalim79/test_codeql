package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12408a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12411b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p549l0.C13276s;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.f */
/* loaded from: classes3.dex */
public final class C13459f implements InterfaceC12447o {

    /* renamed from: c */
    public static final C13460a f29814c = new C13460a(null);

    /* renamed from: a */
    private final Class<?> f29815a;

    /* renamed from: b */
    private final C12408a f29816b;

    /* compiled from: ReflectKotlinClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.f$a */
    /* loaded from: classes3.dex */
    public static final class C13460a {
        private C13460a() {
        }

        public /* synthetic */ C13460a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C13459f m4921a(Class<?> cls) {
            l.f(cls, "klass");
            C12411b c12411b = new C12411b();
            C13456c.f29812a.m4938b(cls, c12411b);
            C12408a m8975l = c12411b.m8975l();
            if (m8975l == null) {
                return null;
            }
            return new C13459f(cls, m8975l, null);
        }
    }

    private C13459f(Class<?> cls, C12408a c12408a) {
        this.f29815a = cls;
        this.f29816b = c12408a;
    }

    public /* synthetic */ C13459f(Class cls, C12408a c12408a, g gVar) {
        this(cls, c12408a);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o
    /* renamed from: a */
    public C12408a mo4926a() {
        return this.f29816b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o
    /* renamed from: b */
    public void mo4925b(InterfaceC12447o.InterfaceC12450c interfaceC12450c, byte[] bArr) {
        l.f(interfaceC12450c, "visitor");
        C13456c.f29812a.m4938b(this.f29815a, interfaceC12450c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o
    /* renamed from: c */
    public void mo4924c(InterfaceC12447o.InterfaceC12451d interfaceC12451d, byte[] bArr) {
        l.f(interfaceC12451d, "visitor");
        C13456c.f29812a.m4931i(this.f29815a, interfaceC12451d);
    }

    /* renamed from: d */
    public final Class<?> m4923d() {
        return this.f29815a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13459f) && l.b(this.f29815a, ((C13459f) obj).f29815a);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o
    public String getLocation() {
        String m5435z;
        String name = this.f29815a.getName();
        l.e(name, "klass.name");
        m5435z = C13276s.m5435z(name, '.', '/', false, 4, null);
        return l.m(m5435z, ".class");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o
    /* renamed from: h */
    public C12608b mo4922h() {
        return C13474b.m4893a(this.f29815a);
    }

    public int hashCode() {
        return this.f29815a.hashCode();
    }

    public String toString() {
        return C13459f.class.getName() + ": " + this.f29815a;
    }
}
