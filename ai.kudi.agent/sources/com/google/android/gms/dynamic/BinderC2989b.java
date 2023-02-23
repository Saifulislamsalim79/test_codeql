package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.InterfaceC2987a;
import java.lang.reflect.Field;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamic.b */
/* loaded from: classes2.dex */
public final class BinderC2989b<T> extends InterfaceC2987a.AbstractBinderC2988a {

    /* renamed from: a */
    private final T f8159a;

    private BinderC2989b(T t) {
        this.f8159a = t;
    }

    /* renamed from: o */
    public static <T> T m31495o(InterfaceC2987a interfaceC2987a) {
        if (interfaceC2987a instanceof BinderC2989b) {
            return ((BinderC2989b) interfaceC2987a).f8159a;
        }
        IBinder asBinder = interfaceC2987a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            s.j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb = new StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: p1 */
    public static <T> InterfaceC2987a m31494p1(T t) {
        return new BinderC2989b(t);
    }
}
