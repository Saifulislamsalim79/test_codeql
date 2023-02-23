package com.google.firebase.encoders.p142h;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.InterfaceC5966e;
import com.google.firebase.encoders.InterfaceC5967f;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* compiled from: JsonValueObjectEncoderContext.java */
/* renamed from: com.google.firebase.encoders.h.e */
/* loaded from: classes2.dex */
final class C5976e implements InterfaceC5965d, InterfaceC5967f {

    /* renamed from: a */
    private C5976e f14623a = null;

    /* renamed from: b */
    private boolean f14624b = true;

    /* renamed from: c */
    private final JsonWriter f14625c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC5964c<?>> f14626d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC5966e<?>> f14627e;

    /* renamed from: f */
    private final InterfaceC5964c<Object> f14628f;

    /* renamed from: g */
    private final boolean f14629g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5976e(Writer writer, Map<Class<?>, InterfaceC5964c<?>> map, Map<Class<?>, InterfaceC5966e<?>> map2, InterfaceC5964c<Object> interfaceC5964c, boolean z) {
        this.f14625c = new JsonWriter(writer);
        this.f14626d = map;
        this.f14627e = map2;
        this.f14628f = interfaceC5964c;
        this.f14629g = z;
    }

    /* renamed from: q */
    private boolean m23139q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: t */
    private C5976e m23136t(String str, Object obj) throws IOException, EncodingException {
        m23134v();
        this.f14625c.name(str);
        if (obj == null) {
            this.f14625c.nullValue();
            return this;
        }
        return m23147i(obj, false);
    }

    /* renamed from: u */
    private C5976e m23135u(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        m23134v();
        this.f14625c.name(str);
        return m23147i(obj, false);
    }

    /* renamed from: v */
    private void m23134v() throws IOException {
        if (this.f14624b) {
            C5976e c5976e = this.f14623a;
            if (c5976e != null) {
                c5976e.m23134v();
                this.f14623a.f14624b = false;
                this.f14623a = null;
                this.f14625c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: a */
    public InterfaceC5965d mo15512a(C5961b c5961b, boolean z) throws IOException {
        m23142n(c5961b.m23170b(), z);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: b */
    public InterfaceC5965d mo15511b(C5961b c5961b, long j) throws IOException {
        m23144l(c5961b.m23170b(), j);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: c */
    public InterfaceC5965d mo15510c(C5961b c5961b, int i) throws IOException {
        m23145k(c5961b.m23170b(), i);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC5967f mo15764d(String str) throws IOException {
        m23146j(str);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC5967f mo15763e(boolean z) throws IOException {
        m23141o(z);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5965d
    /* renamed from: f */
    public InterfaceC5965d mo15507f(C5961b c5961b, Object obj) throws IOException {
        return m23143m(c5961b.m23170b(), obj);
    }

    /* renamed from: g */
    public C5976e m23149g(int i) throws IOException {
        m23134v();
        this.f14625c.value(i);
        return this;
    }

    /* renamed from: h */
    public C5976e m23148h(long j) throws IOException {
        m23134v();
        this.f14625c.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C5976e m23147i(Object obj, boolean z) throws IOException {
        int[] iArr;
        int i = 0;
        if (z && m23139q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f14625c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f14625c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                m23140p((byte[]) obj);
                return this;
            }
            this.f14625c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f14625c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    m23148h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f14625c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f14625c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m23147i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m23147i(obj2, false);
                }
            }
            this.f14625c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f14625c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m23147i(obj3, false);
            }
            this.f14625c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f14625c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m23143m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f14625c.endObject();
            return this;
        } else {
            InterfaceC5964c<?> interfaceC5964c = this.f14626d.get(obj.getClass());
            if (interfaceC5964c != null) {
                m23137s(interfaceC5964c, obj, z);
                return this;
            }
            InterfaceC5966e<?> interfaceC5966e = this.f14627e.get(obj.getClass());
            if (interfaceC5966e != null) {
                interfaceC5966e.mo23151a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                m23146j(((Enum) obj).name());
                return this;
            } else {
                m23137s(this.f14628f, obj, z);
                return this;
            }
        }
    }

    /* renamed from: j */
    public C5976e m23146j(String str) throws IOException {
        m23134v();
        this.f14625c.value(str);
        return this;
    }

    /* renamed from: k */
    public C5976e m23145k(String str, int i) throws IOException {
        m23134v();
        this.f14625c.name(str);
        m23149g(i);
        return this;
    }

    /* renamed from: l */
    public C5976e m23144l(String str, long j) throws IOException {
        m23134v();
        this.f14625c.name(str);
        m23148h(j);
        return this;
    }

    /* renamed from: m */
    public C5976e m23143m(String str, Object obj) throws IOException {
        if (this.f14629g) {
            return m23135u(str, obj);
        }
        return m23136t(str, obj);
    }

    /* renamed from: n */
    public C5976e m23142n(String str, boolean z) throws IOException {
        m23134v();
        this.f14625c.name(str);
        m23141o(z);
        return this;
    }

    /* renamed from: o */
    public C5976e m23141o(boolean z) throws IOException {
        m23134v();
        this.f14625c.value(z);
        return this;
    }

    /* renamed from: p */
    public C5976e m23140p(byte[] bArr) throws IOException {
        m23134v();
        if (bArr == null) {
            this.f14625c.nullValue();
        } else {
            this.f14625c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m23138r() throws IOException {
        m23134v();
        this.f14625c.flush();
    }

    /* renamed from: s */
    C5976e m23137s(InterfaceC5964c<Object> interfaceC5964c, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f14625c.beginObject();
        }
        interfaceC5964c.mo15475a(obj, this);
        if (!z) {
            this.f14625c.endObject();
        }
        return this;
    }
}
