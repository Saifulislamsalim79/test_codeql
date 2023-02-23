package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p201g.p202a.C7461j;
/* loaded from: classes2.dex */
public final class ViewStubCompat extends View {

    /* renamed from: c */
    private int f3216c;

    /* renamed from: d */
    private int f3217d;

    /* renamed from: e */
    private WeakReference<View> f3218e;

    /* renamed from: f */
    private LayoutInflater f3219f;

    /* renamed from: w */
    private InterfaceC1065a f3220w;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1065a {
        /* renamed from: a */
        void m37293a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m37294a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f3216c != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f3219f;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f3216c, viewGroup, false);
                int i = this.f3217d;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f3218e = new WeakReference<>(inflate);
                InterfaceC1065a interfaceC1065a = this.f3220w;
                if (interfaceC1065a != null) {
                    interfaceC1065a.m37293a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3217d;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3219f;
    }

    public int getLayoutResource() {
        return this.f3216c;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f3217d = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3219f = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f3216c = i;
    }

    public void setOnInflateListener(InterfaceC1065a interfaceC1065a) {
        this.f3220w = interfaceC1065a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f3218e;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m37294a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3216c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.ViewStubCompat, i, 0);
        this.f3217d = obtainStyledAttributes.getResourceId(C7461j.ViewStubCompat_android_inflatedId, -1);
        this.f3216c = obtainStyledAttributes.getResourceId(C7461j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C7461j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
