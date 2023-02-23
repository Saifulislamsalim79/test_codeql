package kotlin.p557z;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
/* renamed from: kotlin.z.s */
/* loaded from: classes3.dex */
public class C13728s extends C13726r {
    /* renamed from: o */
    public static <T> int m3867o(Iterable<? extends T> iterable, int i) {
        l.f(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: p */
    public static final <T> Integer m3866p(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$collectionSizeOrNull");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: q */
    public static final <T> Collection<T> m3865q(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        l.f(iterable, "$this$convertToSetForSetOperationWith");
        l.f(iterable2, TransactionField.TRANSACTION_CHANNEL);
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() >= 2) {
                Collection<T> collection = (Collection) iterable;
                return m3863s(collection) ? C13742z.m3772z0(iterable) : collection;
            }
            return (Collection) iterable;
        }
        return C13742z.m3772z0(iterable);
    }

    /* renamed from: r */
    public static <T> List<T> m3864r(Iterable<? extends Iterable<? extends T>> iterable) {
        l.f(iterable, "$this$flatten");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            C13722p.m3910v(arrayList, iterable2);
        }
        return arrayList;
    }

    /* renamed from: s */
    private static final <T> boolean m3863s(Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }
}
