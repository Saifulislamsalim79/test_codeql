package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.dto.BusinessCategoryData;
import ai.kudi.agent.register.domain.usecases.FetchBusinessCategories;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.settings.domain.package_4.EditProfileRequest;
import ai.kudi.agent.settings.domain.package_4.EditProfileResponse;
import ai.kudi.agent.settings.domain.package_4.UserProfileResponse;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.settings.insurance.domain.SwitchCustomerType;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.viewModels.data.SwitchAccountViewData;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
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
/* compiled from: SwitchAccountViewModel.kt */
@Metadata(m10422d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\b\u0010&\u001a\u00020\u0002H\u0016J\u000e\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020#2\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010\u0007\u001a\u00020#2\u0006\u0010(\u001a\u00020)R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/settings/ui/viewModels/SwitchAccountViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/ui/viewModels/data/SwitchAccountViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "switchCustomerType", "Lai/kudi/agent/settings/insurance/domain/SwitchCustomerType;", "updateUser", "Lai/kudi/agent/users/domain/usecases/UpdateUser;", "editProfile", "Lai/kudi/agent/settings/domain/useCases/EditProfile;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "fetchBusinessCategories", "Lai/kudi/agent/register/domain/usecases/FetchBusinessCategories;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/settings/insurance/domain/SwitchCustomerType;Lai/kudi/agent/users/domain/usecases/UpdateUser;Lai/kudi/agent/settings/domain/useCases/EditProfile;Lai/kudi/agent/settings/navigators/SettingsNavigator;Lai/kudi/agent/register/domain/usecases/FetchBusinessCategories;)V", "businessCategories", "", "Lai/kudi/agent/register/domain/dto/BusinessCategoryData;", "getBusinessCategories", "()Ljava/util/List;", "setBusinessCategories", "(Ljava/util/List;)V", "isSwitchSuccessful", "", "()Z", "setSwitchSuccessful", "(Z)V", "selectedTarget", "Lai/kudi/agent/register/domain/dto/AccountType;", "getSelectedTarget", "()Lai/kudi/agent/register/domain/dto/AccountType;", "setSelectedTarget", "(Lai/kudi/agent/register/domain/dto/AccountType;)V", "checkSelectedTarget", "", "fetchCurrentUserAccountType", "fetchPrimaryBusinessCategories", "initialData", "switchAccount", "primaryBusinessCategory", "", "updateLocalUser", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.viewModels.SwitchAccountViewModel */
/* loaded from: classes.dex */
public final class SwitchAccountViewModel extends BaseViewModel<SwitchAccountViewData> {
    private List<BusinessCategoryData> businessCategories;
    private final EditProfile editProfile;
    private final FetchBusinessCategories fetchBusinessCategories;
    private final FetchCurrentUser fetchCurrentUser;
    private boolean isSwitchSuccessful;
    private AccountType selectedTarget;
    private final SettingsNavigator settingsNavigator;
    private final SwitchCustomerType switchCustomerType;
    private final UpdateUser updateUser;

    public SwitchAccountViewModel(FetchCurrentUser fetchCurrentUser, SwitchCustomerType switchCustomerType, UpdateUser updateUser, EditProfile editProfile, SettingsNavigator settingsNavigator, FetchBusinessCategories fetchBusinessCategories) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(switchCustomerType, "switchCustomerType");
        Log_OC.getArray(updateUser, "updateUser");
        Log_OC.getArray(editProfile, "editProfile");
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        Log_OC.getArray(fetchBusinessCategories, "fetchBusinessCategories");
        this.fetchCurrentUser = fetchCurrentUser;
        this.switchCustomerType = switchCustomerType;
        this.updateUser = updateUser;
        this.editProfile = editProfile;
        this.settingsNavigator = settingsNavigator;
        this.fetchBusinessCategories = fetchBusinessCategories;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchCurrentUserAccountType$lambda-0  reason: not valid java name */
    public static final void m40922fetchCurrentUserAccountType$lambda0(SwitchAccountViewModel switchAccountViewModel, User user) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        ViewData $r3 = switchAccountViewModel.getState();
        SwitchAccountViewData $r4 = (SwitchAccountViewData) $r3;
        String $r1 = user.customerType;
        switchAccountViewModel.publish(SwitchAccountViewData.copy$default($r4, false, $r1, null, null, null, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchPrimaryBusinessCategories$lambda-2  reason: not valid java name */
    public static final void m40924fetchPrimaryBusinessCategories$lambda2(SwitchAccountViewModel switchAccountViewModel, List list) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        switchAccountViewModel.setBusinessCategories(list);
        ViewData $r2 = switchAccountViewModel.getState();
        SwitchAccountViewData $r3 = (SwitchAccountViewData) $r2;
        switchAccountViewModel.publish(SwitchAccountViewData.copy$default($r3, false, null, null, null, list, 15, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchPrimaryBusinessCategories$lambda-3  reason: not valid java name */
    public static final void m40925fetchPrimaryBusinessCategories$lambda3(SwitchAccountViewModel switchAccountViewModel, Throwable th) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        ViewData $r2 = switchAccountViewModel.getState();
        SwitchAccountViewData $r3 = (SwitchAccountViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        switchAccountViewModel.publish(SwitchAccountViewData.copy$default($r3, false, null, null, (String) $r5, null, 23, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: switchAccount$lambda-7$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m40926switchAccount$lambda7$lambda4(SwitchAccountViewModel switchAccountViewModel, AccountType accountType, User user) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        Log_OC.getArray(accountType, "$accountType");
        Log_OC.getArray(user, "it");
        SwitchCustomerType $r3 = switchAccountViewModel.switchCustomerType;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        String $r6 = accountType.name();
        SwitchCustomerType.SwitchCustomerTypeInput $r4 = new SwitchCustomerType.SwitchCustomerTypeInput($r5, $r6);
        AbstractC11688p $r7 = $r3.execute($r4);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: switchAccount$lambda-7$lambda-5  reason: not valid java name */
    public static final void m40927switchAccount$lambda7$lambda5(SwitchAccountViewModel switchAccountViewModel, String str, UserProfileResponse userProfileResponse) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        Log_OC.getArray(str, "$primaryBusinessCategory");
        switchAccountViewModel.setSwitchSuccessful(true);
        switchAccountViewModel.updateUser(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: switchAccount$lambda-7$lambda-6  reason: not valid java name */
    public static final void m40928switchAccount$lambda7$lambda6(SwitchAccountViewModel switchAccountViewModel, Throwable th) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        ViewData $r2 = switchAccountViewModel.getState();
        SwitchAccountViewData $r3 = (SwitchAccountViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        switchAccountViewModel.publish(SwitchAccountViewData.copy$default($r3, false, null, null, (String) $r5, null, 22, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateLocalUser(final String str) {
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.ui.viewModels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = SwitchAccountViewModel.m40929updateLocalUser$lambda11($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                User $r32 = (User) obj;
                SwitchAccountViewModel.m40930updateLocalUser$lambda12($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SwitchAccountViewModel.m40931updateLocalUser$lambda13($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "fetchCurrentUser.execute().flatMapObservable {\n            updateUser.execute(\n                it.toBuilder().setPrimaryBusinessCategory(primaryBusinessCategory).setCustomerType(selectedTarget?.name).build()\n            )\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false))\n                settingsNavigator.finishFragment()\n            },\n            {\n                it.printStackTrace()\n                // navigate regardless since server has been updated\n                publish(state.copy(isLoading = false))\n                settingsNavigator.finishFragment()\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateLocalUser$lambda-11  reason: not valid java name */
    public static final InterfaceC11692s m40929updateLocalUser$lambda11(SwitchAccountViewModel switchAccountViewModel, String str, User user) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        Log_OC.getArray(str, "$primaryBusinessCategory");
        Log_OC.getArray(user, "it");
        UpdateUser $r3 = switchAccountViewModel.updateUser;
        User.Builder $r4 = user.toBuilder();
        User.Builder $r42 = $r4.setPrimaryBusinessCategory(str);
        AccountType $r5 = switchAccountViewModel.getSelectedTarget();
        String $r1 = $r5 == null ? null : $r5.name();
        User $r2 = $r42.setCustomerType($r1).build();
        Log_OC.loadImage($r2, "it.toBuilder().setPrimaryBusinessCategory(primaryBusinessCategory).setCustomerType(selectedTarget?.name).build()");
        AbstractC11688p $r6 = $r3.execute($r2);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateLocalUser$lambda-12  reason: not valid java name */
    public static final void m40930updateLocalUser$lambda12(SwitchAccountViewModel switchAccountViewModel, User user) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        ViewData $r2 = switchAccountViewModel.getState();
        SwitchAccountViewData $r3 = (SwitchAccountViewData) $r2;
        switchAccountViewModel.publish(SwitchAccountViewData.copy$default($r3, false, null, null, null, null, 30, null));
        SettingsNavigator $r4 = switchAccountViewModel.settingsNavigator;
        $r4.finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateLocalUser$lambda-13  reason: not valid java name */
    public static final void m40931updateLocalUser$lambda13(SwitchAccountViewModel switchAccountViewModel, Throwable th) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = switchAccountViewModel.getState();
        SwitchAccountViewData $r3 = (SwitchAccountViewData) $r2;
        switchAccountViewModel.publish(SwitchAccountViewData.copy$default($r3, false, null, null, null, null, 30, null));
        SettingsNavigator $r4 = switchAccountViewModel.settingsNavigator;
        $r4.finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateUser$lambda-10  reason: not valid java name */
    public static final void m40932updateUser$lambda10(SwitchAccountViewModel switchAccountViewModel, Throwable th) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        ViewData $r2 = switchAccountViewModel.getState();
        SwitchAccountViewData $r3 = (SwitchAccountViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        switchAccountViewModel.publish(SwitchAccountViewData.copy$default($r3, false, null, null, (String) $r5, null, 22, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateUser$lambda-8  reason: not valid java name */
    public static final InterfaceC11692s m40933updateUser$lambda8(SwitchAccountViewModel switchAccountViewModel, String str, User user) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        Log_OC.getArray(str, "$primaryBusinessCategory");
        Log_OC.getArray(user, "it");
        EditProfile $r9 = switchAccountViewModel.editProfile;
        String $r10 = user.getSessionId();
        Log_OC.loadImage($r10, "it.sessionId");
        String $r3 = user.getEmail();
        String $r4 = $r3;
        if ($r3 == null) {
            $r4 = "";
        }
        String $r6 = user.state;
        String $r5 = user.country;
        String $r11 = user.getBusinessName();
        String $r32 = user.businessAddress;
        String $r7 = user.closestLandmark;
        String $r8 = user.keywords;
        AccountType $r12 = switchAccountViewModel.getSelectedTarget();
        AccountType $r13 = AccountType.MERCHANT_AGENT;
        boolean z = $r12 == $r13;
        Log_OC.loadImage($r5, "lga");
        Log_OC.loadImage($r6, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        EditProfileRequest $r14 = new EditProfileRequest($r32, $r11, null, $r4, $r5, $r6, str, null, null, $r7, $r8, z, 388, null);
        AbstractC11688p $r15 = $r9.execute($r10, $r14);
        return $r15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateUser$lambda-9  reason: not valid java name */
    public static final void m40934updateUser$lambda9(SwitchAccountViewModel switchAccountViewModel, String str, EditProfileResponse editProfileResponse) {
        Log_OC.getArray(switchAccountViewModel, "this$0");
        Log_OC.getArray(str, "$primaryBusinessCategory");
        switchAccountViewModel.updateLocalUser(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkSelectedTarget() {
        ViewData $r1 = getState();
        SwitchAccountViewData $r2 = (SwitchAccountViewData) $r1;
        AccountType $r3 = this.selectedTarget;
        String $r4 = $r3 == null ? null : $r3.name();
        publish(SwitchAccountViewData.copy$default($r2, false, null, $r4, null, null, 27, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchCurrentUserAccountType() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r12 = SwitchAccountViewModel.this;
                User $r3 = (User) obj;
                SwitchAccountViewModel.m40922fetchCurrentUserAccountType$lambda0($r12, $r3);
            }
        };
        Function $r4 = Function.SUBTOTAL;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                publish(state.copy(currentCustomerType = it.customerType))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchPrimaryBusinessCategories() {
        FetchBusinessCategories $r2 = this.fetchBusinessCategories;
        AbstractC11688p $r3 = $r2.execute();
        FavoritesArrayAdapter $r5 = $r3.e0(new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                List $r32 = (List) obj;
                SwitchAccountViewModel.m40924fetchPrimaryBusinessCategories$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SwitchAccountViewModel.m40925fetchPrimaryBusinessCategories$lambda3($r1, $r32);
            }
        });
        Log_OC.loadImage($r5, "fetchBusinessCategories.execute().subscribe(\n            {\n                businessCategories = it\n                publish(state.copy(businessCategories = it))\n            },\n            {\n                publish(state.copy(message = parseHttpError2()(it)))\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBusinessCategories() {
        List r1 = this.businessCategories;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AccountType getSelectedTarget() {
        AccountType r1 = this.selectedTarget;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SwitchAccountViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SwitchAccountViewData initialData() {
        SwitchAccountViewData $r1 = new SwitchAccountViewData(false, null, null, null, null, 31, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isSwitchSuccessful() {
        boolean z0 = this.isSwitchSuccessful;
        return z0;
    }

    public final void setBusinessCategories(List list) {
        this.businessCategories = list;
    }

    public final void setSelectedTarget(AccountType accountType) {
        this.selectedTarget = accountType;
    }

    public final void setSwitchSuccessful(boolean z) {
        this.isSwitchSuccessful = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void switchAccount(final String str) {
        Log_OC.getArray(str, "primaryBusinessCategory");
        ViewData $r2 = getState();
        SwitchAccountViewData $r3 = (SwitchAccountViewData) $r2;
        publish(SwitchAccountViewData.copy$default($r3, true, null, null, null, null, 22, null));
        final AccountType $r4 = this.selectedTarget;
        if ($r4 == null) {
            return;
        }
        FetchCurrentUser $r5 = this.fetchCurrentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.ui.viewModels.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                AccountType $r22 = $r4;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = SwitchAccountViewModel.m40926switchAccount$lambda7$lambda4($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                String $r22 = str;
                UserProfileResponse $r42 = (UserProfileResponse) obj;
                SwitchAccountViewModel.m40927switchAccount$lambda7$lambda5($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SwitchAccountViewModel.m40928switchAccount$lambda7$lambda6($r1, $r32);
            }
        });
        Log_OC.loadImage($r11, "fetchCurrentUser.execute().flatMapObservable {\n                switchCustomerType.execute(\n                    SwitchCustomerType.SwitchCustomerTypeInput(\n                        it.sessionId,\n                        accountType.name\n                    )\n                )\n            }.subscribe(\n                {\n                    // call update primary business category\n                    isSwitchSuccessful = true\n                    updateUser(primaryBusinessCategory)\n                },\n                {\n                    publish(state.copy(isLoading = false, message = parseHttpError2()(it)))\n                }\n            )");
        C11280b $r12 = getCompositeDisposable();
        RxExtKt.addTo($r11, $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateUser(final String str) {
        Log_OC.getArray(str, "primaryBusinessCategory");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.ui.viewModels.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = SwitchAccountViewModel.m40933updateUser$lambda8($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                String $r22 = str;
                EditProfileResponse $r4 = (EditProfileResponse) obj;
                SwitchAccountViewModel.m40934updateUser$lambda9($r1, $r22, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.ui.viewModels.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SwitchAccountViewModel $r1 = SwitchAccountViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SwitchAccountViewModel.m40932updateUser$lambda10($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "fetchCurrentUser.execute().flatMapObservable {\n            editProfile.execute(\n                it.sessionId, EditProfileRequest(\n                    primaryBusinessCategory = primaryBusinessCategory,\n                    email = it.email.orEmpty(),\n                    state = it.state,\n                    lga = it.lga,\n                    businessName = it.businessName,\n                    businessAddress = it.businessAddress,\n                    closestLandmark = it.closestLandmark,\n                    bvn = it.bvn,\n                    agentBankingSelected = selectedTarget == AccountType.MERCHANT_AGENT\n                )\n            )\n        }.subscribe(\n            {\n                updateLocalUser(primaryBusinessCategory)\n            },\n            {\n                publish(state.copy(isLoading = false, message = parseHttpError2()(it)))\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }
}
