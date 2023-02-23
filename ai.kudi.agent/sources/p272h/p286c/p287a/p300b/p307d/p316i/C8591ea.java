package p272h.p286c.p287a.p300b.p307d.p316i;

import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.ea */
/* loaded from: classes2.dex */
public final class C8591ea {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m15972a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
