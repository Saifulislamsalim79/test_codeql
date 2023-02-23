package com.intercom.input.gallery;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class ClassUtils {
    public static <T> Class<? extends T> cast(Serializable serializable) {
        return (Class) serializable;
    }

    public static <T> T instantiate(Class<? extends T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Could not instantiate" + cls + ", make sure the class is public and static", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Could not instantiate " + cls, e2);
        }
    }
}
