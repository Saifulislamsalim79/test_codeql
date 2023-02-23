package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12678g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12893l;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12907u;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12914v;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12946g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12947h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12949j;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13734v;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13742z;
import kotlin.p557z.C13745z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: DeserializedMemberScope.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.d0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC12849h extends AbstractC12781i {

    /* renamed from: f */
    static final /* synthetic */ InterfaceC11872i<Object>[] f28794f = {C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC12849h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC12849h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b */
    private final C12893l f28795b;

    /* renamed from: c */
    private final InterfaceC12850a f28796c;

    /* renamed from: d */
    private final InterfaceC12948i f28797d;

    /* renamed from: e */
    private final InterfaceC12949j f28798e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC12850a {
        /* renamed from: a */
        Collection<InterfaceC13543t0> mo6585a(C12614f c12614f, InterfaceC12112b interfaceC12112b);

        /* renamed from: b */
        Set<C12614f> mo6584b();

        /* renamed from: c */
        Collection<InterfaceC13518o0> mo6583c(C12614f c12614f, InterfaceC12112b interfaceC12112b);

        /* renamed from: d */
        Set<C12614f> mo6582d();

        /* renamed from: e */
        Set<C12614f> mo6581e();

        /* renamed from: f */
        void mo6580f(Collection<InterfaceC13513m> collection, C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l, InterfaceC12112b interfaceC12112b);

        /* renamed from: g */
        InterfaceC13559y0 mo6579g(C12614f c12614f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b */
    /* loaded from: classes3.dex */
    public final class C12851b implements InterfaceC12850a {

        /* renamed from: o */
        static final /* synthetic */ InterfaceC11872i<Object>[] f28799o = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "allProperties", "getAllProperties()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12851b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final List<C12531i> f28800a;

        /* renamed from: b */
        private final List<C12542n> f28801b;

        /* renamed from: c */
        private final List<C12562r> f28802c;

        /* renamed from: d */
        private final InterfaceC12948i f28803d;

        /* renamed from: e */
        private final InterfaceC12948i f28804e;

        /* renamed from: f */
        private final InterfaceC12948i f28805f;

        /* renamed from: g */
        private final InterfaceC12948i f28806g;

        /* renamed from: h */
        private final InterfaceC12948i f28807h;

        /* renamed from: i */
        private final InterfaceC12948i f28808i;

        /* renamed from: j */
        private final InterfaceC12948i f28809j;

        /* renamed from: k */
        private final InterfaceC12948i f28810k;

        /* renamed from: l */
        private final InterfaceC12948i f28811l;

        /* renamed from: m */
        private final InterfaceC12948i f28812m;

        /* renamed from: n */
        final /* synthetic */ AbstractC12849h f28813n;

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$a */
        /* loaded from: classes3.dex */
        static final class C12852a extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13543t0>> {
            C12852a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<InterfaceC13543t0> invoke() {
                List<InterfaceC13543t0> m3784n0;
                m3784n0 = C13742z.m3784n0(C12851b.this.m6616D(), C12851b.this.m6599t());
                return m3784n0;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$b */
        /* loaded from: classes3.dex */
        static final class C12853b extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13518o0>> {
            C12853b() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<InterfaceC13518o0> invoke() {
                List<InterfaceC13518o0> m3784n0;
                m3784n0 = C13742z.m3784n0(C12851b.this.m6615E(), C12851b.this.m6598u());
                return m3784n0;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$c */
        /* loaded from: classes3.dex */
        static final class C12854c extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13559y0>> {
            C12854c() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<InterfaceC13559y0> invoke() {
                return C12851b.this.m6593z();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$d */
        /* loaded from: classes3.dex */
        static final class C12855d extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13543t0>> {
            C12855d() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<InterfaceC13543t0> invoke() {
                return C12851b.this.m6597v();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$e */
        /* loaded from: classes3.dex */
        static final class C12856e extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13518o0>> {
            C12856e() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<InterfaceC13518o0> invoke() {
                return C12851b.this.m6594y();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$f */
        /* loaded from: classes3.dex */
        static final class C12857f extends AbstractC11802m implements InterfaceC11756a<Set<? extends C12614f>> {

            /* renamed from: d */
            final /* synthetic */ AbstractC12849h f28820d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12857f(AbstractC12849h abstractC12849h) {
                super(0);
                this.f28820d = abstractC12849h;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Set<C12614f> invoke() {
                Set<C12614f> m3769h;
                C12851b c12851b = C12851b.this;
                List<InterfaceC13601o> list = c12851b.f28800a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC12849h abstractC12849h = c12851b.f28813n;
                for (InterfaceC13601o interfaceC13601o : list) {
                    linkedHashSet.add(C12914v.m6430b(abstractC12849h.f28795b.m6470g(), ((C12531i) interfaceC13601o).m8163W()));
                }
                m3769h = C13745z0.m3769h(linkedHashSet, this.f28820d.mo6557u());
                return m3769h;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$g */
        /* loaded from: classes3.dex */
        static final class C12858g extends AbstractC11802m implements InterfaceC11756a<Map<C12614f, ? extends List<? extends InterfaceC13543t0>>> {
            C12858g() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public final Map<C12614f, ? extends List<? extends InterfaceC13543t0>> invoke() {
                List m6619A = C12851b.this.m6619A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : m6619A) {
                    C12614f mo5012b = ((InterfaceC13543t0) obj).mo5012b();
                    l.e(mo5012b, "it.name");
                    Object obj2 = linkedHashMap.get(mo5012b);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(mo5012b, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$h */
        /* loaded from: classes3.dex */
        static final class C12859h extends AbstractC11802m implements InterfaceC11756a<Map<C12614f, ? extends List<? extends InterfaceC13518o0>>> {
            C12859h() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public final Map<C12614f, ? extends List<? extends InterfaceC13518o0>> invoke() {
                List m6618B = C12851b.this.m6618B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : m6618B) {
                    C12614f mo5012b = ((InterfaceC13518o0) obj).mo5012b();
                    l.e(mo5012b, "it.name");
                    Object obj2 = linkedHashMap.get(mo5012b);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(mo5012b, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$i */
        /* loaded from: classes3.dex */
        static final class C12860i extends AbstractC11802m implements InterfaceC11756a<Map<C12614f, ? extends InterfaceC13559y0>> {
            C12860i() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public final Map<C12614f, ? extends InterfaceC13559y0> invoke() {
                int m3867o;
                int m3898f;
                int m10271a;
                List m6617C = C12851b.this.m6617C();
                m3867o = C13728s.m3867o(m6617C, 10);
                m3898f = C13725q0.m3898f(m3867o);
                m10271a = C11841h.m10271a(m3898f, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m10271a);
                for (Object obj : m6617C) {
                    C12614f mo5012b = ((InterfaceC13559y0) obj).mo5012b();
                    l.e(mo5012b, "it.name");
                    linkedHashMap.put(mo5012b, obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$b$j */
        /* loaded from: classes3.dex */
        static final class C12861j extends AbstractC11802m implements InterfaceC11756a<Set<? extends C12614f>> {

            /* renamed from: d */
            final /* synthetic */ AbstractC12849h f28825d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12861j(AbstractC12849h abstractC12849h) {
                super(0);
                this.f28825d = abstractC12849h;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Set<C12614f> invoke() {
                Set<C12614f> m3769h;
                C12851b c12851b = C12851b.this;
                List<InterfaceC13601o> list = c12851b.f28801b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC12849h abstractC12849h = c12851b.f28813n;
                for (InterfaceC13601o interfaceC13601o : list) {
                    linkedHashSet.add(C12914v.m6430b(abstractC12849h.f28795b.m6470g(), ((C12542n) interfaceC13601o).m7981U()));
                }
                m3769h = C13745z0.m3769h(linkedHashSet, this.f28825d.mo6556v());
                return m3769h;
            }
        }

        public C12851b(AbstractC12849h abstractC12849h, List<C12531i> list, List<C12542n> list2, List<C12562r> list3) {
            l.f(abstractC12849h, "this$0");
            l.f(list, "functionList");
            l.f(list2, "propertyList");
            l.f(list3, "typeAliasList");
            this.f28813n = abstractC12849h;
            this.f28800a = list;
            this.f28801b = list2;
            this.f28802c = this.f28813n.m6624q().m6474c().m6505g().mo6485f() ? list3 : C13726r.m3891e();
            this.f28803d = this.f28813n.m6624q().m6469h().mo6367d(new C12855d());
            this.f28804e = this.f28813n.m6624q().m6469h().mo6367d(new C12856e());
            this.f28805f = this.f28813n.m6624q().m6469h().mo6367d(new C12854c());
            this.f28806g = this.f28813n.m6624q().m6469h().mo6367d(new C12852a());
            this.f28807h = this.f28813n.m6624q().m6469h().mo6367d(new C12853b());
            this.f28808i = this.f28813n.m6624q().m6469h().mo6367d(new C12860i());
            this.f28809j = this.f28813n.m6624q().m6469h().mo6367d(new C12858g());
            this.f28810k = this.f28813n.m6624q().m6469h().mo6367d(new C12859h());
            this.f28811l = this.f28813n.m6624q().m6469h().mo6367d(new C12857f(this.f28813n));
            this.f28812m = this.f28813n.m6624q().m6469h().mo6367d(new C12861j(this.f28813n));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public final List<InterfaceC13543t0> m6619A() {
            return (List) C12953m.m6372a(this.f28806g, this, f28799o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final List<InterfaceC13518o0> m6618B() {
            return (List) C12953m.m6372a(this.f28807h, this, f28799o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final List<InterfaceC13559y0> m6617C() {
            return (List) C12953m.m6372a(this.f28805f, this, f28799o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final List<InterfaceC13543t0> m6616D() {
            return (List) C12953m.m6372a(this.f28803d, this, f28799o[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final List<InterfaceC13518o0> m6615E() {
            return (List) C12953m.m6372a(this.f28804e, this, f28799o[1]);
        }

        /* renamed from: F */
        private final Map<C12614f, Collection<InterfaceC13543t0>> m6614F() {
            return (Map) C12953m.m6372a(this.f28809j, this, f28799o[6]);
        }

        /* renamed from: G */
        private final Map<C12614f, Collection<InterfaceC13518o0>> m6613G() {
            return (Map) C12953m.m6372a(this.f28810k, this, f28799o[7]);
        }

        /* renamed from: H */
        private final Map<C12614f, InterfaceC13559y0> m6612H() {
            return (Map) C12953m.m6372a(this.f28808i, this, f28799o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public final List<InterfaceC13543t0> m6599t() {
            Set<C12614f> mo6557u = this.f28813n.mo6557u();
            ArrayList arrayList = new ArrayList();
            for (C12614f c12614f : mo6557u) {
                C13736w.m3850v(arrayList, m6596w(c12614f));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public final List<InterfaceC13518o0> m6598u() {
            Set<C12614f> mo6556v = this.f28813n.mo6556v();
            ArrayList arrayList = new ArrayList();
            for (C12614f c12614f : mo6556v) {
                C13736w.m3850v(arrayList, m6595x(c12614f));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public final List<InterfaceC13543t0> m6597v() {
            List<C12531i> list = this.f28800a;
            AbstractC12849h abstractC12849h = this.f28813n;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC13601o interfaceC13601o : list) {
                InterfaceC13543t0 m6442n = abstractC12849h.f28795b.m6471f().m6442n((C12531i) interfaceC13601o);
                if (!abstractC12849h.mo6620y(m6442n)) {
                    m6442n = null;
                }
                if (m6442n != null) {
                    arrayList.add(m6442n);
                }
            }
            return arrayList;
        }

        /* renamed from: w */
        private final List<InterfaceC13543t0> m6596w(C12614f c12614f) {
            List<InterfaceC13543t0> m6616D = m6616D();
            AbstractC12849h abstractC12849h = this.f28813n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : m6616D) {
                if (l.b(((InterfaceC13513m) obj).mo5012b(), c12614f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC12849h.mo6628l(c12614f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: x */
        private final List<InterfaceC13518o0> m6595x(C12614f c12614f) {
            List<InterfaceC13518o0> m6615E = m6615E();
            AbstractC12849h abstractC12849h = this.f28813n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : m6615E) {
                if (l.b(((InterfaceC13513m) obj).mo5012b(), c12614f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC12849h.mo6627m(c12614f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public final List<InterfaceC13518o0> m6594y() {
            List<C12542n> list = this.f28801b;
            AbstractC12849h abstractC12849h = this.f28813n;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC13601o interfaceC13601o : list) {
                InterfaceC13518o0 m6440p = abstractC12849h.f28795b.m6471f().m6440p((C12542n) interfaceC13601o);
                if (m6440p != null) {
                    arrayList.add(m6440p);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public final List<InterfaceC13559y0> m6593z() {
            List<C12562r> list = this.f28802c;
            AbstractC12849h abstractC12849h = this.f28813n;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC13601o interfaceC13601o : list) {
                InterfaceC13559y0 m6439q = abstractC12849h.f28795b.m6471f().m6439q((C12562r) interfaceC13601o);
                if (m6439q != null) {
                    arrayList.add(m6439q);
                }
            }
            return arrayList;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: a */
        public Collection<InterfaceC13543t0> mo6585a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
            List m3891e;
            List m3891e2;
            l.f(c12614f, "name");
            l.f(interfaceC12112b, "location");
            if (!mo6584b().contains(c12614f)) {
                m3891e2 = C13726r.m3891e();
                return m3891e2;
            }
            Collection<InterfaceC13543t0> collection = m6614F().get(c12614f);
            if (collection != null) {
                return collection;
            }
            m3891e = C13726r.m3891e();
            return m3891e;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: b */
        public Set<C12614f> mo6584b() {
            return (Set) C12953m.m6372a(this.f28811l, this, f28799o[8]);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: c */
        public Collection<InterfaceC13518o0> mo6583c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
            List m3891e;
            List m3891e2;
            l.f(c12614f, "name");
            l.f(interfaceC12112b, "location");
            if (!mo6582d().contains(c12614f)) {
                m3891e2 = C13726r.m3891e();
                return m3891e2;
            }
            Collection<InterfaceC13518o0> collection = m6613G().get(c12614f);
            if (collection != null) {
                return collection;
            }
            m3891e = C13726r.m3891e();
            return m3891e;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: d */
        public Set<C12614f> mo6582d() {
            return (Set) C12953m.m6372a(this.f28812m, this, f28799o[9]);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: e */
        public Set<C12614f> mo6581e() {
            List<C12562r> list = this.f28802c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC12849h abstractC12849h = this.f28813n;
            for (InterfaceC13601o interfaceC13601o : list) {
                linkedHashSet.add(C12914v.m6430b(abstractC12849h.f28795b.m6470g(), ((C12562r) interfaceC13601o).m7701X()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: f */
        public void mo6580f(Collection<InterfaceC13513m> collection, C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l, InterfaceC12112b interfaceC12112b) {
            l.f(collection, "result");
            l.f(c12768d, "kindFilter");
            l.f(interfaceC11767l, "nameFilter");
            l.f(interfaceC12112b, "location");
            if (c12768d.m6811a(C12768d.f28635c.m6789i())) {
                for (Object obj : m6618B()) {
                    C12614f mo5012b = ((InterfaceC13518o0) obj).mo5012b();
                    l.e(mo5012b, "it.name");
                    if (interfaceC11767l.invoke(mo5012b).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (c12768d.m6811a(C12768d.f28635c.m6794d())) {
                for (Object obj2 : m6619A()) {
                    C12614f mo5012b2 = ((InterfaceC13543t0) obj2).mo5012b();
                    l.e(mo5012b2, "it.name");
                    if (interfaceC11767l.invoke(mo5012b2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: g */
        public InterfaceC13559y0 mo6579g(C12614f c12614f) {
            l.f(c12614f, "name");
            return m6612H().get(c12614f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$c */
    /* loaded from: classes3.dex */
    public final class C12862c implements InterfaceC12850a {

        /* renamed from: j */
        static final /* synthetic */ InterfaceC11872i<Object>[] f28826j = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12862c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C12862c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final Map<C12614f, byte[]> f28827a;

        /* renamed from: b */
        private final Map<C12614f, byte[]> f28828b;

        /* renamed from: c */
        private final Map<C12614f, byte[]> f28829c;

        /* renamed from: d */
        private final InterfaceC12946g<C12614f, Collection<InterfaceC13543t0>> f28830d;

        /* renamed from: e */
        private final InterfaceC12946g<C12614f, Collection<InterfaceC13518o0>> f28831e;

        /* renamed from: f */
        private final InterfaceC12947h<C12614f, InterfaceC13559y0> f28832f;

        /* renamed from: g */
        private final InterfaceC12948i f28833g;

        /* renamed from: h */
        private final InterfaceC12948i f28834h;

        /* renamed from: i */
        final /* synthetic */ AbstractC12849h f28835i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$c$a */
        /* loaded from: classes3.dex */
        public static final class C12863a extends AbstractC11802m implements InterfaceC11756a<M> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13604q<M> f28836c;

            /* renamed from: d */
            final /* synthetic */ ByteArrayInputStream f28837d;

            /* renamed from: e */
            final /* synthetic */ AbstractC12849h f28838e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12863a(InterfaceC13604q<M> interfaceC13604q, ByteArrayInputStream byteArrayInputStream, AbstractC12849h abstractC12849h) {
                super(0);
                this.f28836c = interfaceC13604q;
                this.f28837d = byteArrayInputStream;
                this.f28838e = abstractC12849h;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TM; */
            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC13601o invoke() {
                return (InterfaceC13601o) this.f28836c.mo4376c(this.f28837d, this.f28838e.m6624q().m6474c().m6502j());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$c$b */
        /* loaded from: classes3.dex */
        static final class C12864b extends AbstractC11802m implements InterfaceC11756a<Set<? extends C12614f>> {

            /* renamed from: d */
            final /* synthetic */ AbstractC12849h f28840d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12864b(AbstractC12849h abstractC12849h) {
                super(0);
                this.f28840d = abstractC12849h;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Set<C12614f> invoke() {
                Set<C12614f> m3769h;
                m3769h = C13745z0.m3769h(C12862c.this.f28827a.keySet(), this.f28840d.mo6557u());
                return m3769h;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$c$c */
        /* loaded from: classes3.dex */
        static final class C12865c extends AbstractC11802m implements InterfaceC11767l<C12614f, Collection<? extends InterfaceC13543t0>> {
            C12865c() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final Collection<InterfaceC13543t0> invoke(C12614f c12614f) {
                l.f(c12614f, "it");
                return C12862c.this.m6573m(c12614f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$c$d */
        /* loaded from: classes3.dex */
        static final class C12866d extends AbstractC11802m implements InterfaceC11767l<C12614f, Collection<? extends InterfaceC13518o0>> {
            C12866d() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final Collection<InterfaceC13518o0> invoke(C12614f c12614f) {
                l.f(c12614f, "it");
                return C12862c.this.m6572n(c12614f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$c$e */
        /* loaded from: classes3.dex */
        static final class C12867e extends AbstractC11802m implements InterfaceC11767l<C12614f, InterfaceC13559y0> {
            C12867e() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final InterfaceC13559y0 invoke(C12614f c12614f) {
                l.f(c12614f, "it");
                return C12862c.this.m6571o(c12614f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$c$f */
        /* loaded from: classes3.dex */
        static final class C12868f extends AbstractC11802m implements InterfaceC11756a<Set<? extends C12614f>> {

            /* renamed from: d */
            final /* synthetic */ AbstractC12849h f28845d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12868f(AbstractC12849h abstractC12849h) {
                super(0);
                this.f28845d = abstractC12849h;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Set<C12614f> invoke() {
                Set<C12614f> m3769h;
                m3769h = C13745z0.m3769h(C12862c.this.f28828b.keySet(), this.f28845d.mo6556v());
                return m3769h;
            }
        }

        public C12862c(AbstractC12849h abstractC12849h, List<C12531i> list, List<C12542n> list2, List<C12562r> list3) {
            Map<C12614f, byte[]> m3881k;
            l.f(abstractC12849h, "this$0");
            l.f(list, "functionList");
            l.f(list2, "propertyList");
            l.f(list3, "typeAliasList");
            this.f28835i = abstractC12849h;
            AbstractC12849h abstractC12849h2 = this.f28835i;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                C12614f m6430b = C12914v.m6430b(abstractC12849h2.f28795b.m6470g(), ((C12531i) ((InterfaceC13601o) obj)).m8163W());
                Object obj2 = linkedHashMap.get(m6430b);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(m6430b, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f28827a = m6570p(linkedHashMap);
            AbstractC12849h abstractC12849h3 = this.f28835i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                C12614f m6430b2 = C12914v.m6430b(abstractC12849h3.f28795b.m6470g(), ((C12542n) ((InterfaceC13601o) obj3)).m7981U());
                Object obj4 = linkedHashMap2.get(m6430b2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(m6430b2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f28828b = m6570p(linkedHashMap2);
            if (this.f28835i.m6624q().m6474c().m6505g().mo6485f()) {
                AbstractC12849h abstractC12849h4 = this.f28835i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list3) {
                    C12614f m6430b3 = C12914v.m6430b(abstractC12849h4.f28795b.m6470g(), ((C12562r) ((InterfaceC13601o) obj5)).m7701X());
                    Object obj6 = linkedHashMap3.get(m6430b3);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(m6430b3, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                m3881k = m6570p(linkedHashMap3);
            } else {
                m3881k = C13727r0.m3881k();
            }
            this.f28829c = m3881k;
            this.f28830d = this.f28835i.m6624q().m6469h().mo6363h(new C12865c());
            this.f28831e = this.f28835i.m6624q().m6469h().mo6363h(new C12866d());
            this.f28832f = this.f28835i.m6624q().m6469h().mo6362i(new C12867e());
            this.f28833g = this.f28835i.m6624q().m6469h().mo6367d(new C12864b(this.f28835i));
            this.f28834h = this.f28835i.m6624q().m6469h().mo6367d(new C12868f(this.f28835i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final Collection<InterfaceC13543t0> m6573m(C12614f c12614f) {
            InterfaceC13230h m5582g;
            List<C12531i> m5563x;
            Map<C12614f, byte[]> map = this.f28827a;
            InterfaceC13604q<C12531i> interfaceC13604q = C12531i.f27966K;
            l.e(interfaceC13604q, "PARSER");
            AbstractC12849h abstractC12849h = this.f28835i;
            byte[] bArr = map.get(c12614f);
            if (bArr == null) {
                m5563x = null;
            } else {
                m5582g = C13234l.m5582g(new C12863a(interfaceC13604q, new ByteArrayInputStream(bArr), this.f28835i));
                m5563x = C13242n.m5563x(m5582g);
            }
            if (m5563x == null) {
                m5563x = C13726r.m3891e();
            }
            ArrayList arrayList = new ArrayList(m5563x.size());
            for (C12531i c12531i : m5563x) {
                C12907u m6471f = abstractC12849h.m6624q().m6471f();
                l.e(c12531i, "it");
                InterfaceC13543t0 m6442n = m6471f.m6442n(c12531i);
                if (!abstractC12849h.mo6620y(m6442n)) {
                    m6442n = null;
                }
                if (m6442n != null) {
                    arrayList.add(m6442n);
                }
            }
            abstractC12849h.mo6628l(c12614f, arrayList);
            return C13634a.m4285c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final Collection<InterfaceC13518o0> m6572n(C12614f c12614f) {
            InterfaceC13230h m5582g;
            List<C12542n> m5563x;
            Map<C12614f, byte[]> map = this.f28828b;
            InterfaceC13604q<C12542n> interfaceC13604q = C12542n.f28041K;
            l.e(interfaceC13604q, "PARSER");
            AbstractC12849h abstractC12849h = this.f28835i;
            byte[] bArr = map.get(c12614f);
            if (bArr == null) {
                m5563x = null;
            } else {
                m5582g = C13234l.m5582g(new C12863a(interfaceC13604q, new ByteArrayInputStream(bArr), this.f28835i));
                m5563x = C13242n.m5563x(m5582g);
            }
            if (m5563x == null) {
                m5563x = C13726r.m3891e();
            }
            ArrayList arrayList = new ArrayList(m5563x.size());
            for (C12542n c12542n : m5563x) {
                C12907u m6471f = abstractC12849h.m6624q().m6471f();
                l.e(c12542n, "it");
                InterfaceC13518o0 m6440p = m6471f.m6440p(c12542n);
                if (m6440p != null) {
                    arrayList.add(m6440p);
                }
            }
            abstractC12849h.mo6627m(c12614f, arrayList);
            return C13634a.m4285c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final InterfaceC13559y0 m6571o(C12614f c12614f) {
            C12562r m7684o0;
            byte[] bArr = this.f28829c.get(c12614f);
            if (bArr == null || (m7684o0 = C12562r.m7684o0(new ByteArrayInputStream(bArr), this.f28835i.m6624q().m6474c().m6502j())) == null) {
                return null;
            }
            return this.f28835i.m6624q().m6471f().m6439q(m7684o0);
        }

        /* renamed from: p */
        private final Map<C12614f, byte[]> m6570p(Map<C12614f, ? extends Collection<? extends AbstractC13563a>> map) {
            int m3898f;
            int m3867o;
            m3898f = C13725q0.m3898f(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(m3898f);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<AbstractC13563a> iterable = (Iterable) entry.getValue();
                m3867o = C13728s.m3867o(iterable, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                for (AbstractC13563a abstractC13563a : iterable) {
                    abstractC13563a.m4554i(byteArrayOutputStream);
                    arrayList.add(C13666w.f30112a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: a */
        public Collection<InterfaceC13543t0> mo6585a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
            List m3891e;
            l.f(c12614f, "name");
            l.f(interfaceC12112b, "location");
            if (mo6584b().contains(c12614f)) {
                return this.f28830d.invoke(c12614f);
            }
            m3891e = C13726r.m3891e();
            return m3891e;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: b */
        public Set<C12614f> mo6584b() {
            return (Set) C12953m.m6372a(this.f28833g, this, f28826j[0]);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: c */
        public Collection<InterfaceC13518o0> mo6583c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
            List m3891e;
            l.f(c12614f, "name");
            l.f(interfaceC12112b, "location");
            if (mo6582d().contains(c12614f)) {
                return this.f28831e.invoke(c12614f);
            }
            m3891e = C13726r.m3891e();
            return m3891e;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: d */
        public Set<C12614f> mo6582d() {
            return (Set) C12953m.m6372a(this.f28834h, this, f28826j[1]);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: e */
        public Set<C12614f> mo6581e() {
            return this.f28829c.keySet();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: f */
        public void mo6580f(Collection<InterfaceC13513m> collection, C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l, InterfaceC12112b interfaceC12112b) {
            l.f(collection, "result");
            l.f(c12768d, "kindFilter");
            l.f(interfaceC11767l, "nameFilter");
            l.f(interfaceC12112b, "location");
            if (c12768d.m6811a(C12768d.f28635c.m6789i())) {
                Set<C12614f> mo6582d = mo6582d();
                ArrayList arrayList = new ArrayList();
                for (C12614f c12614f : mo6582d) {
                    if (interfaceC11767l.invoke(c12614f).booleanValue()) {
                        arrayList.addAll(mo6583c(c12614f, interfaceC12112b));
                    }
                }
                C12678g c12678g = C12678g.f28537c;
                l.e(c12678g, "INSTANCE");
                C13734v.m3854u(arrayList, c12678g);
                collection.addAll(arrayList);
            }
            if (c12768d.m6811a(C12768d.f28635c.m6794d())) {
                Set<C12614f> mo6584b = mo6584b();
                ArrayList arrayList2 = new ArrayList();
                for (C12614f c12614f2 : mo6584b) {
                    if (interfaceC11767l.invoke(c12614f2).booleanValue()) {
                        arrayList2.addAll(mo6585a(c12614f2, interfaceC12112b));
                    }
                }
                C12678g c12678g2 = C12678g.f28537c;
                l.e(c12678g2, "INSTANCE");
                C13734v.m3854u(arrayList2, c12678g2);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h.InterfaceC12850a
        /* renamed from: g */
        public InterfaceC13559y0 mo6579g(C12614f c12614f) {
            l.f(c12614f, "name");
            return this.f28832f.invoke(c12614f);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$d */
    /* loaded from: classes3.dex */
    static final class C12869d extends AbstractC11802m implements InterfaceC11756a<Set<? extends C12614f>> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11756a<Collection<C12614f>> f28846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12869d(InterfaceC11756a<? extends Collection<C12614f>> interfaceC11756a) {
            super(0);
            this.f28846c = interfaceC11756a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Set<C12614f> invoke() {
            Set<C12614f> m3821F0;
            m3821F0 = C13742z.m3821F0(this.f28846c.invoke());
            return m3821F0;
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.d0.h$e */
    /* loaded from: classes3.dex */
    static final class C12870e extends AbstractC11802m implements InterfaceC11756a<Set<? extends C12614f>> {
        C12870e() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Set<C12614f> invoke() {
            Set m3769h;
            Set<C12614f> m3769h2;
            Set<C12614f> mo6558t = AbstractC12849h.this.mo6558t();
            if (mo6558t == null) {
                return null;
            }
            m3769h = C13745z0.m3769h(AbstractC12849h.this.m6623r(), AbstractC12849h.this.f28796c.mo6581e());
            m3769h2 = C13745z0.m3769h(m3769h, mo6558t);
            return m3769h2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12849h(C12893l c12893l, List<C12531i> list, List<C12542n> list2, List<C12562r> list3, InterfaceC11756a<? extends Collection<C12614f>> interfaceC11756a) {
        l.f(c12893l, "c");
        l.f(list, "functionList");
        l.f(list2, "propertyList");
        l.f(list3, "typeAliasList");
        l.f(interfaceC11756a, "classNames");
        this.f28795b = c12893l;
        this.f28796c = m6626o(list, list2, list3);
        this.f28797d = this.f28795b.m6469h().mo6367d(new C12869d(interfaceC11756a));
        this.f28798e = this.f28795b.m6469h().mo6365f(new C12870e());
    }

    /* renamed from: o */
    private final InterfaceC12850a m6626o(List<C12531i> list, List<C12542n> list2, List<C12562r> list3) {
        if (this.f28795b.m6474c().m6505g().mo6490a()) {
            return new C12851b(this, list, list2, list3);
        }
        return new C12862c(this, list, list2, list3);
    }

    /* renamed from: p */
    private final InterfaceC13312e m6625p(C12614f c12614f) {
        return this.f28795b.m6474c().m6510b(mo6559n(c12614f));
    }

    /* renamed from: s */
    private final Set<C12614f> m6622s() {
        return (Set) C12953m.m6371b(this.f28798e, this, f28794f[1]);
    }

    /* renamed from: w */
    private final InterfaceC13559y0 m6621w(C12614f c12614f) {
        return this.f28796c.mo6579g(c12614f);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return this.f28796c.mo6585a(c12614f, interfaceC12112b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: b */
    public Set<C12614f> mo5116b() {
        return this.f28796c.mo6584b();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return this.f28796c.mo6583c(c12614f, interfaceC12112b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: d */
    public Set<C12614f> mo5114d() {
        return this.f28796c.mo6582d();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        return m6622s();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        if (mo6555x(c12614f)) {
            return m6625p(c12614f);
        }
        if (this.f28796c.mo6581e().contains(c12614f)) {
            return m6621w(c12614f);
        }
        return null;
    }

    /* renamed from: j */
    protected abstract void mo6560j(Collection<InterfaceC13513m> collection, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final Collection<InterfaceC13513m> m6629k(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l, InterfaceC12112b interfaceC12112b) {
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        l.f(interfaceC12112b, "location");
        ArrayList arrayList = new ArrayList(0);
        if (c12768d.m6811a(C12768d.f28635c.m6791g())) {
            mo6560j(arrayList, interfaceC11767l);
        }
        this.f28796c.mo6580f(arrayList, c12768d, interfaceC11767l, interfaceC12112b);
        if (c12768d.m6811a(C12768d.f28635c.m6795c())) {
            for (C12614f c12614f : m6623r()) {
                if (interfaceC11767l.invoke(c12614f).booleanValue()) {
                    C13634a.m4287a(arrayList, m6625p(c12614f));
                }
            }
        }
        if (c12768d.m6811a(C12768d.f28635c.m6790h())) {
            for (C12614f c12614f2 : this.f28796c.mo6581e()) {
                if (interfaceC11767l.invoke(c12614f2).booleanValue()) {
                    C13634a.m4287a(arrayList, this.f28796c.mo6579g(c12614f2));
                }
            }
        }
        return C13634a.m4285c(arrayList);
    }

    /* renamed from: l */
    protected void mo6628l(C12614f c12614f, List<InterfaceC13543t0> list) {
        l.f(c12614f, "name");
        l.f(list, "functions");
    }

    /* renamed from: m */
    protected void mo6627m(C12614f c12614f, List<InterfaceC13518o0> list) {
        l.f(c12614f, "name");
        l.f(list, "descriptors");
    }

    /* renamed from: n */
    protected abstract C12608b mo6559n(C12614f c12614f);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final C12893l m6624q() {
        return this.f28795b;
    }

    /* renamed from: r */
    public final Set<C12614f> m6623r() {
        return (Set) C12953m.m6372a(this.f28797d, this, f28794f[0]);
    }

    /* renamed from: t */
    protected abstract Set<C12614f> mo6558t();

    /* renamed from: u */
    protected abstract Set<C12614f> mo6557u();

    /* renamed from: v */
    protected abstract Set<C12614f> mo6556v();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo6555x(C12614f c12614f) {
        l.f(c12614f, "name");
        return m6623r().contains(c12614f);
    }

    /* renamed from: y */
    protected boolean mo6620y(InterfaceC13543t0 interfaceC13543t0) {
        l.f(interfaceC13543t0, "function");
        return true;
    }
}
