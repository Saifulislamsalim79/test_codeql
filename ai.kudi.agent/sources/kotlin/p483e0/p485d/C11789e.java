package kotlin.p483e0.p485d;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.InterfaceC11746d;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.C11755b;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11757b;
import kotlin.p483e0.p484c.InterfaceC11758c;
import kotlin.p483e0.p484c.InterfaceC11759d;
import kotlin.p483e0.p484c.InterfaceC11760e;
import kotlin.p483e0.p484c.InterfaceC11761f;
import kotlin.p483e0.p484c.InterfaceC11762g;
import kotlin.p483e0.p484c.InterfaceC11763h;
import kotlin.p483e0.p484c.InterfaceC11764i;
import kotlin.p483e0.p484c.InterfaceC11765j;
import kotlin.p483e0.p484c.InterfaceC11766k;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11768m;
import kotlin.p483e0.p484c.InterfaceC11769n;
import kotlin.p483e0.p484c.InterfaceC11770o;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlin.p483e0.p484c.InterfaceC11774s;
import kotlin.p483e0.p484c.InterfaceC11775t;
import kotlin.p483e0.p484c.InterfaceC11776u;
import kotlin.p483e0.p484c.InterfaceC11777v;
import kotlin.p483e0.p484c.InterfaceC11778w;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
/* compiled from: ClassReference.kt */
/* renamed from: kotlin.e0.d.e */
/* loaded from: classes3.dex */
public final class C11789e implements InterfaceC11863b<Object>, InterfaceC11786d {

    /* renamed from: d */
    private static final Map<Class<? extends InterfaceC11746d<?>>, Integer> f26486d;

    /* renamed from: e */
    private static final HashMap<String, String> f26487e;

    /* renamed from: f */
    private static final HashMap<String, String> f26488f;

    /* renamed from: w */
    private static final HashMap<String, String> f26489w;

    /* renamed from: x */
    private static final Map<String, String> f26490x;

    /* renamed from: y */
    public static final C11790a f26491y = new C11790a(null);

    /* renamed from: c */
    private final Class<?> f26492c;

    /* compiled from: ClassReference.kt */
    /* renamed from: kotlin.e0.d.e$a */
    /* loaded from: classes3.dex */
    public static final class C11790a {
        private C11790a() {
        }

        /* renamed from: a */
        public final String m10326a(Class<?> cls) {
            String str;
            l.f(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) C11789e.f26489w.get(cls.getName());
                return str3 != null ? str3 : cls.getCanonicalName();
            }
            Class<?> componentType = cls.getComponentType();
            l.e(componentType, "componentType");
            if (componentType.isPrimitive() && (str = (String) C11789e.f26489w.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 != null ? str2 : "kotlin.Array";
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
            if (r1 != null) goto L12;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String m10325b(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.e0.d.l.f(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                java.lang.String r1 = "Array"
                r2 = 0
                if (r0 == 0) goto L11
            Le:
                r1 = r2
                goto Lc1
            L11:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L73
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r1 = r8.getEnclosingMethod()
                java.lang.String r3 = "$"
                r4 = 2
                java.lang.String r5 = "name"
                if (r1 == 0) goto L43
                kotlin.e0.d.l.e(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = r1.getName()
                r6.append(r1)
                r6.append(r3)
                java.lang.String r1 = r6.toString()
                java.lang.String r1 = kotlin.p549l0.C13265j.m5509C0(r0, r1, r2, r4, r2)
                if (r1 == 0) goto L43
                goto L66
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L65
                kotlin.e0.d.l.e(r0, r5)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = r8.getName()
                r1.append(r8)
                r1.append(r3)
                java.lang.String r8 = r1.toString()
                java.lang.String r8 = kotlin.p549l0.C13265j.m5509C0(r0, r8, r2, r4, r2)
                r1 = r8
                goto L66
            L65:
                r1 = r2
            L66:
                if (r1 == 0) goto L69
                goto Lc1
            L69:
                kotlin.e0.d.l.e(r0, r5)
                r8 = 36
                java.lang.String r1 = kotlin.p549l0.C13265j.m5511B0(r0, r8, r2, r4, r2)
                goto Lc1
            L73:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto Lab
                java.lang.Class r8 = r8.getComponentType()
                java.lang.String r0 = "componentType"
                kotlin.e0.d.l.e(r8, r0)
                boolean r0 = r8.isPrimitive()
                if (r0 == 0) goto La7
                java.util.Map r0 = kotlin.p483e0.p485d.C11789e.m10328d()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto La7
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r1)
                java.lang.String r2 = r0.toString()
            La7:
                if (r2 == 0) goto Lc1
                goto Le
            Lab:
                java.util.Map r0 = kotlin.p483e0.p485d.C11789e.m10328d()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto Lbd
                goto Lc1
            Lbd:
                java.lang.String r1 = r8.getSimpleName()
            Lc1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p483e0.p485d.C11789e.C11790a.m10325b(java.lang.Class):java.lang.String");
        }

        public /* synthetic */ C11790a(g gVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List m3888h;
        int m3867o;
        Map<Class<? extends InterfaceC11746d<?>>, Integer> m3872t;
        int m3898f;
        String m5430E0;
        String m5430E02;
        int i = 0;
        m3888h = C13726r.m3888h(InterfaceC11756a.class, InterfaceC11767l.class, InterfaceC11771p.class, InterfaceC11772q.class, InterfaceC11773r.class, InterfaceC11774s.class, InterfaceC11775t.class, InterfaceC11776u.class, InterfaceC11777v.class, InterfaceC11778w.class, InterfaceC11757b.class, InterfaceC11758c.class, InterfaceC11759d.class, InterfaceC11760e.class, InterfaceC11761f.class, InterfaceC11762g.class, InterfaceC11763h.class, InterfaceC11764i.class, InterfaceC11765j.class, InterfaceC11766k.class, InterfaceC11768m.class, InterfaceC11769n.class, InterfaceC11770o.class);
        m3867o = C13728s.m3867o(m3888h, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (Object obj : m3888h) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(C13664u.m4227a((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                C13722p.m3923n();
                throw null;
            }
        }
        m3872t = C13727r0.m3872t(arrayList);
        f26486d = m3872t;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(AttributeType.BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(AttributeType.FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f26487e = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f26488f = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f26487e);
        hashMap3.putAll(f26488f);
        Collection<String> values = f26487e.values();
        l.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.e(str, "kotlinName");
            m5430E02 = C13277t.m5430E0(str, '.', null, 2, null);
            sb.append(m5430E02);
            sb.append("CompanionObject");
            C13287o m4227a = C13664u.m4227a(sb.toString(), str + ".Companion");
            hashMap3.put(m4227a.m5364c(), m4227a.m5363d());
        }
        for (Map.Entry<Class<? extends InterfaceC11746d<?>>, Integer> entry : f26486d.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f26489w = hashMap3;
        m3898f = C13725q0.m3898f(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3898f);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m5430E0 = C13277t.m5430E0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m5430E0);
        }
        f26490x = linkedHashMap;
    }

    public C11789e(Class<?> cls) {
        l.f(cls, "jClass");
        this.f26492c = cls;
    }

    /* renamed from: i */
    private final Void m10327i() {
        throw new C11755b();
    }

    @Override // kotlin.p483e0.p485d.InterfaceC11786d
    /* renamed from: a */
    public Class<?> mo9979a() {
        return this.f26492c;
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: e */
    public boolean mo10141e() {
        m10327i();
        throw null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11789e) && l.b(C11754a.m10363c(this), C11754a.m10363c((InterfaceC11863b) obj));
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: f */
    public String mo10140f() {
        return f26491y.m10326a(mo9979a());
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: g */
    public String mo10139g() {
        return f26491y.m10325b(mo9979a());
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: h */
    public boolean mo10138h() {
        m10327i();
        throw null;
    }

    public int hashCode() {
        return C11754a.m10363c(this).hashCode();
    }

    public String toString() {
        return mo9979a().toString() + " (Kotlin reflection is not available)";
    }
}
