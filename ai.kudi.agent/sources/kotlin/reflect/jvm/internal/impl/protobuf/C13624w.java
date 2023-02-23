package kotlin.reflect.jvm.internal.impl.protobuf;
/* compiled from: WireFormat.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w */
/* loaded from: classes3.dex */
public final class C13624w {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WireFormat.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b */
    /* loaded from: classes3.dex */
    public static class EnumC13626b {

        /* renamed from: L */
        public static final EnumC13626b f30043L;

        /* renamed from: M */
        private static final /* synthetic */ EnumC13626b[] f30044M;

        /* renamed from: c */
        private final EnumC13631c f30051c;

        /* renamed from: d */
        private final int f30052d;

        /* renamed from: e */
        public static final EnumC13626b f30045e = new EnumC13626b("DOUBLE", 0, EnumC13631c.DOUBLE, 1);

        /* renamed from: f */
        public static final EnumC13626b f30046f = new EnumC13626b("FLOAT", 1, EnumC13631c.FLOAT, 5);

        /* renamed from: w */
        public static final EnumC13626b f30047w = new EnumC13626b("INT64", 2, EnumC13631c.LONG, 0);

        /* renamed from: x */
        public static final EnumC13626b f30048x = new EnumC13626b("UINT64", 3, EnumC13631c.LONG, 0);

        /* renamed from: y */
        public static final EnumC13626b f30049y = new EnumC13626b("INT32", 4, EnumC13631c.INT, 0);

        /* renamed from: z */
        public static final EnumC13626b f30050z = new EnumC13626b("FIXED64", 5, EnumC13631c.LONG, 1);

        /* renamed from: A */
        public static final EnumC13626b f30032A = new EnumC13626b("FIXED32", 6, EnumC13631c.INT, 5);

        /* renamed from: B */
        public static final EnumC13626b f30033B = new EnumC13626b("BOOL", 7, EnumC13631c.BOOLEAN, 0);

        /* renamed from: C */
        public static final EnumC13626b f30034C = new C13627a("STRING", 8, EnumC13631c.STRING, 2);

        /* renamed from: D */
        public static final EnumC13626b f30035D = new C13628b("GROUP", 9, EnumC13631c.MESSAGE, 3);

        /* renamed from: E */
        public static final EnumC13626b f30036E = new C13629c("MESSAGE", 10, EnumC13631c.MESSAGE, 2);

        /* renamed from: F */
        public static final EnumC13626b f30037F = new C13630d("BYTES", 11, EnumC13631c.BYTE_STRING, 2);

        /* renamed from: G */
        public static final EnumC13626b f30038G = new EnumC13626b("UINT32", 12, EnumC13631c.INT, 0);

        /* renamed from: H */
        public static final EnumC13626b f30039H = new EnumC13626b("ENUM", 13, EnumC13631c.ENUM, 0);

        /* renamed from: I */
        public static final EnumC13626b f30040I = new EnumC13626b("SFIXED32", 14, EnumC13631c.INT, 5);

        /* renamed from: J */
        public static final EnumC13626b f30041J = new EnumC13626b("SFIXED64", 15, EnumC13631c.LONG, 1);

        /* renamed from: K */
        public static final EnumC13626b f30042K = new EnumC13626b("SINT32", 16, EnumC13631c.INT, 0);

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$a */
        /* loaded from: classes3.dex */
        enum C13627a extends EnumC13626b {
            C13627a(String str, int i, EnumC13631c enumC13631c, int i2) {
                super(str, i, enumC13631c, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13624w.EnumC13626b
            /* renamed from: e */
            public boolean mo4296e() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$b */
        /* loaded from: classes3.dex */
        enum C13628b extends EnumC13626b {
            C13628b(String str, int i, EnumC13631c enumC13631c, int i2) {
                super(str, i, enumC13631c, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13624w.EnumC13626b
            /* renamed from: e */
            public boolean mo4296e() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$c */
        /* loaded from: classes3.dex */
        enum C13629c extends EnumC13626b {
            C13629c(String str, int i, EnumC13631c enumC13631c, int i2) {
                super(str, i, enumC13631c, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13624w.EnumC13626b
            /* renamed from: e */
            public boolean mo4296e() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$d */
        /* loaded from: classes3.dex */
        enum C13630d extends EnumC13626b {
            C13630d(String str, int i, EnumC13631c enumC13631c, int i2) {
                super(str, i, enumC13631c, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13624w.EnumC13626b
            /* renamed from: e */
            public boolean mo4296e() {
                return false;
            }
        }

        static {
            EnumC13626b enumC13626b = new EnumC13626b("SINT64", 17, EnumC13631c.LONG, 0);
            f30043L = enumC13626b;
            f30044M = new EnumC13626b[]{f30045e, f30046f, f30047w, f30048x, f30049y, f30050z, f30032A, f30033B, f30034C, f30035D, f30036E, f30037F, f30038G, f30039H, f30040I, f30041J, f30042K, enumC13626b};
        }

        public static EnumC13626b valueOf(String str) {
            return (EnumC13626b) Enum.valueOf(EnumC13626b.class, str);
        }

        public static EnumC13626b[] values() {
            return (EnumC13626b[]) f30044M.clone();
        }

        /* renamed from: a */
        public EnumC13631c m4298a() {
            return this.f30051c;
        }

        /* renamed from: b */
        public int m4297b() {
            return this.f30052d;
        }

        /* renamed from: e */
        public boolean mo4296e() {
            return true;
        }

        private EnumC13626b(String str, int i, EnumC13631c enumC13631c, int i2) {
            this.f30051c = enumC13631c;
            this.f30052d = i2;
        }
    }

    /* compiled from: WireFormat.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$c */
    /* loaded from: classes3.dex */
    public enum EnumC13631c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC13570d.f29926c),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: c */
        private final Object f30063c;

        EnumC13631c(Object obj) {
            this.f30063c = obj;
        }
    }

    static {
        m4299c(1, 3);
        m4299c(1, 4);
        m4299c(2, 0);
        m4299c(3, 2);
    }

    /* renamed from: a */
    public static int m4301a(int i) {
        return i >>> 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m4300b(int i) {
        return i & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m4299c(int i, int i2) {
        return (i << 3) | i2;
    }
}
