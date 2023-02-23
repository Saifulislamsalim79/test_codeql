package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C13952q0;
/* compiled from: InlineList.kt */
/* renamed from: kotlinx.coroutines.internal.k */
/* loaded from: classes3.dex */
public final class C13894k<E> {
    /* renamed from: a */
    public static <E> Object m3494a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m3493b(Object obj, int i, kotlin.e0.d.g gVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        m3494a(obj);
        return obj;
    }

    /* renamed from: c */
    public static final Object m3492c(Object obj, E e) {
        if (!C13952q0.m3345a() || (!(e instanceof List))) {
            if (obj == null) {
                m3494a(e);
                return e;
            } else if (obj instanceof ArrayList) {
                if (obj != null) {
                    ((ArrayList) obj).add(e);
                    m3494a(obj);
                    return obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            } else {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(e);
                m3494a(arrayList);
                return arrayList;
            }
        }
        throw new AssertionError();
    }
}
