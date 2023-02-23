package kotlin.p493j0.p494o.p495c.p496o0;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.C11899d0;
import kotlin.p557z.C13706j;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: AnnotationConstructorCaller.kt */
/* renamed from: kotlin.j0.o.c.o0.b */
/* loaded from: classes3.dex */
public final class C11983b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: kotlin.j0.o.c.o0.b$a */
    /* loaded from: classes3.dex */
    public static final class C11984a extends AbstractC11802m implements InterfaceC11767l<Object, Boolean> {

        /* renamed from: c */
        final /* synthetic */ Class f26699c;

        /* renamed from: d */
        final /* synthetic */ List f26700d;

        /* renamed from: e */
        final /* synthetic */ Map f26701e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11984a(Class cls, List list, Map map) {
            super(1);
            this.f26699c = cls;
            this.f26700d = list;
            this.f26701e = map;
        }

        /* renamed from: a */
        public final boolean m10008a(Object obj) {
            boolean b;
            boolean z;
            InterfaceC11863b m10365a;
            Class cls = null;
            Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
            if (annotation != null && (m10365a = C11754a.m10365a(annotation)) != null) {
                cls = C11754a.m10364b(m10365a);
            }
            if (l.b(cls, this.f26699c)) {
                List<Method> list = this.f26700d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Method method : list) {
                        Object obj2 = this.f26701e.get(method.getName());
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (obj2 instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(zArr, (boolean[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.BooleanArray");
                            }
                        } else if (obj2 instanceof char[]) {
                            char[] cArr = (char[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(cArr, (char[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharArray");
                            }
                        } else if (obj2 instanceof byte[]) {
                            byte[] bArr = (byte[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(bArr, (byte[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        } else if (obj2 instanceof short[]) {
                            short[] sArr = (short[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(sArr, (short[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ShortArray");
                            }
                        } else if (obj2 instanceof int[]) {
                            int[] iArr = (int[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(iArr, (int[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                            }
                        } else if (obj2 instanceof float[]) {
                            float[] fArr = (float[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(fArr, (float[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                            }
                        } else if (obj2 instanceof long[]) {
                            long[] jArr = (long[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(jArr, (long[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.LongArray");
                            }
                        } else if (obj2 instanceof double[]) {
                            double[] dArr = (double[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(dArr, (double[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.DoubleArray");
                            }
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (invoke != null) {
                                b = Arrays.equals(objArr, (Object[]) invoke);
                                continue;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<*>");
                            }
                        } else {
                            b = l.b(obj2, invoke);
                            continue;
                        }
                        if (!b) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(m10008a(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: kotlin.j0.o.c.o0.b$b */
    /* loaded from: classes3.dex */
    public static final class C11985b extends AbstractC11802m implements InterfaceC11756a<Integer> {

        /* renamed from: c */
        final /* synthetic */ Map f26702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11985b(Map map) {
            super(0);
            this.f26702c = map;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final int invoke2() {
            int hashCode;
            int i = 0;
            for (Map.Entry entry : this.f26702c.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    hashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    hashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    hashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    hashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    hashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    hashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    hashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    hashCode = Arrays.hashCode((double[]) value);
                } else {
                    hashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                i += hashCode ^ (str.hashCode() * 127);
            }
            return i;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: kotlin.j0.o.c.o0.b$c */
    /* loaded from: classes3.dex */
    public static final class C11986c implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class f26703a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC11824h f26704b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC11872i f26705c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11824h f26706d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC11872i f26707e;

        /* renamed from: f */
        final /* synthetic */ C11984a f26708f;

        /* renamed from: g */
        final /* synthetic */ Map f26709g;

        C11986c(Class cls, InterfaceC11824h interfaceC11824h, InterfaceC11872i interfaceC11872i, InterfaceC11824h interfaceC11824h2, InterfaceC11872i interfaceC11872i2, C11984a c11984a, Map map) {
            this.f26703a = cls;
            this.f26704b = interfaceC11824h;
            this.f26705c = interfaceC11872i;
            this.f26706d = interfaceC11824h2;
            this.f26707e = interfaceC11872i2;
            this.f26708f = c11984a;
            this.f26709g = map;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            List m4025Z;
            l.e(method, "method");
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f26703a;
                        }
                    } else if (name.equals("hashCode")) {
                        return this.f26706d.getValue();
                    }
                } else if (name.equals("toString")) {
                    return this.f26704b.getValue();
                }
            }
            if (l.b(name, "equals") && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(this.f26708f.m10008a(C13706j.m4106N(objArr)));
            }
            if (this.f26709g.containsKey(name)) {
                return this.f26709g.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            m4025Z = C13715n.m4025Z(objArr);
            sb.append(m4025Z);
            sb.append(')');
            throw new C11899d0(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: kotlin.j0.o.c.o0.b$d */
    /* loaded from: classes3.dex */
    public static final class C11987d extends AbstractC11802m implements InterfaceC11756a<String> {

        /* renamed from: c */
        final /* synthetic */ Class f26710c;

        /* renamed from: d */
        final /* synthetic */ Map f26711d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnnotationConstructorCaller.kt */
        /* renamed from: kotlin.j0.o.c.o0.b$d$a */
        /* loaded from: classes3.dex */
        public static final class C11988a extends AbstractC11802m implements InterfaceC11767l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: c */
            public static final C11988a f26712c = new C11988a();

            C11988a() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String arrays;
                l.f(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    arrays = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    arrays = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    arrays = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    arrays = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    arrays = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    arrays = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    arrays = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    arrays = Arrays.toString((double[]) value);
                } else {
                    arrays = value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
                }
                return key + '=' + arrays;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11987d(Class cls, Map map) {
            super(0);
            this.f26710c = cls;
            this.f26711d = map;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(this.f26710c.getCanonicalName());
            C13742z.m3799Y(this.f26711d.entrySet(), sb, ", ", "(", ")", 0, null, C11988a.f26712c, 48, null);
            String sb2 = sb.toString();
            l.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Void m10014a(int i, String str, Class cls) {
        m10010e(i, str, cls);
        throw null;
    }

    /* renamed from: c */
    public static final <T> T m10012c(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        InterfaceC11824h m5625b;
        InterfaceC11824h m5625b2;
        l.f(cls, "annotationClass");
        l.f(map, "values");
        l.f(list, "methods");
        C11984a c11984a = new C11984a(cls, list, map);
        m5625b = C13218k.m5625b(new C11985b(map));
        m5625b2 = C13218k.m5625b(new C11987d(cls, map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C11986c(cls, m5625b2, null, m5625b, null, c11984a, map));
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    /* renamed from: d */
    public static /* synthetic */ Object m10011d(Class cls, Map map, List list, int i, Object obj) {
        int m3867o;
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            m3867o = C13728s.m3867o(keySet, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (String str : keySet) {
                arrayList.add(cls.getDeclaredMethod(str, new Class[0]));
            }
            list = arrayList;
        }
        return m10012c(cls, map, list);
    }

    /* renamed from: e */
    private static final Void m10010e(int i, String str, Class<?> cls) {
        InterfaceC11863b m10361e;
        String mo10140f;
        if (l.b(cls, Class.class)) {
            m10361e = C11813x.m10316b(InterfaceC11863b.class);
        } else if (cls.isArray() && l.b(cls.getComponentType(), Class.class)) {
            m10361e = C11813x.m10316b(InterfaceC11863b[].class);
        } else {
            m10361e = C11754a.m10361e(cls);
        }
        if (l.b(m10361e.mo10140f(), C11813x.m10316b(Object[].class).mo10140f())) {
            StringBuilder sb = new StringBuilder();
            sb.append(m10361e.mo10140f());
            sb.append('<');
            Class<?> componentType = C11754a.m10364b(m10361e).getComponentType();
            l.e(componentType, "kotlinClass.java.componentType");
            sb.append(C11754a.m10361e(componentType).mo10140f());
            sb.append('>');
            mo10140f = sb.toString();
        } else {
            mo10140f = m10361e.mo10140f();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + mo10140f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Object m10009f(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof InterfaceC11863b) {
            obj = C11754a.m10364b((InterfaceC11863b) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (!(objArr instanceof InterfaceC11863b[])) {
                obj = objArr;
            } else if (obj != null) {
                InterfaceC11863b[] interfaceC11863bArr = (InterfaceC11863b[]) obj;
                ArrayList arrayList = new ArrayList(interfaceC11863bArr.length);
                for (InterfaceC11863b interfaceC11863b : interfaceC11863bArr) {
                    arrayList.add(C11754a.m10364b(interfaceC11863b));
                }
                obj = arrayList.toArray(new Class[0]);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
