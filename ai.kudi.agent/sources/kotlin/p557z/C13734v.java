package kotlin.p557z;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
/* renamed from: kotlin.z.v */
/* loaded from: classes3.dex */
public class C13734v extends C13732u {
    /* renamed from: t */
    public static <T extends Comparable<? super T>> void m3855t(List<T> list) {
        l.f(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: u */
    public static <T> void m3854u(List<T> list, Comparator<? super T> comparator) {
        l.f(list, "$this$sortWith");
        l.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
