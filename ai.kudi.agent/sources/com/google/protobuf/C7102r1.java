package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnsafeUtil.java */
/* renamed from: com.google.protobuf.r1 */
/* loaded from: classes2.dex */
public final class C7102r1 {

    /* renamed from: a */
    private static final Unsafe f16931a = m19699H();

    /* renamed from: b */
    private static final Class<?> f16932b = C7014d.m20217b();

    /* renamed from: c */
    private static final boolean f16933c = m19666q(Long.TYPE);

    /* renamed from: d */
    private static final boolean f16934d = m19666q(Integer.TYPE);

    /* renamed from: e */
    private static final AbstractC7107e f16935e = m19701F();

    /* renamed from: f */
    private static final boolean f16936f = m19683X();

    /* renamed from: g */
    private static final boolean f16937g = m19684W();

    /* renamed from: h */
    static final long f16938h = m19670m(byte[].class);

    /* renamed from: i */
    private static final long f16939i;

    /* renamed from: j */
    static final boolean f16940j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnsafeUtil.java */
    /* renamed from: com.google.protobuf.r1$a */
    /* loaded from: classes2.dex */
    public static class C7103a implements PrivilegedExceptionAction<Unsafe> {
        C7103a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* renamed from: com.google.protobuf.r1$b */
    /* loaded from: classes2.dex */
    public static final class C7104b extends AbstractC7107e {
        C7104b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: c */
        public void mo19653c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: d */
        public boolean mo19652d(Object obj, long j) {
            return C7102r1.f16940j ? C7102r1.m19662u(obj, j) : C7102r1.m19661v(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: e */
        public byte mo19651e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: f */
        public byte mo19650f(Object obj, long j) {
            return C7102r1.f16940j ? C7102r1.m19658y(obj, j) : C7102r1.m19657z(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: g */
        public double mo19649g(Object obj, long j) {
            return Double.longBitsToDouble(m19645k(obj, j));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: h */
        public float mo19648h(Object obj, long j) {
            return Float.intBitsToFloat(m19647i(obj, j));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: j */
        public long mo19646j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: n */
        public void mo19642n(Object obj, long j, boolean z) {
            if (C7102r1.f16940j) {
                C7102r1.m19694M(obj, j, z);
            } else {
                C7102r1.m19693N(obj, j, z);
            }
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: o */
        public void mo19641o(Object obj, long j, byte b) {
            if (C7102r1.f16940j) {
                C7102r1.m19691P(obj, j, b);
            } else {
                C7102r1.m19690Q(obj, j, b);
            }
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: p */
        public void mo19640p(Object obj, long j, double d) {
            m19637s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: q */
        public void mo19639q(Object obj, long j, float f) {
            m19638r(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: v */
        public boolean mo19634v() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* renamed from: com.google.protobuf.r1$c */
    /* loaded from: classes2.dex */
    public static final class C7105c extends AbstractC7107e {
        C7105c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: c */
        public void mo19653c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: d */
        public boolean mo19652d(Object obj, long j) {
            return C7102r1.f16940j ? C7102r1.m19662u(obj, j) : C7102r1.m19661v(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: e */
        public byte mo19651e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: f */
        public byte mo19650f(Object obj, long j) {
            return C7102r1.f16940j ? C7102r1.m19658y(obj, j) : C7102r1.m19657z(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: g */
        public double mo19649g(Object obj, long j) {
            return Double.longBitsToDouble(m19645k(obj, j));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: h */
        public float mo19648h(Object obj, long j) {
            return Float.intBitsToFloat(m19647i(obj, j));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: j */
        public long mo19646j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: n */
        public void mo19642n(Object obj, long j, boolean z) {
            if (C7102r1.f16940j) {
                C7102r1.m19694M(obj, j, z);
            } else {
                C7102r1.m19693N(obj, j, z);
            }
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: o */
        public void mo19641o(Object obj, long j, byte b) {
            if (C7102r1.f16940j) {
                C7102r1.m19691P(obj, j, b);
            } else {
                C7102r1.m19690Q(obj, j, b);
            }
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: p */
        public void mo19640p(Object obj, long j, double d) {
            m19637s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: q */
        public void mo19639q(Object obj, long j, float f) {
            m19638r(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: v */
        public boolean mo19634v() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* renamed from: com.google.protobuf.r1$d */
    /* loaded from: classes2.dex */
    public static final class C7106d extends AbstractC7107e {
        C7106d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: c */
        public void mo19653c(long j, byte[] bArr, long j2, long j3) {
            this.f16941a.copyMemory((Object) null, j, bArr, C7102r1.f16938h + j2, j3);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: d */
        public boolean mo19652d(Object obj, long j) {
            return this.f16941a.getBoolean(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: e */
        public byte mo19651e(long j) {
            return this.f16941a.getByte(j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: f */
        public byte mo19650f(Object obj, long j) {
            return this.f16941a.getByte(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: g */
        public double mo19649g(Object obj, long j) {
            return this.f16941a.getDouble(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: h */
        public float mo19648h(Object obj, long j) {
            return this.f16941a.getFloat(obj, j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: j */
        public long mo19646j(long j) {
            return this.f16941a.getLong(j);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: n */
        public void mo19642n(Object obj, long j, boolean z) {
            this.f16941a.putBoolean(obj, j, z);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: o */
        public void mo19641o(Object obj, long j, byte b) {
            this.f16941a.putByte(obj, j, b);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: p */
        public void mo19640p(Object obj, long j, double d) {
            this.f16941a.putDouble(obj, j, d);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: q */
        public void mo19639q(Object obj, long j, float f) {
            this.f16941a.putFloat(obj, j, f);
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: u */
        public boolean mo19635u() {
            if (super.mo19635u()) {
                try {
                    Class<?> cls = this.f16941a.getClass();
                    cls.getMethod("getByte", Object.class, Long.TYPE);
                    cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, Long.TYPE);
                    cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, Long.TYPE);
                    cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, Long.TYPE);
                    cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    C7102r1.m19696K(th);
                    return false;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.C7102r1.AbstractC7107e
        /* renamed from: v */
        public boolean mo19634v() {
            if (super.mo19634v()) {
                try {
                    Class<?> cls = this.f16941a.getClass();
                    cls.getMethod("getByte", Long.TYPE);
                    cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
                    cls.getMethod("getInt", Long.TYPE);
                    cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
                    cls.getMethod("getLong", Long.TYPE);
                    cls.getMethod("putLong", Long.TYPE, Long.TYPE);
                    cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
                    cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                    return true;
                } catch (Throwable th) {
                    C7102r1.m19696K(th);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* renamed from: com.google.protobuf.r1$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7107e {

        /* renamed from: a */
        Unsafe f16941a;

        AbstractC7107e(Unsafe unsafe) {
            this.f16941a = unsafe;
        }

        /* renamed from: a */
        public final int m19655a(Class<?> cls) {
            return this.f16941a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m19654b(Class<?> cls) {
            return this.f16941a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo19653c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo19652d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo19651e(long j);

        /* renamed from: f */
        public abstract byte mo19650f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo19649g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo19648h(Object obj, long j);

        /* renamed from: i */
        public final int m19647i(Object obj, long j) {
            return this.f16941a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo19646j(long j);

        /* renamed from: k */
        public final long m19645k(Object obj, long j) {
            return this.f16941a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object m19644l(Object obj, long j) {
            return this.f16941a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long m19643m(Field field) {
            return this.f16941a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo19642n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo19641o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo19640p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo19639q(Object obj, long j, float f);

        /* renamed from: r */
        public final void m19638r(Object obj, long j, int i) {
            this.f16941a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void m19637s(Object obj, long j, long j2) {
            this.f16941a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void m19636t(Object obj, long j, Object obj2) {
            this.f16941a.putObject(obj, j, obj2);
        }

        /* renamed from: u */
        public boolean mo19635u() {
            Unsafe unsafe = this.f16941a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                cls.getMethod("getInt", Object.class, Long.TYPE);
                cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls.getMethod("getObject", Object.class, Long.TYPE);
                cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                return true;
            } catch (Throwable th) {
                C7102r1.m19696K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo19634v() {
            Unsafe unsafe = this.f16941a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return C7102r1.m19668o() != null;
            } catch (Throwable th) {
                C7102r1.m19696K(th);
                return false;
            }
        }
    }

    static {
        m19670m(boolean[].class);
        m19669n(boolean[].class);
        m19670m(int[].class);
        m19669n(int[].class);
        m19670m(long[].class);
        m19669n(long[].class);
        m19670m(float[].class);
        m19669n(float[].class);
        m19670m(double[].class);
        m19669n(double[].class);
        m19670m(Object[].class);
        m19669n(Object[].class);
        f16939i = m19664s(m19668o());
        f16940j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C7102r1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static double m19706A(Object obj, long j) {
        return f16935e.mo19649g(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static float m19705B(Object obj, long j) {
        return f16935e.mo19648h(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static int m19704C(Object obj, long j) {
        return f16935e.m19647i(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static long m19703D(long j) {
        return f16935e.mo19646j(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static long m19702E(Object obj, long j) {
        return f16935e.m19645k(obj, j);
    }

    /* renamed from: F */
    private static AbstractC7107e m19701F() {
        if (f16931a == null) {
            return null;
        }
        if (C7014d.m20216c()) {
            if (f16933c) {
                return new C7105c(f16931a);
            }
            if (f16934d) {
                return new C7104b(f16931a);
            }
            return null;
        }
        return new C7106d(f16931a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static Object m19700G(Object obj, long j) {
        return f16935e.m19644l(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static Unsafe m19699H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7103a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static boolean m19698I() {
        return f16937g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static boolean m19697J() {
        return f16936f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static void m19696K(Throwable th) {
        Logger logger = Logger.getLogger(C7102r1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static void m19695L(Object obj, long j, boolean z) {
        f16935e.mo19642n(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static void m19694M(Object obj, long j, boolean z) {
        m19691P(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static void m19693N(Object obj, long j, boolean z) {
        m19690Q(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static void m19692O(byte[] bArr, long j, byte b) {
        f16935e.mo19641o(bArr, f16938h + j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static void m19691P(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        m19687T(obj, j2, ((255 & b) << i) | (m19704C(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static void m19690Q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m19687T(obj, j2, ((255 & b) << i) | (m19704C(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static void m19689R(Object obj, long j, double d) {
        f16935e.mo19640p(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static void m19688S(Object obj, long j, float f) {
        f16935e.mo19639q(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static void m19687T(Object obj, long j, int i) {
        f16935e.m19638r(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static void m19686U(Object obj, long j, long j2) {
        f16935e.m19637s(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static void m19685V(Object obj, long j, Object obj2) {
        f16935e.m19636t(obj, j, obj2);
    }

    /* renamed from: W */
    private static boolean m19684W() {
        AbstractC7107e abstractC7107e = f16935e;
        if (abstractC7107e == null) {
            return false;
        }
        return abstractC7107e.mo19635u();
    }

    /* renamed from: X */
    private static boolean m19683X() {
        AbstractC7107e abstractC7107e = f16935e;
        if (abstractC7107e == null) {
            return false;
        }
        return abstractC7107e.mo19634v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static long m19672k(ByteBuffer byteBuffer) {
        return f16935e.m19645k(byteBuffer, f16939i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static <T> T m19671l(Class<T> cls) {
        try {
            return (T) f16931a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: m */
    private static int m19670m(Class<?> cls) {
        if (f16937g) {
            return f16935e.m19655a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    private static int m19669n(Class<?> cls) {
        if (f16937g) {
            return f16935e.m19654b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static Field m19668o() {
        Field m19665r;
        if (!C7014d.m20216c() || (m19665r = m19665r(Buffer.class, "effectiveDirectAddress")) == null) {
            Field m19665r2 = m19665r(Buffer.class, "address");
            if (m19665r2 == null || m19665r2.getType() != Long.TYPE) {
                return null;
            }
            return m19665r2;
        }
        return m19665r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static void m19667p(long j, byte[] bArr, long j2, long j3) {
        f16935e.mo19653c(j, bArr, j2, j3);
    }

    /* renamed from: q */
    static boolean m19666q(Class<?> cls) {
        if (C7014d.m20216c()) {
            try {
                Class<?> cls2 = f16932b;
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
        return false;
    }

    /* renamed from: r */
    private static Field m19665r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    private static long m19664s(Field field) {
        AbstractC7107e abstractC7107e;
        if (field == null || (abstractC7107e = f16935e) == null) {
            return -1L;
        }
        return abstractC7107e.m19643m(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static boolean m19663t(Object obj, long j) {
        return f16935e.mo19652d(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static boolean m19662u(Object obj, long j) {
        return m19658y(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static boolean m19661v(Object obj, long j) {
        return m19657z(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static byte m19660w(long j) {
        return f16935e.mo19651e(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static byte m19659x(byte[] bArr, long j) {
        return f16935e.mo19650f(bArr, f16938h + j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static byte m19658y(Object obj, long j) {
        return (byte) ((m19704C(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static byte m19657z(Object obj, long j) {
        return (byte) ((m19704C(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }
}
