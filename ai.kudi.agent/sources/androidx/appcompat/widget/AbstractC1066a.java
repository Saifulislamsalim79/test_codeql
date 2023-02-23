package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p201g.p202a.C7452a;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7687c0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7692d0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsActionBarView.java */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1066a extends ViewGroup {

    /* renamed from: c */
    protected final C1067a f3221c;

    /* renamed from: d */
    protected final Context f3222d;

    /* renamed from: e */
    protected ActionMenuView f3223e;

    /* renamed from: f */
    protected C1073c f3224f;

    /* renamed from: w */
    protected int f3225w;

    /* renamed from: x */
    protected C7687c0 f3226x;

    /* renamed from: y */
    private boolean f3227y;

    /* renamed from: z */
    private boolean f3228z;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes2.dex */
    protected class C1067a implements InterfaceC7692d0 {

        /* renamed from: a */
        private boolean f3229a = false;

        /* renamed from: b */
        int f3230b;

        protected C1067a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: a */
        public void mo17804a(View view) {
            this.f3229a = true;
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: b */
        public void mo17807b(View view) {
            if (this.f3229a) {
                return;
            }
            AbstractC1066a abstractC1066a = AbstractC1066a.this;
            abstractC1066a.f3226x = null;
            AbstractC1066a.super.setVisibility(this.f3230b);
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: c */
        public void mo17803c(View view) {
            AbstractC1066a.super.setVisibility(0);
            this.f3229a = false;
        }

        /* renamed from: d */
        public C1067a m37286d(C7687c0 c7687c0, int i) {
            AbstractC1066a.this.f3226x = c7687c0;
            this.f3230b = i;
            return this;
        }
    }

    AbstractC1066a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m37289d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m37290c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m37288e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C7687c0 m37287f(int i, long j) {
        C7687c0 c7687c0 = this.f3226x;
        if (c7687c0 != null) {
            c7687c0.m17822b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C7687c0 m17523d = C7759x.m17523d(this);
            m17523d.m17823a(1.0f);
            m17523d.m17820d(j);
            C1067a c1067a = this.f3221c;
            c1067a.m37286d(m17523d, i);
            m17523d.m17818f(c1067a);
            return m17523d;
        }
        C7687c0 m17523d2 = C7759x.m17523d(this);
        m17523d2.m17823a(0.0f);
        m17523d2.m17820d(j);
        C1067a c1067a2 = this.f3221c;
        c1067a2.m37286d(m17523d2, i);
        m17523d2.m17818f(c1067a2);
        return m17523d2;
    }

    public int getAnimatedVisibility() {
        if (this.f3226x != null) {
            return this.f3221c.f3230b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3225w;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C7461j.ActionBar, C7452a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C7461j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C1073c c1073c = this.f3224f;
        if (c1073c != null) {
            c1073c.m37258I(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3228z = false;
        }
        if (!this.f3228z) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3228z = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3228z = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3227y = false;
        }
        if (!this.f3227y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3227y = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3227y = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C7687c0 c7687c0 = this.f3226x;
            if (c7687c0 != null) {
                c7687c0.m17822b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1066a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3221c = new C1067a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C7452a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f3222d = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f3222d = context;
        }
    }
}
