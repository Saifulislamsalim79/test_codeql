package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.KtaBottomSheetLayoutBinding;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import ai.kudi.agent.wallettopup.fragments.BanksWithUssdCodesPicker;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4552b;
import com.google.android.material.bottomsheet.DialogC4547a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
import p272h.p368e.p369a.AbstractC9419a;
import p272h.p368e.p369a.p371c.C9421a;
import p425j.p444e.p450e0.Object;
/* compiled from: UssdTopUpBottomSheetFragment.kt */
@Metadata(m10422d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00017B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0003J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\rH\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\u0012\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J$\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00102\u001a\u00020\u001bH\u0002J\u001a\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\t\u00105\u001a\u00020\u0003H\u0096\u0001J\b\u00106\u001a\u00020\u001bH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/UssdTopUpBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/KtaBottomSheetLayoutBinding;", "()V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "banksList", "", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$BankData;", "binding", "getBinding", "()Lai/kudi/agent/databinding/KtaBottomSheetLayoutBinding;", "chosenAccount", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$AccountData;", "chosenBankData", "monnifyDetails", "Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "phoneNumber", "", "amtIsEmpty", "", "handleEditTextChanges", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "logOnBankSelected", "logOnUssdCodeCopied", "logOnUssdCodeDialed", "mapMonnifyDetailsToBankData", "it", "onAttach", "context", "Landroid/content/Context;", "onBankSelected", "onCopyClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onUssdDialClicked", "onViewCreated", "view", "requireBinding", "setAccountText", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UssdTopUpBottomSheetFragment extends C4552b implements BaseViewBinder<KtaBottomSheetLayoutBinding> {
    public static final Companion Companion;
    public static final String MONNIFY_DETAILS_KEY = "MONNIFY_DETAILS";
    public static final String PHONE = "PHONE";
    private final /* synthetic */ BaseViewBinderImpl<KtaBottomSheetLayoutBinding> $$delegate_0;
    public Analytics analytics;
    private List<MonnifyDetails.BankData> banksList;
    private MonnifyDetails.AccountData chosenAccount;
    private MonnifyDetails.BankData chosenBankData;
    private MonnifyDetails monnifyDetails;
    private String phoneNumber;

    /* compiled from: UssdTopUpBottomSheetFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/UssdTopUpBottomSheetFragment$Companion;", "", "()V", "MONNIFY_DETAILS_KEY", "", UssdTopUpBottomSheetFragment.PHONE, "newInstance", "Lai/kudi/agent/wallettopup/fragments/UssdTopUpBottomSheetFragment;", "monnifyDetails", "Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "phoneNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final UssdTopUpBottomSheetFragment newInstance(MonnifyDetails monnifyDetails, String str) {
            Log_OC.getArray(monnifyDetails, "monnifyDetails");
            Log_OC.getArray(str, "phoneNumber");
            UssdTopUpBottomSheetFragment r6 = new UssdTopUpBottomSheetFragment();
            Bundle r7 = new Bundle();
            r7.putParcelable(UssdTopUpBottomSheetFragment.MONNIFY_DETAILS_KEY, monnifyDetails);
            r7.putString(UssdTopUpBottomSheetFragment.PHONE, str);
            C13666w c13666w = C13666w.f30112a;
            Fragment r8 = (Fragment) r6;
            r8.setArguments(r7);
            return r6;
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
    public UssdTopUpBottomSheetFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.phoneNumber = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean amtIsEmpty() {
        boolean $z0;
        KtaBottomSheetLayoutBinding $r1 = requireBinding();
        KudiNairaInputField $r2 = $r1.amtInputField;
        String $r3 = $r2.getText();
        $z0 = C13276s.m5440u($r3);
        if ($z0) {
            KudiNairaInputField $r22 = $r1.amtInputField;
            Fragment r4 = (Fragment) this;
            String $r32 = r4.getString(C0001R.string.amount_error);
            $r22.setError($r32);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleEditTextChanges() {
        final KtaBottomSheetLayoutBinding $r1 = requireBinding();
        KudiNairaInputField $r2 = $r1.amtInputField;
        EditText $r3 = $r2.getEditText();
        Editable $r4 = $r3.getText();
        int $i0 = $r4 == null ? 0 : $r4.length();
        $r3.setSelection($i0);
        KudiNairaInputField $r22 = $r1.amtInputField;
        AbstractC9419a $r5 = C9421a.m14785a($r22.getEditText());
        $r5.d0(new Object() { // from class: ai.kudi.agent.wallettopup.fragments.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdTopUpBottomSheetFragment $r12 = UssdTopUpBottomSheetFragment.this;
                KtaBottomSheetLayoutBinding $r23 = $r1;
                CharSequence $r42 = (CharSequence) obj;
                UssdTopUpBottomSheetFragment.m41755handleEditTextChanges$lambda9$lambda8$lambda7($r12, $r23, $r42);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleEditTextChanges$lambda-9$lambda-8$lambda-7  reason: not valid java name */
    public static final void m41755handleEditTextChanges$lambda9$lambda8$lambda7(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment, KtaBottomSheetLayoutBinding ktaBottomSheetLayoutBinding, CharSequence charSequence) {
        boolean $z0;
        Log_OC.getArray(ussdTopUpBottomSheetFragment, "this$0");
        Log_OC.getArray(ktaBottomSheetLayoutBinding, "$this_apply");
        MonnifyDetails.BankData $r3 = ussdTopUpBottomSheetFragment.chosenBankData;
        if ($r3 != null) {
            TextView $r4 = ktaBottomSheetLayoutBinding.ussdCode;
            Log_OC.append($r3);
            String $r5 = ussdTopUpBottomSheetFragment.mapMonnifyDetailsToBankData($r3);
            $r4.setText($r5);
        }
        Log_OC.loadImage(charSequence, "it");
        $z0 = C13276s.m5440u(charSequence);
        if (!$z0) {
            View $r6 = ktaBottomSheetLayoutBinding.selectBank;
            Log_OC.loadImage($r6, "selectBank");
            View r8 = $r6;
            ViewExtKt.show(r8);
            return;
        }
        ktaBottomSheetLayoutBinding.selectBank.setText("");
        View $r62 = ktaBottomSheetLayoutBinding.selectBank;
        Log_OC.loadImage($r62, "selectBank");
        View r82 = $r62;
        ViewExtKt.hide$default(r82, false, 1, null);
        View $r7 = ktaBottomSheetLayoutBinding.dialUssd;
        Log_OC.loadImage($r7, "dialUssd");
        View r83 = $r7;
        ViewExtKt.hide$default(r83, false, 1, null);
        TextView $r42 = ktaBottomSheetLayoutBinding.copyCode;
        Log_OC.loadImage($r42, "copyCode");
        ViewExtKt.hide$default($r42, false, 1, null);
        TextView $r43 = ktaBottomSheetLayoutBinding.ussdCode;
        Log_OC.loadImage($r43, "ussdCode");
        ViewExtKt.hide$default($r43, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnBankSelected() {
        Analytics $r2 = getAnalytics();
        String $r1 = this.phoneNumber;
        $r2.onBankSelected($r1, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logOnUssdCodeCopied() {
        Analytics $r2 = getAnalytics();
        String $r1 = this.phoneNumber;
        $r2.onUssdCodeCopied($r1, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logOnUssdCodeDialed() {
        Analytics $r2 = getAnalytics();
        String $r1 = this.phoneNumber;
        $r2.onUssdCodeDialed($r1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String mapMonnifyDetailsToBankData(MonnifyDetails.BankData bankData) {
        String $r4;
        String $r2;
        String $r22;
        String $r23 = bankData.getCode();
        MonnifyDetails.AccountData $r3 = this.chosenAccount;
        if ($r3 == null || ($r4 = $r3.getAccountNumber()) == null) {
            $r4 = "";
        }
        $r2 = C13276s.m5451A($r23, "Acct", $r4, false, 4, null);
        KtaBottomSheetLayoutBinding $r5 = requireBinding();
        KudiNairaInputField $r6 = $r5.amtInputField;
        $r22 = C13276s.m5451A($r2, "Amnt", StringExtKt.getRemoveAllLetters($r6.getText()), false, 4, null);
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onBankSelected() {
        KtaBottomSheetLayoutBinding $r1 = requireBinding();
        BanksWithUssdCodesPicker.Companion $r2 = BanksWithUssdCodesPicker.Companion;
        List $r3 = this.banksList;
        if ($r3 == null) {
            NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<ai.kudi.agent.wallettopup.data.MonnifyDetails.BankData>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.kudi.agent.wallettopup.data.MonnifyDetails.BankData> }");
            throw r10;
        }
        ArrayList $r4 = (ArrayList) $r3;
        BanksWithUssdCodesPicker $r5 = BanksWithUssdCodesPicker.Companion.newInstance$default($r2, $r4, null, 2, null);
        UssdTopUpBottomSheetFragment$onBankSelected$1$1 r9 = new UssdTopUpBottomSheetFragment$onBankSelected$1$1(this, $r1);
        $r5.setOnBankSelectedListener(r9);
        Fragment r11 = (Fragment) this;
        FragmentManager $r7 = r11.getChildFragmentManager();
        $r5.show($r7, "Select Bank");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onCopyClicked() {
        boolean $z0 = amtIsEmpty();
        if ($z0) {
            return;
        }
        Fragment r7 = (Fragment) this;
        FragmentActivity $r1 = r7.getActivity();
        boolean $z02 = $r1 instanceof WalletTopUpActivity;
        if ($z02) {
            Fragment r72 = (Fragment) this;
            Context $r2 = r72.requireContext();
            Log_OC.loadImage($r2, "requireContext()");
            KtaBottomSheetLayoutBinding $r3 = requireBinding();
            TextView $r4 = $r3.ussdCode;
            CharSequence $r5 = $r4.getText();
            String $r6 = $r5.toString();
            RandomUtilKt.copyToClipboard$default($r2, $r6, null, null, 12, null);
            logOnUssdCodeCopied();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onUssdDialClicked() {
        String $r7;
        boolean $z0 = amtIsEmpty();
        if ($z0) {
            return;
        }
        Fragment r11 = (Fragment) this;
        boolean $z02 = r11.getActivity() instanceof WalletTopUpActivity;
        if ($z02) {
            logOnUssdCodeDialed();
            Fragment r112 = (Fragment) this;
            FragmentActivity $r1 = r112.getActivity();
            if ($r1 == null) {
                NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
                throw r10;
            }
            WalletTopUpActivity $r2 = (WalletTopUpActivity) $r1;
            Fragment r113 = (Fragment) this;
            Context $r3 = r113.requireContext();
            Log_OC.loadImage($r3, "requireContext()");
            KtaBottomSheetLayoutBinding $r4 = requireBinding();
            TextView $r5 = $r4.ussdCode;
            CharSequence $r6 = $r5.getText();
            String $r72 = $r6.toString();
            String $r8 = Uri.encode("#");
            Log_OC.loadImage($r8, "encode(\n                        \"#\"\n                    )");
            $r7 = C13276s.m5451A($r72, "#", $r8, false, 4, null);
            AppCompatActivity r12 = (AppCompatActivity) $r2;
            AppCompatActivityExtKt.dialTelephone(r12, $r3, $r7, WalletTopUpActivity.PERMISSION_REQUEST_CODE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m41756onViewCreated$lambda5$lambda3(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment, View view) {
        Log_OC.getArray(ussdTopUpBottomSheetFragment, "this$0");
        ussdTopUpBottomSheetFragment.onUssdDialClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41757onViewCreated$lambda5$lambda4(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment, View view) {
        Log_OC.getArray(ussdTopUpBottomSheetFragment, "this$0");
        ussdTopUpBottomSheetFragment.onCopyClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setAccountText() {
        KtaBottomSheetLayoutBinding $r1 = requireBinding();
        KudiInputField $r2 = $r1.accountNumberInputField;
        Object[] $r3 = new Object[2];
        MonnifyDetails.AccountData $r4 = this.chosenAccount;
        String $r6 = $r4 == null ? null : $r4.getAccountNumber();
        $r3[0] = $r6;
        MonnifyDetails.AccountData $r42 = this.chosenAccount;
        String $r5 = $r42 != null ? $r42.getBankName() : null;
        $r3[1] = $r5;
        Fragment r7 = (Fragment) this;
        String $r52 = r7.getString(C0001R.string.kta_bottom_sheet_bank_text, $r3);
        $r2.setText($r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public KtaBottomSheetLayoutBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        KtaBottomSheetLayoutBinding $r3 = (KtaBottomSheetLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        KtaBottomSheetLayoutBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(KtaBottomSheetLayoutBinding ktaBottomSheetLayoutBinding, Fragment fragment) {
        Log_OC.getArray(ktaBottomSheetLayoutBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(ktaBottomSheetLayoutBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        KtaBottomSheetLayoutBinding $r4 = (KtaBottomSheetLayoutBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        Chapter r7 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onAttach(context);
        Fragment r8 = (Fragment) this;
        boolean $z0 = r8.getActivity() instanceof WalletTopUpActivity;
        if ($z0) {
            Fragment r82 = (Fragment) this;
            FragmentActivity $r2 = r82.getActivity();
            if ($r2 == null) {
                NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
                throw r6;
            }
            WalletTopUpActivity $r3 = (WalletTopUpActivity) $r2;
            WalletTopupSubcomponent $r4 = $r3.getWalletTopupSubcomponent();
            $r4.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        List $r5;
        List $r52;
        MonnifyDetails.AccountData $r6;
        Chapter r10 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        Chapter r102 = (Chapter) this;
        r102.setStyle(0, C0001R.style.CustomBottomSheetDialogTheme);
        Fragment r11 = (Fragment) this;
        Bundle $r1 = r11.getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(MONNIFY_DETAILS_KEY);
        MonnifyDetails $r3 = (MonnifyDetails) $r2;
        this.monnifyDetails = $r3;
        if ($r3 != null && ($r5 = $r3.getAccount()) != null) {
            boolean $z0 = $r5.isEmpty();
            if (!$z0) {
                MonnifyDetails $r32 = this.monnifyDetails;
                if ($r32 == null || ($r52 = $r32.getAccount()) == null) {
                    $r6 = null;
                } else {
                    Object $r7 = $r52.get(0);
                    $r6 = (MonnifyDetails.AccountData) $r7;
                }
                this.chosenAccount = $r6;
            }
        }
        MonnifyDetails $r33 = this.monnifyDetails;
        List $r4 = $r33 != null ? $r33.getBanks() : null;
        this.banksList = $r4;
        String $r8 = $r1.getString(PHONE);
        String $r9 = $r8;
        if ($r8 == null) {
            $r9 = "";
        }
        this.phoneNumber = $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        KtaBottomSheetLayoutBinding $r4 = KtaBottomSheetLayoutBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        Fragment r6 = (Fragment) this;
        View $r5 = initBinding($r4, r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        BottomSheetBehavior $r5;
        Log_OC.getArray(view, "view");
        Fragment r18 = (Fragment) this;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        Chapter r19 = (Chapter) this;
        Dialog $r3 = r19.getDialog();
        boolean $z0 = $r3 instanceof DialogC4547a;
        DialogC4547a $r4 = $z0 ? (DialogC4547a) $r3 : null;
        if ($r4 != null && ($r5 = $r4.getBehavior()) != null) {
            $r5.m27437q0(3);
            $r5.m27448i0(true);
        }
        KtaBottomSheetLayoutBinding $r6 = requireBinding();
        KudiInputField $r7 = $r6.selectBank;
        $r7.disableEditablity();
        handleEditTextChanges();
        KudiInputField $r72 = $r6.selectBank;
        UssdTopUpBottomSheetFragment$onViewCreated$2$1 r14 = new UssdTopUpBottomSheetFragment$onViewCreated$2$1(this);
        $r72.setClickedListener(r14);
        ViewGroup $r9 = $r6.dialUssd;
        ViewGroup r20 = $r9;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.TimePicker$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdTopUpBottomSheetFragment $r2 = UssdTopUpBottomSheetFragment.this;
                UssdTopUpBottomSheetFragment.m41756onViewCreated$lambda5$lambda3($r2, view2);
            }
        });
        TextView $r11 = $r6.copyCode;
        $r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdTopUpBottomSheetFragment $r2 = UssdTopUpBottomSheetFragment.this;
                UssdTopUpBottomSheetFragment.m41757onViewCreated$lambda5$lambda4($r2, view2);
            }
        });
        KudiInputField $r73 = $r6.accountNumberInputField;
        $r73.disableEditablity();
        setAccountText();
        KudiInputField $r74 = $r6.accountNumberInputField;
        UssdTopUpBottomSheetFragment$onViewCreated$2$4 r17 = new UssdTopUpBottomSheetFragment$onViewCreated$2$4(this, $r6);
        $r74.setClickedListener(r17);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public KtaBottomSheetLayoutBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        KtaBottomSheetLayoutBinding $r3 = (KtaBottomSheetLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        KtaBottomSheetLayoutBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }
}
