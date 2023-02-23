package com.google.firebase.encoders.p143i;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.InterfaceC5966e;
import com.google.firebase.encoders.i.f;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* compiled from: ProtobufDataEncoderContext.java */
/* renamed from: com.google.firebase.encoders.i.g */
/* loaded from: classes2.dex */
final class C5982g implements InterfaceC5965d {

    /* renamed from: f */
    private static final Charset f14635f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C5961b f14636g;

    /* renamed from: h */
    private static final C5961b f14637h;

    /* renamed from: i */
    private static final InterfaceC5964c<Map.Entry<Object, Object>> f14638i;

    /* renamed from: a */
    private OutputStream f14639a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5964c<?>> f14640b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC5966e<?>> f14641c;

    /* renamed from: d */
    private final InterfaceC5964c<Object> f14642d;

    /* renamed from: e */
    private final C5986i f14643e = new C5986i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProtobufDataEncoderContext.java */
    /* renamed from: com.google.firebase.encoders.i.g$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5983a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14644a;

        static {
            int[] iArr = new int[f.a.values().length];
            f14644a = iArr;
            try {
                iArr[f.a.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14644a[f.a.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14644a[f.a.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("key");
        C5979c m23132b = C5979c.m23132b();
        m23132b.m23131c(1);
        m23171a.m23166b(m23132b.m23133a());
        f14636g = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("value");
        C5979c m23132b2 = C5979c.m23132b();
        m23132b2.m23131c(2);
        m23171a2.m23166b(m23132b2.m23133a());
        f14637h = m23171a2.m23167a();
        f14638i = C5977a.f14630a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5982g(OutputStream outputStream, Map<Class<?>, InterfaceC5964c<?>> map, Map<Class<?>, InterfaceC5966e<?>> map2, InterfaceC5964c<Object> interfaceC5964c) {
        this.f14639a = outputStream;
        this.f14640b = map;
        this.f14641c = map2;
        this.f14642d = interfaceC5964c;
    }

    /* renamed from: n */
    private static ByteBuffer m23120n(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: o */
    private <T> long m23119o(InterfaceC5964c<T> interfaceC5964c, T t) throws IOException {
        C5980d c5980d = new C5980d();
        try {
            OutputStream outputStream = this.f14639a;
            this.f14639a = c5980d;
            interfaceC5964c.mo15475a(t, this);
            this.f14639a = outputStream;
            long m23130c = c5980d.m23130c();
            c5980d.close();
            return m23130c;
        } catch (Throwable th) {
            try {
                c5980d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: p */
    private <T> C5982g m23118p(InterfaceC5964c<T> interfaceC5964c, C5961b c5961b, T t, boolean z) throws IOException {
        long m23119o = m23119o(interfaceC5964c, t);
        if (z && m23119o == 0) {
            return this;
        }
        m23112v((m23114t(c5961b) << 3) | 2);
        m23111w(m23119o);
        interfaceC5964c.mo15475a(t, this);
        return this;
    }

    /* renamed from: q */
    private <T> C5982g m23117q(InterfaceC5966e<T> interfaceC5966e, C5961b c5961b, T t, boolean z) throws IOException {
        this.f14643e.m23102b(c5961b, z);
        interfaceC5966e.mo23151a(t, this.f14643e);
        return this;
    }

    /* renamed from: s */
    private static f m23115s(C5961b c5961b) {
        f m23169c = c5961b.m23169c(f.class);
        if (m23169c != null) {
            return m23169c;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: t */
    private static int m23114t(C5961b c5961b) {
        f m23169c = c5961b.m23169c(f.class);
        if (m23169c != null) {
            return m23169c.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static /* synthetic */ void m23113u(Map.Entry entry, InterfaceC5965d interfaceC5965d) throws IOException {
        interfaceC5965d.mo15507f(f14636g, entry.getKey());
        interfaceC5965d.mo15507f(f14637h, entry.getValue());
    }

    /* renamed from: v */
    private void m23112v(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f14639a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f14639a.write(i & 127);
    }

    /* renamed from: w */
    private void m23111w(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f14639a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f14639a.write(((int) j) & 127);
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC5965d mo15512a(C5961b c5961b, boolean z) throws IOException {
        m23122l(c5961b, z);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC5965d mo15511b(C5961b c5961b, long j) throws IOException {
        m23124j(c5961b, j);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC5965d mo15510c(C5961b c5961b, int i) throws IOException {
        m23126h(c5961b, i);
        return this;
    }

    /* renamed from: d */
    InterfaceC5965d m23129d(C5961b c5961b, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m23112v((m23114t(c5961b) << 3) | 1);
        this.f14639a.write(m23120n(8).putDouble(d).array());
        return this;
    }

    /* renamed from: e */
    InterfaceC5965d m23128e(C5961b c5961b, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m23112v((m23114t(c5961b) << 3) | 5);
        this.f14639a.write(m23120n(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: f */
    public InterfaceC5965d mo15507f(C5961b c5961b, Object obj) throws IOException {
        m23127g(c5961b, obj, true);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC5965d m23127g(C5961b c5961b, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m23112v((m23114t(c5961b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f14635f);
            m23112v(bytes.length);
            this.f14639a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m23127g(c5961b, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m23118p(f14638i, c5961b, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m23129d(c5961b, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m23128e(c5961b, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m23123k(c5961b, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m23121m(c5961b, ((Boolean) obj).booleanValue(), z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m23112v((m23114t(c5961b) << 3) | 2);
            m23112v(bArr.length);
            this.f14639a.write(bArr);
            return this;
        } else {
            InterfaceC5964c<?> interfaceC5964c = this.f14640b.get(obj.getClass());
            if (interfaceC5964c != null) {
                m23118p(interfaceC5964c, c5961b, obj, z);
                return this;
            }
            InterfaceC5966e<?> interfaceC5966e = this.f14641c.get(obj.getClass());
            if (interfaceC5966e != null) {
                m23117q(interfaceC5966e, c5961b, obj, z);
                return this;
            } else if (obj instanceof InterfaceC5981e) {
                m23126h(c5961b, ((InterfaceC5981e) obj).mo16186d());
                return this;
            } else if (obj instanceof Enum) {
                m23126h(c5961b, ((Enum) obj).ordinal());
                return this;
            } else {
                m23118p(this.f14642d, c5961b, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public C5982g m23126h(C5961b c5961b, int i) throws IOException {
        m23125i(c5961b, i, true);
        return this;
    }

    /* renamed from: i */
    C5982g m23125i(C5961b c5961b, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        f m23115s = m23115s(c5961b);
        int i2 = C5983a.f14644a[m23115s.intEncoding().ordinal()];
        if (i2 == 1) {
            m23112v(m23115s.tag() << 3);
            m23112v(i);
        } else if (i2 == 2) {
            m23112v(m23115s.tag() << 3);
            m23112v((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m23112v((m23115s.tag() << 3) | 5);
            this.f14639a.write(m23120n(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: j */
    public C5982g m23124j(C5961b c5961b, long j) throws IOException {
        m23123k(c5961b, j, true);
        return this;
    }

    /* renamed from: k */
    C5982g m23123k(C5961b c5961b, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        f m23115s = m23115s(c5961b);
        int i = C5983a.f14644a[m23115s.intEncoding().ordinal()];
        if (i == 1) {
            m23112v(m23115s.tag() << 3);
            m23111w(j);
        } else if (i == 2) {
            m23112v(m23115s.tag() << 3);
            m23111w((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m23112v((m23115s.tag() << 3) | 1);
            this.f14639a.write(m23120n(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: l */
    public C5982g m23122l(C5961b c5961b, boolean z) throws IOException {
        m23121m(c5961b, z, true);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C5982g m23121m(C5961b c5961b, boolean z, boolean z2) throws IOException {
        m23125i(c5961b, z ? 1 : 0, z2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C5982g m23116r(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC5964c<?> interfaceC5964c = this.f14640b.get(obj.getClass());
        if (interfaceC5964c != null) {
            interfaceC5964c.mo15475a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
