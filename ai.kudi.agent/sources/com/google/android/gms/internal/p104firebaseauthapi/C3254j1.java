package com.google.android.gms.internal.p104firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j1 */
/* loaded from: classes2.dex */
public final class C3254j1 {

    /* renamed from: a */
    private static final Unsafe f8615a = m30922l();

    /* renamed from: b */
    private static final Class<?> f8616b = C3616wn.m30073a();

    /* renamed from: c */
    private static final boolean f8617c = m30938A(Long.TYPE);

    /* renamed from: d */
    private static final boolean f8618d;

    /* renamed from: e */
    private static final AbstractC3227i1 f8619e;

    /* renamed from: f */
    private static final boolean f8620f;

    /* renamed from: g */
    private static final boolean f8621g;

    /* renamed from: h */
    static final long f8622h;

    /* renamed from: i */
    static final boolean f8623i;

    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014e  */
    static {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3254j1.<clinit>():void");
    }

    private C3254j1() {
    }

    /* renamed from: A */
    static boolean m30938A(Class<?> cls) {
        int i = C3616wn.f9068a;
        try {
            Class<?> cls2 = f8616b;
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
    public static boolean m30937B(Object obj, long j) {
        return f8619e.mo30994g(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m30936C() {
        return f8621g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m30935D() {
        return f8620f;
    }

    /* renamed from: E */
    private static int m30934E(Class<?> cls) {
        if (f8621g) {
            return f8619e.m30993h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m30933a(Class<?> cls) {
        if (f8621g) {
            return f8619e.m30992i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m30932b() {
        int i = C3616wn.f9068a;
        Field m30931c = m30931c(Buffer.class, "effectiveDirectAddress");
        if (m30931c == null) {
            Field m30931c2 = m30931c(Buffer.class, "address");
            if (m30931c2 == null || m30931c2.getType() != Long.TYPE) {
                return null;
            }
            return m30931c2;
        }
        return m30931c;
    }

    /* renamed from: c */
    private static Field m30931c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m30930d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        int i2 = (b & 255) << i;
        f8619e.m30987n(obj, j2, i2 | (f8619e.m30991j(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m30929e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        f8619e.m30987n(obj, j2, i2 | (f8619e.m30991j(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m30928f(Object obj, long j) {
        return f8619e.mo31000a(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m30927g(Object obj, long j) {
        return f8619e.mo30999b(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m30926h(Object obj, long j) {
        return f8619e.m30991j(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m30925i(Object obj, long j) {
        return f8619e.m30990k(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static <T> T m30924j(Class<T> cls) {
        try {
            return (T) f8615a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m30923k(Object obj, long j) {
        return f8619e.m30988m(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m30922l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3146f1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m30921m(Throwable th) {
        Logger logger = Logger.getLogger(C3254j1.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m30916r(Object obj, long j, boolean z) {
        f8619e.mo30998c(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m30915s(byte[] bArr, long j, byte b) {
        f8619e.mo30997d(bArr, f8622h + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m30914t(Object obj, long j, double d) {
        f8619e.mo30996e(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m30913u(Object obj, long j, float f) {
        f8619e.mo30995f(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m30912v(Object obj, long j, int i) {
        f8619e.m30987n(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m30911w(Object obj, long j, long j2) {
        f8619e.m30986o(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m30910x(Object obj, long j, Object obj2) {
        f8619e.m30985p(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ boolean m30909y(Object obj, long j) {
        return ((byte) ((f8619e.m30991j(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ boolean m30908z(Object obj, long j) {
        return ((byte) ((f8619e.m30991j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
