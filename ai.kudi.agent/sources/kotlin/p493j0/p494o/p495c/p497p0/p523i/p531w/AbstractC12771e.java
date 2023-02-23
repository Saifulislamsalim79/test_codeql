package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.AbstractC12679h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
import kotlin.reflect.jvm.internal.impl.utils.C13653g;
/* compiled from: GivenFunctionsMemberScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.e */
/* loaded from: classes3.dex */
public abstract class AbstractC12771e extends AbstractC12781i {

    /* renamed from: d */
    static final /* synthetic */ InterfaceC11872i<Object>[] f28658d = {C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC12771e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    private final InterfaceC13312e f28659b;

    /* renamed from: c */
    private final InterfaceC12948i f28660c;

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.e$a */
    /* loaded from: classes3.dex */
    static final class C12772a extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13513m>> {
        C12772a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<InterfaceC13513m> invoke() {
            List<InterfaceC13513m> m3784n0;
            List<InterfaceC13554x> mo6784i = AbstractC12771e.this.mo6784i();
            m3784n0 = C13742z.m3784n0(mo6784i, AbstractC12771e.this.m6783j(mo6784i));
            return m3784n0;
        }
    }

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.e$b */
    /* loaded from: classes3.dex */
    public static final class C12773b extends AbstractC12679h {

        /* renamed from: a */
        final /* synthetic */ ArrayList<InterfaceC13513m> f28662a;

        /* renamed from: b */
        final /* synthetic */ AbstractC12771e f28663b;

        C12773b(ArrayList<InterfaceC13513m> arrayList, AbstractC12771e abstractC12771e) {
            this.f28662a = arrayList;
            this.f28663b = abstractC12771e;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.AbstractC12680i
        /* renamed from: a */
        public void mo5099a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "fakeOverride");
            C12681j.m6982L(interfaceC13300b, null);
            this.f28662a.add(interfaceC13300b);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.AbstractC12679h
        /* renamed from: e */
        protected void mo5098e(InterfaceC13300b interfaceC13300b, InterfaceC13300b interfaceC13300b2) {
            l.f(interfaceC13300b, "fromSuper");
            l.f(interfaceC13300b2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f28663b.m6781l() + ": " + interfaceC13300b + " vs " + interfaceC13300b2).toString());
        }
    }

    public AbstractC12771e(InterfaceC12954n interfaceC12954n, InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13312e, "containingClass");
        this.f28659b = interfaceC13312e;
        this.f28660c = interfaceC12954n.mo6367d(new C12772a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final List<InterfaceC13513m> m6783j(List<? extends InterfaceC13554x> list) {
        Collection<? extends InterfaceC13300b> m3891e;
        ArrayList arrayList = new ArrayList(3);
        Collection<AbstractC12965b0> mo5218a = this.f28659b.mo4649n().mo5218a();
        l.e(mo5218a, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC12965b0 abstractC12965b0 : mo5218a) {
            C13736w.m3850v(arrayList2, InterfaceC12783k.C12784a.m6774a(abstractC12965b0.mo5775u(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC13300b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            C12614f mo5012b = ((InterfaceC13300b) obj2).mo5012b();
            Object obj3 = linkedHashMap.get(mo5012b);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(mo5012b, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C12614f c12614f = (C12614f) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((InterfaceC13300b) obj4) instanceof InterfaceC13554x);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                C12681j c12681j = C12681j.f28539d;
                if (booleanValue) {
                    m3891e = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (l.b(((InterfaceC13554x) obj6).mo5012b(), c12614f)) {
                            m3891e.add(obj6);
                        }
                    }
                } else {
                    m3891e = C13726r.m3891e();
                }
                c12681j.m6958w(c12614f, list2, m3891e, this.f28659b, new C12773b(arrayList, this));
            }
        }
        return C13634a.m4285c(arrayList);
    }

    /* renamed from: k */
    private final List<InterfaceC13513m> m6782k() {
        return (List) C12953m.m6372a(this.f28660c, this, f28658d[0]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        List<InterfaceC13513m> m6782k = m6782k();
        C13653g c13653g = new C13653g();
        for (Object obj : m6782k) {
            if ((obj instanceof InterfaceC13543t0) && l.b(((InterfaceC13543t0) obj).mo5012b(), c12614f)) {
                c13653g.add(obj);
            }
        }
        return c13653g;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        List<InterfaceC13513m> m6782k = m6782k();
        C13653g c13653g = new C13653g();
        for (Object obj : m6782k) {
            if ((obj instanceof InterfaceC13518o0) && l.b(((InterfaceC13518o0) obj).mo5012b(), c12614f)) {
                c13653g.add(obj);
            }
        }
        return c13653g;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List m3891e;
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        if (c12768d.m6811a(C12768d.f28648p.m6799m())) {
            return m6782k();
        }
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    /* renamed from: i */
    protected abstract List<InterfaceC13554x> mo6784i();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final InterfaceC13312e m6781l() {
        return this.f28659b;
    }
}
