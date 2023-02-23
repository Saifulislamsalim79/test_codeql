package com.google.gson;

import com.google.gson.internal.C6858c;
import com.google.gson.internal.C6886j;
import com.google.gson.internal.C6887k;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.C6852a;
import com.google.gson.internal.bind.C6854b;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: Gson.java */
/* renamed from: com.google.gson.f */
/* loaded from: classes2.dex */
public final class C6784f {

    /* renamed from: k */
    private static final C6916a<?> f16317k = C6916a.get(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C6916a<?>, C6790f<?>>> f16318a;

    /* renamed from: b */
    private final Map<C6916a<?>, AbstractC6909s<?>> f16319b;

    /* renamed from: c */
    private final C6858c f16320c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f16321d;

    /* renamed from: e */
    final List<InterfaceC6915t> f16322e;

    /* renamed from: f */
    final boolean f16323f;

    /* renamed from: g */
    final boolean f16324g;

    /* renamed from: h */
    final boolean f16325h;

    /* renamed from: i */
    final boolean f16326i;

    /* renamed from: j */
    final boolean f16327j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$a */
    /* loaded from: classes2.dex */
    public class C6785a extends AbstractC6909s<Number> {
        C6785a(C6784f c6784f) {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Double mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return Double.valueOf(c6911a.mo20501g0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            if (number == null) {
                c6914c.mo20474f0();
                return;
            }
            C6784f.m20768d(number.doubleValue());
            c6914c.mo20488E0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$b */
    /* loaded from: classes2.dex */
    public class C6786b extends AbstractC6909s<Number> {
        C6786b(C6784f c6784f) {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Float mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return Float.valueOf((float) c6911a.mo20501g0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            if (number == null) {
                c6914c.mo20474f0();
                return;
            }
            C6784f.m20768d(number.floatValue());
            c6914c.mo20488E0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$c */
    /* loaded from: classes2.dex */
    public class C6787c extends AbstractC6909s<Number> {
        C6787c() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return Long.valueOf(c6911a.mo20499k0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            if (number == null) {
                c6914c.mo20474f0();
            } else {
                c6914c.mo20486F0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$d */
    /* loaded from: classes2.dex */
    public class C6788d extends AbstractC6909s<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ AbstractC6909s f16328a;

        C6788d(AbstractC6909s abstractC6909s) {
            this.f16328a = abstractC6909s;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public AtomicLong mo20528b(C6911a c6911a) throws IOException {
            return new AtomicLong(((Number) this.f16328a.mo20528b(c6911a)).longValue());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, AtomicLong atomicLong) throws IOException {
            this.f16328a.mo20527d(c6914c, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$e */
    /* loaded from: classes2.dex */
    public class C6789e extends AbstractC6909s<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ AbstractC6909s f16329a;

        C6789e(AbstractC6909s abstractC6909s) {
            this.f16329a = abstractC6909s;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public AtomicLongArray mo20528b(C6911a c6911a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c6911a.mo20504c();
            while (c6911a.mo20509V()) {
                arrayList.add(Long.valueOf(((Number) this.f16329a.mo20528b(c6911a)).longValue()));
            }
            c6911a.mo20518J();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, AtomicLongArray atomicLongArray) throws IOException {
            c6914c.mo20469m();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f16329a.mo20527d(c6914c, Long.valueOf(atomicLongArray.get(i)));
            }
            c6914c.mo20483J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$f */
    /* loaded from: classes2.dex */
    public static class C6790f<T> extends AbstractC6909s<T> {

        /* renamed from: a */
        private AbstractC6909s<T> f16330a;

        C6790f() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: b */
        public T mo20528b(C6911a c6911a) throws IOException {
            AbstractC6909s<T> abstractC6909s = this.f16330a;
            if (abstractC6909s != null) {
                return abstractC6909s.mo20528b(c6911a);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: d */
        public void mo20527d(C6914c c6914c, T t) throws IOException {
            AbstractC6909s<T> abstractC6909s = this.f16330a;
            if (abstractC6909s != null) {
                abstractC6909s.mo20527d(c6914c, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void m20735e(AbstractC6909s<T> abstractC6909s) {
            if (this.f16330a == null) {
                this.f16330a = abstractC6909s;
                return;
            }
            throw new AssertionError();
        }
    }

    public C6784f() {
        this(Excluder.f16348y, EnumC6776d.f16310c, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC6906r.f16554c, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m20771a(Object obj, C6911a c6911a) {
        if (obj != null) {
            try {
                if (c6911a.mo20525C0() == EnumC6913b.END_DOCUMENT) {
                    return;
                }
                throw new JsonIOException("JSON document was not fully consumed.");
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    /* renamed from: b */
    private static AbstractC6909s<AtomicLong> m20770b(AbstractC6909s<Number> abstractC6909s) {
        return new C6788d(abstractC6909s).m20530a();
    }

    /* renamed from: c */
    private static AbstractC6909s<AtomicLongArray> m20769c(AbstractC6909s<Number> abstractC6909s) {
        return new C6789e(abstractC6909s).m20530a();
    }

    /* renamed from: d */
    static void m20768d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private AbstractC6909s<Number> m20767e(boolean z) {
        if (z) {
            return TypeAdapters.f16465v;
        }
        return new C6785a(this);
    }

    /* renamed from: f */
    private AbstractC6909s<Number> m20766f(boolean z) {
        if (z) {
            return TypeAdapters.f16464u;
        }
        return new C6786b(this);
    }

    /* renamed from: q */
    private static AbstractC6909s<Number> m20755q(EnumC6906r enumC6906r) {
        if (enumC6906r == EnumC6906r.f16554c) {
            return TypeAdapters.f16463t;
        }
        return new C6787c();
    }

    /* renamed from: A */
    public AbstractC6900l m20773A(Object obj) {
        if (obj == null) {
            return C6901m.f16551a;
        }
        return m20772B(obj, obj.getClass());
    }

    /* renamed from: B */
    public AbstractC6900l m20772B(Object obj, Type type) {
        C6854b c6854b = new C6854b();
        m20747y(obj, type, c6854b);
        return c6854b.m20601K0();
    }

    /* renamed from: g */
    public <T> T m20765g(AbstractC6900l abstractC6900l, Class<T> cls) throws JsonSyntaxException {
        return (T) C6886j.m20563b(cls).cast(m20764h(abstractC6900l, cls));
    }

    /* renamed from: h */
    public <T> T m20764h(AbstractC6900l abstractC6900l, Type type) throws JsonSyntaxException {
        if (abstractC6900l == null) {
            return null;
        }
        return (T) m20763i(new C6852a(abstractC6900l), type);
    }

    /* renamed from: i */
    public <T> T m20763i(C6911a c6911a, Type type) throws JsonIOException, JsonSyntaxException {
        boolean m20508X = c6911a.m20508X();
        boolean z = true;
        c6911a.m20517J0(true);
        try {
            try {
                try {
                    c6911a.mo20525C0();
                    z = false;
                    T mo20528b = m20758n(C6916a.get(type)).mo20528b(c6911a);
                    c6911a.m20517J0(m20508X);
                    return mo20528b;
                } catch (AssertionError e) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e.getMessage());
                    assertionError.initCause(e);
                    throw assertionError;
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (EOFException e3) {
                if (z) {
                    c6911a.m20517J0(m20508X);
                    return null;
                }
                throw new JsonSyntaxException(e3);
            } catch (IOException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (Throwable th) {
            c6911a.m20517J0(m20508X);
            throw th;
        }
    }

    /* renamed from: j */
    public <T> T m20762j(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        C6911a m20754r = m20754r(reader);
        Object m20763i = m20763i(m20754r, cls);
        m20771a(m20763i, m20754r);
        return (T) C6886j.m20563b(cls).cast(m20763i);
    }

    /* renamed from: k */
    public <T> T m20761k(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C6911a m20754r = m20754r(reader);
        T t = (T) m20763i(m20754r, type);
        m20771a(t, m20754r);
        return t;
    }

    /* renamed from: l */
    public <T> T m20760l(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) C6886j.m20563b(cls).cast(m20759m(str, cls));
    }

    /* renamed from: m */
    public <T> T m20759m(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) m20761k(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public <T> AbstractC6909s<T> m20758n(C6916a<T> c6916a) {
        AbstractC6909s<T> abstractC6909s = (AbstractC6909s<T>) this.f16319b.get(c6916a == null ? f16317k : c6916a);
        if (abstractC6909s != null) {
            return abstractC6909s;
        }
        Map<C6916a<?>, C6790f<?>> map = this.f16318a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f16318a.set(map);
            z = true;
        }
        C6790f<?> c6790f = map.get(c6916a);
        if (c6790f != null) {
            return c6790f;
        }
        try {
            C6790f<?> c6790f2 = new C6790f<>();
            map.put(c6916a, c6790f2);
            for (InterfaceC6915t interfaceC6915t : this.f16322e) {
                AbstractC6909s abstractC6909s2 = (AbstractC6909s<T>) interfaceC6915t.mo20463a(this, c6916a);
                if (abstractC6909s2 != null) {
                    c6790f2.m20735e(abstractC6909s2);
                    this.f16319b.put(c6916a, abstractC6909s2);
                    return abstractC6909s2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + c6916a);
        } finally {
            map.remove(c6916a);
            if (z) {
                this.f16318a.remove();
            }
        }
    }

    /* renamed from: o */
    public <T> AbstractC6909s<T> m20757o(Class<T> cls) {
        return m20758n(C6916a.get((Class) cls));
    }

    /* renamed from: p */
    public <T> AbstractC6909s<T> m20756p(InterfaceC6915t interfaceC6915t, C6916a<T> c6916a) {
        if (!this.f16322e.contains(interfaceC6915t)) {
            interfaceC6915t = this.f16321d;
        }
        boolean z = false;
        for (InterfaceC6915t interfaceC6915t2 : this.f16322e) {
            if (z) {
                AbstractC6909s<T> mo20463a = interfaceC6915t2.mo20463a(this, c6916a);
                if (mo20463a != null) {
                    return mo20463a;
                }
            } else if (interfaceC6915t2 == interfaceC6915t) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c6916a);
    }

    /* renamed from: r */
    public C6911a m20754r(Reader reader) {
        C6911a c6911a = new C6911a(reader);
        c6911a.m20517J0(this.f16327j);
        return c6911a;
    }

    /* renamed from: s */
    public C6914c m20753s(Writer writer) throws IOException {
        if (this.f16324g) {
            writer.write(")]}'\n");
        }
        C6914c c6914c = new C6914c(writer);
        if (this.f16326i) {
            c6914c.m20466w0("  ");
        }
        c6914c.m20464z0(this.f16323f);
        return c6914c;
    }

    /* renamed from: t */
    public String m20752t(AbstractC6900l abstractC6900l) {
        StringWriter stringWriter = new StringWriter();
        m20748x(abstractC6900l, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f16323f + ",factories:" + this.f16322e + ",instanceCreators:" + this.f16320c + "}";
    }

    /* renamed from: u */
    public String m20751u(Object obj) {
        if (obj == null) {
            return m20752t(C6901m.f16551a);
        }
        return m20750v(obj, obj.getClass());
    }

    /* renamed from: v */
    public String m20750v(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m20746z(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: w */
    public void m20749w(AbstractC6900l abstractC6900l, C6914c c6914c) throws JsonIOException {
        boolean m20478X = c6914c.m20478X();
        c6914c.m20465x0(true);
        boolean m20479V = c6914c.m20479V();
        c6914c.m20467u0(this.f16325h);
        boolean m20480P = c6914c.m20480P();
        c6914c.m20464z0(this.f16323f);
        try {
            try {
                C6887k.m20561b(abstractC6900l, c6914c);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            c6914c.m20465x0(m20478X);
            c6914c.m20467u0(m20479V);
            c6914c.m20464z0(m20480P);
        }
    }

    /* renamed from: x */
    public void m20748x(AbstractC6900l abstractC6900l, Appendable appendable) throws JsonIOException {
        try {
            m20749w(abstractC6900l, m20753s(C6887k.m20560c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: y */
    public void m20747y(Object obj, Type type, C6914c c6914c) throws JsonIOException {
        AbstractC6909s m20758n = m20758n(C6916a.get(type));
        boolean m20478X = c6914c.m20478X();
        c6914c.m20465x0(true);
        boolean m20479V = c6914c.m20479V();
        c6914c.m20467u0(this.f16325h);
        boolean m20480P = c6914c.m20480P();
        c6914c.m20464z0(this.f16323f);
        try {
            try {
                m20758n.mo20527d(c6914c, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            c6914c.m20465x0(m20478X);
            c6914c.m20467u0(m20479V);
            c6914c.m20464z0(m20480P);
        }
    }

    /* renamed from: z */
    public void m20746z(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            m20747y(obj, type, m20753s(C6887k.m20560c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6784f(Excluder excluder, InterfaceC6783e interfaceC6783e, Map<Type, InterfaceC6792h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC6906r enumC6906r, String str, int i, int i2, List<InterfaceC6915t> list, List<InterfaceC6915t> list2, List<InterfaceC6915t> list3) {
        this.f16318a = new ThreadLocal<>();
        this.f16319b = new ConcurrentHashMap();
        this.f16320c = new C6858c(map);
        this.f16323f = z;
        this.f16324g = z3;
        this.f16325h = z4;
        this.f16326i = z5;
        this.f16327j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f16442Y);
        arrayList.add(ObjectTypeAdapter.f16383b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f16421D);
        arrayList.add(TypeAdapters.f16456m);
        arrayList.add(TypeAdapters.f16450g);
        arrayList.add(TypeAdapters.f16452i);
        arrayList.add(TypeAdapters.f16454k);
        AbstractC6909s<Number> m20755q = m20755q(enumC6906r);
        arrayList.add(TypeAdapters.m20670b(Long.TYPE, Long.class, m20755q));
        arrayList.add(TypeAdapters.m20670b(Double.TYPE, Double.class, m20767e(z7)));
        arrayList.add(TypeAdapters.m20670b(Float.TYPE, Float.class, m20766f(z7)));
        arrayList.add(TypeAdapters.f16467x);
        arrayList.add(TypeAdapters.f16458o);
        arrayList.add(TypeAdapters.f16460q);
        arrayList.add(TypeAdapters.m20671a(AtomicLong.class, m20770b(m20755q)));
        arrayList.add(TypeAdapters.m20671a(AtomicLongArray.class, m20769c(m20755q)));
        arrayList.add(TypeAdapters.f16462s);
        arrayList.add(TypeAdapters.f16469z);
        arrayList.add(TypeAdapters.f16423F);
        arrayList.add(TypeAdapters.f16425H);
        arrayList.add(TypeAdapters.m20671a(BigDecimal.class, TypeAdapters.f16419B));
        arrayList.add(TypeAdapters.m20671a(BigInteger.class, TypeAdapters.f16420C));
        arrayList.add(TypeAdapters.f16427J);
        arrayList.add(TypeAdapters.f16429L);
        arrayList.add(TypeAdapters.f16433P);
        arrayList.add(TypeAdapters.f16435R);
        arrayList.add(TypeAdapters.f16440W);
        arrayList.add(TypeAdapters.f16431N);
        arrayList.add(TypeAdapters.f16447d);
        arrayList.add(DateTypeAdapter.f16374b);
        arrayList.add(TypeAdapters.f16438U);
        arrayList.add(TimeTypeAdapter.f16404b);
        arrayList.add(SqlDateTypeAdapter.f16402b);
        arrayList.add(TypeAdapters.f16436S);
        arrayList.add(ArrayTypeAdapter.f16368c);
        arrayList.add(TypeAdapters.f16445b);
        arrayList.add(new CollectionTypeAdapterFactory(this.f16320c));
        arrayList.add(new MapTypeAdapterFactory(this.f16320c, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.f16320c);
        this.f16321d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f16443Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.f16320c, interfaceC6783e, excluder, this.f16321d));
        this.f16322e = Collections.unmodifiableList(arrayList);
    }
}
