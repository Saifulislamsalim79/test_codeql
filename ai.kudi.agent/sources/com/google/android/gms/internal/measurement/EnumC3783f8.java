package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.f8 */
/* loaded from: classes2.dex */
public enum EnumC3783f8 {
    DOUBLE(0, 1, EnumC4020u8.DOUBLE),
    FLOAT(1, 1, EnumC4020u8.FLOAT),
    INT64(2, 1, EnumC4020u8.LONG),
    UINT64(3, 1, EnumC4020u8.LONG),
    INT32(4, 1, EnumC4020u8.INT),
    FIXED64(5, 1, EnumC4020u8.LONG),
    FIXED32(6, 1, EnumC4020u8.INT),
    BOOL(7, 1, EnumC4020u8.BOOLEAN),
    STRING(8, 1, EnumC4020u8.STRING),
    MESSAGE(9, 1, EnumC4020u8.MESSAGE),
    BYTES(10, 1, EnumC4020u8.BYTE_STRING),
    UINT32(11, 1, EnumC4020u8.INT),
    ENUM(12, 1, EnumC4020u8.ENUM),
    SFIXED32(13, 1, EnumC4020u8.INT),
    SFIXED64(14, 1, EnumC4020u8.LONG),
    SINT32(15, 1, EnumC4020u8.INT),
    SINT64(16, 1, EnumC4020u8.LONG),
    GROUP(17, 1, EnumC4020u8.MESSAGE),
    DOUBLE_LIST(18, 2, EnumC4020u8.DOUBLE),
    FLOAT_LIST(19, 2, EnumC4020u8.FLOAT),
    INT64_LIST(20, 2, EnumC4020u8.LONG),
    UINT64_LIST(21, 2, EnumC4020u8.LONG),
    INT32_LIST(22, 2, EnumC4020u8.INT),
    FIXED64_LIST(23, 2, EnumC4020u8.LONG),
    FIXED32_LIST(24, 2, EnumC4020u8.INT),
    BOOL_LIST(25, 2, EnumC4020u8.BOOLEAN),
    STRING_LIST(26, 2, EnumC4020u8.STRING),
    MESSAGE_LIST(27, 2, EnumC4020u8.MESSAGE),
    BYTES_LIST(28, 2, EnumC4020u8.BYTE_STRING),
    UINT32_LIST(29, 2, EnumC4020u8.INT),
    ENUM_LIST(30, 2, EnumC4020u8.ENUM),
    SFIXED32_LIST(31, 2, EnumC4020u8.INT),
    SFIXED64_LIST(32, 2, EnumC4020u8.LONG),
    SINT32_LIST(33, 2, EnumC4020u8.INT),
    SINT64_LIST(34, 2, EnumC4020u8.LONG),
    DOUBLE_LIST_PACKED(35, 3, EnumC4020u8.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, EnumC4020u8.FLOAT),
    INT64_LIST_PACKED(37, 3, EnumC4020u8.LONG),
    UINT64_LIST_PACKED(38, 3, EnumC4020u8.LONG),
    INT32_LIST_PACKED(39, 3, EnumC4020u8.INT),
    FIXED64_LIST_PACKED(40, 3, EnumC4020u8.LONG),
    FIXED32_LIST_PACKED(41, 3, EnumC4020u8.INT),
    BOOL_LIST_PACKED(42, 3, EnumC4020u8.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, EnumC4020u8.INT),
    ENUM_LIST_PACKED(44, 3, EnumC4020u8.ENUM),
    SFIXED32_LIST_PACKED(45, 3, EnumC4020u8.INT),
    SFIXED64_LIST_PACKED(46, 3, EnumC4020u8.LONG),
    SINT32_LIST_PACKED(47, 3, EnumC4020u8.INT),
    SINT64_LIST_PACKED(48, 3, EnumC4020u8.LONG),
    GROUP_LIST(49, 2, EnumC4020u8.MESSAGE),
    MAP(50, 4, EnumC4020u8.VOID);
    

    /* renamed from: s0 */
    private static final EnumC3783f8[] f9346s0;

    /* renamed from: c */
    private final int f9352c;

    static {
        EnumC3783f8[] values = values();
        f9346s0 = new EnumC3783f8[values.length];
        for (EnumC3783f8 enumC3783f8 : values) {
            f9346s0[enumC3783f8.f9352c] = enumC3783f8;
        }
    }

    EnumC3783f8(int i, int i2, EnumC4020u8 enumC4020u8) {
        this.f9352c = i;
        EnumC4020u8 enumC4020u82 = EnumC4020u8.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            enumC4020u8.m28848a();
        } else if (i3 == 3) {
            enumC4020u8.m28848a();
        }
        if (i2 == 1) {
            enumC4020u8.ordinal();
        }
    }

    public final int zza() {
        return this.f9352c;
    }
}
