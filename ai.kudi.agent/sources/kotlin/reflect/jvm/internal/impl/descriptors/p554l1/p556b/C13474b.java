package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
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
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
/* compiled from: reflectClassUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.b */
/* loaded from: classes3.dex */
public final class C13474b {

    /* renamed from: a */
    private static final List<InterfaceC11863b<? extends Object>> f29831a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f29832b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f29833c;

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.b$a */
    /* loaded from: classes3.dex */
    static final class C13475a extends AbstractC11802m implements InterfaceC11767l<ParameterizedType, ParameterizedType> {

        /* renamed from: c */
        public static final C13475a f29834c = new C13475a();

        C13475a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            l.f(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.b$b */
    /* loaded from: classes3.dex */
    static final class C13476b extends AbstractC11802m implements InterfaceC11767l<ParameterizedType, InterfaceC13230h<? extends Type>> {

        /* renamed from: c */
        public static final C13476b f29835c = new C13476b();

        C13476b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13230h<Type> invoke(ParameterizedType parameterizedType) {
            InterfaceC13230h<Type> m4008q;
            l.f(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            l.e(actualTypeArguments, "it.actualTypeArguments");
            m4008q = C13715n.m4008q(actualTypeArguments);
            return m4008q;
        }
    }

    static {
        List<InterfaceC11863b<? extends Object>> m3888h;
        int m3867o;
        Map<Class<? extends Object>, Class<? extends Object>> m3872t;
        int m3867o2;
        Map<Class<? extends Object>, Class<? extends Object>> m3872t2;
        List m3888h2;
        int m3867o3;
        int i = 0;
        m3888h = C13726r.m3888h(C11813x.m10316b(Boolean.TYPE), C11813x.m10316b(Byte.TYPE), C11813x.m10316b(Character.TYPE), C11813x.m10316b(Double.TYPE), C11813x.m10316b(Float.TYPE), C11813x.m10316b(Integer.TYPE), C11813x.m10316b(Long.TYPE), C11813x.m10316b(Short.TYPE));
        f29831a = m3888h;
        m3867o = C13728s.m3867o(m3888h, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        Iterator<T> it = m3888h.iterator();
        while (it.hasNext()) {
            InterfaceC11863b interfaceC11863b = (InterfaceC11863b) it.next();
            arrayList.add(C13664u.m4227a(C11754a.m10363c(interfaceC11863b), C11754a.m10362d(interfaceC11863b)));
        }
        m3872t = C13727r0.m3872t(arrayList);
        f29832b = m3872t;
        List<InterfaceC11863b<? extends Object>> list = f29831a;
        m3867o2 = C13728s.m3867o(list, 10);
        ArrayList arrayList2 = new ArrayList(m3867o2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC11863b interfaceC11863b2 = (InterfaceC11863b) it2.next();
            arrayList2.add(C13664u.m4227a(C11754a.m10362d(interfaceC11863b2), C11754a.m10363c(interfaceC11863b2)));
        }
        m3872t2 = C13727r0.m3872t(arrayList2);
        f29833c = m3872t2;
        m3888h2 = C13726r.m3888h(InterfaceC11756a.class, InterfaceC11767l.class, InterfaceC11771p.class, InterfaceC11772q.class, InterfaceC11773r.class, InterfaceC11774s.class, InterfaceC11775t.class, InterfaceC11776u.class, InterfaceC11777v.class, InterfaceC11778w.class, InterfaceC11757b.class, InterfaceC11758c.class, InterfaceC11759d.class, InterfaceC11760e.class, InterfaceC11761f.class, InterfaceC11762g.class, InterfaceC11763h.class, InterfaceC11764i.class, InterfaceC11765j.class, InterfaceC11766k.class, InterfaceC11768m.class, InterfaceC11769n.class, InterfaceC11770o.class);
        m3867o3 = C13728s.m3867o(m3888h2, 10);
        ArrayList arrayList3 = new ArrayList(m3867o3);
        for (Object obj : m3888h2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(C13664u.m4227a((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                C13722p.m3923n();
                throw null;
            }
        }
        C13727r0.m3872t(arrayList3);
    }

    /* renamed from: a */
    public static final C12608b m4893a(Class<?> cls) {
        l.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                    String simpleName = cls.getSimpleName();
                    l.e(simpleName, "simpleName");
                    if (!(simpleName.length() == 0)) {
                        Class<?> declaringClass = cls.getDeclaringClass();
                        C12608b m7393d = declaringClass == null ? null : m4893a(declaringClass).m7393d(C12614f.m7349i(cls.getSimpleName()));
                        if (m7393d == null) {
                            m7393d = C12608b.m7384m(new C12609c(cls.getName()));
                        }
                        l.e(m7393d, "declaringClass?.classId?.createNestedClassId(Name.identifier(simpleName)) ?: ClassId.topLevel(FqName(name))");
                        return m7393d;
                    }
                }
                C12609c c12609c = new C12609c(cls.getName());
                return new C12608b(c12609c.m7379e(), C12609c.m7373k(c12609c.m7377g()), true);
            }
            throw new IllegalArgumentException(l.m("Can't compute ClassId for array type: ", cls));
        }
        throw new IllegalArgumentException(l.m("Can't compute ClassId for primitive type: ", cls));
    }

    /* renamed from: b */
    public static final String m4892b(Class<?> cls) {
        String m5435z;
        String m5435z2;
        l.f(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            return "D";
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            return "I";
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            return "B";
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            return "C";
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            return "J";
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            return "V";
                        }
                        break;
                    case 64711720:
                        if (name.equals(AttributeType.BOOLEAN)) {
                            return "Z";
                        }
                        break;
                    case 97526364:
                        if (name.equals(AttributeType.FLOAT)) {
                            return "F";
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            return "S";
                        }
                        break;
                }
            }
            throw new IllegalArgumentException(l.m("Unsupported primitive type: ", cls));
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            l.e(name2, "name");
            m5435z2 = C13276s.m5435z(name2, '.', '/', false, 4, null);
            return m5435z2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name3 = cls.getName();
            l.e(name3, "name");
            m5435z = C13276s.m5435z(name3, '.', '/', false, 4, null);
            sb.append(m5435z);
            sb.append(';');
            return sb.toString();
        }
    }

    /* renamed from: c */
    public static final List<Type> m4891c(Type type) {
        InterfaceC13230h m5583f;
        InterfaceC13230h m5570q;
        List<Type> m5563x;
        List<Type> m4025Z;
        List<Type> m3891e;
        l.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            l.e(actualTypeArguments, "actualTypeArguments");
            m4025Z = C13715n.m4025Z(actualTypeArguments);
            return m4025Z;
        }
        m5583f = C13234l.m5583f(type, C13475a.f29834c);
        m5570q = C13242n.m5570q(m5583f, C13476b.f29835c);
        m5563x = C13242n.m5563x(m5570q);
        return m5563x;
    }

    /* renamed from: d */
    public static final Class<?> m4890d(Class<?> cls) {
        l.f(cls, "<this>");
        return f29832b.get(cls);
    }

    /* renamed from: e */
    public static final ClassLoader m4889e(Class<?> cls) {
        l.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            l.e(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }

    /* renamed from: f */
    public static final Class<?> m4888f(Class<?> cls) {
        l.f(cls, "<this>");
        return f29833c.get(cls);
    }

    /* renamed from: g */
    public static final boolean m4887g(Class<?> cls) {
        l.f(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
