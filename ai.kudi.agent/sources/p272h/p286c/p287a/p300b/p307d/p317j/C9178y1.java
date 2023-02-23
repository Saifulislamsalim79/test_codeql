package p272h.p286c.p287a.p300b.p307d.p317j;

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
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.y1 */
/* loaded from: classes2.dex */
public final class C9178y1 implements InterfaceC5965d {

    /* renamed from: f */
    private static final Charset f21542f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C5961b f21543g;

    /* renamed from: h */
    private static final C5961b f21544h;

    /* renamed from: i */
    private static final InterfaceC5964c f21545i;

    /* renamed from: a */
    private OutputStream f21546a;

    /* renamed from: b */
    private final Map f21547b;

    /* renamed from: c */
    private final Map f21548c;

    /* renamed from: d */
    private final InterfaceC5964c f21549d;

    /* renamed from: e */
    private final C8869d2 f21550e = new C8869d2(this);

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("key");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f21543g = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("value");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f21544h = m23171a2.m23167a();
        f21545i = C9164x1.f21534a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9178y1(OutputStream outputStream, Map map, Map map2, InterfaceC5964c interfaceC5964c) {
        this.f21546a = outputStream;
        this.f21547b = map;
        this.f21548c = map2;
        this.f21549d = interfaceC5964c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ void m15502k(Map.Entry entry, InterfaceC5965d interfaceC5965d) throws IOException {
        interfaceC5965d.mo15507f(f21543g, entry.getKey());
        interfaceC5965d.mo15507f(f21544h, entry.getValue());
    }

    /* renamed from: l */
    private static int m15501l(C5961b c5961b) {
        w1 m23169c = c5961b.m23169c(w1.class);
        if (m23169c != null) {
            return m23169c.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final long m15500m(InterfaceC5964c interfaceC5964c, Object obj) throws IOException {
        C9107t1 c9107t1 = new C9107t1();
        try {
            OutputStream outputStream = this.f21546a;
            this.f21546a = c9107t1;
            interfaceC5964c.mo15475a(obj, this);
            this.f21546a = outputStream;
            long m15543c = c9107t1.m15543c();
            c9107t1.close();
            return m15543c;
        } catch (Throwable th) {
            try {
                c9107t1.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static w1 m15499n(C5961b c5961b) {
        w1 m23169c = c5961b.m23169c(w1.class);
        if (m23169c != null) {
            return m23169c;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final C9178y1 m15498o(InterfaceC5964c interfaceC5964c, C5961b c5961b, Object obj, boolean z) throws IOException {
        long m15500m = m15500m(interfaceC5964c, obj);
        if (z && m15500m == 0) {
            return this;
        }
        m15495r((m15501l(c5961b) << 3) | 2);
        m15494s(m15500m);
        interfaceC5964c.mo15475a(obj, this);
        return this;
    }

    /* renamed from: p */
    private final C9178y1 m15497p(InterfaceC5966e interfaceC5966e, C5961b c5961b, Object obj, boolean z) throws IOException {
        this.f21550e.m15766a(c5961b, z);
        interfaceC5966e.mo23151a(obj, this.f21550e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m15496q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m15495r(int i) throws IOException {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f21546a;
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
    private final void m15494s(long j) throws IOException {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f21546a;
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
        m15505h(c5961b, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC5965d mo15511b(C5961b c5961b, long j) throws IOException {
        m15504i(c5961b, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: c */
    public final /* synthetic */ InterfaceC5965d mo15510c(C5961b c5961b, int i) throws IOException {
        m15505h(c5961b, i, true);
        return this;
    }

    /* renamed from: d */
    final InterfaceC5965d m15509d(C5961b c5961b, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m15495r((m15501l(c5961b) << 3) | 1);
        this.f21546a.write(m15496q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: e */
    final InterfaceC5965d m15508e(C5961b c5961b, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m15495r((m15501l(c5961b) << 3) | 5);
        this.f21546a.write(m15496q(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: f */
    public final InterfaceC5965d mo15507f(C5961b c5961b, Object obj) throws IOException {
        m15506g(c5961b, obj, true);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final InterfaceC5965d m15506g(C5961b c5961b, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m15495r((m15501l(c5961b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f21542f);
            m15495r(bytes.length);
            this.f21546a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m15506g(c5961b, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m15498o(f21545i, c5961b, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m15509d(c5961b, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m15508e(c5961b, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m15504i(c5961b, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m15505h(c5961b, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m15495r((m15501l(c5961b) << 3) | 2);
            m15495r(bArr.length);
            this.f21546a.write(bArr);
            return this;
        } else {
            InterfaceC5964c interfaceC5964c = (InterfaceC5964c) this.f21547b.get(obj.getClass());
            if (interfaceC5964c != null) {
                m15498o(interfaceC5964c, c5961b, obj, z);
                return this;
            }
            InterfaceC5966e interfaceC5966e = (InterfaceC5966e) this.f21548c.get(obj.getClass());
            if (interfaceC5966e != null) {
                m15497p(interfaceC5966e, c5961b, obj, z);
                return this;
            } else if (obj instanceof InterfaceC9122u1) {
                m15505h(c5961b, ((InterfaceC9122u1) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m15505h(c5961b, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m15498o(this.f21549d, c5961b, obj, z);
                return this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final C9178y1 m15505h(C5961b c5961b, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        w1 m15499n = m15499n(c5961b);
        v1 v1Var = v1.c;
        int ordinal = m15499n.zzb().ordinal();
        if (ordinal == 0) {
            m15495r(m15499n.zza() << 3);
            m15495r(i);
        } else if (ordinal == 1) {
            m15495r(m15499n.zza() << 3);
            m15495r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m15495r((m15499n.zza() << 3) | 5);
            this.f21546a.write(m15496q(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: i */
    final C9178y1 m15504i(C5961b c5961b, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        w1 m15499n = m15499n(c5961b);
        v1 v1Var = v1.c;
        int ordinal = m15499n.zzb().ordinal();
        if (ordinal == 0) {
            m15495r(m15499n.zza() << 3);
            m15494s(j);
        } else if (ordinal == 1) {
            m15495r(m15499n.zza() << 3);
            m15494s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m15495r((m15499n.zza() << 3) | 1);
            this.f21546a.write(m15496q(8).putLong(j).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final C9178y1 m15503j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC5964c interfaceC5964c = (InterfaceC5964c) this.f21547b.get(obj.getClass());
        if (interfaceC5964c != null) {
            interfaceC5964c.mo15475a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        String.valueOf(valueOf).length();
        throw new EncodingException("No encoder for ".concat(String.valueOf(valueOf)));
    }
}
