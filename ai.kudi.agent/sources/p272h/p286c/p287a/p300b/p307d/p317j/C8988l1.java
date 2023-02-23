package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.l1 */
/* loaded from: classes2.dex */
public final class C8988l1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m15668a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m15667b(Set set, Collection collection) {
        if (collection != null) {
            if (collection instanceof InterfaceC8868d1) {
                collection = ((InterfaceC8868d1) collection).zza();
            }
            if ((collection instanceof Set) && collection.size() > set.size()) {
                Iterator it = set.iterator();
                if (collection != null) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            z = true;
                        }
                    }
                    return z;
                }
                throw null;
            }
            return m15666c(set, collection.iterator());
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m15666c(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
