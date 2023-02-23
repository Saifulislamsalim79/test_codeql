package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.u */
/* loaded from: classes2.dex */
public final class C8525u {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m15999a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
