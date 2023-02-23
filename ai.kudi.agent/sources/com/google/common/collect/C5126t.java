package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: Platform.java */
/* renamed from: com.google.common.collect.t */
/* loaded from: classes2.dex */
final class C5126t {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T[] m25577a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T[] m25576b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }
}
