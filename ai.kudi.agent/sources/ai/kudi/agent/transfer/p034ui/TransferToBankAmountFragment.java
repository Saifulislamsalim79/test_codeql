package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentTransferToBankAmountBinding;
import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.presenter.TransferToBankAmountPresenter;
import ai.kudi.agent.transfer.views.TransferToBankAmountView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: TransferToBankAmountFragment.kt */
@Metadata(m10422d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001=B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\u0003H\u0016J\u0019\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0096\u0001J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J$\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\t\u00103\u001a\u00020\u0005H\u0096\u0001J\b\u0010\u000b\u001a\u00020'H\u0002J\b\u00104\u001a\u00020'H\u0002J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020'2\u0006\u00109\u001a\u000207H\u0016J\b\u0010:\u001a\u00020'H\u0016J\u0010\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020\u0011H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006>"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToBankAmountFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/transfer/views/TransferToBankAmountView;", "Lai/kudi/agent/transfer/presenter/TransferToBankAmountPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentTransferToBankAmountBinding;", "()V", "amountSuggestionAdapter", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "getAmountSuggestionAdapter", "()Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "setAmountSuggestionAdapter", "(Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;)V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentTransferToBankAmountBinding;", "isCashOutFlow", "", "isFromSummaryPage", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transfer/presenter/TransferToBankAmountPresenter;", "setThisPresenter", "(Lai/kudi/agent/transfer/presenter/TransferToBankAmountPresenter;)V", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "setKeypadCallback", "showInvalidAmount", MetricTracker.Object.MESSAGE, "", "showMsg", AttributeType.TEXT, "toBillInfo", "toggleActionBtn", "enable", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToBankAmountFragment */
/* loaded from: classes.dex */
public final class TransferToBankAmountFragment extends MvpFragment<TransferToBankAmountView, TransferToBankAmountPresenter> implements TransferToBankAmountView, BaseViewBinder<FragmentTransferToBankAmountBinding> {
    public static final String ARGS_IS_CASHOUT_FLOW = "args_is_cash_out_flow";
    public static final String ARGS_PAYLOAD = "args_transfer_payload";
    public static final String ARGS_SOURCE = "args_is_from_summary_page";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentTransferToBankAmountBinding> $$delegate_0;
    public AmountSuggestionAdapter amountSuggestionAdapter;
    private boolean isCashOutFlow;
    private boolean isFromSummaryPage;
    private TransferToBankPayload payload;
    public SharedPreferences sharedPreferences;
    public TransferToBankAmountPresenter thisPresenter;

    /* compiled from: TransferToBankAmountFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToBankAmountFragment$Companion;", "", "()V", "ARGS_IS_CASHOUT_FLOW", "", "ARGS_PAYLOAD", "ARGS_SOURCE", "newInstance", "Lai/kudi/agent/transfer/ui/TransferToBankAmountFragment;", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "isFromSummaryPage", "", "isCashOutFlow", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transfer.ui.TransferToBankAmountFragment$Companion */
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
        public static /* synthetic */ TransferToBankAmountFragment newInstance$default(Companion companion, TransferToBankPayload $r2, boolean z, boolean $z1, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = null;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $z1 = false;
            }
            TransferToBankAmountFragment $r0 = companion.newInstance($r2, z, $z1);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransferToBankAmountFragment newInstance(TransferToBankPayload transferToBankPayload, boolean z, boolean z2) {
            TransferToBankAmountFragment r5 = new TransferToBankAmountFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable("args_transfer_payload", transferToBankPayload);
            r6.putBoolean("args_is_from_summary_page", z);
            r6.putBoolean(TransferToBankAmountFragment.ARGS_IS_CASHOUT_FLOW, z2);
            C13666w c13666w = C13666w.f30112a;
            TransferToBankAmountFragment r7 = r5;
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
    public TransferToBankAmountFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-1 */
    public static final void m41378onViewCreated$lambda5$lambda1(TransferToBankAmountFragment transferToBankAmountFragment, View view) {
        Log_OC.getArray(transferToBankAmountFragment, "this$0");
        TransferToBankAmountPresenter $r0 = transferToBankAmountFragment.getThisPresenter();
        TransferToBankPayload $r3 = transferToBankAmountFragment.payload;
        $r0.editAccountDetails($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3 */
    public static final void m41379onViewCreated$lambda5$lambda3(TransferToBankAmountFragment transferToBankAmountFragment, FragmentTransferToBankAmountBinding fragmentTransferToBankAmountBinding, View view) {
        boolean $z0;
        int $i0;
        Log_OC.getArray(transferToBankAmountFragment, "this$0");
        Log_OC.getArray(fragmentTransferToBankAmountBinding, "$this_apply");
        SharedPreferences $r4 = transferToBankAmountFragment.getSharedPreferences();
        Double $r3 = null;
        String $r5 = $r4.getString(ConstantsKt.EXTRA_WALLET_BALANCE, null);
        if ($r5 != null) {
            double $d0 = Double.parseDouble($r5);
            $r3 = Double.valueOf($d0);
        }
        TextView $r6 = fragmentTransferToBankAmountBinding.amountEditText;
        CharSequence $r7 = $r6.getText();
        Log_OC.loadImage($r7, "amountEditText.text");
        $z0 = C13276s.m5440u($r7);
        if (!$z0) {
            TextView $r62 = fragmentTransferToBankAmountBinding.amountEditText;
            double $d02 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r62.getText().toString()));
            int $i02 = (int) $d02;
            $i0 = $i02;
        } else {
            $i0 = 0;
        }
        TransferToBankAmountPresenter $r8 = transferToBankAmountFragment.getThisPresenter();
        TransferToBankPayload $r9 = transferToBankAmountFragment.payload;
        Log_OC.append($r9);
        Integer $r10 = Integer.valueOf($i0);
        TransferToBankPayload $r92 = TransferToBankPayload.copy$default($r9, null, null, $r10, null, null, null, null, null, null, null, null, null, null, 8187, null);
        boolean $z02 = transferToBankAmountFragment.isFromSummaryPage;
        boolean $z1 = transferToBankAmountFragment.isCashOutFlow;
        TransferToBankAmountPresenter.continueToNextPage$default($r8, $r92, $r3, $z02, null, null, $z1, 24, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setAmountSuggestionAdapter() {
        FragmentTransferToBankAmountBinding $r1 = requireBinding();
        AmountSuggestionAdapter $r2 = new AmountSuggestionAdapter();
        setAmountSuggestionAdapter($r2);
        RecyclerView $r3 = $r1.amountSuggestionRecyclerView;
        AmountSuggestionAdapter $r22 = getAmountSuggestionAdapter();
        $r3.setAdapter($r22);
        AmountSuggestionAdapter $r23 = getAmountSuggestionAdapter();
        TransferToBankAmountFragment$setAmountSuggestionAdapter$1$1 $r4 = new TransferToBankAmountFragment$setAmountSuggestionAdapter$1$1($r1, this);
        $r23.setOnClickListener($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setKeypadCallback() {
        final FragmentTransferToBankAmountBinding $r3 = requireBinding();
        PinpadView $r1 = $r3.keyboard;
        $r1.setViewProvider(new PinpadView.InterfaceC0836d() { // from class: ai.kudi.agent.transfer.ui.TransferToBankAmountFragment$setKeypadCallback$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onAppendChar(String $r12) {
                Log_OC.getArray($r12, "char");
                StringBuilder r9 = new StringBuilder();
                FragmentTransferToBankAmountBinding $r32 = FragmentTransferToBankAmountBinding.this;
                TextView $r4 = $r32.amountEditText;
                CharSequence $r5 = $r4.getText();
                r9.append((Object) $r5);
                r9.append($r12);
                String $r6 = r9.toString();
                TransferToBankAmountFragment $r7 = this;
                boolean $z0 = $r7.isCashOutFlow;
                int $i0 = $z0 ? 500000 : 200000;
                int $i1 = $r6.length();
                boolean $z02 = $i1 > 0;
                if ($z02) {
                    double $d1 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r6));
                    double $d0 = $i0;
                    if ($d1 > $d0) {
                        TransferToBankAmountFragment $r72 = this;
                        $r72.showInvalidAmount("Amount cannot be more than " + StringExtKt.getFormatToCurrency(String.valueOf($i0)) + " NGN");
                        FragmentTransferToBankAmountBinding $r33 = FragmentTransferToBankAmountBinding.this;
                        TextView $r42 = $r33.currency;
                        Fragment $r73 = this;
                        Fragment r10 = $r73;
                        Context $r8 = r10.getContext();
                        Log_OC.append($r8);
                        $r42.setTextColor(C1335a.m36324d($r8, C0001R.color.blackDatePickerTextColor));
                    }
                }
                FragmentTransferToBankAmountBinding $r34 = FragmentTransferToBankAmountBinding.this;
                TextView $r43 = $r34.amountEditText;
                $r43.append($r12);
                FragmentTransferToBankAmountBinding $r35 = FragmentTransferToBankAmountBinding.this;
                TextView $r44 = $r35.errorMessage;
                Log_OC.loadImage($r44, "errorMessage");
                ViewExtKt.hide$default($r44, false, 1, null);
                FragmentTransferToBankAmountBinding $r332 = FragmentTransferToBankAmountBinding.this;
                TextView $r422 = $r332.currency;
                Fragment $r732 = this;
                Fragment r102 = $r732;
                Context $r82 = r102.getContext();
                Log_OC.append($r82);
                $r422.setTextColor(C1335a.m36324d($r82, C0001R.color.blackDatePickerTextColor));
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onDeleteChar() {
                int $i0;
                FragmentTransferToBankAmountBinding $r12 = FragmentTransferToBankAmountBinding.this;
                TextView $r2 = $r12.amountEditText;
                CharSequence $r32 = $r2.getText();
                Log_OC.loadImage($r32, AttributeType.TEXT);
                int $i02 = $r32.length();
                boolean $z0 = $i02 > 0;
                if ($z0) {
                    CharSequence $r33 = $r2.getText();
                    Log_OC.loadImage($r33, AttributeType.TEXT);
                    CharSequence $r4 = $r2.getText();
                    Log_OC.loadImage($r4, AttributeType.TEXT);
                    $i0 = C13277t.m5410Q($r4);
                    String $r5 = $r33.subSequence(0, $i0).toString();
                    $r2.setText($r5);
                }
            }

            public void onReset() {
            }

            public void setNumDigits(int i) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransferToBankAmountPresenter createPresenter() {
        TransferToBankAmountPresenter $r1 = getThisPresenter();
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
    public final AmountSuggestionAdapter getAmountSuggestionAdapter() {
        AmountSuggestionAdapter $r1 = this.amountSuggestionAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("amountSuggestionAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransferToBankAmountBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentTransferToBankAmountBinding $r3 = (FragmentTransferToBankAmountBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentTransferToBankAmountBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransferToBankAmountPresenter getThisPresenter() {
        TransferToBankAmountPresenter $r1 = this.thisPresenter;
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
    public View initBinding(FragmentTransferToBankAmountBinding fragmentTransferToBankAmountBinding, Fragment fragment) {
        Log_OC.getArray(fragmentTransferToBankAmountBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentTransferToBankAmountBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentTransferToBankAmountBinding $r4 = (FragmentTransferToBankAmountBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        TransferToBankAmountFragment r7 = this;
        super.onAttach(context);
        TransferToBankAmountFragment r72 = this;
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
        FragmentTransferToBankAmountBinding $r4 = FragmentTransferToBankAmountBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        TransferToBankAmountFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c6, code lost:
        if (r15 != 0) goto L31;
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r49, android.os.Bundle r50) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.p034ui.TransferToBankAmountFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransferToBankAmountBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentTransferToBankAmountBinding $r3 = (FragmentTransferToBankAmountBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentTransferToBankAmountBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAmountSuggestionAdapter(AmountSuggestionAdapter amountSuggestionAdapter) {
        Log_OC.getArray(amountSuggestionAdapter, "<set-?>");
        this.amountSuggestionAdapter = amountSuggestionAdapter;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setThisPresenter(TransferToBankAmountPresenter transferToBankAmountPresenter) {
        Log_OC.getArray(transferToBankAmountPresenter, "<set-?>");
        this.thisPresenter = transferToBankAmountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankAmountView
    public void showInvalidAmount(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentTransferToBankAmountBinding $r1 = requireBinding();
        TextView $r3 = $r1.errorMessage;
        $r3.setText(str);
        Log_OC.loadImage($r3, "");
        ViewExtKt.show($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankAmountView
    public void showMsg(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        TransferToBankAmountFragment r3 = this;
        FragmentActivity $r2 = r3.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
    }

    @Override // ai.kudi.agent.transfer.views.TransferToBankAmountView
    public void toBillInfo() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankAmountView
    public void toggleActionBtn(boolean z) {
        FragmentTransferToBankAmountBinding $r1 = requireBinding();
        if (z) {
            ImageView $r2 = $r1.ivLoader;
            Log_OC.loadImage($r2, "ivLoader");
            ViewExtKt.hide$default($r2, false, 1, null);
        } else {
            ImageView $r22 = $r1.ivLoader;
            Log_OC.loadImage($r22, "ivLoader");
            ViewExtKt.show($r22);
        }
        ImageButton $r3 = $r1.nextButton;
        ImageButton r4 = $r3;
        r4.setEnabled(z);
    }
}
