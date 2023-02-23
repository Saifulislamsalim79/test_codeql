package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k */
/* loaded from: classes2.dex */
final class C3279k extends AbstractC3332m {

    /* renamed from: c */
    private static final Class<?> f8662c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3279k(C3252j c3252j) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private static <L> List<L> m30880f(Object obj, long j, int i) {
        C3198h c3198h;
        List<L> arrayList;
        List<L> list = (List) C3254j1.m30923k(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC3225i) {
                arrayList = new C3198h(i);
            } else if ((list instanceof InterfaceC3172g0) && (list instanceof InterfaceC3090d)) {
                arrayList = ((InterfaceC3090d) list).mo29876i(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            C3254j1.m30910x(obj, j, arrayList);
            return arrayList;
        }
        if (f8662c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            C3254j1.m30910x(obj, j, arrayList2);
            c3198h = arrayList2;
        } else if (list instanceof C3119e1) {
            C3198h c3198h2 = new C3198h(list.size() + i);
            c3198h2.addAll(c3198h2.size(), (C3119e1) list);
            C3254j1.m30910x(obj, j, c3198h2);
            c3198h = c3198h2;
        } else if ((list instanceof InterfaceC3172g0) && (list instanceof InterfaceC3090d)) {
            InterfaceC3090d interfaceC3090d = (InterfaceC3090d) list;
            if (interfaceC3090d.mo30107c()) {
                return list;
            }
            InterfaceC3090d mo29876i = interfaceC3090d.mo29876i(list.size() + i);
            C3254j1.m30910x(obj, j, mo29876i);
            return mo29876i;
        } else {
            return list;
        }
        return c3198h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3332m
    /* renamed from: a */
    public final <L> List<L> mo30721a(Object obj, long j) {
        return m30880f(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3332m
    /* renamed from: b */
    public final void mo30720b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C3254j1.m30923k(obj, j);
        if (list instanceof InterfaceC3225i) {
            unmodifiableList = ((InterfaceC3225i) list).mo31007a();
        } else if (f8662c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC3172g0) && (list instanceof InterfaceC3090d)) {
                InterfaceC3090d interfaceC3090d = (InterfaceC3090d) list;
                if (interfaceC3090d.mo30107c()) {
                    interfaceC3090d.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C3254j1.m30910x(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3332m
    /* renamed from: c */
    public final <E> void mo30719c(Object obj, Object obj2, long j) {
        List list = (List) C3254j1.m30923k(obj2, j);
        List m30880f = m30880f(obj, j, list.size());
        int size = m30880f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            m30880f.addAll(list);
        }
        if (size > 0) {
            list = m30880f;
        }
        C3254j1.m30910x(obj, j, list);
    }
}
