package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentCreateVoucherRecipientInfoFragmentBinding;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherRecipientPresenter;
import ai.kudi.agent.voucher.cashin.view.CashInRecipientView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateVoucherRecipientInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00013B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\t\u0010-\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00101\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00102\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00064"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/ui/CreateVoucherRecipientInfoFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/voucher/cashin/view/CashInRecipientView;", "Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherRecipientPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentCreateVoucherRecipientInfoFragmentBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentCreateVoucherRecipientInfoFragmentBinding;", "isFromSummary", "", "()Ljava/lang/Boolean;", "setFromSummary", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "getRequest", "()Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "setRequest", "(Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherRecipientPresenter;", "setThisPresenter", "(Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherRecipientPresenter;)V", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "requireBinding", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showRecipientNameError", "showRecipientPhoneError", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherRecipientInfoFragment */
/* loaded from: classes.dex */
public final class CreateVoucherRecipientInfoFragment extends AbstractC9412c<CashInRecipientView, CreateVoucherRecipientPresenter> implements CashInRecipientView, BaseViewBinder<FragmentCreateVoucherRecipientInfoFragmentBinding> {
    public static final Companion Companion;
    public static final String IS_CREATE_VOUCHER_FROM_SUMMARY_ARGS = "IS_CREATE_VOUCHER_FROM_SUMMARY_ARGS";
    private final /* synthetic */ BaseViewBinderImpl<FragmentCreateVoucherRecipientInfoFragmentBinding> $$delegate_0;
    private Boolean isFromSummary;
    private VoucherCashInRequest request;
    public CreateVoucherRecipientPresenter thisPresenter;

    /* compiled from: CreateVoucherRecipientInfoFragment.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/ui/CreateVoucherRecipientInfoFragment$Companion;", "", "()V", CreateVoucherRecipientInfoFragment.IS_CREATE_VOUCHER_FROM_SUMMARY_ARGS, "", "newInstance", "Lai/kudi/agent/voucher/cashin/ui/CreateVoucherRecipientInfoFragment;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "isFromSummary", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherRecipientInfoFragment$Companion */
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
        public static /* synthetic */ CreateVoucherRecipientInfoFragment newInstance$default(Companion companion, VoucherCashInRequest $r2, boolean $z0, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = null;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            CreateVoucherRecipientInfoFragment $r0 = companion.newInstance($r2, $z0);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreateVoucherRecipientInfoFragment newInstance(VoucherCashInRequest voucherCashInRequest, boolean z) {
            CreateVoucherRecipientInfoFragment r5 = new CreateVoucherRecipientInfoFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(TransferSummaryFragment.TRANSFER_SUMMARY_ARGS, voucherCashInRequest);
            r6.putBoolean(CreateVoucherRecipientInfoFragment.IS_CREATE_VOUCHER_FROM_SUMMARY_ARGS, z);
            C13666w c13666w = C13666w.f30112a;
            CreateVoucherRecipientInfoFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
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
    public CreateVoucherRecipientInfoFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final CreateVoucherRecipientInfoFragment newInstance(VoucherCashInRequest voucherCashInRequest, boolean z) {
        Companion $r0 = Companion;
        CreateVoucherRecipientInfoFragment $r1 = $r0.newInstance(voucherCashInRequest, z);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41710onActivityCreated$lambda4$lambda3(CreateVoucherRecipientInfoFragment createVoucherRecipientInfoFragment, FragmentCreateVoucherRecipientInfoFragmentBinding fragmentCreateVoucherRecipientInfoFragmentBinding, View view) {
        Log_OC.getArray(createVoucherRecipientInfoFragment, "this$0");
        Log_OC.getArray(fragmentCreateVoucherRecipientInfoFragmentBinding, "$this_apply");
        CreateVoucherRecipientPresenter $r3 = createVoucherRecipientInfoFragment.getThisPresenter();
        KudiInputField $r4 = fragmentCreateVoucherRecipientInfoFragmentBinding.recipientPhoneEditText;
        String $r5 = $r4.getText();
        KudiInputField $r42 = fragmentCreateVoucherRecipientInfoFragmentBinding.recipientPhoneEditText;
        String $r6 = $r42.getText();
        VoucherCashInRequest $r7 = createVoucherRecipientInfoFragment.getRequest();
        Boolean $r8 = createVoucherRecipientInfoFragment.isFromSummary();
        boolean $z0 = $r8 == null ? false : $r8.booleanValue();
        $r3.voucherRequest($r5, $r6, $r7, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public CreateVoucherRecipientPresenter createPresenter() {
        CreateVoucherRecipientPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentCreateVoucherRecipientInfoFragmentBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentCreateVoucherRecipientInfoFragmentBinding $r3 = (FragmentCreateVoucherRecipientInfoFragmentBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentCreateVoucherRecipientInfoFragmentBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VoucherCashInRequest getRequest() {
        VoucherCashInRequest r1 = this.request;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CreateVoucherRecipientPresenter getThisPresenter() {
        CreateVoucherRecipientPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentCreateVoucherRecipientInfoFragmentBinding fragmentCreateVoucherRecipientInfoFragmentBinding, Fragment fragment) {
        Log_OC.getArray(fragmentCreateVoucherRecipientInfoFragmentBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentCreateVoucherRecipientInfoFragmentBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentCreateVoucherRecipientInfoFragmentBinding $r4 = (FragmentCreateVoucherRecipientInfoFragmentBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isFromSummary() {
        Boolean r1 = this.isFromSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        final FragmentCreateVoucherRecipientInfoFragmentBinding $r2 = requireBinding();
        ViewGroup $r3 = $r2.recipientPhoneEditText;
        ViewGroup r10 = $r3;
        r10.requestFocus();
        CreateVoucherRecipientInfoFragment r11 = this;
        FragmentActivity $r4 = r11.getActivity();
        if ($r4 != null) {
            View $r32 = $r2.recipientPhoneEditText;
            Log_OC.loadImage($r32, "recipientPhoneEditText");
            View r12 = $r32;
            ContextExtKt.showKeyboard($r4, r12);
        }
        VoucherCashInRequest $r5 = getRequest();
        if ($r5 != null) {
            String $r6 = $r5.getRecipientPhoneNumber();
            if ($r6 != null) {
                KudiInputField $r33 = $r2.recipientPhoneEditText;
                $r33.setText($r6);
            }
            String $r62 = $r5.getRecipientName();
            if ($r62 != null) {
                KudiInputField $r34 = $r2.recipientPhoneEditText;
                $r34.setText($r62);
            }
        }
        ViewGroup $r7 = $r2.continueButton;
        ViewGroup r102 = $r7;
        r102.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.voucher.cashin.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateVoucherRecipientInfoFragment $r22 = CreateVoucherRecipientInfoFragment.this;
                FragmentCreateVoucherRecipientInfoFragmentBinding $r35 = $r2;
                CreateVoucherRecipientInfoFragment.m41710onActivityCreated$lambda4$lambda3($r22, $r35, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        CreateVoucherRecipientInfoFragment r7 = this;
        super.onAttach(context);
        CreateVoucherRecipientInfoFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transfer.ui.TransferActivity");
            throw r6;
        }
        TransferActivity $r3 = (TransferActivity) $r2;
        MainTransferSubComponent $r4 = $r3.getTransferSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        VoucherCashInRequest $r3;
        super.onCreate(bundle);
        CreateVoucherRecipientInfoFragment r5 = this;
        Bundle $r1 = r5.getArguments();
        Boolean $r2 = null;
        if ($r1 == null) {
            $r3 = null;
        } else {
            Parcelable $r4 = $r1.getParcelable(TransferSummaryFragment.TRANSFER_SUMMARY_ARGS);
            $r3 = (VoucherCashInRequest) $r4;
        }
        this.request = $r3;
        CreateVoucherRecipientInfoFragment r52 = this;
        Bundle $r12 = r52.getArguments();
        if ($r12 != null) {
            boolean $z0 = $r12.getBoolean(IS_CREATE_VOUCHER_FROM_SUMMARY_ARGS);
            $r2 = Boolean.valueOf($z0);
        }
        this.isFromSummary = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentCreateVoucherRecipientInfoFragmentBinding $r4 = FragmentCreateVoucherRecipientInfoFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        CreateVoucherRecipientInfoFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentCreateVoucherRecipientInfoFragmentBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentCreateVoucherRecipientInfoFragmentBinding $r3 = (FragmentCreateVoucherRecipientInfoFragmentBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentCreateVoucherRecipientInfoFragmentBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFromSummary(Boolean bool) {
        this.isFromSummary = bool;
    }

    public final void setRequest(VoucherCashInRequest voucherCashInRequest) {
        this.request = voucherCashInRequest;
    }

    public final void setThisPresenter(CreateVoucherRecipientPresenter createVoucherRecipientPresenter) {
        Log_OC.getArray(createVoucherRecipientPresenter, "<set-?>");
        this.thisPresenter = createVoucherRecipientPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.CashInRecipientView
    public void showError(String str) {
        CreateVoucherRecipientInfoFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.CashInRecipientView
    public void showRecipientNameError(String str) {
        FragmentCreateVoucherRecipientInfoFragmentBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.recipientNameEditText;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.CashInRecipientView
    public void showRecipientPhoneError(String str) {
        FragmentCreateVoucherRecipientInfoFragmentBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.recipientPhoneEditText;
        $r3.setError(str);
    }
}
