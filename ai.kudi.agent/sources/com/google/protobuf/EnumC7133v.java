package com.google.protobuf;
/* compiled from: FieldType.java */
/* renamed from: com.google.protobuf.v */
/* loaded from: classes2.dex */
public enum EnumC7133v {
    DOUBLE(0, EnumC7135b.SCALAR, EnumC7012c0.DOUBLE),
    FLOAT(1, EnumC7135b.SCALAR, EnumC7012c0.FLOAT),
    INT64(2, EnumC7135b.SCALAR, EnumC7012c0.LONG),
    UINT64(3, EnumC7135b.SCALAR, EnumC7012c0.LONG),
    INT32(4, EnumC7135b.SCALAR, EnumC7012c0.INT),
    FIXED64(5, EnumC7135b.SCALAR, EnumC7012c0.LONG),
    FIXED32(6, EnumC7135b.SCALAR, EnumC7012c0.INT),
    BOOL(7, EnumC7135b.SCALAR, EnumC7012c0.BOOLEAN),
    STRING(8, EnumC7135b.SCALAR, EnumC7012c0.STRING),
    MESSAGE(9, EnumC7135b.SCALAR, EnumC7012c0.MESSAGE),
    BYTES(10, EnumC7135b.SCALAR, EnumC7012c0.BYTE_STRING),
    UINT32(11, EnumC7135b.SCALAR, EnumC7012c0.INT),
    ENUM(12, EnumC7135b.SCALAR, EnumC7012c0.ENUM),
    SFIXED32(13, EnumC7135b.SCALAR, EnumC7012c0.INT),
    SFIXED64(14, EnumC7135b.SCALAR, EnumC7012c0.LONG),
    SINT32(15, EnumC7135b.SCALAR, EnumC7012c0.INT),
    SINT64(16, EnumC7135b.SCALAR, EnumC7012c0.LONG),
    GROUP(17, EnumC7135b.SCALAR, EnumC7012c0.MESSAGE),
    DOUBLE_LIST(18, EnumC7135b.VECTOR, EnumC7012c0.DOUBLE),
    FLOAT_LIST(19, EnumC7135b.VECTOR, EnumC7012c0.FLOAT),
    INT64_LIST(20, EnumC7135b.VECTOR, EnumC7012c0.LONG),
    UINT64_LIST(21, EnumC7135b.VECTOR, EnumC7012c0.LONG),
    INT32_LIST(22, EnumC7135b.VECTOR, EnumC7012c0.INT),
    FIXED64_LIST(23, EnumC7135b.VECTOR, EnumC7012c0.LONG),
    FIXED32_LIST(24, EnumC7135b.VECTOR, EnumC7012c0.INT),
    BOOL_LIST(25, EnumC7135b.VECTOR, EnumC7012c0.BOOLEAN),
    STRING_LIST(26, EnumC7135b.VECTOR, EnumC7012c0.STRING),
    MESSAGE_LIST(27, EnumC7135b.VECTOR, EnumC7012c0.MESSAGE),
    BYTES_LIST(28, EnumC7135b.VECTOR, EnumC7012c0.BYTE_STRING),
    UINT32_LIST(29, EnumC7135b.VECTOR, EnumC7012c0.INT),
    ENUM_LIST(30, EnumC7135b.VECTOR, EnumC7012c0.ENUM),
    SFIXED32_LIST(31, EnumC7135b.VECTOR, EnumC7012c0.INT),
    SFIXED64_LIST(32, EnumC7135b.VECTOR, EnumC7012c0.LONG),
    SINT32_LIST(33, EnumC7135b.VECTOR, EnumC7012c0.INT),
    SINT64_LIST(34, EnumC7135b.VECTOR, EnumC7012c0.LONG),
    DOUBLE_LIST_PACKED(35, EnumC7135b.PACKED_VECTOR, EnumC7012c0.DOUBLE),
    FLOAT_LIST_PACKED(36, EnumC7135b.PACKED_VECTOR, EnumC7012c0.FLOAT),
    INT64_LIST_PACKED(37, EnumC7135b.PACKED_VECTOR, EnumC7012c0.LONG),
    UINT64_LIST_PACKED(38, EnumC7135b.PACKED_VECTOR, EnumC7012c0.LONG),
    INT32_LIST_PACKED(39, EnumC7135b.PACKED_VECTOR, EnumC7012c0.INT),
    FIXED64_LIST_PACKED(40, EnumC7135b.PACKED_VECTOR, EnumC7012c0.LONG),
    FIXED32_LIST_PACKED(41, EnumC7135b.PACKED_VECTOR, EnumC7012c0.INT),
    BOOL_LIST_PACKED(42, EnumC7135b.PACKED_VECTOR, EnumC7012c0.BOOLEAN),
    UINT32_LIST_PACKED(43, EnumC7135b.PACKED_VECTOR, EnumC7012c0.INT),
    ENUM_LIST_PACKED(44, EnumC7135b.PACKED_VECTOR, EnumC7012c0.ENUM),
    SFIXED32_LIST_PACKED(45, EnumC7135b.PACKED_VECTOR, EnumC7012c0.INT),
    SFIXED64_LIST_PACKED(46, EnumC7135b.PACKED_VECTOR, EnumC7012c0.LONG),
    SINT32_LIST_PACKED(47, EnumC7135b.PACKED_VECTOR, EnumC7012c0.INT),
    SINT64_LIST_PACKED(48, EnumC7135b.PACKED_VECTOR, EnumC7012c0.LONG),
    GROUP_LIST(49, EnumC7135b.VECTOR, EnumC7012c0.MESSAGE),
    MAP(50, EnumC7135b.MAP, EnumC7012c0.VOID);
    

    /* renamed from: t0 */
    private static final EnumC7133v[] f17057t0;

    /* renamed from: c */
    private final int f17063c;

    /* renamed from: d */
    private final EnumC7135b f17064d;

    /* compiled from: FieldType.java */
    /* renamed from: com.google.protobuf.v$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C7134a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17065a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17066b;

        static {
            int[] iArr = new int[EnumC7012c0.values().length];
            f17066b = iArr;
            try {
                iArr[EnumC7012c0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17066b[EnumC7012c0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17066b[EnumC7012c0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC7135b.values().length];
            f17065a = iArr2;
            try {
                iArr2[EnumC7135b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17065a[EnumC7135b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17065a[EnumC7135b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: FieldType.java */
    /* renamed from: com.google.protobuf.v$b */
    /* loaded from: classes2.dex */
    enum EnumC7135b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: c */
        private final boolean f17072c;

        EnumC7135b(boolean z) {
            this.f17072c = z;
        }
    }

    static {
        EnumC7133v[] values = values();
        f17057t0 = new EnumC7133v[values.length];
        for (EnumC7133v enumC7133v : values) {
            f17057t0[enumC7133v.f17063c] = enumC7133v;
        }
    }

    EnumC7133v(int i, EnumC7135b enumC7135b, EnumC7012c0 enumC7012c0) {
        int i2;
        this.f17063c = i;
        this.f17064d = enumC7135b;
        int i3 = C7134a.f17065a[enumC7135b.ordinal()];
        if (i3 == 1) {
            enumC7012c0.m20219a();
        } else if (i3 == 2) {
            enumC7012c0.m20219a();
        }
        if (enumC7135b == EnumC7135b.SCALAR && (i2 = C7134a.f17066b[enumC7012c0.ordinal()]) != 1 && i2 == 2) {
        }
    }

    /* renamed from: a */
    public int m19426a() {
        return this.f17063c;
    }
}
