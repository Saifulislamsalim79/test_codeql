package io.grpc;

import com.google.common.base.C5034d;
import com.google.common.base.C5051n;
import com.google.common.p109io.BaseEncoding;
import com.google.common.p109io.C5141a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
/* compiled from: Metadata.java */
/* renamed from: io.grpc.s0 */
/* loaded from: classes2.dex */
public final class C10049s0 {

    /* renamed from: c */
    public static final InterfaceC10053d<String> f23786c = new C10051b();

    /* renamed from: d */
    static final BaseEncoding f23787d = BaseEncoding.m25551b().mo25533l();

    /* renamed from: a */
    private Object[] f23788a;

    /* renamed from: b */
    private int f23789b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$a */
    /* loaded from: classes2.dex */
    public class C10050a {
    }

    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$b */
    /* loaded from: classes2.dex */
    class C10051b implements InterfaceC10053d<String> {
        C10051b() {
        }

        @Override // io.grpc.C10049s0.InterfaceC10053d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ String mo13193a(String str) {
            String str2 = str;
            m13194d(str2);
            return str2;
        }

        @Override // io.grpc.C10049s0.InterfaceC10053d
        /* renamed from: b */
        public /* bridge */ /* synthetic */ String mo13192b(String str) {
            m13195c(str);
            return str;
        }

        /* renamed from: c */
        public String m13195c(String str) {
            return str;
        }

        /* renamed from: d */
        public String m13194d(String str) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$c */
    /* loaded from: classes2.dex */
    public static class C10052c<T> extends AbstractC10055f<T> {

        /* renamed from: f */
        private final InterfaceC10053d<T> f23790f;

        /* synthetic */ C10052c(String str, boolean z, InterfaceC10053d interfaceC10053d, C10050a c10050a) {
            this(str, z, interfaceC10053d);
        }

        @Override // io.grpc.C10049s0.AbstractC10055f
        /* renamed from: h */
        T mo13175h(byte[] bArr) {
            return this.f23790f.mo13192b(new String(bArr, C5034d.f12685a));
        }

        @Override // io.grpc.C10049s0.AbstractC10055f
        /* renamed from: j */
        byte[] mo13174j(T t) {
            return this.f23790f.mo13193a(t).getBytes(C5034d.f12685a);
        }

        private C10052c(String str, boolean z, InterfaceC10053d<T> interfaceC10053d) {
            super(str, z, interfaceC10053d, null);
            C5051n.m25783k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            C5051n.m25779o(interfaceC10053d, "marshaller");
            this.f23790f = interfaceC10053d;
        }
    }

    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC10053d<T> {
        /* renamed from: a */
        String mo13193a(T t);

        /* renamed from: b */
        T mo13192b(String str);
    }

    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC10054e<T> {
        /* renamed from: a */
        InputStream m13191a(T t);

        /* renamed from: b */
        T m13190b(InputStream inputStream);
    }

    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10055f<T> {

        /* renamed from: e */
        private static final BitSet f23791e = m13188b();

        /* renamed from: a */
        private final String f23792a;

        /* renamed from: b */
        private final String f23793b;

        /* renamed from: c */
        private final byte[] f23794c;

        /* renamed from: d */
        private final Object f23795d;

        /* synthetic */ AbstractC10055f(String str, boolean z, Object obj, C10050a c10050a) {
            this(str, z, obj);
        }

        /* renamed from: b */
        private static BitSet m13188b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        /* renamed from: e */
        public static <T> AbstractC10055f<T> m13185e(String str, InterfaceC10053d<T> interfaceC10053d) {
            return m13184f(str, false, interfaceC10053d);
        }

        /* renamed from: f */
        static <T> AbstractC10055f<T> m13184f(String str, boolean z, InterfaceC10053d<T> interfaceC10053d) {
            return new C10052c(str, z, interfaceC10053d, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public static <T> AbstractC10055f<T> m13183g(String str, boolean z, InterfaceC10058i<T> interfaceC10058i) {
            return new C10057h(str, z, interfaceC10058i, null);
        }

        /* renamed from: k */
        private static String m13181k(String str, boolean z) {
            C5051n.m25779o(str, "name");
            C5051n.m25789e(!str.isEmpty(), "token must have at least 1 tchar");
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!z || charAt != ':' || i != 0) {
                    C5051n.m25787g(f23791e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        /* renamed from: a */
        byte[] m13189a() {
            return this.f23794c;
        }

        /* renamed from: c */
        final <M> M m13187c(Class<M> cls) {
            if (cls.isInstance(this.f23795d)) {
                return cls.cast(this.f23795d);
            }
            return null;
        }

        /* renamed from: d */
        public final String m13186d() {
            return this.f23793b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f23793b.equals(((AbstractC10055f) obj).f23793b);
        }

        /* renamed from: h */
        abstract T mo13175h(byte[] bArr);

        public final int hashCode() {
            return this.f23793b.hashCode();
        }

        /* renamed from: i */
        boolean m13182i() {
            return false;
        }

        /* renamed from: j */
        abstract byte[] mo13174j(T t);

        public String toString() {
            return "Key{name='" + this.f23793b + "'}";
        }

        private AbstractC10055f(String str, boolean z, Object obj) {
            C5051n.m25779o(str, "name");
            String str2 = str;
            this.f23792a = str2;
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            m13181k(lowerCase, z);
            this.f23793b = lowerCase;
            this.f23794c = lowerCase.getBytes(C5034d.f12685a);
            this.f23795d = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$g */
    /* loaded from: classes2.dex */
    public static final class C10056g<T> {

        /* renamed from: a */
        private final InterfaceC10054e<T> f23796a;

        /* renamed from: b */
        private final T f23797b;

        /* renamed from: c */
        private volatile byte[] f23798c;

        C10056g(InterfaceC10054e<T> interfaceC10054e, T t) {
            this.f23796a = interfaceC10054e;
            this.f23797b = t;
        }

        /* renamed from: a */
        static <T> C10056g<T> m13180a(AbstractC10055f<T> abstractC10055f, T t) {
            InterfaceC10054e m13179b = m13179b(abstractC10055f);
            C5051n.m25780n(m13179b);
            return new C10056g<>(m13179b, t);
        }

        /* renamed from: b */
        private static <T> InterfaceC10054e<T> m13179b(AbstractC10055f<T> abstractC10055f) {
            return (InterfaceC10054e) abstractC10055f.m13187c(InterfaceC10054e.class);
        }

        /* renamed from: c */
        byte[] m13178c() {
            if (this.f23798c == null) {
                synchronized (this) {
                    if (this.f23798c == null) {
                        this.f23798c = C10049s0.m13201p(m13176e());
                    }
                }
            }
            return this.f23798c;
        }

        /* renamed from: d */
        <T2> T2 m13177d(AbstractC10055f<T2> abstractC10055f) {
            InterfaceC10054e m13179b;
            if (abstractC10055f.m13182i() && (m13179b = m13179b(abstractC10055f)) != null) {
                return (T2) m13179b.m13190b(m13176e());
            }
            return abstractC10055f.mo13175h(m13178c());
        }

        /* renamed from: e */
        InputStream m13176e() {
            return this.f23796a.m13191a(this.f23797b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$h */
    /* loaded from: classes2.dex */
    public static final class C10057h<T> extends AbstractC10055f<T> {

        /* renamed from: f */
        private final InterfaceC10058i<T> f23799f;

        /* synthetic */ C10057h(String str, boolean z, InterfaceC10058i interfaceC10058i, C10050a c10050a) {
            this(str, z, interfaceC10058i);
        }

        @Override // io.grpc.C10049s0.AbstractC10055f
        /* renamed from: h */
        T mo13175h(byte[] bArr) {
            return this.f23799f.mo13172b(bArr);
        }

        @Override // io.grpc.C10049s0.AbstractC10055f
        /* renamed from: j */
        byte[] mo13174j(T t) {
            return this.f23799f.mo13173a(t);
        }

        private C10057h(String str, boolean z, InterfaceC10058i<T> interfaceC10058i) {
            super(str, z, interfaceC10058i, null);
            C5051n.m25783k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            C5051n.m25779o(interfaceC10058i, "marshaller");
            this.f23799f = interfaceC10058i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Metadata.java */
    /* renamed from: io.grpc.s0$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC10058i<T> {
        /* renamed from: a */
        byte[] mo13173a(T t);

        /* renamed from: b */
        T mo13172b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10049s0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* renamed from: b */
    private boolean m13215b(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: c */
    private int m13214c() {
        Object[] objArr = this.f23788a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: e */
    private void m13212e(int i) {
        Object[] objArr = new Object[i];
        if (!m13209h()) {
            System.arraycopy(this.f23788a, 0, objArr, 0, m13208i());
        }
        this.f23788a = objArr;
    }

    /* renamed from: h */
    private boolean m13209h() {
        return this.f23789b == 0;
    }

    /* renamed from: i */
    private int m13208i() {
        return this.f23789b * 2;
    }

    /* renamed from: j */
    private void m13207j() {
        if (m13208i() == 0 || m13208i() == m13214c()) {
            m13212e(Math.max(m13208i() * 2, 8));
        }
    }

    /* renamed from: l */
    private void m13205l(int i, byte[] bArr) {
        this.f23788a[i * 2] = bArr;
    }

    /* renamed from: m */
    private byte[] m13204m(int i) {
        return (byte[]) this.f23788a[i * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static byte[] m13201p(InputStream inputStream) {
        try {
            return C5141a.m25525d(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    /* renamed from: q */
    private Object m13200q(int i) {
        return this.f23788a[(i * 2) + 1];
    }

    /* renamed from: r */
    private void m13199r(int i, Object obj) {
        if (this.f23788a instanceof byte[][]) {
            m13212e(m13214c());
        }
        this.f23788a[(i * 2) + 1] = obj;
    }

    /* renamed from: s */
    private void m13198s(int i, byte[] bArr) {
        this.f23788a[(i * 2) + 1] = bArr;
    }

    /* renamed from: t */
    private byte[] m13197t(int i) {
        Object m13200q = m13200q(i);
        if (m13200q instanceof byte[]) {
            return (byte[]) m13200q;
        }
        return ((C10056g) m13200q).m13178c();
    }

    /* renamed from: u */
    private <T> T m13196u(int i, AbstractC10055f<T> abstractC10055f) {
        Object m13200q = m13200q(i);
        if (m13200q instanceof byte[]) {
            return abstractC10055f.mo13175h((byte[]) m13200q);
        }
        return (T) ((C10056g) m13200q).m13177d(abstractC10055f);
    }

    /* renamed from: d */
    public <T> void m13213d(AbstractC10055f<T> abstractC10055f) {
        if (m13209h()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f23789b; i2++) {
            if (!m13215b(abstractC10055f.m13189a(), m13204m(i2))) {
                m13205l(i, m13204m(i2));
                m13199r(i, m13200q(i2));
                i++;
            }
        }
        Arrays.fill(this.f23788a, i * 2, m13208i(), (Object) null);
        this.f23789b = i;
    }

    /* renamed from: f */
    public <T> T m13211f(AbstractC10055f<T> abstractC10055f) {
        for (int i = this.f23789b - 1; i >= 0; i--) {
            if (m13215b(abstractC10055f.m13189a(), m13204m(i))) {
                return (T) m13196u(i, abstractC10055f);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m13210g() {
        return this.f23789b;
    }

    /* renamed from: k */
    public void m13206k(C10049s0 c10049s0) {
        if (c10049s0.m13209h()) {
            return;
        }
        int m13214c = m13214c() - m13208i();
        if (m13209h() || m13214c < c10049s0.m13208i()) {
            m13212e(m13208i() + c10049s0.m13208i());
        }
        System.arraycopy(c10049s0.f23788a, 0, this.f23788a, m13208i(), c10049s0.m13208i());
        this.f23789b += c10049s0.f23789b;
    }

    /* renamed from: n */
    public <T> void m13203n(AbstractC10055f<T> abstractC10055f, T t) {
        C5051n.m25779o(abstractC10055f, "key");
        C5051n.m25779o(t, "value");
        m13207j();
        m13205l(this.f23789b, abstractC10055f.m13189a());
        if (abstractC10055f.m13182i()) {
            m13199r(this.f23789b, C10056g.m13180a(abstractC10055f, t));
        } else {
            m13198s(this.f23789b, abstractC10055f.mo13174j(t));
        }
        this.f23789b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public byte[][] m13202o() {
        byte[][] bArr = new byte[m13208i()];
        Object[] objArr = this.f23788a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m13208i());
        } else {
            for (int i = 0; i < this.f23789b; i++) {
                int i2 = i * 2;
                bArr[i2] = m13204m(i);
                bArr[i2 + 1] = m13197t(i);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f23789b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(m13204m(i), C5034d.f12685a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f23787d.m25548f(m13197t(i)));
            } else {
                sb.append(new String(m13197t(i), C5034d.f12685a));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    C10049s0(int i, byte[]... bArr) {
        this(i, (Object[]) bArr);
    }

    C10049s0(int i, Object[] objArr) {
        this.f23789b = i;
        this.f23788a = objArr;
    }

    public C10049s0() {
    }
}
