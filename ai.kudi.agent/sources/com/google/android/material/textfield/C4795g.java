package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C1085d;
import androidx.appcompat.widget.C1090e0;
import com.google.android.material.internal.C4664f;
import com.google.android.material.internal.C4695q;
import com.google.android.material.theme.p106a.C4804a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
/* compiled from: MaterialAutoCompleteTextView.java */
/* renamed from: com.google.android.material.textfield.g */
/* loaded from: classes2.dex */
public class C4795g extends C1085d {

    /* renamed from: f */
    private final C1090e0 f12150f;

    /* renamed from: w */
    private final AccessibilityManager f12151w;

    /* renamed from: x */
    private final Rect f12152x;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* renamed from: com.google.android.material.textfield.g$a */
    /* loaded from: classes2.dex */
    class C4796a implements AdapterView.OnItemClickListener {
        C4796a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C4795g.this.m26278e(i < 0 ? C4795g.this.f12150f.m37183v() : C4795g.this.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = C4795g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C4795g.this.f12150f.m37180y();
                    i = C4795g.this.f12150f.m37181x();
                    j = C4795g.this.f12150f.m37182w();
                }
                onItemClickListener.onItemClick(C4795g.this.f12150f.mo37188p(), view, i, j);
            }
            C4795g.this.f12150f.dismiss();
        }
    }

    public C4795g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.autoCompleteTextViewStyle);
    }

    /* renamed from: c */
    private TextInputLayout m26280c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m26279d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m26280c = m26280c();
        int i = 0;
        if (adapter == null || m26280c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f12150f.m37181x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, m26280c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable m37191i = this.f12150f.m37191i();
        if (m37191i != null) {
            m37191i.getPadding(this.f12152x);
            Rect rect = this.f12152x;
            i2 += rect.left + rect.right;
        }
        return i2 + m26280c.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m26278e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m26280c = m26280c();
        if (m26280c != null && m26280c.m26441O()) {
            return m26280c.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m26280c = m26280c();
        if (m26280c != null && m26280c.m26441O() && super.getHint() == null && C4664f.m26779a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m26279d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f12150f.mo36987o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f12151w;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f12150f.mo37194c();
        } else {
            super.showDropDown();
        }
    }

    public C4795g(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, 0), attributeSet, i);
        this.f12152x = new Rect();
        Context context2 = getContext();
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.MaterialAutoCompleteTextView, i, C9276k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (m26690h.hasValue(C9277l.MaterialAutoCompleteTextView_android_inputType) && m26690h.getInt(C9277l.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f12151w = (AccessibilityManager) context2.getSystemService("accessibility");
        C1090e0 c1090e0 = new C1090e0(context2);
        this.f12150f = c1090e0;
        c1090e0.m37204J(true);
        this.f12150f.m37210D(this);
        this.f12150f.m37205I(2);
        this.f12150f.mo36987o(getAdapter());
        this.f12150f.m37202L(new C4796a());
        m26690h.recycle();
    }
}
