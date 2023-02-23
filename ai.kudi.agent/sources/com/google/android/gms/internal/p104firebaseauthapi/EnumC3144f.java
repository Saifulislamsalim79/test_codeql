package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f */
/* loaded from: classes2.dex */
public enum EnumC3144f {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(AbstractC3223ho.class, AbstractC3223ho.class, AbstractC3223ho.f8571d),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: c */
    private final Class<?> f8450c;

    /* renamed from: d */
    private final Object f8451d;

    EnumC3144f(Class cls, Class cls2, Object obj) {
        this.f8450c = cls2;
        this.f8451d = obj;
    }

    /* renamed from: a */
    public final Class<?> m31169a() {
        return this.f8450c;
    }
}
