package com.google.common.base;

import java.util.Arrays;
/* compiled from: Objects.java */
/* renamed from: com.google.common.base.k */
/* loaded from: classes2.dex */
public final class C5046k extends AbstractC5038f {
    /* renamed from: a */
    public static boolean m25800a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m25799b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
