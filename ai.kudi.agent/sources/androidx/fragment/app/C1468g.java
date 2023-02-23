package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC1330p;
import androidx.core.p058os.C1373c;
import androidx.fragment.app.AbstractC1486i0;
import androidx.fragment.app.C1495j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p201g.p218e.C7521a;
import p201g.p227h.p237k.C7675h;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.C7774z;
import p201g.p227h.p238l.ViewTreeObserver$OnPreDrawListenerC7755t;
/* compiled from: DefaultSpecialEffectsController.java */
/* renamed from: androidx.fragment.app.g */
/* loaded from: classes2.dex */
class C1468g extends AbstractC1486i0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C1469a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4531a;

        static {
            int[] iArr = new int[AbstractC1486i0.C1491e.EnumC1494c.values().length];
            f4531a = iArr;
            try {
                iArr[AbstractC1486i0.C1491e.EnumC1494c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4531a[AbstractC1486i0.C1491e.EnumC1494c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4531a[AbstractC1486i0.C1491e.EnumC1494c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4531a[AbstractC1486i0.C1491e.EnumC1494c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$b */
    /* loaded from: classes2.dex */
    class RunnableC1470b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ List f4532c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1486i0.C1491e f4533d;

        RunnableC1470b(List list, AbstractC1486i0.C1491e c1491e) {
            this.f4532c = list;
            this.f4533d = c1491e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4532c.contains(this.f4533d)) {
                this.f4532c.remove(this.f4533d);
                C1468g.this.m35769s(this.f4533d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$c */
    /* loaded from: classes2.dex */
    public class C1471c extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ ViewGroup f4535c;

        /* renamed from: d */
        final /* synthetic */ View f4536d;

        /* renamed from: e */
        final /* synthetic */ boolean f4537e;

        /* renamed from: f */
        final /* synthetic */ AbstractC1486i0.C1491e f4538f;

        /* renamed from: w */
        final /* synthetic */ C1480k f4539w;

        C1471c(C1468g c1468g, ViewGroup viewGroup, View view, boolean z, AbstractC1486i0.C1491e c1491e, C1480k c1480k) {
            this.f4535c = viewGroup;
            this.f4536d = view;
            this.f4537e = z;
            this.f4538f = c1491e;
            this.f4539w = c1480k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4535c.endViewTransition(this.f4536d);
            if (this.f4537e) {
                this.f4538f.m35726e().m35717a(this.f4536d);
            }
            this.f4539w.m35762a();
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4538f + " has ended.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$d */
    /* loaded from: classes2.dex */
    public class C1472d implements C1373c.InterfaceC1374a {

        /* renamed from: a */
        final /* synthetic */ Animator f4540a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1486i0.C1491e f4541b;

        C1472d(C1468g c1468g, Animator animator, AbstractC1486i0.C1491e c1491e) {
            this.f4540a = animator;
            this.f4541b = c1491e;
        }

        @Override // androidx.core.p058os.C1373c.InterfaceC1374a
        /* renamed from: a */
        public void mo35718a() {
            this.f4540a.end();
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4541b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$e  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class animationAnimation$AnimationListenerC1473e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC1486i0.C1491e f4542a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4543b;

        /* renamed from: c */
        final /* synthetic */ View f4544c;

        /* renamed from: d */
        final /* synthetic */ C1480k f4545d;

        /* compiled from: DefaultSpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.g$e$a */
        /* loaded from: classes2.dex */
        class RunnableC1474a implements Runnable {
            RunnableC1474a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                animationAnimation$AnimationListenerC1473e animationanimation_animationlistenerc1473e = animationAnimation$AnimationListenerC1473e.this;
                animationanimation_animationlistenerc1473e.f4543b.endViewTransition(animationanimation_animationlistenerc1473e.f4544c);
                animationAnimation$AnimationListenerC1473e.this.f4545d.m35762a();
            }
        }

        animationAnimation$AnimationListenerC1473e(C1468g c1468g, AbstractC1486i0.C1491e c1491e, ViewGroup viewGroup, View view, C1480k c1480k) {
            this.f4542a = c1491e;
            this.f4543b = viewGroup;
            this.f4544c = view;
            this.f4545d = c1480k;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4543b.post(new RunnableC1474a());
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4542a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4542a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$f */
    /* loaded from: classes2.dex */
    public class C1475f implements C1373c.InterfaceC1374a {

        /* renamed from: a */
        final /* synthetic */ View f4547a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4548b;

        /* renamed from: c */
        final /* synthetic */ C1480k f4549c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1486i0.C1491e f4550d;

        C1475f(C1468g c1468g, View view, ViewGroup viewGroup, C1480k c1480k, AbstractC1486i0.C1491e c1491e) {
            this.f4547a = view;
            this.f4548b = viewGroup;
            this.f4549c = c1480k;
            this.f4550d = c1491e;
        }

        @Override // androidx.core.p058os.C1373c.InterfaceC1374a
        /* renamed from: a */
        public void mo35718a() {
            this.f4547a.clearAnimation();
            this.f4548b.endViewTransition(this.f4547a);
            this.f4549c.m35762a();
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4550d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$g */
    /* loaded from: classes2.dex */
    public class RunnableC1476g implements Runnable {

        /* renamed from: c */
        final /* synthetic */ AbstractC1486i0.C1491e f4551c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1486i0.C1491e f4552d;

        /* renamed from: e */
        final /* synthetic */ boolean f4553e;

        /* renamed from: f */
        final /* synthetic */ C7521a f4554f;

        RunnableC1476g(C1468g c1468g, AbstractC1486i0.C1491e c1491e, AbstractC1486i0.C1491e c1491e2, boolean z, C7521a c7521a) {
            this.f4551c = c1491e;
            this.f4552d = c1491e2;
            this.f4553e = z;
            this.f4554f = c7521a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1452c0.m35817a(this.f4551c.m35725f(), this.f4552d.m35725f(), this.f4553e, this.f4554f, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$h */
    /* loaded from: classes2.dex */
    public class RunnableC1477h implements Runnable {

        /* renamed from: c */
        final /* synthetic */ AbstractC1463e0 f4555c;

        /* renamed from: d */
        final /* synthetic */ View f4556d;

        /* renamed from: e */
        final /* synthetic */ Rect f4557e;

        RunnableC1477h(C1468g c1468g, AbstractC1463e0 abstractC1463e0, View view, Rect rect) {
            this.f4555c = abstractC1463e0;
            this.f4556d = view;
            this.f4557e = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4555c.m35782h(this.f4556d, this.f4557e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$i */
    /* loaded from: classes2.dex */
    public class RunnableC1478i implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f4558c;

        RunnableC1478i(C1468g c1468g, ArrayList arrayList) {
            this.f4558c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1452c0.m35813e(this.f4558c, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$j */
    /* loaded from: classes2.dex */
    public class RunnableC1479j implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C1482m f4559c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1486i0.C1491e f4560d;

        RunnableC1479j(C1468g c1468g, C1482m c1482m, AbstractC1486i0.C1491e c1491e) {
            this.f4559c = c1482m;
            this.f4560d = c1491e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4559c.m35762a();
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f4560d + "has completed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$k */
    /* loaded from: classes2.dex */
    public static class C1480k extends C1481l {

        /* renamed from: c */
        private boolean f4561c;

        /* renamed from: d */
        private boolean f4562d;

        /* renamed from: e */
        private C1495j.C1496a f4563e;

        C1480k(AbstractC1486i0.C1491e c1491e, C1373c c1373c, boolean z) {
            super(c1491e, c1373c);
            this.f4562d = false;
            this.f4561c = z;
        }

        /* renamed from: e */
        C1495j.C1496a m35763e(Context context) {
            if (this.f4562d) {
                return this.f4563e;
            }
            C1495j.C1496a m35713b = C1495j.m35713b(context, m35761b().m35725f(), m35761b().m35726e() == AbstractC1486i0.C1491e.EnumC1494c.VISIBLE, this.f4561c);
            this.f4563e = m35713b;
            this.f4562d = true;
            return m35713b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$l */
    /* loaded from: classes2.dex */
    public static class C1481l {

        /* renamed from: a */
        private final AbstractC1486i0.C1491e f4564a;

        /* renamed from: b */
        private final C1373c f4565b;

        C1481l(AbstractC1486i0.C1491e c1491e, C1373c c1373c) {
            this.f4564a = c1491e;
            this.f4565b = c1373c;
        }

        /* renamed from: a */
        void m35762a() {
            this.f4564a.m35727d(this.f4565b);
        }

        /* renamed from: b */
        AbstractC1486i0.C1491e m35761b() {
            return this.f4564a;
        }

        /* renamed from: c */
        C1373c m35760c() {
            return this.f4565b;
        }

        /* renamed from: d */
        boolean m35759d() {
            AbstractC1486i0.C1491e.EnumC1494c enumC1494c;
            AbstractC1486i0.C1491e.EnumC1494c m35715e = AbstractC1486i0.C1491e.EnumC1494c.m35715e(this.f4564a.m35725f().mView);
            AbstractC1486i0.C1491e.EnumC1494c m35726e = this.f4564a.m35726e();
            return m35715e == m35726e || !(m35715e == (enumC1494c = AbstractC1486i0.C1491e.EnumC1494c.VISIBLE) || m35726e == enumC1494c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.g$m */
    /* loaded from: classes2.dex */
    public static class C1482m extends C1481l {

        /* renamed from: c */
        private final Object f4566c;

        /* renamed from: d */
        private final boolean f4567d;

        /* renamed from: e */
        private final Object f4568e;

        C1482m(AbstractC1486i0.C1491e c1491e, C1373c c1373c, boolean z, boolean z2) {
            super(c1491e, c1373c);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (c1491e.m35726e() == AbstractC1486i0.C1491e.EnumC1494c.VISIBLE) {
                if (z) {
                    enterTransition = c1491e.m35725f().getReenterTransition();
                } else {
                    enterTransition = c1491e.m35725f().getEnterTransition();
                }
                this.f4566c = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = c1491e.m35725f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = c1491e.m35725f().getAllowEnterTransitionOverlap();
                }
                this.f4567d = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = c1491e.m35725f().getReturnTransition();
                } else {
                    exitTransition = c1491e.m35725f().getExitTransition();
                }
                this.f4566c = exitTransition;
                this.f4567d = true;
            }
            if (!z2) {
                this.f4568e = null;
            } else if (z) {
                this.f4568e = c1491e.m35725f().getSharedElementReturnTransition();
            } else {
                this.f4568e = c1491e.m35725f().getSharedElementEnterTransition();
            }
        }

        /* renamed from: f */
        private AbstractC1463e0 m35757f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC1463e0 abstractC1463e0 = C1452c0.f4487a;
            if (abstractC1463e0 != null && abstractC1463e0.mo16694e(obj)) {
                return C1452c0.f4487a;
            }
            AbstractC1463e0 abstractC1463e02 = C1452c0.f4488b;
            if (abstractC1463e02 != null && abstractC1463e02.mo16694e(obj)) {
                return C1452c0.f4488b;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m35761b().m35725f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC1463e0 m35758e() {
            AbstractC1463e0 m35757f = m35757f(this.f4566c);
            AbstractC1463e0 m35757f2 = m35757f(this.f4568e);
            if (m35757f == null || m35757f2 == null || m35757f == m35757f2) {
                return m35757f != null ? m35757f : m35757f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m35761b().m35725f() + " returned Transition " + this.f4566c + " which uses a different Transition  type than its shared element transition " + this.f4568e);
        }

        /* renamed from: g */
        public Object m35756g() {
            return this.f4568e;
        }

        /* renamed from: h */
        Object m35755h() {
            return this.f4566c;
        }

        /* renamed from: i */
        public boolean m35754i() {
            return this.f4568e != null;
        }

        /* renamed from: j */
        boolean m35753j() {
            return this.f4567d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1468g(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m35765w(List<C1480k> list, List<AbstractC1486i0.C1491e> list2, boolean z, Map<AbstractC1486i0.C1491e, Boolean> map) {
        int i;
        boolean z2;
        AbstractC1486i0.C1491e c1491e;
        ViewGroup m35736m = m35736m();
        Context context = m35736m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<C1480k> it = list.iterator();
        boolean z3 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C1480k next = it.next();
            if (next.m35759d()) {
                next.m35762a();
            } else {
                C1495j.C1496a m35763e = next.m35763e(context);
                if (m35763e == null) {
                    next.m35762a();
                } else {
                    Animator animator = m35763e.f4609b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        AbstractC1486i0.C1491e m35761b = next.m35761b();
                        Fragment m35725f = m35761b.m35725f();
                        if (Boolean.TRUE.equals(map.get(m35761b))) {
                            if (FragmentManager.m35996G0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + m35725f + " as this Fragment was involved in a Transition.");
                            }
                            next.m35762a();
                        } else {
                            boolean z4 = m35761b.m35726e() == AbstractC1486i0.C1491e.EnumC1494c.GONE;
                            if (z4) {
                                list2.remove(m35761b);
                            }
                            View view = m35725f.mView;
                            m35736m.startViewTransition(view);
                            animator.addListener(new C1471c(this, m35736m, view, z4, m35761b, next));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.m35996G0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                c1491e = m35761b;
                                sb.append(c1491e);
                                sb.append(" has started.");
                                Log.v("FragmentManager", sb.toString());
                            } else {
                                c1491e = m35761b;
                            }
                            next.m35760c().m36171c(new C1472d(this, animator, c1491e));
                            z3 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1480k c1480k = (C1480k) it2.next();
            AbstractC1486i0.C1491e m35761b2 = c1480k.m35761b();
            Fragment m35725f2 = m35761b2.m35725f();
            if (z) {
                if (FragmentManager.m35996G0(i)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m35725f2 + " as Animations cannot run alongside Transitions.");
                }
                c1480k.m35762a();
            } else if (z3) {
                if (FragmentManager.m35996G0(i)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m35725f2 + " as Animations cannot run alongside Animators.");
                }
                c1480k.m35762a();
            } else {
                View view2 = m35725f2.mView;
                C1495j.C1496a m35763e2 = c1480k.m35763e(context);
                C7675h.m17866f(m35763e2);
                Animation animation = m35763e2.f4608a;
                C7675h.m17866f(animation);
                Animation animation2 = animation;
                if (m35761b2.m35726e() != AbstractC1486i0.C1491e.EnumC1494c.REMOVED) {
                    view2.startAnimation(animation2);
                    c1480k.m35762a();
                    z2 = z3;
                } else {
                    m35736m.startViewTransition(view2);
                    C1495j.RunnableC1497b runnableC1497b = new C1495j.RunnableC1497b(animation2, m35736m, view2);
                    z2 = z3;
                    runnableC1497b.setAnimationListener(new animationAnimation$AnimationListenerC1473e(this, m35761b2, m35736m, view2, c1480k));
                    view2.startAnimation(runnableC1497b);
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + m35761b2 + " has started.");
                    }
                }
                c1480k.m35760c().m36171c(new C1475f(this, view2, m35736m, c1480k, m35761b2));
                i = 2;
                z3 = z2;
            }
        }
    }

    /* renamed from: x */
    private Map<AbstractC1486i0.C1491e, Boolean> m35764x(List<C1482m> list, List<AbstractC1486i0.C1491e> list2, boolean z, AbstractC1486i0.C1491e c1491e, AbstractC1486i0.C1491e c1491e2) {
        String str;
        View next;
        View next2;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        Object obj3;
        AbstractC1486i0.C1491e c1491e3;
        View view2;
        C7521a c7521a;
        AbstractC1486i0.C1491e c1491e4;
        AbstractC1486i0.C1491e c1491e5;
        HashMap hashMap;
        ArrayList<View> arrayList3;
        View view3;
        AbstractC1463e0 abstractC1463e0;
        ArrayList<View> arrayList4;
        Rect rect;
        AbstractC1330p enterTransitionCallback;
        AbstractC1330p exitTransitionCallback;
        ArrayList arrayList5;
        int i;
        View view4;
        View view5;
        String m35816b;
        ArrayList arrayList6;
        boolean z2 = z;
        AbstractC1486i0.C1491e c1491e6 = c1491e;
        AbstractC1486i0.C1491e c1491e7 = c1491e2;
        HashMap hashMap2 = new HashMap();
        AbstractC1463e0 abstractC1463e02 = null;
        for (C1482m c1482m : list) {
            if (!c1482m.m35759d()) {
                AbstractC1463e0 m35758e = c1482m.m35758e();
                if (abstractC1463e02 == null) {
                    abstractC1463e02 = m35758e;
                } else if (m35758e != null && abstractC1463e02 != m35758e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c1482m.m35761b().m35725f() + " returned Transition " + c1482m.m35755h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC1463e02 == null) {
            for (C1482m c1482m2 : list) {
                hashMap2.put(c1482m2.m35761b(), Boolean.FALSE);
                c1482m2.m35762a();
            }
            return hashMap2;
        }
        View view6 = new View(m35736m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        C7521a c7521a2 = new C7521a();
        Iterator<C1482m> it = list.iterator();
        Object obj4 = null;
        View view7 = null;
        boolean z3 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            C1482m next3 = it.next();
            if (!next3.m35754i() || c1491e6 == null || c1491e7 == null) {
                c7521a = c7521a2;
                c1491e4 = c1491e6;
                c1491e5 = c1491e7;
                hashMap = hashMap2;
                arrayList3 = arrayList7;
                view3 = view6;
                abstractC1463e0 = abstractC1463e02;
                arrayList4 = arrayList8;
                rect = rect2;
                view7 = view7;
            } else {
                Object mo16684u = abstractC1463e02.mo16684u(abstractC1463e02.mo16693f(next3.m35756g()));
                ArrayList sharedElementSourceNames = c1491e2.m35725f().getSharedElementSourceNames();
                ArrayList sharedElementSourceNames2 = c1491e.m35725f().getSharedElementSourceNames();
                ArrayList sharedElementTargetNames = c1491e.m35725f().getSharedElementTargetNames();
                View view8 = view7;
                HashMap hashMap3 = hashMap2;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, (String) sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList sharedElementTargetNames2 = c1491e2.m35725f().getSharedElementTargetNames();
                if (!z2) {
                    enterTransitionCallback = c1491e.m35725f().getExitTransitionCallback();
                    exitTransitionCallback = c1491e2.m35725f().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = c1491e.m35725f().getEnterTransitionCallback();
                    exitTransitionCallback = c1491e2.m35725f().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                View view9 = view6;
                int i3 = 0;
                while (i3 < size) {
                    c7521a2.put((String) sharedElementSourceNames.get(i3), (String) sharedElementTargetNames2.get(i3));
                    i3++;
                    size = size;
                    rect2 = rect2;
                }
                Rect rect3 = rect2;
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v("FragmentManager", "Name: " + ((String) it2.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                    }
                }
                C7521a<String, View> c7521a3 = new C7521a<>();
                m35767u(c7521a3, c1491e.m35725f().mView);
                c7521a3.m18519q(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + c1491e6);
                    }
                    enterTransitionCallback.m36341c(sharedElementSourceNames, c7521a3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str4 = (String) sharedElementSourceNames.get(size2);
                        View view10 = c7521a3.get(str4);
                        if (view10 == null) {
                            c7521a2.remove(str4);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str4.equals(C7759x.m17543M(view10))) {
                                c7521a2.put(C7759x.m17543M(view10), (String) c7521a2.remove(str4));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    c7521a2.m18519q(c7521a3.keySet());
                }
                C7521a<String, View> c7521a4 = new C7521a<>();
                m35767u(c7521a4, c1491e2.m35725f().mView);
                c7521a4.m18519q(sharedElementTargetNames2);
                c7521a4.m18519q(c7521a2.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + c1491e7);
                    }
                    exitTransitionCallback.m36341c(sharedElementTargetNames2, c7521a4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str5 = (String) sharedElementTargetNames2.get(size3);
                        View view11 = c7521a4.get(str5);
                        if (view11 == null) {
                            String m35816b2 = C1452c0.m35816b(c7521a2, str5);
                            if (m35816b2 != null) {
                                c7521a2.remove(m35816b2);
                            }
                        } else if (!str5.equals(C7759x.m17543M(view11)) && (m35816b = C1452c0.m35816b(c7521a2, str5)) != null) {
                            c7521a2.put(m35816b, C7759x.m17543M(view11));
                        }
                    }
                } else {
                    C1452c0.m35814d(c7521a2, c7521a4);
                }
                m35766v(c7521a3, c7521a2.keySet());
                m35766v(c7521a4, c7521a2.values());
                if (c7521a2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    c7521a = c7521a2;
                    arrayList4 = arrayList8;
                    c1491e4 = c1491e6;
                    c1491e5 = c1491e7;
                    arrayList3 = arrayList7;
                    abstractC1463e0 = abstractC1463e02;
                    view7 = view8;
                    view3 = view9;
                    hashMap = hashMap3;
                    rect = rect3;
                    obj4 = null;
                } else {
                    C1452c0.m35817a(c1491e2.m35725f(), c1491e.m35725f(), z2, c7521a3, true);
                    c7521a = c7521a2;
                    ArrayList<View> arrayList10 = arrayList8;
                    ViewTreeObserver$OnPreDrawListenerC7755t.m17571a(m35736m(), new RunnableC1476g(this, c1491e2, c1491e, z, c7521a4));
                    arrayList7.addAll(c7521a3.values());
                    if (arrayList5.isEmpty()) {
                        i = 0;
                        view7 = view8;
                    } else {
                        i = 0;
                        View view12 = c7521a3.get((String) arrayList5.get(0));
                        abstractC1463e02.mo16687p(mo16684u, view12);
                        view7 = view12;
                    }
                    arrayList10.addAll(c7521a4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = c7521a4.get((String) sharedElementTargetNames2.get(i))) == null) {
                        rect = rect3;
                        view4 = view9;
                    } else {
                        rect = rect3;
                        ViewTreeObserver$OnPreDrawListenerC7755t.m17571a(m35736m(), new RunnableC1477h(this, abstractC1463e02, view5, rect));
                        view4 = view9;
                        z3 = true;
                    }
                    abstractC1463e02.mo16686s(mo16684u, view4, arrayList7);
                    arrayList3 = arrayList7;
                    view3 = view4;
                    obj4 = mo16684u;
                    abstractC1463e0 = abstractC1463e02;
                    abstractC1463e02.mo16689n(mo16684u, null, null, null, null, obj4, arrayList10);
                    c1491e4 = c1491e;
                    arrayList4 = arrayList10;
                    hashMap = hashMap3;
                    hashMap.put(c1491e4, Boolean.TRUE);
                    c1491e5 = c1491e2;
                    hashMap.put(c1491e5, Boolean.TRUE);
                }
            }
            rect2 = rect;
            arrayList7 = arrayList3;
            view6 = view3;
            arrayList8 = arrayList4;
            abstractC1463e02 = abstractC1463e0;
            z2 = z;
            c1491e7 = c1491e5;
            hashMap2 = hashMap;
            c1491e6 = c1491e4;
            c7521a2 = c7521a;
        }
        View view13 = view7;
        C7521a c7521a5 = c7521a2;
        AbstractC1486i0.C1491e c1491e8 = c1491e6;
        AbstractC1486i0.C1491e c1491e9 = c1491e7;
        HashMap hashMap4 = hashMap2;
        Collection<?> collection = arrayList7;
        View view14 = view6;
        AbstractC1463e0 abstractC1463e03 = abstractC1463e02;
        Collection<?> collection2 = arrayList8;
        Rect rect4 = rect2;
        ArrayList arrayList11 = new ArrayList();
        Object obj5 = null;
        Object obj6 = null;
        for (C1482m c1482m3 : list) {
            if (c1482m3.m35759d()) {
                hashMap4.put(c1482m3.m35761b(), Boolean.FALSE);
                c1482m3.m35762a();
            } else {
                Object mo16693f = abstractC1463e03.mo16693f(c1482m3.m35755h());
                AbstractC1486i0.C1491e m35761b = c1482m3.m35761b();
                boolean z4 = obj4 != null && (m35761b == c1491e8 || m35761b == c1491e9);
                if (mo16693f == null) {
                    if (!z4) {
                        hashMap4.put(m35761b, Boolean.FALSE);
                        c1482m3.m35762a();
                    }
                    str3 = str;
                    arrayList = collection;
                    view = view14;
                    arrayList2 = collection2;
                    obj = obj5;
                    view2 = view13;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj7 = obj5;
                    m35768t(arrayList12, m35761b.m35725f().mView);
                    if (z4) {
                        if (m35761b == c1491e8) {
                            arrayList12.removeAll(collection);
                        } else {
                            arrayList12.removeAll(collection2);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC1463e03.mo16697a(mo16693f, view14);
                        arrayList = collection;
                        view = view14;
                        arrayList2 = collection2;
                        c1491e3 = m35761b;
                        obj2 = obj6;
                        obj3 = mo16693f;
                        obj = obj7;
                    } else {
                        abstractC1463e03.mo16696b(mo16693f, arrayList12);
                        view = view14;
                        obj = obj7;
                        arrayList = collection;
                        obj2 = obj6;
                        arrayList2 = collection2;
                        obj3 = mo16693f;
                        abstractC1463e03.mo16689n(mo16693f, mo16693f, arrayList12, null, null, null, null);
                        if (m35761b.m35726e() == AbstractC1486i0.C1491e.EnumC1494c.GONE) {
                            c1491e3 = m35761b;
                            list2.remove(c1491e3);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(c1491e3.m35725f().mView);
                            abstractC1463e03.mo16690m(obj3, c1491e3.m35725f().mView, arrayList13);
                            ViewTreeObserver$OnPreDrawListenerC7755t.m17571a(m35736m(), new RunnableC1478i(this, arrayList12));
                        } else {
                            c1491e3 = m35761b;
                        }
                    }
                    if (c1491e3.m35726e() == AbstractC1486i0.C1491e.EnumC1494c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z3) {
                            abstractC1463e03.mo16688o(obj3, rect4);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        abstractC1463e03.mo16687p(obj3, view2);
                    }
                    hashMap4.put(c1491e3, Boolean.TRUE);
                    if (c1482m3.m35753j()) {
                        obj2 = abstractC1463e03.mo16691k(obj2, obj3, null);
                    } else {
                        obj = abstractC1463e03.mo16691k(obj, obj3, null);
                    }
                    obj6 = obj2;
                }
                view13 = view2;
                obj5 = obj;
                str = str3;
                view14 = view;
                collection = arrayList;
                collection2 = arrayList2;
            }
        }
        String str6 = str;
        ArrayList<View> arrayList14 = collection;
        ArrayList<View> arrayList15 = collection2;
        Object mo16692j = abstractC1463e03.mo16692j(obj6, obj5, obj4);
        if (mo16692j == null) {
            return hashMap4;
        }
        for (C1482m c1482m4 : list) {
            if (!c1482m4.m35759d()) {
                Object m35755h = c1482m4.m35755h();
                AbstractC1486i0.C1491e m35761b2 = c1482m4.m35761b();
                boolean z5 = obj4 != null && (m35761b2 == c1491e8 || m35761b2 == c1491e9);
                if (m35755h == null && !z5) {
                    str2 = str6;
                } else if (!C7759x.m17535U(m35736m())) {
                    if (FragmentManager.m35996G0(2)) {
                        str2 = str6;
                        Log.v(str2, "SpecialEffectsController: Container " + m35736m() + " has not been laid out. Completing operation " + m35761b2);
                    } else {
                        str2 = str6;
                    }
                    c1482m4.m35762a();
                } else {
                    str2 = str6;
                    abstractC1463e03.mo35779q(c1482m4.m35761b().m35725f(), mo16692j, c1482m4.m35760c(), new RunnableC1479j(this, c1482m4, m35761b2));
                }
                str6 = str2;
            }
        }
        String str7 = str6;
        if (C7759x.m17535U(m35736m())) {
            C1452c0.m35813e(arrayList11, 4);
            ArrayList<String> m35780l = abstractC1463e03.m35780l(arrayList15);
            if (FragmentManager.m35996G0(2)) {
                Log.v(str7, ">>>>> Beginning transition <<<<<");
                Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it4 = arrayList14.iterator();
                while (it4.hasNext()) {
                    Log.v(str7, "View: " + it4.next() + " Name: " + C7759x.m17543M(next2));
                }
                Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it5 = arrayList15.iterator();
                while (it5.hasNext()) {
                    Log.v(str7, "View: " + it5.next() + " Name: " + C7759x.m17543M(next));
                }
            }
            abstractC1463e03.mo16695c(m35736m(), mo16692j);
            abstractC1463e03.m35778r(m35736m(), arrayList14, arrayList15, m35780l, c7521a5);
            C1452c0.m35813e(arrayList11, 0);
            abstractC1463e03.mo16685t(obj4, arrayList14, arrayList15);
            return hashMap4;
        }
        return hashMap4;
    }

    @Override // androidx.fragment.app.AbstractC1486i0
    /* renamed from: f */
    void mo35743f(List<AbstractC1486i0.C1491e> list, boolean z) {
        AbstractC1486i0.C1491e c1491e = null;
        AbstractC1486i0.C1491e c1491e2 = null;
        for (AbstractC1486i0.C1491e c1491e3 : list) {
            AbstractC1486i0.C1491e.EnumC1494c m35715e = AbstractC1486i0.C1491e.EnumC1494c.m35715e(c1491e3.m35725f().mView);
            int i = C1469a.f4531a[c1491e3.m35726e().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4 && m35715e != AbstractC1486i0.C1491e.EnumC1494c.VISIBLE) {
                    c1491e2 = c1491e3;
                }
            } else if (m35715e == AbstractC1486i0.C1491e.EnumC1494c.VISIBLE && c1491e == null) {
                c1491e = c1491e3;
            }
        }
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Executing operations from " + c1491e + " to " + c1491e2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AbstractC1486i0.C1491e> arrayList3 = new ArrayList(list);
        for (AbstractC1486i0.C1491e c1491e4 : list) {
            C1373c c1373c = new C1373c();
            c1491e4.m35721j(c1373c);
            arrayList.add(new C1480k(c1491e4, c1373c, z));
            C1373c c1373c2 = new C1373c();
            c1491e4.m35721j(c1373c2);
            boolean z2 = false;
            if (z) {
                if (c1491e4 != c1491e) {
                    arrayList2.add(new C1482m(c1491e4, c1373c2, z, z2));
                    c1491e4.m35730a(new RunnableC1470b(arrayList3, c1491e4));
                }
                z2 = true;
                arrayList2.add(new C1482m(c1491e4, c1373c2, z, z2));
                c1491e4.m35730a(new RunnableC1470b(arrayList3, c1491e4));
            } else {
                if (c1491e4 != c1491e2) {
                    arrayList2.add(new C1482m(c1491e4, c1373c2, z, z2));
                    c1491e4.m35730a(new RunnableC1470b(arrayList3, c1491e4));
                }
                z2 = true;
                arrayList2.add(new C1482m(c1491e4, c1373c2, z, z2));
                c1491e4.m35730a(new RunnableC1470b(arrayList3, c1491e4));
            }
        }
        Map<AbstractC1486i0.C1491e, Boolean> m35764x = m35764x(arrayList2, arrayList3, z, c1491e, c1491e2);
        m35765w(arrayList, arrayList3, m35764x.containsValue(Boolean.TRUE), m35764x);
        for (AbstractC1486i0.C1491e c1491e5 : arrayList3) {
            m35769s(c1491e5);
        }
        arrayList3.clear();
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c1491e + " to " + c1491e2);
        }
    }

    /* renamed from: s */
    void m35769s(AbstractC1486i0.C1491e c1491e) {
        c1491e.m35726e().m35717a(c1491e.m35725f().mView);
    }

    /* renamed from: t */
    void m35768t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C7774z.m17435a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m35768t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    void m35767u(Map<String, View> map, View view) {
        String m17543M = C7759x.m17543M(view);
        if (m17543M != null) {
            map.put(m17543M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m35767u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m35766v(C7521a<String, View> c7521a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c7521a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C7759x.m17543M(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
