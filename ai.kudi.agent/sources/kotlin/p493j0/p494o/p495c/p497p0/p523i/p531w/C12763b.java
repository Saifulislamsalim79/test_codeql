package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p546n.C13177a;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.utils.C13653g;
/* compiled from: ChainedMemberScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.b */
/* loaded from: classes3.dex */
public final class C12763b implements InterfaceC12777h {

    /* renamed from: d */
    public static final C12764a f28629d = new C12764a(null);

    /* renamed from: b */
    private final String f28630b;

    /* renamed from: c */
    private final InterfaceC12777h[] f28631c;

    /* compiled from: ChainedMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.b$a */
    /* loaded from: classes3.dex */
    public static final class C12764a {
        private C12764a() {
        }

        public /* synthetic */ C12764a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC12777h m6814a(String str, Iterable<? extends InterfaceC12777h> iterable) {
            l.f(str, "debugName");
            l.f(iterable, "scopes");
            C13653g c13653g = new C13653g();
            for (InterfaceC12777h interfaceC12777h : iterable) {
                if (interfaceC12777h != InterfaceC12777h.C12780b.f28671b) {
                    if (interfaceC12777h instanceof C12763b) {
                        C13736w.m3849w(c13653g, ((C12763b) interfaceC12777h).f28631c);
                    } else {
                        c13653g.add(interfaceC12777h);
                    }
                }
            }
            return m6813b(str, c13653g);
        }

        /* renamed from: b */
        public final InterfaceC12777h m6813b(String str, List<? extends InterfaceC12777h> list) {
            l.f(str, "debugName");
            l.f(list, "scopes");
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    Object[] array = list.toArray(new InterfaceC12777h[0]);
                    if (array != null) {
                        return new C12763b(str, (InterfaceC12777h[]) array, null);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return list.get(0);
            }
            return InterfaceC12777h.C12780b.f28671b;
        }
    }

    private C12763b(String str, InterfaceC12777h[] interfaceC12777hArr) {
        this.f28630b = str;
        this.f28631c = interfaceC12777hArr;
    }

    public /* synthetic */ C12763b(String str, InterfaceC12777h[] interfaceC12777hArr, g gVar) {
        this(str, interfaceC12777hArr);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        List m3891e;
        Set m3831b;
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        InterfaceC12777h[] interfaceC12777hArr = this.f28631c;
        int length = interfaceC12777hArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        int i = 0;
        if (length != 1) {
            Collection<InterfaceC13543t0> collection = null;
            int length2 = interfaceC12777hArr.length;
            while (i < length2) {
                InterfaceC12777h interfaceC12777h = interfaceC12777hArr[i];
                i++;
                collection = C13177a.m5709a(collection, interfaceC12777h.mo5117a(c12614f, interfaceC12112b));
            }
            if (collection == null) {
                m3831b = C13741y0.m3831b();
                return m3831b;
            }
            return collection;
        }
        return interfaceC12777hArr[0].mo5117a(c12614f, interfaceC12112b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: b */
    public Set<C12614f> mo5116b() {
        InterfaceC12777h[] interfaceC12777hArr = this.f28631c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC12777h interfaceC12777h : interfaceC12777hArr) {
            C13736w.m3850v(linkedHashSet, interfaceC12777h.mo5116b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        List m3891e;
        Set m3831b;
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        InterfaceC12777h[] interfaceC12777hArr = this.f28631c;
        int length = interfaceC12777hArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        int i = 0;
        if (length != 1) {
            Collection<InterfaceC13518o0> collection = null;
            int length2 = interfaceC12777hArr.length;
            while (i < length2) {
                InterfaceC12777h interfaceC12777h = interfaceC12777hArr[i];
                i++;
                collection = C13177a.m5709a(collection, interfaceC12777h.mo5115c(c12614f, interfaceC12112b));
            }
            if (collection == null) {
                m3831b = C13741y0.m3831b();
                return m3831b;
            }
            return collection;
        }
        return interfaceC12777hArr[0].mo5115c(c12614f, interfaceC12112b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: d */
    public Set<C12614f> mo5114d() {
        InterfaceC12777h[] interfaceC12777hArr = this.f28631c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC12777h interfaceC12777h : interfaceC12777hArr) {
            C13736w.m3850v(linkedHashSet, interfaceC12777h.mo5114d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        Iterable m4009p;
        m4009p = C13715n.m4009p(this.f28631c);
        return C12782j.m6775a(m4009p);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        InterfaceC12777h[] interfaceC12777hArr = this.f28631c;
        int length = interfaceC12777hArr.length;
        InterfaceC13334h interfaceC13334h = null;
        int i = 0;
        while (i < length) {
            InterfaceC12777h interfaceC12777h = interfaceC12777hArr[i];
            i++;
            InterfaceC13334h mo5794f = interfaceC12777h.mo5794f(c12614f, interfaceC12112b);
            if (mo5794f != null) {
                if (!(mo5794f instanceof InterfaceC13360i) || !((InterfaceC13360i) mo5794f).mo4660T()) {
                    return mo5794f;
                }
                if (interfaceC13334h == null) {
                    interfaceC13334h = mo5794f;
                }
            }
        }
        return interfaceC13334h;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List m3891e;
        Set m3831b;
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        InterfaceC12777h[] interfaceC12777hArr = this.f28631c;
        int length = interfaceC12777hArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        int i = 0;
        if (length != 1) {
            Collection<InterfaceC13513m> collection = null;
            int length2 = interfaceC12777hArr.length;
            while (i < length2) {
                InterfaceC12777h interfaceC12777h = interfaceC12777hArr[i];
                i++;
                collection = C13177a.m5709a(collection, interfaceC12777h.mo5112g(c12768d, interfaceC11767l));
            }
            if (collection == null) {
                m3831b = C13741y0.m3831b();
                return m3831b;
            }
            return collection;
        }
        return interfaceC12777hArr[0].mo5112g(c12768d, interfaceC11767l);
    }

    public String toString() {
        return this.f28630b;
    }
}
