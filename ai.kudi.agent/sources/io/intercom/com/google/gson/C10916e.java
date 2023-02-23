package io.intercom.com.google.gson;

import io.intercom.com.google.gson.p418t.C10948c;
import io.intercom.com.google.gson.p418t.C10963d;
import io.intercom.com.google.gson.p418t.C10978k;
import io.intercom.com.google.gson.p418t.C10979l;
import io.intercom.com.google.gson.p418t.p419n.C10987a;
import io.intercom.com.google.gson.p418t.p419n.C10989b;
import io.intercom.com.google.gson.p418t.p419n.C10991c;
import io.intercom.com.google.gson.p418t.p419n.C10993d;
import io.intercom.com.google.gson.p418t.p419n.C10998g;
import io.intercom.com.google.gson.p418t.p419n.C11000h;
import io.intercom.com.google.gson.p418t.p419n.C11003i;
import io.intercom.com.google.gson.p418t.p419n.C11007j;
import io.intercom.com.google.gson.p418t.p419n.C11009k;
import io.intercom.com.google.gson.p418t.p419n.C11015n;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import io.intercom.com.google.gson.stream.MalformedJsonException;
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
/* renamed from: io.intercom.com.google.gson.e */
/* loaded from: classes3.dex */
public final class C10916e {

    /* renamed from: k */
    private static final C11058a<?> f24877k = C11058a.m11661a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C11058a<?>, C10922f<?>>> f24878a;

    /* renamed from: b */
    private final Map<C11058a<?>, AbstractC10936q<?>> f24879b;

    /* renamed from: c */
    private final C10948c f24880c;

    /* renamed from: d */
    private final C10993d f24881d;

    /* renamed from: e */
    final List<InterfaceC10938r> f24882e;

    /* renamed from: f */
    final boolean f24883f;

    /* renamed from: g */
    final boolean f24884g;

    /* renamed from: h */
    final boolean f24885h;

    /* renamed from: i */
    final boolean f24886i;

    /* renamed from: j */
    final boolean f24887j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: io.intercom.com.google.gson.e$a */
    /* loaded from: classes3.dex */
    public class C10917a extends AbstractC10936q<Number> {
        C10917a(C10916e c10916e) {
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: e */
        public Double mo11675b(C10939a c10939a) throws IOException {
            if (c10939a.mo11789C0() == EnumC10941b.NULL) {
                c10939a.mo11771w0();
                return null;
            }
            return Double.valueOf(c10939a.mo11775g0());
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: f */
        public void mo11674d(C10942c c10942c, Number number) throws IOException {
            if (number == null) {
                c10942c.mo11757f0();
                return;
            }
            C10916e.m11967d(number.doubleValue());
            c10942c.mo11767E0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: io.intercom.com.google.gson.e$b */
    /* loaded from: classes3.dex */
    public class C10918b extends AbstractC10936q<Number> {
        C10918b(C10916e c10916e) {
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: e */
        public Float mo11675b(C10939a c10939a) throws IOException {
            if (c10939a.mo11789C0() == EnumC10941b.NULL) {
                c10939a.mo11771w0();
                return null;
            }
            return Float.valueOf((float) c10939a.mo11775g0());
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: f */
        public void mo11674d(C10942c c10942c, Number number) throws IOException {
            if (number == null) {
                c10942c.mo11757f0();
                return;
            }
            C10916e.m11967d(number.floatValue());
            c10942c.mo11767E0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: io.intercom.com.google.gson.e$c */
    /* loaded from: classes3.dex */
    public static class C10919c extends AbstractC10936q<Number> {
        C10919c() {
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: e */
        public Number mo11675b(C10939a c10939a) throws IOException {
            if (c10939a.mo11789C0() == EnumC10941b.NULL) {
                c10939a.mo11771w0();
                return null;
            }
            return Long.valueOf(c10939a.mo11773k0());
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: f */
        public void mo11674d(C10942c c10942c, Number number) throws IOException {
            if (number == null) {
                c10942c.mo11757f0();
            } else {
                c10942c.mo11765F0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: io.intercom.com.google.gson.e$d */
    /* loaded from: classes3.dex */
    public static class C10920d extends AbstractC10936q<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10936q f24888a;

        C10920d(AbstractC10936q abstractC10936q) {
            this.f24888a = abstractC10936q;
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: e */
        public AtomicLong mo11675b(C10939a c10939a) throws IOException {
            return new AtomicLong(((Number) this.f24888a.mo11675b(c10939a)).longValue());
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: f */
        public void mo11674d(C10942c c10942c, AtomicLong atomicLong) throws IOException {
            this.f24888a.mo11674d(c10942c, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: io.intercom.com.google.gson.e$e */
    /* loaded from: classes3.dex */
    public static class C10921e extends AbstractC10936q<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10936q f24889a;

        C10921e(AbstractC10936q abstractC10936q) {
            this.f24889a = abstractC10936q;
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: e */
        public AtomicLongArray mo11675b(C10939a c10939a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c10939a.mo11781c();
            while (c10939a.mo11785V()) {
                arrayList.add(Long.valueOf(((Number) this.f24889a.mo11675b(c10939a)).longValue()));
            }
            c10939a.mo11788J();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: f */
        public void mo11674d(C10942c c10942c, AtomicLongArray atomicLongArray) throws IOException {
            c10942c.mo11756m();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f24889a.mo11674d(c10942c, Long.valueOf(atomicLongArray.get(i)));
            }
            c10942c.mo11763J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: io.intercom.com.google.gson.e$f */
    /* loaded from: classes3.dex */
    public static class C10922f<T> extends AbstractC10936q<T> {

        /* renamed from: a */
        private AbstractC10936q<T> f24890a;

        C10922f() {
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: b */
        public T mo11675b(C10939a c10939a) throws IOException {
            AbstractC10936q<T> abstractC10936q = this.f24890a;
            if (abstractC10936q != null) {
                return abstractC10936q.mo11675b(c10939a);
            }
            throw new IllegalStateException();
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: d */
        public void mo11674d(C10942c c10942c, T t) throws IOException {
            AbstractC10936q<T> abstractC10936q = this.f24890a;
            if (abstractC10936q != null) {
                abstractC10936q.mo11674d(c10942c, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void m11935e(AbstractC10936q<T> abstractC10936q) {
            if (this.f24890a == null) {
                this.f24890a = abstractC10936q;
                return;
            }
            throw new AssertionError();
        }
    }

    public C10916e() {
        this(C10963d.f24956y, EnumC10908c.f24870c, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC10933p.f24896c, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m11970a(Object obj, C10939a c10939a) {
        if (obj != null) {
            try {
                if (c10939a.mo11789C0() == EnumC10941b.END_DOCUMENT) {
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
    private static AbstractC10936q<AtomicLong> m11969b(AbstractC10936q<Number> abstractC10936q) {
        return new C10920d(abstractC10936q).m11908a();
    }

    /* renamed from: c */
    private static AbstractC10936q<AtomicLongArray> m11968c(AbstractC10936q<Number> abstractC10936q) {
        return new C10921e(abstractC10936q).m11908a();
    }

    /* renamed from: d */
    static void m11967d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private AbstractC10936q<Number> m11966e(boolean z) {
        if (z) {
            return C11015n.f25108v;
        }
        return new C10917a(this);
    }

    /* renamed from: f */
    private AbstractC10936q<Number> m11965f(boolean z) {
        if (z) {
            return C11015n.f25107u;
        }
        return new C10918b(this);
    }

    /* renamed from: o */
    private static AbstractC10936q<Number> m11956o(EnumC10933p enumC10933p) {
        if (enumC10933p == EnumC10933p.f24896c) {
            return C11015n.f25106t;
        }
        return new C10919c();
    }

    /* renamed from: g */
    public <T> T m11964g(C10939a c10939a, Type type) throws JsonIOException, JsonSyntaxException {
        boolean m11893X = c10939a.m11893X();
        boolean z = true;
        c10939a.m11899J0(true);
        try {
            try {
                try {
                    c10939a.mo11789C0();
                    z = false;
                    T mo11675b = m11959l(C11058a.m11660b(type)).mo11675b(c10939a);
                    c10939a.m11899J0(m11893X);
                    return mo11675b;
                } catch (IOException e) {
                    throw new JsonSyntaxException(e);
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (EOFException e3) {
                if (z) {
                    c10939a.m11899J0(m11893X);
                    return null;
                }
                throw new JsonSyntaxException(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            c10939a.m11899J0(m11893X);
            throw th;
        }
    }

    /* renamed from: h */
    public <T> T m11963h(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        C10939a m11955p = m11955p(reader);
        Object m11964g = m11964g(m11955p, cls);
        m11970a(m11964g, m11955p);
        return (T) C10978k.m11802c(cls).cast(m11964g);
    }

    /* renamed from: i */
    public <T> T m11962i(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C10939a m11955p = m11955p(reader);
        T t = (T) m11964g(m11955p, type);
        m11970a(t, m11955p);
        return t;
    }

    /* renamed from: j */
    public <T> T m11961j(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) C10978k.m11802c(cls).cast(m11960k(str, cls));
    }

    /* renamed from: k */
    public <T> T m11960k(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) m11962i(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public <T> AbstractC10936q<T> m11959l(C11058a<T> c11058a) {
        AbstractC10936q<T> abstractC10936q = (AbstractC10936q<T>) this.f24879b.get(c11058a == null ? f24877k : c11058a);
        if (abstractC10936q != null) {
            return abstractC10936q;
        }
        Map<C11058a<?>, C10922f<?>> map = this.f24878a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f24878a.set(map);
            z = true;
        }
        C10922f<?> c10922f = map.get(c11058a);
        if (c10922f != null) {
            return c10922f;
        }
        try {
            C10922f<?> c10922f2 = new C10922f<>();
            map.put(c11058a, c10922f2);
            for (InterfaceC10938r interfaceC10938r : this.f24882e) {
                AbstractC10936q abstractC10936q2 = (AbstractC10936q<T>) interfaceC10938r.mo11671a(this, c11058a);
                if (abstractC10936q2 != null) {
                    c10922f2.m11935e(abstractC10936q2);
                    this.f24879b.put(c11058a, abstractC10936q2);
                    return abstractC10936q2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + c11058a);
        } finally {
            map.remove(c11058a);
            if (z) {
                this.f24878a.remove();
            }
        }
    }

    /* renamed from: m */
    public <T> AbstractC10936q<T> m11958m(Class<T> cls) {
        return m11959l(C11058a.m11661a(cls));
    }

    /* renamed from: n */
    public <T> AbstractC10936q<T> m11957n(InterfaceC10938r interfaceC10938r, C11058a<T> c11058a) {
        if (!this.f24882e.contains(interfaceC10938r)) {
            interfaceC10938r = this.f24881d;
        }
        boolean z = false;
        for (InterfaceC10938r interfaceC10938r2 : this.f24882e) {
            if (z) {
                AbstractC10936q<T> mo11671a = interfaceC10938r2.mo11671a(this, c11058a);
                if (mo11671a != null) {
                    return mo11671a;
                }
            } else if (interfaceC10938r2 == interfaceC10938r) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c11058a);
    }

    /* renamed from: p */
    public C10939a m11955p(Reader reader) {
        C10939a c10939a = new C10939a(reader);
        c10939a.m11899J0(this.f24887j);
        return c10939a;
    }

    /* renamed from: q */
    public C10942c m11954q(Writer writer) throws IOException {
        if (this.f24884g) {
            writer.write(")]}'\n");
        }
        C10942c c10942c = new C10942c(writer);
        if (this.f24886i) {
            c10942c.m11872w0("  ");
        }
        c10942c.m11870z0(this.f24883f);
        return c10942c;
    }

    /* renamed from: r */
    public String m11953r(AbstractC10927j abstractC10927j) {
        StringWriter stringWriter = new StringWriter();
        m11949v(abstractC10927j, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: s */
    public String m11952s(Object obj) {
        if (obj == null) {
            return m11953r(C10928k.f24892a);
        }
        return m11951t(obj, obj.getClass());
    }

    /* renamed from: t */
    public String m11951t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m11946y(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f24883f + ",factories:" + this.f24882e + ",instanceCreators:" + this.f24880c + "}";
    }

    /* renamed from: u */
    public void m11950u(AbstractC10927j abstractC10927j, C10942c c10942c) throws JsonIOException {
        boolean m11881X = c10942c.m11881X();
        c10942c.m11871x0(true);
        boolean m11882V = c10942c.m11882V();
        c10942c.m11873u0(this.f24885h);
        boolean m11883P = c10942c.m11883P();
        c10942c.m11870z0(this.f24883f);
        try {
            try {
                C10979l.m11800b(abstractC10927j, c10942c);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
            }
        } finally {
            c10942c.m11871x0(m11881X);
            c10942c.m11873u0(m11882V);
            c10942c.m11870z0(m11883P);
        }
    }

    /* renamed from: v */
    public void m11949v(AbstractC10927j abstractC10927j, Appendable appendable) throws JsonIOException {
        try {
            m11950u(abstractC10927j, m11954q(C10979l.m11799c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: w */
    public void m11948w(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            m11946y(obj, obj.getClass(), appendable);
        } else {
            m11949v(C10928k.f24892a, appendable);
        }
    }

    /* renamed from: x */
    public void m11947x(Object obj, Type type, C10942c c10942c) throws JsonIOException {
        AbstractC10936q m11959l = m11959l(C11058a.m11660b(type));
        boolean m11881X = c10942c.m11881X();
        c10942c.m11871x0(true);
        boolean m11882V = c10942c.m11882V();
        c10942c.m11873u0(this.f24885h);
        boolean m11883P = c10942c.m11883P();
        c10942c.m11870z0(this.f24883f);
        try {
            try {
                m11959l.mo11674d(c10942c, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
            }
        } finally {
            c10942c.m11871x0(m11881X);
            c10942c.m11873u0(m11882V);
            c10942c.m11870z0(m11883P);
        }
    }

    /* renamed from: y */
    public void m11946y(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            m11947x(obj, type, m11954q(C10979l.m11799c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    C10916e(C10963d c10963d, InterfaceC10915d interfaceC10915d, Map<Type, InterfaceC10923f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC10933p enumC10933p, String str, int i, int i2, List<InterfaceC10938r> list, List<InterfaceC10938r> list2, List<InterfaceC10938r> list3) {
        this.f24878a = new ThreadLocal<>();
        this.f24879b = new ConcurrentHashMap();
        this.f24880c = new C10948c(map);
        this.f24883f = z;
        this.f24884g = z3;
        this.f24885h = z4;
        this.f24886i = z5;
        this.f24887j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C11015n.f25085Y);
        arrayList.add(C11000h.f25028b);
        arrayList.add(c10963d);
        arrayList.addAll(list3);
        arrayList.add(C11015n.f25064D);
        arrayList.add(C11015n.f25099m);
        arrayList.add(C11015n.f25093g);
        arrayList.add(C11015n.f25095i);
        arrayList.add(C11015n.f25097k);
        AbstractC10936q<Number> m11956o = m11956o(enumC10933p);
        arrayList.add(C11015n.m11736b(Long.TYPE, Long.class, m11956o));
        arrayList.add(C11015n.m11736b(Double.TYPE, Double.class, m11966e(z7)));
        arrayList.add(C11015n.m11736b(Float.TYPE, Float.class, m11965f(z7)));
        arrayList.add(C11015n.f25110x);
        arrayList.add(C11015n.f25101o);
        arrayList.add(C11015n.f25103q);
        arrayList.add(C11015n.m11737a(AtomicLong.class, m11969b(m11956o)));
        arrayList.add(C11015n.m11737a(AtomicLongArray.class, m11968c(m11956o)));
        arrayList.add(C11015n.f25105s);
        arrayList.add(C11015n.f25112z);
        arrayList.add(C11015n.f25066F);
        arrayList.add(C11015n.f25068H);
        arrayList.add(C11015n.m11737a(BigDecimal.class, C11015n.f25062B));
        arrayList.add(C11015n.m11737a(BigInteger.class, C11015n.f25063C));
        arrayList.add(C11015n.f25070J);
        arrayList.add(C11015n.f25072L);
        arrayList.add(C11015n.f25076P);
        arrayList.add(C11015n.f25078R);
        arrayList.add(C11015n.f25083W);
        arrayList.add(C11015n.f25074N);
        arrayList.add(C11015n.f25090d);
        arrayList.add(C10991c.f25009b);
        arrayList.add(C11015n.f25081U);
        arrayList.add(C11009k.f25049b);
        arrayList.add(C11007j.f25047b);
        arrayList.add(C11015n.f25079S);
        arrayList.add(C10987a.f25003c);
        arrayList.add(C11015n.f25088b);
        arrayList.add(new C10989b(this.f24880c));
        arrayList.add(new C10998g(this.f24880c, z2));
        C10993d c10993d = new C10993d(this.f24880c);
        this.f24881d = c10993d;
        arrayList.add(c10993d);
        arrayList.add(C11015n.f25086Z);
        arrayList.add(new C11003i(this.f24880c, interfaceC10915d, c10963d, this.f24881d));
        this.f24882e = Collections.unmodifiableList(arrayList);
    }
}
