package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.savings.data.model.SavingsBalance;
import ai.kudi.agent.savings.viewmodel.SavingsPlanViewModel;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11288b;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.savings.viewmodel.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0495c implements InterfaceC11288b {

    /* renamed from: d */
    public static final /* synthetic */ C0495c f1307d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0495c $r0 = new C0495c();
        f1307d = $r0;
    }

    private /* synthetic */ C0495c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11288b
    /* renamed from: a */
    public final Object mo11200a(Object obj, Object obj2) {
        SavingsBalance $r4 = (SavingsBalance) obj;
        List $r5 = (List) obj2;
        SavingsPlanViewModel.TransactionsAndBalance $r1 = SavingsPlanViewModel.m40630retrieveSavingPlan$lambda2($r4, $r5);
        return $r1;
    }
}
