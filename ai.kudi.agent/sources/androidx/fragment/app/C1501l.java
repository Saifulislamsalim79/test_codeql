package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p248l.C7803c;
/* compiled from: FragmentContainerView.kt */
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes2.dex */
public final class C1501l extends FrameLayout {

    /* renamed from: c */
    private final List<View> f4615c;

    /* renamed from: d */
    private final List<View> f4616d;

    /* renamed from: e */
    private View.OnApplyWindowInsetsListener f4617e;

    /* renamed from: f */
    private boolean f4618f;

    /* compiled from: FragmentContainerView.kt */
    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: classes2.dex */
    public static final class C1502a {

        /* renamed from: a */
        public static final C1502a f4619a = new C1502a();

        private C1502a() {
        }

        /* renamed from: a */
        public final WindowInsets m35707a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            kotlin.e0.d.l.f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.e0.d.l.f(view, "v");
            kotlin.e0.d.l.f(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            kotlin.e0.d.l.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1501l(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        kotlin.e0.d.l.f(context, "context");
        kotlin.e0.d.l.f(attributeSet, "attrs");
        kotlin.e0.d.l.f(fragmentManager, "fm");
        this.f4615c = new ArrayList();
        this.f4616d = new ArrayList();
        this.f4618f = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C7803c.FragmentContainerView;
        kotlin.e0.d.l.e(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C7803c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(C7803c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment m35941f0 = fragmentManager.m35941f0(id);
        if (classAttribute != null && m35941f0 == null) {
            if (id == -1) {
                String m = string != null ? kotlin.e0.d.l.m(" with tag ", string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + m);
            }
            Fragment mo35684a = fragmentManager.m35905r0().mo35684a(context.getClassLoader(), classAttribute);
            kotlin.e0.d.l.e(mo35684a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            mo35684a.onInflate(context, attributeSet, (Bundle) null);
            AbstractC1449b0 m35924l = fragmentManager.m35924l();
            m35924l.m35818v(true);
            m35924l.m35827d(this, mo35684a, string);
            m35924l.mo35802l();
        }
        fragmentManager.m35970T0(this);
    }

    /* renamed from: a */
    private final void m35708a(View view) {
        if (this.f4616d.contains(view)) {
            this.f4615c.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        kotlin.e0.d.l.f(view, "child");
        if (FragmentManager.m36008A0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C7698g0 m17526b0;
        kotlin.e0.d.l.f(windowInsets, "insets");
        C7698g0 m17771w = C7698g0.m17771w(windowInsets);
        kotlin.e0.d.l.e(m17771w, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4617e;
        if (onApplyWindowInsetsListener != null) {
            C1502a c1502a = C1502a.f4619a;
            kotlin.e0.d.l.d(onApplyWindowInsetsListener);
            m17526b0 = C7698g0.m17771w(c1502a.m35707a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            m17526b0 = C7759x.m17526b0(this, m17771w);
        }
        if (!m17526b0.m17778p()) {
            int i = 0;
            int childCount = getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i2 = i + 1;
                    C7759x.m17515h(getChildAt(i), m17526b0);
                    if (i2 >= childCount) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.e0.d.l.f(canvas, "canvas");
        if (this.f4618f) {
            for (View view : this.f4615c) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        kotlin.e0.d.l.f(canvas, "canvas");
        kotlin.e0.d.l.f(view, "child");
        if (this.f4618f && (!this.f4615c.isEmpty()) && this.f4615c.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        kotlin.e0.d.l.f(view, "view");
        this.f4616d.remove(view);
        if (this.f4615c.remove(view)) {
            this.f4618f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.m35932i0(this).m35941f0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        kotlin.e0.d.l.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i = childCount - 1;
                View childAt = getChildAt(childCount);
                kotlin.e0.d.l.e(childAt, "view");
                m35708a(childAt);
                if (i < 0) {
                    break;
                }
                childCount = i;
            }
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kotlin.e0.d.l.f(view, "view");
        m35708a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        kotlin.e0.d.l.e(childAt, "view");
        m35708a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        kotlin.e0.d.l.f(view, "view");
        m35708a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                kotlin.e0.d.l.e(childAt, "view");
                m35708a(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                kotlin.e0.d.l.e(childAt, "view");
                m35708a(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f4618f = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        kotlin.e0.d.l.f(onApplyWindowInsetsListener, "listener");
        this.f4617e = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        kotlin.e0.d.l.f(view, "view");
        if (view.getParent() == this) {
            this.f4616d.add(view);
        }
        super.startViewTransition(view);
    }
}
