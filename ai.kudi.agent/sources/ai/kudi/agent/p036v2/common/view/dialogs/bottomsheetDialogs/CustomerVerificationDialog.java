package ai.kudi.agent.p036v2.common.view.dialogs.bottomsheetDialogs;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.agent.collections.R$style;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.p036v2.common.utils.ViewUtils_extKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0964i;
import androidx.fragment.app.Chapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4552b;
import com.google.android.material.bottomsheet.DialogC4547a;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p272h.p286c.p287a.p323c.C9271f;
/* compiled from: CustomerVerificationDialog.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0002-.B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0002J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\u0005H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/dialogs/bottomsheetDialogs/CustomerVerificationDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "onVerifyOtp", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "etOtp", "Landroid/widget/EditText;", "onCloseDialogListener", "Lkotlin/Function0;", "getOnCloseDialogListener", "()Lkotlin/jvm/functions/Function0;", "setOnCloseDialogListener", "(Lkotlin/jvm/functions/Function0;)V", "getOnVerifyOtp", "()Lkotlin/jvm/functions/Function1;", "setOnVerifyOtp", "otpCode", "getOtpCode", "()Ljava/lang/String;", "setOtpCode", "(Ljava/lang/String;)V", "rlVerifyBtn", "Lai/kudi/dip/library/button/KudiButton;", "tvErrorMessage", "Landroid/widget/TextView;", "bind", "view", "Landroid/view/View;", "maskOTPInput", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setErrorMessage", MetricTracker.Object.MESSAGE, "showLoading", "show", "", "verifyOtp", "Companion", "OTPTransformationMethod", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog */
/* loaded from: classes.dex */
public final class CustomerVerificationDialog extends C4552b {
    public static final Companion Companion;
    public static final String PAGE_KEY = "CUSTOMER_OTP_VERIFICATION";
    private EditText etOtp;
    private InterfaceC11756a<C13666w> onCloseDialogListener;
    private InterfaceC11767l<? super String, C13666w> onVerifyOtp;
    private String otpCode;
    private KudiButton rlVerifyBtn;
    private TextView tvErrorMessage;

    /* compiled from: CustomerVerificationDialog.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/dialogs/bottomsheetDialogs/CustomerVerificationDialog$Companion;", "", "()V", "TAG", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: CustomerVerificationDialog.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/dialogs/bottomsheetDialogs/CustomerVerificationDialog$OTPTransformationMethod;", "Landroid/text/method/PasswordTransformationMethod;", "()V", "getTransformation", "", TransactionField.TRANSACTION_CHANNEL, "view", "Landroid/view/View;", "OTPCharSequence", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog$OTPTransformationMethod */
    /* loaded from: classes.dex */
    public static final class OTPTransformationMethod extends PasswordTransformationMethod {

        /* compiled from: CustomerVerificationDialog.kt */
        @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002J\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/dialogs/bottomsheetDialogs/CustomerVerificationDialog$OTPTransformationMethod$OTPCharSequence;", "", TransactionField.TRANSACTION_CHANNEL, "(Lai/kudi/agent/v2/common/view/dialogs/bottomsheetDialogs/CustomerVerificationDialog$OTPTransformationMethod;Ljava/lang/CharSequence;)V", "length", "", "getLength", "()I", "get", "", "index", "subSequence", "startIndex", "endIndex", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* renamed from: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog$OTPTransformationMethod$OTPCharSequence */
        /* loaded from: classes.dex */
        public final class OTPCharSequence implements CharSequence {
            private final CharSequence source;
            final /* synthetic */ OTPTransformationMethod this$0;

            public OTPCharSequence(OTPTransformationMethod oTPTransformationMethod, CharSequence charSequence) {
                Log_OC.getArray(oTPTransformationMethod, "this$0");
                Log_OC.getArray(charSequence, TransactionField.TRANSACTION_CHANNEL);
                this.this$0 = oTPTransformationMethod;
                this.source = charSequence;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.CharSequence
            public final /* bridge */ char charAt(int i) {
                char $c0 = getKeyCode(i);
                return $c0;
            }

            public char getKeyCode(int i) {
                return '*';
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public int getLength() {
                CharSequence $r1 = this.source;
                int $i0 = $r1.length();
                return $i0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.CharSequence
            public final /* bridge */ int length() {
                int $i0 = getLength();
                return $i0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                CharSequence $r1 = this.source;
                return $r1.subSequence(i, i2);
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            Log_OC.append(charSequence);
            OTPCharSequence $r3 = new OTPCharSequence(this, charSequence);
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public CustomerVerificationDialog() {
        this(null, 1, null);
    }

    public CustomerVerificationDialog(InterfaceC11767l interfaceC11767l) {
        this.onVerifyOtp = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CustomerVerificationDialog(kotlin.p483e0.p484c.InterfaceC11767l r1, int r2, kotlin.p483e0.p485d.DBUtils$1 r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog.<init>(kotlin.e0.c.l, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void bind(View view) {
        int $i0 = R$id.et_otp_input;
        View $r2 = view.findViewById($i0);
        EditText $r3 = (EditText) $r2;
        this.etOtp = $r3;
        int $i02 = R$id.rl_verify_otp_btn;
        View $r22 = view.findViewById($i02);
        this.rlVerifyBtn = (KudiButton) $r22;
        int $i03 = R$id.tv_error_message;
        View $r1 = view.findViewById($i03);
        TextView $r5 = (TextView) $r1;
        this.tvErrorMessage = $r5;
        maskOTPInput();
        ViewGroup $r4 = this.rlVerifyBtn;
        if ($r4 == null) {
            return;
        }
        ViewGroup r8 = $r4;
        r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.ActivityMain$18
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomerVerificationDialog $r23 = CustomerVerificationDialog.this;
                CustomerVerificationDialog.m41545bind$lambda1($r23, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bind$lambda-1  reason: not valid java name */
    public static final void m41545bind$lambda1(CustomerVerificationDialog customerVerificationDialog, View view) {
        Log_OC.getArray(customerVerificationDialog, "this$0");
        customerVerificationDialog.verifyOtp();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void maskOTPInput() {
        EditText $r1 = this.etOtp;
        if ($r1 != null) {
            OTPTransformationMethod $r2 = new OTPTransformationMethod();
            $r1.setTransformationMethod($r2);
        }
        EditText $r12 = this.etOtp;
        if ($r12 == null) {
            return;
        }
        CustomerVerificationDialog$maskOTPInput$1 $r3 = new CustomerVerificationDialog$maskOTPInput$1(this);
        ViewUtils_extKt.textChanges$default($r12, null, $r3, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreateView$lambda-0  reason: not valid java name */
    public static final void m41546onCreateView$lambda0(final CustomerVerificationDialog customerVerificationDialog, final View view) {
        Log_OC.getArray(customerVerificationDialog, "this$0");
        new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog$onCreateView$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                CustomerVerificationDialog $r1 = CustomerVerificationDialog.this;
                Chapter r9 = (Chapter) $r1;
                Dialog $r2 = r9.getDialog();
                if ($r2 == null) {
                    NullPointerException r8 = new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                    throw r8;
                }
                DialogC0964i $r3 = (DialogC4547a) $r2;
                int $i0 = C9271f.design_bottom_sheet;
                DialogC0964i r10 = $r3;
                View $r4 = r10.findViewById($i0);
                if ($r4 == null) {
                    return;
                }
                BottomSheetBehavior $r5 = BottomSheetBehavior.m27460W($r4);
                $r5.m27437q0(3);
                $r5.m27443m0(0);
                ViewTreeObserver $r6 = view.getViewTreeObserver();
                $r6.removeOnGlobalLayoutListener(this);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void verifyOtp() {
        CharSequence $r5;
        TextView $r1 = this.tvErrorMessage;
        if ($r1 != null) {
            ViewExtKt.toggleVisibility($r1, false);
        }
        showLoading(true);
        EditText $r2 = this.etOtp;
        Editable $r3 = $r2 == null ? null : $r2.getText();
        String $r4 = String.valueOf($r3);
        if ($r4 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r7;
        }
        $r5 = C13277t.m5414M0($r4);
        String $r42 = $r5.toString();
        this.otpCode = $r42;
        InterfaceC11767l $r6 = this.onVerifyOtp;
        if ($r6 == null) {
            return;
        }
        Log_OC.append($r42);
        $r6.invoke($r42);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11756a getOnCloseDialogListener() {
        InterfaceC11756a r1 = this.onCloseDialogListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnVerifyOtp() {
        InterfaceC11767l r1 = this.onVerifyOtp;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getOtpCode() {
        String r1 = this.otpCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        Chapter r2 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        int $i0 = R$style.CustomBottomSheetDialogTheme;
        Chapter r22 = (Chapter) this;
        r22.setStyle(0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        int $i0 = R$layout.layout_customer_authentication;
        final View $r4 = layoutInflater.inflate($i0, viewGroup, false);
        Log_OC.loadImage($r4, "root");
        bind($r4);
        ViewTreeObserver $r5 = $r4.getViewTreeObserver();
        $r5.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.SearchFragment$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomerVerificationDialog $r1 = CustomerVerificationDialog.this;
                View $r2 = $r4;
                CustomerVerificationDialog.m41546onCreateView$lambda0($r1, $r2);
            }
        });
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setErrorMessage(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        TextView $r2 = this.tvErrorMessage;
        if ($r2 != null) {
            ViewExtKt.toggleVisibility($r2, true);
        }
        TextView $r22 = this.tvErrorMessage;
        if ($r22 != null) {
            $r22.setText(str);
        }
        showLoading(false);
    }

    public final void setOnCloseDialogListener(InterfaceC11756a interfaceC11756a) {
        this.onCloseDialogListener = interfaceC11756a;
    }

    public final void setOnVerifyOtp(InterfaceC11767l interfaceC11767l) {
        this.onVerifyOtp = interfaceC11767l;
    }

    public final void setOtpCode(String str) {
        this.otpCode = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading(boolean z) {
        if (z) {
            KudiButton $r1 = this.rlVerifyBtn;
            if ($r1 == null) {
                return;
            }
            $r1.m38032f();
            return;
        }
        KudiButton $r12 = this.rlVerifyBtn;
        if ($r12 == null) {
            return;
        }
        $r12.m38033e();
    }
}
