package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentBusinessTypeDescriptionBinding;
import ai.kudi.agent.register.adapter.AccountTypePossibilitiesAdapter;
import ai.kudi.agent.register.data.models.AccountTypeUiInfo;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BusinessTypeDescriptionFragment.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0001H\u0096\u0001J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\t\u0010\u0018\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/register/ui/BusinessTypeDescriptionFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentBusinessTypeDescriptionBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentBusinessTypeDescriptionBinding;", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "initBinding", "Landroid/view/View;", "fragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.BusinessTypeDescriptionFragment */
/* loaded from: classes.dex */
public final class BusinessTypeDescriptionFragment extends Fragment implements BaseViewBinder<FragmentBusinessTypeDescriptionBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentBusinessTypeDescriptionBinding> $$delegate_0;
    private RegistrationInfo registrationInfo;

    /* compiled from: BusinessTypeDescriptionFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/register/ui/BusinessTypeDescriptionFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/register/ui/BusinessTypeDescriptionFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.BusinessTypeDescriptionFragment$Companion */
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
        public final BusinessTypeDescriptionFragment newInstance(RegistrationInfo registrationInfo) {
            BusinessTypeDescriptionFragment $r1 = new BusinessTypeDescriptionFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable("REG_INFO", registrationInfo);
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
    public BusinessTypeDescriptionFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final BusinessTypeDescriptionFragment newInstance(RegistrationInfo registrationInfo) {
        Companion $r0 = Companion;
        BusinessTypeDescriptionFragment $r1 = $r0.newInstance(registrationInfo);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40375onViewCreated$lambda4$lambda3$lambda2$lambda1(BusinessTypeDescriptionFragment businessTypeDescriptionFragment, View view) {
        Log_OC.getArray(businessTypeDescriptionFragment, "this$0");
        FragmentActivity $r0 = businessTypeDescriptionFragment.requireActivity();
        boolean $z0 = $r0 instanceof RegisterActivity;
        RegisterActivity $r3 = $z0 ? (RegisterActivity) $r0 : null;
        if ($r3 == null) {
            return;
        }
        RegistrationInfo $r4 = businessTypeDescriptionFragment.registrationInfo;
        $r3.toBusinessInformationView($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBusinessTypeDescriptionBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentBusinessTypeDescriptionBinding $r3 = (FragmentBusinessTypeDescriptionBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentBusinessTypeDescriptionBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentBusinessTypeDescriptionBinding fragmentBusinessTypeDescriptionBinding, Fragment fragment) {
        Log_OC.getArray(fragmentBusinessTypeDescriptionBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentBusinessTypeDescriptionBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentBusinessTypeDescriptionBinding $r4 = (FragmentBusinessTypeDescriptionBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
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
        Parcelable $r2 = $r1.getParcelable("REG_INFO");
        RegistrationInfo $r3 = (RegistrationInfo) $r2;
        this.registrationInfo = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentBusinessTypeDescriptionBinding $r4 = FragmentBusinessTypeDescriptionBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AccountType $r4;
        Log_OC.getArray(view, "view");
        RegistrationInfo $r3 = this.registrationInfo;
        if ($r3 == null || ($r4 = $r3.getAccountType()) == null) {
            return;
        }
        AccountTypeUiInfo.Companion $r5 = AccountTypeUiInfo.Companion;
        AccountTypeUiInfo $r6 = $r5.getAccountTypeInfo($r4);
        FragmentBusinessTypeDescriptionBinding $r7 = requireBinding();
        if ($r6 == null) {
            return;
        }
        TextView $r8 = $r7.descriptionView;
        int $i0 = $r6.getDescriptionText();
        String $r9 = getString($i0);
        $r8.setText($r9);
        TextView $r82 = $r7.whatYouCanDoHeader;
        int $i02 = $r6.getWhatYouCanDoHeader();
        String $r92 = getString($i02);
        $r82.setText($r92);
        TextView $r83 = $r7.tipView;
        int $i03 = $r6.getBottomText();
        String $r93 = getString($i03);
        $r83.setText($r93);
        RecyclerView $r10 = $r7.whatYouCanDoRv;
        List $r12 = $r6.getAccountTypePossibilities();
        AccountTypePossibilitiesAdapter r15 = new AccountTypePossibilitiesAdapter($r12);
        $r10.setAdapter(r15);
        ViewGroup $r13 = $r7.continueButton;
        ViewGroup r17 = $r13;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BusinessTypeDescriptionFragment $r2 = BusinessTypeDescriptionFragment.this;
                BusinessTypeDescriptionFragment.m40375onViewCreated$lambda4$lambda3$lambda2$lambda1($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBusinessTypeDescriptionBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentBusinessTypeDescriptionBinding $r3 = (FragmentBusinessTypeDescriptionBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentBusinessTypeDescriptionBinding $r1 = requireBinding();
        return $r1;
    }
}
