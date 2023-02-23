package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentCreateVoucherSenderInfoBinding;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherSenderPresenter;
import ai.kudi.agent.voucher.cashin.view.CashInSenderView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateVoucherSenderInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001-B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\t\u0010'\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010,\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006."}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/ui/CreateVoucherSenderInfoFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/voucher/cashin/view/CashInSenderView;", "Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherSenderPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentCreateVoucherSenderInfoBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentCreateVoucherSenderInfoBinding;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "getRequest", "()Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "setRequest", "(Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherSenderPresenter;", "setThisPresenter", "(Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherSenderPresenter;)V", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "requireBinding", "senderNameError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "senderPhoneError", "showError", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherSenderInfoFragment */
/* loaded from: classes.dex */
public final class CreateVoucherSenderInfoFragment extends AbstractC9412c<CashInSenderView, CreateVoucherSenderPresenter> implements CashInSenderView, BaseViewBinder<FragmentCreateVoucherSenderInfoBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentCreateVoucherSenderInfoBinding> $$delegate_0;
    private VoucherCashInRequest request;
    public CreateVoucherSenderPresenter thisPresenter;

    /* compiled from: CreateVoucherSenderInfoFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/ui/CreateVoucherSenderInfoFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/voucher/cashin/ui/CreateVoucherSenderInfoFragment;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherSenderInfoFragment$Companion */
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
        public final CreateVoucherSenderInfoFragment newInstance(VoucherCashInRequest voucherCashInRequest) {
            CreateVoucherSenderInfoFragment r5 = new CreateVoucherSenderInfoFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(TransferSummaryFragment.TRANSFER_SUMMARY_ARGS, voucherCashInRequest);
            C13666w c13666w = C13666w.f30112a;
            CreateVoucherSenderInfoFragment r7 = r5;
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
    public CreateVoucherSenderInfoFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final CreateVoucherSenderInfoFragment newInstance(VoucherCashInRequest voucherCashInRequest) {
        Companion $r0 = Companion;
        CreateVoucherSenderInfoFragment $r1 = $r0.newInstance(voucherCashInRequest);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-6$lambda-4  reason: not valid java name */
    public static final void m41711onActivityCreated$lambda6$lambda4(CreateVoucherSenderInfoFragment createVoucherSenderInfoFragment, View view) {
        Log_OC.getArray(createVoucherSenderInfoFragment, "this$0");
        CreateVoucherSenderPresenter $r2 = createVoucherSenderInfoFragment.getThisPresenter();
        VoucherCashInRequest $r3 = createVoucherSenderInfoFragment.getRequest();
        $r2.navigateToAmountPage($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-6$lambda-5  reason: not valid java name */
    public static final void m41712onActivityCreated$lambda6$lambda5(CreateVoucherSenderInfoFragment createVoucherSenderInfoFragment, FragmentCreateVoucherSenderInfoBinding fragmentCreateVoucherSenderInfoBinding, View view) {
        Log_OC.getArray(createVoucherSenderInfoFragment, "this$0");
        Log_OC.getArray(fragmentCreateVoucherSenderInfoBinding, "$this_apply");
        CreateVoucherSenderPresenter $r3 = createVoucherSenderInfoFragment.getThisPresenter();
        KudiInputField $r4 = fragmentCreateVoucherSenderInfoBinding.senderPhoneEditText;
        String $r5 = $r4.getText();
        KudiInputField $r42 = fragmentCreateVoucherSenderInfoBinding.senderNameEditText;
        String $r6 = $r42.getText();
        VoucherCashInRequest $r7 = createVoucherSenderInfoFragment.getRequest();
        $r3.navigateToVoucherCreationPage($r5, $r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public CreateVoucherSenderPresenter createPresenter() {
        CreateVoucherSenderPresenter $r1 = getThisPresenter();
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
    public FragmentCreateVoucherSenderInfoBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentCreateVoucherSenderInfoBinding $r3 = (FragmentCreateVoucherSenderInfoBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentCreateVoucherSenderInfoBinding $r1 = getBinding();
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
    public final CreateVoucherSenderPresenter getThisPresenter() {
        CreateVoucherSenderPresenter $r1 = this.thisPresenter;
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
    public View initBinding(FragmentCreateVoucherSenderInfoBinding fragmentCreateVoucherSenderInfoBinding, Fragment fragment) {
        Log_OC.getArray(fragmentCreateVoucherSenderInfoBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentCreateVoucherSenderInfoBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentCreateVoucherSenderInfoBinding $r4 = (FragmentCreateVoucherSenderInfoBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        final FragmentCreateVoucherSenderInfoBinding $r3 = requireBinding();
        VoucherCashInRequest $r4 = getRequest();
        if ($r4 != null) {
            int $i0 = $r4.getAmount();
            if ($i0 != 0) {
                TextView $r5 = $r3.amountTextView;
                C11780a0 c11780a0 = C11780a0.f26475a;
                CreateVoucherSenderInfoFragment r19 = this;
                Resources $r7 = r19.getResources();
                String $r8 = $r7.getString(C0001R.string.total_amount_processed);
                Log_OC.loadImage($r8, "resources.getString(R.string.total_amount_processed)");
                Locale $r9 = Locale.US;
                NumberFormat $r10 = NumberFormat.getNumberInstance($r9);
                int $i02 = $r4.getAmount();
                Integer $r11 = Integer.valueOf($i02);
                String $r12 = $r10.format($r11);
                Object[] $r1 = {$r12};
                String $r82 = String.format($r8, Arrays.copyOf($r1, 1));
                Log_OC.loadImage($r82, "java.lang.String.format(format, *args)");
                $r5.setText($r82);
            }
            String $r83 = $r4.getRecipientPhoneNumber();
            if ($r83 != null) {
                TextView $r52 = $r3.recipientTextView;
                $r52.setText($r83);
            }
            String $r84 = $r4.getSenderName();
            if ($r84 != null) {
                KudiInputField $r13 = $r3.senderNameEditText;
                $r13.setText($r84);
            }
            String $r85 = $r4.getSenderPhoneNumber();
            if ($r85 != null) {
                KudiInputField $r132 = $r3.senderPhoneEditText;
                $r132.setText($r85);
            }
        }
        TextView $r53 = $r3.editLabelTextView;
        $r53.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.voucher.cashin.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateVoucherSenderInfoFragment $r2 = CreateVoucherSenderInfoFragment.this;
                CreateVoucherSenderInfoFragment.m41711onActivityCreated$lambda6$lambda4($r2, view);
            }
        });
        ViewGroup $r15 = $r3.continueButton;
        ViewGroup r20 = $r15;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.voucher.cashin.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateVoucherSenderInfoFragment $r2 = CreateVoucherSenderInfoFragment.this;
                FragmentCreateVoucherSenderInfoBinding $r32 = $r3;
                CreateVoucherSenderInfoFragment.m41712onActivityCreated$lambda6$lambda5($r2, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        CreateVoucherSenderInfoFragment r7 = this;
        super.onAttach(context);
        CreateVoucherSenderInfoFragment r72 = this;
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
        VoucherCashInRequest $r2;
        super.onCreate(bundle);
        CreateVoucherSenderInfoFragment r4 = this;
        Bundle $r1 = r4.getArguments();
        if ($r1 == null) {
            $r2 = null;
        } else {
            Parcelable $r3 = $r1.getParcelable(TransferSummaryFragment.TRANSFER_SUMMARY_ARGS);
            $r2 = (VoucherCashInRequest) $r3;
        }
        this.request = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentCreateVoucherSenderInfoBinding $r4 = FragmentCreateVoucherSenderInfoBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        CreateVoucherSenderInfoFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentCreateVoucherSenderInfoBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentCreateVoucherSenderInfoBinding $r3 = (FragmentCreateVoucherSenderInfoBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentCreateVoucherSenderInfoBinding $r1 = requireBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.CashInSenderView
    public void senderNameError(String str) {
        FragmentCreateVoucherSenderInfoBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.senderNameEditText;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.CashInSenderView
    public void senderPhoneError(String str) {
        FragmentCreateVoucherSenderInfoBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.senderPhoneEditText;
        $r3.setError(str);
    }

    public final void setRequest(VoucherCashInRequest voucherCashInRequest) {
        this.request = voucherCashInRequest;
    }

    public final void setThisPresenter(CreateVoucherSenderPresenter createVoucherSenderPresenter) {
        Log_OC.getArray(createVoucherSenderPresenter, "<set-?>");
        this.thisPresenter = createVoucherSenderPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.CashInSenderView
    public void showError(String str) {
        CreateVoucherSenderInfoFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }
}
