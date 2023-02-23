package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.savings.data.model.SavingTransactionItem;
import ai.kudi.agent.savings.data.model.SavingTransactionUIModel;
import ai.kudi.agent.savings.data.model.SavingsItemModel;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SavingsViewModel.kt */
@f(c = "ai.kudi.agent.savings.viewmodel.SavingsViewModel$transformation$1$1", f = "SavingsViewModel.kt", l = {}, m = "invokeSuspend")
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/savings/data/model/SavingsItemModel$SavingsTransaction;", "item", "Lai/kudi/agent/savings/data/model/SavingTransactionItem;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsViewModel$transformation$1$1 extends AbstractC11745k implements InterfaceC11771p<SavingTransactionItem, InterfaceC11714d<? super SavingsItemModel.SavingsTransaction>, Object> {
    int label;
    /* synthetic */ Object value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavingsViewModel$transformation$1$1(InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        SavingsViewModel$transformation$1$1 r3 = new SavingsViewModel$transformation$1$1(interfaceC11714d);
        r3.value = obj;
        SavingsViewModel$transformation$1$1 $r2 = r3;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(SavingTransactionItem savingTransactionItem, InterfaceC11714d interfaceC11714d) {
        InterfaceC11714d $r2 = create(savingTransactionItem, interfaceC11714d);
        SavingsViewModel$transformation$1$1 $r0 = (SavingsViewModel$transformation$1$1) $r2;
        C13666w $r3 = C13666w.f30112a;
        Object $r4 = $r0.invokeSuspend($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ Object invoke(SavingTransactionItem savingTransactionItem, InterfaceC11714d<? super SavingsItemModel.SavingsTransaction> interfaceC11714d) {
        SavingTransactionItem $r3 = savingTransactionItem;
        InterfaceC11714d<? super SavingsItemModel.SavingsTransaction> $r4 = interfaceC11714d;
        Object $r1 = invoke2($r3, (InterfaceC11714d) $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        C11734d.m10387d();
        int $i0 = this.label;
        if ($i0 != 0) {
            IllegalStateException $r5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw $r5;
        }
        C13291q.m5357b(obj);
        Object $r2 = this.value;
        SavingTransactionItem $r3 = (SavingTransactionItem) $r2;
        SavingTransactionUIModel $r1 = $r3.toSavingItemModel();
        SavingsItemModel.SavingsTransaction $r4 = new SavingsItemModel.SavingsTransaction($r1);
        return $r4;
    }
}
