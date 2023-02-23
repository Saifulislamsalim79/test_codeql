package p382i.p383b;

import java.util.LinkedHashMap;
/* compiled from: DaggerCollections.java */
/* renamed from: i.b.b */
/* loaded from: classes2.dex */
public final class C9466b {
    /* renamed from: a */
    private static int m14660a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m14659b(int i) {
        return new LinkedHashMap<>(m14660a(i));
    }
}
