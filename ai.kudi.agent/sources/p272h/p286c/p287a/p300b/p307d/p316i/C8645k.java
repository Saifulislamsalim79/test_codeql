package p272h.p286c.p287a.p300b.p307d.p316i;

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
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.k */
/* loaded from: classes2.dex */
public final class C8645k implements InterfaceC5965d {

    /* renamed from: f */
    private static final Charset f20493f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C5961b f20494g;

    /* renamed from: h */
    private static final C5961b f20495h;

    /* renamed from: i */
    private static final InterfaceC5964c f20496i;

    /* renamed from: a */
    private OutputStream f20497a;

    /* renamed from: b */
    private final Map f20498b;

    /* renamed from: c */
    private final Map f20499c;

    /* renamed from: d */
    private final InterfaceC5964c f20500d;

    /* renamed from: e */
    private final C8689o f20501e = new C8689o(this);

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("key");
        C8580e c8580e = new C8580e();
        c8580e.m15976a(1);
        m23171a.m23166b(c8580e.m15975b());
        f20494g = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("value");
        C8580e c8580e2 = new C8580e();
        c8580e2.m15976a(2);
        m23171a2.m23166b(c8580e2.m15975b());
        f20495h = m23171a2.m23167a();
        f20496i = C8634j.f20488a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8645k(OutputStream outputStream, Map map, Map map2, InterfaceC5964c interfaceC5964c) {
        this.f20497a = outputStream;
        this.f20498b = map;
        this.f20499c = map2;
        this.f20500d = interfaceC5964c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ void m15950k(Map.Entry entry, InterfaceC5965d interfaceC5965d) throws IOException {
        interfaceC5965d.mo15507f(f20494g, entry.getKey());
        interfaceC5965d.mo15507f(f20495h, entry.getValue());
    }

    /* renamed from: l */
    private static int m15949l(C5961b c5961b) {
        i m23169c = c5961b.m23169c(i.class);
        if (m23169c != null) {
            return m23169c.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final long m15948m(InterfaceC5964c interfaceC5964c, Object obj) throws IOException {
        C8592f c8592f = new C8592f();
        try {
            OutputStream outputStream = this.f20497a;
            this.f20497a = c8592f;
            interfaceC5964c.mo15475a(obj, this);
            this.f20497a = outputStream;
            long m15971c = c8592f.m15971c();
            c8592f.close();
            return m15971c;
        } catch (Throwable th) {
            try {
                c8592f.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static i m15947n(C5961b c5961b) {
        i m23169c = c5961b.m23169c(i.class);
        if (m23169c != null) {
            return m23169c;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final C8645k m15946o(InterfaceC5964c interfaceC5964c, C5961b c5961b, Object obj, boolean z) throws IOException {
        long m15948m = m15948m(interfaceC5964c, obj);
        if (z && m15948m == 0) {
            return this;
        }
        m15943r((m15949l(c5961b) << 3) | 2);
        m15942s(m15948m);
        interfaceC5964c.mo15475a(obj, this);
        return this;
    }

    /* renamed from: p */
    private final C8645k m15945p(InterfaceC5966e interfaceC5966e, C5961b c5961b, Object obj, boolean z) throws IOException {
        this.f20501e.m15935a(c5961b, z);
        interfaceC5966e.mo23151a(obj, this.f20501e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m15944q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m15943r(int i) throws IOException {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f20497a;
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
    private final void m15942s(long j) throws IOException {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f20497a;
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
        m15953h(c5961b, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC5965d mo15511b(C5961b c5961b, long j) throws IOException {
        m15952i(c5961b, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: c */
    public final /* synthetic */ InterfaceC5965d mo15510c(C5961b c5961b, int i) throws IOException {
        m15953h(c5961b, i, true);
        return this;
    }

    /* renamed from: d */
    final InterfaceC5965d m15956d(C5961b c5961b, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m15943r((m15949l(c5961b) << 3) | 1);
        this.f20497a.write(m15944q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: e */
    final InterfaceC5965d m15955e(C5961b c5961b, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m15943r((m15949l(c5961b) << 3) | 5);
        this.f20497a.write(m15944q(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: f */
    public final InterfaceC5965d mo15507f(C5961b c5961b, Object obj) throws IOException {
        m15954g(c5961b, obj, true);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final InterfaceC5965d m15954g(C5961b c5961b, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m15943r((m15949l(c5961b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20493f);
            m15943r(bytes.length);
            this.f20497a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m15954g(c5961b, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m15946o(f20496i, c5961b, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m15956d(c5961b, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m15955e(c5961b, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m15952i(c5961b, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m15953h(c5961b, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m15943r((m15949l(c5961b) << 3) | 2);
            m15943r(bArr.length);
            this.f20497a.write(bArr);
            return this;
        } else {
            InterfaceC5964c interfaceC5964c = (InterfaceC5964c) this.f20498b.get(obj.getClass());
            if (interfaceC5964c != null) {
                m15946o(interfaceC5964c, c5961b, obj, z);
                return this;
            }
            InterfaceC5966e interfaceC5966e = (InterfaceC5966e) this.f20499c.get(obj.getClass());
            if (interfaceC5966e != null) {
                m15945p(interfaceC5966e, c5961b, obj, z);
                return this;
            } else if (obj instanceof InterfaceC8603g) {
                m15953h(c5961b, ((InterfaceC8603g) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m15953h(c5961b, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m15946o(this.f20500d, c5961b, obj, z);
                return this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final C8645k m15953h(C5961b c5961b, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        i m15947n = m15947n(c5961b);
        h hVar = h.c;
        int ordinal = m15947n.zzb().ordinal();
        if (ordinal == 0) {
            m15943r(m15947n.zza() << 3);
            m15943r(i);
        } else if (ordinal == 1) {
            m15943r(m15947n.zza() << 3);
            m15943r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m15943r((m15947n.zza() << 3) | 5);
            this.f20497a.write(m15944q(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: i */
    final C8645k m15952i(C5961b c5961b, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        i m15947n = m15947n(c5961b);
        h hVar = h.c;
        int ordinal = m15947n.zzb().ordinal();
        if (ordinal == 0) {
            m15943r(m15947n.zza() << 3);
            m15942s(j);
        } else if (ordinal == 1) {
            m15943r(m15947n.zza() << 3);
            m15942s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m15943r((m15947n.zza() << 3) | 1);
            this.f20497a.write(m15944q(8).putLong(j).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final C8645k m15951j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC5964c interfaceC5964c = (InterfaceC5964c) this.f20498b.get(obj.getClass());
        if (interfaceC5964c != null) {
            interfaceC5964c.mo15475a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        String.valueOf(valueOf).length();
        throw new EncodingException("No encoder for ".concat(String.valueOf(valueOf)));
    }
}
