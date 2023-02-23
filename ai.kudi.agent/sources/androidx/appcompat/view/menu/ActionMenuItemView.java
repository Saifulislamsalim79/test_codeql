package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1155t0;
import p201g.p202a.C7461j;
/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC1016n.InterfaceC1017a, View.OnClickListener, ActionMenuView.InterfaceC1031a {

    /* renamed from: A */
    private int f2744A;

    /* renamed from: B */
    private int f2745B;

    /* renamed from: C */
    private int f2746C;

    /* renamed from: c */
    C1003i f2747c;

    /* renamed from: d */
    private CharSequence f2748d;

    /* renamed from: e */
    private Drawable f2749e;

    /* renamed from: f */
    C0999g.InterfaceC1001b f2750f;

    /* renamed from: w */
    private AbstractView$OnTouchListenerC1086d0 f2751w;

    /* renamed from: x */
    AbstractC0986b f2752x;

    /* renamed from: y */
    private boolean f2753y;

    /* renamed from: z */
    private boolean f2754z;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes2.dex */
    private class C0985a extends AbstractView$OnTouchListenerC1086d0 {
        public C0985a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0
        /* renamed from: b */
        public InterfaceC1019p mo37006b() {
            AbstractC0986b abstractC0986b = ActionMenuItemView.this.f2752x;
            if (abstractC0986b != null) {
                return abstractC0986b.mo37241a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0
        /* renamed from: c */
        protected boolean mo37005c() {
            InterfaceC1019p mo37006b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0999g.InterfaceC1001b interfaceC1001b = actionMenuItemView.f2750f;
            return interfaceC1001b != null && interfaceC1001b.mo37396a(actionMenuItemView.f2747c) && (mo37006b = mo37006b()) != null && mo37006b.mo37195b();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0986b {
        /* renamed from: a */
        public abstract InterfaceC1019p mo37241a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: f */
    private boolean m37594f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: g */
    private void m37593g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2748d);
        if (this.f2749e != null && (!this.f2747c.m37503B() || (!this.f2753y && !this.f2754z))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f2748d : null);
        CharSequence contentDescription = this.f2747c.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f2747c.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2747c.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C1155t0.m36986a(this, z3 ? null : this.f2747c.getTitle());
        } else {
            C1155t0.m36986a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1031a
    /* renamed from: a */
    public boolean mo37240a() {
        return m37595c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1031a
    /* renamed from: b */
    public boolean mo37239b() {
        return m37595c() && this.f2747c.getIcon() == null;
    }

    /* renamed from: c */
    public boolean m37595c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: d */
    public boolean mo26854d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: e */
    public void mo26853e(C1003i c1003i, int i) {
        this.f2747c = c1003i;
        setIcon(c1003i.getIcon());
        setTitle(c1003i.m37496i(this));
        setId(c1003i.getItemId());
        setVisibility(c1003i.isVisible() ? 0 : 8);
        setEnabled(c1003i.isEnabled());
        if (c1003i.hasSubMenu() && this.f2751w == null) {
            this.f2751w = new C0985a();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    public C1003i getItemData() {
        return this.f2747c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0999g.InterfaceC1001b interfaceC1001b = this.f2750f;
        if (interfaceC1001b != null) {
            interfaceC1001b.mo37396a(this.f2747c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2753y = m37594f();
        m37593g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean m37595c = m37595c();
        if (m37595c && (i4 = this.f2745B) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f2744A);
        } else {
            i3 = this.f2744A;
        }
        if (mode != 1073741824 && this.f2744A > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (m37595c || this.f2749e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2749e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC1086d0 abstractView$OnTouchListenerC1086d0;
        if (this.f2747c.hasSubMenu() && (abstractView$OnTouchListenerC1086d0 = this.f2751w) != null && abstractView$OnTouchListenerC1086d0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2754z != z) {
            this.f2754z = z;
            C1003i c1003i = this.f2747c;
            if (c1003i != null) {
                c1003i.m37502c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2749e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f2746C;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.f2746C;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m37593g();
    }

    public void setItemInvoker(C0999g.InterfaceC1001b interfaceC1001b) {
        this.f2750f = interfaceC1001b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2745B = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0986b abstractC0986b) {
        this.f2752x = abstractC0986b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2748d = charSequence;
        m37593g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2753y = m37594f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.ActionMenuItemView, i, 0);
        this.f2744A = obtainStyledAttributes.getDimensionPixelSize(C7461j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2746C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2745B = -1;
        setSaveEnabled(false);
    }
}
