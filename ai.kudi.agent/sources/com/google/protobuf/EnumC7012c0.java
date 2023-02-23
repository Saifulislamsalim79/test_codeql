package com.google.protobuf;
/* compiled from: JavaType.java */
/* renamed from: com.google.protobuf.c0 */
/* loaded from: classes2.dex */
public enum EnumC7012c0 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(AbstractC7039i.class, AbstractC7039i.class, AbstractC7039i.f16815d),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: c */
    private final Class<?> f16770c;

    /* renamed from: d */
    private final Object f16771d;

    EnumC7012c0(Class cls, Class cls2, Object obj) {
        this.f16770c = cls2;
        this.f16771d = obj;
    }

    /* renamed from: a */
    public Class<?> m20219a() {
        return this.f16770c;
    }
}
