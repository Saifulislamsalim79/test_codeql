package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.model.SavingsRequest;
import ai.kudi.agent.savings.data.viewdata.SavingsReviewViewData;
import ai.kudi.agent.savings.databinding.FragmentSavingsReviewBinding;
import ai.kudi.agent.savings.extension.BoolExtKt;
import ai.kudi.agent.savings.viewmodel.SavingsReviewViewModel;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SavingsReviewFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0014J\b\u0010\u001c\u001a\u00020\u0002H\u0014J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J$\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00061"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsReviewFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/SavingsReviewViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingsReviewViewData;", "Lai/kudi/agent/savings/databinding/FragmentSavingsReviewBinding;", "()V", "adapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "getAdapter", "()Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "savingsModel", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/SavingsReviewViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/SavingsReviewViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "launchBottomSheet", "launchPinDialog", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "populateView", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsReviewFragment */
/* loaded from: classes.dex */
public final class SavingsReviewFragment extends BaseMVVMViewBindingFragment<SavingsReviewViewModel, SavingsReviewViewData, FragmentSavingsReviewBinding> {
    public static final Companion Companion;
    private static final String DESIRED_FORMAT = "d MMM yyyy";
    private static final String FORMAT = "yyyy/MM/dd";
    public static final String LOCK_AUTHORIZATION = "LOCK_AUTHORIZATION_KEY";
    public static final String LOCK_RESULT_KEY = "AUTHORIZED";
    private static final String PAGE_KEY = "LockSaving";
    private static final String SAVINGS_KEY = "savings";
    private final InterfaceC11824h adapter$delegate;
    public Analytics analytics;
    private CreateSavingsModel savingsModel;
    public SavingsReviewViewModel viewModel;

    /* compiled from: SavingsReviewFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsReviewFragment$Companion;", "", "()V", "DESIRED_FORMAT", "", "FORMAT", "LOCK_AUTHORIZATION", "LOCK_RESULT_KEY", "SAVINGS_KEY", "TAG", "newInstance", "Lai/kudi/agent/savings/ui/SavingsReviewFragment;", SavingsReviewFragment.SAVINGS_KEY, "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingsReviewFragment$Companion */
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
        public final SavingsReviewFragment newInstance(CreateSavingsModel createSavingsModel) {
            Log_OC.getArray(createSavingsModel, SavingsReviewFragment.SAVINGS_KEY);
            SavingsReviewFragment $r1 = new SavingsReviewFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable(SavingsReviewFragment.SAVINGS_KEY, createSavingsModel);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
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
    public SavingsReviewFragment() {
        InterfaceC11824h $r1;
        SavingsReviewFragment$adapter$2 $r2 = SavingsReviewFragment$adapter$2.INSTANCE;
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
    private final void launchBottomSheet() {
        FragmentManager $r1 = getChildFragmentManager();
        PreferenceActivity $r2 = getViewLifecycleOwner();
        $r1.p1(LOCK_AUTHORIZATION, $r2, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                SavingsReviewFragment $r3 = SavingsReviewFragment.this;
                SavingsReviewFragment.m40552launchBottomSheet$lambda7($r3, str, bundle);
            }
        });
        PerformActionBottomSheet r6 = new PerformActionBottomSheet();
        FragmentManager $r12 = getChildFragmentManager();
        Chapter r7 = (Chapter) r6;
        r7.show($r12, PAGE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchBottomSheet$lambda-7  reason: not valid java name */
    public static final void m40552launchBottomSheet$lambda7(SavingsReviewFragment savingsReviewFragment, String str, Bundle bundle) {
        Log_OC.getArray(savingsReviewFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, LOCK_AUTHORIZATION);
        if ($z0) {
            String $r2 = bundle.getString("AUTHORIZED");
            if ($r2 == null) {
                return;
            }
            SavingsReviewViewModel $r3 = savingsReviewFragment.getViewModel();
            $r3.getUserCategory();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void launchPinDialog() {
        FragmentManager $r1 = getChildFragmentManager();
        PreferenceActivity $r2 = getViewLifecycleOwner();
        $r1.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r2, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38498c(String str, Bundle bundle) {
                SavingsReviewFragment $r3 = SavingsReviewFragment.this;
                SavingsReviewFragment.m40553launchPinDialog$lambda9($r3, str, bundle);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchPinDialog$lambda-9  reason: not valid java name */
    public static final void m40553launchPinDialog$lambda9(SavingsReviewFragment savingsReviewFragment, String str, Bundle bundle) {
        SavingsRequest $r7;
        Integer $r6;
        Log_OC.getArray(savingsReviewFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        Analytics $r3 = savingsReviewFragment.getAnalytics();
        $r3.onSavingsPinEntered();
        boolean $z0 = Log_OC.append(str, KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY);
        if ($z0) {
            String $r1 = bundle.getString(KudiPin.PASSWORD_KEY);
            CreateSavingsModel $r4 = savingsReviewFragment.savingsModel;
            CreateSavingsModel $r5 = null;
            if ($r4 != null) {
                if ($r1 == null) {
                    $r6 = null;
                } else {
                    int $i0 = Integer.parseInt($r1);
                    $r6 = Integer.valueOf($i0);
                }
                $r5 = CreateSavingsModel.copy$default($r4, null, null, null, null, null, null, $r6, 63, null);
            }
            if ($r5 == null || ($r7 = $r5.toSavingRequest()) == null) {
                return;
            }
            SavingsReviewViewModel $r8 = savingsReviewFragment.getViewModel();
            $r8.createSavings($r7);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final SavingsReviewFragment newInstance(CreateSavingsModel createSavingsModel) {
        Companion $r0 = Companion;
        SavingsReviewFragment $r1 = $r0.newInstance(createSavingsModel);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
    public static final void m40554onViewCreated$lambda5(SavingsReviewFragment savingsReviewFragment, View view) {
        Boolean $r3;
        Log_OC.getArray(savingsReviewFragment, "this$0");
        CreateSavingsModel $r2 = savingsReviewFragment.savingsModel;
        if ($r2 == null || ($r3 = $r2.getLock()) == null) {
            return;
        }
        boolean $z0 = $r3.booleanValue();
        if ($z0) {
            savingsReviewFragment.launchBottomSheet();
            return;
        }
        SavingsReviewViewModel $r4 = savingsReviewFragment.getViewModel();
        $r4.getUserCategory();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void populateView(CreateSavingsModel createSavingsModel) {
        List $r11;
        List $r112;
        Boolean $r2 = createSavingsModel.getLock();
        if ($r2 != null) {
            boolean $z0 = $r2.booleanValue();
            if ($z0) {
                InterfaceC8209a $r3 = requireBinding();
                FragmentSavingsReviewBinding $r4 = (FragmentSavingsReviewBinding) $r3;
                TextView $r5 = $r4.tvReviewMessage;
                Log_OC.loadImage($r5, "requireBinding().tvReviewMessage");
                ViewExtKt.show($r5);
            }
        }
        TwoColumnItem.SimpleItem[] $r6 = new TwoColumnItem.SimpleItem[7];
        int $i0 = C0456R.string.saving_goal;
        String $r8 = getString($i0);
        String $r9 = createSavingsModel.getGoal();
        TwoColumnItem.SimpleItem $r7 = new TwoColumnItem.SimpleItem($r8, $r9);
        $r6[0] = $r7;
        int $i02 = C0456R.string.saving_frequency;
        String $r82 = getString($i02);
        String $r92 = createSavingsModel.getFrequency();
        TwoColumnItem.SimpleItem $r72 = new TwoColumnItem.SimpleItem($r82, $r92);
        $r6[1] = $r72;
        int $i03 = C0456R.string.saving_duration;
        String $r83 = getString($i03);
        String $r93 = createSavingsModel.getDuration();
        TwoColumnItem.SimpleItem $r73 = new TwoColumnItem.SimpleItem($r83, $r93);
        $r6[2] = $r73;
        int $i04 = C0456R.string.saving_amount;
        String $r84 = getString($i04);
        String $r94 = createSavingsModel.getAmount();
        TwoColumnItem.SimpleItem $r74 = new TwoColumnItem.SimpleItem($r84, $r94);
        $r6[3] = $r74;
        int $i05 = C0456R.string.saving_startdate;
        String $r95 = getString($i05);
        String $r10 = createSavingsModel.getStartDate();
        String $r85 = null;
        TwoColumnItem.SimpleItem $r75 = new TwoColumnItem.SimpleItem($r95, $r10 == null ? null : StringExtKt.convertDateFormat($r10, FORMAT, DESIRED_FORMAT));
        $r6[4] = $r75;
        int $i06 = C0456R.string.saving_due_date;
        String $r96 = getString($i06);
        String $r102 = createSavingsModel.getStartDate();
        if ($r102 != null) {
            String $r86 = createSavingsModel.getDuration();
            $r85 = ai.kudi.agent.savings.extension.StringExtKt.daysAfter($r102, $r86);
        }
        TwoColumnItem.SimpleItem $r76 = new TwoColumnItem.SimpleItem($r96, $r85);
        $r6[5] = $r76;
        int $i07 = C0456R.string.savings_lock;
        String $r87 = getString($i07);
        String $r97 = BoolExtKt.savings(createSavingsModel.getLock());
        TwoColumnItem.SimpleItem $r77 = new TwoColumnItem.SimpleItem($r87, $r97);
        $r6[6] = $r77;
        $r11 = C13726r.m3888h($r6);
        InterfaceC8209a $r32 = requireBinding();
        FragmentSavingsReviewBinding $r42 = (FragmentSavingsReviewBinding) $r32;
        RecyclerView $r12 = $r42.rvSavingsReview;
        TwoColumnTableAdapter $r13 = getAdapter();
        $r12.setAdapter($r13);
        TwoColumnTableAdapter $r132 = getAdapter();
        $r112 = C13742z.m3823D0($r11);
        $r132.setData($r112);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SavingsReviewViewData $r2 = (SavingsReviewViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SavingsReviewViewData savingsReviewViewData) {
        Log_OC.getArray(savingsReviewViewData, "viewData");
        boolean $z0 = savingsReviewViewData instanceof SavingsReviewViewData.ShowProgress;
        if ($z0) {
            SavingsReviewViewModel $r2 = getViewModel();
            SavingsReviewViewData.ShowProgress $r3 = (SavingsReviewViewData.ShowProgress) savingsReviewViewData;
            boolean $z02 = $r3.getVisibility();
            $r2.toggleProgress($z02);
            return;
        }
        boolean $z03 = savingsReviewViewData instanceof SavingsReviewViewData.Success;
        if ($z03) {
            SavingsReviewViewModel $r22 = getViewModel();
            $r22.updateSavingsFeatureMenuLabel();
            SavingsReviewViewModel $r23 = getViewModel();
            $r23.navigateToSavingSuccessDialog();
            return;
        }
        boolean $z04 = savingsReviewViewData instanceof SavingsReviewViewData.Error;
        if ($z04) {
            FragmentActivity $r4 = requireActivity();
            Log_OC.loadImage($r4, "requireActivity()");
            SavingsReviewViewData.Error $r5 = (SavingsReviewViewData.Error) savingsReviewViewData;
            String $r6 = $r5.getMessage();
            ContextExtKt.toast$default($r4, $r6, 0, 2, (Object) null);
            return;
        }
        boolean $z05 = savingsReviewViewData instanceof SavingsReviewViewData.User;
        if ($z05) {
            SavingsReviewViewData.User $r7 = (SavingsReviewViewData.User) savingsReviewViewData;
            boolean $z06 = $r7.isExistingUser();
            if ($z06) {
                launchPinDialog();
                return;
            }
            CreateSavingsModel $r8 = this.savingsModel;
            if ($r8 == null) {
                return;
            }
            SavingsReviewViewModel $r24 = getViewModel();
            $r24.navigateToCreateSavingsPinFragment($r8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SavingsReviewViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SavingsReviewViewModel createViewModel() {
        SavingsReviewViewModel $r1 = getViewModel();
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

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SavingsReviewViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final SavingsReviewViewModel getViewModel() {
        SavingsReviewViewModel $r1 = this.viewModel;
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
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(SAVINGS_KEY);
        CreateSavingsModel $r3 = (CreateSavingsModel) $r2;
        this.savingsModel = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSavingsReviewBinding $r4 = FragmentSavingsReviewBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r14;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0456R.string.create_savings;
            String $r6 = getString($i0);
            $r5.mo37631C($r6);
        }
        CreateSavingsModel $r7 = this.savingsModel;
        if ($r7 != null) {
            populateView($r7);
        }
        InterfaceC8209a $r8 = requireBinding();
        FragmentSavingsReviewBinding $r9 = (FragmentSavingsReviewBinding) $r8;
        ViewGroup $r10 = $r9.startButton;
        ViewGroup r15 = $r10;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.SettingsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingsReviewFragment $r2 = SavingsReviewFragment.this;
                SavingsReviewFragment.m40554onViewCreated$lambda5($r2, view2);
            }
        });
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setViewModel(SavingsReviewViewModel savingsReviewViewModel) {
        Log_OC.getArray(savingsReviewViewModel, "<set-?>");
        this.viewModel = savingsReviewViewModel;
    }
}
