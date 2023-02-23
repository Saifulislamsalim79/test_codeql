package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssuesTermsAndConditionsBinding;
import ai.kudi.agent.issues.p008ui.viewModels.TermsAndAndConditionsViewModel;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.settings.tandc.DisplayTermsAdapter;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import dagger.android.p197e.C7429a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
import p201g.p270x.InterfaceC8209a;
/* compiled from: IssuesTermsAndConditionsFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssuesTermsAndConditionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/TermsAndAndConditionsViewModel;", "Lai/kudi/agent/issues/ui/viewModels/TermsAndAndConditionsViewModel$TermsAndConditionsViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssuesTermsAndConditionsBinding;", "()V", "listener", "Lai/kudi/agent/issues/ui/IssuesTermsAndConditionsFragment$OnFragmentCallBack;", "termsAndAndConditionsViewModel", "getTermsAndAndConditionsViewModel", "()Lai/kudi/agent/issues/ui/viewModels/TermsAndAndConditionsViewModel;", "setTermsAndAndConditionsViewModel", "(Lai/kudi/agent/issues/ui/viewModels/TermsAndAndConditionsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "OnFragmentCallBack", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssuesTermsAndConditionsFragment */
/* loaded from: classes.dex */
public final class IssuesTermsAndConditionsFragment extends BaseMVVMViewBindingFragment<TermsAndAndConditionsViewModel, TermsAndAndConditionsViewModel.TermsAndConditionsViewData, FragmentIssuesTermsAndConditionsBinding> {
    private OnFragmentCallBack listener;
    public TermsAndAndConditionsViewModel termsAndAndConditionsViewModel;

    /* compiled from: IssuesTermsAndConditionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssuesTermsAndConditionsFragment$OnFragmentCallBack;", "", "setTitle", "", KudiPin.KUDI_PIN_TITLE, "", "setToolBarColor", "toolBarColor", "", "textColor", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssuesTermsAndConditionsFragment$OnFragmentCallBack */
    /* loaded from: classes.dex */
    public interface OnFragmentCallBack {
        void setTitle(String str);

        void setToolBarColor(int i, int i2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        TermsAndAndConditionsViewModel.TermsAndConditionsViewData $r2 = (TermsAndAndConditionsViewModel.TermsAndConditionsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(TermsAndAndConditionsViewModel.TermsAndConditionsViewData termsAndConditionsViewData) {
        String $r4;
        String $r42;
        Log_OC.getArray(termsAndConditionsViewData, "viewData");
        int $i0 = C0214R.string.signed_by_text;
        Object[] $r2 = new Object[3];
        String $r3 = termsAndConditionsViewData.getFirstName();
        String $r43 = $r3;
        if ($r3 == null) {
            $r43 = null;
        } else {
            int $i1 = $r3.length();
            boolean $z0 = $i1 > 0;
            if ($z0) {
                StringBuilder r14 = new StringBuilder();
                char $c2 = $r3.charAt(0);
                boolean $z02 = Character.isLowerCase($c2);
                if ($z02) {
                    Locale $r6 = Locale.getDefault();
                    Log_OC.loadImage($r6, "getDefault()");
                    $r4 = C13252b.m5546d($c2, $r6);
                } else {
                    $r4 = String.valueOf($c2);
                }
                r14.append($r4.toString());
                String $r32 = $r3.substring(1);
                Log_OC.loadImage($r32, "(this as java.lang.String).substring(startIndex)");
                r14.append($r32);
                $r43 = r14.toString();
            }
        }
        $r2[0] = $r43;
        String $r33 = termsAndConditionsViewData.getLastName();
        String $r44 = $r33;
        if ($r33 == null) {
            $r44 = null;
        } else {
            int $i12 = $r33.length();
            boolean $z03 = $i12 > 0;
            if ($z03) {
                StringBuilder r142 = new StringBuilder();
                char $c22 = $r33.charAt(0);
                boolean $z04 = Character.isLowerCase($c22);
                if ($z04) {
                    Locale $r62 = Locale.getDefault();
                    Log_OC.loadImage($r62, "getDefault()");
                    $r42 = C13252b.m5546d($c22, $r62);
                } else {
                    $r42 = String.valueOf($c22);
                }
                r142.append($r42.toString());
                String $r34 = $r33.substring(1);
                Log_OC.loadImage($r34, "(this as java.lang.String).substring(startIndex)");
                r142.append($r34);
                $r44 = r142.toString();
            }
        }
        $r2[1] = $r44;
        String $r35 = termsAndConditionsViewData.getSignUpDate();
        $r2[2] = $r35 == null ? null : StringExtKt.formatDateWithTime$default($r35, null, 1, null);
        SpannableString r15 = new SpannableString(getString($i0, $r2));
        Context $r9 = requireContext();
        Log_OC.loadImage($r9, "requireContext()");
        int $i02 = C0214R.color.black;
        ForegroundColorSpan $r10 = new ForegroundColorSpan(ContextExtKt.getKudiColor($r9, $i02));
        Context $r92 = requireContext();
        Log_OC.loadImage($r92, "requireContext()");
        int $i03 = C0214R.color.black;
        ForegroundColorSpan r16 = new ForegroundColorSpan(ContextExtKt.getKudiColor($r92, $i03));
        if (termsAndConditionsViewData.getFirstName() != null && termsAndConditionsViewData.getLastName() != null && termsAndConditionsViewData.getSignUpDate() != null) {
            int $i04 = termsAndConditionsViewData.getFirstName().length();
            int $i13 = termsAndConditionsViewData.getLastName().length();
            int $i05 = $i04 + $i13 + 1;
            int $i14 = $i05 + 10;
            r15.setSpan($r10, 9, $i14, 17);
            int $i06 = $i05 + 5 + 9;
            int $i15 = StringExtKt.formatDateWithTime$default(termsAndConditionsViewData.getSignUpDate(), null, 1, null).length();
            r15.setSpan(r16, $i06, $i15 + $i06, 17);
        }
        InterfaceC8209a $r11 = requireBinding();
        FragmentIssuesTermsAndConditionsBinding $r12 = (FragmentIssuesTermsAndConditionsBinding) $r11;
        TextView $r13 = $r12.signedByText;
        TextView r17 = $r13;
        r17.setText(r15);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        TermsAndAndConditionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public TermsAndAndConditionsViewModel createViewModel() {
        TermsAndAndConditionsViewModel $r1 = getTermsAndAndConditionsViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TermsAndAndConditionsViewModel getTermsAndAndConditionsViewModel() {
        TermsAndAndConditionsViewModel $r1 = this.termsAndAndConditionsViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("termsAndAndConditionsViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return TermsAndAndConditionsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
        boolean $z0 = context instanceof OnFragmentCallBack;
        if (!$z0) {
            IllegalStateException $r3 = new IllegalStateException("OnFragmentCallBack must be implemented by activity");
            throw $r3;
        }
        OnFragmentCallBack $r2 = (OnFragmentCallBack) context;
        this.listener = $r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentIssuesTermsAndConditionsBinding $r4 = FragmentIssuesTermsAndConditionsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
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
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        OnFragmentCallBack $r3 = this.listener;
        if ($r3 == null) {
            Log_OC.LogError("listener");
            NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
            throw r8;
        }
        int $i0 = C0214R.string.terms_and_conditions_text;
        String $r4 = getString($i0);
        Log_OC.loadImage($r4, "getString(R.string.terms_and_conditions_text)");
        $r3.setTitle($r4);
        OnFragmentCallBack $r32 = this.listener;
        if ($r32 == null) {
            Log_OC.LogError("listener");
            NullPointerException r82 = new NullPointerException("Null throw statement replaced by Soot");
            throw r82;
        }
        int $i02 = C0214R.color.colorPrimary;
        int $i1 = C0214R.color.white;
        $r32.setToolBarColor($i02, $i1);
        InterfaceC8209a $r5 = requireBinding();
        FragmentIssuesTermsAndConditionsBinding $r6 = (FragmentIssuesTermsAndConditionsBinding) $r5;
        WebView $r7 = $r6.kudiTermsWebView;
        $r7.loadUrl(DisplayTermsAdapter.GENERAL_TERM);
    }

    public final void setTermsAndAndConditionsViewModel(TermsAndAndConditionsViewModel termsAndAndConditionsViewModel) {
        Log_OC.getArray(termsAndAndConditionsViewModel, "<set-?>");
        this.termsAndAndConditionsViewModel = termsAndAndConditionsViewModel;
    }
}
