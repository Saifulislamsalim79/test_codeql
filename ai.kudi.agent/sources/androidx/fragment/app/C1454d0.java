package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p058os.C1373c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FragmentTransitionCompat21.java */
/* renamed from: androidx.fragment.app.d0 */
/* loaded from: classes2.dex */
class C1454d0 extends AbstractC1463e0 {

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.d0$a */
    /* loaded from: classes2.dex */
    class C1455a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4493a;

        C1455a(C1454d0 c1454d0, Rect rect) {
            this.f4493a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4493a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.d0$b */
    /* loaded from: classes2.dex */
    class C1456b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f4494a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4495b;

        C1456b(C1454d0 c1454d0, View view, ArrayList arrayList) {
            this.f4494a = view;
            this.f4495b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            C1460f.m35789b(transition, this);
            this.f4494a.setVisibility(8);
            int size = this.f4495b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4495b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            C1460f.m35789b(transition, this);
            C1460f.m35790a(transition, this);
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.d0$c */
    /* loaded from: classes2.dex */
    class C1457c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f4496a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4497b;

        /* renamed from: c */
        final /* synthetic */ Object f4498c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4499d;

        /* renamed from: e */
        final /* synthetic */ Object f4500e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4501f;

        C1457c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4496a = obj;
            this.f4497b = arrayList;
            this.f4498c = obj2;
            this.f4499d = arrayList2;
            this.f4500e = obj3;
            this.f4501f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            C1460f.m35789b(transition, this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4496a;
            if (obj != null) {
                C1454d0.this.m35791w(obj, this.f4497b, null);
            }
            Object obj2 = this.f4498c;
            if (obj2 != null) {
                C1454d0.this.m35791w(obj2, this.f4499d, null);
            }
            Object obj3 = this.f4500e;
            if (obj3 != null) {
                C1454d0.this.m35791w(obj3, this.f4501f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.d0$d */
    /* loaded from: classes2.dex */
    class C1458d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f4503a;

        C1458d(C1454d0 c1454d0, Runnable runnable) {
            this.f4503a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4503a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.d0$e */
    /* loaded from: classes2.dex */
    class C1459e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4504a;

        C1459e(C1454d0 c1454d0, Rect rect) {
            this.f4504a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4504a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4504a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.d0$f */
    /* loaded from: classes2.dex */
    static class C1460f {
        /* renamed from: a */
        static void m35790a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        static void m35789b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    /* renamed from: v */
    private static boolean m35792v(Transition transition) {
        return (AbstractC1463e0.m35781i(transition.getTargetIds()) && AbstractC1463e0.m35781i(transition.getTargetNames()) && AbstractC1463e0.m35781i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: a */
    public void mo16697a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: b */
    public void mo16696b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo16696b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (m35792v(transition) || !AbstractC1463e0.m35781i(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: c */
    public void mo16695c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: e */
    public boolean mo16694e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: f */
    public Object mo16693f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: j */
    public Object mo16692j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: k */
    public Object mo16691k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: m */
    public void mo16690m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1456b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: n */
    public void mo16689n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1457c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: o */
    public void mo16688o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1459e(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: p */
    public void mo16687p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m35782h(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1455a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: q */
    public void mo35779q(Fragment fragment, Object obj, C1373c c1373c, Runnable runnable) {
        ((Transition) obj).addListener(new C1458d(this, runnable));
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: s */
    public void mo16686s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1463e0.m35784d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo16696b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: t */
    public void mo16685t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m35791w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: u */
    public Object mo16684u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void m35791w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m35791w(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m35792v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
