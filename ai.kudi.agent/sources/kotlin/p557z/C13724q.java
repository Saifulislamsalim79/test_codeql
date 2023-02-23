package kotlin.p557z;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
/* renamed from: kotlin.z.q */
/* loaded from: classes3.dex */
public class C13724q {
    /* renamed from: a */
    public static final <T> Object[] m3902a(T[] tArr, boolean z) {
        l.f(tArr, "$this$copyToArrayOfAny");
        if (z && l.b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        l.e(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: b */
    public static <T> List<T> m3901b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        l.e(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }
}
