package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.RenewSavingRequest;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.viewdata.SavingDetailViewData;
import ai.kudi.agent.savings.databinding.FragmentSavingsDetailBinding;
import ai.kudi.agent.savings.extension.BoolExtKt;
import ai.kudi.agent.savings.extension.StringExtKt;
import ai.kudi.agent.savings.p024ui.PerformActionBottomSheet;
import ai.kudi.agent.savings.p024ui.SavingsMenuBottomSheet;
import ai.kudi.agent.savings.viewmodel.SavingDetailViewModel;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SavingsDetailFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 E2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0014J\b\u0010$\u001a\u00020\u0002H\u0014J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0014J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u0013H\u0002J\u0010\u0010)\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\"H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u00103\u001a\u00020\"2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J$\u00108\u001a\u0002092\u0006\u00106\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0016J\u001a\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u0002092\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010B\u001a\u00020\"H\u0002J\b\u0010C\u001a\u00020\"H\u0002J\b\u0010D\u001a\u00020\"H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006F"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsDetailFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/SavingDetailViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingDetailViewData;", "Lai/kudi/agent/savings/databinding/FragmentSavingsDetailBinding;", "()V", "adapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "getAdapter", "()Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "savingDetail", "Lai/kudi/agent/savings/data/model/SavingResponse;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "shouldHideWithdrawOption", "", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/SavingDetailViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/SavingDetailViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleWithdrawOptions", "savingResponse", "launchOptionsBottomSheet", "launchPinDialog", "isPlanBeenRenewed", "launchWithdrawFragment", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "populateView", "showDeactivateAccountDialog", "showRenewPlanDialog", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsDetailFragment */
/* loaded from: classes.dex */
public final class SavingsDetailFragment extends BaseMVVMViewBindingFragment<SavingDetailViewModel, SavingDetailViewData, FragmentSavingsDetailBinding> {
    public static final Companion Companion;
    public static final String DEACTIVATE_AUTHORIZATION = "DEACTIVATE_AUTHORIZATION_KEY";
    public static final String DEACTIVATE_RESULT_KEY = "AUTHORIZED";
    private static final String DESIRED_FORMAT = "d MMM yyyy";
    private static final String FORMAT = "yyyy-MM-dd";
    private static final int INDEX = 7;
    private static final String PAGE_KEY = "Deactivate";
    public static final String SAVING_DETAIL_KEY = "savings_detail";
    private static final String Status = "Status";
    private final InterfaceC11824h adapter$delegate;
    public Analytics analytics;
    private SavingResponse savingDetail;
    public SharedPreferences sharedPreferences;
    private boolean shouldHideWithdrawOption;
    public SavingDetailViewModel viewModel;

    /* compiled from: SavingsDetailFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsDetailFragment$Companion;", "", "()V", "DEACTIVATE_AUTHORIZATION", "", "DEACTIVATE_RESULT_KEY", "DESIRED_FORMAT", "FORMAT", "INDEX", "", "SAVING_DETAIL_KEY", SavingsDetailFragment.Status, "TAG", "newInstance", "Lai/kudi/agent/savings/ui/SavingsDetailFragment;", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingsDetailFragment$Companion */
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
        public final SavingsDetailFragment newInstance(SavingResponse savingResponse) {
            Log_OC.getArray(savingResponse, "savingResponse");
            SavingsDetailFragment $r3 = new SavingsDetailFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(SavingsDetailFragment.SAVING_DETAIL_KEY, savingResponse);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingsDetailFragment() {
        InterfaceC11824h $r1;
        SavingsDetailFragment$adapter$2 $r2 = SavingsDetailFragment$adapter$2.INSTANCE;
        $r1 = C13218k.m5625b($r2);
        this.adapter$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TwoColumnTableAdapter getAdapter() {
        InterfaceC11824h $r2 = this.adapter$delegate;
        Object $r1 = $r2.getValue();
        TwoColumnTableAdapter $r3 = (TwoColumnTableAdapter) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleWithdrawOptions(SavingResponse savingResponse) {
        Integer $r2 = savingResponse.getBalance();
        if ($r2 != null) {
            int $i0 = $r2.intValue();
            if ($i0 <= 0) {
                this.shouldHideWithdrawOption = true;
                InterfaceC8209a $r3 = requireBinding();
                FragmentSavingsDetailBinding $r4 = (FragmentSavingsDetailBinding) $r3;
                View $r5 = $r4.startButton;
                Log_OC.loadImage($r5, "requireBinding().startButton");
                View r14 = $r5;
                ViewExtKt.hide$default(r14, false, 1, null);
            }
        }
        String $r6 = savingResponse.getStatus();
        if ($r6 == null) {
            NullPointerException r13 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw r13;
        }
        Locale $r7 = Locale.ROOT;
        String $r62 = $r6.toLowerCase($r7);
        Log_OC.loadImage($r62, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        int $i02 = C0456R.string.deactivated;
        String $r8 = getString($i02);
        boolean $z0 = Log_OC.append($r62, $r8);
        if ($z0) {
            setHasOptionsMenu(false);
            InterfaceC8209a $r32 = requireBinding();
            FragmentSavingsDetailBinding $r42 = (FragmentSavingsDetailBinding) $r32;
            View $r52 = $r42.startButton;
            Log_OC.loadImage($r52, "requireBinding().startButton");
            View r142 = $r52;
            ViewExtKt.hide$default(r142, false, 1, null);
        }
        Date $r9 = StringExtKt.toDate(savingResponse.getDueDate(), FORMAT);
        Calendar $r10 = Calendar.getInstance();
        Date $r11 = $r10.getTime();
        boolean $z02 = $r11.before($r9);
        boolean $z1 = savingResponse.getLock();
        if ($z1 && $z02) {
            this.shouldHideWithdrawOption = true;
            InterfaceC8209a $r33 = requireBinding();
            FragmentSavingsDetailBinding $r43 = (FragmentSavingsDetailBinding) $r33;
            View $r53 = $r43.startButton;
            Log_OC.loadImage($r53, "requireBinding().startButton");
            View r143 = $r53;
            ViewExtKt.hide$default(r143, false, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void launchOptionsBottomSheet(boolean z) {
        SavingsMenuBottomSheet.SavingMenuItemClicked savingMenuItemClicked = new SavingsMenuBottomSheet.SavingMenuItemClicked() { // from class: ai.kudi.agent.savings.ui.SavingsDetailFragment$launchOptionsBottomSheet$bottomSheetListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.savings.p024ui.SavingsMenuBottomSheet.SavingMenuItemClicked
            public void onDeactivatePlanClicked() {
                SavingsDetailFragment $r1 = SavingsDetailFragment.this;
                $r1.showDeactivateAccountDialog();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.savings.p024ui.SavingsMenuBottomSheet.SavingMenuItemClicked
            public void onWithDrawClicked() {
                SavingsDetailFragment $r1 = SavingsDetailFragment.this;
                $r1.launchWithdrawFragment();
            }
        };
        Context $r3 = requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        Dialog r5 = new SavingsMenuBottomSheet($r3, z, savingMenuItemClicked);
        Dialog r6 = r5;
        r6.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void launchPinDialog(final boolean z) {
        FragmentManager $r1 = getChildFragmentManager();
        PreferenceActivity $r2 = getViewLifecycleOwner();
        $r1.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r2, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                SavingsDetailFragment $r3 = SavingsDetailFragment.this;
                boolean $z0 = z;
                SavingsDetailFragment.m40539launchPinDialog$lambda14($r3, $z0, str, bundle);
            }
        });
        KudiPin.Companion $r4 = KudiPin.Companion;
        int $i0 = C0456R.string.confirm_saving_pin_title;
        String $r5 = getString($i0);
        int $i02 = C0456R.string.enter_pin_to_complete_saving_transaction;
        String $r6 = getString($i02);
        KudiPin $r7 = $r4.newInstance($r5, $r6, true);
        FragmentManager $r12 = getChildFragmentManager();
        Chapter r9 = (Chapter) $r7;
        r9.show($r12, ".AuthDialog.Dialog");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void launchPinDialog$default(SavingsDetailFragment savingsDetailFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        savingsDetailFragment.launchPinDialog($z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchPinDialog$lambda-14  reason: not valid java name */
    public static final void m40539launchPinDialog$lambda14(SavingsDetailFragment savingsDetailFragment, boolean z, String str, Bundle bundle) {
        C13666w $r8;
        Log_OC.getArray(savingsDetailFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z1 = Log_OC.append(str, KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY);
        if ($z1) {
            String $r1 = bundle.getString(KudiPin.PASSWORD_KEY);
            SavingResponse $r3 = savingsDetailFragment.savingDetail;
            String $r4 = $r3 == null ? null : $r3.getId();
            if ($r4 == null || $r1 == null) {
                $r8 = null;
            } else {
                if (z) {
                    SavingDetailViewModel $r5 = savingsDetailFragment.getViewModel();
                    RenewSavingRequest $r6 = new RenewSavingRequest($r4, $r1);
                    $r5.renewSavingPlan($r6);
                } else {
                    SavingDetailViewModel $r52 = savingsDetailFragment.getViewModel();
                    UpdateSavingPlanRequest $r7 = new UpdateSavingPlanRequest($r4, null, $r1, 2, null);
                    $r52.deactivateSavingPlan($r7);
                }
                $r8 = C13666w.f30112a;
            }
            if ($r8 == null) {
                FragmentActivity $r9 = savingsDetailFragment.requireActivity();
                Log_OC.loadImage($r9, "requireActivity()");
                int $i0 = C0456R.string.saving_error;
                ContextExtKt.toast$default($r9, $i0, 0, 2, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void launchWithdrawFragment() {
        C13666w $r6;
        Analytics $r1 = getAnalytics();
        $r1.launchWithdrawScreen();
        SavingResponse $r2 = this.savingDetail;
        Integer $r3 = $r2 == null ? null : $r2.getBalance();
        SavingResponse $r22 = this.savingDetail;
        String $r4 = $r22 == null ? null : $r22.getId();
        SavingResponse $r23 = this.savingDetail;
        if ($r3 == null || $r4 == null || $r23 == null) {
            $r6 = null;
        } else {
            int $i0 = $r3.intValue();
            SavingDetailViewModel $r5 = getViewModel();
            $r5.navigateToWithdraw($i0, $r4, $r23);
            $r6 = C13666w.f30112a;
        }
        if ($r6 == null) {
            FragmentActivity $r7 = requireActivity();
            Log_OC.loadImage($r7, "requireActivity()");
            int $i02 = C0456R.string.cannot_withdraw_zero_balance;
            ContextExtKt.toast$default($r7, getString($i02), 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final SavingsDetailFragment newInstance(SavingResponse savingResponse) {
        Companion $r0 = Companion;
        SavingsDetailFragment $r1 = $r0.newInstance(savingResponse);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40540onViewCreated$lambda1(SavingsDetailFragment savingsDetailFragment, View view) {
        Log_OC.getArray(savingsDetailFragment, "this$0");
        savingsDetailFragment.launchWithdrawFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m40541onViewCreated$lambda2(SavingsDetailFragment savingsDetailFragment, View view) {
        Log_OC.getArray(savingsDetailFragment, "this$0");
        savingsDetailFragment.showRenewPlanDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void populateView() {
        List $r9;
        SavingResponse $r1 = this.savingDetail;
        if ($r1 == null) {
            return;
        }
        handleWithdrawOptions($r1);
        TwoColumnItem[] $r2 = new TwoColumnItem[8];
        int $i0 = C0456R.string.saving_goal;
        String $r4 = getString($i0);
        String $r5 = $r1.getGoal();
        TwoColumnItem.SimpleItem r19 = new TwoColumnItem.SimpleItem($r4, $r5);
        $r2[0] = r19;
        int $i02 = C0456R.string.saving_frequency;
        String $r42 = getString($i02);
        String $r52 = $r1.getFrequency();
        TwoColumnItem.SimpleItem r192 = new TwoColumnItem.SimpleItem($r42, $r52);
        $r2[1] = r192;
        int $i03 = C0456R.string.saving_duration;
        String $r43 = getString($i03);
        int $i04 = $r1.getDuration();
        String $r53 = IntExtKt.toDays($i04);
        TwoColumnItem.SimpleItem r193 = new TwoColumnItem.SimpleItem($r43, $r53);
        $r2[2] = r193;
        int $i05 = C0456R.string.saving_amount;
        String $r44 = getString($i05);
        int $i06 = $r1.getAmount();
        String $r54 = ai.kudi.agent.core.util.StringExtKt.getFormatAmount($i06);
        TwoColumnItem.SimpleItem r194 = new TwoColumnItem.SimpleItem($r44, $r54);
        $r2[3] = r194;
        int $i07 = C0456R.string.saving_startdate;
        String $r45 = getString($i07);
        String $r55 = $r1.getStartDate();
        TwoColumnItem.SimpleItem r195 = new TwoColumnItem.SimpleItem($r45, ai.kudi.agent.core.util.StringExtKt.convertDateFormat($r55, FORMAT, DESIRED_FORMAT));
        $r2[4] = r195;
        int $i08 = C0456R.string.saving_due_date;
        String $r46 = getString($i08);
        String $r56 = $r1.getDueDate();
        TwoColumnItem.SimpleItem r196 = new TwoColumnItem.SimpleItem($r46, ai.kudi.agent.core.util.StringExtKt.convertDateFormat($r56, FORMAT, DESIRED_FORMAT));
        $r2[5] = r196;
        int $i09 = C0456R.string.savings_lock;
        String $r47 = getString($i09);
        boolean $z0 = $r1.getLock();
        Boolean $r6 = Boolean.valueOf($z0);
        String $r57 = BoolExtKt.savings($r6);
        TwoColumnItem.SimpleItem r197 = new TwoColumnItem.SimpleItem($r47, $r57);
        $r2[6] = r197;
        int $i010 = C0456R.color.transparent;
        String $r48 = $r1.getStatus();
        Locale $r7 = Locale.ROOT;
        Log_OC.loadImage($r7, "ROOT");
        if ($r48 == null) {
            NullPointerException r22 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw r22;
        }
        String $r49 = $r48.toLowerCase($r7);
        Log_OC.loadImage($r49, "(this as java.lang.String).toLowerCase(locale)");
        String $r410 = ai.kudi.agent.core.util.StringExtKt.getCapitalizeAllWords($r49);
        String $r58 = $r1.getStatus();
        int $i1 = StringExtKt.statusBackground($r58);
        String $r59 = $r1.getStatus();
        int $i2 = StringExtKt.statusTextColor($r59);
        TwoColumnItem.StatusItem r20 = new TwoColumnItem.StatusItem(Status, $r410, $i010, $i1, $i2);
        $r2[7] = r20;
        $r9 = C13726r.m3885k($r2);
        ArrayList r21 = new ArrayList();
        Integer $r11 = $r1.getAmountSaved();
        if ($r11 != null) {
            int $i011 = $r11.intValue();
            int $i12 = C0456R.string.amount_saved_title;
            String $r411 = getString($i12);
            String $r510 = ai.kudi.agent.core.util.StringExtKt.getFormatAmount($i011);
            TwoColumnItem.SimpleItem r198 = new TwoColumnItem.SimpleItem($r411, $r510);
            r21.add(r198);
        }
        Integer $r112 = $r1.getBalance();
        if ($r112 != null) {
            int $i012 = $r112.intValue();
            int $i13 = C0456R.string.total_balance;
            String $r412 = getString($i13);
            String $r511 = ai.kudi.agent.core.util.StringExtKt.getFormatAmount($i012);
            TwoColumnItem.SimpleItem r199 = new TwoColumnItem.SimpleItem($r412, $r511);
            r21.add(r199);
        }
        Integer $r113 = $r1.getAmountWithdrawn();
        if ($r113 != null) {
            int $i013 = $r113.intValue();
            int $i14 = C0456R.string.amount_withdrawn;
            String $r413 = getString($i14);
            String $r512 = ai.kudi.agent.core.util.StringExtKt.getFormatAmount($i013);
            TwoColumnItem.SimpleItem r1910 = new TwoColumnItem.SimpleItem($r413, $r512);
            r21.add(r1910);
        }
        boolean $z02 = r21.isEmpty();
        if (true ^ $z02) {
            $r9.addAll(7, r21);
        }
        InterfaceC8209a $r12 = requireBinding();
        FragmentSavingsDetailBinding $r13 = (FragmentSavingsDetailBinding) $r12;
        RecyclerView $r14 = $r13.rvSavingDetail;
        TwoColumnTableAdapter $r15 = getAdapter();
        $r14.setAdapter($r15);
        TwoColumnTableAdapter $r152 = getAdapter();
        $r152.setData($r9);
        String $r414 = $r1.getStatus();
        SavingsPlanAdapter.SavingStatus $r16 = SavingsPlanAdapter.SavingStatus.COMPLETED;
        String $r513 = $r16.name();
        boolean $z03 = Log_OC.append($r414, $r513);
        if ($z03) {
            InterfaceC8209a $r122 = requireBinding();
            FragmentSavingsDetailBinding $r132 = (FragmentSavingsDetailBinding) $r122;
            View $r17 = $r132.renewButton;
            Log_OC.loadImage($r17, "requireBinding().renewButton");
            View r23 = $r17;
            ViewExtKt.show(r23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDeactivateAccountDialog() {
        FragmentManager $r2 = getChildFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(DEACTIVATE_AUTHORIZATION, $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38478c(String str, Bundle bundle) {
                SavingsDetailFragment $r32 = SavingsDetailFragment.this;
                SavingsDetailFragment.m40542showDeactivateAccountDialog$lambda10($r32, str, bundle);
            }
        });
        PerformActionBottomSheet.Companion $r1 = PerformActionBottomSheet.Companion;
        int $i0 = C0456R.string.deactivate_saving_dialog_title;
        int $i1 = C0456R.string.deactivate_saving_dialog_message;
        String $r5 = getString($i1);
        PerformActionBottomSheet $r6 = PerformActionBottomSheet.Companion.newInstance$default($r1, $i0, $r5, DEACTIVATE_AUTHORIZATION, "AUTHORIZED", false, 16, null);
        FragmentManager $r22 = getChildFragmentManager();
        ((Chapter) $r6).show($r22, PerformActionBottomSheet.PAGE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showDeactivateAccountDialog$lambda-10  reason: not valid java name */
    public static final void m40542showDeactivateAccountDialog$lambda10(SavingsDetailFragment savingsDetailFragment, String str, Bundle bundle) {
        Log_OC.getArray(savingsDetailFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DEACTIVATE_AUTHORIZATION);
        if ($z0) {
            String $r2 = bundle.getString("AUTHORIZED");
            if ($r2 == null) {
                return;
            }
            SavingDetailViewModel $r3 = savingsDetailFragment.getViewModel();
            $r3.getUserCategory();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showRenewPlanDialog() {
        /*
            r29 = this;
            r0 = r29
            androidx.fragment.app.FragmentManager r8 = r0.getChildFragmentManager()
            r0 = r29
            androidx.lifecycle.PreferenceActivity r9 = r0.getViewLifecycleOwner()
            ai.kudi.agent.savings.ui.StringDeserializer r10 = new ai.kudi.agent.savings.ui.StringDeserializer
            r0 = r29
            r10.<init>()
            java.lang.String r11 = "DEACTIVATE_AUTHORIZATION_KEY"
            r8.p1(r11, r9, r10)
            ai.kudi.agent.savings.ui.PerformActionBottomSheet$Companion r12 = ai.kudi.agent.savings.p024ui.PerformActionBottomSheet.Companion
            r0 = r29
            ai.kudi.agent.savings.data.model.SavingResponse r13 = r0.savingDetail
            if (r13 != 0) goto L22
        L20:
            r14 = 0
            goto L2a
        L22:
            boolean r14 = r13.getLock()
            r15 = 1
            if (r14 != r15) goto L20
            r14 = 1
        L2a:
            if (r14 == 0) goto L2f
            int r16 = ai.kudi.agent.savings.C0456R.string.renew_locked_plan_dialog_title
            goto L31
        L2f:
            int r16 = ai.kudi.agent.savings.C0456R.string.renew_plan_dialog_title
        L31:
            int r17 = ai.kudi.agent.savings.C0456R.string.renew_plan_dialog_body
            r15 = 2
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r18 = r0
            r0 = r29
            ai.kudi.agent.savings.data.model.SavingResponse r13 = r0.savingDetail
            r19 = 0
            if (r13 != 0) goto L43
            r20 = 0
            goto L4d
        L43:
            int r21 = r13.getAmount()
            r0 = r21
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
        L4d:
            r0 = r20
            java.lang.String r22 = java.lang.String.valueOf(r0)
            r15 = 0
            r18[r15] = r22
            r0 = r29
            ai.kudi.agent.savings.data.model.SavingResponse r13 = r0.savingDetail
            if (r13 != 0) goto L5d
            goto L67
        L5d:
            int r21 = r13.getDuration()
            r0 = r21
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
        L67:
            r0 = r19
            java.lang.String r22 = java.lang.String.valueOf(r0)
            r15 = 1
            r18[r15] = r22
            r0 = r29
            r1 = r17
            r2 = r18
            java.lang.String r22 = r0.getString(r1, r2)
            java.lang.String r11 = "DEACTIVATE_AUTHORIZATION_KEY"
            java.lang.String r24 = "AUTHORIZED"
            r15 = 0
            r25 = 16
            r26 = 0
            r0 = r12
            r1 = r16
            r2 = r22
            r3 = r11
            r4 = r24
            r5 = r15
            r6 = r25
            r7 = r26
            ai.kudi.agent.savings.ui.PerformActionBottomSheet r23 = ai.kudi.agent.savings.p024ui.PerformActionBottomSheet.Companion.newInstance$default(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = r29
            androidx.fragment.app.FragmentManager r8 = r0.getChildFragmentManager()
            r28 = r23
            androidx.fragment.app.Chapter r28 = (androidx.fragment.app.Chapter) r28
            r27 = r28
            java.lang.String r11 = "PerformActionDialog"
            r0 = r27
            r0.show(r8, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.p024ui.SavingsDetailFragment.showRenewPlanDialog():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showRenewPlanDialog$lambda-12  reason: not valid java name */
    public static final void m40543showRenewPlanDialog$lambda12(SavingsDetailFragment savingsDetailFragment, String str, Bundle bundle) {
        Log_OC.getArray(savingsDetailFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DEACTIVATE_AUTHORIZATION);
        if ($z0) {
            String $r2 = bundle.getString("AUTHORIZED");
            if ($r2 == null) {
                return;
            }
            savingsDetailFragment.launchPinDialog(true);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SavingDetailViewData $r2 = (SavingDetailViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SavingDetailViewData savingDetailViewData) {
        String $r6;
        C13666w $r9;
        Log_OC.getArray(savingDetailViewData, "viewData");
        boolean $z0 = savingDetailViewData instanceof SavingDetailViewData.Initial;
        if ($z0) {
            return;
        }
        boolean $z02 = savingDetailViewData instanceof SavingDetailViewData.ShowProgress;
        if ($z02) {
            SavingDetailViewModel $r2 = getViewModel();
            SavingDetailViewData.ShowProgress $r3 = (SavingDetailViewData.ShowProgress) savingDetailViewData;
            boolean $z03 = $r3.getVisibility();
            $r2.showProgress($z03);
            return;
        }
        boolean $z04 = savingDetailViewData instanceof SavingDetailViewData.Success;
        if ($z04) {
            SavingDetailViewData.Success $r4 = (SavingDetailViewData.Success) savingDetailViewData;
            boolean $z05 = $r4.isPlanRenewed();
            if ($z05) {
                SavingDetailViewModel $r22 = getViewModel();
                $r22.navigateToSavingSuccessDialog();
                return;
            }
            FragmentActivity $r5 = requireActivity();
            Log_OC.loadImage($r5, "requireActivity()");
            int $i0 = C0456R.string.plan_deactivated_successfully;
            ContextExtKt.toast$default($r5, getString($i0), 0, 2, (Object) null);
            SavingDetailViewModel $r23 = getViewModel();
            $r23.navigateToDeactivateSavingsDialog();
            return;
        }
        boolean $z06 = savingDetailViewData instanceof SavingDetailViewData.Error;
        if ($z06) {
            FragmentActivity $r52 = requireActivity();
            Log_OC.loadImage($r52, "requireActivity()");
            int $i02 = C0456R.string.saving_error;
            ContextExtKt.toast$default($r52, $i02, 0, 2, (Object) null);
            return;
        }
        boolean $z07 = savingDetailViewData instanceof SavingDetailViewData.User;
        if ($z07) {
            SavingDetailViewData.User $r7 = (SavingDetailViewData.User) savingDetailViewData;
            boolean $z08 = $r7.isExistingUser();
            if ($z08) {
                launchPinDialog$default(this, false, 1, null);
                return;
            }
            SavingResponse $r8 = this.savingDetail;
            if ($r8 == null || ($r6 = $r8.getId()) == null) {
                $r9 = null;
            } else {
                SavingDetailViewModel $r24 = getViewModel();
                UpdateSavingPlanRequest $r10 = new UpdateSavingPlanRequest($r6, null, "", 2, null);
                $r24.navigateToCreateSavingsPinFragment($r10);
                $r9 = C13666w.f30112a;
            }
            if ($r9 == null) {
                FragmentActivity $r53 = requireActivity();
                Log_OC.loadImage($r53, "requireActivity()");
                int $i03 = C0456R.string.saving_error;
                ContextExtKt.toast$default($r53, $i03, 0, 2, (Object) null);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SavingDetailViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SavingDetailViewModel createViewModel() {
        SavingDetailViewModel $r1 = getViewModel();
        return $r1;
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
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SavingDetailViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final SavingDetailViewModel getViewModel() {
        SavingDetailViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(SAVING_DETAIL_KEY);
        SavingResponse $r3 = (SavingResponse) $r2;
        this.savingDetail = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        int $i0 = C0456R.C0460menu.menu_saving;
        menuInflater.inflate($i0, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSavingsDetailBinding $r4 = FragmentSavingsDetailBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            FragmentActivity $r2 = requireActivity();
            $r2.onBackPressed();
            return true;
        }
        int $i02 = menuItem.getItemId();
        int $i1 = C0456R.C0458id.action_saving_options;
        if ($i02 != $i1) {
            boolean $z0 = super.onOptionsItemSelected(menuItem);
            return $z0;
        }
        boolean $z02 = this.shouldHideWithdrawOption;
        launchOptionsBottomSheet($z02);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException r15 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r15;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0456R.string.savings;
            String $r6 = getString($i0);
            $r5.mo37631C($r6);
        }
        populateView();
        InterfaceC8209a $r7 = requireBinding();
        FragmentSavingsDetailBinding $r8 = (FragmentSavingsDetailBinding) $r7;
        ViewGroup $r9 = $r8.startButton;
        ViewGroup r16 = $r9;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.EulaActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingsDetailFragment $r2 = SavingsDetailFragment.this;
                SavingsDetailFragment.m40540onViewCreated$lambda1($r2, view2);
            }
        });
        InterfaceC8209a $r72 = requireBinding();
        FragmentSavingsDetailBinding $r82 = (FragmentSavingsDetailBinding) $r72;
        ViewGroup $r92 = $r82.renewButton;
        ViewGroup r162 = $r92;
        r162.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.SubscribeActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingsDetailFragment $r2 = SavingsDetailFragment.this;
                SavingsDetailFragment.m40541onViewCreated$lambda2($r2, view2);
            }
        });
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setViewModel(SavingDetailViewModel savingDetailViewModel) {
        Log_OC.getArray(savingDetailViewModel, "<set-?>");
        this.viewModel = savingDetailViewModel;
    }
}
