package p272h.p286c.p287a.p300b.p307d.p315h;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.n */
/* loaded from: classes2.dex */
public final class C8511n {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object[] m16016a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
