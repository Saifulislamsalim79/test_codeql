package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.z8 */
/* loaded from: classes2.dex */
final class C4100z8 extends AbstractC3723b9 {

    /* renamed from: c */
    private static final Class<?> f9879c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4100z8(C4084y8 c4084y8) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3723b9
    /* renamed from: a */
    public final void mo28535a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C4070xa.m28637k(obj, j);
        if (list instanceof InterfaceC4068x8) {
            unmodifiableList = ((InterfaceC4068x8) list).mo28660a();
        } else if (f9879c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC4037v9) && (list instanceof InterfaceC3988s8)) {
                InterfaceC3988s8 interfaceC3988s8 = (InterfaceC3988s8) list;
                if (interfaceC3988s8.mo28973c()) {
                    interfaceC3988s8.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C4070xa.m28624x(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3723b9
    /* renamed from: b */
    public final <E> void mo28534b(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List list = (List) C4070xa.m28637k(obj2, j);
        int size = list.size();
        List list2 = (List) C4070xa.m28637k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC4068x8) {
                list2 = new C4052w8(size);
            } else if ((list2 instanceof InterfaceC4037v9) && (list2 instanceof InterfaceC3988s8)) {
                list2 = ((InterfaceC3988s8) list2).mo28653i(size);
            } else {
                list2 = new ArrayList(size);
            }
            C4070xa.m28624x(obj, j, list2);
        } else {
            if (f9879c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                C4070xa.m28624x(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof C3990sa) {
                C4052w8 c4052w8 = new C4052w8(list2.size() + size);
                c4052w8.addAll(c4052w8.size(), (C3990sa) list2);
                C4070xa.m28624x(obj, j, c4052w8);
                arrayList = c4052w8;
            } else if ((list2 instanceof InterfaceC4037v9) && (list2 instanceof InterfaceC3988s8)) {
                InterfaceC3988s8 interfaceC3988s8 = (InterfaceC3988s8) list2;
                if (!interfaceC3988s8.mo28973c()) {
                    list2 = interfaceC3988s8.mo28653i(list2.size() + size);
                    C4070xa.m28624x(obj, j, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C4070xa.m28624x(obj, j, list);
    }
}
