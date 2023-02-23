package kotlin.p493j0.p494o.p495c;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11868g;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13453l0;
/* compiled from: KParameterImpl.kt */
/* renamed from: kotlin.j0.o.c.q */
/* loaded from: classes3.dex */
public final class C13178q implements InterfaceC11868g {

    /* renamed from: e */
    static final /* synthetic */ InterfaceC11872i[] f29296e = {C11813x.m10312f(new C11808s(C11813x.m10316b(C13178q.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C13178q.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a */
    private final C11916f0.C11917a f29297a;

    /* renamed from: b */
    private final AbstractC11906f<?> f29298b;

    /* renamed from: c */
    private final int f29299c;

    /* renamed from: d */
    private final InterfaceC11868g.EnumC11869a f29300d;

    /* compiled from: KParameterImpl.kt */
    /* renamed from: kotlin.j0.o.c.q$a */
    /* loaded from: classes3.dex */
    static final class C13179a extends AbstractC11802m implements InterfaceC11756a<List<? extends Annotation>> {
        C13179a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<Annotation> invoke() {
            return C11972m0.m10039c(C13178q.this.m5704d());
        }
    }

    public C13178q(AbstractC11906f<?> abstractC11906f, int i, InterfaceC11868g.EnumC11869a enumC11869a, InterfaceC11756a<? extends InterfaceC13453l0> interfaceC11756a) {
        l.f(abstractC11906f, "callable");
        l.f(enumC11869a, "kind");
        l.f(interfaceC11756a, "computeDescriptor");
        this.f29298b = abstractC11906f;
        this.f29299c = i;
        this.f29300d = enumC11869a;
        this.f29297a = C11916f0.m10164d(interfaceC11756a);
        C11916f0.m10164d(new C13179a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final InterfaceC13453l0 m5704d() {
        return (InterfaceC13453l0) this.f29297a.m10160b(this, f29296e[0]);
    }

    @Override // kotlin.p493j0.InterfaceC11868g
    /* renamed from: b */
    public String mo5706b() {
        InterfaceC13453l0 m5704d = m5704d();
        if (!(m5704d instanceof InterfaceC13307c1)) {
            m5704d = null;
        }
        InterfaceC13307c1 interfaceC13307c1 = (InterfaceC13307c1) m5704d;
        if (interfaceC13307c1 == null || interfaceC13307c1.mo4687d().mo5091M()) {
            return null;
        }
        C12614f mo5012b = interfaceC13307c1.mo5012b();
        l.e(mo5012b, "valueParameter.name");
        if (mo5012b.m7348j()) {
            return null;
        }
        return mo5012b.m7353b();
    }

    /* renamed from: c */
    public final AbstractC11906f<?> m5705c() {
        return this.f29298b;
    }

    /* renamed from: e */
    public int m5703e() {
        return this.f29299c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13178q) {
            C13178q c13178q = (C13178q) obj;
            if (l.b(this.f29298b, c13178q.f29298b) && m5703e() == c13178q.m5703e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public InterfaceC11868g.EnumC11869a m5702f() {
        return this.f29300d;
    }

    public int hashCode() {
        return (this.f29298b.hashCode() * 31) + Integer.valueOf(m5703e()).hashCode();
    }

    public String toString() {
        return C11949i0.f26645b.m10099f(this);
    }
}
