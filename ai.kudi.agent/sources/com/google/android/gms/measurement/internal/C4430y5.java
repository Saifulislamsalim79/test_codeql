package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* loaded from: classes2.dex */
public final class C4430y5 {
    /* renamed from: a */
    public static <T> T m27809a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t2.getClass().getCanonicalName()));
    }

    /* renamed from: b */
    public static void m27808b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
