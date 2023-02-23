package ai.kudi.agent.merchantProduct.forms;

import ai.kudi.agent.collections.R$layout;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.R$style;
import ai.kudi.agent.collections.R$styleable;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* compiled from: DateInputFieldView.kt */
@Metadata(m10422d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u00106\u001a\u0002072\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u00108\u001a\u0004\u0018\u000109H\u0002J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\u001dJ\b\u0010<\u001a\u000207H\u0014J\u0010\u0010=\u001a\u0002072\b\u0010>\u001a\u0004\u0018\u00010\u001dJ\b\u0010?\u001a\u000207H\u0002J\b\u0010@\u001a\u000207H\u0002J\u0006\u0010A\u001a\u00020'R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R#\u0010#\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b$\u0010\u0015R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R(\u0010+\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"R#\u0010.\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b/\u0010\u0015R\u001d\u00101\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b2\u0010\u000eR\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/DateInputFieldView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dateDialog", "Landroid/app/AlertDialog;", "errorStateBackground", "Landroid/graphics/drawable/Drawable;", "getErrorStateBackground", "()Landroid/graphics/drawable/Drawable;", "errorStateBackground$delegate", "Lkotlin/Lazy;", "errorView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getErrorView", "()Landroid/widget/TextView;", "errorView$delegate", "frameLayoutwrapper", "Landroid/widget/FrameLayout;", "getFrameLayoutwrapper", "()Landroid/widget/FrameLayout;", "frameLayoutwrapper$delegate", "value", "", "hint", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "inputTextView", "getInputTextView", "inputTextView$delegate", "isRequired", "", "()Z", "setRequired", "(Z)V", "label", "getLabel", "setLabel", "labelView", "getLabelView", "labelView$delegate", "normalStateBackground", "getNormalStateBackground", "normalStateBackground$delegate", "selectedDateCalender", "Ljava/util/Calendar;", "extractAttributes", "", "getActivityContext", "Landroid/app/Activity;", "getDateView", "getText", "onDetachedFromWindow", "setError", AttributeType.TEXT, "showPickerDialog", "updateDisplayedDate", "validate", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputFieldView extends LinearLayout {
    private AlertDialog dateDialog;
    private final InterfaceC11824h errorStateBackground$delegate;
    private final InterfaceC11824h errorView$delegate;
    private final InterfaceC11824h frameLayoutwrapper$delegate;
    private final InterfaceC11824h inputTextView$delegate;
    private boolean isRequired;
    private final InterfaceC11824h labelView$delegate;
    private final InterfaceC11824h normalStateBackground$delegate;
    private Calendar selectedDateCalender;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateInputFieldView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateInputFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DateInputFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC11824h $r4;
        InterfaceC11824h $r42;
        InterfaceC11824h $r43;
        InterfaceC11824h $r44;
        InterfaceC11824h $r45;
        InterfaceC11824h $r46;
        Log_OC.getArray(context, "context");
        DateInputFieldView$labelView$2 $r3 = new DateInputFieldView$labelView$2(this);
        $r4 = C13218k.m5625b($r3);
        this.labelView$delegate = $r4;
        DateInputFieldView$inputTextView$2 $r5 = new DateInputFieldView$inputTextView$2(this);
        $r42 = C13218k.m5625b($r5);
        this.inputTextView$delegate = $r42;
        DateInputFieldView$frameLayoutwrapper$2 $r6 = new DateInputFieldView$frameLayoutwrapper$2(this);
        $r43 = C13218k.m5625b($r6);
        this.frameLayoutwrapper$delegate = $r43;
        DateInputFieldView$errorView$2 $r7 = new DateInputFieldView$errorView$2(this);
        $r44 = C13218k.m5625b($r7);
        this.errorView$delegate = $r44;
        DateInputFieldView$normalStateBackground$2 $r8 = new DateInputFieldView$normalStateBackground$2(context);
        $r45 = C13218k.m5625b($r8);
        this.normalStateBackground$delegate = $r45;
        DateInputFieldView$errorStateBackground$2 $r9 = new DateInputFieldView$errorStateBackground$2(context);
        $r46 = C13218k.m5625b($r9);
        this.errorStateBackground$delegate = $r46;
        setOrientation(1);
        int $i0 = R$layout.view_date_input_field;
        View.inflate(context, $i0, this);
        extractAttributes(context, attributeSet);
        FrameLayout $r10 = getFrameLayoutwrapper();
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.merchantProduct.forms.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateInputFieldView $r2 = DateInputFieldView.this;
                DateInputFieldView.m39811_init_$lambda0($r2, view);
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
    public /* synthetic */ DateInputFieldView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.merchantProduct.forms.DateInputFieldView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m39811_init_$lambda0(DateInputFieldView dateInputFieldView, View view) {
        Log_OC.getArray(dateInputFieldView, "this$0");
        dateInputFieldView.showPickerDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void extractAttributes(Context context, AttributeSet attributeSet) {
        int[] $r1 = R$styleable.DateInputFieldView;
        TypedArray $r4 = context.obtainStyledAttributes(attributeSet, $r1);
        Log_OC.loadImage($r4, "context.obtainStyledAttributes(attrs, R.styleable.DateInputFieldView)");
        try {
            int $i0 = R$styleable.DateInputFieldView_inputLabel;
            String $r5 = $r4.getString($i0);
            setLabel($r5);
            int $i02 = R$styleable.DateInputFieldView_inputHint;
            String $r52 = $r4.getString($i02);
            setHint($r52);
        } finally {
            $r4.recycle();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.app.Activity getActivityContext() {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
        L4:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L11
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            r2 = r3
            return r2
        L11:
            r5 = r0
            android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
            r4 = r5
            android.content.Context r0 = r4.getBaseContext()
            goto L4
        L1a:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.merchantProduct.forms.DateInputFieldView.getActivityContext():android.app.Activity");
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
    private final TextView getErrorView() {
        InterfaceC11824h $r2 = this.errorView$delegate;
        Object $r1 = $r2.getValue();
        TextView $r3 = (TextView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final FrameLayout getFrameLayoutwrapper() {
        InterfaceC11824h $r2 = this.frameLayoutwrapper$delegate;
        Object $r1 = $r2.getValue();
        FrameLayout $r3 = (FrameLayout) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getInputTextView() {
        InterfaceC11824h $r2 = this.inputTextView$delegate;
        Object $r1 = $r2.getValue();
        TextView $r3 = (TextView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getLabelView() {
        InterfaceC11824h $r2 = this.labelView$delegate;
        Object $r1 = $r2.getValue();
        TextView $r3 = (TextView) $r1;
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
    private final void showPickerDialog() {
        Activity $r3 = getActivityContext();
        if ($r3 == null) {
            return;
        }
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: ai.kudi.agent.merchantProduct.forms.SearchActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                DateInputFieldView $r2 = DateInputFieldView.this;
                DateInputFieldView.m39812showPickerDialog$lambda1($r2, datePicker, i, i2, i3);
            }
        };
        Calendar $r4 = this.selectedDateCalender;
        if ($r4 == null) {
            $r4 = Calendar.getInstance();
        }
        int $i0 = R$style.DatePickerDialogTheme;
        int $i1 = $r4.get(1);
        int $i2 = $r4.get(2);
        int $i3 = $r4.get(5);
        DatePickerDialog $r2 = new DatePickerDialog($r3, $i0, onDateSetListener, $i1, $i2, $i3);
        $r2.show();
        C13666w c13666w = C13666w.f30112a;
        this.dateDialog = $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showPickerDialog$lambda-1  reason: not valid java name */
    public static final void m39812showPickerDialog$lambda1(DateInputFieldView dateInputFieldView, DatePicker datePicker, int i, int i2, int i3) {
        Log_OC.getArray(dateInputFieldView, "this$0");
        Calendar $r1 = dateInputFieldView.selectedDateCalender;
        if ($r1 == null) {
            $r1 = Calendar.getInstance();
        }
        $r1.set(1, i);
        $r1.set(2, i2);
        $r1.set(5, i3);
        dateInputFieldView.selectedDateCalender = $r1;
        dateInputFieldView.updateDisplayedDate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateDisplayedDate() {
        TextView $r2 = getInputTextView();
        C11780a0 c11780a0 = C11780a0.f26475a;
        Locale $r4 = Locale.getDefault();
        Calendar $r1 = this.selectedDateCalender;
        Object[] $r5 = {$r1};
        String $r6 = String.format($r4, "%1$tY-%1$tm-%1$td", Arrays.copyOf($r5, 1));
        Log_OC.loadImage($r6, "java.lang.String.format(locale, format, *args)");
        $r2.setText($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TextView getDateView() {
        TextView $r1 = getInputTextView();
        Log_OC.loadImage($r1, "inputTextView");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getHint() {
        TextView $r1 = getInputTextView();
        CharSequence $r2 = $r1.getHint();
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLabel() {
        TextView $r1 = getLabelView();
        CharSequence $r2 = $r1.getText();
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getText() {
        TextView $r1 = getInputTextView();
        CharSequence $r2 = $r1.getText();
        String $r3 = $r2.toString();
        return $r3;
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
    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AlertDialog $r1 = this.dateDialog;
        if ($r1 != null) {
            $r1.dismiss();
        }
        this.dateDialog = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setError(java.lang.String r7) {
        /*
            r6 = this;
            android.widget.TextView r0 = r6.getErrorView()
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
            android.widget.TextView r0 = r6.getErrorView()
            r0.setText(r7)
            android.widget.FrameLayout r4 = r6.getFrameLayoutwrapper()
            if (r7 == 0) goto L2f
            boolean r2 = kotlin.p549l0.C13265j.m5470u(r7)
            if (r2 == 0) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 != 0) goto L36
            android.graphics.drawable.Drawable r5 = r6.getErrorStateBackground()
            goto L3a
        L36:
            android.graphics.drawable.Drawable r5 = r6.getNormalStateBackground()
        L3a:
            r4.setBackground(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.merchantProduct.forms.DateInputFieldView.setError(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setHint(String str) {
        TextView $r2 = getInputTextView();
        $r2.setHint(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setLabel(String str) {
        TextView $r2 = getLabelView();
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
            TextView $r1 = getInputTextView();
            CharSequence $r2 = $r1.getText();
            Log_OC.loadImage($r2, "inputTextView.text");
            $z0 = C13276s.m5440u($r2);
            if ($z0) {
                Resources $r3 = getResources();
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
