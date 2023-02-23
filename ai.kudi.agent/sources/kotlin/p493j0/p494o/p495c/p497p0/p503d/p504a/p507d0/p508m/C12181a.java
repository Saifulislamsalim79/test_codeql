package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.C12286p;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12284n;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12287q;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12291t;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12294w;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: DeclaredMemberIndex.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.a */
/* loaded from: classes3.dex */
public class C12181a implements InterfaceC12183b {

    /* renamed from: a */
    private final InterfaceC12277g f27166a;

    /* renamed from: b */
    private final InterfaceC11767l<InterfaceC12287q, Boolean> f27167b;

    /* renamed from: c */
    private final InterfaceC11767l<InterfaceC12288r, Boolean> f27168c;

    /* renamed from: d */
    private final Map<C12614f, List<InterfaceC12288r>> f27169d;

    /* renamed from: e */
    private final Map<C12614f, InterfaceC12284n> f27170e;

    /* renamed from: f */
    private final Map<C12614f, InterfaceC12294w> f27171f;

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.a$a */
    /* loaded from: classes3.dex */
    static final class C12182a extends AbstractC11802m implements InterfaceC11767l<InterfaceC12288r, Boolean> {
        C12182a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m9521a(InterfaceC12288r interfaceC12288r) {
            l.f(interfaceC12288r, "m");
            return ((Boolean) C12181a.this.f27167b.invoke(interfaceC12288r)).booleanValue() && !C12286p.m9267c(interfaceC12288r);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC12288r interfaceC12288r) {
            return Boolean.valueOf(m9521a(interfaceC12288r));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12181a(InterfaceC12277g interfaceC12277g, InterfaceC11767l<? super InterfaceC12287q, Boolean> interfaceC11767l) {
        InterfaceC13230h m3818H;
        InterfaceC13230h m5574m;
        InterfaceC13230h m3818H2;
        InterfaceC13230h m5574m2;
        int m3867o;
        int m3898f;
        int m10271a;
        l.f(interfaceC12277g, "jClass");
        l.f(interfaceC11767l, "memberFilter");
        this.f27166a = interfaceC12277g;
        this.f27167b = interfaceC11767l;
        this.f27168c = new C12182a();
        m3818H = C13742z.m3818H(this.f27166a.mo4860U());
        m5574m = C13242n.m5574m(m3818H, this.f27168c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m5574m) {
            C12614f mo4785b = ((InterfaceC12288r) obj).mo4785b();
            Object obj2 = linkedHashMap.get(mo4785b);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(mo4785b, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f27169d = linkedHashMap;
        m3818H2 = C13742z.m3818H(this.f27166a.mo4864J());
        m5574m2 = C13242n.m5574m(m3818H2, this.f27167b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : m5574m2) {
            linkedHashMap2.put(((InterfaceC12284n) obj3).mo4785b(), obj3);
        }
        this.f27170e = linkedHashMap2;
        Collection<InterfaceC12294w> mo4844o = this.f27166a.mo4844o();
        InterfaceC11767l<InterfaceC12287q, Boolean> interfaceC11767l2 = this.f27167b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : mo4844o) {
            if (((Boolean) interfaceC11767l2.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        m3867o = C13728s.m3867o(arrayList, 10);
        m3898f = C13725q0.m3898f(m3867o);
        m10271a = C11841h.m10271a(m3898f, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(m10271a);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((InterfaceC12294w) obj5).mo4785b(), obj5);
        }
        this.f27171f = linkedHashMap3;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.InterfaceC12183b
    /* renamed from: a */
    public Set<C12614f> mo9520a() {
        InterfaceC13230h m3818H;
        InterfaceC13230h<InterfaceC12291t> m5574m;
        m3818H = C13742z.m3818H(this.f27166a.mo4860U());
        m5574m = C13242n.m5574m(m3818H, this.f27168c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC12291t interfaceC12291t : m5574m) {
            linkedHashSet.add(interfaceC12291t.mo4785b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.InterfaceC12183b
    /* renamed from: b */
    public InterfaceC12294w mo9519b(C12614f c12614f) {
        l.f(c12614f, "name");
        return this.f27171f.get(c12614f);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.InterfaceC12183b
    /* renamed from: c */
    public InterfaceC12284n mo9518c(C12614f c12614f) {
        l.f(c12614f, "name");
        return this.f27170e.get(c12614f);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.InterfaceC12183b
    /* renamed from: d */
    public Set<C12614f> mo9517d() {
        return this.f27171f.keySet();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.InterfaceC12183b
    /* renamed from: e */
    public Set<C12614f> mo9516e() {
        InterfaceC13230h m3818H;
        InterfaceC13230h<InterfaceC12291t> m5574m;
        m3818H = C13742z.m3818H(this.f27166a.mo4864J());
        m5574m = C13242n.m5574m(m3818H, this.f27167b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC12291t interfaceC12291t : m5574m) {
            linkedHashSet.add(interfaceC12291t.mo4785b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.InterfaceC12183b
    /* renamed from: f */
    public Collection<InterfaceC12288r> mo9515f(C12614f c12614f) {
        List m3891e;
        l.f(c12614f, "name");
        List<InterfaceC12288r> list = this.f27169d.get(c12614f);
        if (list == null) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return list;
    }
}
