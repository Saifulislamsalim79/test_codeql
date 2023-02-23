package ai.kudi.agent.merchantProduct.forms;

import ai.kudi.agent.collections.R$string;
import ai.kudi.dip.library.edittext.AbstractC0790c;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* compiled from: FormInputFieldView.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0006\u0010\u001a\u001a\u00020\u0011R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/FormInputFieldView;", "Lai/kudi/dip/library/edittext/BaseKudiInputField;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "inputHint", "getInputHint", "()Ljava/lang/String;", "setInputHint", "(Ljava/lang/String;)V", "isRequired", "", "()Z", "setRequired", "(Z)V", "label", "getLabel", "setLabel", "handleTextChanges", "", "validate", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class FormInputFieldView extends AbstractC0790c {
    private boolean isRequired;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormInputFieldView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormInputFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FormInputFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log_OC.getArray(context, "context");
        EditText $r1 = getInputEditText();
        $r1.removeTextChangedListener(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FormInputFieldView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.merchantProduct.forms.FormInputFieldView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getInputHint() {
        EditText $r1 = getInputEditText();
        CharSequence $r2 = $r1.getHint();
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLabel() {
        TextView $r1 = getHintField();
        CharSequence $r2 = $r1.getText();
        String $r3 = $r2.toString();
        return $r3;
    }

    @Override // ai.kudi.dip.library.edittext.AbstractC0790c
    protected void handleTextChanges() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isRequired() {
        boolean z0 = this.isRequired;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setInputHint(String str) {
        Log_OC.getArray(str, "value");
        EditText $r2 = getInputEditText();
        $r2.setHint(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setLabel(String str) {
        Log_OC.getArray(str, "value");
        TextView $r2 = getHintField();
        $r2.setText(str);
    }

    public final void setRequired(boolean z) {
        this.isRequired = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean validate() {
        boolean $z0;
        boolean $z02 = this.isRequired;
        if ($z02) {
            EditText $r1 = getInputEditText();
            Editable $r2 = $r1.getText();
            Log_OC.loadImage($r2, "inputEditText.text");
            $z0 = C13276s.m5440u($r2);
            if ($z0) {
                FormInputFieldView r5 = this;
                Resources $r3 = r5.getResources();
                int $i0 = R$string.field_is_required;
                String $r4 = $r3.getString($i0);
                setError($r4);
                return true;
            }
        }
        setError(null);
        return false;
    }
}
