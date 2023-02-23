package androidx.core.content.p057e;

import java.lang.reflect.Array;
/* compiled from: GrowingArrayUtils.java */
/* renamed from: androidx.core.content.e.e */
/* loaded from: classes2.dex */
final class C1354e {
    /* renamed from: a */
    public static int[] m36252a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m36250c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: b */
    public static <T> T[] m36251b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m36250c(i));
            System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: c */
    public static int m36250c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
