package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cp */
/* loaded from: classes2.dex */
public enum EnumC3089cp {
    DOUBLE(0, 1, EnumC3144f.DOUBLE),
    FLOAT(1, 1, EnumC3144f.FLOAT),
    INT64(2, 1, EnumC3144f.LONG),
    UINT64(3, 1, EnumC3144f.LONG),
    INT32(4, 1, EnumC3144f.INT),
    FIXED64(5, 1, EnumC3144f.LONG),
    FIXED32(6, 1, EnumC3144f.INT),
    BOOL(7, 1, EnumC3144f.BOOLEAN),
    STRING(8, 1, EnumC3144f.STRING),
    MESSAGE(9, 1, EnumC3144f.MESSAGE),
    BYTES(10, 1, EnumC3144f.BYTE_STRING),
    UINT32(11, 1, EnumC3144f.INT),
    ENUM(12, 1, EnumC3144f.ENUM),
    SFIXED32(13, 1, EnumC3144f.INT),
    SFIXED64(14, 1, EnumC3144f.LONG),
    SINT32(15, 1, EnumC3144f.INT),
    SINT64(16, 1, EnumC3144f.LONG),
    GROUP(17, 1, EnumC3144f.MESSAGE),
    DOUBLE_LIST(18, 2, EnumC3144f.DOUBLE),
    FLOAT_LIST(19, 2, EnumC3144f.FLOAT),
    INT64_LIST(20, 2, EnumC3144f.LONG),
    UINT64_LIST(21, 2, EnumC3144f.LONG),
    INT32_LIST(22, 2, EnumC3144f.INT),
    FIXED64_LIST(23, 2, EnumC3144f.LONG),
    FIXED32_LIST(24, 2, EnumC3144f.INT),
    BOOL_LIST(25, 2, EnumC3144f.BOOLEAN),
    STRING_LIST(26, 2, EnumC3144f.STRING),
    MESSAGE_LIST(27, 2, EnumC3144f.MESSAGE),
    BYTES_LIST(28, 2, EnumC3144f.BYTE_STRING),
    UINT32_LIST(29, 2, EnumC3144f.INT),
    ENUM_LIST(30, 2, EnumC3144f.ENUM),
    SFIXED32_LIST(31, 2, EnumC3144f.INT),
    SFIXED64_LIST(32, 2, EnumC3144f.LONG),
    SINT32_LIST(33, 2, EnumC3144f.INT),
    SINT64_LIST(34, 2, EnumC3144f.LONG),
    DOUBLE_LIST_PACKED(35, 3, EnumC3144f.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, EnumC3144f.FLOAT),
    INT64_LIST_PACKED(37, 3, EnumC3144f.LONG),
    UINT64_LIST_PACKED(38, 3, EnumC3144f.LONG),
    INT32_LIST_PACKED(39, 3, EnumC3144f.INT),
    FIXED64_LIST_PACKED(40, 3, EnumC3144f.LONG),
    FIXED32_LIST_PACKED(41, 3, EnumC3144f.INT),
    BOOL_LIST_PACKED(42, 3, EnumC3144f.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, EnumC3144f.INT),
    ENUM_LIST_PACKED(44, 3, EnumC3144f.ENUM),
    SFIXED32_LIST_PACKED(45, 3, EnumC3144f.INT),
    SFIXED64_LIST_PACKED(46, 3, EnumC3144f.LONG),
    SINT32_LIST_PACKED(47, 3, EnumC3144f.INT),
    SINT64_LIST_PACKED(48, 3, EnumC3144f.LONG),
    GROUP_LIST(49, 2, EnumC3144f.MESSAGE),
    MAP(50, 4, EnumC3144f.VOID);
    

    /* renamed from: s0 */
    private static final EnumC3089cp[] f8365s0;

    /* renamed from: c */
    private final int f8371c;

    static {
        EnumC3089cp[] values = values();
        f8365s0 = new EnumC3089cp[values.length];
        for (EnumC3089cp enumC3089cp : values) {
            f8365s0[enumC3089cp.f8371c] = enumC3089cp;
        }
    }

    EnumC3089cp(int i, int i2, EnumC3144f enumC3144f) {
        this.f8371c = i;
        EnumC3144f enumC3144f2 = EnumC3144f.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            enumC3144f.m31169a();
        } else if (i3 == 3) {
            enumC3144f.m31169a();
        }
        if (i2 == 1) {
            enumC3144f.ordinal();
        }
    }

    public final int zza() {
        return this.f8371c;
    }
}
