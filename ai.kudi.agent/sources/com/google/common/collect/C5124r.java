package com.google.common.collect;
/* compiled from: ObjectArrays.java */
/* renamed from: com.google.common.collect.r */
/* loaded from: classes2.dex */
public final class C5124r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m25583a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m25582b(Object... objArr) {
        m25581c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    static Object[] m25581c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m25583a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m25580d(T[] tArr, int i) {
        return (T[]) C5126t.m25576b(tArr, i);
    }
}
