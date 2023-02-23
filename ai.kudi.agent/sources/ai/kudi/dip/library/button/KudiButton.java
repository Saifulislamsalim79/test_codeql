package ai.kudi.dip.library.button;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.dip.library.C0755a;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0799g;
import ai.kudi.dip.library.p045i.C0824c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1335a;
import kotlin.Metadata;
import kotlin.e0.d.l;
/* compiled from: KudiButton.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u001dJ\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\n\u0010&\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010'\u001a\u00020\u001d2\b\b\u0001\u0010(\u001a\u00020\nJ\u0010\u0010)\u001a\u00020\u001d2\b\b\u0001\u0010\u001b\u001a\u00020\nJ\u0010\u0010*\u001a\u00020\u001d2\b\b\u0001\u0010+\u001a\u00020\nJ\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020\u001dR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m10421d2 = {"Lai/kudi/dip/library/button/KudiButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundEnabled", "Landroid/graphics/drawable/Drawable;", "binding", "Lai/kudi/dip/library/databinding/KudiCustomButtonBinding;", "buttonDrawable", "buttonText", "", "drawableTint", "kudiButtonDrawable", "kudiButtonTextView", "Landroid/widget/TextView;", "getKudiButtonTextView", "()Landroid/widget/TextView;", "loaderColor", "Ljava/lang/Integer;", "textColor", "applyAttributes", "", "disable", "enable", "getText", "getTextView", "hideLoader", "onRestoreInstanceState", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Landroid/os/Parcelable;", "onSaveInstanceState", "setButtonDrawableTint", "colorRes", "setButtonTextColor", "setDrawableRight", "drawableRes", "setText", "string", "showLoader", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiButton extends ConstraintLayout {

    /* renamed from: c */
    private final int f2146c;

    /* renamed from: d */
    private final int f2147d;

    /* renamed from: e */
    private String f2148e;

    /* renamed from: f */
    private final TextView f2149f;

    /* renamed from: w */
    private Drawable f2150w;

    /* renamed from: x */
    private Integer f2151x;

    /* renamed from: y */
    private C0824c f2152y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        C0824c m37928c = C0824c.m37928c(LayoutInflater.from(context), this, true);
        l.e(m37928c, "inflate(LayoutInflater.from(context), this, true)");
        this.f2152y = m37928c;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0799g.KudiButton);
        try {
            this.f2146c = obtainStyledAttributes.getResourceId(C0799g.KudiButton_buttonDrawable, C0756b.arrow);
            obtainStyledAttributes.getColor(C0799g.KudiButton_drawableTintColor, C1335a.m36324d(context, C0755a.colorPrimary));
            this.f2147d = obtainStyledAttributes.getColor(C0799g.KudiButton_buttonTextColor, C1335a.m36324d(context, C0755a.colorPrimary));
            this.f2148e = obtainStyledAttributes.getString(C0799g.KudiButton_buttonText);
            this.f2151x = Integer.valueOf(obtainStyledAttributes.getResourceId(C0799g.KudiButton_loaderColor, C0755a.colorAccent));
            this.f2150w = getBackground().mutate();
            obtainStyledAttributes.recycle();
            View findViewWithTag = findViewWithTag("kudiButtonTextView");
            l.e(findViewWithTag, "findViewWithTag(\"kudiButtonTextView\")");
            TextView textView = (TextView) findViewWithTag;
            this.f2149f = textView;
            textView.setText(this.f2148e);
            m38036b(context);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    private final void m38036b(Context context) {
        this.f2149f.setTextColor(this.f2147d);
        C1335a.m36322f(context, this.f2146c);
    }

    /* renamed from: c */
    public final void m38035c() {
        setEnabled(false);
        setBackground(C1335a.m36322f(getContext(), C0756b.button_fill_disabled));
        this.f2149f.setTextColor(C1335a.m36324d(getContext(), C0755a.colorPrimary));
        this.f2149f.setAlpha(0.45f);
        setButtonDrawableTint(C0755a.kudiDisableDrawableColor);
    }

    /* renamed from: d */
    public final void m38034d() {
        setEnabled(true);
        Context context = getContext();
        l.e(context, "context");
        m38036b(context);
        this.f2149f.setAlpha(1.0f);
        Drawable drawable = this.f2150w;
        if (drawable != null) {
            setBackground(drawable);
        }
    }

    /* renamed from: e */
    public final void m38033e() {
        setEnabled(true);
        this.f2152y.f2319b.m32587g();
        this.f2152y.f2319b.setVisibility(8);
        this.f2149f.setVisibility(0);
    }

    /* renamed from: f */
    public final void m38032f() {
        setEnabled(false);
        this.f2149f.setVisibility(8);
        this.f2152y.f2319b.setVisibility(0);
        this.f2152y.f2319b.m32588f();
        Integer num = this.f2151x;
        if (num == null) {
            return;
        }
        this.f2152y.f2319b.m32589e(getContext(), C1335a.m36324d(getContext(), num.intValue()), 30, true);
    }

    public final TextView getKudiButtonTextView() {
        return this.f2149f;
    }

    public final String getText() {
        return this.f2149f.getText().toString();
    }

    public final TextView getTextView() {
        return this.f2149f;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f2149f.setText(bundle.getString("currentText"));
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putString("currentText", this.f2149f.getText().toString());
        return bundle;
    }

    public final void setButtonDrawableTint(int i) {
    }

    public final void setButtonTextColor(int i) {
        this.f2149f.setTextColor(C1335a.m36324d(getContext(), i));
    }

    public final void setDrawableRight(int i) {
    }

    public final void setText(String str) {
        l.f(str, "string");
        this.f2149f.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KudiButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }
}
