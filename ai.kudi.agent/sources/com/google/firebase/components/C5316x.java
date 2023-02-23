package com.google.firebase.components;

import com.google.firebase.p170o.InterfaceC6560b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazySet.java */
/* renamed from: com.google.firebase.components.x */
/* loaded from: classes2.dex */
public class C5316x<T> implements InterfaceC6560b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f13158b = null;

    /* renamed from: a */
    private volatile Set<InterfaceC6560b<T>> f13157a = Collections.newSetFromMap(new ConcurrentHashMap());

    C5316x(Collection<InterfaceC6560b<T>> collection) {
        this.f13157a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5316x<?> m25149b(Collection<InterfaceC6560b<?>> collection) {
        return new C5316x<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m25147d() {
        for (InterfaceC6560b<T> interfaceC6560b : this.f13157a) {
            this.f13158b.add(interfaceC6560b.get());
        }
        this.f13157a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m25150a(InterfaceC6560b<T> interfaceC6560b) {
        if (this.f13158b == null) {
            this.f13157a.add(interfaceC6560b);
        } else {
            this.f13158b.add(interfaceC6560b.get());
        }
    }

    @Override // com.google.firebase.p170o.InterfaceC6560b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f13158b == null) {
            synchronized (this) {
                if (this.f13158b == null) {
                    this.f13158b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m25147d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f13158b);
    }
}
