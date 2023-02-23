package com.google.firebase.components;

import com.google.firebase.p167m.InterfaceC6472c;
import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RestrictedComponentContainer.java */
/* renamed from: com.google.firebase.components.a0 */
/* loaded from: classes2.dex */
public final class C5282a0 extends AbstractC5295m {

    /* renamed from: a */
    private final Set<Class<?>> f13095a;

    /* renamed from: b */
    private final Set<Class<?>> f13096b;

    /* renamed from: c */
    private final Set<Class<?>> f13097c;

    /* renamed from: d */
    private final Set<Class<?>> f13098d;

    /* renamed from: e */
    private final Set<Class<?>> f13099e;

    /* renamed from: f */
    private final Set<Class<?>> f13100f;

    /* renamed from: g */
    private final InterfaceC5299o f13101g;

    /* compiled from: RestrictedComponentContainer.java */
    /* renamed from: com.google.firebase.components.a0$a */
    /* loaded from: classes2.dex */
    private static class C5283a implements InterfaceC6472c {
        public C5283a(Set<Class<?>> set, InterfaceC6472c interfaceC6472c) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5282a0(C5296n<?> c5296n, InterfaceC5299o interfaceC5299o) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C5313u c5313u : c5296n.m25227c()) {
            if (c5313u.m25162e()) {
                if (c5313u.m25160g()) {
                    hashSet4.add(c5313u.m25164c());
                } else {
                    hashSet.add(c5313u.m25164c());
                }
            } else if (c5313u.m25163d()) {
                hashSet3.add(c5313u.m25164c());
            } else if (c5313u.m25160g()) {
                hashSet5.add(c5313u.m25164c());
            } else {
                hashSet2.add(c5313u.m25164c());
            }
        }
        if (!c5296n.m25224f().isEmpty()) {
            hashSet.add(InterfaceC6472c.class);
        }
        this.f13095a = Collections.unmodifiableSet(hashSet);
        this.f13096b = Collections.unmodifiableSet(hashSet2);
        this.f13097c = Collections.unmodifiableSet(hashSet3);
        this.f13098d = Collections.unmodifiableSet(hashSet4);
        this.f13099e = Collections.unmodifiableSet(hashSet5);
        this.f13100f = c5296n.m25224f();
        this.f13101g = interfaceC5299o;
    }

    @Override // com.google.firebase.components.AbstractC5295m, com.google.firebase.components.InterfaceC5299o
    /* renamed from: a */
    public <T> T mo25206a(Class<T> cls) {
        if (this.f13095a.contains(cls)) {
            T t = (T) this.f13101g.mo25206a(cls);
            return !cls.equals(InterfaceC6472c.class) ? t : (T) new C5283a(this.f13100f, (InterfaceC6472c) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: b */
    public <T> InterfaceC6560b<T> mo25197b(Class<T> cls) {
        if (this.f13096b.contains(cls)) {
            return this.f13101g.mo25197b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: c */
    public <T> InterfaceC6560b<Set<T>> mo25196c(Class<T> cls) {
        if (this.f13099e.contains(cls)) {
            return this.f13101g.mo25196c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.google.firebase.components.AbstractC5295m, com.google.firebase.components.InterfaceC5299o
    /* renamed from: d */
    public <T> Set<T> mo25205d(Class<T> cls) {
        if (this.f13098d.contains(cls)) {
            return this.f13101g.mo25205d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: e */
    public <T> InterfaceC6558a<T> mo25195e(Class<T> cls) {
        if (this.f13097c.contains(cls)) {
            return this.f13101g.mo25195e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
