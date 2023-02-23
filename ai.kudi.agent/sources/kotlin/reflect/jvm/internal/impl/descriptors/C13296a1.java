package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C13668y;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a1 */
/* loaded from: classes3.dex */
public final class C13296a1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a1$a */
    /* loaded from: classes3.dex */
    public static final class C13297a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13513m, Boolean> {

        /* renamed from: c */
        public static final C13297a f29449c = new C13297a();

        C13297a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m5350a(InterfaceC13513m interfaceC13513m) {
            kotlin.e0.d.l.f(interfaceC13513m, "it");
            return interfaceC13513m instanceof InterfaceC13293a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13513m interfaceC13513m) {
            return Boolean.valueOf(m5350a(interfaceC13513m));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a1$b */
    /* loaded from: classes3.dex */
    public static final class C13298b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13513m, Boolean> {

        /* renamed from: c */
        public static final C13298b f29450c = new C13298b();

        C13298b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m5349a(InterfaceC13513m interfaceC13513m) {
            kotlin.e0.d.l.f(interfaceC13513m, "it");
            return !(interfaceC13513m instanceof InterfaceC13452l);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13513m interfaceC13513m) {
            return Boolean.valueOf(m5349a(interfaceC13513m));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a1$c */
    /* loaded from: classes3.dex */
    public static final class C13299c extends AbstractC11802m implements InterfaceC11767l<InterfaceC13513m, InterfaceC13230h<? extends InterfaceC13562z0>> {

        /* renamed from: c */
        public static final C13299c f29451c = new C13299c();

        C13299c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13230h<InterfaceC13562z0> invoke(InterfaceC13513m interfaceC13513m) {
            InterfaceC13230h<InterfaceC13562z0> m3818H;
            kotlin.e0.d.l.f(interfaceC13513m, "it");
            List<InterfaceC13562z0> mo4942l = ((InterfaceC13293a) interfaceC13513m).mo4942l();
            kotlin.e0.d.l.e(mo4942l, "it as CallableDescriptor).typeParameters");
            m3818H = C13742z.m3818H(mo4942l);
            return m3818H;
        }
    }

    /* renamed from: a */
    public static final C13514m0 m5354a(AbstractC12965b0 abstractC12965b0) {
        kotlin.e0.d.l.f(abstractC12965b0, "<this>");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        return m5353b(abstractC12965b0, mo5206d instanceof InterfaceC13360i ? (InterfaceC13360i) mo5206d : null, 0);
    }

    /* renamed from: b */
    private static final C13514m0 m5353b(AbstractC12965b0 abstractC12965b0, InterfaceC13360i interfaceC13360i, int i) {
        if (interfaceC13360i == null || C13118t.m5803r(interfaceC13360i)) {
            return null;
        }
        int size = interfaceC13360i.mo4975B().size() + i;
        if (!interfaceC13360i.mo4967U()) {
            boolean z = size == abstractC12965b0.mo5780V0().size() || C12673d.m7043E(interfaceC13360i);
            if (C13668y.f30115a && !z) {
                throw new AssertionError((abstractC12965b0.mo5780V0().size() - size) + " trailing arguments were found in " + abstractC12965b0 + " type");
            }
            return new C13514m0(interfaceC13360i, abstractC12965b0.mo5780V0().subList(i, abstractC12965b0.mo5780V0().size()), null);
        }
        List<InterfaceC13131v0> subList = abstractC12965b0.mo5780V0().subList(i, size);
        InterfaceC13513m mo4687d = interfaceC13360i.mo4687d();
        return new C13514m0(interfaceC13360i, subList, m5353b(abstractC12965b0, mo4687d instanceof InterfaceC13360i ? (InterfaceC13360i) mo4687d : null, size));
    }

    /* renamed from: c */
    private static final C13304c m5352c(InterfaceC13562z0 interfaceC13562z0, InterfaceC13513m interfaceC13513m, int i) {
        return new C13304c(interfaceC13562z0, interfaceC13513m, i);
    }

    /* renamed from: d */
    public static final List<InterfaceC13562z0> m5351d(InterfaceC13360i interfaceC13360i) {
        InterfaceC13230h m5565v;
        InterfaceC13230h m5574m;
        InterfaceC13230h m5570q;
        List m5563x;
        List<InterfaceC13562z0> list;
        InterfaceC13513m interfaceC13513m;
        List<InterfaceC13562z0> m3784n0;
        int m3867o;
        List<InterfaceC13562z0> m3784n02;
        InterfaceC13125t0 mo4649n;
        kotlin.e0.d.l.f(interfaceC13360i, "<this>");
        List<InterfaceC13562z0> mo4975B = interfaceC13360i.mo4975B();
        kotlin.e0.d.l.e(mo4975B, "declaredTypeParameters");
        if (interfaceC13360i.mo4967U() || (interfaceC13360i.mo4687d() instanceof InterfaceC13293a)) {
            m5565v = C13242n.m5565v(C12747a.m6857m(interfaceC13360i), C13297a.f29449c);
            m5574m = C13242n.m5574m(m5565v, C13298b.f29450c);
            m5570q = C13242n.m5570q(m5574m, C13299c.f29451c);
            m5563x = C13242n.m5563x(m5570q);
            Iterator<InterfaceC13513m> it = C12747a.m6857m(interfaceC13360i).iterator();
            while (true) {
                list = null;
                if (!it.hasNext()) {
                    interfaceC13513m = null;
                    break;
                }
                interfaceC13513m = it.next();
                if (interfaceC13513m instanceof InterfaceC13312e) {
                    break;
                }
            }
            InterfaceC13312e interfaceC13312e = (InterfaceC13312e) interfaceC13513m;
            if (interfaceC13312e != null && (mo4649n = interfaceC13312e.mo4649n()) != null) {
                list = mo4649n.mo5207c();
            }
            if (list == null) {
                list = C13726r.m3891e();
            }
            if (m5563x.isEmpty() && list.isEmpty()) {
                List<InterfaceC13562z0> mo4975B2 = interfaceC13360i.mo4975B();
                kotlin.e0.d.l.e(mo4975B2, "declaredTypeParameters");
                return mo4975B2;
            }
            m3784n0 = C13742z.m3784n0(m5563x, list);
            m3867o = C13728s.m3867o(m3784n0, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC13562z0 interfaceC13562z0 : m3784n0) {
                kotlin.e0.d.l.e(interfaceC13562z0, "it");
                arrayList.add(m5352c(interfaceC13562z0, interfaceC13360i, mo4975B.size()));
            }
            m3784n02 = C13742z.m3784n0(mo4975B, arrayList);
            return m3784n02;
        }
        return mo4975B;
    }
}
