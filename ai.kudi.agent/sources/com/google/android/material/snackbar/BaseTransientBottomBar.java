package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C4733b;
import com.google.android.material.theme.p106a.C4804a;
import java.util.List;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7752q;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p335s.C9310a;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: t */
    static final Handler f11798t;

    /* renamed from: u */
    private static final boolean f11799u;

    /* renamed from: v */
    private static final int[] f11800v;

    /* renamed from: w */
    private static final String f11801w;

    /* renamed from: a */
    private final ViewGroup f11802a;

    /* renamed from: b */
    private final Context f11803b;

    /* renamed from: c */
    protected final C4729v f11804c;

    /* renamed from: d */
    private final InterfaceC4732a f11805d;

    /* renamed from: e */
    private int f11806e;

    /* renamed from: f */
    private boolean f11807f;

    /* renamed from: g */
    private View f11808g;

    /* renamed from: j */
    private Rect f11811j;

    /* renamed from: k */
    private int f11812k;

    /* renamed from: l */
    private int f11813l;

    /* renamed from: m */
    private int f11814m;

    /* renamed from: n */
    private int f11815n;

    /* renamed from: o */
    private int f11816o;

    /* renamed from: p */
    private List<AbstractC4725r<B>> f11817p;

    /* renamed from: q */
    private Behavior f11818q;

    /* renamed from: r */
    private final AccessibilityManager f11819r;

    /* renamed from: h */
    private boolean f11809h = false;

    /* renamed from: i */
    private final Runnable f11810i = new RunnableC4717k();

    /* renamed from: s */
    C4733b.InterfaceC4735b f11820s = new C4720n();

    /* loaded from: classes2.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C4726s f11821k = new C4726s(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public void m26621P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f11821k.m26613c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo26623E(View view) {
            return this.f11821k.m26615a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: k */
        public boolean mo26620k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f11821k.m26614b(coordinatorLayout, view, motionEvent);
            return super.mo26620k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes2.dex */
    public class RunnableC4707a implements Runnable {
        RunnableC4707a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4729v c4729v = BaseTransientBottomBar.this.f11804c;
            if (c4729v == null) {
                return;
            }
            if (c4729v.getParent() != null) {
                BaseTransientBottomBar.this.f11804c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f11804c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m26652Q();
            } else {
                BaseTransientBottomBar.this.m26650S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes2.dex */
    public class C4708b extends AnimatorListenerAdapter {
        C4708b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26659I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes2.dex */
    public class C4709c extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ int f11824c;

        C4709c(int i) {
            this.f11824c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26660H(this.f11824c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: classes2.dex */
    public class C4710d implements ValueAnimator.AnimatorUpdateListener {
        C4710d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f11804c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes2.dex */
    public class C4711e implements ValueAnimator.AnimatorUpdateListener {
        C4711e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f11804c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f11804c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: classes2.dex */
    public class C4712f extends AnimatorListenerAdapter {
        C4712f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26659I();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11805d.mo26595a(70, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: classes2.dex */
    public class C4713g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        private int f11829c;

        /* renamed from: d */
        final /* synthetic */ int f11830d;

        C4713g(int i) {
            this.f11830d = i;
            this.f11829c = this.f11830d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f11799u) {
                C7759x.m17528a0(BaseTransientBottomBar.this.f11804c, intValue - this.f11829c);
            } else {
                BaseTransientBottomBar.this.f11804c.setTranslationY(intValue);
            }
            this.f11829c = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: classes2.dex */
    public class C4714h extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ int f11832c;

        C4714h(int i) {
            this.f11832c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26660H(this.f11832c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11805d.mo26594b(0, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: classes2.dex */
    public class C4715i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        private int f11834c = 0;

        C4715i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f11799u) {
                C7759x.m17528a0(BaseTransientBottomBar.this.f11804c, intValue - this.f11834c);
            } else {
                BaseTransientBottomBar.this.f11804c.setTranslationY(intValue);
            }
            this.f11834c = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: classes2.dex */
    static class C4716j implements Handler.Callback {
        C4716j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).m26654O();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).m26663E(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: classes2.dex */
    class RunnableC4717k implements Runnable {
        RunnableC4717k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int m26624z;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f11804c == null || baseTransientBottomBar.f11803b == null || (m26624z = (BaseTransientBottomBar.this.m26624z() - BaseTransientBottomBar.this.m26665C()) + ((int) BaseTransientBottomBar.this.f11804c.getTranslationY())) >= BaseTransientBottomBar.this.f11815n) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f11804c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f11801w, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f11815n - m26624z;
            BaseTransientBottomBar.this.f11804c.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    /* loaded from: classes2.dex */
    class C4718l implements InterfaceC7752q {
        C4718l() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7752q
        /* renamed from: a */
        public C7698g0 mo17573a(View view, C7698g0 c7698g0) {
            BaseTransientBottomBar.this.f11812k = c7698g0.m17785i();
            BaseTransientBottomBar.this.f11813l = c7698g0.m17784j();
            BaseTransientBottomBar.this.f11814m = c7698g0.m17783k();
            BaseTransientBottomBar.this.m26648U();
            return c7698g0;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: classes2.dex */
    class C4719m extends C7676a {
        C4719m() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            c7716c.m17694a(1048576);
            c7716c.m17683f0(true);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: j */
        public boolean mo17858j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.mo26600s();
                return true;
            }
            return super.mo17858j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: classes2.dex */
    class C4720n implements C4733b.InterfaceC4735b {
        C4720n() {
        }

        @Override // com.google.android.material.snackbar.C4733b.InterfaceC4735b
        /* renamed from: a */
        public void mo26579a(int i) {
            Handler handler = BaseTransientBottomBar.f11798t;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C4733b.InterfaceC4735b
        /* renamed from: c */
        public void mo26578c() {
            Handler handler = BaseTransientBottomBar.f11798t;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: classes2.dex */
    public class C4721o implements InterfaceC4727t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o$a */
        /* loaded from: classes2.dex */
        class RunnableC4722a implements Runnable {
            RunnableC4722a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.m26660H(3);
            }
        }

        C4721o() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC4727t
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f11804c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.f11815n = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.m26648U();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC4727t
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.m26662F()) {
                BaseTransientBottomBar.f11798t.post(new RunnableC4722a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    /* loaded from: classes2.dex */
    public class C4723p implements InterfaceC4728u {
        C4723p() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC4728u
        /* renamed from: a */
        public void mo26612a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f11804c.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.m26653P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    /* loaded from: classes2.dex */
    public class C4724q implements SwipeDismissBehavior.InterfaceC4510c {
        C4724q() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC4510c
        /* renamed from: a */
        public void mo26619a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m26629t(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC4510c
        /* renamed from: b */
        public void mo26618b(int i) {
            if (i == 0) {
                C4733b.m26591c().m26583k(BaseTransientBottomBar.this.f11820s);
            } else if (i == 1 || i == 2) {
                C4733b.m26591c().m26584j(BaseTransientBottomBar.this.f11820s);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4725r<B> {
        /* renamed from: a */
        public void m26617a(B b, int i) {
        }

        /* renamed from: b */
        public void m26616b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    /* loaded from: classes2.dex */
    public static class C4726s {

        /* renamed from: a */
        private C4733b.InterfaceC4735b f11844a;

        public C4726s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m27588L(0.1f);
            swipeDismissBehavior.m27590J(0.6f);
            swipeDismissBehavior.m27587M(0);
        }

        /* renamed from: a */
        public boolean m26615a(View view) {
            return view instanceof C4729v;
        }

        /* renamed from: b */
        public void m26614b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m36527v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C4733b.m26591c().m26584j(this.f11844a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C4733b.m26591c().m26583k(this.f11844a);
            }
        }

        /* renamed from: c */
        public void m26613c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f11844a = baseTransientBottomBar.f11820s;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    /* loaded from: classes2.dex */
    public interface InterfaceC4727t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    /* loaded from: classes2.dex */
    public interface InterfaceC4728u {
        /* renamed from: a */
        void mo26612a(View view, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    /* loaded from: classes2.dex */
    public static class C4729v extends FrameLayout {

        /* renamed from: z */
        private static final View.OnTouchListener f11845z = new View$OnTouchListenerC4730a();

        /* renamed from: c */
        private InterfaceC4728u f11846c;

        /* renamed from: d */
        private InterfaceC4727t f11847d;

        /* renamed from: e */
        private int f11848e;

        /* renamed from: f */
        private final float f11849f;

        /* renamed from: w */
        private final float f11850w;

        /* renamed from: x */
        private ColorStateList f11851x;

        /* renamed from: y */
        private PorterDuff.Mode f11852y;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        /* loaded from: classes2.dex */
        static class View$OnTouchListenerC4730a implements View.OnTouchListener {
            View$OnTouchListenerC4730a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public C4729v(Context context, AttributeSet attributeSet) {
            super(C4804a.m26258c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C9277l.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C9277l.SnackbarLayout_elevation)) {
                C7759x.m17484w0(this, obtainStyledAttributes.getDimensionPixelSize(C9277l.SnackbarLayout_elevation, 0));
            }
            this.f11848e = obtainStyledAttributes.getInt(C9277l.SnackbarLayout_animationMode, 0);
            this.f11849f = obtainStyledAttributes.getFloat(C9277l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C9321c.m15053a(context2, obtainStyledAttributes, C9277l.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C4696r.m26684e(obtainStyledAttributes.getInt(C9277l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f11850w = obtainStyledAttributes.getFloat(C9277l.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f11845z);
            setFocusable(true);
            if (getBackground() == null) {
                C7759x.m17492s0(this, m26611a());
            }
        }

        /* renamed from: a */
        private Drawable m26611a() {
            float dimension = getResources().getDimension(C9267d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C9310a.m15078g(this, C9233b.colorSurface, C9233b.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f11851x != null) {
                Drawable m36184r = C1365a.m36184r(gradientDrawable);
                C1365a.m36187o(m36184r, this.f11851x);
                return m36184r;
            }
            return C1365a.m36184r(gradientDrawable);
        }

        float getActionTextColorAlpha() {
            return this.f11850w;
        }

        int getAnimationMode() {
            return this.f11848e;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f11849f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            InterfaceC4727t interfaceC4727t = this.f11847d;
            if (interfaceC4727t != null) {
                interfaceC4727t.onViewAttachedToWindow(this);
            }
            C7759x.m17504m0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            InterfaceC4727t interfaceC4727t = this.f11847d;
            if (interfaceC4727t != null) {
                interfaceC4727t.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            InterfaceC4728u interfaceC4728u = this.f11846c;
            if (interfaceC4728u != null) {
                interfaceC4728u.mo26612a(this, i, i2, i3, i4);
            }
        }

        void setAnimationMode(int i) {
            this.f11848e = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f11851x != null) {
                drawable = C1365a.m36184r(drawable.mutate());
                C1365a.m36187o(drawable, this.f11851x);
                C1365a.m36186p(drawable, this.f11852y);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f11851x = colorStateList;
            if (getBackground() != null) {
                Drawable m36184r = C1365a.m36184r(getBackground().mutate());
                C1365a.m36187o(m36184r, colorStateList);
                C1365a.m36186p(m36184r, this.f11852y);
                if (m36184r != getBackground()) {
                    super.setBackgroundDrawable(m36184r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f11852y = mode;
            if (getBackground() != null) {
                Drawable m36184r = C1365a.m36184r(getBackground().mutate());
                C1365a.m36186p(m36184r, mode);
                if (m36184r != getBackground()) {
                    super.setBackgroundDrawable(m36184r);
                }
            }
        }

        void setOnAttachStateChangeListener(InterfaceC4727t interfaceC4727t) {
            this.f11847d = interfaceC4727t;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f11845z);
            super.setOnClickListener(onClickListener);
        }

        void setOnLayoutChangeListener(InterfaceC4728u interfaceC4728u) {
            this.f11846c = interfaceC4728u;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f11799u = i >= 16 && i <= 19;
        f11800v = new int[]{C9233b.snackbarStyle};
        f11801w = BaseTransientBottomBar.class.getSimpleName();
        f11798t = new Handler(Looper.getMainLooper(), new C4716j());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, InterfaceC4732a interfaceC4732a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC4732a != null) {
            this.f11802a = viewGroup;
            this.f11805d = interfaceC4732a;
            this.f11803b = context;
            C4695q.m26697a(context);
            C4729v c4729v = (C4729v) LayoutInflater.from(context).inflate(m26667A(), this.f11802a, false);
            this.f11804c = c4729v;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).m26598c(c4729v.getActionTextColorAlpha());
            }
            this.f11804c.addView(view);
            ViewGroup.LayoutParams layoutParams = this.f11804c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f11811j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C7759x.m17494r0(this.f11804c, 1);
            C7759x.m17478z0(this.f11804c, 1);
            C7759x.m17482x0(this.f11804c, true);
            C7759x.m17562C0(this.f11804c, new C4718l());
            C7759x.m17498p0(this.f11804c, new C4719m());
            this.f11819r = (AccessibilityManager) context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    /* renamed from: B */
    private int m26666B() {
        int height = this.f11804c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f11804c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public int m26665C() {
        int[] iArr = new int[2];
        this.f11804c.getLocationOnScreen(iArr);
        return iArr[1] + this.f11804c.getHeight();
    }

    /* renamed from: G */
    private boolean m26661G() {
        ViewGroup.LayoutParams layoutParams = this.f11804c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C1283f) && (((CoordinatorLayout.C1283f) layoutParams).m36505f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: K */
    private void m26657K(CoordinatorLayout.C1283f c1283f) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f11818q;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = m26626x();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m26621P(this);
        }
        swipeDismissBehavior.m27589K(new C4724q());
        c1283f.m36496o(swipeDismissBehavior);
        if (this.f11808g == null) {
            c1283f.f4030g = 80;
        }
    }

    /* renamed from: M */
    private boolean m26655M() {
        return this.f11815n > 0 && !this.f11807f && m26661G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m26653P() {
        if (m26656L()) {
            m26632p();
            return;
        }
        if (this.f11804c.getParent() != null) {
            this.f11804c.setVisibility(0);
        }
        m26659I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m26652Q() {
        ValueAnimator m26628u = m26628u(0.0f, 1.0f);
        ValueAnimator m26625y = m26625y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m26628u, m26625y);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C4708b());
        animatorSet.start();
    }

    /* renamed from: R */
    private void m26651R(int i) {
        ValueAnimator m26628u = m26628u(1.0f, 0.0f);
        m26628u.setDuration(75L);
        m26628u.addListener(new C4709c(i));
        m26628u.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m26650S() {
        int m26666B = m26666B();
        if (f11799u) {
            C7759x.m17528a0(this.f11804c, m26666B);
        } else {
            this.f11804c.setTranslationY(m26666B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m26666B, 0);
        valueAnimator.setInterpolator(C9278a.f21807b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C4712f());
        valueAnimator.addUpdateListener(new C4713g(m26666B));
        valueAnimator.start();
    }

    /* renamed from: T */
    private void m26649T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m26666B());
        valueAnimator.setInterpolator(C9278a.f21807b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C4714h(i));
        valueAnimator.addUpdateListener(new C4715i());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m26648U() {
        ViewGroup.LayoutParams layoutParams = this.f11804c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f11811j != null) {
            int i = this.f11808g != null ? this.f11816o : this.f11812k;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = this.f11811j;
            marginLayoutParams.bottomMargin = rect.bottom + i;
            marginLayoutParams.leftMargin = rect.left + this.f11813l;
            marginLayoutParams.rightMargin = rect.right + this.f11814m;
            this.f11804c.requestLayout();
            if (Build.VERSION.SDK_INT < 29 || !m26655M()) {
                return;
            }
            this.f11804c.removeCallbacks(this.f11810i);
            this.f11804c.post(this.f11810i);
            return;
        }
        Log.w(f11801w, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* renamed from: q */
    private void m26631q(int i) {
        if (this.f11804c.getAnimationMode() == 1) {
            m26651R(i);
        } else {
            m26649T(i);
        }
    }

    /* renamed from: r */
    private int m26630r() {
        View view = this.f11808g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f11802a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f11802a.getHeight()) - i;
    }

    /* renamed from: u */
    private ValueAnimator m26628u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9278a.f21806a);
        ofFloat.addUpdateListener(new C4710d());
        return ofFloat;
    }

    /* renamed from: y */
    private ValueAnimator m26625y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9278a.f21809d);
        ofFloat.addUpdateListener(new C4711e());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public int m26624z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f11803b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: A */
    protected int m26667A() {
        return m26664D() ? C9273h.mtrl_layout_snackbar : C9273h.design_layout_snackbar;
    }

    /* renamed from: D */
    protected boolean m26664D() {
        TypedArray obtainStyledAttributes = this.f11803b.obtainStyledAttributes(f11800v);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: E */
    final void m26663E(int i) {
        if (m26656L() && this.f11804c.getVisibility() == 0) {
            m26631q(i);
        } else {
            m26660H(i);
        }
    }

    /* renamed from: F */
    public boolean m26662F() {
        return C4733b.m26591c().m26589e(this.f11820s);
    }

    /* renamed from: H */
    void m26660H(int i) {
        C4733b.m26591c().m26586h(this.f11820s);
        List<AbstractC4725r<B>> list = this.f11817p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11817p.get(size).m26617a(this, i);
            }
        }
        ViewParent parent = this.f11804c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f11804c);
        }
    }

    /* renamed from: I */
    void m26659I() {
        C4733b.m26591c().m26585i(this.f11820s);
        List<AbstractC4725r<B>> list = this.f11817p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11817p.get(size).m26616b(this);
            }
        }
    }

    /* renamed from: J */
    public B m26658J(int i) {
        this.f11806e = i;
        return this;
    }

    /* renamed from: L */
    boolean m26656L() {
        AccessibilityManager accessibilityManager = this.f11819r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: N */
    public void mo26610N() {
        C4733b.m26591c().m26581m(mo26599w(), this.f11820s);
    }

    /* renamed from: O */
    final void m26654O() {
        this.f11804c.setOnAttachStateChangeListener(new C4721o());
        if (this.f11804c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f11804c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1283f) {
                m26657K((CoordinatorLayout.C1283f) layoutParams);
            }
            this.f11816o = m26630r();
            m26648U();
            this.f11804c.setVisibility(4);
            this.f11802a.addView(this.f11804c);
        }
        if (C7759x.m17535U(this.f11804c)) {
            m26653P();
        } else {
            this.f11804c.setOnLayoutChangeListener(new C4723p());
        }
    }

    /* renamed from: p */
    void m26632p() {
        this.f11804c.post(new RunnableC4707a());
    }

    /* renamed from: s */
    public void mo26600s() {
        m26629t(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public void m26629t(int i) {
        C4733b.m26591c().m26592b(this.f11820s, i);
    }

    /* renamed from: v */
    public Context m26627v() {
        return this.f11803b;
    }

    /* renamed from: w */
    public int mo26599w() {
        return this.f11806e;
    }

    /* renamed from: x */
    protected SwipeDismissBehavior<? extends View> m26626x() {
        return new Behavior();
    }
}
