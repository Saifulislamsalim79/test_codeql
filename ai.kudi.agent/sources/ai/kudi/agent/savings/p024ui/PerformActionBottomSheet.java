package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.SavingsAnalytics;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.databinding.SheetLockSavingsBinding;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.C4552b;
import dagger.android.p197e.C7429a;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PerformActionBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\t\u0010*\u001a\u00020\u0003H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/savings/ui/PerformActionBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/savings/databinding/SheetLockSavingsBinding;", "()V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "binding", "getBinding", "()Lai/kudi/agent/savings/databinding/SheetLockSavingsBinding;", "body", "", "isWithdrawalAction", "", "Ljava/lang/Boolean;", "requestKey", "resultKey", KudiPin.KUDI_PIN_TITLE, "", "Ljava/lang/Integer;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.PerformActionBottomSheet */
/* loaded from: classes.dex */
public final class PerformActionBottomSheet extends C4552b implements BaseViewBinder<SheetLockSavingsBinding> {
    public static final Companion Companion;
    private static final String LOCK_AUTHORIZATION = "LOCK_AUTHORIZATION_KEY";
    private static final String LOCK_RESULT_KEY = "AUTHORIZED";
    private static final String MSG_ARG = "dialog_message";
    public static final String PAGE_KEY = "PerformActionDialog";
    private static final String REQUEST_KEY_ARG = "request_key";
    private static final String RESULT_KEY_ARG = "result_key";
    private static final String TITLE_ARG = "title_message";
    private static final String WITHDRAWAL_ACTION_KEY = "withdraw_action_key";
    private final /* synthetic */ BaseViewBinderImpl<SheetLockSavingsBinding> $$delegate_0;
    public Analytics analytics;
    private String body;
    private Boolean isWithdrawalAction;
    private String requestKey;
    private String resultKey;
    private Integer title;

    /* compiled from: PerformActionBottomSheet.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/savings/ui/PerformActionBottomSheet$Companion;", "", "()V", "LOCK_AUTHORIZATION", "", "LOCK_RESULT_KEY", "MSG_ARG", "REQUEST_KEY_ARG", "RESULT_KEY_ARG", "TAG", "TITLE_ARG", "WITHDRAWAL_ACTION_KEY", "newInstance", "Lai/kudi/agent/savings/ui/PerformActionBottomSheet;", KudiPin.KUDI_PIN_TITLE, "", "body", "requestKey", "resultKey", "isWithdrawAction", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.PerformActionBottomSheet$Companion */
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
        public static /* synthetic */ PerformActionBottomSheet newInstance$default(Companion companion, int $i0, String $r4, String $r0, String $r1, boolean $z0, int i, Object obj) {
            int $i2 = i & 1;
            if ($i2 != 0) {
                $i0 = C0456R.string.are_you_sure_you_want_to_lock_savings;
            }
            int $i22 = i & 2;
            if ($i22 != 0) {
                $r4 = null;
            }
            int $i23 = i & 4;
            if ($i23 != 0) {
                $r0 = "LOCK_AUTHORIZATION_KEY";
            }
            int $i24 = i & 8;
            if ($i24 != 0) {
                $r1 = "AUTHORIZED";
            }
            int $i1 = i & 16;
            if ($i1 != 0) {
                $z0 = false;
            }
            PerformActionBottomSheet $r2 = companion.newInstance($i0, $r4, $r0, $r1, $z0);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PerformActionBottomSheet newInstance(int i, String str, String str2, String str3, boolean z) {
            Log_OC.getArray(str2, "requestKey");
            Log_OC.getArray(str3, "resultKey");
            PerformActionBottomSheet r7 = new PerformActionBottomSheet();
            Bundle r8 = new Bundle();
            r8.putInt(PerformActionBottomSheet.TITLE_ARG, i);
            r8.putString(PerformActionBottomSheet.MSG_ARG, str);
            r8.putString(PerformActionBottomSheet.REQUEST_KEY_ARG, str2);
            r8.putString(PerformActionBottomSheet.RESULT_KEY_ARG, str3);
            r8.putBoolean(PerformActionBottomSheet.WITHDRAWAL_ACTION_KEY, z);
            C13666w c13666w = C13666w.f30112a;
            Fragment r9 = (Fragment) r7;
            r9.setArguments(r8);
            return r7;
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
    public PerformActionBottomSheet() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.requestKey = "LOCK_AUTHORIZATION_KEY";
        this.resultKey = "AUTHORIZED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-4  reason: not valid java name */
    public static final void m40529onViewCreated$lambda7$lambda4(PerformActionBottomSheet performActionBottomSheet, View view) {
        boolean $z0;
        Log_OC.getArray(performActionBottomSheet, "this$0");
        Boolean $r2 = performActionBottomSheet.isWithdrawalAction;
        if ($r2 != null && ($z0 = $r2.booleanValue())) {
            Analytics $r3 = performActionBottomSheet.getAnalytics();
            SavingsAnalytics.Actions.DefaultImpls.onConfirmWithdraw$default($r3, !$z0, null, 2, null);
        }
        performActionBottomSheet.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7$lambda-5  reason: not valid java name */
    public static final void m40530onViewCreated$lambda7$lambda5(PerformActionBottomSheet performActionBottomSheet, View view) {
        Log_OC.getArray(performActionBottomSheet, "this$0");
        performActionBottomSheet.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-6  reason: not valid java name */
    public static final void m40531onViewCreated$lambda7$lambda6(PerformActionBottomSheet performActionBottomSheet, View view) {
        Log_OC.getArray(performActionBottomSheet, "this$0");
        Fragment r8 = (Fragment) performActionBottomSheet;
        FragmentManager $r3 = r8.getParentFragmentManager();
        String $r1 = performActionBottomSheet.requestKey;
        String $r5 = performActionBottomSheet.resultKey;
        C13287o $r6 = C13664u.m4227a($r5, "YES");
        C13287o[] $r4 = {$r6};
        Bundle $r7 = C1372b.m36174a($r4);
        $r3.m35913o1($r1, $r7);
        performActionBottomSheet.dismissAllowingStateLoss();
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
    public SheetLockSavingsBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        SheetLockSavingsBinding $r3 = (SheetLockSavingsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        SheetLockSavingsBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(SheetLockSavingsBinding sheetLockSavingsBinding, Fragment fragment) {
        Log_OC.getArray(sheetLockSavingsBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(sheetLockSavingsBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        SheetLockSavingsBinding $r4 = (SheetLockSavingsBinding) interfaceC8209a;
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
        Chapter r6 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        int $i0 = C0456R.style.CustomBottomSheetDialogTheme;
        Chapter r62 = (Chapter) this;
        r62.setStyle(0, $i0);
        Fragment r7 = (Fragment) this;
        Bundle $r1 = r7.getArguments();
        if ($r1 == null) {
            return;
        }
        int $i02 = $r1.getInt(TITLE_ARG);
        Integer $r2 = Integer.valueOf($i02);
        this.title = $r2;
        this.body = $r1.getString(MSG_ARG);
        String $r3 = $r1.getString(REQUEST_KEY_ARG);
        String $r4 = $r3;
        if ($r3 == null) {
            $r4 = "LOCK_AUTHORIZATION_KEY";
        }
        this.requestKey = $r4;
        String $r32 = $r1.getString(RESULT_KEY_ARG);
        String $r42 = $r32;
        if ($r32 == null) {
            $r42 = "AUTHORIZED";
        }
        this.resultKey = $r42;
        boolean $z0 = $r1.getBoolean(WITHDRAWAL_ACTION_KEY);
        Boolean $r5 = Boolean.valueOf($z0);
        this.isWithdrawalAction = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        SheetLockSavingsBinding $r4 = SheetLockSavingsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        Fragment r6 = (Fragment) this;
        View $r5 = initBinding($r4, r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        Fragment r16 = (Fragment) this;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        Chapter r17 = (Chapter) this;
        Dialog $r3 = r17.getDialog();
        if ($r3 != null) {
            $r3.setCancelable(false);
        }
        SheetLockSavingsBinding $r4 = requireBinding();
        Integer $r5 = this.title;
        if ($r5 != null) {
            int $i0 = $r5.intValue();
            TextView $r6 = $r4.tvLockSavingsTitle;
            Fragment r162 = (Fragment) this;
            $r6.setText(r162.getString($i0));
        }
        String $r7 = this.body;
        if ($r7 != null) {
            TextView $r62 = $r4.tvLockSavingsBody;
            $r62.setText($r7);
        }
        TextView $r63 = $r4.tvCancel;
        $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PerformActionBottomSheet $r2 = PerformActionBottomSheet.this;
                PerformActionBottomSheet.m40529onViewCreated$lambda7$lambda4($r2, view2);
            }
        });
        ImageView $r9 = $r4.close;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PerformActionBottomSheet $r2 = PerformActionBottomSheet.this;
                PerformActionBottomSheet.m40530onViewCreated$lambda7$lambda5($r2, view2);
            }
        });
        ViewGroup $r11 = $r4.proceedButton;
        ViewGroup r18 = $r11;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PerformActionBottomSheet $r2 = PerformActionBottomSheet.this;
                PerformActionBottomSheet.m40531onViewCreated$lambda7$lambda6($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public SheetLockSavingsBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        SheetLockSavingsBinding $r3 = (SheetLockSavingsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        SheetLockSavingsBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }
}
