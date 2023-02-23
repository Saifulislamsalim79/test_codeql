package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.domain.useCases.GetMonthlyKycLevels;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.AboutKycViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
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
/* compiled from: AboutKycViewModel.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/AboutKycViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/AboutKycViewData;", "getMonthlyKycLevels", "Lai/kudi/agent/settings/domain/useCases/GetMonthlyKycLevels;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/settings/domain/useCases/GetMonthlyKycLevels;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.AboutKycViewModel */
/* loaded from: classes.dex */
public final class AboutKycViewModel extends BaseViewModel<AboutKycViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final GetMonthlyKycLevels getMonthlyKycLevels;

    public AboutKycViewModel(GetMonthlyKycLevels getMonthlyKycLevels, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(getMonthlyKycLevels, "getMonthlyKycLevels");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.getMonthlyKycLevels = getMonthlyKycLevels;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonthlyKycLevels$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40829getMonthlyKycLevels$lambda0(AboutKycViewModel aboutKycViewModel, User user) {
        Log_OC.getArray(aboutKycViewModel, "this$0");
        Log_OC.getArray(user, "it");
        GetMonthlyKycLevels $r2 = aboutKycViewModel.getMonthlyKycLevels;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonthlyKycLevels$lambda-1  reason: not valid java name */
    public static final void m40830getMonthlyKycLevels$lambda1(AboutKycViewModel aboutKycViewModel, List list) {
        Log_OC.getArray(aboutKycViewModel, "this$0");
        ViewData $r2 = aboutKycViewModel.getState();
        AboutKycViewData $r3 = (AboutKycViewData) $r2;
        aboutKycViewModel.publish(AboutKycViewData.copy$default($r3, false, list, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonthlyKycLevels$lambda-2  reason: not valid java name */
    public static final void m40831getMonthlyKycLevels$lambda2(AboutKycViewModel aboutKycViewModel, Throwable th) {
        Log_OC.getArray(aboutKycViewModel, "this$0");
        ViewData $r3 = aboutKycViewModel.getState();
        AboutKycViewData $r4 = (AboutKycViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        AboutKycViewData.Error $r1 = new AboutKycViewData.Error((String) $r6);
        aboutKycViewModel.publish(AboutKycViewData.copy$default($r4, false, null, $r1, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getMonthlyKycLevels() {
        ViewData $r1 = getState();
        AboutKycViewData $r2 = (AboutKycViewData) $r1;
        publish(AboutKycViewData.copy$default($r2, true, null, null, 6, null));
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AboutKycViewModel $r12 = AboutKycViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = AboutKycViewModel.m40829getMonthlyKycLevels$lambda0($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AboutKycViewModel $r12 = AboutKycViewModel.this;
                List $r32 = (List) obj;
                AboutKycViewModel.m40830getMonthlyKycLevels$lambda1($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AboutKycViewModel $r12 = AboutKycViewModel.this;
                Throwable $r32 = (Throwable) obj;
                AboutKycViewModel.m40831getMonthlyKycLevels$lambda2($r12, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        AboutKycViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public AboutKycViewData initialData() {
        AboutKycViewData $r1 = new AboutKycViewData(false, null, null, 2, null);
        return $r1;
    }
}
