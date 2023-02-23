package kotlin.p474a0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
/* renamed from: kotlin.a0.b */
/* loaded from: classes3.dex */
public class C11703b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m10416a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
