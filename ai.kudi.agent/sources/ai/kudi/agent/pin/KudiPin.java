package ai.kudi.agent.pin;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.PinDialogBinding;
import ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.login.domain.model.AccountErrorType;
import ai.kudi.agent.pin.viewModel.KudiPinViewModel;
import ai.kudi.agent.pin.viewModel.data.KudiPinViewData;
import ai.kudi.dip.library.keypad.PinpadView;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0964i;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC4547a;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p286c.p287a.p323c.C9271f;
/* compiled from: KudiPin.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00019B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014J\u0006\u0010\u001b\u001a\u00020\u0015J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\u0012\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J$\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\t\u0010/\u001a\u00020\u0005H\u0096\u0001J\b\u00100\u001a\u00020\u0015H\u0002J\u000e\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u000bJ\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u000bH\u0002J\u000e\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u000bJ\u0010\u00106\u001a\u00020\u00152\b\b\u0002\u00107\u001a\u00020\u000bJ\u0006\u00108\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m10421d2 = {"Lai/kudi/agent/pin/KudiPin;", "Lai/kudi/agent/core/mvvm/BaseMvvmBottomSheetFragment;", "Lai/kudi/agent/pin/viewModel/KudiPinViewModel;", "Lai/kudi/agent/pin/viewModel/data/KudiPinViewData;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/core/databinding/PinDialogBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/core/databinding/PinDialogBinding;", KudiPin.KUDI_PIN_DESC, "", "kudiPinViewModel", "getKudiPinViewModel", "()Lai/kudi/agent/pin/viewModel/KudiPinViewModel;", "setKudiPinViewModel", "(Lai/kudi/agent/pin/viewModel/KudiPinViewModel;)V", "requiresSavingPin", "", KudiPin.KUDI_PIN_TITLE, "applyViewData", "", "viewData", "bindViews", "createViewModel", "getVMType", "Ljava/lang/Class;", "hideLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onAuthorizeClicked", "onCloseDialogClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "resetPin", "setDesc", AttributeType.TEXT, "setFragmentResult", "pin", "setTitle", "showErrorMessage", MetricTracker.Object.MESSAGE, "showLoading", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KudiPin extends BaseMvvmBottomSheetFragment<KudiPinViewModel, KudiPinViewData> implements BaseViewBinder<PinDialogBinding> {
    public static final String ACCOUNT_ERROR_CLASS_NAME = "ai.kudi.agent.login.ui.AccountErrorActivity";
    private static final String ACCOUNT_ERROR_TYPE_BLOCKED = "ai.kudi.agent.login.model.AccountErrorType.Blocked";
    private static final String BUNDLE_KEY_ACCOUNT_ERROR = "BUNDLE_KEY_ACCOUNT_ERROR";
    public static final String CLOSE_DIALOG_KEY = "Close dialog";
    public static final Companion Companion;
    public static final String ERROR_MESSAGE_KEY = "Error message";
    public static final String INNER_DIALOG_TAG = ".AuthDialog.Dialog";
    public static final String IS_AUTHORIZED_KEY = "IS AUTHORIZED";
    public static final String KUDI_PIN_AUTH_ERROR_KEY = "ERROR";
    public static final String KUDI_PIN_AUTH_SUCCESS_KEY = "Kudi pin auth key";
    public static final String KUDI_PIN_DESC = "desc";
    public static final String KUDI_PIN_TITLE = "title";
    public static final String PASSWORD_KEY = "password key";
    public static final String REQUIRE_SAVING_PIN_KEY = "saving_pin_key";
    private final /* synthetic */ BaseViewBinderImpl<PinDialogBinding> $$delegate_0;
    private String desc;
    public KudiPinViewModel kudiPinViewModel;
    private boolean requiresSavingPin;
    private String title;

    /* compiled from: KudiPin.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/pin/KudiPin$Companion;", "", "()V", "ACCOUNT_ERROR_CLASS_NAME", "", "ACCOUNT_ERROR_TYPE_BLOCKED", KudiPin.BUNDLE_KEY_ACCOUNT_ERROR, "CLOSE_DIALOG_KEY", "ERROR_MESSAGE_KEY", "INNER_DIALOG_TAG", "IS_AUTHORIZED_KEY", "KUDI_PIN_AUTH_ERROR_KEY", "KUDI_PIN_AUTH_SUCCESS_KEY", "KUDI_PIN_DESC", "KUDI_PIN_TITLE", "PASSWORD_KEY", "REQUIRE_SAVING_PIN_KEY", "getKudiPin", "Lai/kudi/agent/pin/KudiPin;", "fm", "Landroidx/fragment/app/FragmentManager;", "newInstance", KudiPin.KUDI_PIN_TITLE, "description", "requireSavingPin", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final KudiPin getKudiPin(FragmentManager fragmentManager) {
            Fragment $r1 = fragmentManager.m35938g0(".AuthDialog.Dialog");
            boolean $z0 = $r1 instanceof KudiPin;
            if ($z0) {
                KudiPin $r3 = (KudiPin) $r1;
                return $r3;
            }
            return null;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ KudiPin newInstance$default(Companion companion, String $r2, String $r3, boolean $z0, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = null;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r3 = null;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $z0 = false;
            }
            KudiPin $r0 = companion.newInstance($r2, $r3, $z0);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final KudiPin newInstance(String str, String str2, boolean z) {
            KudiPin r8 = new KudiPin();
            C13287o $r5 = C13664u.m4227a(KudiPin.KUDI_PIN_TITLE, str);
            C13287o $r52 = C13664u.m4227a(KudiPin.KUDI_PIN_DESC, str2);
            Boolean $r6 = Boolean.valueOf(z);
            C13287o $r53 = C13664u.m4227a(KudiPin.REQUIRE_SAVING_PIN_KEY, $r6);
            C13287o[] $r4 = {$r5, $r52, $r53};
            Bundle $r7 = C1372b.m36174a($r4);
            Fragment r9 = (Fragment) r8;
            r9.setArguments($r7);
            return r8;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KudiPin() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void bindViews() {
        PinDialogBinding $r1 = requireBinding();
        PinpadView $r2 = $r1.keypad;
        $r2.setKeyTextSize(33.0f);
        PinEntryView $r3 = $r1.inputForm;
        $r3.setEditable(false);
        PinpadView $r22 = $r1.keypad;
        PinEntryView $r32 = $r1.inputForm;
        $r22.setViewProvider($r32);
        onAuthorizeClicked();
        ImageView $r4 = $r1.close;
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pin.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KudiPin $r23 = KudiPin.this;
                KudiPin.m40023bindViews$lambda2$lambda1($r23, view);
            }
        });
        String $r6 = this.title;
        if ($r6 == null) {
            int $i0 = C0038R.string.enter_your_kudi_pin;
            Fragment r9 = (Fragment) this;
            String $r7 = r9.getString($i0);
            $r6 = $r7;
            Log_OC.loadImage($r7, "getString(R.string.enter_your_kudi_pin)");
        }
        setTitle($r6);
        String $r62 = this.desc;
        if ($r62 == null) {
            int $i02 = C0038R.string.enter_your_kudi_pin_desc;
            Fragment r92 = (Fragment) this;
            String $r72 = r92.getString($i02);
            $r62 = $r72;
            Log_OC.loadImage($r72, "getString(R.string.enter_your_kudi_pin_desc)");
        }
        setDesc($r62);
    }

    /* renamed from: bindViews$lambda-2$lambda-1 */
    public static final void m40023bindViews$lambda2$lambda1(KudiPin kudiPin, View view) {
        Log_OC.getArray(kudiPin, "this$0");
        kudiPin.onCloseDialogClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onAuthorizeClicked() {
        PinDialogBinding $r2 = requireBinding();
        PinEntryView $r3 = $r2.inputForm;
        $r3.setOnPinEnteredListener(new PinEntryView.OnPinEnteredListener() { // from class: ai.kudi.agent.pin.KudiPin$onAuthorizeClicked$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.custom.views.pinentryview.PinEntryView.OnPinEnteredListener
            public void onPinEntered(String str) {
                Log_OC.getArray(str, "pin");
                KudiPin $r22 = KudiPin.this;
                boolean $z0 = $r22.requiresSavingPin;
                if ($z0) {
                    KudiPin $r23 = KudiPin.this;
                    KudiPinViewModel $r32 = $r23.getKudiPinViewModel();
                    $r32.authorizeSavingPin(str);
                    return;
                }
                KudiPin $r24 = KudiPin.this;
                KudiPinViewModel $r33 = $r24.getKudiPinViewModel();
                $r33.authorize(str);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onCloseDialogClicked() {
        resetPin();
        Fragment r7 = (Fragment) this;
        FragmentManager $r1 = r7.getParentFragmentManager();
        KudiPinViewModel $r3 = getKudiPinViewModel();
        boolean $z0 = $r3.isAuthorized();
        Boolean $r4 = Boolean.valueOf($z0);
        C13287o $r5 = C13664u.m4227a(IS_AUTHORIZED_KEY, $r4);
        C13287o[] $r2 = {$r5};
        Bundle $r6 = C1372b.m36174a($r2);
        $r1.m35913o1(CLOSE_DIALOG_KEY, $r6);
        dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void resetPin() {
        PinDialogBinding $r1 = requireBinding();
        View $r2 = $r1.pinDesc;
        Log_OC.loadImage($r2, "pinDesc");
        View r5 = $r2;
        ViewExtKt.show(r5);
        TextView $r3 = $r1.errorTextView;
        Log_OC.loadImage($r3, "errorTextView");
        ViewExtKt.hide$default($r3, false, 1, null);
        PinEntryView $r4 = $r1.inputForm;
        $r4.setBorder(false);
        PinEntryView $r42 = $r1.inputForm;
        $r42.clearText();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setFragmentResult(String str) {
        Fragment r6 = (Fragment) this;
        FragmentManager $r2 = r6.getParentFragmentManager();
        C13287o $r4 = C13664u.m4227a(PASSWORD_KEY, str);
        C13287o[] $r3 = {$r4};
        Bundle $r5 = C1372b.m36174a($r3);
        $r2.m35913o1(KUDI_PIN_AUTH_SUCCESS_KEY, $r5);
        dismissAllowingStateLoss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void showErrorMessage$default(KudiPin kudiPin, String $r3, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            int $i02 = C0038R.string.something_went_wrong;
            Fragment r4 = (Fragment) kudiPin;
            String $r2 = r4.getString($i02);
            $r3 = $r2;
            Log_OC.loadImage($r2, "fun showErrorMessage(message: String = getString(R.string.something_went_wrong)) {\n        requireBinding().apply {\n            errorTextView.text = message\n            pinDesc.hide()\n            errorTextView.show()\n            inputForm.setBorder(true)\n        }\n    }");
        }
        kudiPin.showErrorMessage($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KudiPinViewData $r2 = (KudiPinViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(KudiPinViewData kudiPinViewData) {
        Log_OC.getArray(kudiPinViewData, "viewData");
        boolean $z0 = kudiPinViewData instanceof KudiPinViewData.Error;
        if ($z0) {
            KudiPinViewData.Error $r2 = (KudiPinViewData.Error) kudiPinViewData;
            showErrorMessage($r2.getMessage());
            Fragment r21 = (Fragment) this;
            FragmentManager $r4 = r21.getParentFragmentManager();
            Throwable $r6 = $r2.getThrowable();
            C13287o $r7 = C13664u.m4227a(ERROR_MESSAGE_KEY, $r6);
            C13287o[] $r5 = {$r7};
            Bundle $r8 = C1372b.m36174a($r5);
            $r4.m35913o1("ERROR", $r8);
            return;
        }
        KudiPinViewData.HideLoading $r9 = KudiPinViewData.HideLoading.INSTANCE;
        boolean $z02 = Log_OC.append(kudiPinViewData, $r9);
        if ($z02) {
            hideLoading();
            return;
        }
        KudiPinViewData.Initial $r10 = KudiPinViewData.Initial.INSTANCE;
        boolean $z03 = Log_OC.append(kudiPinViewData, $r10);
        if ($z03) {
            return;
        }
        KudiPinViewData.Loading $r11 = KudiPinViewData.Loading.INSTANCE;
        boolean $z04 = Log_OC.append(kudiPinViewData, $r11);
        if ($z04) {
            showLoading();
            return;
        }
        boolean $z05 = kudiPinViewData instanceof KudiPinViewData.SuccessfulAuth;
        if ($z05) {
            KudiPinViewData.SuccessfulAuth $r12 = (KudiPinViewData.SuccessfulAuth) kudiPinViewData;
            setFragmentResult($r12.getPin());
            return;
        }
        boolean $z06 = kudiPinViewData instanceof KudiPinViewData.SuccessSavingAuth;
        if ($z06) {
            KudiPinViewData.SuccessSavingAuth $r13 = (KudiPinViewData.SuccessSavingAuth) kudiPinViewData;
            setFragmentResult($r13.getPin());
            return;
        }
        boolean $z07 = kudiPinViewData instanceof KudiPinViewData.ErrorRes;
        if ($z07) {
            KudiPinViewData.ErrorRes $r14 = (KudiPinViewData.ErrorRes) kudiPinViewData;
            int $i0 = $r14.getRes();
            Fragment r212 = (Fragment) this;
            String $r3 = r212.getString($i0);
            Log_OC.loadImage($r3, "getString(viewData.res)");
            showErrorMessage($r3);
            Fragment r213 = (Fragment) this;
            FragmentManager $r42 = r213.getParentFragmentManager();
            Throwable $r62 = $r14.getThrowable();
            C13287o $r72 = C13664u.m4227a(ERROR_MESSAGE_KEY, $r62.getMessage());
            C13287o[] $r52 = {$r72};
            Bundle $r82 = C1372b.m36174a($r52);
            $r42.m35913o1("ERROR", $r82);
            return;
        }
        boolean $z08 = kudiPinViewData instanceof KudiPinViewData.AccountBlocked;
        if ($z08) {
            KudiPinViewData.AccountBlocked $r15 = (KudiPinViewData.AccountBlocked) kudiPinViewData;
            int $i02 = $r15.getRes();
            Fragment r214 = (Fragment) this;
            String $r32 = r214.getString($i02);
            Log_OC.loadImage($r32, "getString(viewData.res)");
            showErrorMessage($r32);
            Fragment r215 = (Fragment) this;
            Context $r17 = r215.getContext();
            Class $r18 = Class.forName(ACCOUNT_ERROR_CLASS_NAME);
            Intent r20 = new Intent($r17, $r18);
            r20.setFlags(268468224);
            AccountErrorType.Blocked $r19 = AccountErrorType.Blocked.INSTANCE;
            r20.putExtra(BUNDLE_KEY_ACCOUNT_ERROR, $r19);
            Fragment r216 = (Fragment) this;
            r216.startActivity(r20);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KudiPinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    public KudiPinViewModel createViewModel() {
        KudiPinViewModel $r1 = getKudiPinViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public PinDialogBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        PinDialogBinding $r3 = (PinDialogBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        PinDialogBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KudiPinViewModel getKudiPinViewModel() {
        KudiPinViewModel $r1 = this.kudiPinViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("kudiPinViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    protected Class getVMType() {
        return KudiPinViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoading() {
        Fragment r3 = (Fragment) this;
        boolean $z0 = r3.isDetached();
        if ($z0) {
            return;
        }
        PinDialogBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.progressBar;
        Log_OC.loadImage($r2, "requireBinding().progressBar");
        ViewExtKt.hide($r2, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(PinDialogBinding pinDialogBinding, Fragment fragment) {
        Log_OC.getArray(pinDialogBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(pinDialogBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        PinDialogBinding $r4 = (PinDialogBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        Fragment r2 = (Fragment) this;
        C7429a.m18752b(r2);
        Chapter r3 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        Chapter r3 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        Fragment r4 = (Fragment) this;
        Bundle $r1 = r4.getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString(KUDI_PIN_TITLE);
        this.title = $r2;
        String $r22 = $r1.getString(KUDI_PIN_DESC);
        this.desc = $r22;
        boolean $z0 = $r1.getBoolean(REQUIRE_SAVING_PIN_KEY);
        this.requiresSavingPin = $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        PinDialogBinding $r4 = PinDialogBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        Fragment r9 = (Fragment) this;
        final View $r5 = initBinding($r4, r9);
        ViewTreeObserver $r6 = $r5.getViewTreeObserver();
        $r6.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ai.kudi.agent.pin.KudiPin$onCreateView$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                KudiPin $r1 = KudiPin.this;
                Chapter r92 = (Chapter) $r1;
                Dialog $r2 = r92.getDialog();
                if ($r2 == null) {
                    NullPointerException r8 = new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                    throw r8;
                }
                DialogC0964i $r3 = (DialogC4547a) $r2;
                int $i0 = C9271f.design_bottom_sheet;
                DialogC0964i r10 = $r3;
                View $r42 = r10.findViewById($i0);
                if ($r42 == null) {
                    return;
                }
                BottomSheetBehavior $r52 = BottomSheetBehavior.m27460W($r42);
                $r52.m27437q0(3);
                $r52.m27443m0(0);
                ViewTreeObserver $r62 = $r5.getViewTreeObserver();
                $r62.removeOnGlobalLayoutListener(this);
            }
        });
        return $r5;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        bindViews();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public PinDialogBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        PinDialogBinding $r3 = (PinDialogBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        PinDialogBinding $r1 = requireBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setDesc(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        PinDialogBinding $r2 = requireBinding();
        TextView $r3 = $r2.pinDesc;
        TextView r4 = $r3;
        r4.setText(str);
    }

    public final void setKudiPinViewModel(KudiPinViewModel kudiPinViewModel) {
        Log_OC.getArray(kudiPinViewModel, "<set-?>");
        this.kudiPinViewModel = kudiPinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setTitle(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        PinDialogBinding $r2 = requireBinding();
        TextView $r3 = $r2.pinTitle;
        TextView r4 = $r3;
        r4.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showErrorMessage(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        PinDialogBinding $r1 = requireBinding();
        $r1.errorTextView.setText(str);
        View $r4 = $r1.pinDesc;
        Log_OC.loadImage($r4, "pinDesc");
        View r6 = $r4;
        ViewExtKt.hide$default(r6, false, 1, null);
        TextView $r3 = $r1.errorTextView;
        Log_OC.loadImage($r3, "errorTextView");
        ViewExtKt.show($r3);
        PinEntryView $r5 = $r1.inputForm;
        $r5.setBorder(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        PinDialogBinding $r1 = requireBinding();
        TextView $r2 = $r1.errorTextView;
        Log_OC.loadImage($r2, "errorTextView");
        ViewExtKt.hide$default($r2, false, 1, null);
        View $r3 = $r1.pinDesc;
        Log_OC.loadImage($r3, "pinDesc");
        View r6 = $r3;
        ViewExtKt.show(r6);
        ProgressBar $r4 = $r1.progressBar;
        Log_OC.loadImage($r4, "progressBar");
        ViewExtKt.show($r4);
        PinEntryView $r5 = $r1.inputForm;
        $r5.setBorder(false);
    }
}
