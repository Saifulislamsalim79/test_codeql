package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p201g.p218e.C7534g;
import p201g.p227h.p237k.C7673f;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: DirectedAcyclicGraph.java */
/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes2.dex */
public final class C1288a<T> {

    /* renamed from: a */
    private final InterfaceC7672e<ArrayList<T>> f4043a = new C7673f(10);

    /* renamed from: b */
    private final C7534g<T, ArrayList<T>> f4044b = new C7534g<>();

    /* renamed from: c */
    private final ArrayList<T> f4045c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f4046d = new HashSet<>();

    /* renamed from: e */
    private void m36482e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.f4044b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m36482e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: f */
    private ArrayList<T> m36481f() {
        ArrayList<T> mo11982b = this.f4043a.mo11982b();
        return mo11982b == null ? new ArrayList<>() : mo11982b;
    }

    /* renamed from: k */
    private void m36476k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f4043a.mo11983a(arrayList);
    }

    /* renamed from: a */
    public void m36486a(T t, T t2) {
        if (this.f4044b.containsKey(t) && this.f4044b.containsKey(t2)) {
            ArrayList<T> arrayList = this.f4044b.get(t);
            if (arrayList == null) {
                arrayList = m36481f();
                this.f4044b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: b */
    public void m36485b(T t) {
        if (this.f4044b.containsKey(t)) {
            return;
        }
        this.f4044b.put(t, null);
    }

    /* renamed from: c */
    public void m36484c() {
        int size = this.f4044b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m18448o = this.f4044b.m18448o(i);
            if (m18448o != null) {
                m36476k(m18448o);
            }
        }
        this.f4044b.clear();
    }

    /* renamed from: d */
    public boolean m36483d(T t) {
        return this.f4044b.containsKey(t);
    }

    /* renamed from: g */
    public List m36480g(T t) {
        return this.f4044b.get(t);
    }

    /* renamed from: h */
    public List<T> m36479h(T t) {
        int size = this.f4044b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m18448o = this.f4044b.m18448o(i);
            if (m18448o != null && m18448o.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f4044b.m18452k(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m36478i() {
        this.f4045c.clear();
        this.f4046d.clear();
        int size = this.f4044b.size();
        for (int i = 0; i < size; i++) {
            m36482e(this.f4044b.m18452k(i), this.f4045c, this.f4046d);
        }
        return this.f4045c;
    }

    /* renamed from: j */
    public boolean m36477j(T t) {
        int size = this.f4044b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m18448o = this.f4044b.m18448o(i);
            if (m18448o != null && m18448o.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
