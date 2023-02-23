package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.savings.data.model.SavingTransactionUIModel;
import ai.kudi.agent.savings.data.model.SavingsItemModel;
import java.util.Date;
import java.util.Set;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SavingsViewModel.kt */
@f(c = "ai.kudi.agent.savings.viewmodel.SavingsViewModel$transformation$2$1", f = "SavingsViewModel.kt", l = {}, m = "invokeSuspend")
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "<anonymous parameter 0>", "Lai/kudi/agent/savings/data/model/SavingsItemModel$SavingsTransaction;", "s2"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsViewModel$transformation$2$1 extends AbstractC11745k implements InterfaceC11772q<SavingsItemModel.SavingsTransaction, SavingsItemModel.SavingsTransaction, InterfaceC11714d<? super SavingsItemModel>, Object> {
    /* synthetic */ Object defaultValue;
    int label;
    final /* synthetic */ SavingsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsViewModel$transformation$2$1(SavingsViewModel savingsViewModel, InterfaceC11714d interfaceC11714d) {
        super(3, interfaceC11714d);
        this.this$0 = savingsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(SavingsItemModel.SavingsTransaction savingsTransaction, SavingsItemModel.SavingsTransaction savingsTransaction2, InterfaceC11714d interfaceC11714d) {
        SavingsViewModel $r2 = this.this$0;
        SavingsViewModel$transformation$2$1 $r6 = new SavingsViewModel$transformation$2$1($r2, interfaceC11714d);
        $r6.defaultValue = savingsTransaction2;
        C13666w $r7 = C13666w.f30112a;
        Object $r3 = $r6.invokeSuspend($r7);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ Object invoke(SavingsItemModel.SavingsTransaction savingsTransaction, SavingsItemModel.SavingsTransaction savingsTransaction2, InterfaceC11714d<? super SavingsItemModel> interfaceC11714d) {
        SavingsItemModel.SavingsTransaction $r4 = savingsTransaction;
        SavingsItemModel.SavingsTransaction $r5 = savingsTransaction2;
        InterfaceC11714d<? super SavingsItemModel> $r6 = interfaceC11714d;
        Object $r1 = invoke2($r4, $r5, (InterfaceC11714d) $r6);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        SavingTransactionUIModel $r6;
        SavingTransactionUIModel $r62;
        C11734d.m10387d();
        int $i0 = this.label;
        if ($i0 != 0) {
            IllegalStateException $r10 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw $r10;
        }
        C13291q.m5357b(obj);
        Object $r1 = this.defaultValue;
        SavingsItemModel.SavingsTransaction $r2 = (SavingsItemModel.SavingsTransaction) $r1;
        SavingsViewModel $r3 = this.this$0;
        String $r4 = null;
        String $r5 = ($r2 == null || ($r6 = $r2.getTransaction()) == null) ? null : $r6.getTransactionDate();
        boolean $z0 = $r3.shouldAddHeader($r5);
        if ($z0) {
            SavingsViewModel $r32 = this.this$0;
            if ($r2 != null && ($r62 = $r2.getTransaction()) != null) {
                $r4 = $r62.getTransactionDate();
            }
            Log_OC.append($r4);
            Date $r7 = StringExtKt.formatKudiDateAlt2($r4);
            String $r42 = $r32.formatDate($r7);
            SavingsViewModel $r33 = this.this$0;
            Set $r8 = $r33.existingDays;
            $r8.add($r42);
            SavingsItemModel.SavingsTransactionDate $r9 = new SavingsItemModel.SavingsTransactionDate($r42);
            return $r9;
        }
        return null;
    }
}
