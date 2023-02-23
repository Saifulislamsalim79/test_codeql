package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C4696r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p201g.p243j.p244a.AbstractC7781a;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p328m.InterfaceC9288k;
/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC1279b {

    /* renamed from: A */
    private ArrayList<InterfaceC4520g> f11049A;

    /* renamed from: B */
    private int f11050B;

    /* renamed from: C */
    private boolean f11051C;

    /* renamed from: D */
    private boolean f11052D;

    /* renamed from: E */
    private Behavior f11053E;

    /* renamed from: F */
    private int f11054F;

    /* renamed from: G */
    private int f11055G;

    /* renamed from: H */
    private int f11056H;

    /* renamed from: I */
    AnimatorListenerAdapter f11057I;

    /* renamed from: J */
    InterfaceC9288k<FloatingActionButton> f11058J;

    /* renamed from: c */
    private final int f11059c;

    /* renamed from: d */
    private final C9243g f11060d;

    /* renamed from: e */
    private Animator f11061e;

    /* renamed from: f */
    private Animator f11062f;

    /* renamed from: w */
    private int f11063w;

    /* renamed from: x */
    private int f11064x;

    /* renamed from: y */
    private boolean f11065y;

    /* renamed from: z */
    private int f11066z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes2.dex */
    public class C4513a extends AnimatorListenerAdapter {
        C4513a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m27550w();
            BottomAppBar.this.f11061e = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m27549x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes2.dex */
    public class C4514b extends FloatingActionButton.AbstractC4631b {

        /* renamed from: a */
        final /* synthetic */ int f11073a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: classes2.dex */
        class C4515a extends FloatingActionButton.AbstractC4631b {
            C4515a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC4631b
            /* renamed from: b */
            public void mo26947b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m27550w();
            }
        }

        C4514b(int i) {
            this.f11073a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC4631b
        /* renamed from: a */
        public void mo26948a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m27583B(this.f11073a));
            floatingActionButton.m26960u(new C4515a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes2.dex */
    public class C4516c extends AnimatorListenerAdapter {
        C4516c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m27550w();
            BottomAppBar.this.f11051C = false;
            BottomAppBar.this.f11062f = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m27549x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes2.dex */
    public class C4517d extends AnimatorListenerAdapter {

        /* renamed from: c */
        public boolean f11077c;

        /* renamed from: d */
        final /* synthetic */ ActionMenuView f11078d;

        /* renamed from: e */
        final /* synthetic */ int f11079e;

        /* renamed from: f */
        final /* synthetic */ boolean f11080f;

        C4517d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f11078d = actionMenuView;
            this.f11079e = i;
            this.f11080f = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11077c = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11077c) {
                return;
            }
            boolean z = BottomAppBar.this.f11050B != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m27579F(bottomAppBar.f11050B);
            BottomAppBar.this.m27573L(this.f11078d, this.f11079e, this.f11080f, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes2.dex */
    public class RunnableC4518e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ActionMenuView f11082c;

        /* renamed from: d */
        final /* synthetic */ int f11083d;

        /* renamed from: e */
        final /* synthetic */ boolean f11084e;

        RunnableC4518e(ActionMenuView actionMenuView, int i, boolean z) {
            this.f11082c = actionMenuView;
            this.f11083d = i;
            this.f11084e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f11082c;
            actionMenuView.setTranslationX(BottomAppBar.this.m27584A(actionMenuView, this.f11083d, this.f11084e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes2.dex */
    public class C4519f extends AnimatorListenerAdapter {
        C4519f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f11057I.onAnimationStart(animator);
            FloatingActionButton m27548y = BottomAppBar.this.m27548y();
            if (m27548y != null) {
                m27548y.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC4520g {
        /* renamed from: a */
        void m27541a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m27540b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    /* loaded from: classes2.dex */
    public static class C4521h extends AbstractC7781a {
        public static final Parcelable.Creator<C4521h> CREATOR = new C4522a();

        /* renamed from: e */
        int f11087e;

        /* renamed from: f */
        boolean f11088f;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h$a */
        /* loaded from: classes2.dex */
        static class C4522a implements Parcelable.ClassLoaderCreator<C4521h> {
            C4522a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4521h createFromParcel(Parcel parcel) {
                return new C4521h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4521h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4521h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4521h[] newArray(int i) {
                return new C4521h[i];
            }
        }

        public C4521h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11087e);
            parcel.writeInt(this.f11088f ? 1 : 0);
        }

        public C4521h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11087e = parcel.readInt();
            this.f11088f = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public float m27583B(int i) {
        boolean m26685d = C4696r.m26685d(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f11059c + (m26685d ? this.f11056H : this.f11055G))) * (m26685d ? -1 : 1);
        }
        return 0.0f;
    }

    /* renamed from: C */
    private boolean m27582C() {
        FloatingActionButton m27548y = m27548y();
        return m27548y != null && m27548y.m26965p();
    }

    /* renamed from: D */
    private void m27581D(int i, boolean z) {
        if (!C7759x.m17535U(this)) {
            m27579F(this.f11050B);
            return;
        }
        Animator animator = this.f11062f;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m27582C()) {
            i = 0;
            z = false;
        }
        m27551v(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f11062f = animatorSet;
        animatorSet.addListener(new C4516c());
        this.f11062f.start();
    }

    /* renamed from: E */
    private void m27580E(int i) {
        if (this.f11063w == i || !C7759x.m17535U(this)) {
            return;
        }
        Animator animator = this.f11061e;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f11064x == 1) {
            m27552u(i, arrayList);
        } else {
            m27553t(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f11061e = animatorSet;
        animatorSet.addListener(new C4513a());
        this.f11061e.start();
    }

    /* renamed from: G */
    private void m27578G() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f11062f != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!m27582C()) {
            m27574K(actionMenuView, 0, false);
        } else {
            m27574K(actionMenuView, this.f11063w, this.f11052D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m27577H() {
        getTopEdgeTreatment().m27528k(getFabTranslationX());
        View m27547z = m27547z();
        this.f11060d.m15408Y((this.f11052D && m27582C()) ? 1.0f : 0.0f);
        if (m27547z != null) {
            m27547z.setTranslationY(getFabTranslationY());
            m27547z.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: K */
    private void m27574K(ActionMenuView actionMenuView, int i, boolean z) {
        m27573L(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m27573L(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC4518e runnableC4518e = new RunnableC4518e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC4518e);
        } else {
            runnableC4518e.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f11054F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m27583B(this.f11063w);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m27536c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f11056H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f11055G;
    }

    private C4523a getTopEdgeTreatment() {
        return (C4523a) this.f11060d.m15430C().m15348p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m27555r(FloatingActionButton floatingActionButton) {
        floatingActionButton.m26976e(this.f11057I);
        floatingActionButton.m26975f(new C4519f());
        floatingActionButton.m26974g(this.f11058J);
    }

    /* renamed from: s */
    private void m27554s() {
        Animator animator = this.f11062f;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f11061e;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: u */
    private void m27552u(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m27548y(), "translationX", m27583B(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: v */
    private void m27551v(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m27584A(actionMenuView, i, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new C4517d(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m27550w() {
        ArrayList<InterfaceC4520g> arrayList;
        int i = this.f11066z - 1;
        this.f11066z = i;
        if (i != 0 || (arrayList = this.f11049A) == null) {
            return;
        }
        Iterator<InterfaceC4520g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m27540b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m27549x() {
        ArrayList<InterfaceC4520g> arrayList;
        int i = this.f11066z;
        this.f11066z = i + 1;
        if (i != 0 || (arrayList = this.f11049A) == null) {
            return;
        }
        Iterator<InterfaceC4520g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m27541a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public FloatingActionButton m27548y() {
        View m27547z = m27547z();
        if (m27547z instanceof FloatingActionButton) {
            return (FloatingActionButton) m27547z;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m27547z() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m36536m(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m27547z():android.view.View");
    }

    /* renamed from: A */
    protected int m27584A(ActionMenuView actionMenuView, int i, boolean z) {
        if (i == 1 && z) {
            boolean m26685d = C4696r.m26685d(this);
            int measuredWidth = m26685d ? getMeasuredWidth() : 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof Toolbar.C1061e) && (((Toolbar.C1061e) childAt.getLayoutParams()).f2538a & 8388615) == 8388611) {
                    if (m26685d) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((m26685d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (m26685d ? this.f11055G : -this.f11056H));
        }
        return 0;
    }

    /* renamed from: F */
    public void m27579F(int i) {
        if (i != 0) {
            this.f11050B = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    /* renamed from: I */
    public void m27576I(int i, int i2) {
        this.f11050B = i2;
        m27581D(i, this.f11052D);
        m27580E(i);
        this.f11063w = i;
    }

    /* renamed from: J */
    boolean m27575J(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().m27533f()) {
            getTopEdgeTreatment().m27529j(f);
            this.f11060d.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.f11060d.m15428E();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m27536c();
    }

    public int getFabAlignmentMode() {
        return this.f11063w;
    }

    public int getFabAnimationMode() {
        return this.f11064x;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m27535d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m27534e();
    }

    public boolean getHideOnScroll() {
        return this.f11065y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9247h.m15366f(this, this.f11060d);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m27554s();
            m27577H();
        }
        m27578G();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4521h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4521h c4521h = (C4521h) parcelable;
        super.onRestoreInstanceState(c4521h.m17424a());
        this.f11063w = c4521h.f11087e;
        this.f11052D = c4521h.f11088f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C4521h c4521h = new C4521h(super.onSaveInstanceState());
        c4521h.f11087e = this.f11063w;
        c4521h.f11088f = this.f11052D;
        return c4521h;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C1365a.m36187o(this.f11060d, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m27532g(f);
            this.f11060d.invalidateSelf();
            m27577H();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f11060d.m15410W(f);
        getBehavior().m27597G(this, this.f11060d.m15431B() - this.f11060d.m15432A());
    }

    public void setFabAlignmentMode(int i) {
        m27576I(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f11064x = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m27531h(f);
            this.f11060d.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m27530i(f);
            this.f11060d.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f11065y = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t */
    protected void m27553t(int i, List<Animator> list) {
        FloatingActionButton m27548y = m27548y();
        if (m27548y == null || m27548y.m26966o()) {
            return;
        }
        m27549x();
        m27548y.m26968m(new C4514b(i));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1279b
    public Behavior getBehavior() {
        if (this.f11053E == null) {
            this.f11053E = new Behavior();
        }
        return this.f11053E;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f11067e;

        /* renamed from: f */
        private WeakReference<BottomAppBar> f11068f;

        /* renamed from: g */
        private int f11069g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f11070h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes2.dex */
        class View$OnLayoutChangeListenerC4512a implements View.OnLayoutChangeListener {
            View$OnLayoutChangeListenerC4512a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f11068f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.m26971j(Behavior.this.f11067e);
                    int height = Behavior.this.f11067e.height();
                    bottomAppBar.m27575J(height);
                    CoordinatorLayout.C1283f c1283f = (CoordinatorLayout.C1283f) view.getLayoutParams();
                    if (Behavior.this.f11069g == 0) {
                        ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C9267d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) c1283f).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c1283f).rightMargin = bottomAppBar.getRightInset();
                        if (C4696r.m26685d(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) c1283f).leftMargin += bottomAppBar.f11059c;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1283f).rightMargin += bottomAppBar.f11059c;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f11070h = new View$OnLayoutChangeListenerC4512a();
            this.f11067e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: M */
        public boolean mo26206l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f11068f = new WeakReference<>(bottomAppBar);
            View m27547z = bottomAppBar.m27547z();
            if (m27547z != null && !C7759x.m17535U(m27547z)) {
                CoordinatorLayout.C1283f c1283f = (CoordinatorLayout.C1283f) m27547z.getLayoutParams();
                c1283f.f4027d = 49;
                this.f11069g = ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin;
                if (m27547z instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m27547z;
                    floatingActionButton.addOnLayoutChangeListener(this.f11070h);
                    bottomAppBar.m27555r(floatingActionButton);
                }
                bottomAppBar.m27577H();
            }
            coordinatorLayout.m36564C(bottomAppBar, i);
            return super.mo26206l(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: N */
        public boolean mo27481A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo27481A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11070h = new View$OnLayoutChangeListenerC4512a();
            this.f11067e = new Rect();
        }
    }
}
