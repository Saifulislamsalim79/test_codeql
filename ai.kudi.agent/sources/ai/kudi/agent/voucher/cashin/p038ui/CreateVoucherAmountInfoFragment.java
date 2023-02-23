package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentCreateVoucherAmountInfoBinding;
import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherAmountPresenter;
import ai.kudi.agent.voucher.cashin.view.CashInAmountView;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateVoucherAmountInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00012B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J$\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\t\u0010,\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u000e\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u000bR\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00063"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/ui/CreateVoucherAmountInfoFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/voucher/cashin/view/CashInAmountView;", "Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherAmountPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentCreateVoucherAmountInfoBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentCreateVoucherAmountInfoBinding;", "isFromSummaryPage", "", "()Ljava/lang/Boolean;", "setFromSummaryPage", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "getRequest", "()Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "setRequest", "(Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherAmountPresenter;", "setThisPresenter", "(Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherAmountPresenter;)V", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "requireBinding", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "toggleNairaColor", "isDark", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherAmountInfoFragment */
/* loaded from: classes.dex */
public final class CreateVoucherAmountInfoFragment extends AbstractC9412c<CashInAmountView, CreateVoucherAmountPresenter> implements CashInAmountView, BaseViewBinder<FragmentCreateVoucherAmountInfoBinding> {
    public static final Companion Companion;
    public static final String IS_CREATE_AMOUNT_FROM_SUMMARY_ARGS = "IS_CREATE_AMOUNT_FROM_SUMMARY_ARGS";
    private final /* synthetic */ BaseViewBinderImpl<FragmentCreateVoucherAmountInfoBinding> $$delegate_0;
    private Boolean isFromSummaryPage;
    private VoucherCashInRequest request;
    public CreateVoucherAmountPresenter thisPresenter;

    /* compiled from: CreateVoucherAmountInfoFragment.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/ui/CreateVoucherAmountInfoFragment$Companion;", "", "()V", CreateVoucherAmountInfoFragment.IS_CREATE_AMOUNT_FROM_SUMMARY_ARGS, "", "newInstance", "Lai/kudi/agent/voucher/cashin/ui/CreateVoucherAmountInfoFragment;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "isFromSummaryPage", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherAmountInfoFragment$Companion */
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
        public static /* synthetic */ CreateVoucherAmountInfoFragment newInstance$default(Companion companion, VoucherCashInRequest voucherCashInRequest, boolean $z0, int i, Object obj) {
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            CreateVoucherAmountInfoFragment $r2 = companion.newInstance(voucherCashInRequest, $z0);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreateVoucherAmountInfoFragment newInstance(VoucherCashInRequest voucherCashInRequest, boolean z) {
            CreateVoucherAmountInfoFragment r5 = new CreateVoucherAmountInfoFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(TransferSummaryFragment.TRANSFER_SUMMARY_ARGS, voucherCashInRequest);
            r6.putBoolean(CreateVoucherAmountInfoFragment.IS_CREATE_AMOUNT_FROM_SUMMARY_ARGS, z);
            C13666w c13666w = C13666w.f30112a;
            CreateVoucherAmountInfoFragment r7 = r5;
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
    public CreateVoucherAmountInfoFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final CreateVoucherAmountInfoFragment newInstance(VoucherCashInRequest voucherCashInRequest, boolean z) {
        Companion $r0 = Companion;
        CreateVoucherAmountInfoFragment $r1 = $r0.newInstance(voucherCashInRequest, z);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-4$lambda-2  reason: not valid java name */
    public static final void m41708onActivityCreated$lambda4$lambda2(CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment, View view) {
        Log_OC.getArray(createVoucherAmountInfoFragment, "this$0");
        CreateVoucherAmountPresenter $r2 = createVoucherAmountInfoFragment.getThisPresenter();
        VoucherCashInRequest $r3 = createVoucherAmountInfoFragment.getRequest();
        $r2.navigateToVoucherRecipientPage($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41709onActivityCreated$lambda4$lambda3(FragmentCreateVoucherAmountInfoBinding fragmentCreateVoucherAmountInfoBinding, CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment, View view) {
        Log_OC.getArray(fragmentCreateVoucherAmountInfoBinding, "$this_apply");
        Log_OC.getArray(createVoucherAmountInfoFragment, "this$0");
        EditText $r4 = fragmentCreateVoucherAmountInfoBinding.amountEditText;
        Editable $r5 = $r4.getText();
        String $r6 = StringExtKt.getRemoveAllLetters($r5.toString());
        CreateVoucherAmountInfoFragment$onActivityCreated$1$6$1 $r1 = new CreateVoucherAmountInfoFragment$onActivityCreated$1$6$1(createVoucherAmountInfoFragment, $r6);
        IntExtKt.transferAmountValidation$default($r6, null, false, 0.0d, 0.0d, $r1, 30, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public CreateVoucherAmountPresenter createPresenter() {
        CreateVoucherAmountPresenter $r1 = getThisPresenter();
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
    public FragmentCreateVoucherAmountInfoBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentCreateVoucherAmountInfoBinding $r3 = (FragmentCreateVoucherAmountInfoBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentCreateVoucherAmountInfoBinding $r1 = getBinding();
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
    public final CreateVoucherAmountPresenter getThisPresenter() {
        CreateVoucherAmountPresenter $r1 = this.thisPresenter;
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
    public View initBinding(FragmentCreateVoucherAmountInfoBinding fragmentCreateVoucherAmountInfoBinding, Fragment fragment) {
        Log_OC.getArray(fragmentCreateVoucherAmountInfoBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentCreateVoucherAmountInfoBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentCreateVoucherAmountInfoBinding $r4 = (FragmentCreateVoucherAmountInfoBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isFromSummaryPage() {
        Boolean r1 = this.isFromSummaryPage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Boolean $r7;
        super.onActivityCreated(bundle);
        final FragmentCreateVoucherAmountInfoBinding $r2 = requireBinding();
        EditText $r3 = $r2.amountEditText;
        if ($r3 != null) {
            $r3.clearFocus();
        }
        EditText $r32 = $r2.amountEditText;
        if ($r32 != null) {
            $r32.requestFocus();
            CreateVoucherAmountInfoFragment r22 = this;
            FragmentActivity $r4 = r22.getActivity();
            if ($r4 != null) {
                ContextExtKt.showKeyboard($r4, $r32);
            }
        }
        CreateVoucherAmountInfoFragment r222 = this;
        Parcelable $r5 = r222.requireArguments().getParcelable(TransferSummaryFragment.TRANSFER_SUMMARY_ARGS);
        setRequest((VoucherCashInRequest) $r5);
        CreateVoucherAmountInfoFragment r223 = this;
        Bundle $r1 = r223.getArguments();
        if ($r1 == null) {
            $r7 = null;
        } else {
            boolean $z0 = $r1.getBoolean(IS_CREATE_AMOUNT_FROM_SUMMARY_ARGS);
            $r7 = Boolean.valueOf($z0);
        }
        setFromSummaryPage($r7);
        VoucherCashInRequest $r6 = getRequest();
        if ($r6 != null) {
            TextView $r8 = $r2.recipientPhoneNumberTextView;
            String $r9 = $r6.getRecipientPhoneNumber();
            $r8.setText($r9);
            TextView $r82 = $r2.recipientNameTextView;
            String $r92 = $r6.getRecipientName();
            $r82.setText($r92);
            int $i0 = $r6.getAmount();
            if ($i0 != 0) {
                toggleNairaColor(true);
                EditText $r33 = $r2.amountEditText;
                int $i02 = $r6.getAmount();
                String $r93 = String.valueOf($i02);
                $r33.setText($r93);
                FloatingActionButton $r10 = $r2.moveToNextButton;
                $r10.m26961t();
            }
        }
        TextView $r83 = $r2.editLabelTextView;
        $r83.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.voucher.cashin.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateVoucherAmountInfoFragment $r22 = CreateVoucherAmountInfoFragment.this;
                CreateVoucherAmountInfoFragment.m41708onActivityCreated$lambda4$lambda2($r22, view);
            }
        });
        final AmountSuggestionAdapter r18 = new AmountSuggestionAdapter();
        $r2.amountSuggestionRecyclerView.setAdapter(r18);
        CreateVoucherAmountInfoFragment$onActivityCreated$1$4 r19 = new CreateVoucherAmountInfoFragment$onActivityCreated$1$4($r2, this);
        r18.setOnClickListener(r19);
        $r2.amountEditText.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.voucher.cashin.ui.CreateVoucherAmountInfoFragment$onActivityCreated$1$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String $r22 = String.valueOf(editable);
                int $i03 = $r22.length();
                boolean $z02 = $i03 == 0;
                if ($z02) {
                    return;
                }
                FragmentCreateVoucherAmountInfoBinding $r34 = FragmentCreateVoucherAmountInfoBinding.this;
                EditText $r42 = $r34.amountEditText;
                $r42.removeTextChangedListener(this);
                Locale $r52 = Locale.US;
                NumberFormat $r62 = NumberFormat.getNumberInstance($r52);
                String $r23 = String.valueOf(editable);
                double $d0 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r23));
                String $r24 = $r62.format($d0);
                FragmentCreateVoucherAmountInfoBinding $r35 = FragmentCreateVoucherAmountInfoBinding.this;
                EditText $r43 = $r35.amountEditText;
                $r43.setText($r24);
                FragmentCreateVoucherAmountInfoBinding $r36 = FragmentCreateVoucherAmountInfoBinding.this;
                EditText $r44 = $r36.amountEditText;
                int $i04 = $r24.length();
                $r44.setSelection($i04);
                FragmentCreateVoucherAmountInfoBinding $r37 = FragmentCreateVoucherAmountInfoBinding.this;
                EditText $r45 = $r37.amountEditText;
                $r45.addTextChangedListener(this);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log_OC.getArray(charSequence, "s");
                int $i03 = charSequence.length();
                boolean $z02 = $i03 > 0;
                if (!$z02) {
                    FragmentCreateVoucherAmountInfoBinding $r52 = FragmentCreateVoucherAmountInfoBinding.this;
                    View $r62 = $r52.moveToNextButton;
                    Log_OC.loadImage($r62, "moveToNextButton");
                    View r9 = $r62;
                    ViewExtKt.hide(r9, true);
                    CreateVoucherAmountInfoFragment $r34 = this;
                    $r34.toggleNairaColor(false);
                    return;
                }
                String $r22 = String.valueOf(charSequence);
                int $i04 = Integer.parseInt(StringExtKt.getRemoveAllLetters($r22));
                if ($i04 > 200000) {
                    CreateVoucherAmountInfoFragment $r35 = this;
                    CreateVoucherAmountPresenter $r42 = $r35.getThisPresenter();
                    $r42.showError("Amount cannot be more than 200,000 NGN");
                    FragmentCreateVoucherAmountInfoBinding $r53 = FragmentCreateVoucherAmountInfoBinding.this;
                    $r53.moveToNextButton.m26969l();
                    return;
                }
                FragmentCreateVoucherAmountInfoBinding $r54 = FragmentCreateVoucherAmountInfoBinding.this;
                $r54.moveToNextButton.m26961t();
                CreateVoucherAmountInfoFragment $r36 = this;
                $r36.toggleNairaColor(true);
                AmountSuggestionAdapter $r72 = r18;
                String $r23 = String.valueOf(charSequence);
                int $i05 = Integer.parseInt(StringExtKt.getRemoveAllLetters($r23));
                List $r84 = IntExtKt.range$default($i05, 0, 0, 0, 14, null);
                $r72.setAmount($r84);
            }
        });
        ImageButton $r102 = $r2.moveToNextButton;
        ImageButton r23 = $r102;
        r23.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.voucher.cashin.ui.CountdownFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentCreateVoucherAmountInfoBinding $r22 = FragmentCreateVoucherAmountInfoBinding.this;
                CreateVoucherAmountInfoFragment $r34 = this;
                CreateVoucherAmountInfoFragment.m41709onActivityCreated$lambda4$lambda3($r22, $r34, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        CreateVoucherAmountInfoFragment r7 = this;
        super.onAttach(context);
        CreateVoucherAmountInfoFragment r72 = this;
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
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentCreateVoucherAmountInfoBinding $r4 = FragmentCreateVoucherAmountInfoBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        CreateVoucherAmountInfoFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentCreateVoucherAmountInfoBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentCreateVoucherAmountInfoBinding $r3 = (FragmentCreateVoucherAmountInfoBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentCreateVoucherAmountInfoBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFromSummaryPage(Boolean bool) {
        this.isFromSummaryPage = bool;
    }

    public final void setRequest(VoucherCashInRequest voucherCashInRequest) {
        this.request = voucherCashInRequest;
    }

    public final void setThisPresenter(CreateVoucherAmountPresenter createVoucherAmountPresenter) {
        Log_OC.getArray(createVoucherAmountPresenter, "<set-?>");
        this.thisPresenter = createVoucherAmountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.CashInAmountView
    public void showError(String str) {
        FragmentCreateVoucherAmountInfoBinding $r2 = requireBinding();
        if (str == null) {
            return;
        }
        EditText $r3 = $r2.amountEditText;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleNairaColor(boolean z) {
        FragmentCreateVoucherAmountInfoBinding $r1 = requireBinding();
        if (z) {
            TextView $r2 = $r1.nairaSymbolTextView;
            CreateVoucherAmountInfoFragment r4 = this;
            Context $r3 = r4.requireContext();
            int $i0 = C1335a.m36324d($r3, C0001R.color.black);
            $r2.setTextColor($i0);
            return;
        }
        TextView $r22 = $r1.nairaSymbolTextView;
        CreateVoucherAmountInfoFragment r42 = this;
        Context $r32 = r42.requireContext();
        int $i02 = C1335a.m36324d($r32, C0001R.color.darkLineDatePickerDivider);
        $r22.setTextColor($i02);
    }
}
