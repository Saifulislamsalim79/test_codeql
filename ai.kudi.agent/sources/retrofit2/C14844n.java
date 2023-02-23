package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p565l.AbstractC14120b0;
import p565l.AbstractC14135d0;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.C14231t;
import p565l.C14235v;
import p565l.C14236w;
import p565l.InterfaceC14138e;
import retrofit2.AbstractC14820i;
import retrofit2.q.p;
import retrofit2.q.q;
import retrofit2.q.r;
import retrofit2.q.s;
import retrofit2.q.t;
import retrofit2.q.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ServiceMethod.java */
/* renamed from: retrofit2.n */
/* loaded from: classes3.dex */
public final class C14844n<R, T> {

    /* renamed from: m */
    static final Pattern f33165m = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: n */
    static final Pattern f33166n = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a */
    private final InterfaceC14138e.InterfaceC14139a f33167a;

    /* renamed from: b */
    private final InterfaceC14802c<R, T> f33168b;

    /* renamed from: c */
    private final C14231t f33169c;

    /* renamed from: d */
    private final InterfaceC14805e<AbstractC14135d0, R> f33170d;

    /* renamed from: e */
    private final String f33171e;

    /* renamed from: f */
    private final String f33172f;

    /* renamed from: g */
    private final C14229s f33173g;

    /* renamed from: h */
    private final C14235v f33174h;

    /* renamed from: i */
    private final boolean f33175i;

    /* renamed from: j */
    private final boolean f33176j;

    /* renamed from: k */
    private final boolean f33177k;

    /* renamed from: l */
    private final AbstractC14820i<?>[] f33178l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceMethod.java */
    /* renamed from: retrofit2.n$a */
    /* loaded from: classes3.dex */
    public static final class C14845a<T, R> {

        /* renamed from: a */
        final C14841m f33179a;

        /* renamed from: b */
        final Method f33180b;

        /* renamed from: c */
        final Annotation[] f33181c;

        /* renamed from: d */
        final Annotation[][] f33182d;

        /* renamed from: e */
        final Type[] f33183e;

        /* renamed from: f */
        Type f33184f;

        /* renamed from: g */
        boolean f33185g;

        /* renamed from: h */
        boolean f33186h;

        /* renamed from: i */
        boolean f33187i;

        /* renamed from: j */
        boolean f33188j;

        /* renamed from: k */
        boolean f33189k;

        /* renamed from: l */
        boolean f33190l;

        /* renamed from: m */
        String f33191m;

        /* renamed from: n */
        boolean f33192n;

        /* renamed from: o */
        boolean f33193o;

        /* renamed from: p */
        boolean f33194p;

        /* renamed from: q */
        String f33195q;

        /* renamed from: r */
        C14229s f33196r;

        /* renamed from: s */
        C14235v f33197s;

        /* renamed from: t */
        Set<String> f33198t;

        /* renamed from: u */
        AbstractC14820i<?>[] f33199u;

        /* renamed from: v */
        InterfaceC14805e<AbstractC14135d0, T> f33200v;

        /* renamed from: w */
        InterfaceC14802c<T, R> f33201w;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14845a(C14841m c14841m, Method method) {
            this.f33179a = c14841m;
            this.f33180b = method;
            this.f33181c = method.getAnnotations();
            this.f33183e = method.getGenericParameterTypes();
            this.f33182d = method.getParameterAnnotations();
        }

        /* renamed from: b */
        private InterfaceC14802c<T, R> m252b() {
            Type genericReturnType = this.f33180b.getGenericReturnType();
            if (!C14846o.m230k(genericReturnType)) {
                if (genericReturnType != Void.TYPE) {
                    try {
                        return (InterfaceC14802c<T, R>) this.f33179a.m276b(genericReturnType, this.f33180b.getAnnotations());
                    } catch (RuntimeException e) {
                        throw m249e(e, "Unable to create call adapter for %s", genericReturnType);
                    }
                }
                throw m250d("Service methods cannot return void.", new Object[0]);
            }
            throw m250d("Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }

        /* renamed from: c */
        private InterfaceC14805e<AbstractC14135d0, T> m251c() {
            try {
                return this.f33179a.m267k(this.f33184f, this.f33180b.getAnnotations());
            } catch (RuntimeException e) {
                throw m249e(e, "Unable to create converter for %s", this.f33184f);
            }
        }

        /* renamed from: d */
        private RuntimeException m250d(String str, Object... objArr) {
            return m249e(null, str, objArr);
        }

        /* renamed from: e */
        private RuntimeException m249e(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.f33180b.getDeclaringClass().getSimpleName() + "." + this.f33180b.getName(), th);
        }

        /* renamed from: f */
        private RuntimeException m248f(int i, String str, Object... objArr) {
            return m250d(str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: g */
        private RuntimeException m247g(Throwable th, int i, String str, Object... objArr) {
            return m249e(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: h */
        private C14229s m246h(String[] strArr) {
            C14229s.C14230a c14230a = new C14229s.C14230a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf != -1 && indexOf != 0 && indexOf != str.length() - 1) {
                    String substring = str.substring(0, indexOf);
                    String trim = str.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        C14235v m2474d = C14235v.m2474d(trim);
                        if (m2474d != null) {
                            this.f33197s = m2474d;
                        } else {
                            throw m250d("Malformed content type: %s", trim);
                        }
                    } else {
                        c14230a.m2542a(substring, trim);
                    }
                } else {
                    throw m250d("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
            }
            return c14230a.m2539d();
        }

        /* renamed from: i */
        private void m245i(String str, String str2, boolean z) {
            String str3 = this.f33191m;
            if (str3 == null) {
                this.f33191m = str;
                this.f33192n = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (C14844n.f33165m.matcher(substring).find()) {
                        throw m250d("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f33195q = str2;
                this.f33198t = C14844n.m256c(str2);
                return;
            }
            throw m250d("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: j */
        private void m244j(Annotation annotation) {
            if (annotation instanceof retrofit2.q.b) {
                m245i("DELETE", ((retrofit2.q.b) annotation).value(), false);
            } else if (annotation instanceof retrofit2.q.f) {
                m245i("GET", ((retrofit2.q.f) annotation).value(), false);
            } else if (annotation instanceof retrofit2.q.g) {
                m245i("HEAD", ((retrofit2.q.g) annotation).value(), false);
                if (!Void.class.equals(this.f33184f)) {
                    throw m250d("HEAD method must use Void as response type.", new Object[0]);
                }
            } else if (annotation instanceof retrofit2.q.m) {
                m245i("PATCH", ((retrofit2.q.m) annotation).value(), true);
            } else if (annotation instanceof retrofit2.q.n) {
                m245i("POST", ((retrofit2.q.n) annotation).value(), true);
            } else if (annotation instanceof retrofit2.q.o) {
                m245i("PUT", ((retrofit2.q.o) annotation).value(), true);
            } else if (annotation instanceof retrofit2.q.l) {
                m245i("OPTIONS", ((retrofit2.q.l) annotation).value(), false);
            } else if (annotation instanceof retrofit2.q.h) {
                retrofit2.q.h hVar = (retrofit2.q.h) annotation;
                m245i(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof retrofit2.q.j) {
                String[] value = ((retrofit2.q.j) annotation).value();
                if (value.length != 0) {
                    this.f33196r = m246h(value);
                    return;
                }
                throw m250d("@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof retrofit2.q.k) {
                if (!this.f33193o) {
                    this.f33194p = true;
                    return;
                }
                throw m250d("Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof retrofit2.q.e) {
                if (!this.f33194p) {
                    this.f33193o = true;
                    return;
                }
                throw m250d("Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: k */
        private AbstractC14820i<?> m243k(int i, Type type, Annotation[] annotationArr) {
            AbstractC14820i<?> abstractC14820i = null;
            for (Annotation annotation : annotationArr) {
                AbstractC14820i<?> m242l = m242l(i, type, annotationArr, annotation);
                if (m242l != null) {
                    if (abstractC14820i != null) {
                        throw m248f(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    abstractC14820i = m242l;
                }
            }
            if (abstractC14820i != null) {
                return abstractC14820i;
            }
            throw m248f(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: l */
        private AbstractC14820i<?> m242l(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof r) {
                if (!this.f33189k) {
                    if (!this.f33190l) {
                        if (this.f33195q != null) {
                            this.f33188j = true;
                            r rVar = (r) annotation;
                            String value = rVar.value();
                            m241m(i, value);
                            return new AbstractC14820i.C14829i(value, this.f33179a.m266l(type, annotationArr), rVar.encoded());
                        }
                        throw m248f(i, "@Path can only be used with relative url on @%s", this.f33191m);
                    }
                    throw m248f(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw m248f(i, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (annotation instanceof s) {
                s sVar = (s) annotation;
                String value2 = sVar.value();
                boolean encoded = sVar.encoded();
                Class<?> m232i = C14846o.m232i(type);
                this.f33189k = true;
                if (Iterable.class.isAssignableFrom(m232i)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC14820i.C14830j(value2, this.f33179a.m266l(C14846o.m233h(0, (ParameterizedType) type), annotationArr), encoded).m307c();
                    }
                    throw m248f(i, m232i.getSimpleName() + " must include generic type (e.g., " + m232i.getSimpleName() + "<String>)", new Object[0]);
                } else if (m232i.isArray()) {
                    return new AbstractC14820i.C14830j(value2, this.f33179a.m266l(C14844n.m257b(m232i.getComponentType()), annotationArr), encoded).m308b();
                } else {
                    return new AbstractC14820i.C14830j(value2, this.f33179a.m266l(type, annotationArr), encoded);
                }
            } else if (annotation instanceof u) {
                boolean encoded2 = ((u) annotation).encoded();
                Class<?> m232i2 = C14846o.m232i(type);
                this.f33189k = true;
                if (Iterable.class.isAssignableFrom(m232i2)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC14820i.C14832l(this.f33179a.m266l(C14846o.m233h(0, (ParameterizedType) type), annotationArr), encoded2).m307c();
                    }
                    throw m248f(i, m232i2.getSimpleName() + " must include generic type (e.g., " + m232i2.getSimpleName() + "<String>)", new Object[0]);
                } else if (m232i2.isArray()) {
                    return new AbstractC14820i.C14832l(this.f33179a.m266l(C14844n.m257b(m232i2.getComponentType()), annotationArr), encoded2).m308b();
                } else {
                    return new AbstractC14820i.C14832l(this.f33179a.m266l(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof t) {
                Class<?> m232i3 = C14846o.m232i(type);
                if (Map.class.isAssignableFrom(m232i3)) {
                    Type m231j = C14846o.m231j(type, m232i3, Map.class);
                    if (m231j instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) m231j;
                        Type m233h = C14846o.m233h(0, parameterizedType);
                        if (String.class == m233h) {
                            return new AbstractC14820i.C14831k(this.f33179a.m266l(C14846o.m233h(1, parameterizedType), annotationArr), ((t) annotation).encoded());
                        }
                        throw m248f(i, "@QueryMap keys must be of type String: " + m233h, new Object[0]);
                    }
                    throw m248f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m248f(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof retrofit2.q.i) {
                String value3 = ((retrofit2.q.i) annotation).value();
                Class<?> m232i4 = C14846o.m232i(type);
                if (Iterable.class.isAssignableFrom(m232i4)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC14820i.C14826f(value3, this.f33179a.m266l(C14846o.m233h(0, (ParameterizedType) type), annotationArr)).m307c();
                    }
                    throw m248f(i, m232i4.getSimpleName() + " must include generic type (e.g., " + m232i4.getSimpleName() + "<String>)", new Object[0]);
                } else if (m232i4.isArray()) {
                    return new AbstractC14820i.C14826f(value3, this.f33179a.m266l(C14844n.m257b(m232i4.getComponentType()), annotationArr)).m308b();
                } else {
                    return new AbstractC14820i.C14826f(value3, this.f33179a.m266l(type, annotationArr));
                }
            } else if (annotation instanceof retrofit2.q.c) {
                if (this.f33193o) {
                    retrofit2.q.c cVar = (retrofit2.q.c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f33185g = true;
                    Class<?> m232i5 = C14846o.m232i(type);
                    if (Iterable.class.isAssignableFrom(m232i5)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC14820i.C14824d(value4, this.f33179a.m266l(C14846o.m233h(0, (ParameterizedType) type), annotationArr), encoded3).m307c();
                        }
                        throw m248f(i, m232i5.getSimpleName() + " must include generic type (e.g., " + m232i5.getSimpleName() + "<String>)", new Object[0]);
                    } else if (m232i5.isArray()) {
                        return new AbstractC14820i.C14824d(value4, this.f33179a.m266l(C14844n.m257b(m232i5.getComponentType()), annotationArr), encoded3).m308b();
                    } else {
                        return new AbstractC14820i.C14824d(value4, this.f33179a.m266l(type, annotationArr), encoded3);
                    }
                }
                throw m248f(i, "@Field parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof retrofit2.q.d) {
                if (this.f33193o) {
                    Class<?> m232i6 = C14846o.m232i(type);
                    if (Map.class.isAssignableFrom(m232i6)) {
                        Type m231j2 = C14846o.m231j(type, m232i6, Map.class);
                        if (m231j2 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) m231j2;
                            Type m233h2 = C14846o.m233h(0, parameterizedType2);
                            if (String.class == m233h2) {
                                InterfaceC14805e<T, String> m266l = this.f33179a.m266l(C14846o.m233h(1, parameterizedType2), annotationArr);
                                this.f33185g = true;
                                return new AbstractC14820i.C14825e(m266l, ((retrofit2.q.d) annotation).encoded());
                            }
                            throw m248f(i, "@FieldMap keys must be of type String: " + m233h2, new Object[0]);
                        }
                        throw m248f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m248f(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m248f(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof p) {
                if (this.f33194p) {
                    p pVar = (p) annotation;
                    this.f33186h = true;
                    String value5 = pVar.value();
                    Class<?> m232i7 = C14846o.m232i(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(m232i7)) {
                            if (type instanceof ParameterizedType) {
                                if (C14236w.C14238b.class.isAssignableFrom(C14846o.m232i(C14846o.m233h(0, (ParameterizedType) type)))) {
                                    return AbstractC14820i.C14833m.f33130a.m307c();
                                }
                                throw m248f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw m248f(i, m232i7.getSimpleName() + " must include generic type (e.g., " + m232i7.getSimpleName() + "<String>)", new Object[0]);
                        } else if (m232i7.isArray()) {
                            if (C14236w.C14238b.class.isAssignableFrom(m232i7.getComponentType())) {
                                return AbstractC14820i.C14833m.f33130a.m308b();
                            }
                            throw m248f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else if (C14236w.C14238b.class.isAssignableFrom(m232i7)) {
                            return AbstractC14820i.C14833m.f33130a;
                        } else {
                            throw m248f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    }
                    C14229s m2546g = C14229s.m2546g("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", pVar.encoding());
                    if (Iterable.class.isAssignableFrom(m232i7)) {
                        if (type instanceof ParameterizedType) {
                            Type m233h3 = C14846o.m233h(0, (ParameterizedType) type);
                            if (!C14236w.C14238b.class.isAssignableFrom(C14846o.m232i(m233h3))) {
                                return new AbstractC14820i.C14827g(m2546g, this.f33179a.m268j(m233h3, annotationArr, this.f33181c)).m307c();
                            }
                            throw m248f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw m248f(i, m232i7.getSimpleName() + " must include generic type (e.g., " + m232i7.getSimpleName() + "<String>)", new Object[0]);
                    } else if (m232i7.isArray()) {
                        Class<?> m257b = C14844n.m257b(m232i7.getComponentType());
                        if (!C14236w.C14238b.class.isAssignableFrom(m257b)) {
                            return new AbstractC14820i.C14827g(m2546g, this.f33179a.m268j(m257b, annotationArr, this.f33181c)).m308b();
                        }
                        throw m248f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    } else if (!C14236w.C14238b.class.isAssignableFrom(m232i7)) {
                        return new AbstractC14820i.C14827g(m2546g, this.f33179a.m268j(type, annotationArr, this.f33181c));
                    } else {
                        throw m248f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                }
                throw m248f(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof q) {
                if (this.f33194p) {
                    this.f33186h = true;
                    Class<?> m232i8 = C14846o.m232i(type);
                    if (Map.class.isAssignableFrom(m232i8)) {
                        Type m231j3 = C14846o.m231j(type, m232i8, Map.class);
                        if (m231j3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) m231j3;
                            Type m233h4 = C14846o.m233h(0, parameterizedType3);
                            if (String.class == m233h4) {
                                Type m233h5 = C14846o.m233h(1, parameterizedType3);
                                if (!C14236w.C14238b.class.isAssignableFrom(C14846o.m232i(m233h5))) {
                                    return new AbstractC14820i.C14828h(this.f33179a.m268j(m233h5, annotationArr, this.f33181c), ((q) annotation).encoding());
                                }
                                throw m248f(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw m248f(i, "@PartMap keys must be of type String: " + m233h4, new Object[0]);
                        }
                        throw m248f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m248f(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m248f(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof retrofit2.q.a) {
                if (!this.f33193o && !this.f33194p) {
                    if (!this.f33187i) {
                        try {
                            InterfaceC14805e<T, AbstractC14120b0> m268j = this.f33179a.m268j(type, annotationArr, this.f33181c);
                            this.f33187i = true;
                            return new AbstractC14820i.C14823c(m268j);
                        } catch (RuntimeException e) {
                            throw m247g(e, i, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw m248f(i, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw m248f(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            } else {
                return null;
            }
        }

        /* renamed from: m */
        private void m241m(int i, String str) {
            if (C14844n.f33166n.matcher(str).matches()) {
                if (!this.f33198t.contains(str)) {
                    throw m248f(i, "URL \"%s\" does not contain \"{%s}\".", this.f33195q, str);
                }
                return;
            }
            throw m248f(i, "@Path parameter name must match %s. Found: %s", C14844n.f33165m.pattern(), str);
        }

        /* renamed from: a */
        public C14844n m253a() {
            InterfaceC14802c<T, R> m252b = m252b();
            this.f33201w = m252b;
            Type responseType = m252b.responseType();
            this.f33184f = responseType;
            if (responseType != C14840l.class && responseType != C14131c0.class) {
                this.f33200v = m251c();
                for (Annotation annotation : this.f33181c) {
                    m244j(annotation);
                }
                if (this.f33191m != null) {
                    if (!this.f33192n) {
                        if (!this.f33194p) {
                            if (this.f33193o) {
                                throw m250d("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            }
                        } else {
                            throw m250d("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length = this.f33182d.length;
                    this.f33199u = new AbstractC14820i[length];
                    for (int i = 0; i < length; i++) {
                        Type type = this.f33183e[i];
                        if (!C14846o.m230k(type)) {
                            Annotation[] annotationArr = this.f33182d[i];
                            if (annotationArr != null) {
                                this.f33199u[i] = m243k(i, type, annotationArr);
                            } else {
                                throw m248f(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw m248f(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                    }
                    if (this.f33195q != null || this.f33190l) {
                        if (!this.f33193o && !this.f33194p && !this.f33192n && this.f33187i) {
                            throw m250d("Non-body HTTP method cannot contain @Body.", new Object[0]);
                        }
                        if (this.f33193o && !this.f33185g) {
                            throw m250d("Form-encoded method must contain at least one @Field.", new Object[0]);
                        }
                        if (this.f33194p && !this.f33186h) {
                            throw m250d("Multipart method must contain at least one @Part.", new Object[0]);
                        }
                        return new C14844n(this);
                    }
                    throw m250d("Missing either @%s URL or @Url parameter.", this.f33191m);
                }
                throw m250d("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            throw m250d("'" + C14846o.m232i(this.f33184f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
    }

    C14844n(C14845a<R, T> c14845a) {
        this.f33167a = c14845a.f33179a.m275c();
        this.f33168b = c14845a.f33201w;
        this.f33169c = c14845a.f33179a.m277a();
        this.f33170d = c14845a.f33200v;
        this.f33171e = c14845a.f33191m;
        this.f33172f = c14845a.f33195q;
        this.f33173g = c14845a.f33196r;
        this.f33174h = c14845a.f33197s;
        this.f33175i = c14845a.f33192n;
        this.f33176j = c14845a.f33193o;
        this.f33177k = c14845a.f33194p;
        this.f33178l = c14845a.f33199u;
    }

    /* renamed from: b */
    static Class<?> m257b(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: c */
    static Set<String> m256c(String str) {
        Matcher matcher = f33165m.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public T m258a(InterfaceC14801b<R> interfaceC14801b) {
        return this.f33168b.mo324a(interfaceC14801b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC14138e m255d(Object... objArr) throws IOException {
        C14838k c14838k = new C14838k(this.f33171e, this.f33169c, this.f33172f, this.f33173g, this.f33174h, this.f33175i, this.f33176j, this.f33177k);
        AbstractC14820i<?>[] abstractC14820iArr = this.f33178l;
        int length = objArr != null ? objArr.length : 0;
        if (length == abstractC14820iArr.length) {
            for (int i = 0; i < length; i++) {
                abstractC14820iArr[i].mo302a(c14838k, objArr[i]);
            }
            return this.f33167a.mo2460a(c14838k.m288g());
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC14820iArr.length + ")");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public R m254e(AbstractC14135d0 abstractC14135d0) throws IOException {
        return this.f33170d.convert(abstractC14135d0);
    }
}
