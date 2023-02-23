package ai.kudi.agent.settings.insurance.p026ui;

import ai.kudi.agent.settings.insurance.presentation.CashInsuranceViewModel;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.insurance.ui.CashInsuranceFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CashInsuranceFragment_MembersInjector implements InterfaceC9463a<CashInsuranceFragment> {
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<CashInsuranceViewModel> viewModelProvider;

    public CashInsuranceFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.viewModelProvider = interfaceC11700a;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CashInsuranceFragment_MembersInjector $r2 = new CashInsuranceFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectServerTimeToTransactionDayMapper(CashInsuranceFragment cashInsuranceFragment, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper) {
        cashInsuranceFragment.serverTimeToTransactionDayMapper = serverTimeToTransactionDayMapper;
    }

    public static void injectViewModel(CashInsuranceFragment cashInsuranceFragment, CashInsuranceViewModel cashInsuranceViewModel) {
        cashInsuranceFragment.viewModel = cashInsuranceViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CashInsuranceFragment cashInsuranceFragment) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        CashInsuranceViewModel $r4 = (CashInsuranceViewModel) $r3;
        injectViewModel(cashInsuranceFragment, $r4);
        InterfaceC11700a $r22 = this.serverTimeToTransactionDayMapperProvider;
        Object $r32 = $r22.get();
        ServerTimeToTransactionDayMapper $r5 = (ServerTimeToTransactionDayMapper) $r32;
        injectServerTimeToTransactionDayMapper(cashInsuranceFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CashInsuranceFragment $r2 = (CashInsuranceFragment) obj;
        injectMembers($r2);
    }
}
