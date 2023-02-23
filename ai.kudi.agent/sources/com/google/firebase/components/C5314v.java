package com.google.firebase.components;

import com.google.firebase.p167m.C6470a;
import com.google.firebase.p167m.InterfaceC6471b;
import com.google.firebase.p167m.InterfaceC6472c;
import com.google.firebase.p167m.InterfaceC6473d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: EventBus.java */
/* renamed from: com.google.firebase.components.v */
/* loaded from: classes2.dex */
class C5314v implements InterfaceC6473d, InterfaceC6472c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC6471b<Object>, Executor>> f13151a = new HashMap();

    /* renamed from: b */
    private Queue<C6470a<?>> f13152b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f13153c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5314v(Executor executor) {
        this.f13153c = executor;
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<InterfaceC6471b<Object>, Executor>> m25153d(C6470a<?> c6470a) {
        ConcurrentHashMap<InterfaceC6471b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f13151a.get(c6470a.m21935b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.p167m.InterfaceC6473d
    /* renamed from: a */
    public <T> void mo21934a(Class<T> cls, InterfaceC6471b<? super T> interfaceC6471b) {
        mo21933b(cls, this.f13153c, interfaceC6471b);
    }

    @Override // com.google.firebase.p167m.InterfaceC6473d
    /* renamed from: b */
    public synchronized <T> void mo21933b(Class<T> cls, Executor executor, InterfaceC6471b<? super T> interfaceC6471b) {
        C5318z.m25139b(cls);
        C5318z.m25139b(interfaceC6471b);
        C5318z.m25139b(executor);
        if (!this.f13151a.containsKey(cls)) {
            this.f13151a.put(cls, new ConcurrentHashMap<>());
        }
        this.f13151a.get(cls).put(interfaceC6471b, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m25154c() {
        Queue<C6470a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f13152b != null) {
                Queue<C6470a<?>> queue2 = this.f13152b;
                this.f13152b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (C6470a<?> c6470a : queue) {
                m25151f(c6470a);
            }
        }
    }

    /* renamed from: f */
    public void m25151f(final C6470a<?> c6470a) {
        C5318z.m25139b(c6470a);
        synchronized (this) {
            if (this.f13152b != null) {
                this.f13152b.add(c6470a);
                return;
            }
            for (final Map.Entry<InterfaceC6471b<Object>, Executor> entry : m25153d(c6470a)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC6471b) entry.getKey()).mo21677a(c6470a);
                    }
                });
            }
        }
    }
}
