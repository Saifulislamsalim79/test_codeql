package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ApplyPosRepairReplacementBinding;
import ai.kudi.agent.databinding.FragmentPosEligibilityBinding;
import ai.kudi.agent.databinding.NeedPosViewBinding;
import ai.kudi.agent.databinding.ViewTrackPosBinding;
import ai.kudi.agent.pos.data.PosRequestStatus;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData;
import ai.kudi.agent.pos.p016ui.utils.PosActivityExtKt;
import ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel;
import ai.kudi.agent.pos.p016ui.widget.PosRequestsSummaryView;
import ai.kudi.agent.pos.p016ui.widget.PosRequestsSummaryViewState;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PosEligibilityFragment.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0010\u0010+\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0010\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0014J\b\u0010/\u001a\u00020\u0002H\u0014J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0014J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u00020&2\b\u00108\u001a\u0004\u0018\u000109H\u0016J&\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020;2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020$H\u0002R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosEligibilityFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/pos/ui/viewModels/PosEligibilityViewModel;", "Lai/kudi/agent/pos/ui/data/PosEligibilityViewData;", "Lai/kudi/agent/databinding/FragmentPosEligibilityBinding;", "()V", "posEligibilityViewModel", "getPosEligibilityViewModel", "()Lai/kudi/agent/pos/ui/viewModels/PosEligibilityViewModel;", "setPosEligibilityViewModel", "(Lai/kudi/agent/pos/ui/viewModels/PosEligibilityViewModel;)V", "posTypeData", "", "Lai/kudi/agent/pos/data/PosTypeData;", "getPosTypeData", "()Ljava/util/List;", "setPosTypeData", "(Ljava/util/List;)V", "posTypeDataForLease", "getPosTypeDataForLease", "()Lai/kudi/agent/pos/data/PosTypeData;", "setPosTypeDataForLease", "(Lai/kudi/agent/pos/data/PosTypeData;)V", "posTypeDataForRepairReplacement", "posTypeDataForReplacement", "getPosTypeDataForReplacement", "setPosTypeDataForReplacement", "posTypeDataNewTerminal", "", "twoColumnAdapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "getTwoColumnAdapter", "()Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "setTwoColumnAdapter", "(Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;)V", "uplinePhoneNumber", "", "applyEligibility", "", "viewData", "applyError", "applyLoading", "applyPOSTypeData", "applyPosDeviceInfo", "applyPosSummary", "applyTrackPosStatus", "applyViewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "goToContactPartener", "goToGetPos", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showTerminalTrackStatus", TransactionField.STATUS, "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosEligibilityFragment */
/* loaded from: classes.dex */
public final class PosEligibilityFragment extends BaseMVVMViewBindingFragment<PosEligibilityViewModel, PosEligibilityViewData, FragmentPosEligibilityBinding> {
    public static final Companion Companion;
    public static final String UPLINE_PHONE_NUMBER = "UPLINE_PHONE_NUMBER";
    public PosEligibilityViewModel posEligibilityViewModel;
    private List<PosTypeData> posTypeData;
    private PosTypeData posTypeDataForLease;
    private PosTypeData posTypeDataForRepairReplacement;
    private PosTypeData posTypeDataForReplacement;
    private List<PosTypeData> posTypeDataNewTerminal;
    public TwoColumnTableAdapter twoColumnAdapter;
    private String uplinePhoneNumber;

    /* compiled from: PosEligibilityFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosEligibilityFragment$Companion;", "", "()V", PosEligibilityFragment.UPLINE_PHONE_NUMBER, "", "newInstance", "Lai/kudi/agent/pos/ui/PosEligibilityFragment;", "uplinePhoneNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.PosEligibilityFragment$Companion */
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
        public static /* synthetic */ PosEligibilityFragment newInstance$default(Companion companion, String $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = null;
            }
            PosEligibilityFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PosEligibilityFragment newInstance(String str) {
            PosEligibilityFragment $r1 = new PosEligibilityFragment();
            Bundle $r2 = new Bundle();
            $r2.putString(PosEligibilityFragment.UPLINE_PHONE_NUMBER, str);
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
    public PosEligibilityFragment() {
        List $r1;
        $r1 = C13726r.m3891e();
        this.posTypeData = $r1;
        ArrayList $r2 = new ArrayList();
        this.posTypeDataNewTerminal = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyEligibility(ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData r39) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.PosEligibilityFragment.applyEligibility(ai.kudi.agent.pos.ui.data.PosEligibilityViewData):void");
    }

    /* renamed from: applyEligibility$lambda-11$lambda-10 */
    public static final void m40060applyEligibility$lambda11$lambda10(PosEligibilityFragment posEligibilityFragment, View view) {
        Log_OC.getArray(posEligibilityFragment, "this$0");
        posEligibilityFragment.goToContactPartener();
    }

    /* renamed from: applyEligibility$lambda-11$lambda-9 */
    public static final void m40061applyEligibility$lambda11$lambda9(PosEligibilityFragment posEligibilityFragment, View view) {
        Log_OC.getArray(posEligibilityFragment, "this$0");
        posEligibilityFragment.goToGetPos();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyError(PosEligibilityViewData posEligibilityViewData) {
        PosEligibilityViewData.Error $r2 = posEligibilityViewData.getError();
        if ($r2 == null) {
            return;
        }
        String $r3 = $r2.getMessage();
        if ($r3 != null) {
            Context $r4 = requireContext();
            Log_OC.loadImage($r4, "requireContext()");
            ContextExtKt.toast$default($r4, $r3, 0, 2, (Object) null);
        }
        String $r32 = $r2.getPosSummaryMessage();
        if ($r32 == null) {
            return;
        }
        Context $r42 = requireContext();
        Log_OC.loadImage($r42, "requireContext()");
        ContextExtKt.toast$default($r42, $r32, 0, 2, (Object) null);
        InterfaceC8209a $r5 = requireBinding();
        FragmentPosEligibilityBinding $r6 = (FragmentPosEligibilityBinding) $r5;
        View $r7 = $r6.summaryView;
        Log_OC.loadImage($r7, "requireBinding().summaryView");
        View r8 = $r7;
        ViewExtKt.hide$default(r8, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyLoading(PosEligibilityViewData posEligibilityViewData) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentPosEligibilityBinding $r3 = (FragmentPosEligibilityBinding) $r2;
        boolean $z0 = posEligibilityViewData.isLoading();
        if ($z0) {
            ListLoaderViewBinding $r4 = $r3.loaderView;
            FrameLayout $r5 = $r4.getRoot();
            Log_OC.loadImage($r5, "loaderView.root");
            ViewExtKt.show($r5);
            ListLoaderViewBinding $r42 = $r3.loaderView;
            ShimmerFrameLayout $r6 = $r42.shimmerLoaderList;
            $r6.m32965c();
            View $r7 = $r3.cardView;
            Log_OC.loadImage($r7, "cardView");
            View r8 = $r7;
            ViewExtKt.hide$default(r8, false, 1, null);
            return;
        }
        ListLoaderViewBinding $r43 = $r3.loaderView;
        FrameLayout $r52 = $r43.getRoot();
        Log_OC.loadImage($r52, "loaderView.root");
        ViewExtKt.hide$default($r52, false, 1, null);
        ListLoaderViewBinding $r44 = $r3.loaderView;
        ShimmerFrameLayout $r62 = $r44.shimmerLoaderList;
        $r62.m32964d();
        View $r72 = $r3.cardView;
        Log_OC.loadImage($r72, "cardView");
        View r82 = $r72;
        ViewExtKt.show(r82);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x004b A[EDGE_INSN: B:186:0x004b->B:119:0x004b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00bd A[EDGE_INSN: B:192:0x00bd->B:141:0x00bd ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x012b A[EDGE_INSN: B:198:0x012b->B:163:0x012b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyPOSTypeData(ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData r40) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.PosEligibilityFragment.applyPOSTypeData(ai.kudi.agent.pos.ui.data.PosEligibilityViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:32:0x00e5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyPosDeviceInfo(ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData r33) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.PosEligibilityFragment.applyPosDeviceInfo(ai.kudi.agent.pos.ui.data.PosEligibilityViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyPosSummary(PosEligibilityViewData posEligibilityViewData) {
        PosRequestsSummaryViewState $r2 = posEligibilityViewData.getPosSummaryViewState();
        if ($r2 == null) {
            return;
        }
        InterfaceC8209a $r3 = requireBinding();
        FragmentPosEligibilityBinding $r4 = (FragmentPosEligibilityBinding) $r3;
        View $r5 = $r4.summaryView;
        Log_OC.loadImage($r5, "summaryView");
        View r8 = $r5;
        ViewExtKt.show(r8);
        $r4.summaryView.bindData($r2);
        PosRequestsSummaryView $r52 = $r4.summaryView;
        PosEligibilityFragment$applyPosSummary$1$1$1 r7 = new PosEligibilityFragment$applyPosSummary$1$1$1(this);
        $r52.setOnSummaryItemClicked(r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyTrackPosStatus(PosEligibilityViewData posEligibilityViewData) {
        String $r1 = posEligibilityViewData.getTrackPosStatus();
        if ($r1 == null) {
            return;
        }
        showTerminalTrackStatus($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void goToContactPartener() {
        String $r1 = this.uplinePhoneNumber;
        if ($r1 != null) {
            Log_OC.append($r1);
            AppCompatActivityExtKt.makeCall(this, $r1);
            return;
        }
        Context $r2 = requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        ContextExtKt.toast$default($r2, getString(C0001R.string.no_partner_found), 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void goToGetPos() {
        List $r1 = this.posTypeDataNewTerminal;
        boolean $z0 = $r1.isEmpty();
        if (!$z0) {
            PosEligibilityViewModel $r2 = getPosEligibilityViewModel();
            List $r12 = this.posTypeDataNewTerminal;
            $r2.navigateToLeaseTermsAndConditions($r12);
            return;
        }
        Context $r3 = requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        String $r4 = getString(C0001R.string.pos_fetch_eligibility_error);
        ContextExtKt.toast$default($r3, $r4, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final PosEligibilityFragment newInstance(String str) {
        Companion $r0 = Companion;
        PosEligibilityFragment $r1 = $r0.newInstance(str);
        return $r1;
    }

    /* renamed from: onViewCreated$lambda-6$lambda-1 */
    public static final void m40062onViewCreated$lambda6$lambda1(PosEligibilityFragment posEligibilityFragment, View view) {
        Log_OC.getArray(posEligibilityFragment, "this$0");
        posEligibilityFragment.goToGetPos();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-2 */
    public static final void m40063onViewCreated$lambda6$lambda2(PosEligibilityFragment posEligibilityFragment, View view) {
        Log_OC.getArray(posEligibilityFragment, "this$0");
        if (posEligibilityFragment.getPosTypeDataForReplacement() != null) {
            PosEligibilityViewModel $r3 = posEligibilityFragment.getPosEligibilityViewModel();
            PosTypeData $r2 = posEligibilityFragment.getPosTypeDataForReplacement();
            Log_OC.append($r2);
            $r3.navigateToMakePayment($r2);
            return;
        }
        Context $r4 = posEligibilityFragment.requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        String $r5 = posEligibilityFragment.getString(C0001R.string.pos_fetch_eligibility_error);
        ContextExtKt.toast$default($r4, $r5, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-3 */
    public static final void m40064onViewCreated$lambda6$lambda3(PosEligibilityFragment posEligibilityFragment, View view) {
        Log_OC.getArray(posEligibilityFragment, "this$0");
        PosEligibilityViewModel $r0 = posEligibilityFragment.getPosEligibilityViewModel();
        $r0.navigateToActivatePos();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-4 */
    public static final void m40065onViewCreated$lambda6$lambda4(PosEligibilityFragment posEligibilityFragment, View view) {
        Log_OC.getArray(posEligibilityFragment, "this$0");
        PosEligibilityViewModel $r0 = posEligibilityFragment.getPosEligibilityViewModel();
        $r0.navigateToActivatePos();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-5 */
    public static final void m40066onViewCreated$lambda6$lambda5(PosEligibilityFragment posEligibilityFragment, View view) {
        Log_OC.getArray(posEligibilityFragment, "this$0");
        if (posEligibilityFragment.posTypeDataForRepairReplacement != null) {
            PosEligibilityViewModel $r3 = posEligibilityFragment.getPosEligibilityViewModel();
            PosTypeData $r2 = posEligibilityFragment.posTypeDataForRepairReplacement;
            Log_OC.append($r2);
            $r3.navigateToMakePayment($r2);
            return;
        }
        Context $r4 = posEligibilityFragment.requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        String $r5 = posEligibilityFragment.getString(C0001R.string.pos_fetch_eligibility_error);
        ContextExtKt.toast$default($r4, $r5, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showTerminalTrackStatus(String str) {
        boolean $z0;
        InterfaceC8209a $r2 = requireBinding();
        FragmentPosEligibilityBinding $r3 = (FragmentPosEligibilityBinding) $r2;
        PosRequestStatus $r4 = PosRequestStatus.UNDEFINED;
        String $r5 = $r4.name();
        boolean $z02 = Log_OC.append(str, $r5);
        if ($z02) {
            $z0 = true;
        } else {
            PosRequestStatus $r42 = PosRequestStatus.REFUNDED;
            String $r52 = $r42.name();
            $z0 = Log_OC.append(str, $r52);
        }
        if ($z0) {
            InterfaceC8209a $r22 = requireBinding();
            View $r6 = ((FragmentPosEligibilityBinding) $r22).trackPosContainer;
            Log_OC.loadImage($r6, "requireBinding().trackPosContainer");
            View r10 = $r6;
            ViewExtKt.hide$default(r10, false, 1, null);
            return;
        }
        PosRequestStatus $r43 = PosRequestStatus.PURCHASED;
        String $r53 = $r43.name();
        boolean $z03 = Log_OC.append(str, $r53);
        if ($z03) {
            InterfaceC8209a $r23 = requireBinding();
            FragmentPosEligibilityBinding $r7 = (FragmentPosEligibilityBinding) $r23;
            View $r62 = $r7.trackPosContainer;
            Log_OC.loadImage($r62, "requireBinding().trackPosContainer");
            View r102 = $r62;
            ViewExtKt.show(r102);
            ViewTrackPosBinding $r8 = $r3.trackPOS;
            TextView $r9 = $r8.indicatorPhase1;
            $r9.setText("");
            ViewTrackPosBinding $r82 = $r3.trackPOS;
            TextView $r92 = $r82.indicatorPhase1;
            $r92.setBackgroundResource(C0001R.C0002drawable.ic_check_with_bg);
            ViewTrackPosBinding $r83 = $r3.trackPOS;
            TextView $r93 = $r83.indicatorPhase2;
            $r93.setBackgroundResource(C0001R.C0002drawable.circular_fill_kudi_accent);
            ViewTrackPosBinding $r84 = $r3.trackPOS;
            TextView $r94 = $r84.indicatorPhase3;
            $r94.setBackgroundResource(C0001R.C0002drawable.circular_fill_kudi_accent);
            return;
        }
        PosRequestStatus $r44 = PosRequestStatus.CONFIGURATION;
        String $r54 = $r44.name();
        boolean $z04 = Log_OC.append(str, $r54);
        if (!$z04) {
            PosRequestStatus $r45 = PosRequestStatus.DELIVERED;
            String $r55 = $r45.name();
            boolean $z05 = Log_OC.append(str, $r55);
            if ($z05) {
                InterfaceC8209a $r24 = requireBinding();
                View $r63 = ((FragmentPosEligibilityBinding) $r24).trackPosContainer;
                Log_OC.loadImage($r63, "requireBinding().trackPosContainer");
                View r103 = $r63;
                ViewExtKt.hide$default(r103, false, 1, null);
                return;
            }
            InterfaceC8209a $r25 = requireBinding();
            View $r64 = ((FragmentPosEligibilityBinding) $r25).trackPosContainer;
            Log_OC.loadImage($r64, "requireBinding().trackPosContainer");
            View r104 = $r64;
            ViewExtKt.hide$default(r104, false, 1, null);
            return;
        }
        InterfaceC8209a $r26 = requireBinding();
        FragmentPosEligibilityBinding $r72 = (FragmentPosEligibilityBinding) $r26;
        View $r65 = $r72.trackPosContainer;
        Log_OC.loadImage($r65, "requireBinding().trackPosContainer");
        View r105 = $r65;
        ViewExtKt.show(r105);
        ViewTrackPosBinding $r85 = $r3.trackPOS;
        TextView $r95 = $r85.indicatorPhase2;
        $r95.setText("");
        ViewTrackPosBinding $r86 = $r3.trackPOS;
        TextView $r96 = $r86.indicatorPhase2;
        $r96.setBackgroundResource(C0001R.C0002drawable.ic_check_with_bg);
        ViewTrackPosBinding $r87 = $r3.trackPOS;
        TextView $r97 = $r87.indicatorPhase1;
        $r97.setBackgroundResource(C0001R.C0002drawable.circular_fill_kudi_accent);
        ViewTrackPosBinding $r88 = $r3.trackPOS;
        TextView $r98 = $r88.indicatorPhase3;
        $r98.setBackgroundResource(C0001R.C0002drawable.circular_fill_kudi_accent);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PosEligibilityViewData $r2 = (PosEligibilityViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(PosEligibilityViewData posEligibilityViewData) {
        Log_OC.getArray(posEligibilityViewData, "viewData");
        applyLoading(posEligibilityViewData);
        applyEligibility(posEligibilityViewData);
        applyPosDeviceInfo(posEligibilityViewData);
        applyPOSTypeData(posEligibilityViewData);
        applyTrackPosStatus(posEligibilityViewData);
        applyPosSummary(posEligibilityViewData);
        applyError(posEligibilityViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PosEligibilityViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PosEligibilityViewModel createViewModel() {
        PosEligibilityViewModel $r1 = getPosEligibilityViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosEligibilityViewModel getPosEligibilityViewModel() {
        PosEligibilityViewModel $r1 = this.posEligibilityViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("posEligibilityViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getPosTypeData() {
        List r1 = this.posTypeData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosTypeData getPosTypeDataForLease() {
        PosTypeData r1 = this.posTypeDataForLease;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosTypeData getPosTypeDataForReplacement() {
        PosTypeData r1 = this.posTypeDataForReplacement;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TwoColumnTableAdapter getTwoColumnAdapter() {
        TwoColumnTableAdapter $r1 = this.twoColumnAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("twoColumnAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PosEligibilityViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PosActivity;
        if ($z0) {
            PosActivity $r3 = (PosActivity) context;
            PosSubComponent $r1 = $r3.getPos2SubComponent();
            $r1.inject(this);
        }
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
        String $r2 = $r1.getString(UPLINE_PHONE_NUMBER);
        this.uplinePhoneNumber = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutInflater $r1 = getLayoutInflater();
        FragmentPosEligibilityBinding $r4 = FragmentPosEligibilityBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        String $r4 = getString(C0001R.string.title_get_pos);
        Log_OC.loadImage($r4, "getString(R.string.title_get_pos)");
        PosActivityExtKt.setPosActivityTitle($r3, $r4);
        PosEligibilityViewModel $r5 = getPosEligibilityViewModel();
        $r5.updateIsNewFeature();
        InterfaceC8209a $r6 = requireBinding();
        FragmentPosEligibilityBinding $r7 = (FragmentPosEligibilityBinding) $r6;
        TextView $r8 = $r7.getPosTextview;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosEligibilityFragment $r2 = PosEligibilityFragment.this;
                PosEligibilityFragment.m40062onViewCreated$lambda6$lambda1($r2, view2);
            }
        });
        TextView $r82 = $r7.clickHereForReplacementButton;
        $r82.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosEligibilityFragment $r2 = PosEligibilityFragment.this;
                PosEligibilityFragment.m40063onViewCreated$lambda6$lambda2($r2, view2);
            }
        });
        TextView $r83 = $r7.activatePosView;
        $r83.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.SubscribeActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosEligibilityFragment $r2 = PosEligibilityFragment.this;
                PosEligibilityFragment.m40064onViewCreated$lambda6$lambda3($r2, view2);
            }
        });
        NeedPosViewBinding $r12 = $r7.getPosContainer;
        TextView $r84 = $r12.activateTerminalButton;
        $r84.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosEligibilityFragment $r2 = PosEligibilityFragment.this;
                PosEligibilityFragment.m40065onViewCreated$lambda6$lambda4($r2, view2);
            }
        });
        ApplyPosRepairReplacementBinding $r14 = $r7.eligibleRepairReplacementView;
        TextView $r85 = $r14.applyButton;
        $r85.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosEligibilityFragment $r2 = PosEligibilityFragment.this;
                PosEligibilityFragment.m40066onViewCreated$lambda6$lambda5($r2, view2);
            }
        });
    }

    public final void setPosEligibilityViewModel(PosEligibilityViewModel posEligibilityViewModel) {
        Log_OC.getArray(posEligibilityViewModel, "<set-?>");
        this.posEligibilityViewModel = posEligibilityViewModel;
    }

    public final void setPosTypeData(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.posTypeData = list;
    }

    public final void setPosTypeDataForLease(PosTypeData posTypeData) {
        this.posTypeDataForLease = posTypeData;
    }

    public final void setPosTypeDataForReplacement(PosTypeData posTypeData) {
        this.posTypeDataForReplacement = posTypeData;
    }

    public final void setTwoColumnAdapter(TwoColumnTableAdapter twoColumnTableAdapter) {
        Log_OC.getArray(twoColumnTableAdapter, "<set-?>");
        this.twoColumnAdapter = twoColumnTableAdapter;
    }
}
