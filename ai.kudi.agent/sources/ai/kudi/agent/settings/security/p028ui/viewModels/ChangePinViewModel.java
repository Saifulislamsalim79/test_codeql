package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.PinRepositoryImpl;
import ai.kudi.agent.settings.domain.package_4.ChangePinRequest;
import ai.kudi.agent.settings.domain.package_4.ChangePinResponse;
import ai.kudi.agent.settings.domain.useCases.ChangePin;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.ChangePinViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: ChangePinViewModel.kt */
@Metadata(m10422d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/viewModels/ChangePinViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/ChangePinViewData;", "changePin", "Lai/kudi/agent/settings/domain/useCases/ChangePin;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "pinRepositoryImpl", "Lai/kudi/agent/register/PinRepositoryImpl;", "(Lai/kudi/agent/settings/domain/useCases/ChangePin;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/settings/navigators/SettingsNavigator;Landroid/content/SharedPreferences;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/register/PinRepositoryImpl;)V", "user", "Lai/kudi/agent/users/domain/dto/User;", "initialData", "isInputParamsValid", "", "oldPin", "", "newPin", "confirmNewPin", "resetPin", "", "encodedPin", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.ChangePinViewModel */
/* loaded from: classes.dex */
public final class ChangePinViewModel extends BaseViewModel<ChangePinViewData> {
    private final Analytics analytics;
    private final ChangePin changePin;
    private final FetchCurrentUser fetchCurrentUser;
    private final PinRepositoryImpl pinRepositoryImpl;
    private final SettingsNavigator settingsNavigator;
    private final SharedPreferences sharedPreferences;
    private User user;

    public ChangePinViewModel(ChangePin changePin, FetchCurrentUser fetchCurrentUser, SettingsNavigator settingsNavigator, SharedPreferences sharedPreferences, Analytics analytics, PinRepositoryImpl pinRepositoryImpl) {
        Log_OC.getArray(changePin, "changePin");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(pinRepositoryImpl, "pinRepositoryImpl");
        this.changePin = changePin;
        this.fetchCurrentUser = fetchCurrentUser;
        this.settingsNavigator = settingsNavigator;
        this.sharedPreferences = sharedPreferences;
        this.analytics = analytics;
        this.pinRepositoryImpl = pinRepositoryImpl;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isInputParamsValid(String str, String str2, String str3) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r4 = getState();
            ChangePinViewData $r5 = (ChangePinViewData) $r4;
            ChangePinViewData.Error $r6 = new ChangePinViewData.Error("Please enter old pin", null, null, 6, null);
            publish(ChangePinViewData.copy$default($r5, false, null, $r6, 3, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r42 = getState();
            ChangePinViewData $r52 = (ChangePinViewData) $r42;
            ChangePinViewData.Error $r62 = new ChangePinViewData.Error(null, "Please enter old pin", null, 5, null);
            publish(ChangePinViewData.copy$default($r52, false, null, $r62, 3, null));
            return false;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            ViewData $r43 = getState();
            ChangePinViewData $r53 = (ChangePinViewData) $r43;
            ChangePinViewData.Error $r63 = new ChangePinViewData.Error(null, "Please enter old pin", null, 5, null);
            publish(ChangePinViewData.copy$default($r53, false, null, $r63, 3, null));
            return false;
        }
        boolean $z04 = Log_OC.append(str2, str3);
        if ($z04) {
            return true;
        }
        ViewData $r44 = getState();
        ChangePinViewData $r54 = (ChangePinViewData) $r44;
        ChangePinViewData.Error $r64 = new ChangePinViewData.Error(null, "Both pins must be the same", null, 5, null);
        publish(ChangePinViewData.copy$default($r54, false, null, $r64, 3, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40876resetPin$lambda0(ChangePinViewModel changePinViewModel, String str, String str2, User user) {
        Log_OC.getArray(changePinViewModel, "this$0");
        Log_OC.getArray(str, "$newPin");
        Log_OC.getArray(str2, "$oldPin");
        Log_OC.getArray(user, "it");
        changePinViewModel.user = user;
        ChangePin $r4 = changePinViewModel.changePin;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        String $r7 = user.getPhoneNumber();
        Log_OC.loadImage($r7, "it.phoneNumber");
        ChangePinRequest $r6 = new ChangePinRequest(str, str2, $r7);
        AbstractC11688p $r8 = $r4.changePin($r5, $r6);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-1  reason: not valid java name */
    public static final void m40877resetPin$lambda1(ChangePinViewModel changePinViewModel, String str, ChangePinResponse changePinResponse) {
        Log_OC.getArray(changePinViewModel, "this$0");
        Log_OC.getArray(str, "$encodedPin");
        Analytics $r3 = changePinViewModel.analytics;
        User $r4 = changePinViewModel.user;
        Log_OC.append($r4);
        String $r5 = $r4.getPhoneNumber();
        Log_OC.loadImage($r5, "user!!.phoneNumber");
        $r3.onResetPinButtonClick($r5, "successful");
        SharedPreferences $r6 = changePinViewModel.sharedPreferences;
        boolean $z0 = $r6.getBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, false);
        if ($z0) {
            PinRepositoryImpl $r7 = changePinViewModel.pinRepositoryImpl;
            User $r42 = changePinViewModel.user;
            Log_OC.append($r42);
            String $r52 = $r42.getPhoneNumber();
            Log_OC.loadImage($r52, "user!!.phoneNumber");
            $r7.savePin($r52, str);
        }
        ViewData $r8 = changePinViewModel.getState();
        ChangePinViewData $r9 = ChangePinViewData.copy$default((ChangePinViewData) $r8, false, "Pin has been Changed Successfully", null, 4, null);
        changePinViewModel.publish($r9);
        SettingsNavigator $r10 = changePinViewModel.settingsNavigator;
        $r10.finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-2  reason: not valid java name */
    public static final void m40878resetPin$lambda2(ChangePinViewModel changePinViewModel, Throwable th) {
        Log_OC.getArray(changePinViewModel, "this$0");
        Analytics $r2 = changePinViewModel.analytics;
        User $r3 = changePinViewModel.user;
        Log_OC.append($r3);
        String $r4 = $r3.getPhoneNumber();
        Log_OC.loadImage($r4, "user!!.phoneNumber");
        $r2.onResetPinButtonClick($r4, "failed");
        ViewData $r5 = changePinViewModel.getState();
        ChangePinViewData $r6 = (ChangePinViewData) $r5;
        InterfaceC11767l $r8 = KudiErrorParserKt.parseHttpError2$default("Unable to reset pin, please check that you put in correct credentials and try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r9 = $r8.invoke(th);
        ChangePinViewData.Error $r7 = new ChangePinViewData.Error(null, null, (String) $r9, 3, null);
        changePinViewModel.publish(ChangePinViewData.copy$default($r6, false, null, $r7, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ChangePinViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ChangePinViewData initialData() {
        ChangePinViewData $r1 = new ChangePinViewData(false, null, null, 2, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resetPin(final String str, final String str2, String str3, final String str4) {
        Log_OC.getArray(str, "newPin");
        Log_OC.getArray(str2, "oldPin");
        Log_OC.getArray(str3, "confirmNewPin");
        Log_OC.getArray(str4, "encodedPin");
        boolean $z0 = isInputParamsValid(str2, str, str3);
        if ($z0) {
            ViewData $r5 = getState();
            ChangePinViewData $r6 = (ChangePinViewData) $r5;
            publish(ChangePinViewData.copy$default($r6, true, null, null, 4, null));
            FetchCurrentUser $r7 = this.fetchCurrentUser;
            AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
            AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.security.ui.viewModels.b
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    ChangePinViewModel $r1 = ChangePinViewModel.this;
                    String $r2 = str;
                    String $r3 = str2;
                    User $r62 = (User) obj;
                    InterfaceC11692s $r4 = ChangePinViewModel.m40876resetPin$lambda0($r1, $r2, $r3, $r62);
                    return $r4;
                }
            });
            FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.SimpleXYSeries
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    ChangePinViewModel $r1 = ChangePinViewModel.this;
                    String $r2 = str4;
                    ChangePinResponse $r4 = (ChangePinResponse) obj;
                    ChangePinViewModel.m40877resetPin$lambda1($r1, $r2, $r4);
                }
            }, new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.Chunk
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    ChangePinViewModel $r1 = ChangePinViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    ChangePinViewModel.m40878resetPin$lambda2($r1, $r3);
                }
            });
            Log_OC.loadImage($r13, "fetchCurrentUser.execute().flatMapObservable {\n                user = it\n                changePin.changePin(it.sessionId, ChangePinRequest(newPin, oldPin, it.phoneNumber))\n            }.subscribe(\n                {\n                    analytics.onResetPinButtonClick(user!!.phoneNumber, \"successful\")\n                    if (sharedPreferences.getBoolean(\n                            LoginParams.EXTRA_ENABLE_FINGERPRINT,\n                            false\n                        )\n                    ) {\n                        pinRepositoryImpl.savePin(user!!.phoneNumber, encodedPin)\n                    }\n                    publish(\n                        state.copy(\n                            isChangingPin = false,\n                            feedBack = \"Pin has been Changed Successfully\"\n                        )\n                    )\n                    settingsNavigator.finishFragment()\n                },\n                {\n                    analytics.onResetPinButtonClick(user!!.phoneNumber, \"failed\")\n                    publish(\n                        state.copy(\n                            isChangingPin = false,\n                            error = ChangePinViewData.Error(\n                                message = parseHttpError2(\n                                    \"Unable to reset pin, please check that you put in correct credentials and try again\"\n                                )(\n                                    it\n                                )\n                            )\n                        )\n                    )\n                }\n            )");
            C11280b $r14 = getCompositeDisposable();
            RxExtKt.addTo($r13, $r14);
        }
    }
}
