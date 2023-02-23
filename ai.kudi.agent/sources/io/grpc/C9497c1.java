package io.grpc;

import com.google.common.base.C5034d;
import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import com.google.common.base.C5059s;
import io.grpc.C10049s0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
/* compiled from: Status.java */
/* renamed from: io.grpc.c1 */
/* loaded from: classes2.dex */
public final class C9497c1 {

    /* renamed from: d */
    private static final boolean f22185d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));

    /* renamed from: e */
    private static final List<C9497c1> f22186e = m14589g();

    /* renamed from: f */
    public static final C9497c1 f22187f = EnumC9499b.OK.m14576b();

    /* renamed from: g */
    public static final C9497c1 f22188g = EnumC9499b.CANCELLED.m14576b();

    /* renamed from: h */
    public static final C9497c1 f22189h = EnumC9499b.UNKNOWN.m14576b();

    /* renamed from: i */
    public static final C9497c1 f22190i;

    /* renamed from: j */
    public static final C9497c1 f22191j;

    /* renamed from: k */
    public static final C9497c1 f22192k;

    /* renamed from: l */
    public static final C9497c1 f22193l;

    /* renamed from: m */
    public static final C9497c1 f22194m;

    /* renamed from: n */
    public static final C9497c1 f22195n;

    /* renamed from: o */
    static final C10049s0.AbstractC10055f<C9497c1> f22196o;

    /* renamed from: p */
    private static final C10049s0.InterfaceC10058i<String> f22197p;

    /* renamed from: q */
    static final C10049s0.AbstractC10055f<String> f22198q;

    /* renamed from: a */
    private final EnumC9499b f22199a;

    /* renamed from: b */
    private final String f22200b;

    /* renamed from: c */
    private final Throwable f22201c;

    /* compiled from: Status.java */
    /* renamed from: io.grpc.c1$b */
    /* loaded from: classes2.dex */
    public enum EnumC9499b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: c */
        private final int f22220c;

        /* renamed from: d */
        private final byte[] f22221d;

        EnumC9499b(int i) {
            this.f22220c = i;
            this.f22221d = Integer.toString(i).getBytes(C5034d.f12685a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public byte[] m14574g() {
            return this.f22221d;
        }

        /* renamed from: b */
        public C9497c1 m14576b() {
            return (C9497c1) C9497c1.f22186e.get(this.f22220c);
        }

        /* renamed from: e */
        public int m14575e() {
            return this.f22220c;
        }
    }

    /* compiled from: Status.java */
    /* renamed from: io.grpc.c1$c */
    /* loaded from: classes2.dex */
    private static final class C9500c implements C10049s0.InterfaceC10058i<C9497c1> {
        private C9500c() {
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: c */
        public C9497c1 mo13172b(byte[] bArr) {
            return C9497c1.m14586j(bArr);
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: d */
        public byte[] mo13173a(C9497c1 c9497c1) {
            return c9497c1.m14582n().m14574g();
        }
    }

    /* compiled from: Status.java */
    /* renamed from: io.grpc.c1$d */
    /* loaded from: classes2.dex */
    private static final class C9501d implements C10049s0.InterfaceC10058i<String> {

        /* renamed from: a */
        private static final byte[] f22222a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private C9501d() {
        }

        /* renamed from: c */
        private static boolean m14571c(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        /* renamed from: e */
        private static String m14569e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == 37 && i + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, C5034d.f12685a), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i]);
                i++;
            }
            return new String(allocate.array(), 0, allocate.position(), C5034d.f12686b);
        }

        /* renamed from: g */
        private static byte[] m14567g(byte[] bArr, int i) {
            byte[] bArr2 = new byte[((bArr.length - i) * 3) + i];
            if (i != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            int i2 = i;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (m14571c(b)) {
                    bArr2[i2] = 37;
                    byte[] bArr3 = f22222a;
                    bArr2[i2 + 1] = bArr3[(b >> 4) & 15];
                    bArr2[i2 + 2] = bArr3[b & 15];
                    i2 += 3;
                } else {
                    bArr2[i2] = b;
                    i2++;
                }
                i++;
            }
            return Arrays.copyOf(bArr2, i2);
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: d */
        public String mo13172b(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    return m14569e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: f */
        public byte[] mo13173a(String str) {
            byte[] bytes = str.getBytes(C5034d.f12686b);
            for (int i = 0; i < bytes.length; i++) {
                if (m14571c(bytes[i])) {
                    return m14567g(bytes, i);
                }
            }
            return bytes;
        }
    }

    static {
        EnumC9499b.INVALID_ARGUMENT.m14576b();
        f22190i = EnumC9499b.DEADLINE_EXCEEDED.m14576b();
        EnumC9499b.NOT_FOUND.m14576b();
        EnumC9499b.ALREADY_EXISTS.m14576b();
        f22191j = EnumC9499b.PERMISSION_DENIED.m14576b();
        f22192k = EnumC9499b.UNAUTHENTICATED.m14576b();
        f22193l = EnumC9499b.RESOURCE_EXHAUSTED.m14576b();
        EnumC9499b.FAILED_PRECONDITION.m14576b();
        EnumC9499b.ABORTED.m14576b();
        EnumC9499b.OUT_OF_RANGE.m14576b();
        EnumC9499b.UNIMPLEMENTED.m14576b();
        f22194m = EnumC9499b.INTERNAL.m14576b();
        f22195n = EnumC9499b.UNAVAILABLE.m14576b();
        EnumC9499b.DATA_LOSS.m14576b();
        f22196o = C10049s0.AbstractC10055f.m13183g("grpc-status", false, new C9500c());
        C9501d c9501d = new C9501d();
        f22197p = c9501d;
        f22198q = C10049s0.AbstractC10055f.m13183g("grpc-message", false, c9501d);
    }

    private C9497c1(EnumC9499b enumC9499b) {
        this(enumC9499b, null, null);
    }

    /* renamed from: g */
    private static List<C9497c1> m14589g() {
        EnumC9499b[] values;
        C9497c1 c9497c1;
        TreeMap treeMap = new TreeMap();
        for (EnumC9499b enumC9499b : EnumC9499b.values()) {
            if (((C9497c1) treeMap.put(Integer.valueOf(enumC9499b.m14575e()), new C9497c1(enumC9499b))) != null) {
                throw new IllegalStateException("Code value duplication between " + c9497c1.m14582n().name() + " & " + enumC9499b.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m14588h(C9497c1 c9497c1) {
        if (c9497c1.f22200b == null) {
            return c9497c1.f22199a.toString();
        }
        return c9497c1.f22199a + ": " + c9497c1.f22200b;
    }

    /* renamed from: i */
    public static C9497c1 m14587i(int i) {
        if (i >= 0 && i <= f22186e.size()) {
            return f22186e.get(i);
        }
        C9497c1 c9497c1 = f22189h;
        return c9497c1.m14578r("Unknown code " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static C9497c1 m14586j(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f22187f;
        }
        return m14585k(bArr);
    }

    /* renamed from: k */
    private static C9497c1 m14585k(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length;
        char c = 1;
        if (length != 1) {
            i = (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) ? 0 + ((bArr[0] - 48) * 10) : 0;
            C9497c1 c9497c1 = f22189h;
            return c9497c1.m14578r("Unknown code " + new String(bArr, C5034d.f12685a));
        }
        c = 0;
        if (bArr[c] >= 48 && bArr[c] <= 57 && (i2 = i + (bArr[c] - 48)) < f22186e.size()) {
            return f22186e.get(i2);
        }
        C9497c1 c9497c12 = f22189h;
        return c9497c12.m14578r("Unknown code " + new String(bArr, C5034d.f12685a));
    }

    /* renamed from: l */
    public static C9497c1 m14584l(Throwable th) {
        C5051n.m25779o(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).m14635a();
            }
            if (th2 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th2).m14633a();
            }
        }
        return f22189h.m14579q(th);
    }

    /* renamed from: c */
    public StatusException m14593c() {
        return new StatusException(this);
    }

    /* renamed from: d */
    public StatusRuntimeException m14592d() {
        return new StatusRuntimeException(this);
    }

    /* renamed from: e */
    public StatusRuntimeException m14591e(C10049s0 c10049s0) {
        return new StatusRuntimeException(this, c10049s0);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public C9497c1 m14590f(String str) {
        if (str == null) {
            return this;
        }
        if (this.f22200b == null) {
            return new C9497c1(this.f22199a, str, this.f22201c);
        }
        EnumC9499b enumC9499b = this.f22199a;
        return new C9497c1(enumC9499b, this.f22200b + "\n" + str, this.f22201c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public Throwable m14583m() {
        return this.f22201c;
    }

    /* renamed from: n */
    public EnumC9499b m14582n() {
        return this.f22199a;
    }

    /* renamed from: o */
    public String m14581o() {
        return this.f22200b;
    }

    /* renamed from: p */
    public boolean m14580p() {
        return EnumC9499b.OK == this.f22199a;
    }

    /* renamed from: q */
    public C9497c1 m14579q(Throwable th) {
        return C5046k.m25800a(this.f22201c, th) ? this : new C9497c1(this.f22199a, this.f22200b, th);
    }

    /* renamed from: r */
    public C9497c1 m14578r(String str) {
        return C5046k.m25800a(this.f22200b, str) ? this : new C9497c1(this.f22199a, str, this.f22201c);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("code", this.f22199a.name());
        m25812c.m25808d("description", this.f22200b);
        Throwable th = this.f22201c;
        String str = th;
        if (th != null) {
            str = C5059s.m25751e(th);
        }
        m25812c.m25808d("cause", str);
        return m25812c.toString();
    }

    private C9497c1(EnumC9499b enumC9499b, String str, Throwable th) {
        C5051n.m25779o(enumC9499b, "code");
        this.f22199a = enumC9499b;
        this.f22200b = str;
        this.f22201c = th;
    }
}
