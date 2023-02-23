package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.o */
/* loaded from: classes2.dex */
public final class C4473o implements InterfaceC4450c<Void, j<List<j<?>>>> {

    /* renamed from: a */
    final /* synthetic */ Collection f10901a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4473o(Collection collection) {
        this.f10901a = collection;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4450c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ j<List<j<?>>> mo20893a(j<Void> jVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10901a);
        return C4469m.m27765f(arrayList);
    }
}
