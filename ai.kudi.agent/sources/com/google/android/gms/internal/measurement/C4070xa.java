package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.xa */
/* loaded from: classes2.dex */
final class C4070xa {

    /* renamed from: a */
    private static final Unsafe f9841a = m28636l();

    /* renamed from: b */
    private static final Class<?> f9842b = C3737c7.m29715a();

    /* renamed from: c */
    private static final boolean f9843c = m28652A(Long.TYPE);

    /* renamed from: d */
    private static final boolean f9844d;

    /* renamed from: e */
    private static final AbstractC4054wa f9845e;

    /* renamed from: f */
    private static final boolean f9846f;

    /* renamed from: g */
    private static final boolean f9847g;

    /* renamed from: h */
    static final long f9848h;

    /* renamed from: i */
    static final boolean f9849i;

    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014e  */
    static {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4070xa.<clinit>():void");
    }

    private C4070xa() {
    }

    /* renamed from: A */
    static boolean m28652A(Class<?> cls) {
        int i = C3737c7.f9222a;
        try {
            Class<?> cls2 = f9842b;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m28651B(Object obj, long j) {
        return f9845e.mo28683g(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m28650C() {
        return f9847g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m28649D() {
        return f9846f;
    }

    /* renamed from: E */
    private static int m28648E(Class<?> cls) {
        if (f9847g) {
            return f9845e.m28682h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m28647a(Class<?> cls) {
        if (f9847g) {
            return f9845e.m28681i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m28646b() {
        int i = C3737c7.f9222a;
        Field m28645c = m28645c(Buffer.class, "effectiveDirectAddress");
        if (m28645c == null) {
            Field m28645c2 = m28645c(Buffer.class, "address");
            if (m28645c2 == null || m28645c2.getType() != Long.TYPE) {
                return null;
            }
            return m28645c2;
        }
        return m28645c;
    }

    /* renamed from: c */
    private static Field m28645c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m28644d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        int i2 = (b & 255) << i;
        f9845e.m28676n(obj, j2, i2 | (f9845e.m28680j(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m28643e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        f9845e.m28676n(obj, j2, i2 | (f9845e.m28680j(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m28642f(Object obj, long j) {
        return f9845e.mo28689a(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m28641g(Object obj, long j) {
        return f9845e.mo28688b(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m28640h(Object obj, long j) {
        return f9845e.m28680j(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m28639i(Object obj, long j) {
        return f9845e.m28679k(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static <T> T m28638j(Class<T> cls) {
        try {
            return (T) f9841a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m28637k(Object obj, long j) {
        return f9845e.m28677m(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m28636l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4006ta());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m28635m(Throwable th) {
        Logger.getLogger(C4070xa.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m28630r(Object obj, long j, boolean z) {
        f9845e.mo28687c(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m28629s(byte[] bArr, long j, byte b) {
        f9845e.mo28686d(bArr, f9848h + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m28628t(Object obj, long j, double d) {
        f9845e.mo28685e(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m28627u(Object obj, long j, float f) {
        f9845e.mo28684f(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m28626v(Object obj, long j, int i) {
        f9845e.m28676n(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m28625w(Object obj, long j, long j2) {
        f9845e.m28675o(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m28624x(Object obj, long j, Object obj2) {
        f9845e.m28674p(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ boolean m28623y(Object obj, long j) {
        return ((byte) ((f9845e.m28680j(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ boolean m28622z(Object obj, long j) {
        return ((byte) ((f9845e.m28680j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
