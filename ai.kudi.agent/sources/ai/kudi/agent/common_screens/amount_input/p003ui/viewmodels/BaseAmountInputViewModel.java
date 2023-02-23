package ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels;

import ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.AmountInputViewData;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.BaseAmountInputViewData;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import androidx.lifecycle.C1583u;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BaseAmountInputViewModel.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "VD", "Lai/kudi/agent/common_screens/amount_input/ui/viewdata/BaseAmountInputViewData;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "()V", "_amountInputMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lai/kudi/agent/common_screens/amount_input/ui/viewdata/AmountInputViewData;", TransactionField.AMOUNT, "", "amountInputLiveData", "Landroidx/lifecycle/LiveData;", "getAmountInputLiveData", "()Landroidx/lifecycle/LiveData;", "amountInputViewData", "amountString", "", "maxAmount", "maxAmountString", "minAmount", "minAmountString", "computeAmountSuggestionSet", "", "deployInputChanges", "isAmountWithinRange", "", "isBeneathAmount", "isOverAmount", "onAmountInputChange", "setAmount", "setMaxAmount", "setMinAmount", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.common_screens.amount_input.ui.viewmodels.BaseAmountInputViewModel */
/* loaded from: classes.dex */
public abstract class BaseAmountInputViewModel<VD extends BaseAmountInputViewData> extends BaseViewModel<VD> {
    private final C1583u<AmountInputViewData> _amountInputMutableLiveData;
    private int amount;
    private final LiveData<AmountInputViewData> amountInputLiveData;
    private AmountInputViewData amountInputViewData;
    private String amountString;
    private String maxAmountString;
    private String minAmountString;
    private int minAmount = 500;
    private int maxAmount = Integer.MAX_VALUE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public BaseAmountInputViewModel() {
        int $i0 = this.amount;
        String $r1 = String.valueOf($i0);
        this.amountString = $r1;
        int $i02 = this.minAmount;
        String $r12 = String.valueOf($i02);
        this.minAmountString = $r12;
        int $i03 = this.maxAmount;
        String $r13 = String.valueOf($i03);
        this.maxAmountString = $r13;
        AmountInputViewData $r2 = new AmountInputViewData(null, false, null, null, 15, null);
        this.amountInputViewData = $r2;
        C1583u $r3 = new C1583u();
        this._amountInputMutableLiveData = $r3;
        this.amountInputLiveData = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void computeAmountSuggestionSet(int i) {
        AmountInputViewData $r1 = this.amountInputViewData;
        int $i0 = this.minAmount;
        int $i1 = this.maxAmount;
        List $r2 = IntExtKt.range$default(i, $i0, $i1, 0, 8, null);
        $r1.setSuggestedAmountList($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void deployInputChanges() {
        C1583u $r1 = this._amountInputMutableLiveData;
        AmountInputViewData $r2 = this.amountInputViewData;
        $r1.setValue($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final boolean isAmountWithinRange() {
        int $i0 = this.minAmount;
        int $i1 = this.maxAmount;
        int $i2 = this.amount;
        return $i0 <= $i2 && $i2 <= $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final boolean isBeneathAmount() {
        int $i1 = this.amount;
        int $i0 = this.minAmount;
        return $i1 < $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final boolean isOverAmount() {
        int $i1 = this.amount;
        int $i0 = this.maxAmount;
        return $i1 > $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void setAmount(int i) {
        this.amount = i;
        String $r1 = String.valueOf(i);
        this.amountString = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final LiveData getAmountInputLiveData() {
        LiveData r1 = this.amountInputLiveData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void onAmountInputChange(int i) {
        setAmount(i);
        AmountInputViewData $r1 = this.amountInputViewData;
        boolean $z0 = isAmountWithinRange();
        $r1.setValidAmount($z0);
        String $r2 = this.amountString;
        AmountInputViewData $r12 = this.amountInputViewData;
        this.amountInputViewData = AmountInputViewData.copy$default($r12, null, false, $r2, null, 10, null);
        if (i == 0) {
            i = 1;
        }
        computeAmountSuggestionSet(i);
        deployInputChanges();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setMaxAmount(int i) {
        this.maxAmount = i;
        String $r1 = String.valueOf(i);
        this.maxAmountString = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setMinAmount(int i) {
        this.minAmount = i;
        String $r1 = String.valueOf(i);
        this.minAmountString = $r1;
    }
}
