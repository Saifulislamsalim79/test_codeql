package ai.kudi.agent.settings.insurance.p026ui.widget;

import ai.kudi.agent.C0001R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: NameValuePairView.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\n \u000b*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R#\u0010%\u001a\n \u000b*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b&\u0010\u001a¨\u0006("}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/widget/NameValuePairView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "divider", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getDivider", "()Landroid/view/View;", "divider$delegate", "Lkotlin/Lazy;", "value", "", "nameText", "getNameText", "()Ljava/lang/String;", "setNameText", "(Ljava/lang/String;)V", "nameTextView", "Landroid/widget/TextView;", "getNameTextView", "()Landroid/widget/TextView;", "nameTextView$delegate", "", "shouldShowDivider", "getShouldShowDivider", "()Z", "setShouldShowDivider", "(Z)V", "valueText", "getValueText", "setValueText", "valueTextView", "getValueTextView", "valueTextView$delegate", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.widget.NameValuePairView */
/* loaded from: classes.dex */
public final class NameValuePairView extends ConstraintLayout {
    private final InterfaceC11824h divider$delegate;
    private final InterfaceC11824h nameTextView$delegate;
    private final InterfaceC11824h valueTextView$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NameValuePairView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NameValuePairView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NameValuePairView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC11824h $r4;
        InterfaceC11824h $r42;
        InterfaceC11824h $r43;
        Log_OC.getArray(context, "context");
        NameValuePairView$nameTextView$2 r11 = new NameValuePairView$nameTextView$2(this);
        $r4 = C13218k.m5625b(r11);
        this.nameTextView$delegate = $r4;
        NameValuePairView$valueTextView$2 r12 = new NameValuePairView$valueTextView$2(this);
        $r42 = C13218k.m5625b(r12);
        this.valueTextView$delegate = $r42;
        NameValuePairView$divider$2 r13 = new NameValuePairView$divider$2(this);
        $r43 = C13218k.m5625b(r13);
        this.divider$delegate = $r43;
        NameValuePairView r14 = this;
        View.inflate(context, C0001R.C0004layout.view_name_value_pair, r14);
        NameValuePairView r142 = this;
        Context $r1 = r142.getContext();
        int[] $r7 = C0001R.styleable.NameValuePairView;
        TypedArray $r8 = $r1.obtainStyledAttributes(attributeSet, $r7);
        Log_OC.loadImage($r8, "getContext().obtainStyledAttributes(attrs, R.styleable.NameValuePairView)");
        String $r9 = $r8.getString(0);
        String $r10 = $r9;
        setNameText($r9 == null ? "" : $r10);
        boolean $z0 = $r8.getBoolean(1, true);
        setShouldShowDivider($z0);
        $r8.recycle();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NameValuePairView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r4 = 0
        La:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.insurance.p026ui.widget.NameValuePairView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getDivider() {
        InterfaceC11824h $r2 = this.divider$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getNameTextView() {
        InterfaceC11824h $r2 = this.nameTextView$delegate;
        Object $r1 = $r2.getValue();
        TextView $r3 = (TextView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getValueTextView() {
        InterfaceC11824h $r2 = this.valueTextView$delegate;
        Object $r1 = $r2.getValue();
        TextView $r3 = (TextView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getNameText() {
        TextView $r1 = getNameTextView();
        CharSequence $r2 = $r1.getText();
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShouldShowDivider() {
        View $r1 = getDivider();
        int $i0 = $r1.getVisibility();
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getValueText() {
        TextView $r1 = getValueTextView();
        CharSequence $r2 = $r1.getText();
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setNameText(String str) {
        Log_OC.getArray(str, "value");
        TextView $r2 = getNameTextView();
        $r2.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setShouldShowDivider(boolean z) {
        if (z) {
            View $r1 = getDivider();
            $r1.setVisibility(0);
            return;
        }
        View $r12 = getDivider();
        $r12.setVisibility(4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setValueText(String str) {
        Log_OC.getArray(str, "value");
        TextView $r2 = getValueTextView();
        $r2.setText(str);
    }
}
