package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.u8 */
/* loaded from: classes2.dex */
public enum EnumC4020u8 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(AbstractC3909n7.class, AbstractC3909n7.class, AbstractC3909n7.f9575d),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: c */
    private final Class<?> f9743c;

    /* renamed from: d */
    private final Object f9744d;

    EnumC4020u8(Class cls, Class cls2, Object obj) {
        this.f9743c = cls2;
        this.f9744d = obj;
    }

    /* renamed from: a */
    public final Class<?> m28848a() {
        return this.f9743c;
    }
}
