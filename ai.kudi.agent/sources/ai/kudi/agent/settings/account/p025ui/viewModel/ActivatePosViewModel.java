package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.account.p025ui.data.ActivatePosViewData;
import ai.kudi.agent.settings.domain.package_4.PosActivationData;
import ai.kudi.agent.settings.domain.useCases.ActivatePos;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Locale;
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
/* compiled from: ActivatePosViewModel.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/viewModel/ActivatePosViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/account/ui/data/ActivatePosViewData;", "activatePos", "Lai/kudi/agent/settings/domain/useCases/ActivatePos;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/settings/domain/useCases/ActivatePos;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "phoneno", "", "", "terminalId", "initialData", "isInvalidInputParams", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.ActivatePosViewModel */
/* loaded from: classes.dex */
public final class ActivatePosViewModel extends BaseViewModel<ActivatePosViewData> {
    private final ActivatePos activatePos;
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private String phoneno;

    public ActivatePosViewModel(ActivatePos activatePos, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(activatePos, "activatePos");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.activatePos = activatePos;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.phoneno = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: activatePos$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40698activatePos$lambda0(ActivatePosViewModel activatePosViewModel, String str, User user) {
        Log_OC.getArray(activatePosViewModel, "this$0");
        Log_OC.getArray(str, "$terminalId");
        Log_OC.getArray(user, "user");
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "user.phoneNumber");
        activatePosViewModel.phoneno = $r3;
        ActivatePos $r4 = activatePosViewModel.activatePos;
        String $r32 = user.getSessionId();
        Log_OC.loadImage($r32, "user.sessionId");
        Locale $r5 = Locale.ROOT;
        String $r1 = str.toUpperCase($r5);
        Log_OC.loadImage($r1, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        AbstractC11688p $r6 = $r4.execute($r32, $r1);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: activatePos$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40699activatePos$lambda1(ActivatePosViewModel activatePosViewModel, PosActivationData posActivationData) {
        Log_OC.getArray(activatePosViewModel, "this$0");
        Log_OC.getArray(posActivationData, "it");
        ActivatePos $r2 = activatePosViewModel.activatePos;
        String $r3 = posActivationData.getTerminalId();
        String $r4 = posActivationData.getAcquiringBank();
        AbstractC11688p $r5 = $r2.updateUser($r3, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: activatePos$lambda-2  reason: not valid java name */
    public static final void m40700activatePos$lambda2(ActivatePosViewModel activatePosViewModel, String str, User user) {
        Log_OC.getArray(activatePosViewModel, "this$0");
        Log_OC.getArray(str, "$terminalId");
        Analytics $r3 = activatePosViewModel.analytics;
        String $r4 = activatePosViewModel.phoneno;
        $r3.onActivateTerminalButtonClick(str, $r4);
        ViewData $r5 = activatePosViewModel.getState();
        ActivatePosViewData $r6 = (ActivatePosViewData) $r5;
        activatePosViewModel.publish($r6.copy(false, null, "Terminal Successfully Activated"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: activatePos$lambda-3  reason: not valid java name */
    public static final void m40701activatePos$lambda3(ActivatePosViewModel activatePosViewModel, Throwable th) {
        Log_OC.getArray(activatePosViewModel, "this$0");
        ViewData $r3 = activatePosViewModel.getState();
        ActivatePosViewData $r4 = (ActivatePosViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        ActivatePosViewData.Error $r1 = new ActivatePosViewData.Error((String) $r6, null, 2, null);
        activatePosViewModel.publish(ActivatePosViewData.copy$default($r4, false, $r1, null, 4, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isInvalidInputParams(String str) {
        boolean $z0;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r3 = getState();
            ActivatePosViewData $r4 = (ActivatePosViewData) $r3;
            ActivatePosViewData.Error $r1 = new ActivatePosViewData.Error("Terminal Id cannot be empty", null, 2, null);
            publish(ActivatePosViewData.copy$default($r4, false, $r1, null, 4, null));
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void activatePos(final String str) {
        Log_OC.getArray(str, "terminalId");
        ViewData $r2 = getState();
        ActivatePosViewData $r3 = (ActivatePosViewData) $r2;
        publish(ActivatePosViewData.copy$default($r3, true, null, null, 4, null));
        boolean $z0 = isInvalidInputParams(str);
        if ($z0) {
            return;
        }
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.account.ui.viewModel.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ActivatePosViewModel $r1 = ActivatePosViewModel.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = ActivatePosViewModel.m40698activatePos$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r11 = $r7.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.account.ui.viewModel.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ActivatePosViewModel $r1 = ActivatePosViewModel.this;
                PosActivationData $r42 = (PosActivationData) obj;
                InterfaceC11692s $r22 = ActivatePosViewModel.m40699activatePos$lambda1($r1, $r42);
                return $r22;
            }
        }).e0(new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ActivatePosViewModel $r1 = ActivatePosViewModel.this;
                String $r22 = str;
                User $r42 = (User) obj;
                ActivatePosViewModel.m40700activatePos$lambda2($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ActivatePosViewModel $r1 = ActivatePosViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ActivatePosViewModel.m40701activatePos$lambda3($r1, $r32);
            }
        });
        Log_OC.loadImage($r11, "fetchCurrentUser.execute().flatMapObservable { user ->\n            phoneno = user.phoneNumber\n            activatePos.execute(user.sessionId, terminalId.uppercase())\n        }.flatMap {\n            activatePos.updateUser(it.terminalId, it.acquiringBank)\n        }.subscribe({\n            analytics.onActivateTerminalButtonClick(terminalId, phoneno)\n            publish(\n                state.copy(\n                    isActivating = false,\n                    error = null,\n                    feedback = \"Terminal Successfully Activated\"\n                )\n            )\n        }, {\n            publish(\n                state.copy(\n                    isActivating = false,\n                    error = ActivatePosViewData.Error(\n                        parseHttpError2(\n                            \"Something went wrong, please retry\"\n                        )(it)\n                    )\n                )\n            )\n        }\n        )");
        C11280b $r12 = getCompositeDisposable();
        RxExtKt.addTo($r11, $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ActivatePosViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ActivatePosViewData initialData() {
        ActivatePosViewData $r1 = new ActivatePosViewData(false, null, null, 7, null);
        return $r1;
    }
}
