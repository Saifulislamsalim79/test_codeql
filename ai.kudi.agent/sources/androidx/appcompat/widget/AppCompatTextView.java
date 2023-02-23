package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C1398i;
import androidx.core.widget.InterfaceC1391b;
import androidx.core.widget.InterfaceC1404l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p228e.C7608d;
import p201g.p227h.p235j.C7655c;
import p201g.p227h.p238l.InterfaceC7758w;
/* loaded from: classes2.dex */
public class AppCompatTextView extends TextView implements InterfaceC7758w, InterfaceC1404l, InterfaceC1391b {
    private final C1089e mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<C7655c> mPrecomputedTextFuture;
    private final C1156u mTextClassifierHelper;
    private final C1160v mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<C7655c> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C1398i.m36090p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37223b();
        }
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36971b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1391b.f4284g) {
            return super.getAutoSizeMaxTextSize();
        }
        C1160v c1160v = this.mTextHelper;
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
        C1160v c1160v = this.mTextHelper;
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
        C1160v c1160v = this.mTextHelper;
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
        C1160v c1160v = this.mTextHelper;
        return c1160v != null ? c1160v.m36965h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC1391b.f4284g) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            return c1160v.m36964i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C1398i.m36104b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C1398i.m36103c(this);
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m36963j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m36962k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1156u c1156u;
        if (Build.VERSION.SDK_INT < 28 && (c1156u = this.mTextClassifierHelper) != null) {
            return c1156u.m36985a();
        }
        return super.getTextClassifier();
    }

    public C7655c.C7656a getTextMetricsParamsCompat() {
        return C1398i.m36099g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m36955r(this, onCreateInputConnection, editorInfo);
        C1114j.m37113a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36958o(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1160v c1160v = this.mTextHelper;
        if (c1160v == null || InterfaceC1391b.f4284g || !c1160v.m36961l()) {
            return;
        }
        this.mTextHelper.m36970c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (InterfaceC1391b.f4284g) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1160v c1160v = this.mTextHelper;
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
        C1160v c1160v = this.mTextHelper;
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
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36951v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36957p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36957p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36957p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36957p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1398i.m36087s(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1398i.m36093m(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1398i.m36092n(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C1398i.m36091o(this, i);
    }

    public void setPrecomputedText(C7655c c7655c) {
        C1398i.m36090p(this, c7655c);
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1404l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m36950w(colorStateList);
        this.mTextHelper.m36971b();
    }

    @Override // androidx.core.widget.InterfaceC1404l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m36949x(mode);
        this.mTextHelper.m36971b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36956q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1156u c1156u;
        if (Build.VERSION.SDK_INT < 28 && (c1156u = this.mTextClassifierHelper) != null) {
            c1156u.m36984b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<C7655c> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C7655c.C7656a c7656a) {
        C1398i.m36088r(this, c7656a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC1391b.f4284g) {
            super.setTextSize(i, f);
            return;
        }
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36975A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = C7608d.m18045a(getContext(), typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1130o0.m37055b(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        C1126m0.m37066a(this, getContext());
        C1089e c1089e = new C1089e(this);
        this.mBackgroundTintHelper = c1089e;
        c1089e.m37220e(attributeSet, i);
        C1160v c1160v = new C1160v(this);
        this.mTextHelper = c1160v;
        c1160v.m36960m(attributeSet, i);
        this.mTextHelper.m36971b();
        this.mTextClassifierHelper = new C1156u(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C7462a.m18690d(context, i) : null, i2 != 0 ? C7462a.m18690d(context, i2) : null, i3 != 0 ? C7462a.m18690d(context, i3) : null, i4 != 0 ? C7462a.m18690d(context, i4) : null);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36957p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C7462a.m18690d(context, i) : null, i2 != 0 ? C7462a.m18690d(context, i2) : null, i3 != 0 ? C7462a.m18690d(context, i3) : null, i4 != 0 ? C7462a.m18690d(context, i4) : null);
        C1160v c1160v = this.mTextHelper;
        if (c1160v != null) {
            c1160v.m36957p();
        }
    }
}
