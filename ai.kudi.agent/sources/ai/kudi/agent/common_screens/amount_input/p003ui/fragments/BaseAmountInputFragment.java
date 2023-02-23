package ai.kudi.agent.common_screens.amount_input.p003ui.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.AmountInputViewData;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.BaseAmountInputViewData;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentAmountInputBinding;
import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.InterfaceC1584v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13275r;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
import p590o.p591a.Timber;
/* compiled from: BaseAmountInputFragment.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00060\u0005B\u0005¢\u0006\u0002\u0010\u0007J\r\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0010J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020'H\u0002J\u001a\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010*\u001a\u00020\u00192\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\rH\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\rH\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0019H\u0002J\u0010\u00104\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u00010\rJ\b\u00106\u001a\u00020\u0019H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\rH\u0016J\u0012\u00109\u001a\u00020\u00192\b\b\u0002\u0010:\u001a\u000202H\u0016J\u0010\u0010;\u001a\u00020\u00192\u0006\u0010:\u001a\u000202H\u0016J\u0010\u0010<\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u00028\u00008\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006="}, m10421d2 = {"Lai/kudi/agent/common_screens/amount_input/ui/fragments/BaseAmountInputFragment;", "VM", "Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "VD", "Lai/kudi/agent/common_screens/amount_input/ui/viewdata/BaseAmountInputViewData;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/databinding/FragmentAmountInputBinding;", "()V", "adapter", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", TransactionField.AMOUNT, "", "amountInput", "", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "setScreenViewModel", "(Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;)V", "Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "createViewModel", "getMaximumAmount", "getMessageText", "getMinimumAmount", "onAmountInputViewDataChange", "", "viewData", "Lai/kudi/agent/common_screens/amount_input/ui/viewdata/AmountInputViewData;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEnteredAmountChange", "onNextBtnClick", "onSuggestedAmountClick", "", "onViewCreated", "view", "refreshSuggestedAmountList", "suggestionList", "", "setAmountInput", "amountText", "setAmountText", "setAmtViewColor", "isValidAmount", "", "setDescText", "setMessageText", AttributeType.TEXT, "setupPinPadCallback", "toast", "s", "toggleAccountDetailHeader", "show", "toggleLoader", "toggleNextBtn", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.common_screens.amount_input.ui.fragments.BaseAmountInputFragment */
/* loaded from: classes.dex */
public abstract class BaseAmountInputFragment<VM extends BaseAmountInputViewModel<VD>, VD extends BaseAmountInputViewData> extends BaseMVVMViewBindingFragment<VM, VD, FragmentAmountInputBinding> {
    private AmountSuggestionAdapter adapter;
    private int amount;
    private String amountInput = "0";
    public VM screenViewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseAmountInputFragment() {
        int $i0 = Integer.parseInt("0");
        this.amount = $i0;
        AmountSuggestionAdapter $r1 = new AmountSuggestionAdapter();
        BaseAmountInputFragment$adapter$1$1 $r2 = new BaseAmountInputFragment$adapter$1$1(this);
        $r1.setOnClickListener($r2);
        C13666w c13666w = C13666w.f30112a;
        this.adapter = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r2 == 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onAmountInputViewDataChange(ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.AmountInputViewData r6) {
        /*
            r5 = this;
            boolean r0 = r6.isValidAmount()
            r5.setAmtViewColor(r0)
            r5.setDescText()
            boolean r0 = r6.isValidAmount()
            r5.toggleNextBtn(r0)
            java.lang.String r1 = r6.getToastMsg()
            r0 = 0
            if (r1 == 0) goto L21
            int r2 = r1.length()
            if (r2 != 0) goto L1f
            goto L21
        L1f:
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            if (r3 != 0) goto L2e
            java.lang.String r1 = r6.getToastMsg()
            kotlin.p483e0.p485d.Log_OC.append(r1)
            r5.toast(r1)
        L2e:
            java.util.List r4 = r6.getSuggestedAmountList()
            if (r4 == 0) goto L3e
            java.util.List r4 = r6.getSuggestedAmountList()
            kotlin.p483e0.p485d.Log_OC.append(r4)
            r5.refreshSuggestedAmountList(r4)
        L3e:
            java.lang.String r1 = r6.getEnteredAmountText()
            if (r1 == 0) goto L4a
            int r2 = r1.length()
            if (r2 != 0) goto L4b
        L4a:
            r0 = 1
        L4b:
            if (r0 != 0) goto L57
            java.lang.String r1 = r6.getEnteredAmountText()
            kotlin.p483e0.p485d.Log_OC.append(r1)
            r5.setAmountText(r1)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment.onAmountInputViewDataChange(ai.kudi.agent.common_screens.amount_input.ui.viewdata.AmountInputViewData):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onEnteredAmountChange(int i) {
        BaseAmountInputViewModel $r1 = getScreenViewModel();
        $r1.onAmountInputChange(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onSuggestedAmountClick(long j) {
        String $r1 = String.valueOf(j);
        setAmountInput($r1);
        int $i1 = (int) j;
        onEnteredAmountChange($i1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39130onViewCreated$lambda1(BaseAmountInputFragment baseAmountInputFragment, AmountInputViewData amountInputViewData) {
        Log_OC.getArray(baseAmountInputFragment, "this$0");
        Log_OC.loadImage(amountInputViewData, "it");
        baseAmountInputFragment.onAmountInputViewDataChange(amountInputViewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m39131onViewCreated$lambda2(BaseAmountInputFragment baseAmountInputFragment, View view) {
        Log_OC.getArray(baseAmountInputFragment, "this$0");
        int $i0 = baseAmountInputFragment.amount;
        baseAmountInputFragment.onNextBtnClick($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void refreshSuggestedAmountList(List list) {
        AmountSuggestionAdapter $r2 = this.adapter;
        $r2.setAmount(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setAmountInput(String str) {
        Integer $r2;
        int $i0 = str.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            this.amountInput = "0";
            int $i02 = Integer.parseInt("0");
            this.amount = $i02;
            return;
        }
        this.amountInput = str;
        String $r1 = StringExtKt.getRemoveAllLetters(str);
        $r2 = C13275r.m5455k($r1);
        int $i1 = $r2 != null ? $r2.intValue() : 0;
        this.amount = $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setAmountText(String str) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentAmountInputBinding $r3 = (FragmentAmountInputBinding) $r2;
        TextView $r4 = $r3.tvAmount;
        String $r5 = StringExtKt.getFormatAmount(str);
        $r4.setText($r5);
        InterfaceC8209a $r22 = requireBinding();
        FragmentAmountInputBinding $r32 = (FragmentAmountInputBinding) $r22;
        PinpadView $r6 = $r32.keyboard;
        $r6.setPasscode(str);
        this.amountInput = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setAmtViewColor(boolean z) {
        int $i0 = z ? C0001R.color.primaryTextColor : C0001R.color.colorLinkWater;
        InterfaceC8209a $r1 = requireBinding();
        FragmentAmountInputBinding $r2 = (FragmentAmountInputBinding) $r1;
        TextView $r3 = $r2.tvAmount;
        Context $r4 = requireContext();
        $r3.setTextColor(C1335a.m36324d($r4, $i0));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setDescText() {
        /*
            r11 = this;
            int r0 = r11.amount
            java.lang.String r1 = r11.getMessageText(r0)
            g.x.a r2 = r11.requireBinding()
            r4 = r2
            ai.kudi.agent.databinding.FragmentAmountInputBinding r4 = (ai.kudi.agent.databinding.FragmentAmountInputBinding) r4
            r3 = r4
            android.widget.TextView r5 = r3.tvDesc
            java.lang.String r6 = "requireBinding().tvDesc"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r6)
            if (r1 == 0) goto L20
            int r0 = r1.length()
            if (r0 != 0) goto L1e
            goto L20
        L1e:
            r7 = 0
            goto L21
        L20:
            r7 = 1
        L21:
            if (r7 == 0) goto L2a
            r8 = 0
            r9 = 1
            r10 = 0
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r5, r8, r9, r10)
            return
        L2a:
            r5.setText(r1)
            ai.kudi.agent.core.util.ViewExtKt.show(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment.setDescText():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupPinPadCallback() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentAmountInputBinding $r2 = (FragmentAmountInputBinding) $r1;
        PinpadView $r3 = $r2.keyboard;
        String $r4 = this.amountInput;
        $r3.setPasscode($r4);
        InterfaceC8209a $r12 = requireBinding();
        FragmentAmountInputBinding $r22 = (FragmentAmountInputBinding) $r12;
        PinpadView $r32 = $r22.keyboard;
        $r32.setViewProvider(new PinpadView.InterfaceC0836d() { // from class: ai.kudi.agent.common_screens.amount_input.ui.fragments.BaseAmountInputFragment$setupPinPadCallback$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onAppendChar(String str) {
                Log_OC.getArray(str, "char");
                BaseAmountInputFragment $r23 = BaseAmountInputFragment.this;
                String $r33 = $r23.amountInput;
                String $r13 = Log_OC.m10359a($r33, (Object) str);
                BaseAmountInputFragment $r24 = BaseAmountInputFragment.this;
                $r24.setAmountInput($r13);
                BaseAmountInputFragment $r25 = BaseAmountInputFragment.this;
                int $i0 = $r25.amount;
                $r25.onEnteredAmountChange($i0);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onDeleteChar() {
                int $i0;
                BaseAmountInputFragment $r13 = BaseAmountInputFragment.this;
                String $r23 = $r13.amountInput;
                BaseAmountInputFragment $r14 = BaseAmountInputFragment.this;
                String $r33 = $r14.amountInput;
                $i0 = C13277t.m5410Q($r33);
                if ($r23 == null) {
                    NullPointerException $r42 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw $r42;
                }
                String $r24 = $r23.substring(0, $i0);
                Log_OC.loadImage($r24, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                BaseAmountInputFragment $r15 = BaseAmountInputFragment.this;
                $r15.setAmountInput($r24);
                BaseAmountInputFragment $r16 = BaseAmountInputFragment.this;
                int $i02 = $r16.amount;
                $r16.onEnteredAmountChange($i02);
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
    public static /* synthetic */ void toggleAccountDetailHeader$default(BaseAmountInputFragment baseAmountInputFragment, boolean $z0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r2 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleAccountDetailHeader");
            throw $r2;
        }
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        baseAmountInputFragment.toggleAccountDetailHeader($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleNextBtn(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = requireBinding();
            FragmentAmountInputBinding $r2 = (FragmentAmountInputBinding) $r1;
            FloatingActionButton $r3 = $r2.fabNext;
            $r3.m26961t();
            return;
        }
        InterfaceC8209a $r12 = requireBinding();
        FragmentAmountInputBinding $r22 = (FragmentAmountInputBinding) $r12;
        FloatingActionButton $r32 = $r22.fabNext;
        $r32.m26969l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public BaseAmountInputViewModel createViewModel() {
        BaseAmountInputViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        BaseAmountInputViewModel $r1 = createViewModel();
        return $r1;
    }

    public int getMaximumAmount() {
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getMessageText(int $i0) {
        int $i1 = getMinimumAmount();
        if ($i0 < $i1) {
            String $r1 = String.valueOf(getMinimumAmount());
            return Log_OC.m10359a("Minimum amount is ", (Object) StringExtKt.getFormatAmount($r1));
        }
        int $i12 = getMaximumAmount();
        if ($i0 > $i12) {
            String $r12 = String.valueOf(getMaximumAmount());
            return Log_OC.m10359a("Maximum amount is ", (Object) StringExtKt.getFormatAmount($r12));
        }
        return null;
    }

    public int getMinimumAmount() {
        return 1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BaseAmountInputViewModel getScreenViewModel() {
        BaseAmountInputViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAmountInputBinding $r4 = FragmentAmountInputBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    public abstract void onNextBtnClick(int i);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        BaseAmountInputViewModel $r3 = getScreenViewModel();
        LiveData $r4 = $r3.getAmountInputLiveData();
        PreferenceActivity $r5 = getViewLifecycleOwner();
        $r4.observe($r5, new InterfaceC1584v() { // from class: ai.kudi.agent.common_screens.amount_input.ui.fragments.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setCheckable(Object obj) {
                BaseAmountInputFragment $r1 = BaseAmountInputFragment.this;
                AmountInputViewData $r32 = (AmountInputViewData) obj;
                BaseAmountInputFragment.m39130onViewCreated$lambda1($r1, $r32);
            }
        });
        InterfaceC8209a $r7 = requireBinding();
        FragmentAmountInputBinding $r8 = (FragmentAmountInputBinding) $r7;
        ImageButton $r9 = $r8.fabNext;
        ImageButton r15 = $r9;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.common_screens.amount_input.ui.fragments.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseAmountInputFragment $r2 = BaseAmountInputFragment.this;
                BaseAmountInputFragment.m39131onViewCreated$lambda2($r2, view2);
            }
        });
        toggleAccountDetailHeader$default(this, false, 1, null);
        BaseAmountInputViewModel $r32 = getScreenViewModel();
        int $i0 = getMinimumAmount();
        $r32.setMinAmount($i0);
        BaseAmountInputViewModel $r33 = getScreenViewModel();
        int $i02 = getMaximumAmount();
        $r33.setMaxAmount($i02);
        InterfaceC8209a $r72 = requireBinding();
        FragmentAmountInputBinding $r82 = (FragmentAmountInputBinding) $r72;
        RecyclerView $r11 = $r82.amountSuggestionRecyclerView;
        AmountSuggestionAdapter $r12 = this.adapter;
        $r11.setAdapter($r12);
        setupPinPadCallback();
        setAmountInput("0");
        int $i03 = this.amount;
        onEnteredAmountChange($i03);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMessageText(java.lang.String r13) {
        /*
            r12 = this;
            if (r13 == 0) goto Lb
            int r0 = r13.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            if (r1 == 0) goto L24
            g.x.a r2 = r12.requireBinding()
            r4 = r2
            ai.kudi.agent.databinding.FragmentAmountInputBinding r4 = (ai.kudi.agent.databinding.FragmentAmountInputBinding) r4
            r3 = r4
            android.widget.TextView r5 = r3.tvDesc
            java.lang.String r6 = "requireBinding().tvDesc"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r6)
            r7 = 0
            r8 = 1
            r9 = 0
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r5, r7, r8, r9)
            return
        L24:
            g.x.a r2 = r12.requireBinding()
            r10 = r2
            ai.kudi.agent.databinding.FragmentAmountInputBinding r10 = (ai.kudi.agent.databinding.FragmentAmountInputBinding) r10
            r3 = r10
            android.widget.TextView r5 = r3.tvDesc
            java.lang.String r6 = "requireBinding().tvDesc"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r6)
            ai.kudi.agent.core.util.ViewExtKt.show(r5)
            g.x.a r2 = r12.requireBinding()
            r11 = r2
            ai.kudi.agent.databinding.FragmentAmountInputBinding r11 = (ai.kudi.agent.databinding.FragmentAmountInputBinding) r11
            r3 = r11
            android.widget.TextView r5 = r3.tvDesc
            r5.setText(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment.setMessageText(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setScreenViewModel(BaseAmountInputViewModel baseAmountInputViewModel) {
        Log_OC.getArray(baseAmountInputViewModel, "<set-?>");
        this.screenViewModel = baseAmountInputViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void toast(String str) {
        Log_OC.getArray(str, "s");
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void toggleAccountDetailHeader(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = requireBinding();
            FragmentAmountInputBinding $r2 = (FragmentAmountInputBinding) $r1;
            View $r3 = $r2.containerAcctDetail;
            Log_OC.loadImage($r3, "requireBinding().containerAcctDetail");
            View r4 = $r3;
            ViewExtKt.show(r4);
            return;
        }
        InterfaceC8209a $r12 = requireBinding();
        FragmentAmountInputBinding $r22 = (FragmentAmountInputBinding) $r12;
        View $r32 = $r22.containerAcctDetail;
        Log_OC.loadImage($r32, "requireBinding().containerAcctDetail");
        View r42 = $r32;
        ViewExtKt.hide$default(r42, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void toggleLoader(boolean z) {
        Boolean $r1 = Boolean.valueOf(z);
        String $r2 = Log_OC.m10359a("isloading ", $r1);
        Object[] $r3 = new Object[0];
        Timber.wtf($r2, $r3);
        if (z) {
            InterfaceC8209a $r4 = requireBinding();
            FragmentAmountInputBinding $r5 = (FragmentAmountInputBinding) $r4;
            ProgressBar $r6 = $r5.ivLoader;
            Log_OC.loadImage($r6, "requireBinding().ivLoader");
            ViewExtKt.show($r6);
            return;
        }
        InterfaceC8209a $r42 = requireBinding();
        FragmentAmountInputBinding $r52 = (FragmentAmountInputBinding) $r42;
        ProgressBar $r62 = $r52.ivLoader;
        Log_OC.loadImage($r62, "requireBinding().ivLoader");
        ViewExtKt.hide$default($r62, false, 1, null);
    }
}
