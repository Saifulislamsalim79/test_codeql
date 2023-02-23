package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentKycformIssueBinding;
import ai.kudi.agent.pin.KudiPin;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KYCformIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001*B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\u001a\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\t\u0010(\u001a\u00020\u0003H\u0096\u0001J\b\u0010)\u001a\u00020\u0015H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/issues/ui/KYCformIssueFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentKycformIssueBinding;", "()V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentKycformIssueBinding;", "issueDescription", "", "issueType", "initBinding", "Landroid/view/View;", "fragment", "logHelpless", "", "logKycHelpful", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onResume", "onViewCreated", "view", "requireBinding", "showFeedbackScreen", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.KYCformIssueFragment */
/* loaded from: classes.dex */
public final class KYCformIssueFragment extends Fragment implements BaseViewBinder<FragmentKycformIssueBinding> {
    public static final Companion Companion;
    public static final String DESC = "DESC";
    public static final String TYPE = "TYPE";
    private final /* synthetic */ BaseViewBinderImpl<FragmentKycformIssueBinding> $$delegate_0;
    public Analytics analytics;
    private String issueDescription;
    private String issueType;

    /* compiled from: KYCformIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/issues/ui/KYCformIssueFragment$Companion;", "", "()V", KYCformIssueFragment.DESC, "", "TYPE", "newInstance", "Lai/kudi/agent/issues/ui/KYCformIssueFragment;", "issueType", KudiPin.KUDI_PIN_DESC, "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.KYCformIssueFragment$Companion */
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
        public final KYCformIssueFragment newInstance(String str, String str2) {
            Log_OC.getArray(str, "issueType");
            Log_OC.getArray(str2, KudiPin.KUDI_PIN_DESC);
            KYCformIssueFragment $r4 = new KYCformIssueFragment();
            Bundle $r2 = new Bundle();
            $r2.putString("TYPE", str);
            $r2.putString(KYCformIssueFragment.DESC, str2);
            C13666w c13666w = C13666w.f30112a;
            $r4.setArguments($r2);
            return $r4;
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
    public KYCformIssueFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.issueType = "";
        this.issueDescription = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logHelpless(String str, String str2) {
        Analytics $r3 = getAnalytics();
        $r3.logKYCFormWasNotHelpfulClicked(str, str2);
        showFeedbackScreen();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logKycHelpful(String str, String str2) {
        Analytics $r3 = getAnalytics();
        $r3.logKYcFormWasHelpfulClicked(str, str2);
        showFeedbackScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-6$lambda-3  reason: not valid java name */
    public static final void m39493onResume$lambda6$lambda3(KYCformIssueFragment kYCformIssueFragment, View view) {
        Log_OC.getArray(kYCformIssueFragment, "this$0");
        String $r3 = kYCformIssueFragment.issueType;
        String $r1 = kYCformIssueFragment.issueDescription;
        kYCformIssueFragment.logKycHelpful($r3, $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-6$lambda-4  reason: not valid java name */
    public static final void m39494onResume$lambda6$lambda4(KYCformIssueFragment kYCformIssueFragment, View view) {
        Log_OC.getArray(kYCformIssueFragment, "this$0");
        String $r3 = kYCformIssueFragment.issueType;
        String $r1 = kYCformIssueFragment.issueDescription;
        kYCformIssueFragment.logKycHelpful($r3, $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-6$lambda-5  reason: not valid java name */
    public static final void m39495onResume$lambda6$lambda5(KYCformIssueFragment kYCformIssueFragment, View view) {
        Log_OC.getArray(kYCformIssueFragment, "this$0");
        String $r3 = kYCformIssueFragment.issueType;
        String $r1 = kYCformIssueFragment.issueDescription;
        kYCformIssueFragment.logHelpless($r3, $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39496onViewCreated$lambda2$lambda1(IssueActivity issueActivity, View view) {
        Log_OC.getArray(issueActivity, "$this_apply");
        int $i1 = C0214R.color.colorPrimary;
        int $i0 = C0214R.color.white;
        issueActivity.setToolBarColor($i1, $i0);
        issueActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showFeedbackScreen() {
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r4;
        }
        IssueActivity $r3 = (IssueActivity) $r2;
        KYCformIssueFragment$showFeedbackScreen$1 $r1 = new KYCformIssueFragment$showFeedbackScreen$1(this);
        $r3.showTicketResponse("Feedback submitted", "Thank you for your feedback", "Go back", true, $r1);
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
    public FragmentKycformIssueBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentKycformIssueBinding $r3 = (FragmentKycformIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentKycformIssueBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentKycformIssueBinding fragmentKycformIssueBinding, Fragment fragment) {
        Log_OC.getArray(fragmentKycformIssueBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentKycformIssueBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentKycformIssueBinding $r4 = (FragmentKycformIssueBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
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
        String $r2 = $r1.getString("TYPE");
        Log_OC.append($r2);
        Log_OC.loadImage($r2, "it.getString(TYPE)!!");
        this.issueType = $r2;
        String $r22 = $r1.getString(DESC);
        Log_OC.append($r22);
        Log_OC.loadImage($r22, "it.getString(DESC)!!");
        this.issueDescription = $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentKycformIssueBinding $r4 = FragmentKycformIssueBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Log_OC.getArray(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        int $i0 = C0214R.C0216id.search_menu;
        MenuItem $r1 = menu.findItem($i0);
        $r1.setVisible(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentKycformIssueBinding $r1 = requireBinding();
        ImageView $r2 = $r1.helpfulImage;
        $r2.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.SettingsActivity.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KYCformIssueFragment $r22 = KYCformIssueFragment.this;
                KYCformIssueFragment.m39493onResume$lambda6$lambda3($r22, view);
            }
        });
        TextView $r4 = $r1.helpfulText;
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.AbstractFilePickerFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KYCformIssueFragment $r22 = KYCformIssueFragment.this;
                KYCformIssueFragment.m39494onResume$lambda6$lambda4($r22, view);
            }
        });
        TextView $r42 = $r1.helplessText;
        $r42.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.AboutFragment$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KYCformIssueFragment $r22 = KYCformIssueFragment.this;
                KYCformIssueFragment.m39495onResume$lambda6$lambda5($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r10;
        }
        final IssueActivity $r4 = (IssueActivity) $r3;
        int $i0 = C0214R.C0216id.toolbar;
        AppCompatActivity r11 = (AppCompatActivity) $r4;
        View $r1 = r11.findViewById($i0);
        Toolbar $r5 = (Toolbar) $r1;
        $r5.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.FilenameDialog$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IssueActivity $r2 = IssueActivity.this;
                KYCformIssueFragment.m39496onViewCreated$lambda2$lambda1($r2, view2);
            }
        });
        $r4.setIconVisibility(false);
        AppCompatActivity r112 = (AppCompatActivity) $r4;
        AbstractC0925a $r7 = r112.getSupportActionBar();
        if ($r7 != null) {
            $r7.mo37631C("KYC Form Issue");
        }
        int $i02 = C0214R.color.white;
        int $i1 = C0214R.color.blackDatePickerTextColor;
        $r4.setToolBarColor($i02, $i1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentKycformIssueBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentKycformIssueBinding $r3 = (FragmentKycformIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentKycformIssueBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }
}
