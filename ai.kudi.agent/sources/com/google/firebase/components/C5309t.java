package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleDetector.java */
/* renamed from: com.google.firebase.components.t */
/* loaded from: classes2.dex */
public class C5309t {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* renamed from: com.google.firebase.components.t$b */
    /* loaded from: classes2.dex */
    public static class C5311b {

        /* renamed from: a */
        private final C5296n<?> f13143a;

        /* renamed from: b */
        private final Set<C5311b> f13144b = new HashSet();

        /* renamed from: c */
        private final Set<C5311b> f13145c = new HashSet();

        C5311b(C5296n<?> c5296n) {
            this.f13143a = c5296n;
        }

        /* renamed from: a */
        void m25174a(C5311b c5311b) {
            this.f13144b.add(c5311b);
        }

        /* renamed from: b */
        void m25173b(C5311b c5311b) {
            this.f13145c.add(c5311b);
        }

        /* renamed from: c */
        C5296n<?> m25172c() {
            return this.f13143a;
        }

        /* renamed from: d */
        Set<C5311b> m25171d() {
            return this.f13144b;
        }

        /* renamed from: e */
        boolean m25170e() {
            return this.f13144b.isEmpty();
        }

        /* renamed from: f */
        boolean m25169f() {
            return this.f13145c.isEmpty();
        }

        /* renamed from: g */
        void m25168g(C5311b c5311b) {
            this.f13145c.remove(c5311b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* renamed from: com.google.firebase.components.t$c */
    /* loaded from: classes2.dex */
    public static class C5312c {

        /* renamed from: a */
        private final Class<?> f13146a;

        /* renamed from: b */
        private final boolean f13147b;

        public boolean equals(Object obj) {
            if (obj instanceof C5312c) {
                C5312c c5312c = (C5312c) obj;
                return c5312c.f13146a.equals(this.f13146a) && c5312c.f13147b == this.f13147b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f13146a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f13147b).hashCode();
        }

        private C5312c(Class<?> cls, boolean z) {
            this.f13146a = cls;
            this.f13147b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25177a(List<C5296n<?>> list) {
        Set<C5311b> m25175c = m25175c(list);
        Set<C5311b> m25176b = m25176b(m25175c);
        int i = 0;
        while (!m25176b.isEmpty()) {
            C5311b next = m25176b.iterator().next();
            m25176b.remove(next);
            i++;
            for (C5311b c5311b : next.m25171d()) {
                c5311b.m25168g(next);
                if (c5311b.m25169f()) {
                    m25176b.add(c5311b);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C5311b c5311b2 : m25175c) {
            if (!c5311b2.m25169f() && !c5311b2.m25170e()) {
                arrayList.add(c5311b2.m25172c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    /* renamed from: b */
    private static Set<C5311b> m25176b(Set<C5311b> set) {
        HashSet hashSet = new HashSet();
        for (C5311b c5311b : set) {
            if (c5311b.m25169f()) {
                hashSet.add(c5311b);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C5311b> m25175c(List<C5296n<?>> list) {
        Set<C5311b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C5296n<?> c5296n : list) {
            C5311b c5311b = new C5311b(c5296n);
            for (Class<? super Object> cls : c5296n.m25225e()) {
                C5312c c5312c = new C5312c(cls, !c5296n.m25219k());
                if (!hashMap.containsKey(c5312c)) {
                    hashMap.put(c5312c, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c5312c);
                if (!set2.isEmpty() && !c5312c.f13147b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(c5311b);
            }
        }
        for (Set<C5311b> set3 : hashMap.values()) {
            for (C5311b c5311b2 : set3) {
                for (C5313u c5313u : c5311b2.m25172c().m25227c()) {
                    if (c5313u.m25162e() && (set = (Set) hashMap.get(new C5312c(c5313u.m25164c(), c5313u.m25160g()))) != null) {
                        for (C5311b c5311b3 : set) {
                            c5311b2.m25174a(c5311b3);
                            c5311b3.m25173b(c5311b2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
