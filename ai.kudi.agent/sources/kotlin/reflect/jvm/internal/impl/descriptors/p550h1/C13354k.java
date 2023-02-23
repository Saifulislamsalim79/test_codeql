package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p548k0.C13231i;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13742z;
/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.k */
/* loaded from: classes3.dex */
public final class C13354k implements InterfaceC13346g {

    /* renamed from: c */
    private final List<InterfaceC13346g> f29525c;

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.k$a */
    /* loaded from: classes3.dex */
    static final class C13355a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13346g, InterfaceC13340c> {

        /* renamed from: c */
        final /* synthetic */ C12609c f29526c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13355a(C12609c c12609c) {
            super(1);
            this.f29526c = c12609c;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13340c invoke(InterfaceC13346g interfaceC13346g) {
            l.f(interfaceC13346g, "it");
            return interfaceC13346g.mo5302r(this.f29526c);
        }
    }

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.k$b */
    /* loaded from: classes3.dex */
    static final class C13356b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13346g, InterfaceC13230h<? extends InterfaceC13340c>> {

        /* renamed from: c */
        public static final C13356b f29527c = new C13356b();

        C13356b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13230h<InterfaceC13340c> invoke(InterfaceC13346g interfaceC13346g) {
            InterfaceC13230h<InterfaceC13340c> m3818H;
            l.f(interfaceC13346g, "it");
            m3818H = C13742z.m3818H(interfaceC13346g);
            return m3818H;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13354k(List<? extends InterfaceC13346g> list) {
        l.f(list, "delegates");
        this.f29525c = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: Q */
    public boolean mo5304Q(C12609c c12609c) {
        InterfaceC13230h<InterfaceC13346g> m3818H;
        l.f(c12609c, "fqName");
        m3818H = C13742z.m3818H(this.f29525c);
        for (InterfaceC13346g interfaceC13346g : m3818H) {
            if (interfaceC13346g.mo5304Q(c12609c)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    public boolean isEmpty() {
        List<InterfaceC13346g> list = this.f29525c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (InterfaceC13346g interfaceC13346g : list) {
            if (!interfaceC13346g.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC13340c> iterator() {
        InterfaceC13230h m3818H;
        InterfaceC13230h m5570q;
        m3818H = C13742z.m3818H(this.f29525c);
        m5570q = C13242n.m5570q(m3818H, C13356b.f29527c);
        return m5570q.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: r */
    public InterfaceC13340c mo5302r(C12609c c12609c) {
        InterfaceC13230h m3818H;
        InterfaceC13230h m5568s;
        l.f(c12609c, "fqName");
        m3818H = C13742z.m3818H(this.f29525c);
        m5568s = C13242n.m5568s(m3818H, new C13355a(c12609c));
        return (InterfaceC13340c) C13231i.m5597p(m5568s);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13354k(kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.e0.d.l.f(r2, r0)
            java.util.List r2 = kotlin.p557z.C13706j.m4097Z(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13354k.<init>(kotlin.reflect.jvm.internal.impl.descriptors.h1.g[]):void");
    }
}
