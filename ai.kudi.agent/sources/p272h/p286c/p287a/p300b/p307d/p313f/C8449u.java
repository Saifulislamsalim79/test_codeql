package p272h.p286c.p287a.p300b.p307d.p313f;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.InterfaceC5966e;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.u */
/* loaded from: classes2.dex */
public final class C8449u implements InterfaceC5965d {

    /* renamed from: f */
    private static final Charset f20131f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C5961b f20132g;

    /* renamed from: h */
    private static final C5961b f20133h;

    /* renamed from: i */
    private static final InterfaceC5964c<Map.Entry<Object, Object>> f20134i;

    /* renamed from: a */
    private OutputStream f20135a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5964c<?>> f20136b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC5966e<?>> f20137c;

    /* renamed from: d */
    private final InterfaceC5964c<Object> f20138d;

    /* renamed from: e */
    private final C8453y f20139e = new C8453y(this);

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("key");
        C8445o c8445o = new C8445o();
        c8445o.m16097a(1);
        m23171a.m23166b(c8445o.m16096b());
        f20132g = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("value");
        C8445o c8445o2 = new C8445o();
        c8445o2.m16097a(2);
        m23171a2.m23166b(c8445o2.m16096b());
        f20133h = m23171a2.m23167a();
        f20134i = C8448t.f20130a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8449u(OutputStream outputStream, Map<Class<?>, InterfaceC5964c<?>> map, Map<Class<?>, InterfaceC5966e<?>> map2, InterfaceC5964c<Object> interfaceC5964c) {
        this.f20135a = outputStream;
        this.f20136b = map;
        this.f20137c = map2;
        this.f20138d = interfaceC5964c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ void m16087k(Map.Entry entry, InterfaceC5965d interfaceC5965d) throws IOException {
        interfaceC5965d.mo15507f(f20132g, entry.getKey());
        interfaceC5965d.mo15507f(f20133h, entry.getValue());
    }

    /* renamed from: l */
    private static int m16086l(C5961b c5961b) {
        s m23169c = c5961b.m23169c(s.class);
        if (m23169c != null) {
            return m23169c.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m16085m(InterfaceC5964c<T> interfaceC5964c, T t) throws IOException {
        C8446p c8446p = new C8446p();
        try {
            OutputStream outputStream = this.f20135a;
            this.f20135a = c8446p;
            interfaceC5964c.mo15475a(t, this);
            this.f20135a = outputStream;
            long m16095c = c8446p.m16095c();
            c8446p.close();
            return m16095c;
        } catch (Throwable th) {
            try {
                c8446p.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static s m16084n(C5961b c5961b) {
        s m23169c = c5961b.m23169c(s.class);
        if (m23169c != null) {
            return m23169c;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C8449u m16083o(InterfaceC5964c<T> interfaceC5964c, C5961b c5961b, T t, boolean z) throws IOException {
        long m16085m = m16085m(interfaceC5964c, t);
        if (z && m16085m == 0) {
            return this;
        }
        m16080r((m16086l(c5961b) << 3) | 2);
        m16079s(m16085m);
        interfaceC5964c.mo15475a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C8449u m16082p(InterfaceC5966e<T> interfaceC5966e, C5961b c5961b, T t, boolean z) throws IOException {
        this.f20139e.m16076a(c5961b, z);
        interfaceC5966e.mo23151a(t, this.f20139e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m16081q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m16080r(int i) throws IOException {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f20135a;
            if (i2 == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* renamed from: s */
    private final void m16079s(long j) throws IOException {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f20135a;
            if (i == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: a */
    public final /* synthetic */ InterfaceC5965d mo15512a(C5961b c5961b, boolean z) throws IOException {
        m16090h(c5961b, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC5965d mo15511b(C5961b c5961b, long j) throws IOException {
        m16089i(c5961b, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: c */
    public final /* synthetic */ InterfaceC5965d mo15510c(C5961b c5961b, int i) throws IOException {
        m16090h(c5961b, i, true);
        return this;
    }

    /* renamed from: d */
    final InterfaceC5965d m16093d(C5961b c5961b, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m16080r((m16086l(c5961b) << 3) | 1);
        this.f20135a.write(m16081q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: e */
    final InterfaceC5965d m16092e(C5961b c5961b, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m16080r((m16086l(c5961b) << 3) | 5);
        this.f20135a.write(m16081q(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: f */
    public final InterfaceC5965d mo15507f(C5961b c5961b, Object obj) throws IOException {
        m16091g(c5961b, obj, true);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final InterfaceC5965d m16091g(C5961b c5961b, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m16080r((m16086l(c5961b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20131f);
            m16080r(bytes.length);
            this.f20135a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m16091g(c5961b, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m16083o(f20134i, c5961b, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m16093d(c5961b, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m16092e(c5961b, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m16089i(c5961b, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m16090h(c5961b, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m16080r((m16086l(c5961b) << 3) | 2);
            m16080r(bArr.length);
            this.f20135a.write(bArr);
            return this;
        } else {
            InterfaceC5964c<?> interfaceC5964c = this.f20136b.get(obj.getClass());
            if (interfaceC5964c != null) {
                m16083o(interfaceC5964c, c5961b, obj, z);
                return this;
            }
            InterfaceC5966e<?> interfaceC5966e = this.f20137c.get(obj.getClass());
            if (interfaceC5966e != null) {
                m16082p(interfaceC5966e, c5961b, obj, z);
                return this;
            } else if (obj instanceof InterfaceC8447q) {
                m16090h(c5961b, ((InterfaceC8447q) obj).mo16094d(), true);
                return this;
            } else if (obj instanceof Enum) {
                m16090h(c5961b, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m16083o(this.f20138d, c5961b, obj, z);
                return this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final C8449u m16090h(C5961b c5961b, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        s m16084n = m16084n(c5961b);
        r rVar = r.c;
        int ordinal = m16084n.zzb().ordinal();
        if (ordinal == 0) {
            m16080r(m16084n.zza() << 3);
            m16080r(i);
        } else if (ordinal == 1) {
            m16080r(m16084n.zza() << 3);
            m16080r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m16080r((m16084n.zza() << 3) | 5);
            this.f20135a.write(m16081q(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: i */
    final C8449u m16089i(C5961b c5961b, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        s m16084n = m16084n(c5961b);
        r rVar = r.c;
        int ordinal = m16084n.zzb().ordinal();
        if (ordinal == 0) {
            m16080r(m16084n.zza() << 3);
            m16079s(j);
        } else if (ordinal == 1) {
            m16080r(m16084n.zza() << 3);
            m16079s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m16080r((m16084n.zza() << 3) | 1);
            this.f20135a.write(m16081q(8).putLong(j).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final C8449u m16088j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC5964c<?> interfaceC5964c = this.f20136b.get(obj.getClass());
        if (interfaceC5964c != null) {
            interfaceC5964c.mo15475a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        String.valueOf(valueOf).length();
        throw new EncodingException("No encoder for ".concat(String.valueOf(valueOf)));
    }
}
