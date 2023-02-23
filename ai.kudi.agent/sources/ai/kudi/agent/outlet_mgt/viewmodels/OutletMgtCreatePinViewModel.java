package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.outlet_mgt.useCases.CreateOutlet;
import ai.kudi.agent.register.p021ui.viewmodels.data.CreatePinViewData;
import ai.kudi.agent.settings.domain.package_4.UserProfileResponse;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: OutletMgtCreatePinViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtCreatePinViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/CreatePinViewData;", "outletMgtNavigator", "Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "createOutlet", "Lai/kudi/agent/outlet_mgt/useCases/CreateOutlet;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/outlet_mgt/useCases/CreateOutlet;Lai/kudi/agent/core/analytics/Analytics;)V", "", "createOutletData", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "isTermChecked", "", "initialData", "inputParamsValid", "pin", "", "confirmPin", "logPinEntered", "user", "Lai/kudi/agent/users/domain/dto/User;", TransactionField.STATUS, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtCreatePinViewModel extends BaseViewModel<CreatePinViewData> {
    private final Analytics analytics;
    private final CreateOutlet createOutlet;
    private final FetchCurrentUser fetchCurrentUser;
    private final OutletMgtNavigator outletMgtNavigator;

    public OutletMgtCreatePinViewModel(OutletMgtNavigator outletMgtNavigator, FetchCurrentUser fetchCurrentUser, CreateOutlet createOutlet, Analytics analytics) {
        Log_OC.getArray(outletMgtNavigator, "outletMgtNavigator");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(createOutlet, "createOutlet");
        Log_OC.getArray(analytics, "analytics");
        this.outletMgtNavigator = outletMgtNavigator;
        this.fetchCurrentUser = fetchCurrentUser;
        this.createOutlet = createOutlet;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: createOutlet$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39949createOutlet$lambda0(C11812w c11812w, OutletMgtCreatePinViewModel outletMgtCreatePinViewModel, CreateOutletRequest createOutletRequest, User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(outletMgtCreatePinViewModel, "this$0");
        Log_OC.getArray(createOutletRequest, "$createOutletData");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        CreateOutlet $r4 = outletMgtCreatePinViewModel.createOutlet;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.execute(createOutletRequest, $r5);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createOutlet$lambda-1  reason: not valid java name */
    public static final void m39950createOutlet$lambda1(OutletMgtCreatePinViewModel outletMgtCreatePinViewModel, C11812w c11812w, CreateOutletRequest createOutletRequest, UserProfileResponse userProfileResponse) {
        Log_OC.getArray(outletMgtCreatePinViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(createOutletRequest, "$createOutletData");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        outletMgtCreatePinViewModel.logPinEntered($r5, createOutletRequest, true);
        ViewData $r6 = outletMgtCreatePinViewModel.getState();
        CreatePinViewData $r7 = (CreatePinViewData) $r6;
        outletMgtCreatePinViewModel.publish(CreatePinViewData.copy$default($r7, false, null, null, null, 14, null));
        OutletMgtNavigator $r8 = outletMgtCreatePinViewModel.outletMgtNavigator;
        String $r9 = createOutletRequest.getBusinessName();
        String $r10 = $r9;
        if ($r9 == null) {
            $r10 = "";
        }
        String $r92 = createOutletRequest.getPhoneNumber();
        String $r11 = $r92 != null ? $r92 : "";
        $r8.toOutletRegistrationSuccessful($r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createOutlet$lambda-2  reason: not valid java name */
    public static final void m39951createOutlet$lambda2(OutletMgtCreatePinViewModel outletMgtCreatePinViewModel, C11812w c11812w, CreateOutletRequest createOutletRequest, Throwable th) {
        Log_OC.getArray(outletMgtCreatePinViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(createOutletRequest, "$createOutletData");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        outletMgtCreatePinViewModel.logPinEntered($r5, createOutletRequest, false);
        ViewData $r6 = outletMgtCreatePinViewModel.getState();
        CreatePinViewData $r7 = (CreatePinViewData) $r6;
        InterfaceC11767l $r9 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r42 = $r9.invoke(th);
        String $r10 = (String) $r42;
        CreatePinViewData.Error $r8 = new CreatePinViewData.Error($r10, null, null, 6, null);
        outletMgtCreatePinViewModel.publish(CreatePinViewData.copy$default($r7, false, null, null, $r8, 6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str, String str2, boolean z) {
        boolean $z1;
        boolean $z12;
        $z1 = C13276s.m5440u(str);
        if ($z1) {
            ViewData $r3 = getState();
            CreatePinViewData $r4 = (CreatePinViewData) $r3;
            CreatePinViewData.Error $r5 = new CreatePinViewData.Error(null, "PIN is required", null, 5, null);
            publish(CreatePinViewData.copy$default($r4, false, null, null, $r5, 7, null));
            return false;
        }
        int $i0 = str.length();
        if ($i0 != 4) {
            ViewData $r32 = getState();
            CreatePinViewData $r42 = (CreatePinViewData) $r32;
            CreatePinViewData.Error $r52 = new CreatePinViewData.Error(null, "PIN must by 4", null, 5, null);
            publish(CreatePinViewData.copy$default($r42, false, null, null, $r52, 7, null));
            return false;
        }
        $z12 = C13276s.m5440u(str2);
        if ($z12) {
            ViewData $r33 = getState();
            CreatePinViewData $r43 = (CreatePinViewData) $r33;
            CreatePinViewData.Error $r53 = new CreatePinViewData.Error(null, null, "Required", 3, null);
            publish(CreatePinViewData.copy$default($r43, false, null, null, $r53, 7, null));
            return false;
        }
        boolean $z13 = Log_OC.append(str, str2);
        if (!$z13) {
            ViewData $r34 = getState();
            CreatePinViewData $r44 = (CreatePinViewData) $r34;
            CreatePinViewData.Error $r54 = new CreatePinViewData.Error(null, null, "Not equal to PIN", 3, null);
            publish(CreatePinViewData.copy$default($r44, false, null, null, $r54, 7, null));
            return false;
        } else if (z) {
            return true;
        } else {
            ViewData $r35 = getState();
            CreatePinViewData $r45 = (CreatePinViewData) $r35;
            CreatePinViewData.Error $r55 = new CreatePinViewData.Error("Please accept the Term's of Use / Private Policy ", null, null, 6, null);
            publish(CreatePinViewData.copy$default($r45, false, null, null, $r55, 7, null));
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logPinEntered(User user, CreateOutletRequest createOutletRequest, boolean z) {
        if (user == null) {
            return;
        }
        Analytics $r1 = this.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        String $r5 = createOutletRequest.getPhoneNumber();
        String $r6 = $r5;
        if ($r5 == null) {
            $r6 = "";
        }
        $r1.onPinEnteredForCreateOutletClicked($r4, $r6, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createOutlet(final CreateOutletRequest createOutletRequest, boolean z) {
        Log_OC.getArray(createOutletRequest, "createOutletData");
        final C11812w $r2 = new C11812w();
        String $r3 = createOutletRequest.getPin();
        String $r4 = $r3;
        if ($r3 == null) {
            $r4 = "";
        }
        boolean $z0 = inputParamsValid($r4, $r4, z);
        if ($z0) {
            ViewData $r5 = getState();
            CreatePinViewData $r6 = (CreatePinViewData) $r5;
            publish(CreatePinViewData.copy$default($r6, true, null, null, null, 6, null));
            FetchCurrentUser $r7 = this.fetchCurrentUser;
            AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
            AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Type
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    C11812w $r1 = C11812w.this;
                    OutletMgtCreatePinViewModel $r22 = this;
                    CreateOutletRequest $r32 = createOutletRequest;
                    User $r62 = (User) obj;
                    InterfaceC11692s $r42 = OutletMgtCreatePinViewModel.m39949createOutlet$lambda0($r1, $r22, $r32, $r62);
                    return $r42;
                }
            });
            FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.e
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletMgtCreatePinViewModel $r1 = OutletMgtCreatePinViewModel.this;
                    C11812w $r22 = $r2;
                    CreateOutletRequest $r32 = createOutletRequest;
                    UserProfileResponse $r52 = (UserProfileResponse) obj;
                    OutletMgtCreatePinViewModel.m39950createOutlet$lambda1($r1, $r22, $r32, $r52);
                }
            }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Label
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletMgtCreatePinViewModel $r1 = OutletMgtCreatePinViewModel.this;
                    C11812w $r22 = $r2;
                    CreateOutletRequest $r32 = createOutletRequest;
                    Throwable $r52 = (Throwable) obj;
                    OutletMgtCreatePinViewModel.m39951createOutlet$lambda2($r1, $r22, $r32, $r52);
                }
            });
            Log_OC.loadImage($r13, "fetchCurrentUser.execute().flatMapObservable {\n            user = it\n            createOutlet.execute(createOutletData, it.sessionId)\n        }.subscribe(\n            {\n                logPinEntered(user, createOutletData, true)\n                publish(state.copy(loading = false))\n                outletMgtNavigator.toOutletRegistrationSuccessful(\n                    createOutletData.businessName ?: \"\",\n                    createOutletData.phoneNumber ?: \"\"\n                )\n            },\n            {\n                logPinEntered(user, createOutletData, false)\n                publish(\n                    state.copy(\n                        loading = false,\n                        error = CreatePinViewData.Error(\n                            message = parseHttpError2(\"Something went wrong\")(it)\n                        )\n                    )\n                )\n            }\n        )");
            C11280b $r14 = getCompositeDisposable();
            RxExtKt.addTo($r13, $r14);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CreatePinViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CreatePinViewData initialData() {
        CreatePinViewData $r1 = new CreatePinViewData(false, null, null, null, 15, null);
        return $r1;
    }
}
