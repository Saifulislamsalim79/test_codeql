package com.google.firebase.components;

import com.google.firebase.p170o.InterfaceC6560b;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractComponentContainer.java */
/* renamed from: com.google.firebase.components.m */
/* loaded from: classes2.dex */
public abstract class AbstractC5295m implements InterfaceC5299o {
    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: a */
    public <T> T mo25206a(Class<T> cls) {
        InterfaceC6560b<T> mo25197b = mo25197b(cls);
        if (mo25197b == null) {
            return null;
        }
        return mo25197b.get();
    }

    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: d */
    public <T> Set<T> mo25205d(Class<T> cls) {
        return mo25196c(cls).get();
    }
}
