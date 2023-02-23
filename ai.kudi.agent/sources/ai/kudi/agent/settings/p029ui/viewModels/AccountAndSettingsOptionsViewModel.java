package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.settings.data.SettingsOption;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.viewModels.data.AccountAndSettingsOptionsViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: AccountAndSettingsOptionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/settings/ui/viewModels/AccountAndSettingsOptionsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/settings/navigators/SettingsNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "getAccountSettingsOptions", "", "initialData", "onAppUpdateAvailable", "onOptionItemClicked", "option", "Lai/kudi/agent/settings/data/SettingsOption;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.viewModels.AccountAndSettingsOptionsViewModel */
/* loaded from: classes.dex */
public final class AccountAndSettingsOptionsViewModel extends BaseViewModel<AccountAndSettingsOptionsViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final SettingsNavigator settingsNavigator;

    public AccountAndSettingsOptionsViewModel(SettingsNavigator settingsNavigator, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.settingsNavigator = settingsNavigator;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAccountSettingsOptions$lambda-0  reason: not valid java name */
    public static final void m40915getAccountSettingsOptions$lambda0(AccountAndSettingsOptionsViewModel accountAndSettingsOptionsViewModel, User user) {
        Log_OC.getArray(accountAndSettingsOptionsViewModel, "this$0");
        SettingsOption.Companion $r4 = SettingsOption.Companion;
        List $r2 = $r4.values();
        Log_OC.loadImage(user, "it");
        AccountAndSettingsOptionsViewData.Settings $r3 = new AccountAndSettingsOptionsViewData.Settings($r2, user);
        accountAndSettingsOptionsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onAppUpdateAvailable$lambda-3  reason: not valid java name */
    public static final void m40917onAppUpdateAvailable$lambda3(AccountAndSettingsOptionsViewModel accountAndSettingsOptionsViewModel, List list, User user) {
        Log_OC.getArray(accountAndSettingsOptionsViewModel, "this$0");
        Log_OC.getArray(list, "$newList");
        Log_OC.loadImage(user, "it");
        AccountAndSettingsOptionsViewData.Settings $r3 = new AccountAndSettingsOptionsViewData.Settings(list, user);
        accountAndSettingsOptionsViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getAccountSettingsOptions() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AccountAndSettingsOptionsViewModel $r12 = AccountAndSettingsOptionsViewModel.this;
                User $r3 = (User) obj;
                AccountAndSettingsOptionsViewModel.m40915getAccountSettingsOptions$lambda0($r12, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                publish(AccountAndSettingsOptionsViewData.Settings(SettingsOption.values(), it))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        AccountAndSettingsOptionsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public AccountAndSettingsOptionsViewData initialData() {
        AccountAndSettingsOptionsViewData.Initial r1 = AccountAndSettingsOptionsViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onAppUpdateAvailable() {
        final List $r2;
        SettingsOption.Companion $r1 = SettingsOption.Companion;
        $r2 = C13742z.m3823D0($r1.values());
        SettingsOption.AppUpdate $r3 = SettingsOption.AppUpdate.INSTANCE;
        $r2.add($r3);
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.SimpleXYSeries
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AccountAndSettingsOptionsViewModel $r12 = AccountAndSettingsOptionsViewModel.this;
                List $r22 = $r2;
                User $r42 = (User) obj;
                AccountAndSettingsOptionsViewModel.m40917onAppUpdateAvailable$lambda3($r12, $r22, $r42);
            }
        };
        C0562c $r7 = C0562c.f1517d;
        FavoritesArrayAdapter $r8 = $r5.s(object, $r7);
        Log_OC.loadImage($r8, "fetchCurrentUser.execute().subscribe(\n            {\n                publish(AccountAndSettingsOptionsViewData.Settings(newList, it))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOptionItemClicked(SettingsOption settingsOption) {
        Log_OC.getArray(settingsOption, "option");
        SettingsNavigator $r2 = this.settingsNavigator;
        settingsOption.navigate($r2);
    }
}
