package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.databinding.FragmentP2pSummaryBinding;
import ai.kudi.agent.kshock.data.domain.fht.TransactionResponse;
import ai.kudi.agent.p2p.data.P2pData;
import ai.kudi.agent.p2p.viewmodels.P2pSummaryViewData;
import ai.kudi.agent.p2p.viewmodels.P2pSummaryViewModel;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactionstatus.summary.adapter.SummaryAdapter;
import ai.kudi.agent.transactionstatus.summary.model.SummaryModel;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: P2pSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/p2p/fragments/P2pSummaryFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/p2p/viewmodels/P2pSummaryViewModel;", "Lai/kudi/agent/p2p/viewmodels/P2pSummaryViewData;", "Lai/kudi/agent/databinding/FragmentP2pSummaryBinding;", "()V", "p2pData", "Lai/kudi/agent/p2p/data/P2pData;", "p2pSummaryViewModel", "getP2pSummaryViewModel", "()Lai/kudi/agent/p2p/viewmodels/P2pSummaryViewModel;", "setP2pSummaryViewModel", "(Lai/kudi/agent/p2p/viewmodels/P2pSummaryViewModel;)V", "transferActivity", "Lai/kudi/agent/transfer/ui/TransferActivity;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class P2pSummaryFragment extends BaseMVVMViewBindingFragment<P2pSummaryViewModel, P2pSummaryViewData, FragmentP2pSummaryBinding> {
    public static final Companion Companion;
    private P2pData p2pData;
    public P2pSummaryViewModel p2pSummaryViewModel;
    private TransferActivity transferActivity;

    /* compiled from: P2pSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/p2p/fragments/P2pSummaryFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/p2p/fragments/P2pSummaryFragment;", "p2pData", "Lai/kudi/agent/p2p/data/P2pData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final P2pSummaryFragment newInstance(P2pData p2pData) {
            Log_OC.getArray(p2pData, "p2pData");
            P2pSummaryFragment $r3 = new P2pSummaryFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable("P2P_DATA", p2pData);
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
    public static final P2pSummaryFragment newInstance(P2pData p2pData) {
        Companion $r0 = Companion;
        P2pSummaryFragment $r1 = $r0.newInstance(p2pData);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m39992onViewCreated$lambda3(final P2pSummaryFragment p2pSummaryFragment, View view) {
        Log_OC.getArray(p2pSummaryFragment, "this$0");
        FragmentManager $r4 = p2pSummaryFragment.getChildFragmentManager();
        PreferenceActivity $r5 = p2pSummaryFragment.getViewLifecycleOwner();
        $r4.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r5, new InterfaceC1523w() { // from class: ai.kudi.agent.p2p.fragments.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38670c(String str, Bundle bundle) {
                P2pSummaryFragment $r3 = P2pSummaryFragment.this;
                P2pSummaryFragment.m39993onViewCreated$lambda3$lambda2($r3, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r6 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r42 = p2pSummaryFragment.getChildFragmentManager();
        ((Chapter) $r6).show($r42, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39993onViewCreated$lambda3$lambda2(P2pSummaryFragment p2pSummaryFragment, String str, Bundle bundle) {
        Log_OC.getArray(p2pSummaryFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY);
        if ($z0) {
            String $r1 = bundle.getString(KudiPin.PASSWORD_KEY);
            P2pData $r3 = p2pSummaryFragment.p2pData;
            if ($r3 != null) {
                $r3.setPin($r1);
            }
            P2pData $r32 = p2pSummaryFragment.p2pData;
            if ($r32 == null) {
                return;
            }
            P2pSummaryViewModel $r4 = p2pSummaryFragment.getP2pSummaryViewModel();
            $r4.fireP2pTransaction($r32);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        P2pSummaryViewData $r2 = (P2pSummaryViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(P2pSummaryViewData p2pSummaryViewData) {
        Log_OC.getArray(p2pSummaryViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentP2pSummaryBinding fragmentP2pSummaryBinding = (FragmentP2pSummaryBinding) $r2;
        boolean $z0 = p2pSummaryViewData.isSending();
        if ($z0) {
            KudiButton $r4 = fragmentP2pSummaryBinding.p2pSummarySendButton;
            $r4.m38032f();
        } else {
            KudiButton $r42 = fragmentP2pSummaryBinding.p2pSummarySendButton;
            $r42.m38033e();
        }
        TransactionResponse $r5 = p2pSummaryViewData.getTransactionResponse();
        if ($r5 != null) {
            SuccessScreenDialogFragment.Companion $r6 = SuccessScreenDialogFragment.Companion;
            String $r8 = getString(C0001R.string.transaction_successful);
            Log_OC.loadImage($r8, "getString(R.string.transaction_successful)");
            String $r9 = $r5.getReference() != null ? getString(C0001R.string.view_transaction) : getString(C0001R.string.send_more);
            Log_OC.loadImage($r9, "if (it.reference != null) {\n                                getString(R.string.view_transaction)\n                            } else {\n                                getString(R.string.send_more)\n                            }");
            SuccessScreenCustomOption $r7 = new SuccessScreenCustomOption($r8, "", $r9, false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_successful_transaction_status, 0, false, 7160, null);
            P2pSummaryFragment$applyViewData$1$1$1$1 $r10 = new P2pSummaryFragment$applyViewData$1$1$1$1($r5, this);
            SuccessScreenDialogFragment $r11 = $r6.newInstance($r7, $r10);
            FragmentManager $r12 = getChildFragmentManager();
            $r11.show($r12, SuccessScreenDialogFragment.class.getCanonicalName());
        }
        String $r82 = p2pSummaryViewData.getError();
        if ($r82 == null) {
            return;
        }
        SuccessScreenDialogFragment.Companion $r62 = SuccessScreenDialogFragment.Companion;
        String $r92 = getString(C0001R.string.transaction_failed);
        String $r14 = getString(C0001R.string.go_back);
        Log_OC.loadImage($r92, "getString(R.string.transaction_failed)");
        Log_OC.loadImage($r14, "getString(R.string.go_back)");
        SuccessScreenCustomOption $r72 = new SuccessScreenCustomOption($r92, $r82, $r14, true, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_failed_transaction_status, 0, false, 7152, null);
        SuccessScreenDialogFragment $r112 = $r62.newInstance($r72);
        FragmentManager $r122 = getChildFragmentManager();
        $r112.show($r122, SuccessScreenDialogFragment.class.getCanonicalName());
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        P2pSummaryViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public P2pSummaryViewModel createViewModel() {
        P2pSummaryViewModel $r1 = getP2pSummaryViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final P2pSummaryViewModel getP2pSummaryViewModel() {
        P2pSummaryViewModel $r1 = this.p2pSummaryViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("p2pSummaryViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return P2pSummaryViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        MainTransferSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof TransferActivity;
        if ($z0) {
            TransferActivity $r3 = (TransferActivity) context;
            this.transferActivity = $r3;
            if ($r3 == null || ($r1 = $r3.getTransferSubComponent()) == null) {
                return;
            }
            $r1.inject(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentP2pSummaryBinding $r4 = FragmentP2pSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        P2pData $r4;
        Integer $r9;
        Integer $r92;
        List $r10;
        Integer $r93;
        Integer $r3;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = getArguments();
        Integer $r32 = null;
        if ($r2 == null) {
            $r4 = null;
        } else {
            Parcelable $r5 = $r2.getParcelable("P2P_DATA");
            $r4 = (P2pData) $r5;
        }
        this.p2pData = $r4;
        SummaryModel[] $r6 = new SummaryModel[3];
        String $r8 = $r4 == null ? null : $r4.getPhoneNumber();
        Log_OC.append($r8);
        SummaryModel r19 = new SummaryModel("Receiver’s Phone Number", $r8, true, null, 8, null);
        int $i0 = 0;
        $r6[0] = r19;
        P2pData $r42 = this.p2pData;
        int $i1 = ($r42 == null || ($r9 = $r42.getAmount()) == null) ? 0 : $r9.intValue();
        SummaryModel r192 = new SummaryModel("Transfer Amount:", StringExtKt.getFormatAmount($i1), true, null, 8, null);
        $r6[1] = r192;
        P2pData $r43 = this.p2pData;
        int $i12 = ($r43 == null || ($r92 = $r43.getCharges()) == null) ? 0 : $r92.intValue();
        SummaryModel r193 = new SummaryModel("Nomba Charge", StringExtKt.getFormatAmount($i12), false, null, 8, null);
        $r6[2] = r193;
        $r10 = C13726r.m3888h($r6);
        SummaryAdapter r20 = new SummaryAdapter();
        InterfaceC8209a $r12 = requireBinding();
        FragmentP2pSummaryBinding $r13 = (FragmentP2pSummaryBinding) $r12;
        RecyclerView $r14 = $r13.p2pSummaryRv;
        $r14.setAdapter(r20);
        r20.setSummaryList($r10);
        P2pSummaryFragment$onViewCreated$1 r21 = new P2pSummaryFragment$onViewCreated$1(this);
        r20.setOnClickListener(r21);
        InterfaceC8209a $r122 = requireBinding();
        FragmentP2pSummaryBinding $r132 = (FragmentP2pSummaryBinding) $r122;
        KudiButton $r16 = $r132.p2pSummarySendButton;
        StringBuilder r22 = new StringBuilder();
        r22.append("Send ");
        P2pData $r44 = this.p2pData;
        if ($r44 != null && ($r93 = $r44.getAmount()) != null) {
            int $i13 = $r93.intValue();
            P2pData $r45 = this.p2pData;
            if ($r45 != null && ($r3 = $r45.getCharges()) != null) {
                $i0 = $r3.intValue();
            }
            $r32 = Integer.valueOf($i13 + $i0);
        }
        Log_OC.append($r32);
        r22.append(StringExtKt.getFormatAmount($r32.intValue()));
        r22.append(' ');
        $r16.setText(r22.toString());
        InterfaceC8209a $r123 = requireBinding();
        FragmentP2pSummaryBinding $r133 = (FragmentP2pSummaryBinding) $r123;
        ViewGroup $r162 = $r133.p2pSummarySendButton;
        ViewGroup r24 = $r162;
        r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.p2p.fragments.BrowseFragment$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P2pSummaryFragment $r22 = P2pSummaryFragment.this;
                P2pSummaryFragment.m39992onViewCreated$lambda3($r22, view2);
            }
        });
    }

    public final void setP2pSummaryViewModel(P2pSummaryViewModel p2pSummaryViewModel) {
        Log_OC.getArray(p2pSummaryViewModel, "<set-?>");
        this.p2pSummaryViewModel = p2pSummaryViewModel;
    }
}
