package com.google.protobuf;
/* compiled from: WireFormat.java */
/* renamed from: com.google.protobuf.t1 */
/* loaded from: classes2.dex */
public final class C7118t1 {

    /* renamed from: a */
    static final int f16945a = m19562c(1, 3);

    /* renamed from: b */
    static final int f16946b = m19562c(1, 4);

    /* renamed from: c */
    static final int f16947c = m19562c(2, 0);

    /* renamed from: d */
    static final int f16948d = m19562c(3, 2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WireFormat.java */
    /* renamed from: com.google.protobuf.t1$b */
    /* loaded from: classes2.dex */
    public static class EnumC7120b {

        /* renamed from: L */
        public static final EnumC7120b f16960L;

        /* renamed from: M */
        private static final /* synthetic */ EnumC7120b[] f16961M;

        /* renamed from: c */
        private final EnumC7125c f16968c;

        /* renamed from: d */
        private final int f16969d;

        /* renamed from: e */
        public static final EnumC7120b f16962e = new EnumC7120b("DOUBLE", 0, EnumC7125c.DOUBLE, 1);

        /* renamed from: f */
        public static final EnumC7120b f16963f = new EnumC7120b("FLOAT", 1, EnumC7125c.FLOAT, 5);

        /* renamed from: w */
        public static final EnumC7120b f16964w = new EnumC7120b("INT64", 2, EnumC7125c.LONG, 0);

        /* renamed from: x */
        public static final EnumC7120b f16965x = new EnumC7120b("UINT64", 3, EnumC7125c.LONG, 0);

        /* renamed from: y */
        public static final EnumC7120b f16966y = new EnumC7120b("INT32", 4, EnumC7125c.INT, 0);

        /* renamed from: z */
        public static final EnumC7120b f16967z = new EnumC7120b("FIXED64", 5, EnumC7125c.LONG, 1);

        /* renamed from: A */
        public static final EnumC7120b f16949A = new EnumC7120b("FIXED32", 6, EnumC7125c.INT, 5);

        /* renamed from: B */
        public static final EnumC7120b f16950B = new EnumC7120b("BOOL", 7, EnumC7125c.BOOLEAN, 0);

        /* renamed from: C */
        public static final EnumC7120b f16951C = new C7121a("STRING", 8, EnumC7125c.STRING, 2);

        /* renamed from: D */
        public static final EnumC7120b f16952D = new C7122b("GROUP", 9, EnumC7125c.MESSAGE, 3);

        /* renamed from: E */
        public static final EnumC7120b f16953E = new C7123c("MESSAGE", 10, EnumC7125c.MESSAGE, 2);

        /* renamed from: F */
        public static final EnumC7120b f16954F = new C7124d("BYTES", 11, EnumC7125c.BYTE_STRING, 2);

        /* renamed from: G */
        public static final EnumC7120b f16955G = new EnumC7120b("UINT32", 12, EnumC7125c.INT, 0);

        /* renamed from: H */
        public static final EnumC7120b f16956H = new EnumC7120b("ENUM", 13, EnumC7125c.ENUM, 0);

        /* renamed from: I */
        public static final EnumC7120b f16957I = new EnumC7120b("SFIXED32", 14, EnumC7125c.INT, 5);

        /* renamed from: J */
        public static final EnumC7120b f16958J = new EnumC7120b("SFIXED64", 15, EnumC7125c.LONG, 1);

        /* renamed from: K */
        public static final EnumC7120b f16959K = new EnumC7120b("SINT32", 16, EnumC7125c.INT, 0);

        /* compiled from: WireFormat.java */
        /* renamed from: com.google.protobuf.t1$b$a */
        /* loaded from: classes2.dex */
        enum C7121a extends EnumC7120b {
            C7121a(String str, int i, EnumC7125c enumC7125c, int i2) {
                super(str, i, enumC7125c, i2);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: com.google.protobuf.t1$b$b */
        /* loaded from: classes2.dex */
        enum C7122b extends EnumC7120b {
            C7122b(String str, int i, EnumC7125c enumC7125c, int i2) {
                super(str, i, enumC7125c, i2);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: com.google.protobuf.t1$b$c */
        /* loaded from: classes2.dex */
        enum C7123c extends EnumC7120b {
            C7123c(String str, int i, EnumC7125c enumC7125c, int i2) {
                super(str, i, enumC7125c, i2);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: com.google.protobuf.t1$b$d */
        /* loaded from: classes2.dex */
        enum C7124d extends EnumC7120b {
            C7124d(String str, int i, EnumC7125c enumC7125c, int i2) {
                super(str, i, enumC7125c, i2);
            }
        }

        static {
            EnumC7120b enumC7120b = new EnumC7120b("SINT64", 17, EnumC7125c.LONG, 0);
            f16960L = enumC7120b;
            f16961M = new EnumC7120b[]{f16962e, f16963f, f16964w, f16965x, f16966y, f16967z, f16949A, f16950B, f16951C, f16952D, f16953E, f16954F, f16955G, f16956H, f16957I, f16958J, f16959K, enumC7120b};
        }

        public static EnumC7120b valueOf(String str) {
            return (EnumC7120b) Enum.valueOf(EnumC7120b.class, str);
        }

        public static EnumC7120b[] values() {
            return (EnumC7120b[]) f16961M.clone();
        }

        /* renamed from: a */
        public EnumC7125c m19561a() {
            return this.f16968c;
        }

        /* renamed from: b */
        public int m19560b() {
            return this.f16969d;
        }

        private EnumC7120b(String str, int i, EnumC7125c enumC7125c, int i2) {
            this.f16968c = enumC7125c;
            this.f16969d = i2;
        }
    }

    /* compiled from: WireFormat.java */
    /* renamed from: com.google.protobuf.t1$c */
    /* loaded from: classes2.dex */
    public enum EnumC7125c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC7039i.f16815d),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: c */
        private final Object f16980c;

        EnumC7125c(Object obj) {
            this.f16980c = obj;
        }
    }

    /* renamed from: a */
    public static int m19564a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m19563b(int i) {
        return i & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m19562c(int i, int i2) {
        return (i << 3) | i2;
    }
}
