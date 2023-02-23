package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12461v;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p557z.C13705i0;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13728s;
/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.m */
/* loaded from: classes3.dex */
final class C12352m {

    /* renamed from: a */
    private final Map<String, C12341k> f27427a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.g0.m$a */
    /* loaded from: classes3.dex */
    public final class C12353a {

        /* renamed from: a */
        private final String f27428a;

        /* renamed from: b */
        final /* synthetic */ C12352m f27429b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.a.g0.m$a$a */
        /* loaded from: classes3.dex */
        public final class C12354a {

            /* renamed from: a */
            private final String f27430a;

            /* renamed from: b */
            private final List<C13287o<String, C12360s>> f27431b;

            /* renamed from: c */
            private C13287o<String, C12360s> f27432c;

            /* renamed from: d */
            final /* synthetic */ C12353a f27433d;

            public C12354a(C12353a c12353a, String str) {
                l.f(c12353a, "this$0");
                l.f(str, "functionName");
                this.f27433d = c12353a;
                this.f27430a = str;
                this.f27431b = new ArrayList();
                this.f27432c = C13664u.m4227a("V", null);
            }

            /* renamed from: a */
            public final C13287o<String, C12341k> m9150a() {
                int m3867o;
                int m3867o2;
                C12461v c12461v = C12461v.f27635a;
                String m9151b = this.f27433d.m9151b();
                String m9149b = m9149b();
                List<C13287o<String, C12360s>> list = this.f27431b;
                m3867o = C13728s.m3867o(list, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((C13287o) it.next()).m5364c());
                }
                String m8841k = c12461v.m8841k(m9151b, c12461v.m8842j(m9149b, arrayList, this.f27432c.m5364c()));
                C12360s m5363d = this.f27432c.m5363d();
                List<C13287o<String, C12360s>> list2 = this.f27431b;
                m3867o2 = C13728s.m3867o(list2, 10);
                ArrayList arrayList2 = new ArrayList(m3867o2);
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C12360s) ((C13287o) it2.next()).m5363d());
                }
                return C13664u.m4227a(m8841k, new C12341k(m5363d, arrayList2));
            }

            /* renamed from: b */
            public final String m9149b() {
                return this.f27430a;
            }

            /* renamed from: c */
            public final void m9148c(String str, C12306e... c12306eArr) {
                Iterable<C13705i0> m4011n0;
                int m3867o;
                int m3898f;
                int m10271a;
                C12360s c12360s;
                l.f(str, "type");
                l.f(c12306eArr, "qualifiers");
                List<C13287o<String, C12360s>> list = this.f27431b;
                if (c12306eArr.length == 0) {
                    c12360s = null;
                } else {
                    m4011n0 = C13715n.m4011n0(c12306eArr);
                    m3867o = C13728s.m3867o(m4011n0, 10);
                    m3898f = C13725q0.m3898f(m3867o);
                    m10271a = C11841h.m10271a(m3898f, 16);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m10271a);
                    for (C13705i0 c13705i0 : m4011n0) {
                        linkedHashMap.put(Integer.valueOf(c13705i0.m4117c()), (C12306e) c13705i0.m4116d());
                    }
                    c12360s = new C12360s(linkedHashMap);
                }
                list.add(C13664u.m4227a(str, c12360s));
            }

            /* renamed from: d */
            public final void m9147d(String str, C12306e... c12306eArr) {
                Iterable<C13705i0> m4011n0;
                int m3867o;
                int m3898f;
                int m10271a;
                l.f(str, "type");
                l.f(c12306eArr, "qualifiers");
                m4011n0 = C13715n.m4011n0(c12306eArr);
                m3867o = C13728s.m3867o(m4011n0, 10);
                m3898f = C13725q0.m3898f(m3867o);
                m10271a = C11841h.m10271a(m3898f, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m10271a);
                for (C13705i0 c13705i0 : m4011n0) {
                    linkedHashMap.put(Integer.valueOf(c13705i0.m4117c()), (C12306e) c13705i0.m4116d());
                }
                this.f27432c = C13664u.m4227a(str, new C12360s(linkedHashMap));
            }

            /* renamed from: e */
            public final void m9146e(EnumC12757e enumC12757e) {
                l.f(enumC12757e, "type");
                String m6826g = enumC12757e.m6826g();
                l.e(m6826g, "type.desc");
                this.f27432c = C13664u.m4227a(m6826g, null);
            }
        }

        public C12353a(C12352m c12352m, String str) {
            l.f(c12352m, "this$0");
            l.f(str, "className");
            this.f27429b = c12352m;
            this.f27428a = str;
        }

        /* renamed from: a */
        public final void m9152a(String str, InterfaceC11767l<? super C12354a, C13666w> interfaceC11767l) {
            l.f(str, "name");
            l.f(interfaceC11767l, "block");
            Map map = this.f27429b.f27427a;
            C12354a c12354a = new C12354a(this, str);
            interfaceC11767l.invoke(c12354a);
            C13287o<String, C12341k> m9150a = c12354a.m9150a();
            map.put(m9150a.m5364c(), m9150a.m5363d());
        }

        /* renamed from: b */
        public final String m9151b() {
            return this.f27428a;
        }
    }

    /* renamed from: b */
    public final Map<String, C12341k> m9153b() {
        return this.f27427a;
    }
}
