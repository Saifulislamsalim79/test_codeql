package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.db */
/* loaded from: classes2.dex */
public enum EnumC3757db {
    DOUBLE(EnumC3772eb.DOUBLE, 1),
    FLOAT(EnumC3772eb.FLOAT, 5),
    INT64(EnumC3772eb.LONG, 0),
    UINT64(EnumC3772eb.LONG, 0),
    INT32(EnumC3772eb.INT, 0),
    FIXED64(EnumC3772eb.LONG, 1),
    FIXED32(EnumC3772eb.INT, 5),
    BOOL(EnumC3772eb.BOOLEAN, 0),
    STRING(EnumC3772eb.STRING, 2),
    GROUP(EnumC3772eb.MESSAGE, 3),
    MESSAGE(EnumC3772eb.MESSAGE, 2),
    BYTES(EnumC3772eb.BYTE_STRING, 2),
    UINT32(EnumC3772eb.INT, 0),
    ENUM(EnumC3772eb.ENUM, 0),
    SFIXED32(EnumC3772eb.INT, 5),
    SFIXED64(EnumC3772eb.LONG, 1),
    SINT32(EnumC3772eb.INT, 0),
    SINT64(EnumC3772eb.LONG, 0);
    

    /* renamed from: c */
    private final EnumC3772eb f9263c;

    EnumC3757db(EnumC3772eb enumC3772eb, int i) {
        this.f9263c = enumC3772eb;
    }

    /* renamed from: a */
    public final EnumC3772eb m29676a() {
        return this.f9263c;
    }
}
