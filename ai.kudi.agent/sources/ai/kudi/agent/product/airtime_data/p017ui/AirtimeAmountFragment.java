package ai.kudi.agent.product.airtime_data.p017ui;

import ai.kudi.agent.collections.R$color;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentAirtimeAmountBinding;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.Networks;
import ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter;
import ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView;
import ai.kudi.agent.product.airtime_data.views.AmountView;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AirtimeAmountFragment.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001=B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0019\u0010%\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0096\u0001J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J$\u0010/\u001a\u00020&2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\t\u00106\u001a\u00020\u0006H\u0096\u0001J\b\u0010\f\u001a\u00020$H\u0002J\b\u00107\u001a\u00020$H\u0002J\b\u00108\u001a\u00020$H\u0002J\u0010\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020$H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006>"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/ui/AirtimeAmountFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/product/airtime_data/views/AirtimeAndDataView;", "Lai/kudi/agent/product/airtime_data/presenter/AirtimeAndDataPresenter;", "Lai/kudi/agent/product/airtime_data/views/AmountView;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentAirtimeAmountBinding;", "()V", "amountSuggestionAdapter", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "getAmountSuggestionAdapter", "()Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "setAmountSuggestionAdapter", "(Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;)V", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentAirtimeAmountBinding;", "currentWalletBalance", "", "getCurrentWalletBalance", "()D", "setCurrentWalletBalance", "(D)V", "payload", "Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "getPayload", "()Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "setPayload", "(Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/product/airtime_data/presenter/AirtimeAndDataPresenter;", "setThisPresenter", "(Lai/kudi/agent/product/airtime_data/presenter/AirtimeAndDataPresenter;)V", "createPresenter", "hideLoader", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "setKeypadCallback", "setUpView", "showAmountError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showLoader", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeAmountFragment */
/* loaded from: classes.dex */
public final class AirtimeAmountFragment extends MvpFragment<AirtimeAndDataView, AirtimeAndDataPresenter> implements AmountView, BaseViewBinder<FragmentAirtimeAmountBinding> {
    public static final String ARGS_AIRTIME_PAYLOAD = "args_airtime_payload";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentAirtimeAmountBinding> $$delegate_0;
    public AmountSuggestionAdapter amountSuggestionAdapter;
    private double currentWalletBalance;
    public AirtimePurchase payload;
    public AirtimeAndDataPresenter thisPresenter;

    /* compiled from: AirtimeAmountFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/ui/AirtimeAmountFragment$Companion;", "", "()V", "ARGS_AIRTIME_PAYLOAD", "", "getInstance", "Lai/kudi/agent/product/airtime_data/ui/AirtimeAmountFragment;", "airtimePurchaseData", "Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeAmountFragment$Companion */
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
        public final AirtimeAmountFragment getInstance(AirtimePurchase airtimePurchase) {
            Log_OC.getArray(airtimePurchase, "airtimePurchaseData");
            AirtimeAmountFragment r5 = new AirtimeAmountFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable("args_airtime_payload", airtimePurchase);
            C13666w c13666w = C13666w.f30112a;
            AirtimeAmountFragment r7 = r5;
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
    public AirtimeAmountFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setAmountSuggestionAdapter() {
        FragmentAirtimeAmountBinding $r1 = requireBinding();
        AmountSuggestionAdapter $r2 = new AmountSuggestionAdapter();
        setAmountSuggestionAdapter($r2);
        RecyclerView $r3 = $r1.amountSuggestionRecyclerView;
        AmountSuggestionAdapter $r22 = getAmountSuggestionAdapter();
        $r3.setAdapter($r22);
        AmountSuggestionAdapter $r23 = getAmountSuggestionAdapter();
        AirtimeAmountFragment$setAmountSuggestionAdapter$1$1 $r4 = new AirtimeAmountFragment$setAmountSuggestionAdapter$1$1($r1, this);
        $r23.setOnClickListener($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setKeypadCallback() {
        final FragmentAirtimeAmountBinding $r3 = requireBinding();
        PinpadView $r1 = $r3.keyboard;
        $r1.setViewProvider(new PinpadView.InterfaceC0836d() { // from class: ai.kudi.agent.product.airtime_data.ui.AirtimeAmountFragment$setKeypadCallback$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onAppendChar(String $r12) {
                Log_OC.getArray($r12, "char");
                StringBuilder r9 = new StringBuilder();
                FragmentAirtimeAmountBinding $r32 = FragmentAirtimeAmountBinding.this;
                KudiTextView $r4 = $r32.amountEditText;
                CharSequence $r5 = $r4.getText();
                r9.append((Object) $r5);
                r9.append($r12);
                String $r6 = r9.toString();
                AirtimeAmountFragment $r7 = this;
                double $d0 = Math.min($r7.getCurrentWalletBalance(), 5000.0d);
                int $i0 = $r6.length();
                if ($i0 > 0) {
                    double $d1 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r6));
                    if ($d1 > $d0) {
                        AirtimeAmountFragment $r72 = this;
                        $r72.showAmountError("Amount cannot be more than " + StringExtKt.getFormatToCurrency(String.valueOf($d0)) + " NGN");
                        FragmentAirtimeAmountBinding $r33 = FragmentAirtimeAmountBinding.this;
                        TextView $r42 = $r33.currency;
                        Fragment $r73 = this;
                        Fragment r12 = $r73;
                        Context $r8 = r12.getContext();
                        Log_OC.append($r8);
                        int $i02 = R$color.blackDatePickerTextColor;
                        TextView r10 = $r42;
                        r10.setTextColor(C1335a.m36324d($r8, $i02));
                    }
                }
                FragmentAirtimeAmountBinding $r34 = FragmentAirtimeAmountBinding.this;
                TextView $r43 = $r34.amountEditText;
                TextView r102 = $r43;
                r102.append($r12);
                FragmentAirtimeAmountBinding $r35 = FragmentAirtimeAmountBinding.this;
                View $r44 = $r35.errorMessage;
                Log_OC.loadImage($r44, "errorMessage");
                View r11 = $r44;
                ViewExtKt.hide$default(r11, false, 1, null);
                FragmentAirtimeAmountBinding $r332 = FragmentAirtimeAmountBinding.this;
                TextView $r422 = $r332.currency;
                Fragment $r732 = this;
                Fragment r122 = $r732;
                Context $r82 = r122.getContext();
                Log_OC.append($r82);
                int $i022 = R$color.blackDatePickerTextColor;
                TextView r103 = $r422;
                r103.setTextColor(C1335a.m36324d($r82, $i022));
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onDeleteChar() {
                int $i0;
                FragmentAirtimeAmountBinding $r12 = FragmentAirtimeAmountBinding.this;
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
                    CharSequence $r5 = $r33.subSequence(0, $i0).toString();
                    TextView r6 = $r2;
                    r6.setText($r5);
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
    private final void setUpView() {
        String $r5;
        final FragmentAirtimeAmountBinding $r1 = requireBinding();
        double $d0 = getPayload().getWalletBalance();
        setCurrentWalletBalance($d0);
        KudiTextView $r3 = $r1.textWalletBalance;
        int $i0 = R$string.wallet_balance_with_balance;
        int $i1 = R$string.naira_symbol;
        AirtimeAmountFragment r16 = this;
        String $r52 = r16.getString($i1);
        double $d02 = getCurrentWalletBalance();
        String $r53 = String.valueOf($d02);
        Object[] $r4 = {$r52, $r53};
        AirtimeAmountFragment r162 = this;
        String $r54 = r162.getString($i0, $r4);
        $r3.setText($r54);
        AirtimePurchase $r2 = getPayload();
        TextView $r32 = $r1.detailsLabel;
        StringBuilder r13 = new StringBuilder();
        String $r55 = $r2.getPhoneNumber();
        r13.append($r55);
        r13.append(" | ");
        Networks $r7 = $r2.getNetwork();
        String $r56 = $r7 == null ? null : $r7.getName();
        r13.append((Object) $r56);
        r13.append(" | ");
        String $r57 = $r2.getPurchaseType();
        r13.append($r57);
        CharSequence $r58 = r13.toString();
        TextView $r11 = $r32;
        $r11.setText($r58);
        TextView $r33 = $r1.amountEditText;
        int $i02 = $r2.getAmount();
        if ($i02 != 0) {
            int $i03 = $r2.getAmount();
            $r5 = String.valueOf($i03);
        } else {
            $r5 = "";
        }
        TextView $r112 = $r33;
        $r112.setText($r5.toString());
        PinpadView $r8 = $r1.keyboard;
        int $i04 = $r2.getAmount();
        String $r59 = String.valueOf($i04);
        $r8.setPasscode($r59);
        View $r9 = $r1.nextButton;
        Log_OC.loadImage($r9, "nextButton");
        View r17 = $r9;
        ViewExtKt.show(r17);
        ViewGroup r18 = $r1.nextButton;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.airtime_data.ui.BaseActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentAirtimeAmountBinding $r22 = FragmentAirtimeAmountBinding.this;
                AirtimeAmountFragment $r34 = this;
                AirtimeAmountFragment.m40170setUpView$lambda6$lambda4($r22, $r34, view);
            }
        });
        TextView $r113 = $r1.editLabelTextView;
        $r113.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.airtime_data.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AirtimeAmountFragment $r22 = AirtimeAmountFragment.this;
                AirtimeAmountFragment.m40171setUpView$lambda6$lambda5($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-6$lambda-4  reason: not valid java name */
    public static final void m40170setUpView$lambda6$lambda4(FragmentAirtimeAmountBinding fragmentAirtimeAmountBinding, AirtimeAmountFragment airtimeAmountFragment, View view) {
        Log_OC.getArray(fragmentAirtimeAmountBinding, "$this_apply");
        Log_OC.getArray(airtimeAmountFragment, "this$0");
        KudiTextView $r3 = fragmentAirtimeAmountBinding.amountEditText;
        CharSequence $r4 = $r3.getText();
        String $r5 = StringExtKt.getRemoveAllLetters($r4.toString());
        int $i0 = $r5.length();
        if (!($i0 > 0)) {
            airtimeAmountFragment.showAmountError("You have to fill in an amount");
            return;
        }
        AirtimeAndDataPresenter $r6 = airtimeAmountFragment.getThisPresenter();
        AirtimePurchase $r7 = airtimeAmountFragment.getPayload();
        double $d0 = Double.parseDouble($r5);
        int $i02 = (int) $d0;
        AirtimePurchase $r72 = AirtimePurchase.copy$default($r7, null, $i02, null, null, null, null, 0.0d, 125, null);
        double $d02 = airtimeAmountFragment.getCurrentWalletBalance();
        $r6.performFeesLookup($r72, $d02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40171setUpView$lambda6$lambda5(AirtimeAmountFragment airtimeAmountFragment, View view) {
        Log_OC.getArray(airtimeAmountFragment, "this$0");
        AirtimeAndDataPresenter $r2 = airtimeAmountFragment.getThisPresenter();
        AirtimePurchase $r3 = airtimeAmountFragment.getPayload();
        $r2.editPurchaseDetailsPage($r3, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AirtimeAndDataPresenter createPresenter() {
        AirtimeAndDataPresenter $r1 = getThisPresenter();
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
    public FragmentAirtimeAmountBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAirtimeAmountBinding $r3 = (FragmentAirtimeAmountBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAirtimeAmountBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getCurrentWalletBalance() {
        double d0 = this.currentWalletBalance;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AirtimePurchase getPayload() {
        AirtimePurchase $r1 = this.payload;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("payload");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AirtimeAndDataPresenter getThisPresenter() {
        AirtimeAndDataPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView
    public void hideLoader() {
        FragmentAirtimeAmountBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.nextButton;
        $r2.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentAirtimeAmountBinding fragmentAirtimeAmountBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAirtimeAmountBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAirtimeAmountBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAirtimeAmountBinding $r4 = (FragmentAirtimeAmountBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AirtimeAmountFragment r2 = this;
        C7429a.m18752b(r2);
        AirtimeAmountFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AirtimeAmountFragment r6 = this;
        Bundle $r1 = r6.getArguments();
        if ($r1 == null) {
            return;
        }
        boolean $z0 = $r1.containsKey("args_airtime_payload");
        if ($z0) {
            Parcelable $r2 = $r1.getParcelable("args_airtime_payload");
            if ($r2 == null) {
                NullPointerException r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.airtime_data.data.AirtimePurchase");
                throw r5;
            }
            AirtimePurchase $r3 = (AirtimePurchase) $r2;
            setPayload($r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAirtimeAmountBinding $r4 = FragmentAirtimeAmountBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        AirtimeAmountFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setAmountSuggestionAdapter();
        setKeypadCallback();
        setUpView();
        final FragmentAirtimeAmountBinding $r1 = requireBinding();
        final KudiTextView $r4 = $r1.amountEditText;
        KudiTextView r7 = $r4;
        r7.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.product.airtime_data.ui.AirtimeAmountFragment$onViewCreated$1$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Integer $r2;
                if (editable == null) {
                    $r2 = null;
                } else {
                    int $i0 = editable.length();
                    $r2 = Integer.valueOf($i0);
                }
                Log_OC.append($r2);
                int $i02 = $r2.intValue();
                if ($i02 <= 0) {
                    FragmentAirtimeAmountBinding $r5 = $r1;
                    View $r10 = $r5.nextButton;
                    Log_OC.loadImage($r10, "nextButton");
                    View r14 = $r10;
                    ViewExtKt.hide$default(r14, false, 1, null);
                    FragmentAirtimeAmountBinding $r52 = $r1;
                    TextView $r3 = $r52.currency;
                    TextView $r11 = KudiTextView.this;
                    TextView r13 = $r11;
                    Context $r12 = r13.getContext();
                    int $i03 = R$color.light_text_color;
                    TextView r132 = $r3;
                    r132.setTextColor(C1335a.m36324d($r12, $i03));
                    return;
                }
                TextView $r32 = KudiTextView.this;
                TextView r133 = $r32;
                r133.removeTextChangedListener(this);
                String $r42 = StringExtKt.getFormatToCurrency(StringExtKt.getRemoveAllLetters(editable.toString()));
                TextView $r33 = KudiTextView.this;
                TextView r134 = $r33;
                r134.setText($r42);
                TextView $r34 = KudiTextView.this;
                TextView r135 = $r34;
                r135.addTextChangedListener(this);
                FragmentAirtimeAmountBinding $r53 = $r1;
                PinpadView $r6 = $r53.keyboard;
                $r6.setPasscode($r42);
                AirtimeAmountFragment $r7 = this;
                AmountSuggestionAdapter $r8 = $r7.getAmountSuggestionAdapter();
                double $d0 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r42));
                int $i04 = (int) $d0;
                List $r9 = IntExtKt.range$default($i04, 0, 5000, 0, 10, null);
                $r8.setAmount($r9);
                FragmentAirtimeAmountBinding $r54 = $r1;
                View $r102 = $r54.nextButton;
                Log_OC.loadImage($r102, "nextButton");
                View r142 = $r102;
                ViewExtKt.show(r142);
                FragmentAirtimeAmountBinding $r55 = $r1;
                TextView $r35 = $r55.currency;
                TextView $r112 = KudiTextView.this;
                TextView r136 = $r112;
                Context $r122 = r136.getContext();
                int $i05 = R$color.blackDatePickerTextColor;
                TextView r137 = $r35;
                r137.setTextColor(C1335a.m36324d($r122, $i05));
                FragmentAirtimeAmountBinding $r56 = $r1;
                View $r36 = $r56.errorMessage;
                Log_OC.loadImage($r36, "errorMessage");
                View r143 = $r36;
                ViewExtKt.hide$default(r143, false, 1, null);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAirtimeAmountBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAirtimeAmountBinding $r3 = (FragmentAirtimeAmountBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAirtimeAmountBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAmountSuggestionAdapter(AmountSuggestionAdapter amountSuggestionAdapter) {
        Log_OC.getArray(amountSuggestionAdapter, "<set-?>");
        this.amountSuggestionAdapter = amountSuggestionAdapter;
    }

    public final void setCurrentWalletBalance(double d) {
        this.currentWalletBalance = d;
    }

    public final void setPayload(AirtimePurchase airtimePurchase) {
        Log_OC.getArray(airtimePurchase, "<set-?>");
        this.payload = airtimePurchase;
    }

    public final void setThisPresenter(AirtimeAndDataPresenter airtimeAndDataPresenter) {
        Log_OC.getArray(airtimeAndDataPresenter, "<set-?>");
        this.thisPresenter = airtimeAndDataPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView
    public void showAmountError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        FragmentAirtimeAmountBinding $r2 = requireBinding();
        TextView r4 = $r2.errorMessage;
        r4.setText(str);
        View $r1 = $r2.errorMessage;
        Log_OC.loadImage($r1, "errorMessage");
        View r5 = $r1;
        ViewExtKt.show(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView
    public void showLoader() {
        FragmentAirtimeAmountBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.nextButton;
        $r2.m38032f();
    }
}
