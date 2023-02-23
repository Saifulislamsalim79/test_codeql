package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.widget.LinearLayoutCompat;
import p201g.p202a.C7452a;
import p201g.p202a.p209o.C7484a;
/* compiled from: ScrollingTabContainerView.java */
/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: classes2.dex */
public class C1117k0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: A */
    private int f3391A;

    /* renamed from: c */
    Runnable f3392c;

    /* renamed from: d */
    private View$OnClickListenerC1120c f3393d;

    /* renamed from: e */
    LinearLayoutCompat f3394e;

    /* renamed from: f */
    private Spinner f3395f;

    /* renamed from: w */
    private boolean f3396w;

    /* renamed from: x */
    int f3397x;

    /* renamed from: y */
    int f3398y;

    /* renamed from: z */
    private int f3399z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.k0$a */
    /* loaded from: classes2.dex */
    public class RunnableC1118a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f3400c;

        RunnableC1118a(View view) {
            this.f3400c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1117k0.this.smoothScrollTo(this.f3400c.getLeft() - ((C1117k0.this.getWidth() - this.f3400c.getWidth()) / 2), 0);
            C1117k0.this.f3392c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.k0$b */
    /* loaded from: classes2.dex */
    public class C1119b extends BaseAdapter {
        C1119b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C1117k0.this.f3394e.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C1121d) C1117k0.this.f3394e.getChildAt(i)).m37088b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C1117k0.this.m37093c((AbstractC0925a.AbstractC0928c) getItem(i), true);
            }
            ((C1121d) view).m37089a((AbstractC0925a.AbstractC0928c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.k0$c */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC1120c implements View.OnClickListener {
        View$OnClickListenerC1120c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C1121d) view).m37088b().m37796e();
            int childCount = C1117k0.this.f3394e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C1117k0.this.f3394e.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.k0$d */
    /* loaded from: classes2.dex */
    public class C1121d extends LinearLayout {

        /* renamed from: c */
        private final int[] f3404c;

        /* renamed from: d */
        private AbstractC0925a.AbstractC0928c f3405d;

        /* renamed from: e */
        private TextView f3406e;

        /* renamed from: f */
        private ImageView f3407f;

        /* renamed from: w */
        private View f3408w;

        public C1121d(Context context, AbstractC0925a.AbstractC0928c abstractC0928c, boolean z) {
            super(context, null, C7452a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f3404c = iArr;
            this.f3405d = abstractC0928c;
            C1138r0 m37026v = C1138r0.m37026v(context, null, iArr, C7452a.actionBarTabStyle, 0);
            if (m37026v.m37029s(0)) {
                setBackgroundDrawable(m37026v.m37041g(0));
            }
            m37026v.m37025w();
            if (z) {
                setGravity(8388627);
            }
            m37087c();
        }

        /* renamed from: a */
        public void m37089a(AbstractC0925a.AbstractC0928c abstractC0928c) {
            this.f3405d = abstractC0928c;
            m37087c();
        }

        /* renamed from: b */
        public AbstractC0925a.AbstractC0928c m37088b() {
            return this.f3405d;
        }

        /* renamed from: c */
        public void m37087c() {
            AbstractC0925a.AbstractC0928c abstractC0928c = this.f3405d;
            View m37799b = abstractC0928c.m37799b();
            if (m37799b != null) {
                ViewParent parent = m37799b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m37799b);
                    }
                    addView(m37799b);
                }
                this.f3408w = m37799b;
                TextView textView = this.f3406e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f3407f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f3407f.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f3408w;
            if (view != null) {
                removeView(view);
                this.f3408w = null;
            }
            Drawable m37798c = abstractC0928c.m37798c();
            CharSequence m37797d = abstractC0928c.m37797d();
            if (m37798c != null) {
                if (this.f3407f == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f3407f = appCompatImageView;
                }
                this.f3407f.setImageDrawable(m37798c);
                this.f3407f.setVisibility(0);
            } else {
                ImageView imageView2 = this.f3407f;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f3407f.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m37797d);
            if (z) {
                if (this.f3406e == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C7452a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f3406e = appCompatTextView;
                }
                this.f3406e.setText(m37797d);
                this.f3406e.setVisibility(0);
            } else {
                TextView textView2 = this.f3406e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f3406e.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f3407f;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC0928c.m37800a());
            }
            C1155t0.m36986a(this, z ? null : abstractC0928c.m37800a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C1117k0.this.f3397x > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C1117k0.this.f3397x;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: b */
    private Spinner m37094b() {
        C1143t c1143t = new C1143t(getContext(), null, C7452a.actionDropDownStyle);
        c1143t.setLayoutParams(new LinearLayoutCompat.C1037a(-2, -1));
        c1143t.setOnItemSelectedListener(this);
        return c1143t;
    }

    /* renamed from: d */
    private boolean m37092d() {
        Spinner spinner = this.f3395f;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m37091e() {
        if (m37092d()) {
            return;
        }
        if (this.f3395f == null) {
            this.f3395f = m37094b();
        }
        removeView(this.f3394e);
        addView(this.f3395f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f3395f.getAdapter() == null) {
            this.f3395f.setAdapter((SpinnerAdapter) new C1119b());
        }
        Runnable runnable = this.f3392c;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f3392c = null;
        }
        this.f3395f.setSelection(this.f3391A);
    }

    /* renamed from: f */
    private boolean m37090f() {
        if (m37092d()) {
            removeView(this.f3395f);
            addView(this.f3394e, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f3395f.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m37095a(int i) {
        View childAt = this.f3394e.getChildAt(i);
        Runnable runnable = this.f3392c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC1118a runnableC1118a = new RunnableC1118a(childAt);
        this.f3392c = runnableC1118a;
        post(runnableC1118a);
    }

    /* renamed from: c */
    C1121d m37093c(AbstractC0925a.AbstractC0928c abstractC0928c, boolean z) {
        C1121d c1121d = new C1121d(getContext(), abstractC0928c, z);
        if (z) {
            c1121d.setBackgroundDrawable(null);
            c1121d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f3399z));
        } else {
            c1121d.setFocusable(true);
            if (this.f3393d == null) {
                this.f3393d = new View$OnClickListenerC1120c();
            }
            c1121d.setOnClickListener(this.f3393d);
        }
        return c1121d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f3392c;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C7484a m18609b = C7484a.m18609b(getContext());
        setContentHeight(m18609b.m18605f());
        this.f3398y = m18609b.m18606e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f3392c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C1121d) view).m37088b().m37796e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f3394e.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f3397x = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f3397x = View.MeasureSpec.getSize(i) / 2;
            }
            this.f3397x = Math.min(this.f3397x, this.f3398y);
        } else {
            this.f3397x = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3399z, 1073741824);
        if ((z2 || !this.f3396w) ? false : false) {
            this.f3394e.measure(0, makeMeasureSpec);
            if (this.f3394e.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m37091e();
            } else {
                m37090f();
            }
        } else {
            m37090f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f3391A);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f3396w = z;
    }

    public void setContentHeight(int i) {
        this.f3399z = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f3391A = i;
        int childCount = this.f3394e.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f3394e.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m37095a(i);
            }
            i2++;
        }
        Spinner spinner = this.f3395f;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
