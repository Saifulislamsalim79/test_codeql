package ai.kudi.agent.outlet_mgt.viewmodels.outlet_info;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.data.OutletDetails;
import ai.kudi.agent.outlet_mgt.domain.repositories.ChildOutletInformationRepository;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletDetails;
import ai.kudi.agent.outlet_mgt.viewdata.ChildOutletInformationViewData;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: ChildOutletInformationViewModel.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000eJ>\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eJ\u0014\u0010#\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010%\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/outlet_info/ChildOutletInformationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewdata/ChildOutletInformationViewData;", "repository", "Lai/kudi/agent/outlet_mgt/domain/repositories/ChildOutletInformationRepository;", "fetchOutletDetails", "Lai/kudi/agent/outlet_mgt/useCases/FetchOutletDetails;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/outlet_mgt/domain/repositories/ChildOutletInformationRepository;Lai/kudi/agent/outlet_mgt/useCases/FetchOutletDetails;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "isStateSelection", "", "Ljava/lang/Boolean;", "selectedLga", "", "selectedState", "initialData", "loadOutletFromNotification", "", "outletId", "onItemSelected", AttributeType.TEXT, "onLgaFieldClicked", "onLgaSelected", "lga", "onStateFieldClicked", "onStateSelected", SendReceiptToTerminalConfirmationBottomSheet.STATE, "onSubmitBtnClicked", "firstName", "lastName", "outletName", "outletAddress", "outLetState", "outletLga", "openLgaSelector", "altToastMsg", "openStateSelector", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ChildOutletInformationViewModel extends BaseViewModel<ChildOutletInformationViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchOutletDetails fetchOutletDetails;
    private Boolean isStateSelection;
    private final ChildOutletInformationRepository repository;
    private String selectedLga;
    private String selectedState;

    public ChildOutletInformationViewModel(ChildOutletInformationRepository childOutletInformationRepository, FetchOutletDetails fetchOutletDetails, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(childOutletInformationRepository, "repository");
        Log_OC.getArray(fetchOutletDetails, "fetchOutletDetails");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.repository = childOutletInformationRepository;
        this.fetchOutletDetails = fetchOutletDetails;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadOutletFromNotification$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39978loadOutletFromNotification$lambda0(ChildOutletInformationViewModel childOutletInformationViewModel, String str, User user) {
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(user, "it");
        FetchOutletDetails $r3 = childOutletInformationViewModel.fetchOutletDetails;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute(str, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadOutletFromNotification$lambda-1  reason: not valid java name */
    public static final void m39979loadOutletFromNotification$lambda1(ChildOutletInformationViewModel childOutletInformationViewModel, OutletDetails outletDetails) {
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        Outlet $r2 = outletDetails.getPersonal();
        ViewData $r3 = childOutletInformationViewModel.getState();
        ChildOutletInformationViewData $r4 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r3, 0, null, false, null, null, null, null, false, false, $r2, false, null, 2559, null);
        childOutletInformationViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadOutletFromNotification$lambda-2  reason: not valid java name */
    public static final void m39980loadOutletFromNotification$lambda2(ChildOutletInformationViewModel childOutletInformationViewModel, Throwable th) {
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        ViewData $r2 = childOutletInformationViewModel.getState();
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        ChildOutletInformationViewData $r3 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r2, 0, null, false, null, null, null, null, false, false, null, false, (String) $r5, 1023, null);
        childOutletInformationViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onSubmitBtnClicked$lambda-7  reason: not valid java name */
    public static final void m39981onSubmitBtnClicked$lambda7(ChildOutletInformationViewModel childOutletInformationViewModel, Outlet outlet) {
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        ViewData $r2 = childOutletInformationViewModel.getState();
        ChildOutletInformationViewData $r3 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r2, 0, null, false, null, null, null, "Outlet update successful", false, true, null, false, null, 3647, null);
        childOutletInformationViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onSubmitBtnClicked$lambda-8  reason: not valid java name */
    public static final void m39982onSubmitBtnClicked$lambda8(ChildOutletInformationViewModel childOutletInformationViewModel, Throwable th) {
        List $r4;
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        $r4 = C13726r.m3891e();
        String $r2 = childOutletInformationViewModel.selectedState;
        String $r3 = childOutletInformationViewModel.selectedLga;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        ViewData $r8 = childOutletInformationViewModel.getState();
        ChildOutletInformationViewData $r9 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r8, -1, null, false, $r4, $r2, $r3, (String) $r6, false, false, null, false, null, 3840, null);
        childOutletInformationViewModel.publish($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openLgaSelector(final String str) {
        Boolean $r2 = Boolean.FALSE;
        this.isStateSelection = $r2;
        ChildOutletInformationRepository $r3 = this.repository;
        String $r4 = this.selectedState;
        Log_OC.append($r4);
        AbstractC11688p $r5 = $r3.getLgaFor($r4);
        Item $r6 = p425j.p444e.p470j0.ClassWriter.m10609c();
        AbstractC11688p $r52 = $r5.h0($r6);
        Item $r62 = ContextUtils.LogError();
        FavoritesArrayAdapter $r9 = $r52.R($r62).e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                String $r22 = str;
                List $r42 = (List) obj;
                ChildOutletInformationViewModel.m39983openLgaSelector$lambda5($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ChildOutletInformationViewModel.m39984openLgaSelector$lambda6($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "repository.getLgaFor(selectedState!!).subscribeOn(Schedulers.computation())\n            .observeOn(AndroidSchedulers.mainThread()).subscribe(\n            {\n                publish(\n                    state.copy(\n                        errorViewId = -1,\n                        errorText = null,\n                        openSelector = true,\n                        selectorList = it,\n                        stateText = selectedState,\n                        lgaText = selectedLga,\n                        toastText = if (it.isEmpty()) \"Location data is empty\" else altToastMsg\n                    )\n                )\n            },\n            {\n                it.printStackTrace()\n                publish(\n                    state.copy(\n                        errorViewId = -1,\n                        errorText = null,\n                        openSelector = false,\n                        selectorList = emptyList(),\n                        stateText = selectedState,\n                        lgaText = selectedLga,\n                        toastText = \"Location data is empty\"\n                    )\n                )\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void openLgaSelector$default(ChildOutletInformationViewModel childOutletInformationViewModel, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        childOutletInformationViewModel.openLgaSelector($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openLgaSelector$lambda-5  reason: not valid java name */
    public static final void m39983openLgaSelector$lambda5(ChildOutletInformationViewModel childOutletInformationViewModel, String $r1, List list) {
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        ViewData $r5 = childOutletInformationViewModel.getState();
        ChildOutletInformationViewData childOutletInformationViewData = (ChildOutletInformationViewData) $r5;
        Log_OC.loadImage(list, "it");
        String $r3 = childOutletInformationViewModel.selectedState;
        String $r4 = childOutletInformationViewModel.selectedLga;
        boolean $z0 = list.isEmpty();
        if ($z0) {
            $r1 = "Location data is empty";
        }
        ChildOutletInformationViewData $r6 = ChildOutletInformationViewData.copy$default(childOutletInformationViewData, -1, null, true, list, $r3, $r4, $r1, false, false, null, false, null, 3968, null);
        childOutletInformationViewModel.publish($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openLgaSelector$lambda-6  reason: not valid java name */
    public static final void m39984openLgaSelector$lambda6(ChildOutletInformationViewModel childOutletInformationViewModel, Throwable th) {
        List $r6;
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        th.printStackTrace();
        ViewData $r4 = childOutletInformationViewModel.getState();
        $r6 = C13726r.m3891e();
        String $r2 = childOutletInformationViewModel.selectedState;
        String $r3 = childOutletInformationViewModel.selectedLga;
        ChildOutletInformationViewData $r5 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r4, -1, null, false, $r6, $r2, $r3, "Location data is empty", false, false, null, false, null, 3968, null);
        childOutletInformationViewModel.publish($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openStateSelector(final String str) {
        Boolean $r2 = Boolean.TRUE;
        this.isStateSelection = $r2;
        ChildOutletInformationRepository $r3 = this.repository;
        AbstractC11688p $r4 = $r3.getStateList();
        Item $r5 = p425j.p444e.p470j0.ClassWriter.m10609c();
        AbstractC11688p $r42 = $r4.h0($r5);
        Item $r52 = ContextUtils.LogError();
        FavoritesArrayAdapter $r8 = $r42.R($r52).e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                String $r22 = str;
                List $r43 = (List) obj;
                ChildOutletInformationViewModel.m39985openStateSelector$lambda3($r1, $r22, $r43);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ChildOutletInformationViewModel.m39986openStateSelector$lambda4($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "repository.getStateList().subscribeOn(Schedulers.computation())\n            .observeOn(AndroidSchedulers.mainThread()).subscribe(\n            {\n                publish(\n                    state.copy(\n                        errorViewId = -1,\n                        errorText = null,\n                        openSelector = true,\n                        selectorList = it,\n                        stateText = selectedState,\n                        lgaText = selectedLga,\n                        toastText = if (it.isEmpty()) \"Location data is empty\" else altToastMsg\n                    )\n                )\n            },\n            {\n                it.printStackTrace()\n                publish(\n                    state.copy(\n                        errorViewId = -1,\n                        errorText = null,\n                        openSelector = false,\n                        selectorList = emptyList(),\n                        stateText = selectedState,\n                        lgaText = selectedLga,\n                        toastText = \"Location data is empty\"\n                    )\n                )\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void openStateSelector$default(ChildOutletInformationViewModel childOutletInformationViewModel, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        childOutletInformationViewModel.openStateSelector($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openStateSelector$lambda-3  reason: not valid java name */
    public static final void m39985openStateSelector$lambda3(ChildOutletInformationViewModel childOutletInformationViewModel, String $r1, List list) {
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        ViewData $r5 = childOutletInformationViewModel.getState();
        ChildOutletInformationViewData childOutletInformationViewData = (ChildOutletInformationViewData) $r5;
        Log_OC.loadImage(list, "it");
        String $r3 = childOutletInformationViewModel.selectedState;
        String $r4 = childOutletInformationViewModel.selectedLga;
        boolean $z0 = list.isEmpty();
        if ($z0) {
            $r1 = "Location data is empty";
        }
        ChildOutletInformationViewData $r6 = ChildOutletInformationViewData.copy$default(childOutletInformationViewData, -1, null, true, list, $r3, $r4, $r1, false, false, null, false, null, 3968, null);
        childOutletInformationViewModel.publish($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openStateSelector$lambda-4  reason: not valid java name */
    public static final void m39986openStateSelector$lambda4(ChildOutletInformationViewModel childOutletInformationViewModel, Throwable th) {
        List $r6;
        Log_OC.getArray(childOutletInformationViewModel, "this$0");
        th.printStackTrace();
        ViewData $r4 = childOutletInformationViewModel.getState();
        $r6 = C13726r.m3891e();
        String $r2 = childOutletInformationViewModel.selectedState;
        String $r3 = childOutletInformationViewModel.selectedLga;
        ChildOutletInformationViewData $r5 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r4, -1, null, false, $r6, $r2, $r3, "Location data is empty", false, false, null, false, null, 3968, null);
        childOutletInformationViewModel.publish($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ChildOutletInformationViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ChildOutletInformationViewData initialData() {
        ChildOutletInformationViewData $r1 = new ChildOutletInformationViewData(0, null, false, null, null, null, null, false, false, null, false, null, 4095, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadOutletFromNotification(final String str) {
        Log_OC.getArray(str, "outletId");
        ViewData $r2 = getState();
        ChildOutletInformationViewData $r3 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r2, 0, null, false, null, null, null, null, false, false, null, true, null, 1023, null);
        publish($r3);
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = ChildOutletInformationViewModel.m39978loadOutletFromNotification$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                OutletDetails $r32 = (OutletDetails) obj;
                ChildOutletInformationViewModel.m39979loadOutletFromNotification$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ChildOutletInformationViewModel.m39980loadOutletFromNotification$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "fetchCurrentUser.execute().flatMapObservable {\n            fetchOutletDetails.execute(outletId = outletId, sessionId = it.sessionId)\n        }.subscribe(\n            {\n                publish(state.copy(isOutletDetailsLoading = false, outletResponse = it.personal))\n            },\n            {\n                publish(\n                    state.copy(\n                        isOutletDetailsLoading = false, outletDetailsError = parseHttpError2(\n                            \"Something went wrong, please retry\"\n                        )(it)\n                    )\n                )\n            }\n        )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.ChildOutletInformationViewModel.onItemSelected(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLgaFieldClicked() {
        /*
            r6 = this;
            java.lang.String r0 = r6.selectedState
            if (r0 == 0) goto Ld
            int r1 = r0.length()
            if (r1 != 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            if (r2 == 0) goto L17
            r3 = 0
            r4 = 1
            r5 = 0
            openStateSelector$default(r6, r3, r4, r5)
            return
        L17:
            r3 = 0
            r4 = 1
            r5 = 0
            openLgaSelector$default(r6, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.ChildOutletInformationViewModel.onLgaFieldClicked():void");
    }

    public final void onLgaSelected(String str) {
        Log_OC.getArray(str, "lga");
        this.selectedLga = str;
    }

    public final void onStateFieldClicked() {
        openStateSelector$default(this, null, 1, null);
    }

    public final void onStateSelected(String str) {
        Log_OC.getArray(str, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        this.selectedState = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onSubmitBtnClicked(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(str2, "firstName");
        Log_OC.getArray(str3, "lastName");
        Log_OC.getArray(str4, "outletName");
        Log_OC.getArray(str5, "outletAddress");
        Log_OC.getArray(str6, "outLetState");
        Log_OC.getArray(str7, "outletLga");
        int $i0 = str2.length();
        if ($i0 == 0) {
            ViewData $r8 = getState();
            ChildOutletInformationViewData $r9 = ChildOutletInformationViewData.copy$default((ChildOutletInformationViewData) $r8, C0001R.C0003id.et_first_name, "First Name cannot be empty", false, null, null, null, null, false, false, null, false, null, 4088, null);
            publish($r9);
            return;
        }
        int $i02 = str3.length();
        if ($i02 == 0) {
            ViewData $r82 = getState();
            ChildOutletInformationViewData $r92 = (ChildOutletInformationViewData) $r82;
            publish(ChildOutletInformationViewData.copy$default($r92, C0001R.C0003id.et_last_name, "Last Name cannot be empty", false, null, null, null, null, false, false, null, false, null, 4088, null));
            return;
        }
        int $i03 = str4.length();
        if ($i03 == 0) {
            ViewData $r83 = getState();
            ChildOutletInformationViewData $r93 = (ChildOutletInformationViewData) $r83;
            publish(ChildOutletInformationViewData.copy$default($r93, C0001R.C0003id.et_name, "Outlet Name cannot be empty", false, null, null, null, null, false, false, null, false, null, 4088, null));
            return;
        }
        int $i04 = str5.length();
        if ($i04 == 0) {
            ViewData $r84 = getState();
            ChildOutletInformationViewData $r94 = (ChildOutletInformationViewData) $r84;
            publish(ChildOutletInformationViewData.copy$default($r94, C0001R.C0003id.et_address, "Outlet Address cannot be empty", false, null, null, null, null, false, false, null, false, null, 4088, null));
            return;
        }
        int $i05 = str6.length();
        if ($i05 == 0) {
            openStateSelector("Select a State");
            return;
        }
        int $i06 = str7.length();
        if ($i06 == 0) {
            openLgaSelector("Select a LGA");
            return;
        }
        ViewData $r85 = getState();
        ChildOutletInformationViewData $r95 = (ChildOutletInformationViewData) $r85;
        publish(ChildOutletInformationViewData.copy$default($r95, 0, null, false, null, null, null, null, true, false, null, false, null, 3967, null));
        ChildOutletInformationRepository $r10 = this.repository;
        AbstractC11688p $r11 = $r10.submitOutletInfo(str, str2, str3, str4, str5, str6, str7);
        FavoritesArrayAdapter $r14 = $r11.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                Outlet $r3 = (Outlet) obj;
                ChildOutletInformationViewModel.m39981onSubmitBtnClicked$lambda7($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ChildOutletInformationViewModel $r1 = ChildOutletInformationViewModel.this;
                Throwable $r3 = (Throwable) obj;
                ChildOutletInformationViewModel.m39982onSubmitBtnClicked$lambda8($r1, $r3);
            }
        });
        Log_OC.loadImage($r14, "repository.submitOutletInfo(\n            outletId,\n            firstName,\n            lastName,\n            outletName,\n            outletAddress,\n            outLetState,\n            outletLga\n        ).subscribe(\n            {\n                publish(\n                    state.copy(\n                        showLoader = false,\n                        closeScreen = true,\n                        toastText = \"Outlet update successful\"\n                    )\n                )\n            },\n            {\n                publish(\n                    state.copy(\n                        errorViewId = -1,\n                        errorText = null,\n                        openSelector = false,\n                        selectorList = emptyList(),\n                        stateText = selectedState,\n                        lgaText = selectedLga,\n                        showLoader = false,\n                        toastText = parseHttpError2(\"Something went wrong, please try again\")(it)\n                    )\n                )\n            }\n        )");
        C11280b $r15 = getCompositeDisposable();
        RxExtKt.addTo($r14, $r15);
    }
}
