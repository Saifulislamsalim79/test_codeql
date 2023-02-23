package ai.kudi.agent.p2p.viewmodels;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.data.model.LookUpUserRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.HandleOrPhoneLookUp;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.app.Application;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: P2pNameAndPhoneViewModel.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015J\u0006\u0010\u0016\u001a\u00020\u0010J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneNoViewData;", "app", "Landroid/app/Application;", "handleOrPhoneLookUp", "Lai/kudi/agent/users/domain/usecases/HandleOrPhoneLookUp;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Landroid/app/Application;Lai/kudi/agent/users/domain/usecases/HandleOrPhoneLookUp;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "accountNameRequest", "Lio/reactivex/disposables/Disposable;", "phoneNumber", "", "sessionId", "checkAccountName", "", "phoneNo", "checkIfItIsAgentsPhoneNoAndPerformAction", BanksWithMethods.ACCOUNT_NAME, "action", "Lkotlin/Function0;", "disposeAccountNameLookUp", "fetchUserDetails", "initialData", "isValidInputParams", "", "onCleared", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class P2pNameAndPhoneViewModel extends BaseViewModel<P2pNameAndPhoneNoViewData> {
    private FavoritesArrayAdapter accountNameRequest;
    private final FetchCurrentUser fetchCurrentUser;
    private final HandleOrPhoneLookUp handleOrPhoneLookUp;
    private String phoneNumber;
    private final Application sContext;
    private String sessionId;

    public P2pNameAndPhoneViewModel(Application application, HandleOrPhoneLookUp handleOrPhoneLookUp, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(application, "app");
        Log_OC.getArray(handleOrPhoneLookUp, "handleOrPhoneLookUp");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.sContext = application;
        this.handleOrPhoneLookUp = handleOrPhoneLookUp;
        this.fetchCurrentUser = fetchCurrentUser;
        this.sessionId = "";
        this.phoneNumber = "";
        fetchUserDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkAccountName$lambda-0  reason: not valid java name */
    public static final void m39995checkAccountName$lambda0(P2pNameAndPhoneViewModel p2pNameAndPhoneViewModel, LookUpUserRequest lookUpUserRequest) {
        Log_OC.getArray(p2pNameAndPhoneViewModel, "this$0");
        String $r2 = lookUpUserRequest.getName();
        int $i0 = $r2.length();
        boolean $z0 = $i0 == 0;
        if (!$z0) {
            ViewData $r3 = p2pNameAndPhoneViewModel.getState();
            P2pNameAndPhoneNoViewData $r4 = (P2pNameAndPhoneNoViewData) $r3;
            p2pNameAndPhoneViewModel.publish(P2pNameAndPhoneNoViewData.copy$default($r4, false, null, lookUpUserRequest, 2, null));
            return;
        }
        ViewData $r32 = p2pNameAndPhoneViewModel.getState();
        P2pNameAndPhoneNoViewData $r42 = (P2pNameAndPhoneNoViewData) $r32;
        Application $r6 = p2pNameAndPhoneViewModel.sContext;
        String $r22 = $r6.getString(C0001R.string.p2p_invalid_kudi_account_error);
        P2pNameAndPhoneNoError $r5 = new P2pNameAndPhoneNoError($r22, null, null, null, 14, null);
        p2pNameAndPhoneViewModel.publish(P2pNameAndPhoneNoViewData.copy$default($r42, false, $r5, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkAccountName$lambda-1  reason: not valid java name */
    public static final void m39996checkAccountName$lambda1(P2pNameAndPhoneViewModel p2pNameAndPhoneViewModel, Throwable th) {
        Log_OC.getArray(p2pNameAndPhoneViewModel, "this$0");
        ViewData $r2 = p2pNameAndPhoneViewModel.getState();
        P2pNameAndPhoneNoViewData $r3 = (P2pNameAndPhoneNoViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        P2pNameAndPhoneNoError $r4 = new P2pNameAndPhoneNoError(null, null, null, (String) $r6, 7, null);
        p2pNameAndPhoneViewModel.publish(P2pNameAndPhoneNoViewData.copy$default($r3, false, $r4, null, 4, null));
        th.printStackTrace();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchUserDetails() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.p2p.viewmodels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                P2pNameAndPhoneViewModel $r12 = P2pNameAndPhoneViewModel.this;
                User $r3 = (User) obj;
                P2pNameAndPhoneViewModel.m39997fetchUserDetails$lambda2($r12, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                sessionId = it.sessionId\n                phoneNumber = it.phoneNumber\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchUserDetails$lambda-2  reason: not valid java name */
    public static final void m39997fetchUserDetails$lambda2(P2pNameAndPhoneViewModel p2pNameAndPhoneViewModel, User user) {
        Log_OC.getArray(p2pNameAndPhoneViewModel, "this$0");
        String $r2 = user.getSessionId();
        Log_OC.loadImage($r2, "it.sessionId");
        p2pNameAndPhoneViewModel.sessionId = $r2;
        String $r22 = user.getPhoneNumber();
        Log_OC.loadImage($r22, "it.phoneNumber");
        p2pNameAndPhoneViewModel.phoneNumber = $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isValidInputParams(String str, String str2) {
        boolean $z0;
        boolean $z02;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r3 = getState();
            P2pNameAndPhoneNoViewData $r4 = (P2pNameAndPhoneNoViewData) $r3;
            Application $r6 = this.sContext;
            String $r1 = $r6.getString(C0001R.string.p2p_invalid_name_error);
            P2pNameAndPhoneNoError $r5 = new P2pNameAndPhoneNoError(null, $r1, null, null, 13, null);
            publish(P2pNameAndPhoneNoViewData.copy$default($r4, false, $r5, null, 5, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if (!$z02) {
            boolean $z03 = StringExtKt.isNigerianPhoneNumber(str2);
            if ($z03) {
                return true;
            }
        }
        ViewData $r32 = getState();
        P2pNameAndPhoneNoViewData $r42 = (P2pNameAndPhoneNoViewData) $r32;
        Application $r62 = this.sContext;
        String $r12 = $r62.getString(C0001R.string.p2p_invalid_phone_number_error);
        P2pNameAndPhoneNoError $r52 = new P2pNameAndPhoneNoError($r12, null, null, null, 14, null);
        publish(P2pNameAndPhoneNoViewData.copy$default($r42, false, $r52, null, 5, null));
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkAccountName(String str) {
        Log_OC.getArray(str, "phoneNo");
        disposeAccountNameLookUp();
        ViewData $r2 = getState();
        P2pNameAndPhoneNoViewData $r3 = (P2pNameAndPhoneNoViewData) $r2;
        publish($r3.copy(true, null, null));
        HandleOrPhoneLookUp $r4 = this.handleOrPhoneLookUp;
        String $r5 = this.sessionId;
        AbstractC11688p $r6 = $r4.execute($r5, str);
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.p2p.viewmodels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                P2pNameAndPhoneViewModel $r1 = P2pNameAndPhoneViewModel.this;
                LookUpUserRequest $r32 = (LookUpUserRequest) obj;
                P2pNameAndPhoneViewModel.m39995checkAccountName$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.p2p.viewmodels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                P2pNameAndPhoneViewModel $r1 = P2pNameAndPhoneViewModel.this;
                Throwable $r32 = (Throwable) obj;
                P2pNameAndPhoneViewModel.m39996checkAccountName$lambda1($r1, $r32);
            }
        });
        this.accountNameRequest = $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkIfItIsAgentsPhoneNoAndPerformAction(String str, String str2, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NAME);
        Log_OC.getArray(str2, "phoneNo");
        Log_OC.getArray(interfaceC11756a, "action");
        ViewData $r4 = getState();
        P2pNameAndPhoneNoViewData $r5 = (P2pNameAndPhoneNoViewData) $r4;
        publish(P2pNameAndPhoneNoViewData.copy$default($r5, false, null, null, 5, null));
        boolean $z0 = isValidInputParams(str, str2);
        if ($z0) {
            String $r1 = this.phoneNumber;
            boolean $z02 = Log_OC.append($r1, str2);
            if (!$z02) {
                interfaceC11756a.invoke();
                return;
            }
            ViewData $r42 = getState();
            P2pNameAndPhoneNoViewData $r52 = (P2pNameAndPhoneNoViewData) $r42;
            Application $r7 = this.sContext;
            String $r12 = $r7.getString(C0001R.string.p2p_self_phone_number_error);
            P2pNameAndPhoneNoError $r6 = new P2pNameAndPhoneNoError($r12, null, null, null, 14, null);
            publish(P2pNameAndPhoneNoViewData.copy$default($r52, false, $r6, null, 5, null));
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void disposeAccountNameLookUp() {
        FavoritesArrayAdapter $r1 = this.accountNameRequest;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        P2pNameAndPhoneNoViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public P2pNameAndPhoneNoViewData initialData() {
        P2pNameAndPhoneNoViewData $r1 = new P2pNameAndPhoneNoViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        disposeAccountNameLookUp();
    }
}
