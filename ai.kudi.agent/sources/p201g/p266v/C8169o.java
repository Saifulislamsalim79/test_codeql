package p201g.p266v;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p201g.p218e.C7521a;
import p201g.p227h.p238l.C7759x;
/* compiled from: TransitionManager.java */
/* renamed from: g.v.o */
/* loaded from: classes2.dex */
public class C8169o {

    /* renamed from: a */
    private static AbstractC8160m f19610a = new C8116b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C7521a<ViewGroup, ArrayList<AbstractC8160m>>>> f19611b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f19612c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* renamed from: g.v.o$a */
    /* loaded from: classes2.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC8170a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c */
        AbstractC8160m f19613c;

        /* renamed from: d */
        ViewGroup f19614d;

        /* compiled from: TransitionManager.java */
        /* renamed from: g.v.o$a$a */
        /* loaded from: classes2.dex */
        class C8171a extends C8168n {

            /* renamed from: c */
            final /* synthetic */ C7521a f19615c;

            C8171a(C7521a c7521a) {
                this.f19615c = c7521a;
            }

            @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
            /* renamed from: c */
            public void mo16576c(AbstractC8160m abstractC8160m) {
                ((ArrayList) this.f19615c.get(ViewTreeObserver$OnPreDrawListenerC8170a.this.f19614d)).remove(abstractC8160m);
                abstractC8160m.mo16608Q(this);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC8170a(AbstractC8160m abstractC8160m, ViewGroup viewGroup) {
            this.f19613c = abstractC8160m;
            this.f19614d = viewGroup;
        }

        /* renamed from: a */
        private void m16613a() {
            this.f19614d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f19614d.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m16613a();
            if (C8169o.f19612c.remove(this.f19614d)) {
                C7521a<ViewGroup, ArrayList<AbstractC8160m>> m16616b = C8169o.m16616b();
                ArrayList<AbstractC8160m> arrayList = m16616b.get(this.f19614d);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    m16616b.put(this.f19614d, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f19613c);
                this.f19613c.mo16601a(new C8171a(m16616b));
                this.f19613c.m16635j(this.f19614d, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC8160m) it.next()).mo16606S(this.f19614d);
                    }
                }
                this.f19613c.m16642P(this.f19614d);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m16613a();
            C8169o.f19612c.remove(this.f19614d);
            ArrayList<AbstractC8160m> arrayList = C8169o.m16616b().get(this.f19614d);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC8160m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo16606S(this.f19614d);
                }
            }
            this.f19613c.m16634k(true);
        }
    }

    /* renamed from: a */
    public static void m16617a(ViewGroup viewGroup, AbstractC8160m abstractC8160m) {
        if (f19612c.contains(viewGroup) || !C7759x.m17535U(viewGroup)) {
            return;
        }
        f19612c.add(viewGroup);
        if (abstractC8160m == null) {
            abstractC8160m = f19610a;
        }
        AbstractC8160m clone = abstractC8160m.clone();
        m16614d(viewGroup, clone);
        C8158l.m16656c(viewGroup, null);
        m16615c(viewGroup, clone);
    }

    /* renamed from: b */
    static C7521a<ViewGroup, ArrayList<AbstractC8160m>> m16616b() {
        C7521a<ViewGroup, ArrayList<AbstractC8160m>> c7521a;
        WeakReference<C7521a<ViewGroup, ArrayList<AbstractC8160m>>> weakReference = f19611b.get();
        if (weakReference == null || (c7521a = weakReference.get()) == null) {
            C7521a<ViewGroup, ArrayList<AbstractC8160m>> c7521a2 = new C7521a<>();
            f19611b.set(new WeakReference<>(c7521a2));
            return c7521a2;
        }
        return c7521a;
    }

    /* renamed from: c */
    private static void m16615c(ViewGroup viewGroup, AbstractC8160m abstractC8160m) {
        if (abstractC8160m == null || viewGroup == null) {
            return;
        }
        ViewTreeObserver$OnPreDrawListenerC8170a viewTreeObserver$OnPreDrawListenerC8170a = new ViewTreeObserver$OnPreDrawListenerC8170a(abstractC8160m, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC8170a);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC8170a);
    }

    /* renamed from: d */
    private static void m16614d(ViewGroup viewGroup, AbstractC8160m abstractC8160m) {
        ArrayList<AbstractC8160m> arrayList = m16616b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC8160m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo16609O(viewGroup);
            }
        }
        if (abstractC8160m != null) {
            abstractC8160m.m16635j(viewGroup, true);
        }
        C8158l m16657b = C8158l.m16657b(viewGroup);
        if (m16657b != null) {
            m16657b.m16658a();
        }
    }
}
