package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p201g.p227h.p238l.C7759x;
/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes2.dex */
public class C1702i extends AbstractC1752y {

    /* renamed from: s */
    private static TimeInterpolator f5213s;

    /* renamed from: h */
    private ArrayList<RecyclerView.AbstractC1620e0> f5214h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC1620e0> f5215i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1712j> f5216j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1711i> f5217k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.AbstractC1620e0>> f5218l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C1712j>> f5219m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1711i>> f5220n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.AbstractC1620e0> f5221o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC1620e0> f5222p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC1620e0> f5223q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC1620e0> f5224r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes2.dex */
    class RunnableC1703a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f5225c;

        RunnableC1703a(ArrayList arrayList) {
            this.f5225c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5225c.iterator();
            while (it.hasNext()) {
                C1712j c1712j = (C1712j) it.next();
                C1702i.this.m34743T(c1712j.f5259a, c1712j.f5260b, c1712j.f5261c, c1712j.f5262d, c1712j.f5263e);
            }
            this.f5225c.clear();
            C1702i.this.f5219m.remove(this.f5225c);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes2.dex */
    class RunnableC1704b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f5227c;

        RunnableC1704b(ArrayList arrayList) {
            this.f5227c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5227c.iterator();
            while (it.hasNext()) {
                C1702i.this.m34744S((C1711i) it.next());
            }
            this.f5227c.clear();
            C1702i.this.f5220n.remove(this.f5227c);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$c */
    /* loaded from: classes2.dex */
    class RunnableC1705c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f5229c;

        RunnableC1705c(ArrayList arrayList) {
            this.f5229c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5229c.iterator();
            while (it.hasNext()) {
                C1702i.this.m34745R((RecyclerView.AbstractC1620e0) it.next());
            }
            this.f5229c.clear();
            C1702i.this.f5218l.remove(this.f5229c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$d */
    /* loaded from: classes2.dex */
    public class C1706d extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ RecyclerView.AbstractC1620e0 f5231c;

        /* renamed from: d */
        final /* synthetic */ ViewPropertyAnimator f5232d;

        /* renamed from: e */
        final /* synthetic */ View f5233e;

        C1706d(RecyclerView.AbstractC1620e0 abstractC1620e0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5231c = abstractC1620e0;
            this.f5232d = viewPropertyAnimator;
            this.f5233e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5232d.setListener(null);
            this.f5233e.setAlpha(1.0f);
            C1702i.this.m34580G(this.f5231c);
            C1702i.this.f5223q.remove(this.f5231c);
            C1702i.this.m34740W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1702i.this.m34579H(this.f5231c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$e */
    /* loaded from: classes2.dex */
    public class C1707e extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ RecyclerView.AbstractC1620e0 f5235c;

        /* renamed from: d */
        final /* synthetic */ View f5236d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f5237e;

        C1707e(RecyclerView.AbstractC1620e0 abstractC1620e0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5235c = abstractC1620e0;
            this.f5236d = view;
            this.f5237e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5236d.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5237e.setListener(null);
            C1702i.this.m34586A(this.f5235c);
            C1702i.this.f5221o.remove(this.f5235c);
            C1702i.this.m34740W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1702i.this.m34585B(this.f5235c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$f */
    /* loaded from: classes2.dex */
    public class C1708f extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ RecyclerView.AbstractC1620e0 f5239c;

        /* renamed from: d */
        final /* synthetic */ int f5240d;

        /* renamed from: e */
        final /* synthetic */ View f5241e;

        /* renamed from: f */
        final /* synthetic */ int f5242f;

        /* renamed from: w */
        final /* synthetic */ ViewPropertyAnimator f5243w;

        C1708f(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5239c = abstractC1620e0;
            this.f5240d = i;
            this.f5241e = view;
            this.f5242f = i2;
            this.f5243w = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f5240d != 0) {
                this.f5241e.setTranslationX(0.0f);
            }
            if (this.f5242f != 0) {
                this.f5241e.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5243w.setListener(null);
            C1702i.this.m34582E(this.f5239c);
            C1702i.this.f5222p.remove(this.f5239c);
            C1702i.this.m34740W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1702i.this.m34581F(this.f5239c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$g */
    /* loaded from: classes2.dex */
    public class C1709g extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ C1711i f5245c;

        /* renamed from: d */
        final /* synthetic */ ViewPropertyAnimator f5246d;

        /* renamed from: e */
        final /* synthetic */ View f5247e;

        C1709g(C1711i c1711i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5245c = c1711i;
            this.f5246d = viewPropertyAnimator;
            this.f5247e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5246d.setListener(null);
            this.f5247e.setAlpha(1.0f);
            this.f5247e.setTranslationX(0.0f);
            this.f5247e.setTranslationY(0.0f);
            C1702i.this.m34584C(this.f5245c.f5253a, true);
            C1702i.this.f5224r.remove(this.f5245c.f5253a);
            C1702i.this.m34740W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1702i.this.m34583D(this.f5245c.f5253a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$h */
    /* loaded from: classes2.dex */
    public class C1710h extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ C1711i f5249c;

        /* renamed from: d */
        final /* synthetic */ ViewPropertyAnimator f5250d;

        /* renamed from: e */
        final /* synthetic */ View f5251e;

        C1710h(C1711i c1711i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5249c = c1711i;
            this.f5250d = viewPropertyAnimator;
            this.f5251e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5250d.setListener(null);
            this.f5251e.setAlpha(1.0f);
            this.f5251e.setTranslationX(0.0f);
            this.f5251e.setTranslationY(0.0f);
            C1702i.this.m34584C(this.f5249c.f5254b, false);
            C1702i.this.f5224r.remove(this.f5249c.f5254b);
            C1702i.this.m34740W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1702i.this.m34583D(this.f5249c.f5254b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$j */
    /* loaded from: classes2.dex */
    public static class C1712j {

        /* renamed from: a */
        public RecyclerView.AbstractC1620e0 f5259a;

        /* renamed from: b */
        public int f5260b;

        /* renamed from: c */
        public int f5261c;

        /* renamed from: d */
        public int f5262d;

        /* renamed from: e */
        public int f5263e;

        C1712j(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, int i2, int i3, int i4) {
            this.f5259a = abstractC1620e0;
            this.f5260b = i;
            this.f5261c = i2;
            this.f5262d = i3;
            this.f5263e = i4;
        }
    }

    /* renamed from: U */
    private void m34742U(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        View view = abstractC1620e0.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5223q.add(abstractC1620e0);
        animate.setDuration(m35187o()).alpha(0.0f).setListener(new C1706d(abstractC1620e0, animate, view)).start();
    }

    /* renamed from: X */
    private void m34739X(List<C1711i> list, RecyclerView.AbstractC1620e0 abstractC1620e0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1711i c1711i = list.get(size);
            if (m34737Z(c1711i, abstractC1620e0) && c1711i.f5253a == null && c1711i.f5254b == null) {
                list.remove(c1711i);
            }
        }
    }

    /* renamed from: Y */
    private void m34738Y(C1711i c1711i) {
        RecyclerView.AbstractC1620e0 abstractC1620e0 = c1711i.f5253a;
        if (abstractC1620e0 != null) {
            m34737Z(c1711i, abstractC1620e0);
        }
        RecyclerView.AbstractC1620e0 abstractC1620e02 = c1711i.f5254b;
        if (abstractC1620e02 != null) {
            m34737Z(c1711i, abstractC1620e02);
        }
    }

    /* renamed from: Z */
    private boolean m34737Z(C1711i c1711i, RecyclerView.AbstractC1620e0 abstractC1620e0) {
        boolean z = false;
        if (c1711i.f5254b == abstractC1620e0) {
            c1711i.f5254b = null;
        } else if (c1711i.f5253a != abstractC1620e0) {
            return false;
        } else {
            c1711i.f5253a = null;
            z = true;
        }
        abstractC1620e0.itemView.setAlpha(1.0f);
        abstractC1620e0.itemView.setTranslationX(0.0f);
        abstractC1620e0.itemView.setTranslationY(0.0f);
        m34584C(abstractC1620e0, z);
        return true;
    }

    /* renamed from: a0 */
    private void m34736a0(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        if (f5213s == null) {
            f5213s = new ValueAnimator().getInterpolator();
        }
        abstractC1620e0.itemView.animate().setInterpolator(f5213s);
        mo34734j(abstractC1620e0);
    }

    /* renamed from: R */
    void m34745R(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        View view = abstractC1620e0.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5221o.add(abstractC1620e0);
        animate.alpha(1.0f).setDuration(m35190l()).setListener(new C1707e(abstractC1620e0, view, animate)).start();
    }

    /* renamed from: S */
    void m34744S(C1711i c1711i) {
        RecyclerView.AbstractC1620e0 abstractC1620e0 = c1711i.f5253a;
        View view = abstractC1620e0 == null ? null : abstractC1620e0.itemView;
        RecyclerView.AbstractC1620e0 abstractC1620e02 = c1711i.f5254b;
        View view2 = abstractC1620e02 != null ? abstractC1620e02.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m35189m());
            this.f5224r.add(c1711i.f5253a);
            duration.translationX(c1711i.f5257e - c1711i.f5255c);
            duration.translationY(c1711i.f5258f - c1711i.f5256d);
            duration.alpha(0.0f).setListener(new C1709g(c1711i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f5224r.add(c1711i.f5254b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m35189m()).alpha(1.0f).setListener(new C1710h(c1711i, animate, view2)).start();
        }
    }

    /* renamed from: T */
    void m34743T(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, int i2, int i3, int i4) {
        View view = abstractC1620e0.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5222p.add(abstractC1620e0);
        animate.setDuration(m35188n()).setListener(new C1708f(abstractC1620e0, i5, view, i6, animate)).start();
    }

    /* renamed from: V */
    void m34741V(List<RecyclerView.AbstractC1620e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* renamed from: W */
    void m34740W() {
        if (mo34732p()) {
            return;
        }
        m35191i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: g */
    public boolean mo34735g(RecyclerView.AbstractC1620e0 abstractC1620e0, List<Object> list) {
        return !list.isEmpty() || super.mo34735g(abstractC1620e0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: j */
    public void mo34734j(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        View view = abstractC1620e0.itemView;
        view.animate().cancel();
        int size = this.f5216j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f5216j.get(size).f5259a == abstractC1620e0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m34582E(abstractC1620e0);
                this.f5216j.remove(size);
            }
        }
        m34739X(this.f5217k, abstractC1620e0);
        if (this.f5214h.remove(abstractC1620e0)) {
            view.setAlpha(1.0f);
            m34580G(abstractC1620e0);
        }
        if (this.f5215i.remove(abstractC1620e0)) {
            view.setAlpha(1.0f);
            m34586A(abstractC1620e0);
        }
        for (int size2 = this.f5220n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C1711i> arrayList = this.f5220n.get(size2);
            m34739X(arrayList, abstractC1620e0);
            if (arrayList.isEmpty()) {
                this.f5220n.remove(size2);
            }
        }
        for (int size3 = this.f5219m.size() - 1; size3 >= 0; size3--) {
            ArrayList<C1712j> arrayList2 = this.f5219m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f5259a == abstractC1620e0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m34582E(abstractC1620e0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5219m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5218l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC1620e0> arrayList3 = this.f5218l.get(size5);
            if (arrayList3.remove(abstractC1620e0)) {
                view.setAlpha(1.0f);
                m34586A(abstractC1620e0);
                if (arrayList3.isEmpty()) {
                    this.f5218l.remove(size5);
                }
            }
        }
        this.f5223q.remove(abstractC1620e0);
        this.f5221o.remove(abstractC1620e0);
        this.f5224r.remove(abstractC1620e0);
        this.f5222p.remove(abstractC1620e0);
        m34740W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: k */
    public void mo34733k() {
        int size = this.f5216j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1712j c1712j = this.f5216j.get(size);
            View view = c1712j.f5259a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m34582E(c1712j.f5259a);
            this.f5216j.remove(size);
        }
        for (int size2 = this.f5214h.size() - 1; size2 >= 0; size2--) {
            m34580G(this.f5214h.get(size2));
            this.f5214h.remove(size2);
        }
        int size3 = this.f5215i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1620e0 abstractC1620e0 = this.f5215i.get(size3);
            abstractC1620e0.itemView.setAlpha(1.0f);
            m34586A(abstractC1620e0);
            this.f5215i.remove(size3);
        }
        for (int size4 = this.f5217k.size() - 1; size4 >= 0; size4--) {
            m34738Y(this.f5217k.get(size4));
        }
        this.f5217k.clear();
        if (mo34732p()) {
            for (int size5 = this.f5219m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C1712j> arrayList = this.f5219m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1712j c1712j2 = arrayList.get(size6);
                    View view2 = c1712j2.f5259a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m34582E(c1712j2.f5259a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5219m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5218l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC1620e0> arrayList2 = this.f5218l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC1620e0 abstractC1620e02 = arrayList2.get(size8);
                    abstractC1620e02.itemView.setAlpha(1.0f);
                    m34586A(abstractC1620e02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5218l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5220n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C1711i> arrayList3 = this.f5220n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m34738Y(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5220n.remove(arrayList3);
                    }
                }
            }
            m34741V(this.f5223q);
            m34741V(this.f5222p);
            m34741V(this.f5221o);
            m34741V(this.f5224r);
            m35191i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: p */
    public boolean mo34732p() {
        return (this.f5215i.isEmpty() && this.f5217k.isEmpty() && this.f5216j.isEmpty() && this.f5214h.isEmpty() && this.f5222p.isEmpty() && this.f5223q.isEmpty() && this.f5221o.isEmpty() && this.f5224r.isEmpty() && this.f5219m.isEmpty() && this.f5218l.isEmpty() && this.f5220n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: u */
    public void mo34731u() {
        boolean z = !this.f5214h.isEmpty();
        boolean z2 = !this.f5216j.isEmpty();
        boolean z3 = !this.f5217k.isEmpty();
        boolean z4 = !this.f5215i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC1620e0> it = this.f5214h.iterator();
            while (it.hasNext()) {
                m34742U(it.next());
            }
            this.f5214h.clear();
            if (z2) {
                ArrayList<C1712j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f5216j);
                this.f5219m.add(arrayList);
                this.f5216j.clear();
                RunnableC1703a runnableC1703a = new RunnableC1703a(arrayList);
                if (z) {
                    C7759x.m17512i0(arrayList.get(0).f5259a.itemView, runnableC1703a, m35187o());
                } else {
                    runnableC1703a.run();
                }
            }
            if (z3) {
                ArrayList<C1711i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f5217k);
                this.f5220n.add(arrayList2);
                this.f5217k.clear();
                RunnableC1704b runnableC1704b = new RunnableC1704b(arrayList2);
                if (z) {
                    C7759x.m17512i0(arrayList2.get(0).f5253a.itemView, runnableC1704b, m35187o());
                } else {
                    runnableC1704b.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC1620e0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f5215i);
                this.f5218l.add(arrayList3);
                this.f5215i.clear();
                RunnableC1705c runnableC1705c = new RunnableC1705c(arrayList3);
                if (!z && !z2 && !z3) {
                    runnableC1705c.run();
                } else {
                    C7759x.m17512i0(arrayList3.get(0).itemView, runnableC1705c, (z ? m35187o() : 0L) + Math.max(z2 ? m35188n() : 0L, z3 ? m35189m() : 0L));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1752y
    /* renamed from: w */
    public boolean mo34564w(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34736a0(abstractC1620e0);
        abstractC1620e0.itemView.setAlpha(0.0f);
        this.f5215i.add(abstractC1620e0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1752y
    /* renamed from: x */
    public boolean mo34563x(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1620e0 abstractC1620e02, int i, int i2, int i3, int i4) {
        if (abstractC1620e0 == abstractC1620e02) {
            return mo34562y(abstractC1620e0, i, i2, i3, i4);
        }
        float translationX = abstractC1620e0.itemView.getTranslationX();
        float translationY = abstractC1620e0.itemView.getTranslationY();
        float alpha = abstractC1620e0.itemView.getAlpha();
        m34736a0(abstractC1620e0);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC1620e0.itemView.setTranslationX(translationX);
        abstractC1620e0.itemView.setTranslationY(translationY);
        abstractC1620e0.itemView.setAlpha(alpha);
        if (abstractC1620e02 != null) {
            m34736a0(abstractC1620e02);
            abstractC1620e02.itemView.setTranslationX(-i5);
            abstractC1620e02.itemView.setTranslationY(-i6);
            abstractC1620e02.itemView.setAlpha(0.0f);
        }
        this.f5217k.add(new C1711i(abstractC1620e0, abstractC1620e02, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1752y
    /* renamed from: y */
    public boolean mo34562y(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, int i2, int i3, int i4) {
        View view = abstractC1620e0.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC1620e0.itemView.getTranslationY());
        m34736a0(abstractC1620e0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m34582E(abstractC1620e0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f5216j.add(new C1712j(abstractC1620e0, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1752y
    /* renamed from: z */
    public boolean mo34561z(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34736a0(abstractC1620e0);
        this.f5214h.add(abstractC1620e0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$i */
    /* loaded from: classes2.dex */
    public static class C1711i {

        /* renamed from: a */
        public RecyclerView.AbstractC1620e0 f5253a;

        /* renamed from: b */
        public RecyclerView.AbstractC1620e0 f5254b;

        /* renamed from: c */
        public int f5255c;

        /* renamed from: d */
        public int f5256d;

        /* renamed from: e */
        public int f5257e;

        /* renamed from: f */
        public int f5258f;

        private C1711i(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1620e0 abstractC1620e02) {
            this.f5253a = abstractC1620e0;
            this.f5254b = abstractC1620e02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5253a + ", newHolder=" + this.f5254b + ", fromX=" + this.f5255c + ", fromY=" + this.f5256d + ", toX=" + this.f5257e + ", toY=" + this.f5258f + '}';
        }

        C1711i(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1620e0 abstractC1620e02, int i, int i2, int i3, int i4) {
            this(abstractC1620e0, abstractC1620e02);
            this.f5255c = i;
            this.f5256d = i2;
            this.f5257e = i3;
            this.f5258f = i4;
        }
    }
}
