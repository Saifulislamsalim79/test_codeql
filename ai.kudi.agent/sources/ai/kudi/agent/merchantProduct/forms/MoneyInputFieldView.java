package ai.kudi.agent.merchantProduct.forms;

import ai.kudi.agent.collections.R$font;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.p049m.C0842b;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.p057e.C1355f;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
/* compiled from: MoneyInputFieldView.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/MoneyInputFieldView;", "Lai/kudi/agent/merchantProduct/forms/FormInputFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "errorStateBackground", "Landroid/graphics/drawable/Drawable;", "getErrorStateBackground", "()Landroid/graphics/drawable/Drawable;", "errorStateBackground$delegate", "Lkotlin/Lazy;", "normalStateBackground", "getNormalStateBackground", "normalStateBackground$delegate", "applyAttributes", "", "formatPriceWithDecimal", "", "priceText", "layoutResource", "parseAmount", "", "price", "setError", AttributeType.TEXT, "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MoneyInputFieldView extends FormInputFieldView {
    private final InterfaceC11824h errorStateBackground$delegate;
    private final InterfaceC11824h normalStateBackground$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoneyInputFieldView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoneyInputFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MoneyInputFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC11824h $r4;
        InterfaceC11824h $r42;
        Log_OC.getArray(context, "context");
        MoneyInputFieldView$normalStateBackground$2 $r3 = new MoneyInputFieldView$normalStateBackground$2(context);
        $r4 = C13218k.m5625b($r3);
        this.normalStateBackground$delegate = $r4;
        MoneyInputFieldView$errorStateBackground$2 $r5 = new MoneyInputFieldView$errorStateBackground$2(context);
        $r42 = C13218k.m5625b($r5);
        this.errorStateBackground$delegate = $r42;
        EditText $r6 = getEditText();
        $r6.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.merchantProduct.forms.MoneyInputFieldView.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                MoneyInputFieldView $r2 = MoneyInputFieldView.this;
                EditText $r32 = $r2.getEditText();
                $r32.removeTextChangedListener(this);
                MoneyInputFieldView $r22 = MoneyInputFieldView.this;
                String $r43 = $r22.formatPriceWithDecimal(String.valueOf(editable));
                MoneyInputFieldView $r23 = MoneyInputFieldView.this;
                EditText $r33 = $r23.getEditText();
                $r33.setText($r43);
                MoneyInputFieldView $r24 = MoneyInputFieldView.this;
                EditText $r34 = $r24.getEditText();
                $r34.addTextChangedListener(this);
                MoneyInputFieldView $r25 = MoneyInputFieldView.this;
                EditText $r35 = $r25.getEditText();
                int $i0 = $r43.length();
                $r35.setSelection($i0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MoneyInputFieldView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.merchantProduct.forms.MoneyInputFieldView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Drawable getErrorStateBackground() {
        InterfaceC11824h $r2 = this.errorStateBackground$delegate;
        Object $r1 = $r2.getValue();
        Drawable $r3 = (Drawable) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Drawable getNormalStateBackground() {
        InterfaceC11824h $r2 = this.normalStateBackground$delegate;
        Object $r1 = $r2.getValue();
        Drawable $r3 = (Drawable) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final double parseAmount(String str) {
        try {
            C13262h $r1 = new C13262h("[^\\d.]");
            String $r3 = $r1.m5521f(str, "");
            double $d0 = Double.parseDouble($r3);
            return $d0;
        } catch (Exception e) {
            return 0.0d;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.dip.library.edittext.AbstractC0790c
    public void applyAttributes() {
        EditText $r1 = getInputEditText();
        $r1.setTextSize(2, 14.0f);
        TextView $r2 = getHintField();
        $r2.setTextSize(2, 13.0f);
        TextView $r22 = getHintField();
        C0842b.m37884a($r22, 8, 8, 0, 16);
        EditText $r12 = getInputEditText();
        MoneyInputFieldView r5 = this;
        Context $r3 = r5.getContext();
        int $i0 = R$font.sofia_pro_regular;
        Typeface $r4 = C1355f.m36245e($r3, $i0);
        $r12.setTypeface($r4);
        TextView $r23 = getHintField();
        MoneyInputFieldView r52 = this;
        Context $r32 = r52.getContext();
        int $i02 = R$font.sofia_pro_regular;
        Typeface $r42 = C1355f.m36245e($r32, $i02);
        $r23.setTypeface($r42);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String formatPriceWithDecimal(String str) {
        List $r6;
        Log_OC.getArray(str, "priceText");
        double $d0 = parseAmount(str);
        boolean $z0 = $d0 == 0.0d;
        if ($z0) {
            return "";
        }
        DecimalFormat $r2 = new DecimalFormat("###,###,##0");
        int $i1 = (int) $d0;
        Integer $r3 = Integer.valueOf($i1);
        String $r4 = $r2.format($r3);
        char[] $r5 = {'.'};
        $r6 = C13277t.m5384q0(str, $r5, false, 0, 6, null);
        Object $r7 = C13722p.m3951U($r6, 1);
        String $r1 = (String) $r7;
        if ($r1 == null) {
            Log_OC.loadImage($r4, "{\n            formatted\n        }");
            return $r4;
        }
        int $i12 = $r1.length();
        if ($i12 > 2) {
            String $r8 = $r1.substring(0, 2);
            $r1 = $r8;
            Log_OC.loadImage($r8, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        StringBuilder $r9 = new StringBuilder();
        $r9.append((Object) $r4);
        $r9.append('.');
        $r9.append((Object) $r1);
        return $r9.toString();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.dip.library.edittext.AbstractC0790c
    public int layoutResource() {
        int i0 = R$layout.view_money_input_field;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    @Override // ai.kudi.dip.library.edittext.AbstractC0790c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setError(java.lang.String r7) {
        /*
            r6 = this;
            android.widget.TextView r0 = r6.getErrorTextView()
            r1 = 1
            if (r7 == 0) goto L10
            boolean r2 = kotlin.p549l0.C13265j.m5470u(r7)
            if (r2 == 0) goto Le
            goto L10
        Le:
            r2 = 0
            goto L11
        L10:
            r2 = 1
        L11:
            if (r2 != 0) goto L15
            r3 = 0
            goto L17
        L15:
            r3 = 8
        L17:
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.getErrorTextView()
            r0.setText(r7)
            android.view.ViewGroup r4 = r6.getInputLayout()
            if (r7 == 0) goto L2f
            boolean r2 = kotlin.p549l0.C13265j.m5470u(r7)
            if (r2 == 0) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L36
            android.graphics.drawable.Drawable r5 = r6.getNormalStateBackground()
            goto L3a
        L36:
            android.graphics.drawable.Drawable r5 = r6.getErrorStateBackground()
        L3a:
            r4.setBackground(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.merchantProduct.forms.MoneyInputFieldView.setError(java.lang.String):void");
    }
}
