package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C1398i;
import androidx.core.widget.InterfaceC1391b;
import androidx.core.widget.InterfaceC1404l;
import p201g.p202a.C7452a;
import p201g.p227h.p238l.InterfaceC7758w;
/* loaded from: classes2.dex */
public class AppCompatButton extends Button implements InterfaceC7758w, InterfaceC1391b, InterfaceC1404l {

    /* renamed from: c */
    private final C1089e f3054c;

    /* renamed from: d */
    private final C1160v f3055d;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.buttonStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.f3054c;
        if (c1089e != null) {
            c1089e.m37223b();
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36971b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1391b.f4284g) {
            return super.getAutoSizeMaxTextSize();
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            return c1160v.m36968e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC1391b.f4284g) {
            return super.getAutoSizeMinTextSize();
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            return c1160v.m36967f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC1391b.f4284g) {
            return super.getAutoSizeStepGranularity();
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            return c1160v.m36966g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC1391b.f4284g) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1160v c1160v = this.f3055d;
        return c1160v != null ? c1160v.m36965h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC1391b.f4284g) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            return c1160v.m36964i();
        }
        return 0;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.f3054c;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.f3054c;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3055d.m36963j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3055d.m36962k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36958o(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1160v c1160v = this.f3055d;
        if (c1160v == null || InterfaceC1391b.f4284g || !c1160v.m36961l()) {
            return;
        }
        this.f3055d.m36970c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (InterfaceC1391b.f4284g) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36953t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (InterfaceC1391b.f4284g) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36952u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC1391b.f4284g) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36951v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.f3054c;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.f3054c;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1398i.m36087s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36954s(z);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.f3054c;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.f3054c;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1404l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3055d.m36950w(colorStateList);
        this.f3055d.m36971b();
    }

    @Override // androidx.core.widget.InterfaceC1404l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3055d.m36949x(mode);
        this.f3055d.m36971b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36956q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC1391b.f4284g) {
            super.setTextSize(i, f);
            return;
        }
        C1160v c1160v = this.f3055d;
        if (c1160v != null) {
            c1160v.m36975A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C1130o0.m37055b(context), attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1089e c1089e = new C1089e(this);
        this.f3054c = c1089e;
        c1089e.m37220e(attributeSet, i);
        C1160v c1160v = new C1160v(this);
        this.f3055d = c1160v;
        c1160v.m36960m(attributeSet, i);
        this.f3055d.m36971b();
    }
}
