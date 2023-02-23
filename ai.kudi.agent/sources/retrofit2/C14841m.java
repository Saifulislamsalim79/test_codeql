package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p565l.AbstractC14120b0;
import p565l.AbstractC14135d0;
import p565l.C14231t;
import p565l.C14239x;
import p565l.InterfaceC14138e;
import retrofit2.C14784a;
import retrofit2.C14844n;
import retrofit2.InterfaceC14802c;
import retrofit2.InterfaceC14805e;
/* compiled from: Retrofit.java */
/* renamed from: retrofit2.m */
/* loaded from: classes3.dex */
public final class C14841m {

    /* renamed from: a */
    private final Map<Method, C14844n<?, ?>> f33149a = new ConcurrentHashMap();

    /* renamed from: b */
    final InterfaceC14138e.InterfaceC14139a f33150b;

    /* renamed from: c */
    final C14231t f33151c;

    /* renamed from: d */
    final List<InterfaceC14805e.AbstractC14806a> f33152d;

    /* renamed from: e */
    final List<InterfaceC14802c.AbstractC14803a> f33153e;

    /* renamed from: f */
    final boolean f33154f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Retrofit.java */
    /* renamed from: retrofit2.m$a */
    /* loaded from: classes3.dex */
    public class C14842a implements InvocationHandler {

        /* renamed from: a */
        private final C14834j f33155a = C14834j.m299d();

        /* renamed from: b */
        final /* synthetic */ Class f33156b;

        C14842a(Class cls) {
            this.f33156b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f33155a.mo295f(method)) {
                return this.f33155a.mo296e(method, this.f33156b, obj, objArr);
            }
            C14844n<?, ?> m272f = C14841m.this.m272f(method);
            return m272f.m258a(new C14815h(m272f, objArr));
        }
    }

    C14841m(InterfaceC14138e.InterfaceC14139a interfaceC14139a, C14231t c14231t, List<InterfaceC14805e.AbstractC14806a> list, List<InterfaceC14802c.AbstractC14803a> list2, Executor executor, boolean z) {
        this.f33150b = interfaceC14139a;
        this.f33151c = c14231t;
        this.f33152d = list;
        this.f33153e = list2;
        this.f33154f = z;
    }

    /* renamed from: e */
    private void m273e(Class<?> cls) {
        Method[] declaredMethods;
        C14834j m299d = C14834j.m299d();
        for (Method method : cls.getDeclaredMethods()) {
            if (!m299d.mo295f(method)) {
                m272f(method);
            }
        }
    }

    /* renamed from: a */
    public C14231t m277a() {
        return this.f33151c;
    }

    /* renamed from: b */
    public InterfaceC14802c<?, ?> m276b(Type type, Annotation[] annotationArr) {
        return m271g(null, type, annotationArr);
    }

    /* renamed from: c */
    public InterfaceC14138e.InterfaceC14139a m275c() {
        return this.f33150b;
    }

    /* renamed from: d */
    public <T> T m274d(Class<T> cls) {
        C14846o.m223r(cls);
        if (this.f33154f) {
            m273e(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C14842a(cls));
    }

    /* renamed from: f */
    C14844n<?, ?> m272f(Method method) {
        C14844n c14844n;
        C14844n<?, ?> c14844n2 = this.f33149a.get(method);
        if (c14844n2 != null) {
            return c14844n2;
        }
        synchronized (this.f33149a) {
            c14844n = this.f33149a.get(method);
            if (c14844n == null) {
                c14844n = new C14844n.C14845a(this, method).m253a();
                this.f33149a.put(method, c14844n);
            }
        }
        return c14844n;
    }

    /* renamed from: g */
    public InterfaceC14802c<?, ?> m271g(InterfaceC14802c.AbstractC14803a abstractC14803a, Type type, Annotation[] annotationArr) {
        C14846o.m239b(type, "returnType == null");
        C14846o.m239b(annotationArr, "annotations == null");
        int indexOf = this.f33153e.indexOf(abstractC14803a) + 1;
        int size = this.f33153e.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC14802c<?, ?> mo325a = this.f33153e.get(i).mo325a(type, annotationArr, this);
            if (mo325a != null) {
                return mo325a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC14803a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f33153e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f33153e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f33153e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> InterfaceC14805e<T, AbstractC14120b0> m270h(InterfaceC14805e.AbstractC14806a abstractC14806a, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C14846o.m239b(type, "type == null");
        C14846o.m239b(annotationArr, "parameterAnnotations == null");
        C14846o.m239b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f33152d.indexOf(abstractC14806a) + 1;
        int size = this.f33152d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC14805e<T, AbstractC14120b0> interfaceC14805e = (InterfaceC14805e<T, AbstractC14120b0>) this.f33152d.get(i).mo222a(type, annotationArr, annotationArr2, this);
            if (interfaceC14805e != null) {
                return interfaceC14805e;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC14806a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f33152d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f33152d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f33152d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    public <T> InterfaceC14805e<AbstractC14135d0, T> m269i(InterfaceC14805e.AbstractC14806a abstractC14806a, Type type, Annotation[] annotationArr) {
        C14846o.m239b(type, "type == null");
        C14846o.m239b(annotationArr, "annotations == null");
        int indexOf = this.f33152d.indexOf(abstractC14806a) + 1;
        int size = this.f33152d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC14805e<AbstractC14135d0, T> interfaceC14805e = (InterfaceC14805e<AbstractC14135d0, T>) this.f33152d.get(i).mo221b(type, annotationArr, this);
            if (interfaceC14805e != null) {
                return interfaceC14805e;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC14806a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f33152d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f33152d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f33152d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: j */
    public <T> InterfaceC14805e<T, AbstractC14120b0> m268j(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m270h(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: k */
    public <T> InterfaceC14805e<AbstractC14135d0, T> m267k(Type type, Annotation[] annotationArr) {
        return m269i(null, type, annotationArr);
    }

    /* renamed from: l */
    public <T> InterfaceC14805e<T, String> m266l(Type type, Annotation[] annotationArr) {
        C14846o.m239b(type, "type == null");
        C14846o.m239b(annotationArr, "annotations == null");
        int size = this.f33152d.size();
        for (int i = 0; i < size; i++) {
            InterfaceC14805e<T, String> interfaceC14805e = (InterfaceC14805e<T, String>) this.f33152d.get(i).m327c(type, annotationArr, this);
            if (interfaceC14805e != null) {
                return interfaceC14805e;
            }
        }
        return C14784a.C14788d.f33054a;
    }

    /* compiled from: Retrofit.java */
    /* renamed from: retrofit2.m$b */
    /* loaded from: classes3.dex */
    public static final class C14843b {

        /* renamed from: a */
        private final C14834j f33158a;

        /* renamed from: b */
        private InterfaceC14138e.InterfaceC14139a f33159b;

        /* renamed from: c */
        private C14231t f33160c;

        /* renamed from: d */
        private final List<InterfaceC14805e.AbstractC14806a> f33161d;

        /* renamed from: e */
        private final List<InterfaceC14802c.AbstractC14803a> f33162e;

        /* renamed from: f */
        private Executor f33163f;

        /* renamed from: g */
        private boolean f33164g;

        C14843b(C14834j c14834j) {
            this.f33161d = new ArrayList();
            this.f33162e = new ArrayList();
            this.f33158a = c14834j;
        }

        /* renamed from: a */
        public C14843b m265a(InterfaceC14802c.AbstractC14803a abstractC14803a) {
            List<InterfaceC14802c.AbstractC14803a> list = this.f33162e;
            C14846o.m239b(abstractC14803a, "factory == null");
            list.add(abstractC14803a);
            return this;
        }

        /* renamed from: b */
        public C14843b m264b(InterfaceC14805e.AbstractC14806a abstractC14806a) {
            List<InterfaceC14805e.AbstractC14806a> list = this.f33161d;
            C14846o.m239b(abstractC14806a, "factory == null");
            list.add(abstractC14806a);
            return this;
        }

        /* renamed from: c */
        public C14843b m263c(String str) {
            C14846o.m239b(str, "baseUrl == null");
            C14231t m2511r = C14231t.m2511r(str);
            if (m2511r != null) {
                m262d(m2511r);
                return this;
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        /* renamed from: d */
        public C14843b m262d(C14231t c14231t) {
            C14846o.m239b(c14231t, "baseUrl == null");
            List<String> m2510s = c14231t.m2510s();
            if ("".equals(m2510s.get(m2510s.size() - 1))) {
                this.f33160c = c14231t;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c14231t);
        }

        /* renamed from: e */
        public C14841m m261e() {
            if (this.f33160c != null) {
                InterfaceC14138e.InterfaceC14139a interfaceC14139a = this.f33159b;
                if (interfaceC14139a == null) {
                    interfaceC14139a = new C14239x();
                }
                InterfaceC14138e.InterfaceC14139a interfaceC14139a2 = interfaceC14139a;
                Executor executor = this.f33163f;
                if (executor == null) {
                    executor = this.f33158a.mo297b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f33162e);
                arrayList.add(this.f33158a.mo298a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f33161d.size() + 1);
                arrayList2.add(new C14784a());
                arrayList2.addAll(this.f33161d);
                return new C14841m(interfaceC14139a2, this.f33160c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f33164g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: f */
        public C14843b m260f(InterfaceC14138e.InterfaceC14139a interfaceC14139a) {
            C14846o.m239b(interfaceC14139a, "factory == null");
            this.f33159b = interfaceC14139a;
            return this;
        }

        /* renamed from: g */
        public C14843b m259g(C14239x c14239x) {
            C14846o.m239b(c14239x, "client == null");
            m260f(c14239x);
            return this;
        }

        public C14843b() {
            this(C14834j.m299d());
        }
    }
}
