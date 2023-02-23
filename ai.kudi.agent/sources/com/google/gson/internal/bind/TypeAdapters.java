package com.google.gson.internal.bind;

import com.google.gson.AbstractC6900l;
import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.C6793i;
import com.google.gson.C6901m;
import com.google.gson.C6902n;
import com.google.gson.C6903o;
import com.google.gson.InterfaceC6915t;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C6875f;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes2.dex */
public final class TypeAdapters {

    /* renamed from: A */
    public static final AbstractC6909s<String> f16418A;

    /* renamed from: B */
    public static final AbstractC6909s<BigDecimal> f16419B;

    /* renamed from: C */
    public static final AbstractC6909s<BigInteger> f16420C;

    /* renamed from: D */
    public static final InterfaceC6915t f16421D;

    /* renamed from: E */
    public static final AbstractC6909s<StringBuilder> f16422E;

    /* renamed from: F */
    public static final InterfaceC6915t f16423F;

    /* renamed from: G */
    public static final AbstractC6909s<StringBuffer> f16424G;

    /* renamed from: H */
    public static final InterfaceC6915t f16425H;

    /* renamed from: I */
    public static final AbstractC6909s<URL> f16426I;

    /* renamed from: J */
    public static final InterfaceC6915t f16427J;

    /* renamed from: K */
    public static final AbstractC6909s<URI> f16428K;

    /* renamed from: L */
    public static final InterfaceC6915t f16429L;

    /* renamed from: M */
    public static final AbstractC6909s<InetAddress> f16430M;

    /* renamed from: N */
    public static final InterfaceC6915t f16431N;

    /* renamed from: O */
    public static final AbstractC6909s<UUID> f16432O;

    /* renamed from: P */
    public static final InterfaceC6915t f16433P;

    /* renamed from: Q */
    public static final AbstractC6909s<Currency> f16434Q;

    /* renamed from: R */
    public static final InterfaceC6915t f16435R;

    /* renamed from: S */
    public static final InterfaceC6915t f16436S;

    /* renamed from: T */
    public static final AbstractC6909s<Calendar> f16437T;

    /* renamed from: U */
    public static final InterfaceC6915t f16438U;

    /* renamed from: V */
    public static final AbstractC6909s<Locale> f16439V;

    /* renamed from: W */
    public static final InterfaceC6915t f16440W;

    /* renamed from: X */
    public static final AbstractC6909s<AbstractC6900l> f16441X;

    /* renamed from: Y */
    public static final InterfaceC6915t f16442Y;

    /* renamed from: Z */
    public static final InterfaceC6915t f16443Z;

    /* renamed from: a */
    public static final AbstractC6909s<Class> f16444a;

    /* renamed from: b */
    public static final InterfaceC6915t f16445b;

    /* renamed from: c */
    public static final AbstractC6909s<BitSet> f16446c;

    /* renamed from: d */
    public static final InterfaceC6915t f16447d;

    /* renamed from: e */
    public static final AbstractC6909s<Boolean> f16448e;

    /* renamed from: f */
    public static final AbstractC6909s<Boolean> f16449f;

    /* renamed from: g */
    public static final InterfaceC6915t f16450g;

    /* renamed from: h */
    public static final AbstractC6909s<Number> f16451h;

    /* renamed from: i */
    public static final InterfaceC6915t f16452i;

    /* renamed from: j */
    public static final AbstractC6909s<Number> f16453j;

    /* renamed from: k */
    public static final InterfaceC6915t f16454k;

    /* renamed from: l */
    public static final AbstractC6909s<Number> f16455l;

    /* renamed from: m */
    public static final InterfaceC6915t f16456m;

    /* renamed from: n */
    public static final AbstractC6909s<AtomicInteger> f16457n;

    /* renamed from: o */
    public static final InterfaceC6915t f16458o;

    /* renamed from: p */
    public static final AbstractC6909s<AtomicBoolean> f16459p;

    /* renamed from: q */
    public static final InterfaceC6915t f16460q;

    /* renamed from: r */
    public static final AbstractC6909s<AtomicIntegerArray> f16461r;

    /* renamed from: s */
    public static final InterfaceC6915t f16462s;

    /* renamed from: t */
    public static final AbstractC6909s<Number> f16463t;

    /* renamed from: u */
    public static final AbstractC6909s<Number> f16464u;

    /* renamed from: v */
    public static final AbstractC6909s<Number> f16465v;

    /* renamed from: w */
    public static final AbstractC6909s<Number> f16466w;

    /* renamed from: x */
    public static final InterfaceC6915t f16467x;

    /* renamed from: y */
    public static final AbstractC6909s<Character> f16468y;

    /* renamed from: z */
    public static final InterfaceC6915t f16469z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31 */
    /* loaded from: classes2.dex */
    class C681631 implements InterfaceC6915t {

        /* renamed from: c */
        final /* synthetic */ C6916a f16471c;

        /* renamed from: d */
        final /* synthetic */ AbstractC6909s f16472d;

        @Override // com.google.gson.InterfaceC6915t
        /* renamed from: a */
        public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
            if (c6916a.equals(this.f16471c)) {
                return this.f16472d;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a */
    /* loaded from: classes2.dex */
    class C6822a extends AbstractC6909s<AtomicIntegerArray> {
        C6822a() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public AtomicIntegerArray mo20528b(C6911a c6911a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c6911a.mo20504c();
            while (c6911a.mo20509V()) {
                try {
                    arrayList.add(Integer.valueOf(c6911a.mo20500i0()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            c6911a.mo20518J();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c6914c.mo20469m();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                c6914c.mo20490C0(atomicIntegerArray.get(i));
            }
            c6914c.mo20483J();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a0 */
    /* loaded from: classes2.dex */
    class C6823a0 extends AbstractC6909s<Number> {
        C6823a0() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            try {
                return Integer.valueOf(c6911a.mo20500i0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            c6914c.mo20488E0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b */
    /* loaded from: classes2.dex */
    class C6824b extends AbstractC6909s<Number> {
        C6824b() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            try {
                return Long.valueOf(c6911a.mo20499k0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            c6914c.mo20488E0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b0 */
    /* loaded from: classes2.dex */
    class C6825b0 extends AbstractC6909s<AtomicInteger> {
        C6825b0() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public AtomicInteger mo20528b(C6911a c6911a) throws IOException {
            try {
                return new AtomicInteger(c6911a.mo20500i0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, AtomicInteger atomicInteger) throws IOException {
            c6914c.mo20490C0(atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c */
    /* loaded from: classes2.dex */
    class C6826c extends AbstractC6909s<Number> {
        C6826c() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return Float.valueOf((float) c6911a.mo20501g0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            c6914c.mo20488E0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c0 */
    /* loaded from: classes2.dex */
    class C6827c0 extends AbstractC6909s<AtomicBoolean> {
        C6827c0() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public AtomicBoolean mo20528b(C6911a c6911a) throws IOException {
            return new AtomicBoolean(c6911a.mo20503f0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, AtomicBoolean atomicBoolean) throws IOException {
            c6914c.mo20485H0(atomicBoolean.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d */
    /* loaded from: classes2.dex */
    class C6828d extends AbstractC6909s<Number> {
        C6828d() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return Double.valueOf(c6911a.mo20501g0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            c6914c.mo20488E0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d0 */
    /* loaded from: classes2.dex */
    private static final class C6829d0<T extends Enum<T>> extends AbstractC6909s<T> {

        /* renamed from: a */
        private final Map<String, T> f16485a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f16486b = new HashMap();

        public C6829d0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    com.google.gson.u.c annotation = cls.getField(name).getAnnotation(com.google.gson.u.c.class);
                    if (annotation != null) {
                        name = annotation.value();
                        for (String str : annotation.alternate()) {
                            this.f16485a.put(str, t);
                        }
                    }
                    this.f16485a.put(name, t);
                    this.f16486b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public T mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return this.f16485a.get(c6911a.mo20493z0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, T t) throws IOException {
            c6914c.mo20486F0(t == null ? null : this.f16486b.get(t));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$e */
    /* loaded from: classes2.dex */
    class C6830e extends AbstractC6909s<Number> {
        C6830e() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            EnumC6913b mo20525C0 = c6911a.mo20525C0();
            int i = C6847v.f16487a[mo20525C0.ordinal()];
            if (i == 1 || i == 3) {
                return new C6875f(c6911a.mo20493z0());
            }
            if (i == 4) {
                c6911a.mo20495w0();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + mo20525C0);
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            c6914c.mo20488E0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$f */
    /* loaded from: classes2.dex */
    class C6831f extends AbstractC6909s<Character> {
        C6831f() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Character mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            String mo20493z0 = c6911a.mo20493z0();
            if (mo20493z0.length() == 1) {
                return Character.valueOf(mo20493z0.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + mo20493z0);
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Character ch) throws IOException {
            c6914c.mo20486F0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$g */
    /* loaded from: classes2.dex */
    class C6832g extends AbstractC6909s<String> {
        C6832g() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public String mo20528b(C6911a c6911a) throws IOException {
            EnumC6913b mo20525C0 = c6911a.mo20525C0();
            if (mo20525C0 == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            } else if (mo20525C0 == EnumC6913b.BOOLEAN) {
                return Boolean.toString(c6911a.mo20503f0());
            } else {
                return c6911a.mo20493z0();
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, String str) throws IOException {
            c6914c.mo20486F0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$h */
    /* loaded from: classes2.dex */
    class C6833h extends AbstractC6909s<BigDecimal> {
        C6833h() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public BigDecimal mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            try {
                return new BigDecimal(c6911a.mo20493z0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, BigDecimal bigDecimal) throws IOException {
            c6914c.mo20488E0(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$i */
    /* loaded from: classes2.dex */
    class C6834i extends AbstractC6909s<BigInteger> {
        C6834i() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public BigInteger mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            try {
                return new BigInteger(c6911a.mo20493z0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, BigInteger bigInteger) throws IOException {
            c6914c.mo20488E0(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$j */
    /* loaded from: classes2.dex */
    class C6835j extends AbstractC6909s<StringBuilder> {
        C6835j() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public StringBuilder mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return new StringBuilder(c6911a.mo20493z0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, StringBuilder sb) throws IOException {
            c6914c.mo20486F0(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$k */
    /* loaded from: classes2.dex */
    class C6836k extends AbstractC6909s<Class> {
        C6836k() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Class mo20528b(C6911a c6911a) throws IOException {
            m20637e(c6911a);
            throw null;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: d */
        public /* bridge */ /* synthetic */ void mo20527d(C6914c c6914c, Class cls) throws IOException {
            m20636f(c6914c, cls);
            throw null;
        }

        /* renamed from: e */
        public Class m20637e(C6911a c6911a) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: f */
        public void m20636f(C6914c c6914c, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$l */
    /* loaded from: classes2.dex */
    class C6837l extends AbstractC6909s<StringBuffer> {
        C6837l() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public StringBuffer mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return new StringBuffer(c6911a.mo20493z0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, StringBuffer stringBuffer) throws IOException {
            c6914c.mo20486F0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$m */
    /* loaded from: classes2.dex */
    class C6838m extends AbstractC6909s<URL> {
        C6838m() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public URL mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            String mo20493z0 = c6911a.mo20493z0();
            if ("null".equals(mo20493z0)) {
                return null;
            }
            return new URL(mo20493z0);
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, URL url) throws IOException {
            c6914c.mo20486F0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$n */
    /* loaded from: classes2.dex */
    class C6839n extends AbstractC6909s<URI> {
        C6839n() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public URI mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            try {
                String mo20493z0 = c6911a.mo20493z0();
                if ("null".equals(mo20493z0)) {
                    return null;
                }
                return new URI(mo20493z0);
            } catch (URISyntaxException e) {
                throw new JsonIOException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, URI uri) throws IOException {
            c6914c.mo20486F0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$o */
    /* loaded from: classes2.dex */
    class C6840o extends AbstractC6909s<InetAddress> {
        C6840o() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public InetAddress mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return InetAddress.getByName(c6911a.mo20493z0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, InetAddress inetAddress) throws IOException {
            c6914c.mo20486F0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$p */
    /* loaded from: classes2.dex */
    class C6841p extends AbstractC6909s<UUID> {
        C6841p() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public UUID mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return UUID.fromString(c6911a.mo20493z0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, UUID uuid) throws IOException {
            c6914c.mo20486F0(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$q */
    /* loaded from: classes2.dex */
    class C6842q extends AbstractC6909s<Currency> {
        C6842q() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Currency mo20528b(C6911a c6911a) throws IOException {
            return Currency.getInstance(c6911a.mo20493z0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Currency currency) throws IOException {
            c6914c.mo20486F0(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$r */
    /* loaded from: classes2.dex */
    class C6843r extends AbstractC6909s<Calendar> {
        C6843r() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Calendar mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            c6911a.mo20502g();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c6911a.mo20525C0() != EnumC6913b.END_OBJECT) {
                String mo20497o0 = c6911a.mo20497o0();
                int mo20500i0 = c6911a.mo20500i0();
                if ("year".equals(mo20497o0)) {
                    i = mo20500i0;
                } else if ("month".equals(mo20497o0)) {
                    i2 = mo20500i0;
                } else if ("dayOfMonth".equals(mo20497o0)) {
                    i3 = mo20500i0;
                } else if ("hourOfDay".equals(mo20497o0)) {
                    i4 = mo20500i0;
                } else if ("minute".equals(mo20497o0)) {
                    i5 = mo20500i0;
                } else if ("second".equals(mo20497o0)) {
                    i6 = mo20500i0;
                }
            }
            c6911a.mo20514O();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Calendar calendar) throws IOException {
            if (calendar == null) {
                c6914c.mo20474f0();
                return;
            }
            c6914c.mo20487F();
            c6914c.mo20477Z("year");
            c6914c.mo20490C0(calendar.get(1));
            c6914c.mo20477Z("month");
            c6914c.mo20490C0(calendar.get(2));
            c6914c.mo20477Z("dayOfMonth");
            c6914c.mo20490C0(calendar.get(5));
            c6914c.mo20477Z("hourOfDay");
            c6914c.mo20490C0(calendar.get(11));
            c6914c.mo20477Z("minute");
            c6914c.mo20490C0(calendar.get(12));
            c6914c.mo20477Z("second");
            c6914c.mo20490C0(calendar.get(13));
            c6914c.mo20481O();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$s */
    /* loaded from: classes2.dex */
    class C6844s extends AbstractC6909s<Locale> {
        C6844s() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Locale mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c6911a.mo20493z0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Locale locale) throws IOException {
            c6914c.mo20486F0(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$t */
    /* loaded from: classes2.dex */
    class C6845t extends AbstractC6909s<AbstractC6900l> {
        C6845t() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public AbstractC6900l mo20528b(C6911a c6911a) throws IOException {
            switch (C6847v.f16487a[c6911a.mo20525C0().ordinal()]) {
                case 1:
                    return new C6903o(new C6875f(c6911a.mo20493z0()));
                case 2:
                    return new C6903o(Boolean.valueOf(c6911a.mo20503f0()));
                case 3:
                    return new C6903o(c6911a.mo20493z0());
                case 4:
                    c6911a.mo20495w0();
                    return C6901m.f16551a;
                case 5:
                    C6793i c6793i = new C6793i();
                    c6911a.mo20504c();
                    while (c6911a.mo20509V()) {
                        c6793i.m20730s(mo20528b(c6911a));
                    }
                    c6911a.mo20518J();
                    return c6793i;
                case 6:
                    C6902n c6902n = new C6902n();
                    c6911a.mo20502g();
                    while (c6911a.mo20509V()) {
                        c6902n.m20543s(c6911a.mo20497o0(), mo20528b(c6911a));
                    }
                    c6911a.mo20514O();
                    return c6902n;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, AbstractC6900l abstractC6900l) throws IOException {
            if (abstractC6900l != null && !abstractC6900l.m20546k()) {
                if (abstractC6900l.m20544m()) {
                    C6903o m20548f = abstractC6900l.m20548f();
                    if (m20548f.m20535V()) {
                        c6914c.mo20488E0(m20548f.m20539I());
                        return;
                    } else if (m20548f.m20537O()) {
                        c6914c.mo20485H0(m20548f.m20533s());
                        return;
                    } else {
                        c6914c.mo20486F0(m20548f.m20538J());
                        return;
                    }
                } else if (abstractC6900l.m20547h()) {
                    c6914c.mo20469m();
                    Iterator<AbstractC6900l> it = abstractC6900l.m20550d().iterator();
                    while (it.hasNext()) {
                        mo20527d(c6914c, it.next());
                    }
                    c6914c.mo20483J();
                    return;
                } else if (abstractC6900l.m20545l()) {
                    c6914c.mo20487F();
                    for (Map.Entry<String, AbstractC6900l> entry : abstractC6900l.m20549e().m20542u()) {
                        c6914c.mo20477Z(entry.getKey());
                        mo20527d(c6914c, entry.getValue());
                    }
                    c6914c.mo20481O();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + abstractC6900l.getClass());
                }
            }
            c6914c.mo20474f0();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$u */
    /* loaded from: classes2.dex */
    class C6846u extends AbstractC6909s<BitSet> {
        C6846u() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
            if (r8.mo20500i0() != 0) goto L15;
         */
        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet mo20528b(com.google.gson.stream.C6911a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo20504c()
                com.google.gson.stream.b r1 = r8.mo20525C0()
                r2 = 0
                r3 = 0
            Le:
                com.google.gson.stream.b r4 = com.google.gson.stream.EnumC6913b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.C6847v.f16487a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.mo20493z0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.mo20503f0()
                goto L69
            L63:
                int r1 = r8.mo20500i0()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.mo20525C0()
                goto Le
            L75:
                r8.mo20518J()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C6846u.mo20528b(com.google.gson.stream.a):java.util.BitSet");
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, BitSet bitSet) throws IOException {
            c6914c.mo20469m();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                c6914c.mo20490C0(bitSet.get(i) ? 1L : 0L);
            }
            c6914c.mo20483J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.TypeAdapters$v */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6847v {

        /* renamed from: a */
        static final /* synthetic */ int[] f16487a;

        static {
            int[] iArr = new int[EnumC6913b.values().length];
            f16487a = iArr;
            try {
                iArr[EnumC6913b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16487a[EnumC6913b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16487a[EnumC6913b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16487a[EnumC6913b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16487a[EnumC6913b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16487a[EnumC6913b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16487a[EnumC6913b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16487a[EnumC6913b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16487a[EnumC6913b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16487a[EnumC6913b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$w */
    /* loaded from: classes2.dex */
    class C6848w extends AbstractC6909s<Boolean> {
        C6848w() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Boolean mo20528b(C6911a c6911a) throws IOException {
            EnumC6913b mo20525C0 = c6911a.mo20525C0();
            if (mo20525C0 == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            } else if (mo20525C0 == EnumC6913b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(c6911a.mo20493z0()));
            } else {
                return Boolean.valueOf(c6911a.mo20503f0());
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Boolean bool) throws IOException {
            c6914c.mo20489D0(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$x */
    /* loaded from: classes2.dex */
    class C6849x extends AbstractC6909s<Boolean> {
        C6849x() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Boolean mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return Boolean.valueOf(c6911a.mo20493z0());
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Boolean bool) throws IOException {
            c6914c.mo20486F0(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$y */
    /* loaded from: classes2.dex */
    class C6850y extends AbstractC6909s<Number> {
        C6850y() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            try {
                return Byte.valueOf((byte) c6911a.mo20500i0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            c6914c.mo20488E0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$z */
    /* loaded from: classes2.dex */
    class C6851z extends AbstractC6909s<Number> {
        C6851z() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Number mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            try {
                return Short.valueOf((short) c6911a.mo20500i0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Number number) throws IOException {
            c6914c.mo20488E0(number);
        }
    }

    static {
        AbstractC6909s<Class> m20530a = new C6836k().m20530a();
        f16444a = m20530a;
        f16445b = m20671a(Class.class, m20530a);
        AbstractC6909s<BitSet> m20530a2 = new C6846u().m20530a();
        f16446c = m20530a2;
        f16447d = m20671a(BitSet.class, m20530a2);
        f16448e = new C6848w();
        f16449f = new C6849x();
        f16450g = m20670b(Boolean.TYPE, Boolean.class, f16448e);
        f16451h = new C6850y();
        f16452i = m20670b(Byte.TYPE, Byte.class, f16451h);
        f16453j = new C6851z();
        f16454k = m20670b(Short.TYPE, Short.class, f16453j);
        f16455l = new C6823a0();
        f16456m = m20670b(Integer.TYPE, Integer.class, f16455l);
        AbstractC6909s<AtomicInteger> m20530a3 = new C6825b0().m20530a();
        f16457n = m20530a3;
        f16458o = m20671a(AtomicInteger.class, m20530a3);
        AbstractC6909s<AtomicBoolean> m20530a4 = new C6827c0().m20530a();
        f16459p = m20530a4;
        f16460q = m20671a(AtomicBoolean.class, m20530a4);
        AbstractC6909s<AtomicIntegerArray> m20530a5 = new C6822a().m20530a();
        f16461r = m20530a5;
        f16462s = m20671a(AtomicIntegerArray.class, m20530a5);
        f16463t = new C6824b();
        f16464u = new C6826c();
        f16465v = new C6828d();
        C6830e c6830e = new C6830e();
        f16466w = c6830e;
        f16467x = m20671a(Number.class, c6830e);
        f16468y = new C6831f();
        f16469z = m20670b(Character.TYPE, Character.class, f16468y);
        f16418A = new C6832g();
        f16419B = new C6833h();
        f16420C = new C6834i();
        f16421D = m20671a(String.class, f16418A);
        C6835j c6835j = new C6835j();
        f16422E = c6835j;
        f16423F = m20671a(StringBuilder.class, c6835j);
        C6837l c6837l = new C6837l();
        f16424G = c6837l;
        f16425H = m20671a(StringBuffer.class, c6837l);
        C6838m c6838m = new C6838m();
        f16426I = c6838m;
        f16427J = m20671a(URL.class, c6838m);
        C6839n c6839n = new C6839n();
        f16428K = c6839n;
        f16429L = m20671a(URI.class, c6839n);
        C6840o c6840o = new C6840o();
        f16430M = c6840o;
        f16431N = m20668d(InetAddress.class, c6840o);
        C6841p c6841p = new C6841p();
        f16432O = c6841p;
        f16433P = m20671a(UUID.class, c6841p);
        AbstractC6909s<Currency> m20530a6 = new C6842q().m20530a();
        f16434Q = m20530a6;
        f16435R = m20671a(Currency.class, m20530a6);
        f16436S = new InterfaceC6915t() { // from class: com.google.gson.internal.bind.TypeAdapters.26

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
            /* loaded from: classes2.dex */
            class C6814a extends AbstractC6909s<Timestamp> {

                /* renamed from: a */
                final /* synthetic */ AbstractC6909s f16470a;

                C6814a(C681326 c681326, AbstractC6909s abstractC6909s) {
                    this.f16470a = abstractC6909s;
                }

                @Override // com.google.gson.AbstractC6909s
                /* renamed from: e */
                public Timestamp mo20528b(C6911a c6911a) throws IOException {
                    Date date = (Date) this.f16470a.mo20528b(c6911a);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // com.google.gson.AbstractC6909s
                /* renamed from: f */
                public void mo20527d(C6914c c6914c, Timestamp timestamp) throws IOException {
                    this.f16470a.mo20527d(c6914c, timestamp);
                }
            }

            @Override // com.google.gson.InterfaceC6915t
            /* renamed from: a */
            public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
                if (c6916a.getRawType() != Timestamp.class) {
                    return null;
                }
                return new C6814a(this, c6784f.m20757o(Date.class));
            }
        };
        C6843r c6843r = new C6843r();
        f16437T = c6843r;
        f16438U = m20669c(Calendar.class, GregorianCalendar.class, c6843r);
        C6844s c6844s = new C6844s();
        f16439V = c6844s;
        f16440W = m20671a(Locale.class, c6844s);
        C6845t c6845t = new C6845t();
        f16441X = c6845t;
        f16442Y = m20668d(AbstractC6900l.class, c6845t);
        f16443Z = new InterfaceC6915t() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.InterfaceC6915t
            /* renamed from: a */
            public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
                Class rawType = c6916a.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = (Class<? super Object>) rawType.getSuperclass();
                }
                return new C6829d0(rawType);
            }
        };
    }

    /* renamed from: a */
    public static <TT> InterfaceC6915t m20671a(final Class<TT> cls, final AbstractC6909s<TT> abstractC6909s) {
        return new InterfaceC6915t() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.InterfaceC6915t
            /* renamed from: a */
            public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
                if (c6916a.getRawType() == cls) {
                    return abstractC6909s;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC6909s + "]";
            }
        };
    }

    /* renamed from: b */
    public static <TT> InterfaceC6915t m20670b(final Class<TT> cls, final Class<TT> cls2, final AbstractC6909s<? super TT> abstractC6909s) {
        return new InterfaceC6915t() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.InterfaceC6915t
            /* renamed from: a */
            public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
                Class<? super T> rawType = c6916a.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return abstractC6909s;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + abstractC6909s + "]";
            }
        };
    }

    /* renamed from: c */
    public static <TT> InterfaceC6915t m20669c(final Class<TT> cls, final Class<? extends TT> cls2, final AbstractC6909s<? super TT> abstractC6909s) {
        return new InterfaceC6915t() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.InterfaceC6915t
            /* renamed from: a */
            public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
                Class<? super T> rawType = c6916a.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return abstractC6909s;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + abstractC6909s + "]";
            }
        };
    }

    /* renamed from: d */
    public static <T1> InterfaceC6915t m20668d(final Class<T1> cls, final AbstractC6909s<T1> abstractC6909s) {
        return new InterfaceC6915t() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            /* loaded from: classes2.dex */
            class C6821a extends AbstractC6909s<T1> {

                /* renamed from: a */
                final /* synthetic */ Class f16483a;

                C6821a(Class cls) {
                    this.f16483a = cls;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
                @Override // com.google.gson.AbstractC6909s
                /* renamed from: b */
                public T1 mo20528b(C6911a c6911a) throws IOException {
                    ?? mo20528b = abstractC6909s.mo20528b(c6911a);
                    if (mo20528b == 0 || this.f16483a.isInstance(mo20528b)) {
                        return mo20528b;
                    }
                    throw new JsonSyntaxException("Expected a " + this.f16483a.getName() + " but was " + mo20528b.getClass().getName());
                }

                @Override // com.google.gson.AbstractC6909s
                /* renamed from: d */
                public void mo20527d(C6914c c6914c, T1 t1) throws IOException {
                    abstractC6909s.mo20527d(c6914c, t1);
                }
            }

            @Override // com.google.gson.InterfaceC6915t
            /* renamed from: a */
            public <T2> AbstractC6909s<T2> mo20463a(C6784f c6784f, C6916a<T2> c6916a) {
                Class<? super T2> rawType = c6916a.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new C6821a(rawType);
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC6909s + "]";
            }
        };
    }
}
