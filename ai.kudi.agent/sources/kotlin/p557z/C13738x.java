package kotlin.p557z;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
/* renamed from: kotlin.z.x */
/* loaded from: classes3.dex */
public class C13738x extends C13736w {
    /* renamed from: D */
    public static <T> List<T> m3835D(List<T> list) {
        l.f(list, "$this$asReversed");
        return new C13735v0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final int m3834E(List<?> list, int i) {
        int m3889g;
        int m3889g2;
        int m3889g3;
        m3889g = C13726r.m3889g(list);
        if (i >= 0 && m3889g >= i) {
            m3889g3 = C13726r.m3889g(list);
            return m3889g3 - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        m3889g2 = C13726r.m3889g(list);
        sb.append(new C11837e(0, m3889g2));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final int m3833F(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || size < i) {
            throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C11837e(0, list.size()) + "].");
        }
        return list.size() - i;
    }
}
