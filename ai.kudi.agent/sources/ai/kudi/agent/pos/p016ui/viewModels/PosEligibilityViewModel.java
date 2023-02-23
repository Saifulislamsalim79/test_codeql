package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.pos.data.LeasePosEligibilityResponse;
import ai.kudi.agent.pos.data.PosDiscount;
import ai.kudi.agent.pos.data.PosPriceLookupResponse;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.data.PosRequestsSummaryModel;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.PosActivity;
import ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import ai.kudi.agent.pos.p016ui.widget.PosRequestsSummaryViewState;
import ai.kudi.agent.pos.usecases.CheckPosEligibility;
import ai.kudi.agent.pos.usecases.GetIsSuperAgentOrAggregator;
import ai.kudi.agent.pos.usecases.GetPosDeviceInfo;
import ai.kudi.agent.pos.usecases.GetPosDiscount;
import ai.kudi.agent.pos.usecases.GetPosRequestsSummaryUseCase;
import ai.kudi.agent.pos.usecases.PriceLookupRequest;
import ai.kudi.agent.pos.usecases.TrackPosRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: PosEligibilityViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J(\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0002H\u0016J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020\u0019J\u0014\u00101\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u000e\u00102\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u001cJ\u000e\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020\u0019H\u0002J\u0006\u00107\u001a\u00020\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m10421d2 = {"Lai/kudi/agent/pos/ui/viewModels/PosEligibilityViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pos/ui/data/PosEligibilityViewData;", "checkPosEligibility", "Lai/kudi/agent/pos/usecases/CheckPosEligibility;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "checkPosDiscount", "Lai/kudi/agent/pos/usecases/GetPosDiscount;", "terminalRequestNavigator", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "priceLookupRequest", "Lai/kudi/agent/pos/usecases/PriceLookupRequest;", "getPosDeviceInfo", "Lai/kudi/agent/pos/usecases/GetPosDeviceInfo;", "trackPOS", "Lai/kudi/agent/pos/usecases/TrackPosRequest;", "getPosRequestsSummaryUseCase", "Lai/kudi/agent/pos/usecases/GetPosRequestsSummaryUseCase;", "getIsSuperAgentOrAggregator", "Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/pos/usecases/CheckPosEligibility;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/pos/usecases/GetPosDiscount;Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;Lai/kudi/agent/pos/usecases/PriceLookupRequest;Lai/kudi/agent/pos/usecases/GetPosDeviceInfo;Lai/kudi/agent/pos/usecases/TrackPosRequest;Lai/kudi/agent/pos/usecases/GetPosRequestsSummaryUseCase;Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;Landroid/content/SharedPreferences;)V", "checkEligibility", "", "generateResult", "", "Lai/kudi/agent/pos/data/PosTypeData;", "posDiscounts", "Lai/kudi/agent/pos/data/PosDiscount;", "priceLookUpResponse", "Lai/kudi/agent/pos/data/PosPriceLookupResponse;", "getPosDiscount", "", "discount", "price", "getPosPriceAndDiscount", "getPosSummary", "getPosTerminalDetails", "handleDiscount", "replacementDiscount", "posTypeData", "requestType", "", "initialData", "isSuperAgentOrAggeregator", "", "navigateToActivatePos", "navigateToLeaseTermsAndConditions", "navigateToMakePayment", "navigateToPosOrderHistoryFragment", "posFilterType", "Lai/kudi/agent/pos/ui/model/PosFilterType;", "trackPosRequest", "updateIsNewFeature", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.viewModels.PosEligibilityViewModel */
/* loaded from: classes.dex */
public final class PosEligibilityViewModel extends BaseViewModel<PosEligibilityViewData> {
    private final GetPosDiscount checkPosDiscount;
    private final CheckPosEligibility checkPosEligibility;
    private final FetchCurrentUser fetchCurrentUser;
    private final GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator;
    private final GetPosDeviceInfo getPosDeviceInfo;
    private final GetPosRequestsSummaryUseCase getPosRequestsSummaryUseCase;
    private final PriceLookupRequest priceLookupRequest;
    private final SharedPreferences sharedPreferences;
    private final TerminalRequestNavigator terminalRequestNavigator;
    private final TrackPosRequest trackPOS;

    public PosEligibilityViewModel(CheckPosEligibility checkPosEligibility, FetchCurrentUser fetchCurrentUser, GetPosDiscount getPosDiscount, TerminalRequestNavigator terminalRequestNavigator, PriceLookupRequest priceLookupRequest, GetPosDeviceInfo getPosDeviceInfo, TrackPosRequest trackPosRequest, GetPosRequestsSummaryUseCase getPosRequestsSummaryUseCase, GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator, SharedPreferences sharedPreferences) {
        Log_OC.getArray(checkPosEligibility, "checkPosEligibility");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(getPosDiscount, "checkPosDiscount");
        Log_OC.getArray(terminalRequestNavigator, "terminalRequestNavigator");
        Log_OC.getArray(priceLookupRequest, "priceLookupRequest");
        Log_OC.getArray(getPosDeviceInfo, "getPosDeviceInfo");
        Log_OC.getArray(trackPosRequest, "trackPOS");
        Log_OC.getArray(getPosRequestsSummaryUseCase, "getPosRequestsSummaryUseCase");
        Log_OC.getArray(getIsSuperAgentOrAggregator, "getIsSuperAgentOrAggregator");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.checkPosEligibility = checkPosEligibility;
        this.fetchCurrentUser = fetchCurrentUser;
        this.checkPosDiscount = getPosDiscount;
        this.terminalRequestNavigator = terminalRequestNavigator;
        this.priceLookupRequest = priceLookupRequest;
        this.getPosDeviceInfo = getPosDeviceInfo;
        this.trackPOS = trackPosRequest;
        this.getPosRequestsSummaryUseCase = getPosRequestsSummaryUseCase;
        this.getIsSuperAgentOrAggregator = getIsSuperAgentOrAggregator;
        this.sharedPreferences = sharedPreferences;
        checkEligibility();
        getPosPriceAndDiscount();
        getPosTerminalDetails();
        getPosSummary();
        trackPosRequest();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void checkEligibility() {
        ViewData $r1 = getState();
        PosEligibilityViewData $r2 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r1, null, null, null, null, true, null, null, null, null, null, null, 2031, null);
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.ui.viewModels.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = PosEligibilityViewModel.m40093checkEligibility$lambda16($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                LeasePosEligibilityResponse $r32 = (LeasePosEligibilityResponse) obj;
                PosEligibilityViewModel.m40094checkEligibility$lambda19($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PosEligibilityViewModel.m40095checkEligibility$lambda20($r12, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkEligibility$lambda-16  reason: not valid java name */
    public static final InterfaceC11692s m40093checkEligibility$lambda16(PosEligibilityViewModel posEligibilityViewModel, User user) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        Log_OC.getArray(user, "it");
        CheckPosEligibility $r2 = posEligibilityViewModel.checkPosEligibility;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001a */
    /* renamed from: checkEligibility$lambda-19  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40094checkEligibility$lambda19(ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel r47, ai.kudi.agent.pos.data.LeasePosEligibilityResponse r48) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel.m40094checkEligibility$lambda19(ai.kudi.agent.pos.ui.viewModels.PosEligibilityViewModel, ai.kudi.agent.pos.data.LeasePosEligibilityResponse):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkEligibility$lambda-20  reason: not valid java name */
    public static final void m40095checkEligibility$lambda20(PosEligibilityViewModel posEligibilityViewModel, Throwable th) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        ViewData $r3 = posEligibilityViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        PosEligibilityViewData.Error $r2 = new PosEligibilityViewData.Error((String) $r6, null, 2, null);
        PosEligibilityViewData $r4 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r3, null, null, null, null, false, $r2, null, null, null, null, null, 1999, null);
        posEligibilityViewModel.publish($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036 A[EDGE_INSN: B:32:0x0036->B:15:0x0036 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List generateResult(java.util.List r19, ai.kudi.agent.pos.data.PosPriceLookupResponse r20) {
        /*
            r18 = this;
            r0 = r19
            java.util.Iterator r2 = r0.iterator()
        L6:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r5 = r2.next()
            r6 = r5
            r8 = r5
            ai.kudi.agent.pos.data.PosDiscount r8 = (ai.kudi.agent.pos.data.PosDiscount) r8
            r7 = r8
            java.lang.String r9 = r7.getRequestType()
            java.lang.String r10 = "LEASE"
            boolean r3 = kotlin.p483e0.p485d.Log_OC.append(r9, r10)
            if (r3 != 0) goto L31
            java.lang.String r9 = r7.getRequestType()
            java.lang.String r10 = "PAID"
            boolean r3 = kotlin.p483e0.p485d.Log_OC.append(r9, r10)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            goto L32
        L31:
            r3 = 1
        L32:
            if (r3 == 0) goto L6
            goto L36
        L35:
            r6 = 0
        L36:
            r11 = r6
            ai.kudi.agent.pos.data.PosDiscount r11 = (ai.kudi.agent.pos.data.PosDiscount) r11
            r7 = r11
            r0 = r19
            java.util.Iterator r2 = r0.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r5 = r2.next()
            r6 = r5
            r13 = r5
            ai.kudi.agent.pos.data.PosDiscount r13 = (ai.kudi.agent.pos.data.PosDiscount) r13
            r12 = r13
            java.lang.String r9 = r12.getRequestType()
            java.lang.String r10 = "REPLACEMENT"
            boolean r3 = kotlin.p483e0.p485d.Log_OC.append(r9, r10)
            if (r3 == 0) goto L40
            goto L5d
        L5c:
            r6 = 0
        L5d:
            r14 = r6
            ai.kudi.agent.pos.data.PosDiscount r14 = (ai.kudi.agent.pos.data.PosDiscount) r14
            r12 = r14
            r0 = r19
            java.util.Iterator r2 = r0.iterator()
        L67:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r5 = r2.next()
            r16 = r5
            ai.kudi.agent.pos.data.PosDiscount r16 = (ai.kudi.agent.pos.data.PosDiscount) r16
            r15 = r16
            java.lang.String r9 = r15.getRequestType()
            java.lang.String r10 = "REPAIR_REPLACEMENT"
            boolean r3 = kotlin.p483e0.p485d.Log_OC.append(r9, r10)
            if (r3 == 0) goto L67
            r4 = r5
        L84:
            r17 = r4
            ai.kudi.agent.pos.data.PosDiscount r17 = (ai.kudi.agent.pos.data.PosDiscount) r17
            r15 = r17
            r0 = r20
            java.util.List r19 = r0.getPosTypeData()
            java.lang.String r10 = "REPLACEMENT"
            r0 = r18
            r1 = r19
            r0.handleDiscount(r12, r1, r10)
            java.lang.String r10 = "REPAIR_REPLACEMENT"
            r0 = r18
            r1 = r19
            r0.handleDiscount(r15, r1, r10)
            if (r7 == 0) goto Lad
            java.lang.String r10 = "LEASE"
            r0 = r18
            r1 = r19
            r0.handleDiscount(r7, r1, r10)
        Lad:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel.generateResult(java.util.List, ai.kudi.agent.pos.data.PosPriceLookupResponse):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final double getPosDiscount(double d, double d2) {
        Double.isNaN(100.0d);
        double $d0 = d / 100.0d;
        return d2 - ($d0 * d2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getPosPriceAndDiscount() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.ui.viewModels.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = PosEligibilityViewModel.m40096getPosPriceAndDiscount$lambda0($r12, $r42);
                return $r22;
            }
        });
        Log_OC.loadImage($r4, "fetchCurrentUser.execute().flatMapObservable {\n            publish(state.copy(customerType = it.customerType))\n            priceLookupRequest.execute(PriceLookupRequest.PriceLookUpRequestInput(it.sessionId))\n        }");
        FetchCurrentUser $r12 = this.fetchCurrentUser;
        AbstractC11696w $r22 = FetchCurrentUser.execute$default($r12, null, null, 3, null);
        AbstractC11688p $r6 = $r22.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.ui.viewModels.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PosEligibilityViewModel $r13 = PosEligibilityViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r23 = PosEligibilityViewModel.m40097getPosPriceAndDiscount$lambda1($r13, $r42);
                return $r23;
            }
        });
        C0381c $r7 = C0381c.f878d;
        FavoritesArrayAdapter $r11 = AbstractC11688p.m10491r0($r4, $r6.m10526T($r7), new InterfaceC11288b() { // from class: ai.kudi.agent.pos.ui.viewModels.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11288b
            /* renamed from: a */
            public final Object mo11200a(Object obj, Object obj2) {
                PosEligibilityViewModel $r13 = PosEligibilityViewModel.this;
                PosPriceLookupResponse $r5 = (PosPriceLookupResponse) obj;
                List $r23 = (List) obj2;
                return PosEligibilityViewModel.m40099getPosPriceAndDiscount$lambda3($r13, $r5, $r23);
            }
        }).e0(new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosEligibilityViewModel $r13 = PosEligibilityViewModel.this;
                List $r3 = (List) obj;
                PosEligibilityViewModel.m40100getPosPriceAndDiscount$lambda4($r13, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosEligibilityViewModel $r13 = PosEligibilityViewModel.this;
                Throwable $r3 = (Throwable) obj;
                PosEligibilityViewModel.m40101getPosPriceAndDiscount$lambda5($r13, $r3);
            }
        });
        C11280b $r122 = getCompositeDisposable();
        $r122.b($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosPriceAndDiscount$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40096getPosPriceAndDiscount$lambda0(PosEligibilityViewModel posEligibilityViewModel, User user) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        Log_OC.getArray(user, "it");
        ViewData $r3 = posEligibilityViewModel.getState();
        PosEligibilityViewData $r4 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r3, null, null, null, null, false, null, user.customerType, null, null, null, null, 1983, null);
        posEligibilityViewModel.publish($r4);
        PriceLookupRequest $r5 = posEligibilityViewModel.priceLookupRequest;
        String $r2 = user.getSessionId();
        Log_OC.loadImage($r2, "it.sessionId");
        PriceLookupRequest.PriceLookUpRequestInput $r6 = new PriceLookupRequest.PriceLookUpRequestInput($r2);
        AbstractC11688p $r7 = $r5.execute($r6);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosPriceAndDiscount$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40097getPosPriceAndDiscount$lambda1(PosEligibilityViewModel posEligibilityViewModel, User user) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        Log_OC.getArray(user, "it");
        GetPosDiscount $r2 = posEligibilityViewModel.checkPosDiscount;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosPriceAndDiscount$lambda-2  reason: not valid java name */
    public static final List m40098getPosPriceAndDiscount$lambda2(Throwable th) {
        List $r0;
        Log_OC.getArray(th, "it");
        $r0 = C13726r.m3891e();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosPriceAndDiscount$lambda-3  reason: not valid java name */
    public static final List m40099getPosPriceAndDiscount$lambda3(PosEligibilityViewModel posEligibilityViewModel, PosPriceLookupResponse posPriceLookupResponse, List list) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        Log_OC.getArray(posPriceLookupResponse, "priceLookUpResponse");
        Log_OC.getArray(list, "posDiscounts");
        List $r1 = posEligibilityViewModel.generateResult(list, posPriceLookupResponse);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosPriceAndDiscount$lambda-4  reason: not valid java name */
    public static final void m40100getPosPriceAndDiscount$lambda4(PosEligibilityViewModel posEligibilityViewModel, List list) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        ViewData $r2 = posEligibilityViewModel.getState();
        PosEligibilityViewData $r3 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r2, null, null, null, null, false, null, null, list, null, null, null, 1903, null);
        posEligibilityViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosPriceAndDiscount$lambda-5  reason: not valid java name */
    public static final void m40101getPosPriceAndDiscount$lambda5(PosEligibilityViewModel posEligibilityViewModel, Throwable th) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        ViewData $r3 = posEligibilityViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        PosEligibilityViewData.Error $r2 = new PosEligibilityViewData.Error((String) $r6, null, 2, null);
        PosEligibilityViewData $r4 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r3, null, null, null, null, false, $r2, null, null, null, null, null, 2015, null);
        posEligibilityViewModel.publish($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getPosSummary() {
        boolean $z0 = isSuperAgentOrAggeregator();
        if ($z0) {
            ViewData $r1 = getState();
            PosRequestsSummaryViewState $r3 = new PosRequestsSummaryViewState(true, 0, 0, 0, 14, null);
            PosEligibilityViewData $r2 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r1, null, null, null, null, false, null, null, null, null, null, $r3, 1023, null);
            publish($r2);
            FetchCurrentUser $r4 = this.fetchCurrentUser;
            AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
            AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.ui.viewModels.Item
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                    User $r42 = (User) obj;
                    InterfaceC11692s $r22 = PosEligibilityViewModel.m40102getPosSummary$lambda13($r12, $r42);
                    return $r22;
                }
            });
            FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.MultiDexExtractor$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                    PosRequestsSummaryModel $r32 = (PosRequestsSummaryModel) obj;
                    PosEligibilityViewModel.m40103getPosSummary$lambda14($r12, $r32);
                }
            }, new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.OrFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                    Throwable $r32 = (Throwable) obj;
                    PosEligibilityViewModel.m40104getPosSummary$lambda15($r12, $r32);
                }
            });
            C11280b $r11 = getCompositeDisposable();
            $r11.b($r10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosSummary$lambda-13  reason: not valid java name */
    public static final InterfaceC11692s m40102getPosSummary$lambda13(PosEligibilityViewModel posEligibilityViewModel, User user) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        Log_OC.getArray(user, "it");
        GetPosRequestsSummaryUseCase $r2 = posEligibilityViewModel.getPosRequestsSummaryUseCase;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosSummary$lambda-14  reason: not valid java name */
    public static final void m40103getPosSummary$lambda14(PosEligibilityViewModel posEligibilityViewModel, PosRequestsSummaryModel posRequestsSummaryModel) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        int $i0 = posRequestsSummaryModel.getTotalTerminalsCount();
        int $i1 = posRequestsSummaryModel.getAssignedTerminalsCount();
        int $i2 = posRequestsSummaryModel.getUnAssignedTerminalsCount();
        PosRequestsSummaryViewState $r2 = new PosRequestsSummaryViewState(false, $i0, $i1, $i2);
        ViewData $r3 = posEligibilityViewModel.getState();
        PosEligibilityViewData $r4 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r3, null, null, null, null, false, null, null, null, null, null, $r2, 1023, null);
        posEligibilityViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosSummary$lambda-15  reason: not valid java name */
    public static final void m40104getPosSummary$lambda15(PosEligibilityViewModel posEligibilityViewModel, Throwable th) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        ViewData $r3 = posEligibilityViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        PosEligibilityViewData.Error $r2 = new PosEligibilityViewData.Error(null, (String) $r6, 1, null);
        PosEligibilityViewData $r4 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r3, null, null, null, null, false, $r2, null, null, null, null, null, 2015, null);
        posEligibilityViewModel.publish($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getPosTerminalDetails() {
        GetPosDeviceInfo $r2 = this.getPosDeviceInfo;
        AbstractC11688p $r3 = $r2.execute();
        Object object = new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosEligibilityViewModel $r1 = PosEligibilityViewModel.this;
                List $r32 = (List) obj;
                PosEligibilityViewModel.m40105getPosTerminalDetails$lambda11($r1, $r32);
            }
        };
        Chunk $r1 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r5 = $r3.e0(object, $r1);
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosTerminalDetails$lambda-11  reason: not valid java name */
    public static final void m40105getPosTerminalDetails$lambda11(PosEligibilityViewModel posEligibilityViewModel, List list) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        ViewData $r2 = posEligibilityViewModel.getState();
        PosEligibilityViewData $r3 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r2, null, null, null, null, false, null, null, null, list, null, null, 1775, null);
        posEligibilityViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    private final void handleDiscount(PosDiscount posDiscount, List list, String str) {
        PosTypeData posTypeData;
        if (posDiscount == null) {
            return;
        }
        Iterator $r4 = list.iterator();
        while (true) {
            boolean $z0 = $r4.hasNext();
            if (!$z0) {
                posTypeData = null;
                break;
            }
            Object $r5 = $r4.next();
            posTypeData = $r5;
            String $r8 = ((PosTypeData) $r5).getPosRequestType();
            boolean $z02 = Log_OC.append($r8, str);
            if ($z02) {
                break;
            }
        }
        PosTypeData $r7 = posTypeData;
        if ($r7 != null) {
            $r7.setPosDiscountPercantage(posDiscount.getPercentageDiscount());
        }
        if ($r7 != null) {
            $r7.setContainsDiscount(true);
        }
        if ($r7 == null) {
            return;
        }
        Double $r9 = posDiscount.getPercentageDiscount();
        double $d1 = $r9 == null ? 0.0d : $r9.doubleValue();
        double $d0 = $r7 != null ? $r7.getPrice() : 0.0d;
        $r7.setPriceAfterDiscount(getPosDiscount($d1, $d0));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void trackPosRequest() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.ui.viewModels.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = PosEligibilityViewModel.m40107trackPosRequest$lambda21($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                String $r3 = (String) obj;
                PosEligibilityViewModel.m40108trackPosRequest$lambda22($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosEligibilityViewModel $r12 = PosEligibilityViewModel.this;
                Throwable $r3 = (Throwable) obj;
                PosEligibilityViewModel.m40109trackPosRequest$lambda23($r12, $r3);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: trackPosRequest$lambda-21  reason: not valid java name */
    public static final InterfaceC11692s m40107trackPosRequest$lambda21(PosEligibilityViewModel posEligibilityViewModel, User user) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        Log_OC.getArray(user, "it");
        TrackPosRequest $r3 = posEligibilityViewModel.trackPOS;
        AbstractC11688p $r1 = $r3.execute();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: trackPosRequest$lambda-22  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40108trackPosRequest$lambda22(ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel r31, java.lang.String r32) {
        /*
            java.lang.String r14 = "this$0"
            r0 = r31
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r14)
            if (r32 == 0) goto L14
            r0 = r32
            boolean r15 = kotlin.p549l0.C13265j.m5470u(r0)
            if (r15 == 0) goto L12
            goto L14
        L12:
            r15 = 0
            goto L15
        L14:
            r15 = 1
        L15:
            if (r15 != 0) goto L62
            r0 = r31
            ai.kudi.agent.core.mvvm.ViewData r16 = r0.getState()
            r18 = r16
            ai.kudi.agent.pos.ui.data.PosEligibilityViewData r18 = (ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData) r18
            r17 = r18
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 1519(0x5ef, float:2.129E-42)
            r30 = 0
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r32
            r11 = r28
            r12 = r29
            r13 = r30
            ai.kudi.agent.pos.ui.data.PosEligibilityViewData r17 = ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r31
            r1 = r17
            r0.publish(r1)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel.m40108trackPosRequest$lambda22(ai.kudi.agent.pos.ui.viewModels.PosEligibilityViewModel, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: trackPosRequest$lambda-23  reason: not valid java name */
    public static final void m40109trackPosRequest$lambda23(PosEligibilityViewModel posEligibilityViewModel, Throwable th) {
        Log_OC.getArray(posEligibilityViewModel, "this$0");
        th.printStackTrace();
        ViewData $r3 = posEligibilityViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        PosEligibilityViewData.Error $r2 = new PosEligibilityViewData.Error((String) $r6, null, 2, null);
        PosEligibilityViewData $r4 = PosEligibilityViewData.copy$default((PosEligibilityViewData) $r3, null, null, null, null, false, $r2, null, null, null, null, null, 2015, null);
        posEligibilityViewModel.publish($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PosEligibilityViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PosEligibilityViewData initialData() {
        PosEligibilityViewData $r1 = new PosEligibilityViewData(null, null, null, null, false, null, null, null, null, null, null, 2047, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isSuperAgentOrAggeregator() {
        GetIsSuperAgentOrAggregator $r1 = this.getIsSuperAgentOrAggregator;
        boolean $z0 = $r1.execute();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToActivatePos() {
        TerminalRequestNavigator $r1 = this.terminalRequestNavigator;
        $r1.navigateToActivatePos();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToLeaseTermsAndConditions(List list) {
        Log_OC.getArray(list, "posTypeData");
        TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
        $r2.toTermsAndConditions(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToMakePayment(PosTypeData posTypeData) {
        Log_OC.getArray(posTypeData, "posTypeData");
        TerminalRequestNavigator $r3 = this.terminalRequestNavigator;
        PosPurchaseInfo $r1 = new PosPurchaseInfo(null, null, null, null, posTypeData, 15, null);
        $r3.navigateToMakePayment(false, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToPosOrderHistoryFragment(PosFilterType posFilterType) {
        Log_OC.getArray(posFilterType, "posFilterType");
        TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
        $r2.navigateToPosOrderHistoryFragment(posFilterType);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateIsNewFeature() {
        SharedPreferences $r1 = this.sharedPreferences;
        boolean $z0 = $r1.getBoolean(PosActivity.IS_POS_NEW_FEATURE, true);
        if ($z0) {
            SharedPreferences $r12 = this.sharedPreferences;
            SharedPreferences.Editor $r2 = $r12.edit();
            $r2.putBoolean(PosActivity.IS_POS_NEW_FEATURE, false).apply();
        }
    }
}
