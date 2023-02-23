package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ta */
/* loaded from: classes2.dex */
final class C4006ta implements PrivilegedExceptionAction<Unsafe> {
    /* renamed from: a */
    public static final Unsafe m28900a() throws Exception {
        Field[] declaredFields;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
        return m28900a();
    }
}
