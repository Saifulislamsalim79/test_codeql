package io.grpc.p385i1.p386r;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: Util.java */
/* renamed from: io.grpc.i1.r.i */
/* loaded from: classes2.dex */
public final class C9961i {

    /* renamed from: a */
    public static final String[] f23606a = new String[0];

    /* renamed from: b */
    public static final Charset f23607b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static <T> List<T> m13471a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: b */
    private static <T> List<T> m13470b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t2 = tArr2[i];
                    if (t.equals(t2)) {
                        arrayList.add(t2);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> T[] m13469c(Class<T> cls, T[] tArr, T[] tArr2) {
        List m13470b = m13470b(tArr, tArr2);
        return (T[]) m13470b.toArray((Object[]) Array.newInstance((Class<?>) cls, m13470b.size()));
    }
}
