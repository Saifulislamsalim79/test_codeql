package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.HashSet;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13736w;
/* compiled from: MemberScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.j */
/* loaded from: classes3.dex */
public final class C12782j {
    /* renamed from: a */
    public static final Set<C12614f> m6775a(Iterable<? extends InterfaceC12777h> iterable) {
        l.f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (InterfaceC12777h interfaceC12777h : iterable) {
            Set<C12614f> mo5113e = interfaceC12777h.mo5113e();
            if (mo5113e == null) {
                return null;
            }
            C13736w.m3850v(hashSet, mo5113e);
        }
        return hashSet;
    }
}
