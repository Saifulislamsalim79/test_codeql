package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.usecases.CheckPosEligibility;
import ai.kudi.agent.pos.usecases.GetIsSuperAgentOrAggregator;
import ai.kudi.agent.pos.usecases.GetPosDeviceInfo;
import ai.kudi.agent.pos.usecases.GetPosDiscount;
import ai.kudi.agent.pos.usecases.GetPosRequestsSummaryUseCase;
import ai.kudi.agent.pos.usecases.PriceLookupRequest;
import ai.kudi.agent.pos.usecases.TrackPosRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.viewModels.PosEligibilityViewModel_Factory */
/* loaded from: classes.dex */
public final class PosEligibilityViewModel_Factory implements InterfaceC9468d<PosEligibilityViewModel> {
    private final InterfaceC11700a<GetPosDiscount> checkPosDiscountProvider;
    private final InterfaceC11700a<CheckPosEligibility> checkPosEligibilityProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<GetIsSuperAgentOrAggregator> getIsSuperAgentOrAggregatorProvider;
    private final InterfaceC11700a<GetPosDeviceInfo> getPosDeviceInfoProvider;
    private final InterfaceC11700a<GetPosRequestsSummaryUseCase> getPosRequestsSummaryUseCaseProvider;
    private final InterfaceC11700a<PriceLookupRequest> priceLookupRequestProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<TerminalRequestNavigator> terminalRequestNavigatorProvider;
    private final InterfaceC11700a<TrackPosRequest> trackPOSProvider;

    public PosEligibilityViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10) {
        this.checkPosEligibilityProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.checkPosDiscountProvider = interfaceC11700a3;
        this.terminalRequestNavigatorProvider = interfaceC11700a4;
        this.priceLookupRequestProvider = interfaceC11700a5;
        this.getPosDeviceInfoProvider = interfaceC11700a6;
        this.trackPOSProvider = interfaceC11700a7;
        this.getPosRequestsSummaryUseCaseProvider = interfaceC11700a8;
        this.getIsSuperAgentOrAggregatorProvider = interfaceC11700a9;
        this.sharedPreferencesProvider = interfaceC11700a10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosEligibilityViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10) {
        PosEligibilityViewModel_Factory $r10 = new PosEligibilityViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9, interfaceC11700a10);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosEligibilityViewModel newInstance(CheckPosEligibility checkPosEligibility, FetchCurrentUser fetchCurrentUser, GetPosDiscount getPosDiscount, TerminalRequestNavigator terminalRequestNavigator, PriceLookupRequest priceLookupRequest, GetPosDeviceInfo getPosDeviceInfo, TrackPosRequest trackPosRequest, GetPosRequestsSummaryUseCase getPosRequestsSummaryUseCase, GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator, SharedPreferences sharedPreferences) {
        PosEligibilityViewModel $r10 = new PosEligibilityViewModel(checkPosEligibility, fetchCurrentUser, getPosDiscount, terminalRequestNavigator, priceLookupRequest, getPosDeviceInfo, trackPosRequest, getPosRequestsSummaryUseCase, getIsSuperAgentOrAggregator, sharedPreferences);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosEligibilityViewModel multiply() {
        InterfaceC11700a $r1 = this.checkPosEligibilityProvider;
        Object $r2 = $r1.get();
        CheckPosEligibility $r3 = (CheckPosEligibility) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.checkPosDiscountProvider;
        Object $r23 = $r13.get();
        GetPosDiscount getPosDiscount = (GetPosDiscount) $r23;
        InterfaceC11700a $r14 = this.terminalRequestNavigatorProvider;
        Object $r24 = $r14.get();
        TerminalRequestNavigator terminalRequestNavigator = (TerminalRequestNavigator) $r24;
        InterfaceC11700a $r15 = this.priceLookupRequestProvider;
        Object $r25 = $r15.get();
        PriceLookupRequest priceLookupRequest = (PriceLookupRequest) $r25;
        InterfaceC11700a $r16 = this.getPosDeviceInfoProvider;
        Object $r26 = $r16.get();
        GetPosDeviceInfo getPosDeviceInfo = (GetPosDeviceInfo) $r26;
        InterfaceC11700a $r17 = this.trackPOSProvider;
        Object $r27 = $r17.get();
        TrackPosRequest $r9 = (TrackPosRequest) $r27;
        InterfaceC11700a $r18 = this.getPosRequestsSummaryUseCaseProvider;
        Object $r28 = $r18.get();
        GetPosRequestsSummaryUseCase $r10 = (GetPosRequestsSummaryUseCase) $r28;
        InterfaceC11700a $r19 = this.getIsSuperAgentOrAggregatorProvider;
        Object $r29 = $r19.get();
        GetIsSuperAgentOrAggregator $r11 = (GetIsSuperAgentOrAggregator) $r29;
        InterfaceC11700a $r110 = this.sharedPreferencesProvider;
        Object $r210 = $r110.get();
        SharedPreferences $r122 = (SharedPreferences) $r210;
        PosEligibilityViewModel $r132 = newInstance($r3, $r4, getPosDiscount, terminalRequestNavigator, priceLookupRequest, getPosDeviceInfo, $r9, $r10, $r11, $r122);
        return $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40110multiply() {
        PosEligibilityViewModel $r1 = multiply();
        return $r1;
    }
}
