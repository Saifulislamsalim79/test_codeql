package ai.kudi.agent.pin.viewModel;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.exceptions.NotFoundException;
import ai.kudi.agent.network.util.ConnectivityUtil;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.pin.viewModel.data.KudiPinViewData;
import ai.kudi.agent.users.domain.package_1.SavingPinValidationRequest;
import ai.kudi.agent.users.domain.package_1.SavingPinValidationResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.Authorize;
import ai.kudi.agent.users.domain.usecases.AuthorizeOps;
import ai.kudi.agent.users.domain.usecases.AuthorizeSavings;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
/* compiled from: KudiPinViewModel.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/pin/viewModel/KudiPinViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pin/viewModel/data/KudiPinViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "authorize", "Lai/kudi/agent/users/domain/usecases/Authorize;", "deviceInformation", "Lai/kudi/agent/core/data/DeviceInformation;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "authorizeSavings", "Lai/kudi/agent/users/domain/usecases/AuthorizeSavings;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/Authorize;Lai/kudi/agent/core/data/DeviceInformation;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/AuthorizeSavings;)V", "isAuthorized", "", "()Z", "setAuthorized", "(Z)V", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "", "password", "", "authorizeSavingPin", "handleError", "throwable", "", "initialData", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KudiPinViewModel extends BaseViewModel<KudiPinViewData> {
    private final Analytics analytics;
    private final Authorize authorize;
    private final AuthorizeSavings authorizeSavings;
    private final FetchCurrentUser currentUser;
    private final DeviceInformation deviceInformation;
    private boolean isAuthorized;
    private User user;

    public KudiPinViewModel(FetchCurrentUser fetchCurrentUser, Authorize authorize, DeviceInformation deviceInformation, Analytics analytics, AuthorizeSavings authorizeSavings) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(authorize, "authorize");
        Log_OC.getArray(deviceInformation, "deviceInformation");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(authorizeSavings, "authorizeSavings");
        this.currentUser = fetchCurrentUser;
        this.authorize = authorize;
        this.deviceInformation = deviceInformation;
        this.analytics = analytics;
        this.authorizeSavings = authorizeSavings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorize$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40024authorize$lambda0(KudiPinViewModel kudiPinViewModel, String str, User user) {
        Log_OC.getArray(kudiPinViewModel, "this$0");
        Log_OC.getArray(str, "$password");
        Log_OC.getArray(user, "it");
        kudiPinViewModel.setUser(user);
        Authorize $r4 = kudiPinViewModel.authorize;
        String $r5 = user.getPhoneNumber();
        Log_OC.loadImage($r5, "it.phoneNumber");
        DeviceInformation $r6 = kudiPinViewModel.deviceInformation;
        String $r7 = $r6.getDeviceId();
        DeviceInformation $r62 = kudiPinViewModel.deviceInformation;
        String $r8 = $r62.getDeviceName();
        DeviceInformation $r63 = kudiPinViewModel.deviceInformation;
        String $r9 = $r63.getImei();
        boolean $z0 = user.isLoggedIn();
        Authorize.Input $r2 = new Authorize.Input($r5, str, $r7, $r8, $r9, $z0);
        AbstractC11688p $r10 = $r4.execute($r2);
        return $r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorize$lambda-2  reason: not valid java name */
    public static final void m40025authorize$lambda2(KudiPinViewModel kudiPinViewModel, String $r1, AuthorizeOps authorizeOps) {
        Log_OC.getArray(kudiPinViewModel, "this$0");
        Log_OC.getArray($r1, "$password");
        KudiPinViewData.HideLoading $r3 = KudiPinViewData.HideLoading.INSTANCE;
        kudiPinViewModel.publish($r3);
        boolean $z0 = authorizeOps.getUserExists();
        if (!$z0) {
            Throwable $r4 = authorizeOps.getException();
            boolean $z02 = $r4 instanceof NotFoundException;
            if (!$z02) {
                Throwable $r42 = authorizeOps.getException();
                if ($r42 != null) {
                    Throwable $r43 = authorizeOps.getException();
                    InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
                    Object $r7 = $r6.invoke($r43);
                    KudiPinViewData.Error $r5 = new KudiPinViewData.Error((String) $r7, $r43);
                    kudiPinViewModel.publish($r5);
                    Analytics $r8 = kudiPinViewModel.analytics;
                    User $r9 = kudiPinViewModel.getUser();
                    Log_OC.append($r9);
                    String $r12 = $r9.getPhoneNumber();
                    Log_OC.loadImage($r12, "user!!.phoneNumber");
                    $r8.onPinEnteredClicked($r12, false, $r43.getMessage());
                    kudiPinViewModel.handleError($r43);
                    return;
                }
                return;
            }
        }
        Analytics $r82 = kudiPinViewModel.analytics;
        $r82.onTransactionAuthEvent(kudiPinViewModel.getUser());
        User $r92 = kudiPinViewModel.getUser();
        if ($r92 != null) {
            Analytics $r83 = kudiPinViewModel.analytics;
            String $r10 = $r92.getPhoneNumber();
            Log_OC.loadImage($r10, "it.phoneNumber");
            TransferToBankAnalytics.DefaultImpls.onPinEnteredClicked$default($r83, $r10, true, null, 4, null);
        }
        kudiPinViewModel.setAuthorized(true);
        Log_OC.loadImage(authorizeOps, "authOps");
        KudiPinViewData.SuccessfulAuth $r11 = new KudiPinViewData.SuccessfulAuth(authorizeOps, $r1);
        kudiPinViewModel.publish($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorize$lambda-4  reason: not valid java name */
    public static final void m40026authorize$lambda4(KudiPinViewModel kudiPinViewModel, Throwable th) {
        Log_OC.getArray(kudiPinViewModel, "this$0");
        User $r3 = kudiPinViewModel.getUser();
        if ($r3 != null) {
            Analytics $r2 = kudiPinViewModel.analytics;
            String $r4 = $r3.getPhoneNumber();
            Log_OC.loadImage($r4, "it.phoneNumber");
            String $r5 = th.getMessage();
            $r2.onPinEnteredClicked($r4, false, $r5);
        }
        Log_OC.loadImage(th, "throwable");
        kudiPinViewModel.handleError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorizeSavingPin$lambda-5  reason: not valid java name */
    public static final void m40027authorizeSavingPin$lambda5(KudiPinViewModel kudiPinViewModel, String str, SavingPinValidationResponse savingPinValidationResponse) {
        Log_OC.getArray(kudiPinViewModel, "this$0");
        Log_OC.getArray(str, "$password");
        KudiPinViewData.HideLoading $r3 = KudiPinViewData.HideLoading.INSTANCE;
        kudiPinViewModel.publish($r3);
        KudiPinViewData.SuccessSavingAuth $r4 = new KudiPinViewData.SuccessSavingAuth(str);
        kudiPinViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorizeSavingPin$lambda-6  reason: not valid java name */
    public static final void m40028authorizeSavingPin$lambda6(KudiPinViewModel kudiPinViewModel, Throwable th) {
        Log_OC.getArray(kudiPinViewModel, "this$0");
        KudiPinViewData.HideLoading $r2 = KudiPinViewData.HideLoading.INSTANCE;
        kudiPinViewModel.publish($r2);
        Log_OC.loadImage(th, "it");
        kudiPinViewModel.handleError(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void authorize(final String str) {
        Log_OC.getArray(str, "password");
        KudiPinViewData.Loading $r2 = KudiPinViewData.Loading.INSTANCE;
        publish($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pin.viewModel.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KudiPinViewModel $r1 = KudiPinViewModel.this;
                String $r22 = str;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = KudiPinViewModel.m40024authorize$lambda0($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.pin.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KudiPinViewModel $r1 = KudiPinViewModel.this;
                String $r22 = str;
                AuthorizeOps $r42 = (AuthorizeOps) obj;
                KudiPinViewModel.m40025authorize$lambda2($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.pin.viewModel.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KudiPinViewModel $r1 = KudiPinViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KudiPinViewModel.m40026authorize$lambda4($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void authorizeSavingPin(final String str) {
        Log_OC.getArray(str, "password");
        KudiPinViewData.Loading $r2 = KudiPinViewData.Loading.INSTANCE;
        publish($r2);
        AuthorizeSavings $r3 = this.authorizeSavings;
        SavingPinValidationRequest $r4 = new SavingPinValidationRequest(str);
        AbstractC11688p $r5 = $r3.authorizePin($r4);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.pin.viewModel.Cubic
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KudiPinViewModel $r1 = KudiPinViewModel.this;
                String $r22 = str;
                SavingPinValidationResponse $r42 = (SavingPinValidationResponse) obj;
                KudiPinViewModel.m40027authorizeSavingPin$lambda5($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.pin.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KudiPinViewModel $r1 = KudiPinViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KudiPinViewModel.m40028authorizeSavingPin$lambda6($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "authorizeSavings.authorizePin(SavingPinValidationRequest(password)).subscribe(\n            {\n                publish(KudiPinViewData.HideLoading)\n                publish(KudiPinViewData.SuccessSavingAuth(password))\n            },\n            {\n                publish(KudiPinViewData.HideLoading)\n                handleError(it)\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void handleError(Throwable th) {
        Log_OC.getArray(th, "throwable");
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            KudiPinViewData.ErrorRes $r2 = new KudiPinViewData.ErrorRes(C0038R.string.something_went_wrong, th);
            publish($r2);
            return;
        }
        boolean $z02 = th instanceof HttpException;
        if (!$z02) {
            InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
            Object $r6 = $r5.invoke(th);
            String $r7 = (String) $r6;
            KudiPinViewData.Error $r4 = new KudiPinViewData.Error($r7, th);
            publish($r4);
            return;
        }
        HttpException $r3 = (HttpException) th;
        int $i0 = $r3.m352a();
        if ($i0 == 403) {
            KudiPinViewData.ErrorRes $r22 = new KudiPinViewData.ErrorRes(C0038R.string.incorrect_pin, th);
            publish($r22);
        } else if ($i0 == 429) {
            KudiPinViewData.AccountBlocked $r8 = new KudiPinViewData.AccountBlocked(C0038R.string.incorrect_pin, th);
            publish($r8);
        } else {
            InterfaceC11767l $r52 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
            Object $r62 = $r52.invoke(th);
            String $r72 = (String) $r62;
            KudiPinViewData.Error $r42 = new KudiPinViewData.Error($r72, th);
            publish($r42);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KudiPinViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KudiPinViewData initialData() {
        KudiPinViewData.Initial r1 = KudiPinViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isAuthorized() {
        boolean z0 = this.isAuthorized;
        return z0;
    }

    public final void setAuthorized(boolean z) {
        this.isAuthorized = z;
    }

    public final void setUser(User user) {
        this.user = user;
    }
}
