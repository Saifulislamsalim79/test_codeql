package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.collections.R$color;
import ai.kudi.agent.collections.databinding.FragmentAmountBinding;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import ai.kudi.agent.product.other_bills.presenter.AmountPresenter;
import ai.kudi.agent.product.p019ui.ProductActivity;
import ai.kudi.agent.transfer.views.TransferToBankAmountView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
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
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AmountFragment.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001;B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0096\u0001J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J$\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\t\u00100\u001a\u00020\u0005H\u0096\u0001J\b\u0010\u000b\u001a\u00020#H\u0002J\b\u00101\u001a\u00020#H\u0002J\u0010\u00102\u001a\u00020#2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u000204H\u0016J\b\u00107\u001a\u00020#H\u0016J\u0010\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020:H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006<"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/AmountFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/transfer/views/TransferToBankAmountView;", "Lai/kudi/agent/product/other_bills/presenter/AmountPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentAmountBinding;", "()V", "amountSuggestionAdapter", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "getAmountSuggestionAdapter", "()Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "setAmountSuggestionAdapter", "(Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;)V", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentAmountBinding;", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "minAmount", "", "getMinAmount", "()I", "minAmount$delegate", "Lkotlin/Lazy;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/product/other_bills/presenter/AmountPresenter;", "setThisPresenter", "(Lai/kudi/agent/product/other_bills/presenter/AmountPresenter;)V", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "setKeypadCallback", "showInvalidAmount", MetricTracker.Object.MESSAGE, "", "showMsg", AttributeType.TEXT, "toBillInfo", "toggleActionBtn", "enable", "", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.AmountFragment */
/* loaded from: classes.dex */
public final class AmountFragment extends AbstractC9412c<TransferToBankAmountView, AmountPresenter> implements TransferToBankAmountView, BaseViewBinder<FragmentAmountBinding> {
    public static final String CABLE_DATA = "cable_data";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentAmountBinding> $$delegate_0;
    public AmountSuggestionAdapter amountSuggestionAdapter;
    private BillsData cableData;
    private final InterfaceC11824h minAmount$delegate;
    public AmountPresenter thisPresenter;

    /* compiled from: AmountFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/AmountFragment$Companion;", "", "()V", "CABLE_DATA", "", "newInstance", "Lai/kudi/agent/product/other_bills/ui/AmountFragment;", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.other_bills.ui.AmountFragment$Companion */
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
        public final AmountFragment newInstance(BillsData billsData) {
            Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
            AmountFragment r5 = new AmountFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(AmountFragment.CABLE_DATA, billsData);
            C13666w c13666w = C13666w.f30112a;
            AmountFragment r7 = r5;
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
    public AmountFragment() {
        InterfaceC11824h $r1;
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
        AmountFragment$minAmount$2 $r3 = new AmountFragment$minAmount$2(this);
        $r1 = C13218k.m5625b($r3);
        this.minAmount$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int getMinAmount() {
        InterfaceC11824h $r1 = this.minAmount$delegate;
        Object $r2 = $r1.getValue();
        Number $r3 = (Number) $r2;
        int $i0 = $r3.intValue();
        return $i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final void m40200onViewCreated$lambda5$lambda2(AmountFragment amountFragment, View view) {
        Log_OC.getArray(amountFragment, "this$0");
        AmountPresenter $r0 = amountFragment.getThisPresenter();
        $r0.editAccountDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m40201onViewCreated$lambda5$lambda3(FragmentAmountBinding fragmentAmountBinding, AmountFragment amountFragment, View view) {
        boolean $z0;
        int $i0;
        String $r5;
        Log_OC.getArray(fragmentAmountBinding, "$this_apply");
        Log_OC.getArray(amountFragment, "this$0");
        TextView $r3 = fragmentAmountBinding.amountEditText;
        CharSequence $r4 = $r3.getText();
        Log_OC.loadImage($r4, "amountEditText.text");
        $z0 = C13276s.m5440u($r4);
        if (!$z0) {
            TextView $r32 = fragmentAmountBinding.amountEditText;
            String $r52 = $r32.getText().toString();
            $r5 = C13276s.m5451A($r52, ",", "", false, 4, null);
            $i0 = Integer.parseInt($r5);
        } else {
            $i0 = 0;
        }
        BillsData $r6 = amountFragment.cableData;
        Log_OC.append($r6);
        $r6.setAmount($i0);
        int $i1 = amountFragment.getMinAmount();
        if ($i0 < $i1) {
            StringBuilder r12 = new StringBuilder();
            r12.append("Amount cannot be less than ");
            int $i02 = amountFragment.getMinAmount();
            r12.append($i02);
            r12.append(" NGN");
            String $r53 = r12.toString();
            amountFragment.showInvalidAmount($r53);
            return;
        }
        AmountFragment r13 = amountFragment;
        FragmentActivity $r7 = r13.getActivity();
        if ($r7 == null) {
            NullPointerException r11 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.ui.ProductActivity");
            throw r11;
        }
        ProductActivity $r8 = (ProductActivity) $r7;
        BillsData $r62 = amountFragment.cableData;
        Log_OC.append($r62);
        $r8.toStepTwoView($r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setAmountSuggestionAdapter() {
        FragmentAmountBinding $r1 = requireBinding();
        AmountSuggestionAdapter $r2 = new AmountSuggestionAdapter();
        setAmountSuggestionAdapter($r2);
        RecyclerView $r3 = $r1.amountSuggestionRecyclerView;
        AmountSuggestionAdapter $r22 = getAmountSuggestionAdapter();
        $r3.setAdapter($r22);
        AmountSuggestionAdapter $r23 = getAmountSuggestionAdapter();
        AmountFragment$setAmountSuggestionAdapter$1$1 $r4 = new AmountFragment$setAmountSuggestionAdapter$1$1($r1, this);
        $r23.setOnClickListener($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setKeypadCallback() {
        final FragmentAmountBinding $r3 = requireBinding();
        PinpadView $r1 = $r3.keyboard;
        $r1.setViewProvider(new PinpadView.InterfaceC0836d() { // from class: ai.kudi.agent.product.other_bills.ui.AmountFragment$setKeypadCallback$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onAppendChar(String $r12) {
                Log_OC.getArray($r12, "char");
                StringBuilder r9 = new StringBuilder();
                FragmentAmountBinding $r32 = FragmentAmountBinding.this;
                TextView $r4 = $r32.amountEditText;
                CharSequence $r5 = $r4.getText();
                r9.append((Object) $r5);
                r9.append($r12);
                String $r6 = r9.toString();
                int $i1 = $r6.length();
                boolean $z0 = $i1 > 0;
                if ($z0) {
                    double $d1 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r6));
                    if ($d1 > 200000.0d) {
                        AmountFragment $r7 = this;
                        $r7.showInvalidAmount("Amount cannot be more than " + StringExtKt.getFormatToCurrency(String.valueOf(200000)) + " NGN");
                        FragmentAmountBinding $r33 = FragmentAmountBinding.this;
                        TextView $r42 = $r33.currency;
                        Fragment $r72 = this;
                        Fragment r10 = $r72;
                        Context $r8 = r10.getContext();
                        Log_OC.append($r8);
                        int $i12 = R$color.blackDatePickerTextColor;
                        $r42.setTextColor(C1335a.m36324d($r8, $i12));
                    }
                }
                FragmentAmountBinding $r34 = FragmentAmountBinding.this;
                TextView $r43 = $r34.amountEditText;
                $r43.append($r12);
                FragmentAmountBinding $r35 = FragmentAmountBinding.this;
                TextView $r44 = $r35.errorMessage;
                Log_OC.loadImage($r44, "errorMessage");
                ViewExtKt.hide$default($r44, false, 1, null);
                FragmentAmountBinding $r332 = FragmentAmountBinding.this;
                TextView $r422 = $r332.currency;
                Fragment $r722 = this;
                Fragment r102 = $r722;
                Context $r82 = r102.getContext();
                Log_OC.append($r82);
                int $i122 = R$color.blackDatePickerTextColor;
                $r422.setTextColor(C1335a.m36324d($r82, $i122));
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onDeleteChar() {
                int $i0;
                FragmentAmountBinding $r12 = FragmentAmountBinding.this;
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
    public AmountPresenter createPresenter() {
        AmountPresenter $r1 = getThisPresenter();
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
    public FragmentAmountBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAmountBinding $r3 = (FragmentAmountBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAmountBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AmountPresenter getThisPresenter() {
        AmountPresenter $r1 = this.thisPresenter;
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
    public View initBinding(FragmentAmountBinding fragmentAmountBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAmountBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAmountBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAmountBinding $r4 = (FragmentAmountBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AmountFragment r2 = this;
        C7429a.m18752b(r2);
        AmountFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AmountFragment r4 = this;
        Bundle $r1 = r4.getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(CABLE_DATA);
        BillsData $r3 = (BillsData) $r2;
        this.cableData = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAmountBinding $r4 = FragmentAmountBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        AmountFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r39, android.os.Bundle r40) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.other_bills.p018ui.AmountFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAmountBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAmountBinding $r3 = (FragmentAmountBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAmountBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAmountSuggestionAdapter(AmountSuggestionAdapter amountSuggestionAdapter) {
        Log_OC.getArray(amountSuggestionAdapter, "<set-?>");
        this.amountSuggestionAdapter = amountSuggestionAdapter;
    }

    public final void setThisPresenter(AmountPresenter amountPresenter) {
        Log_OC.getArray(amountPresenter, "<set-?>");
        this.thisPresenter = amountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankAmountView
    public void showInvalidAmount(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentAmountBinding $r1 = requireBinding();
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
        AmountFragment r3 = this;
        FragmentActivity $r2 = r3.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankAmountView
    public void toBillInfo() {
        AmountFragment r5 = this;
        FragmentActivity $r1 = r5.getActivity();
        if ($r1 == null) {
            NullPointerException r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.ui.ProductActivity");
            throw r4;
        }
        ProductActivity $r2 = (ProductActivity) $r1;
        $r2.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankAmountView
    public void toggleActionBtn(boolean z) {
        FragmentAmountBinding $r2 = requireBinding();
        ImageView $r1 = $r2.ivLoader;
        Log_OC.loadImage($r1, "ivLoader");
        ViewExtKt.toggleVisibility($r1, z);
        ImageButton $r3 = $r2.nextButton;
        ImageButton r4 = $r3;
        r4.setEnabled(z);
    }
}
