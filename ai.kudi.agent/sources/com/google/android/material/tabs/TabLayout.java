package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C1155t0;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1398i;
import androidx.viewpager.widget.AbstractC1904a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.theme.p106a.C4804a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p201g.p202a.C7461j;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p237k.C7673f;
import p201g.p227h.p237k.C7674g;
import p201g.p227h.p237k.InterfaceC7672e;
import p201g.p227h.p238l.C7713h;
import p201g.p227h.p238l.C7756u;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p324a0.C9232b;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p329n.C9289a;
import p272h.p286c.p287a.p323c.p329n.C9293b;
import p272h.p286c.p287a.p323c.p342z.C9321c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
@ViewPager.InterfaceC1893e
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: l0 */
    private static final int f11874l0 = C9276k.Widget_Design_TabLayout;

    /* renamed from: m0 */
    private static final InterfaceC7672e<C4745g> f11875m0 = new C7674g(16);

    /* renamed from: A */
    ColorStateList f11876A;

    /* renamed from: B */
    ColorStateList f11877B;

    /* renamed from: C */
    ColorStateList f11878C;

    /* renamed from: D */
    Drawable f11879D;

    /* renamed from: E */
    private int f11880E;

    /* renamed from: F */
    PorterDuff.Mode f11881F;

    /* renamed from: G */
    float f11882G;

    /* renamed from: H */
    float f11883H;

    /* renamed from: I */
    final int f11884I;

    /* renamed from: J */
    int f11885J;

    /* renamed from: K */
    private final int f11886K;

    /* renamed from: L */
    private final int f11887L;

    /* renamed from: M */
    private final int f11888M;

    /* renamed from: N */
    private int f11889N;

    /* renamed from: O */
    int f11890O;

    /* renamed from: P */
    int f11891P;

    /* renamed from: Q */
    int f11892Q;

    /* renamed from: R */
    int f11893R;

    /* renamed from: S */
    boolean f11894S;

    /* renamed from: T */
    boolean f11895T;

    /* renamed from: U */
    int f11896U;

    /* renamed from: V */
    boolean f11897V;

    /* renamed from: W */
    private C4751b f11898W;

    /* renamed from: a0 */
    private InterfaceC4739c f11899a0;

    /* renamed from: b0 */
    private final ArrayList<InterfaceC4739c> f11900b0;

    /* renamed from: c */
    private final ArrayList<C4745g> f11901c;

    /* renamed from: c0 */
    private InterfaceC4739c f11902c0;

    /* renamed from: d */
    private C4745g f11903d;

    /* renamed from: d0 */
    private ValueAnimator f11904d0;

    /* renamed from: e */
    final C4742f f11905e;

    /* renamed from: e0 */
    ViewPager f11906e0;

    /* renamed from: f */
    int f11907f;

    /* renamed from: f0 */
    private AbstractC1904a f11908f0;

    /* renamed from: g0 */
    private DataSetObserver f11909g0;

    /* renamed from: h0 */
    private C4746h f11910h0;

    /* renamed from: i0 */
    private C4738b f11911i0;

    /* renamed from: j0 */
    private boolean f11912j0;

    /* renamed from: k0 */
    private final InterfaceC7672e<C4747i> f11913k0;

    /* renamed from: w */
    int f11914w;

    /* renamed from: x */
    int f11915x;

    /* renamed from: y */
    int f11916y;

    /* renamed from: z */
    int f11917z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    /* loaded from: classes2.dex */
    public class C4737a implements ValueAnimator.AnimatorUpdateListener {
        C4737a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    /* loaded from: classes2.dex */
    public class C4738b implements ViewPager.InterfaceC1897i {

        /* renamed from: a */
        private boolean f11919a;

        C4738b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1897i
        /* renamed from: a */
        public void mo26535a(ViewPager viewPager, AbstractC1904a abstractC1904a, AbstractC1904a abstractC1904a2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f11906e0 == viewPager) {
                tabLayout.m26569H(abstractC1904a2, this.f11919a);
            }
        }

        /* renamed from: b */
        void m26534b(boolean z) {
            this.f11919a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4739c<T extends C4745g> {
        void onTabReselected(T t);

        void onTabSelected(T t);

        void onTabUnselected(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4740d extends InterfaceC4739c<C4745g> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    /* loaded from: classes2.dex */
    public class C4741e extends DataSetObserver {
        C4741e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m26576A();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m26576A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    /* loaded from: classes2.dex */
    public class C4742f extends LinearLayout {

        /* renamed from: c */
        ValueAnimator f11922c;

        /* renamed from: d */
        int f11923d;

        /* renamed from: e */
        float f11924e;

        /* renamed from: f */
        private int f11925f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        /* loaded from: classes2.dex */
        public class C4743a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: c */
            final /* synthetic */ View f11927c;

            /* renamed from: d */
            final /* synthetic */ View f11928d;

            C4743a(View view, View view2) {
                this.f11927c = view;
                this.f11928d = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4742f.this.m26527g(this.f11927c, this.f11928d, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        /* loaded from: classes2.dex */
        public class C4744b extends AnimatorListenerAdapter {

            /* renamed from: c */
            final /* synthetic */ int f11930c;

            C4744b(int i) {
                this.f11930c = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C4742f.this.f11923d = this.f11930c;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C4742f.this.f11923d = this.f11930c;
            }
        }

        C4742f(Context context) {
            super(context);
            this.f11923d = -1;
            this.f11925f = -1;
            setWillNotDraw(false);
        }

        /* renamed from: d */
        private void m26530d() {
            View childAt = getChildAt(this.f11923d);
            C4751b c4751b = TabLayout.this.f11898W;
            TabLayout tabLayout = TabLayout.this;
            c4751b.m26474d(tabLayout, childAt, tabLayout.f11879D);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m26527g(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C4751b c4751b = TabLayout.this.f11898W;
                TabLayout tabLayout = TabLayout.this;
                c4751b.mo26475c(tabLayout, view, view2, f, tabLayout.f11879D);
            } else {
                Drawable drawable = TabLayout.this.f11879D;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f11879D.getBounds().bottom);
            }
            C7759x.m17516g0(this);
        }

        /* renamed from: h */
        private void m26526h(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f11923d);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m26530d();
                return;
            }
            C4743a c4743a = new C4743a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f11922c = valueAnimator;
                valueAnimator.setInterpolator(C9278a.f21807b);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(c4743a);
                valueAnimator.addListener(new C4744b(i));
                valueAnimator.start();
                return;
            }
            this.f11922c.removeAllUpdateListeners();
            this.f11922c.addUpdateListener(c4743a);
        }

        /* renamed from: b */
        void m26532b(int i, int i2) {
            ValueAnimator valueAnimator = this.f11922c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f11922c.cancel();
            }
            m26526h(true, i, i2);
        }

        /* renamed from: c */
        boolean m26531c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height = TabLayout.this.f11879D.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f11879D.getIntrinsicHeight();
            }
            int i = TabLayout.this.f11892Q;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                height = i != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f11879D.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f11879D.getBounds();
                TabLayout.this.f11879D.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f11879D;
                if (tabLayout.f11880E != 0) {
                    drawable = C1365a.m36184r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f11880E, PorterDuff.Mode.SRC_IN);
                    } else {
                        C1365a.m36188n(drawable, TabLayout.this.f11880E);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        void m26529e(int i, float f) {
            ValueAnimator valueAnimator = this.f11922c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f11922c.cancel();
            }
            this.f11923d = i;
            this.f11924e = f;
            m26527g(getChildAt(i), getChildAt(this.f11923d + 1), this.f11924e);
        }

        /* renamed from: f */
        void m26528f(int i) {
            Rect bounds = TabLayout.this.f11879D.getBounds();
            TabLayout.this.f11879D.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f11922c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m26526h(false, this.f11923d, -1);
            } else {
                m26530d();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f11890O == 1 || tabLayout.f11893R == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) C4696r.m26687b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f11890O = 0;
                    tabLayout2.m26562O(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f11925f == i) {
                return;
            }
            requestLayout();
            this.f11925f = i;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    /* loaded from: classes2.dex */
    public static class C4745g {

        /* renamed from: a */
        private Object f11932a;

        /* renamed from: b */
        private Drawable f11933b;

        /* renamed from: c */
        private CharSequence f11934c;

        /* renamed from: d */
        private CharSequence f11935d;

        /* renamed from: f */
        private View f11937f;

        /* renamed from: h */
        public TabLayout f11939h;

        /* renamed from: i */
        public C4747i f11940i;

        /* renamed from: e */
        private int f11936e = -1;

        /* renamed from: g */
        private int f11938g = 1;

        /* renamed from: j */
        private int f11941j = -1;

        /* renamed from: e */
        public View m26521e() {
            return this.f11937f;
        }

        /* renamed from: f */
        public Drawable m26520f() {
            return this.f11933b;
        }

        /* renamed from: g */
        public int m26519g() {
            return this.f11941j;
        }

        /* renamed from: h */
        public int m26518h() {
            return this.f11936e;
        }

        /* renamed from: i */
        public int m26517i() {
            return this.f11938g;
        }

        /* renamed from: j */
        public Object m26516j() {
            return this.f11932a;
        }

        /* renamed from: k */
        public CharSequence m26515k() {
            return this.f11934c;
        }

        /* renamed from: l */
        public boolean m26514l() {
            TabLayout tabLayout = this.f11939h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f11936e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        void m26513m() {
            this.f11939h = null;
            this.f11940i = null;
            this.f11932a = null;
            this.f11933b = null;
            this.f11941j = -1;
            this.f11934c = null;
            this.f11935d = null;
            this.f11936e = -1;
            this.f11937f = null;
        }

        /* renamed from: n */
        public void m26512n() {
            TabLayout tabLayout = this.f11939h;
            if (tabLayout != null) {
                tabLayout.m26571F(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: o */
        public C4745g m26511o(CharSequence charSequence) {
            this.f11935d = charSequence;
            m26504v();
            return this;
        }

        /* renamed from: p */
        public C4745g m26510p(int i) {
            m26509q(LayoutInflater.from(this.f11940i.getContext()).inflate(i, (ViewGroup) this.f11940i, false));
            return this;
        }

        /* renamed from: q */
        public C4745g m26509q(View view) {
            this.f11937f = view;
            m26504v();
            return this;
        }

        /* renamed from: r */
        public C4745g m26508r(Drawable drawable) {
            this.f11933b = drawable;
            TabLayout tabLayout = this.f11939h;
            if (tabLayout.f11890O == 1 || tabLayout.f11893R == 2) {
                this.f11939h.m26562O(true);
            }
            m26504v();
            if (C9293b.f21862a && this.f11940i.m26491l() && this.f11940i.f11952w.isVisible()) {
                this.f11940i.invalidate();
            }
            return this;
        }

        /* renamed from: s */
        public C4745g m26507s(int i) {
            this.f11941j = i;
            C4747i c4747i = this.f11940i;
            if (c4747i != null) {
                c4747i.setId(i);
            }
            return this;
        }

        /* renamed from: t */
        void m26506t(int i) {
            this.f11936e = i;
        }

        /* renamed from: u */
        public C4745g m26505u(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f11935d) && !TextUtils.isEmpty(charSequence)) {
                this.f11940i.setContentDescription(charSequence);
            }
            this.f11934c = charSequence;
            m26504v();
            return this;
        }

        /* renamed from: v */
        void m26504v() {
            C4747i c4747i = this.f11940i;
            if (c4747i != null) {
                c4747i.m26483t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    /* loaded from: classes2.dex */
    public static class C4746h implements ViewPager.InterfaceC1898j {

        /* renamed from: a */
        private final WeakReference<TabLayout> f11942a;

        /* renamed from: b */
        private int f11943b;

        /* renamed from: c */
        private int f11944c;

        public C4746h(TabLayout tabLayout) {
            this.f11942a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        void m26503a() {
            this.f11944c = 0;
            this.f11943b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
        public void onPageScrollStateChanged(int i) {
            this.f11943b = this.f11944c;
            this.f11944c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f11942a.get();
            if (tabLayout != null) {
                boolean z = false;
                tabLayout.m26567J(i, f, this.f11944c != 2 || this.f11943b == 1, (this.f11944c == 2 && this.f11943b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f11942a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f11944c;
            tabLayout.m26570G(tabLayout.m26538x(i), i2 == 0 || (i2 == 2 && this.f11943b == 0));
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    /* loaded from: classes2.dex */
    public final class C4747i extends LinearLayout {

        /* renamed from: A */
        private Drawable f11945A;

        /* renamed from: B */
        private int f11946B;

        /* renamed from: c */
        private C4745g f11948c;

        /* renamed from: d */
        private TextView f11949d;

        /* renamed from: e */
        private ImageView f11950e;

        /* renamed from: f */
        private View f11951f;

        /* renamed from: w */
        private C9289a f11952w;

        /* renamed from: x */
        private View f11953x;

        /* renamed from: y */
        private TextView f11954y;

        /* renamed from: z */
        private ImageView f11955z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$i$a */
        /* loaded from: classes2.dex */
        public class View$OnLayoutChangeListenerC4748a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f11956a;

            View$OnLayoutChangeListenerC4748a(View view) {
                this.f11956a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f11956a.getVisibility() == 0) {
                    C4747i.this.m26484s(this.f11956a);
                }
            }
        }

        public C4747i(Context context) {
            super(context);
            this.f11946B = 2;
            m26482u(context);
            C7759x.m17560D0(this, TabLayout.this.f11907f, TabLayout.this.f11914w, TabLayout.this.f11915x, TabLayout.this.f11916y);
            setGravity(17);
            setOrientation(!TabLayout.this.f11894S ? 1 : 0);
            setClickable(true);
            C7759x.m17558E0(this, C7756u.m17568b(getContext(), 1002));
        }

        /* renamed from: f */
        private void m26497f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC4748a(view));
        }

        /* renamed from: g */
        private float m26496g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private C9289a getBadge() {
            return this.f11952w;
        }

        private C9289a getOrCreateBadge() {
            if (this.f11952w == null) {
                this.f11952w = C9289a.m15197d(getContext());
            }
            m26485r();
            C9289a c9289a = this.f11952w;
            if (c9289a != null) {
                return c9289a;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m26495h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        private FrameLayout m26494i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m26493j(Canvas canvas) {
            Drawable drawable = this.f11945A;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f11945A.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m26492k(View view) {
            if ((view == this.f11950e || view == this.f11949d) && C9293b.f21862a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public boolean m26491l() {
            return this.f11952w != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: m */
        private void m26490m() {
            FrameLayout frameLayout;
            if (C9293b.f21862a) {
                frameLayout = m26494i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C9273h.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f11950e = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: n */
        private void m26489n() {
            FrameLayout frameLayout;
            if (C9293b.f21862a) {
                frameLayout = m26494i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C9273h.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f11949d = textView;
            frameLayout.addView(textView);
        }

        /* renamed from: p */
        private void m26487p(View view) {
            if (m26491l() && view != null) {
                m26495h(false);
                C9293b.m15151a(this.f11952w, view, m26492k(view));
                this.f11951f = view;
            }
        }

        /* renamed from: q */
        private void m26486q() {
            if (m26491l()) {
                m26495h(true);
                View view = this.f11951f;
                if (view != null) {
                    C9293b.m15148d(this.f11952w, view);
                    this.f11951f = null;
                }
            }
        }

        /* renamed from: r */
        private void m26485r() {
            C4745g c4745g;
            C4745g c4745g2;
            if (m26491l()) {
                if (this.f11953x != null) {
                    m26486q();
                } else if (this.f11950e != null && (c4745g2 = this.f11948c) != null && c4745g2.m26520f() != null) {
                    View view = this.f11951f;
                    ImageView imageView = this.f11950e;
                    if (view != imageView) {
                        m26486q();
                        m26487p(this.f11950e);
                        return;
                    }
                    m26484s(imageView);
                } else if (this.f11949d != null && (c4745g = this.f11948c) != null && c4745g.m26517i() == 1) {
                    View view2 = this.f11951f;
                    TextView textView = this.f11949d;
                    if (view2 != textView) {
                        m26486q();
                        m26487p(this.f11949d);
                        return;
                    }
                    m26484s(textView);
                } else {
                    m26486q();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m26484s(View view) {
            if (m26491l() && view == this.f11951f) {
                C9293b.m15147e(this.f11952w, view, m26492k(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* renamed from: u */
        public void m26482u(Context context) {
            int i = TabLayout.this.f11884I;
            if (i != 0) {
                Drawable m18690d = C7462a.m18690d(context, i);
                this.f11945A = m18690d;
                if (m18690d != null && m18690d.isStateful()) {
                    this.f11945A.setState(getDrawableState());
                }
            } else {
                this.f11945A = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f11878C != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList m15447a = C9232b.m15447a(TabLayout.this.f11878C);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.f11897V) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(m15447a, gradientDrawable, TabLayout.this.f11897V ? null : gradientDrawable2);
                } else {
                    Drawable m36184r = C1365a.m36184r(gradientDrawable2);
                    C1365a.m36187o(m36184r, m15447a);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, m36184r});
                }
            }
            C7759x.m17492s0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* renamed from: w */
        private void m26480w(TextView textView, ImageView imageView) {
            C4745g c4745g = this.f11948c;
            Drawable mutate = (c4745g == null || c4745g.m26520f() == null) ? null : C1365a.m36184r(this.f11948c.m26520f()).mutate();
            C4745g c4745g2 = this.f11948c;
            CharSequence m26515k = c4745g2 != null ? c4745g2.m26515k() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m26515k);
            if (textView != null) {
                if (z) {
                    textView.setText(m26515k);
                    if (this.f11948c.f11938g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int m26687b = (z && imageView.getVisibility() == 0) ? (int) C4696r.m26687b(getContext(), 8) : 0;
                if (TabLayout.this.f11894S) {
                    if (m26687b != C7713h.m17731a(marginLayoutParams)) {
                        C7713h.m17729c(marginLayoutParams, m26687b);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (m26687b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = m26687b;
                    C7713h.m17729c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C4745g c4745g3 = this.f11948c;
            CharSequence charSequence = c4745g3 != null ? c4745g3.f11935d : null;
            if (!z) {
                m26515k = charSequence;
            }
            C1155t0.m36986a(this, m26515k);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f11945A;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f11945A.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f11949d, this.f11950e, this.f11953x};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f11949d, this.f11950e, this.f11953x};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public C4745g getTab() {
            return this.f11948c;
        }

        /* renamed from: o */
        void m26488o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C9289a c9289a = this.f11952w;
            if (c9289a != null && c9289a.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f11952w.m15192i()));
            }
            C7716c m17716E0 = C7716c.m17716E0(accessibilityNodeInfo);
            m17716E0.m17687d0(C7716c.C7719c.m17636a(0, 1, this.f11948c.m26518h(), 1, false, isSelected()));
            if (isSelected()) {
                m17716E0.m17691b0(false);
                m17716E0.m17702S(C7716c.C7717a.f18476g);
            }
            m17716E0.m17657s0(getResources().getString(C9275j.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f11885J, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f11949d != null) {
                float f = TabLayout.this.f11882G;
                int i3 = this.f11946B;
                ImageView imageView = this.f11950e;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f11949d;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f11883H;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f11949d.getTextSize();
                int lineCount = this.f11949d.getLineCount();
                int m36102d = C1398i.m36102d(this.f11949d);
                if (f != textSize || (m36102d >= 0 && i3 != m36102d)) {
                    if (TabLayout.this.f11893R == 1 && f > textSize && lineCount == 1 && ((layout = this.f11949d.getLayout()) == null || m26496g(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f11949d.setTextSize(0, f);
                        this.f11949d.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f11948c != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f11948c.m26512n();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f11949d;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f11950e;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f11953x;
            if (view != null) {
                view.setSelected(z);
            }
        }

        void setTab(C4745g c4745g) {
            if (c4745g != this.f11948c) {
                this.f11948c = c4745g;
                m26483t();
            }
        }

        /* renamed from: t */
        final void m26483t() {
            C4745g c4745g = this.f11948c;
            Drawable drawable = null;
            View m26521e = c4745g != null ? c4745g.m26521e() : null;
            if (m26521e != null) {
                ViewParent parent = m26521e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m26521e);
                    }
                    addView(m26521e);
                }
                this.f11953x = m26521e;
                TextView textView = this.f11949d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f11950e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f11950e.setImageDrawable(null);
                }
                TextView textView2 = (TextView) m26521e.findViewById(16908308);
                this.f11954y = textView2;
                if (textView2 != null) {
                    this.f11946B = C1398i.m36102d(textView2);
                }
                this.f11955z = (ImageView) m26521e.findViewById(16908294);
            } else {
                View view = this.f11953x;
                if (view != null) {
                    removeView(view);
                    this.f11953x = null;
                }
                this.f11954y = null;
                this.f11955z = null;
            }
            if (this.f11953x == null) {
                if (this.f11950e == null) {
                    m26490m();
                }
                if (c4745g != null && c4745g.m26520f() != null) {
                    drawable = C1365a.m36184r(c4745g.m26520f()).mutate();
                }
                if (drawable != null) {
                    C1365a.m36187o(drawable, TabLayout.this.f11877B);
                    PorterDuff.Mode mode = TabLayout.this.f11881F;
                    if (mode != null) {
                        C1365a.m36186p(drawable, mode);
                    }
                }
                if (this.f11949d == null) {
                    m26489n();
                    this.f11946B = C1398i.m36102d(this.f11949d);
                }
                C1398i.m36089q(this.f11949d, TabLayout.this.f11917z);
                ColorStateList colorStateList = TabLayout.this.f11876A;
                if (colorStateList != null) {
                    this.f11949d.setTextColor(colorStateList);
                }
                m26480w(this.f11949d, this.f11950e);
                m26485r();
                m26497f(this.f11950e);
                m26497f(this.f11949d);
            } else if (this.f11954y != null || this.f11955z != null) {
                m26480w(this.f11954y, this.f11955z);
            }
            if (c4745g != null && !TextUtils.isEmpty(c4745g.f11935d)) {
                setContentDescription(c4745g.f11935d);
            }
            setSelected(c4745g != null && c4745g.m26514l());
        }

        /* renamed from: v */
        final void m26481v() {
            setOrientation(!TabLayout.this.f11894S ? 1 : 0);
            if (this.f11954y == null && this.f11955z == null) {
                m26480w(this.f11949d, this.f11950e);
            } else {
                m26480w(this.f11954y, this.f11955z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    /* loaded from: classes2.dex */
    public static class C4749j implements InterfaceC4740d {

        /* renamed from: a */
        private final ViewPager f11958a;

        public C4749j(ViewPager viewPager) {
            this.f11958a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
        public void onTabReselected(C4745g c4745g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
        public void onTabSelected(C4745g c4745g) {
            this.f11958a.setCurrentItem(c4745g.m26518h());
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
        public void onTabUnselected(C4745g c4745g) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.tabStyle);
    }

    /* renamed from: E */
    private void m26572E(int i) {
        C4747i c4747i = (C4747i) this.f11905e.getChildAt(i);
        this.f11905e.removeViewAt(i);
        if (c4747i != null) {
            c4747i.m26488o();
            this.f11913k0.mo11983a(c4747i);
        }
        requestLayout();
    }

    /* renamed from: L */
    private void m26565L(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f11906e0;
        if (viewPager2 != null) {
            C4746h c4746h = this.f11910h0;
            if (c4746h != null) {
                viewPager2.removeOnPageChangeListener(c4746h);
            }
            C4738b c4738b = this.f11911i0;
            if (c4738b != null) {
                this.f11906e0.removeOnAdapterChangeListener(c4738b);
            }
        }
        InterfaceC4739c interfaceC4739c = this.f11902c0;
        if (interfaceC4739c != null) {
            m26573D(interfaceC4739c);
            this.f11902c0 = null;
        }
        if (viewPager != null) {
            this.f11906e0 = viewPager;
            if (this.f11910h0 == null) {
                this.f11910h0 = new C4746h(this);
            }
            this.f11910h0.m26503a();
            viewPager.addOnPageChangeListener(this.f11910h0);
            C4749j c4749j = new C4749j(viewPager);
            this.f11902c0 = c4749j;
            m26559c(c4749j);
            AbstractC1904a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m26569H(adapter, z);
            }
            if (this.f11911i0 == null) {
                this.f11911i0 = new C4738b();
            }
            this.f11911i0.m26534b(z);
            viewPager.addOnAdapterChangeListener(this.f11911i0);
            m26568I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f11906e0 = null;
            m26569H(null, false);
        }
        this.f11912j0 = z2;
    }

    /* renamed from: M */
    private void m26564M() {
        int size = this.f11901c.size();
        for (int i = 0; i < size; i++) {
            this.f11901c.get(i).m26504v();
        }
    }

    /* renamed from: N */
    private void m26563N(LinearLayout.LayoutParams layoutParams) {
        if (this.f11893R == 1 && this.f11890O == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.f11901c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C4745g c4745g = this.f11901c.get(i);
                if (c4745g != null && c4745g.m26520f() != null && !TextUtils.isEmpty(c4745g.m26515k())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f11894S) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f11886K;
        if (i != -1) {
            return i;
        }
        int i2 = this.f11893R;
        if (i2 == 0 || i2 == 2) {
            return this.f11888M;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f11905e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m26554h(TabItem tabItem) {
        C4745g m26536z = m26536z();
        CharSequence charSequence = tabItem.f11871c;
        if (charSequence != null) {
            m26536z.m26505u(charSequence);
        }
        Drawable drawable = tabItem.f11872d;
        if (drawable != null) {
            m26536z.m26508r(drawable);
        }
        int i = tabItem.f11873e;
        if (i != 0) {
            m26536z.m26510p(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            m26536z.m26511o(tabItem.getContentDescription());
        }
        m26557e(m26536z);
    }

    /* renamed from: i */
    private void m26553i(C4745g c4745g) {
        C4747i c4747i = c4745g.f11940i;
        c4747i.setSelected(false);
        c4747i.setActivated(false);
        this.f11905e.addView(c4747i, c4745g.m26518h(), m26545q());
    }

    /* renamed from: j */
    private void m26552j(View view) {
        if (view instanceof TabItem) {
            m26554h((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: k */
    private void m26551k(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C7759x.m17535U(this) && !this.f11905e.m26531c()) {
            int scrollX = getScrollX();
            int m26548n = m26548n(i, 0.0f);
            if (scrollX != m26548n) {
                m26539w();
                this.f11904d0.setIntValues(scrollX, m26548n);
                this.f11904d0.start();
            }
            this.f11905e.m26532b(i, this.f11891P);
            return;
        }
        m26568I(i, 0.0f, true);
    }

    /* renamed from: l */
    private void m26550l(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f11905e.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f11905e.setGravity(8388611);
    }

    /* renamed from: m */
    private void m26549m() {
        int i = this.f11893R;
        C7759x.m17560D0(this.f11905e, (i == 0 || i == 2) ? Math.max(0, this.f11889N - this.f11907f) : 0, 0, 0, 0);
        int i2 = this.f11893R;
        if (i2 == 0) {
            m26550l(this.f11890O);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f11890O == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f11905e.setGravity(1);
        }
        m26562O(true);
    }

    /* renamed from: n */
    private int m26548n(int i, float f) {
        int i2 = this.f11893R;
        if (i2 == 0 || i2 == 2) {
            View childAt = this.f11905e.getChildAt(i);
            int i3 = i + 1;
            View childAt2 = i3 < this.f11905e.getChildCount() ? this.f11905e.getChildAt(i3) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i4 = (int) ((width + width2) * 0.5f * f);
            return C7759x.m17563C(this) == 0 ? left + i4 : left - i4;
        }
        return 0;
    }

    /* renamed from: o */
    private void m26547o(C4745g c4745g, int i) {
        c4745g.m26506t(i);
        this.f11901c.add(i, c4745g);
        int size = this.f11901c.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            }
            this.f11901c.get(i).m26506t(i);
        }
    }

    /* renamed from: p */
    private static ColorStateList m26546p(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: q */
    private LinearLayout.LayoutParams m26545q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m26563N(layoutParams);
        return layoutParams;
    }

    /* renamed from: s */
    private C4747i m26543s(C4745g c4745g) {
        InterfaceC7672e<C4747i> interfaceC7672e = this.f11913k0;
        C4747i mo11982b = interfaceC7672e != null ? interfaceC7672e.mo11982b() : null;
        if (mo11982b == null) {
            mo11982b = new C4747i(getContext());
        }
        mo11982b.setTab(c4745g);
        mo11982b.setFocusable(true);
        mo11982b.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c4745g.f11935d)) {
            mo11982b.setContentDescription(c4745g.f11934c);
        } else {
            mo11982b.setContentDescription(c4745g.f11935d);
        }
        return mo11982b;
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f11905e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f11905e.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: t */
    private void m26542t(C4745g c4745g) {
        for (int size = this.f11900b0.size() - 1; size >= 0; size--) {
            this.f11900b0.get(size).onTabReselected(c4745g);
        }
    }

    /* renamed from: u */
    private void m26541u(C4745g c4745g) {
        for (int size = this.f11900b0.size() - 1; size >= 0; size--) {
            this.f11900b0.get(size).onTabSelected(c4745g);
        }
    }

    /* renamed from: v */
    private void m26540v(C4745g c4745g) {
        for (int size = this.f11900b0.size() - 1; size >= 0; size--) {
            this.f11900b0.get(size).onTabUnselected(c4745g);
        }
    }

    /* renamed from: w */
    private void m26539w() {
        if (this.f11904d0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11904d0 = valueAnimator;
            valueAnimator.setInterpolator(C9278a.f21807b);
            this.f11904d0.setDuration(this.f11891P);
            this.f11904d0.addUpdateListener(new C4737a());
        }
    }

    /* renamed from: A */
    void m26576A() {
        int currentItem;
        m26574C();
        AbstractC1904a abstractC1904a = this.f11908f0;
        if (abstractC1904a != null) {
            int count = abstractC1904a.getCount();
            for (int i = 0; i < count; i++) {
                C4745g m26536z = m26536z();
                m26536z.m26505u(this.f11908f0.getPageTitle(i));
                m26555g(m26536z, false);
            }
            ViewPager viewPager = this.f11906e0;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m26571F(m26538x(currentItem));
        }
    }

    /* renamed from: B */
    protected boolean m26575B(C4745g c4745g) {
        return f11875m0.mo11983a(c4745g);
    }

    /* renamed from: C */
    public void m26574C() {
        for (int childCount = this.f11905e.getChildCount() - 1; childCount >= 0; childCount--) {
            m26572E(childCount);
        }
        Iterator<C4745g> it = this.f11901c.iterator();
        while (it.hasNext()) {
            C4745g next = it.next();
            it.remove();
            next.m26513m();
            m26575B(next);
        }
        this.f11903d = null;
    }

    @Deprecated
    /* renamed from: D */
    public void m26573D(InterfaceC4739c interfaceC4739c) {
        this.f11900b0.remove(interfaceC4739c);
    }

    /* renamed from: F */
    public void m26571F(C4745g c4745g) {
        m26570G(c4745g, true);
    }

    /* renamed from: G */
    public void m26570G(C4745g c4745g, boolean z) {
        C4745g c4745g2 = this.f11903d;
        if (c4745g2 == c4745g) {
            if (c4745g2 != null) {
                m26542t(c4745g);
                m26551k(c4745g.m26518h());
                return;
            }
            return;
        }
        int m26518h = c4745g != null ? c4745g.m26518h() : -1;
        if (z) {
            if ((c4745g2 == null || c4745g2.m26518h() == -1) && m26518h != -1) {
                m26568I(m26518h, 0.0f, true);
            } else {
                m26551k(m26518h);
            }
            if (m26518h != -1) {
                setSelectedTabView(m26518h);
            }
        }
        this.f11903d = c4745g;
        if (c4745g2 != null) {
            m26540v(c4745g2);
        }
        if (c4745g != null) {
            m26541u(c4745g);
        }
    }

    /* renamed from: H */
    void m26569H(AbstractC1904a abstractC1904a, boolean z) {
        DataSetObserver dataSetObserver;
        AbstractC1904a abstractC1904a2 = this.f11908f0;
        if (abstractC1904a2 != null && (dataSetObserver = this.f11909g0) != null) {
            abstractC1904a2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f11908f0 = abstractC1904a;
        if (z && abstractC1904a != null) {
            if (this.f11909g0 == null) {
                this.f11909g0 = new C4741e();
            }
            abstractC1904a.registerDataSetObserver(this.f11909g0);
        }
        m26576A();
    }

    /* renamed from: I */
    public void m26568I(int i, float f, boolean z) {
        m26567J(i, f, z, true);
    }

    /* renamed from: J */
    public void m26567J(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f11905e.getChildCount()) {
            return;
        }
        if (z2) {
            this.f11905e.m26529e(i, f);
        }
        ValueAnimator valueAnimator = this.f11904d0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f11904d0.cancel();
        }
        scrollTo(m26548n(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    /* renamed from: K */
    public void m26566K(ViewPager viewPager, boolean z) {
        m26565L(viewPager, z, false);
    }

    /* renamed from: O */
    void m26562O(boolean z) {
        for (int i = 0; i < this.f11905e.getChildCount(); i++) {
            View childAt = this.f11905e.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m26563N((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m26552j(view);
    }

    @Deprecated
    /* renamed from: c */
    public void m26559c(InterfaceC4739c interfaceC4739c) {
        if (this.f11900b0.contains(interfaceC4739c)) {
            return;
        }
        this.f11900b0.add(interfaceC4739c);
    }

    /* renamed from: d */
    public void m26558d(InterfaceC4740d interfaceC4740d) {
        m26559c(interfaceC4740d);
    }

    /* renamed from: e */
    public void m26557e(C4745g c4745g) {
        m26555g(c4745g, this.f11901c.isEmpty());
    }

    /* renamed from: f */
    public void m26556f(C4745g c4745g, int i, boolean z) {
        if (c4745g.f11939h == this) {
            m26547o(c4745g, i);
            m26553i(c4745g);
            if (z) {
                c4745g.m26512n();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: g */
    public void m26555g(C4745g c4745g, boolean z) {
        m26556f(c4745g, this.f11901c.size(), z);
    }

    public int getSelectedTabPosition() {
        C4745g c4745g = this.f11903d;
        if (c4745g != null) {
            return c4745g.m26518h();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f11901c.size();
    }

    public int getTabGravity() {
        return this.f11890O;
    }

    public ColorStateList getTabIconTint() {
        return this.f11877B;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f11896U;
    }

    public int getTabIndicatorGravity() {
        return this.f11892Q;
    }

    int getTabMaxWidth() {
        return this.f11885J;
    }

    public int getTabMode() {
        return this.f11893R;
    }

    public ColorStateList getTabRippleColor() {
        return this.f11878C;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f11879D;
    }

    public ColorStateList getTabTextColors() {
        return this.f11876A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9247h.m15367e(this);
        if (this.f11906e0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m26565L((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f11912j0) {
            setupWithViewPager(null);
            this.f11912j0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f11905e.getChildCount(); i++) {
            View childAt = this.f11905e.getChildAt(i);
            if (childAt instanceof C4747i) {
                ((C4747i) childAt).m26493j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C7716c.m17716E0(accessibilityNodeInfo).m17689c0(C7716c.C7718b.m17637b(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C4696r.m26687b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f11887L
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C4696r.m26687b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f11885J = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f11893R
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: r */
    protected C4745g m26544r() {
        C4745g mo11982b = f11875m0.mo11982b();
        return mo11982b == null ? new C4745g() : mo11982b;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C9247h.m15368d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f11894S != z) {
            this.f11894S = z;
            for (int i = 0; i < this.f11905e.getChildCount(); i++) {
                View childAt = this.f11905e.getChildAt(i);
                if (childAt instanceof C4747i) {
                    ((C4747i) childAt).m26481v();
                }
            }
            m26549m();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC4740d interfaceC4740d) {
        setOnTabSelectedListener((InterfaceC4739c) interfaceC4740d);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m26539w();
        this.f11904d0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f11879D != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f11879D = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f11880E = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f11892Q != i) {
            this.f11892Q = i;
            C7759x.m17516g0(this.f11905e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f11905e.m26528f(i);
    }

    public void setTabGravity(int i) {
        if (this.f11890O != i) {
            this.f11890O = i;
            m26549m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f11877B != colorStateList) {
            this.f11877B = colorStateList;
            m26564M();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C7462a.m18691c(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f11896U = i;
        if (i == 0) {
            this.f11898W = new C4751b();
        } else if (i == 1) {
            this.f11898W = new C4750a();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f11895T = z;
        C7759x.m17516g0(this.f11905e);
    }

    public void setTabMode(int i) {
        if (i != this.f11893R) {
            this.f11893R = i;
            m26549m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f11878C != colorStateList) {
            this.f11878C = colorStateList;
            for (int i = 0; i < this.f11905e.getChildCount(); i++) {
                View childAt = this.f11905e.getChildAt(i);
                if (childAt instanceof C4747i) {
                    ((C4747i) childAt).m26482u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C7462a.m18691c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f11876A != colorStateList) {
            this.f11876A = colorStateList;
            m26564M();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1904a abstractC1904a) {
        m26569H(abstractC1904a, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f11897V != z) {
            this.f11897V = z;
            for (int i = 0; i < this.f11905e.getChildCount(); i++) {
                View childAt = this.f11905e.getChildAt(i);
                if (childAt instanceof C4747i) {
                    ((C4747i) childAt).m26482u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m26566K(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: x */
    public C4745g m26538x(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f11901c.get(i);
    }

    /* renamed from: y */
    public boolean m26537y() {
        return this.f11895T;
    }

    /* renamed from: z */
    public C4745g m26536z() {
        C4745g m26544r = m26544r();
        m26544r.f11939h = this;
        m26544r.f11940i = m26543s(m26544r);
        if (m26544r.f11941j != -1) {
            m26544r.f11940i.setId(m26544r.f11941j);
        }
        return m26544r;
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11874l0), attributeSet, i);
        this.f11901c = new ArrayList<>();
        this.f11879D = new GradientDrawable();
        this.f11880E = 0;
        this.f11885J = Integer.MAX_VALUE;
        this.f11900b0 = new ArrayList<>();
        this.f11913k0 = new C7673f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C4742f c4742f = new C4742f(context2);
        this.f11905e = c4742f;
        super.addView(c4742f, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.TabLayout, i, f11874l0, C9277l.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            C9243g c9243g = new C9243g();
            c9243g.m15409X(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            c9243g.m15420M(context2);
            c9243g.m15410W(C7759x.m17485w(this));
            C7759x.m17492s0(this, c9243g);
        }
        setSelectedTabIndicator(C9321c.m15050d(context2, m26690h, C9277l.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(m26690h.getColor(C9277l.TabLayout_tabIndicatorColor, 0));
        this.f11905e.m26528f(m26690h.getDimensionPixelSize(C9277l.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(m26690h.getInt(C9277l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(m26690h.getBoolean(C9277l.TabLayout_tabIndicatorFullWidth, true));
        setTabIndicatorAnimationMode(m26690h.getInt(C9277l.TabLayout_tabIndicatorAnimationMode, 0));
        int dimensionPixelSize = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabPadding, 0);
        this.f11916y = dimensionPixelSize;
        this.f11915x = dimensionPixelSize;
        this.f11914w = dimensionPixelSize;
        this.f11907f = dimensionPixelSize;
        this.f11907f = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f11914w = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabPaddingTop, this.f11914w);
        this.f11915x = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabPaddingEnd, this.f11915x);
        this.f11916y = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabPaddingBottom, this.f11916y);
        int resourceId = m26690h.getResourceId(C9277l.TabLayout_tabTextAppearance, C9276k.TextAppearance_Design_Tab);
        this.f11917z = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C7461j.TextAppearance);
        try {
            this.f11882G = obtainStyledAttributes.getDimensionPixelSize(C7461j.TextAppearance_android_textSize, 0);
            this.f11876A = C9321c.m15053a(context2, obtainStyledAttributes, C7461j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (m26690h.hasValue(C9277l.TabLayout_tabTextColor)) {
                this.f11876A = C9321c.m15053a(context2, m26690h, C9277l.TabLayout_tabTextColor);
            }
            if (m26690h.hasValue(C9277l.TabLayout_tabSelectedTextColor)) {
                this.f11876A = m26546p(this.f11876A.getDefaultColor(), m26690h.getColor(C9277l.TabLayout_tabSelectedTextColor, 0));
            }
            this.f11877B = C9321c.m15053a(context2, m26690h, C9277l.TabLayout_tabIconTint);
            this.f11881F = C4696r.m26684e(m26690h.getInt(C9277l.TabLayout_tabIconTintMode, -1), null);
            this.f11878C = C9321c.m15053a(context2, m26690h, C9277l.TabLayout_tabRippleColor);
            this.f11891P = m26690h.getInt(C9277l.TabLayout_tabIndicatorAnimationDuration, IjkMediaCodecInfo.RANK_SECURE);
            this.f11886K = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabMinWidth, -1);
            this.f11887L = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabMaxWidth, -1);
            this.f11884I = m26690h.getResourceId(C9277l.TabLayout_tabBackground, 0);
            this.f11889N = m26690h.getDimensionPixelSize(C9277l.TabLayout_tabContentStart, 0);
            this.f11893R = m26690h.getInt(C9277l.TabLayout_tabMode, 1);
            this.f11890O = m26690h.getInt(C9277l.TabLayout_tabGravity, 0);
            this.f11894S = m26690h.getBoolean(C9277l.TabLayout_tabInlineLabel, false);
            this.f11897V = m26690h.getBoolean(C9277l.TabLayout_tabUnboundedRipple, false);
            m26690h.recycle();
            Resources resources = getResources();
            this.f11883H = resources.getDimensionPixelSize(C9267d.design_tab_text_size_2line);
            this.f11888M = resources.getDimensionPixelSize(C9267d.design_tab_scrollable_min_width);
            m26549m();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m26552j(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC4739c interfaceC4739c) {
        InterfaceC4739c interfaceC4739c2 = this.f11899a0;
        if (interfaceC4739c2 != null) {
            m26573D(interfaceC4739c2);
        }
        this.f11899a0 = interfaceC4739c;
        if (interfaceC4739c != null) {
            m26559c(interfaceC4739c);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m26552j(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C7462a.m18690d(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m26552j(view);
    }
}
