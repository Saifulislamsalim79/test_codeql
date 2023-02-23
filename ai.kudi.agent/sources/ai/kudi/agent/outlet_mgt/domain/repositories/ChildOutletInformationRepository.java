package ai.kudi.agent.outlet_mgt.domain.repositories;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OutletMgtApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.data.outlet_info.UpdateOutletInfoRequest;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: ChildOutletInformationRepository.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u00112\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u0011JF\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/domain/repositories/ChildOutletInformationRepository;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/register/domain/usecases/FetchLocation;Lai/kudi/agent/core/network/NetworkService;)V", "fetchLocationRetryCount", "", "locationData", "", "Lai/kudi/agent/register/data/models/LocationModel;", "fetchLocationData", "", "getLgaFor", "Lio/reactivex/Observable;", "", SendReceiptToTerminalConfirmationBottomSheet.STATE, "getStateList", "submitOutletInfo", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletId", "firstName", "lastName", "outletName", "outletAddress", "outLetState", "outletLga", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ChildOutletInformationRepository {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchLocation fetchLocation;
    private int fetchLocationRetryCount;
    private List<LocationModel> locationData;
    private final NetworkService networkService;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ChildOutletInformationRepository(FetchCurrentUser fetchCurrentUser, FetchLocation fetchLocation, NetworkService networkService) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchLocation, "fetchLocation");
        Log_OC.getArray(networkService, "networkService");
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchLocation = fetchLocation;
        this.networkService = networkService;
        ArrayList $r4 = new ArrayList();
        this.locationData = $r4;
        fetchLocationData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchLocationData$lambda-0  reason: not valid java name */
    public static final void m39866fetchLocationData$lambda0(ChildOutletInformationRepository childOutletInformationRepository, List list) {
        Log_OC.getArray(childOutletInformationRepository, "this$0");
        Log_OC.loadImage(list, "it");
        childOutletInformationRepository.locationData = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocationData$lambda-1  reason: not valid java name */
    public static final void m39867fetchLocationData$lambda1(ChildOutletInformationRepository childOutletInformationRepository, Throwable th) {
        Log_OC.getArray(childOutletInformationRepository, "this$0");
        th.printStackTrace();
        int $i0 = childOutletInformationRepository.fetchLocationRetryCount + 1;
        childOutletInformationRepository.fetchLocationRetryCount = $i0;
        if ($i0 < 3) {
            childOutletInformationRepository.fetchLocationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitOutletInfo$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m39868submitOutletInfo$lambda4(ChildOutletInformationRepository childOutletInformationRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, User user) {
        Log_OC.getArray(childOutletInformationRepository, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(str2, "$firstName");
        Log_OC.getArray(str3, "$lastName");
        Log_OC.getArray(str4, "$outletName");
        Log_OC.getArray(str5, "$outletAddress");
        Log_OC.getArray(str6, "$outLetState");
        Log_OC.getArray(str7, "$outletLga");
        Log_OC.getArray(user, "user");
        NetworkService $r10 = childOutletInformationRepository.networkService;
        OutletMgtApi $r11 = $r10.getOutletApi();
        String $r12 = user.getSessionId();
        Log_OC.loadImage($r12, "user.sessionId");
        UpdateOutletInfoRequest $r9 = new UpdateOutletInfoRequest(str2, str3, str4, str5, str6, str7);
        AbstractC11688p $r13 = $r11.submitOutletInfo(str, $r12, $r9);
        C0337c $r14 = C0337c.f712d;
        AbstractC11688p $r132 = $r13.m10531O($r14);
        Item $r15 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r133 = $r132.h0($r15);
        Item $r152 = ContextUtils.LogError();
        return $r133.R($r152);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitOutletInfo$lambda-4$lambda-3  reason: not valid java name */
    public static final Outlet m39869submitOutletInfo$lambda4$lambda3(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        Outlet $r2 = (Outlet) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocationData() {
        FetchLocation $r4 = this.fetchLocation;
        AbstractC11688p $r3 = $r4.execute();
        $r3.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.domain.repositories.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationRepository $r1 = ChildOutletInformationRepository.this;
                List $r32 = (List) obj;
                ChildOutletInformationRepository.m39866fetchLocationData$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.domain.repositories.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationRepository $r1 = ChildOutletInformationRepository.this;
                Throwable $r32 = (Throwable) obj;
                ChildOutletInformationRepository.m39867fetchLocationData$lambda1($r1, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:9:0x0034 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p425j.p444e.AbstractC11688p getLgaFor(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "state"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<ai.kudi.agent.register.data.models.LocationModel> r2 = r13.locationData
            java.util.Iterator r3 = r2.iterator()
        L10:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r5 = r3.next()
            r7 = r5
            ai.kudi.agent.register.data.models.LocationModel r7 = (ai.kudi.agent.register.data.models.LocationModel) r7
            r6 = r7
            java.lang.String r8 = r6.getStateName()
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r8, r14)
            if (r4 == 0) goto L10
            java.util.ArrayList r9 = r6.getLga()
            java.util.Iterator r3 = r9.iterator()
        L30:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r5 = r3.next()
            r11 = r5
            ai.kudi.agent.register.data.models.LgaModel r11 = (ai.kudi.agent.register.data.models.LgaModel) r11
            r10 = r11
            java.lang.String r14 = r10.getLga()
            r1.add(r14)
            goto L30
        L46:
            kotlin.p557z.C13722p.m3914t(r1)
            j.e.p r12 = p425j.p444e.AbstractC11688p.m10532N(r1)
            java.lang.String r0 = "just(localGovernmentList)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.domain.repositories.ChildOutletInformationRepository.getLgaFor(java.lang.String):j.e.p");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p425j.p444e.AbstractC11688p getStateList() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<ai.kudi.agent.register.data.models.LocationModel> r1 = r10.locationData
            java.util.Iterator r2 = r1.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r4 = r2.next()
            r6 = r4
            ai.kudi.agent.register.data.models.LocationModel r6 = (ai.kudi.agent.register.data.models.LocationModel) r6
            r5 = r6
            java.lang.String r7 = r5.getStateName()
            r0.add(r7)
            goto Lb
        L21:
            kotlin.p557z.C13722p.m3914t(r0)
            j.e.p r8 = p425j.p444e.AbstractC11688p.m10532N(r0)
            java.lang.String r9 = "just(states)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.domain.repositories.ChildOutletInformationRepository.getStateList():j.e.p");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p submitOutletInfo(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(str2, "firstName");
        Log_OC.getArray(str3, "lastName");
        Log_OC.getArray(str4, "outletName");
        Log_OC.getArray(str5, "outletAddress");
        Log_OC.getArray(str6, "outLetState");
        Log_OC.getArray(str7, "outletLga");
        FetchCurrentUser $r9 = this.fetchCurrentUser;
        AbstractC11696w $r10 = FetchCurrentUser.execute$default($r9, null, null, 3, null);
        AbstractC11688p $r11 = $r10.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.domain.repositories.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ChildOutletInformationRepository $r1 = ChildOutletInformationRepository.this;
                String $r2 = str;
                String $r3 = str2;
                String $r4 = str3;
                String $r5 = str4;
                String $r6 = str5;
                String $r7 = str6;
                String $r8 = str7;
                User $r112 = (User) obj;
                InterfaceC11692s $r92 = ChildOutletInformationRepository.m39868submitOutletInfo$lambda4($r1, $r2, $r3, $r4, $r5, $r6, $r7, $r8, $r112);
                return $r92;
            }
        });
        Log_OC.loadImage($r11, "fetchCurrentUser.execute().flatMapObservable { user ->\n            networkService.outletApi.submitOutletInfo(\n                    outletId,\n                    user.sessionId,\n                    UpdateOutletInfoRequest(\n                            firstName,\n                            lastName,\n                            outletName,\n                            outletAddress,\n                            outLetState,\n                            outletLga\n                    )\n            ).map { it.data }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())\n        }");
        return $r11;
    }
}
