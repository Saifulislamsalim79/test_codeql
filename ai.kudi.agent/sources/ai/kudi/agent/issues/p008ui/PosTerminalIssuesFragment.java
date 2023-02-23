package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentPosTerminalIssuesBinding;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.p008ui.viewModels.PosTerminalIssuesViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.data.PosTerminalIssuesViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PosTerminalIssuesFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\f\u0010!\u001a\u00020\u000e*\u00020\"H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/issues/ui/PosTerminalIssuesFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/PosTerminalIssuesViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/PosTerminalIssuesViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentPosTerminalIssuesBinding;", "()V", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "posTerminalIssuesViewModel", "getPosTerminalIssuesViewModel", "()Lai/kudi/agent/issues/ui/viewModels/PosTerminalIssuesViewModel;", "setPosTerminalIssuesViewModel", "(Lai/kudi/agent/issues/ui/viewModels/PosTerminalIssuesViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "goBack", "Lai/kudi/agent/issues/ui/IssueActivity;", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.PosTerminalIssuesFragment */
/* loaded from: classes.dex */
public final class PosTerminalIssuesFragment extends BaseMVVMViewBindingFragment<PosTerminalIssuesViewModel, PosTerminalIssuesViewData, FragmentPosTerminalIssuesBinding> {
    public static final Companion Companion;
    public static final String DATA = "CATEGORY DATA";
    private IssueTypeModel issueData;
    public PosTerminalIssuesViewModel posTerminalIssuesViewModel;

    /* compiled from: PosTerminalIssuesFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/issues/ui/PosTerminalIssuesFragment$Companion;", "", "()V", IssueTypeFragmentNew.DATA, "", "newInstance", "Lai/kudi/agent/issues/ui/PosTerminalIssuesFragment;", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.PosTerminalIssuesFragment$Companion */
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
        public final PosTerminalIssuesFragment newInstance(IssueTypeModel issueTypeModel) {
            Log_OC.getArray(issueTypeModel, "issueData");
            PosTerminalIssuesFragment $r3 = new PosTerminalIssuesFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(PosTerminalIssuesFragment.DATA, issueTypeModel);
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
    private final void goBack(IssueActivity issueActivity) {
        int $i1 = C0214R.color.colorPrimary;
        int $i0 = C0214R.color.white;
        issueActivity.setToolBarColor($i1, $i0);
        PosTerminalIssuesFragment$goBack$1 $r2 = PosTerminalIssuesFragment$goBack$1.INSTANCE;
        AppCompatActivity r3 = (AppCompatActivity) issueActivity;
        AppCompatActivityExtKt.add(r3, $r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-8$lambda-7$lambda-1  reason: not valid java name */
    public static final void m39497onViewCreated$lambda8$lambda7$lambda1(PosTerminalIssuesFragment posTerminalIssuesFragment, IssueTypeModel issueTypeModel, View view) {
        Log_OC.getArray(posTerminalIssuesFragment, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueData");
        PosTerminalIssuesViewModel $r1 = posTerminalIssuesFragment.getPosTerminalIssuesViewModel();
        $r1.submitIssue(issueTypeModel, "Not Available");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-8$lambda-7$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39498onViewCreated$lambda8$lambda7$lambda3$lambda2(PosTerminalIssuesFragment posTerminalIssuesFragment, IssueActivity issueActivity, View view) {
        Log_OC.getArray(posTerminalIssuesFragment, "this$0");
        Log_OC.getArray(issueActivity, "$this_apply");
        posTerminalIssuesFragment.goBack(issueActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-8$lambda-7$lambda-4  reason: not valid java name */
    public static final void m39499onViewCreated$lambda8$lambda7$lambda4(PosTerminalIssuesFragment posTerminalIssuesFragment, View view) {
        Log_OC.getArray(posTerminalIssuesFragment, "this$0");
        FragmentActivity $r0 = posTerminalIssuesFragment.getActivity();
        if ($r0 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r4;
        }
        IssueActivity $r3 = (IssueActivity) $r0;
        posTerminalIssuesFragment.goBack($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-8$lambda-7$lambda-6$lambda-5  reason: not valid java name */
    public static final void m39500onViewCreated$lambda8$lambda7$lambda6$lambda5(IssueActivity issueActivity, View view) {
        Log_OC.getArray(issueActivity, "$this_apply");
        int $i1 = C0214R.color.colorPrimary;
        int $i0 = C0214R.color.white;
        issueActivity.setToolBarColor($i1, $i0);
        PosTerminalIssuesFragment$onViewCreated$1$1$4$1$1 $r2 = PosTerminalIssuesFragment$onViewCreated$1$1$4$1$1.INSTANCE;
        AppCompatActivity r3 = (AppCompatActivity) issueActivity;
        AppCompatActivityExtKt.add(r3, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PosTerminalIssuesViewData $r2 = (PosTerminalIssuesViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PosTerminalIssuesViewData posTerminalIssuesViewData) {
        String $r10;
        FragmentActivity $r11;
        Log_OC.getArray(posTerminalIssuesViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentPosTerminalIssuesBinding $r3 = (FragmentPosTerminalIssuesBinding) $r2;
        boolean $z0 = posTerminalIssuesViewData.isSubmitting();
        if ($z0) {
            KudiButton $r4 = $r3.submitIssueButton;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.submitIssueButton;
            $r42.m38033e();
        }
        Issue $r5 = posTerminalIssuesViewData.getIssue();
        if ($r5 != null) {
            PosTerminalIssuesViewModel $r6 = getPosTerminalIssuesViewModel();
            Issue.Ticket $r7 = $r5.getBoxOfficeResponse();
            $r6.checkStatus($r7);
        }
        boolean $z02 = posTerminalIssuesViewData.getShouldShowDeliveryAddress();
        KudiInputField $r8 = $r3.deliveryAddressView;
        Log_OC.loadImage($r8, "deliveryAddressView");
        if ($z02) {
            ViewExtKt.show($r8);
        } else {
            ViewExtKt.hide$default($r8, false, 1, null);
        }
        PosTerminalIssuesViewData.Error $r9 = posTerminalIssuesViewData.getError();
        if ($r9 == null || ($r10 = $r9.getMessage()) == null || ($r11 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r11, $r10, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PosTerminalIssuesViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PosTerminalIssuesViewModel createViewModel() {
        PosTerminalIssuesViewModel $r1 = getPosTerminalIssuesViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosTerminalIssuesViewModel getPosTerminalIssuesViewModel() {
        PosTerminalIssuesViewModel $r1 = this.posTerminalIssuesViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("posTerminalIssuesViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PosTerminalIssuesViewModel.class;
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
        Parcelable $r2 = $r1.getParcelable(DATA);
        if ($r2 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.viewmodels.model.IssueTypeModel");
            throw $r4;
        }
        IssueTypeModel $r3 = (IssueTypeModel) $r2;
        this.issueData = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPosTerminalIssuesBinding $r4 = FragmentPosTerminalIssuesBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r38, android.os.Bundle r39) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.PosTerminalIssuesFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setPosTerminalIssuesViewModel(PosTerminalIssuesViewModel posTerminalIssuesViewModel) {
        Log_OC.getArray(posTerminalIssuesViewModel, "<set-?>");
        this.posTerminalIssuesViewModel = posTerminalIssuesViewModel;
    }
}
