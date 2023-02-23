package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.model.CreateSavingsPinRequest;
import ai.kudi.agent.savings.data.model.CreateSavingsPinResponse;
import ai.kudi.agent.savings.data.model.RequestPinResetOtpResponse;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.SavingsRequest;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.savings.data.viewdata.CreateSavingPinViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.ConfirmOtp;
import ai.kudi.agent.savings.usecase.CreateSavingPin;
import ai.kudi.agent.savings.usecase.CreateSavings;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: CreateSavingPinViewModel.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020 H\u0002J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u0013J4\u0010#\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!H\u0002J\b\u0010&\u001a\u00020\u0013H\u0002J:\u0010'\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010 R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/CreateSavingPinViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingPinViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "createSavingPin", "Lai/kudi/agent/savings/usecase/CreateSavingPin;", "confirmOtp", "Lai/kudi/agent/savings/usecase/ConfirmOtp;", "savingsNavigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "createSavings", "Lai/kudi/agent/savings/usecase/CreateSavings;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/savings/usecase/CreateSavingPin;Lai/kudi/agent/savings/usecase/ConfirmOtp;Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/savings/usecase/CreateSavings;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "isNewUser", "", "createPin", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/CreateSavingsPinRequest;", "savingsRequest", "Lai/kudi/agent/savings/data/model/SavingsRequest;", "getUserInfo", "initialData", "Lai/kudi/agent/savings/data/viewdata/CreateSavingPinViewData$Initial;", "navigateToConfirmOtp", "mobile", "pin", "model", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "navigateToSavingSuccessDialog", "sendOtp", "updateSavingPlanRequest", "withdrawRequest", "updateSavingCategory", "validateInput", "confirmPin", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateSavingPinViewModel extends BaseViewModel<CreateSavingPinViewData> {
    private final ConfirmOtp confirmOtp;
    private final CreateSavingPin createSavingPin;
    private final CreateSavings createSavings;
    private final FetchCurrentUser fetchCurrentUser;
    private String isNewUser;
    private final SavingsNavigator savingsNavigator;
    private final UserRepository userRepository;

    public CreateSavingPinViewModel(FetchCurrentUser fetchCurrentUser, CreateSavingPin createSavingPin, ConfirmOtp confirmOtp, SavingsNavigator savingsNavigator, CreateSavings createSavings, UserRepository userRepository) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(createSavingPin, "createSavingPin");
        Log_OC.getArray(confirmOtp, "confirmOtp");
        Log_OC.getArray(savingsNavigator, "savingsNavigator");
        Log_OC.getArray(createSavings, "createSavings");
        Log_OC.getArray(userRepository, "userRepository");
        this.fetchCurrentUser = fetchCurrentUser;
        this.createSavingPin = createSavingPin;
        this.confirmOtp = confirmOtp;
        this.savingsNavigator = savingsNavigator;
        this.createSavings = createSavings;
        this.userRepository = userRepository;
        this.isNewUser = "";
        getUserInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createPin$lambda-3  reason: not valid java name */
    public static final void m40602createPin$lambda3(CreateSavingPinViewModel createSavingPinViewModel, CreateSavingsPinResponse createSavingsPinResponse) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        CreateSavingPinViewData.ShowProgress $r2 = new CreateSavingPinViewData.ShowProgress(false);
        createSavingPinViewModel.publish($r2);
        createSavingPinViewModel.updateSavingCategory();
        CreateSavingPinViewData.Success $r3 = CreateSavingPinViewData.Success.INSTANCE;
        createSavingPinViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createPin$lambda-4  reason: not valid java name */
    public static final void m40603createPin$lambda4(CreateSavingPinViewModel createSavingPinViewModel, Throwable th) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        CreateSavingPinViewData.ShowProgress $r2 = new CreateSavingPinViewData.ShowProgress(false);
        createSavingPinViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        CreateSavingPinViewData.Error $r3 = new CreateSavingPinViewData.Error((String) $r5, null, null, 6, null);
        createSavingPinViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createSavings$lambda-10  reason: not valid java name */
    public static final void m40604createSavings$lambda10(CreateSavingPinViewModel createSavingPinViewModel, SavingResponse savingResponse) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        CreateSavingPinViewData.ShowProgress $r2 = new CreateSavingPinViewData.ShowProgress(false);
        createSavingPinViewModel.publish($r2);
        Log_OC.loadImage(savingResponse, "it");
        CreateSavingPinViewData.SavingsCreatedSuccess $r3 = new CreateSavingPinViewData.SavingsCreatedSuccess(savingResponse);
        createSavingPinViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createSavings$lambda-11  reason: not valid java name */
    public static final void m40605createSavings$lambda11(CreateSavingPinViewModel createSavingPinViewModel, Throwable th) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        CreateSavingPinViewData.ShowProgress $r2 = new CreateSavingPinViewData.ShowProgress(false);
        createSavingPinViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        CreateSavingPinViewData.Error $r3 = new CreateSavingPinViewData.Error((String) $r5, null, null, 6, null);
        createSavingPinViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getUserInfo() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.savings.viewmodel.JsonParser
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingPinViewModel $r12 = CreateSavingPinViewModel.this;
                User $r3 = (User) obj;
                CreateSavingPinViewModel.m40606getUserInfo$lambda15($r12, $r3);
            }
        };
        HttpMethod $r4 = HttpMethod.Get;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                isNewUser = it.savingsCategory\n                publish(CreateSavingPinViewData.UserIfo(it))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getUserInfo$lambda-15  reason: not valid java name */
    public static final void m40606getUserInfo$lambda15(CreateSavingPinViewModel createSavingPinViewModel, User user) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        String $r2 = user.getSavingsCategory();
        Log_OC.loadImage($r2, "it.savingsCategory");
        createSavingPinViewModel.isNewUser = $r2;
        Log_OC.loadImage(user, "it");
        CreateSavingPinViewData.UserIfo $r3 = new CreateSavingPinViewData.UserIfo(user);
        createSavingPinViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToConfirmOtp(String str, String str2, CreateSavingsModel createSavingsModel) {
        SavingsNavigator $r4 = this.savingsNavigator;
        $r4.navigateToConfirmOtpFragment(str, str2, createSavingsModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToConfirmOtp(String str, String str2, UpdateSavingPlanRequest updateSavingPlanRequest) {
        SavingsNavigator $r4 = this.savingsNavigator;
        $r4.navigateToConfirmOtpFragment(str, str2, updateSavingPlanRequest);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToConfirmOtp(String str, String str2, WithdrawRequest withdrawRequest) {
        SavingsNavigator $r4 = this.savingsNavigator;
        $r4.navigateToConfirmOtpFragment(str, str2, withdrawRequest);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void sendOtp(final String str, final CreateSavingsModel createSavingsModel, final UpdateSavingPlanRequest updateSavingPlanRequest, final WithdrawRequest withdrawRequest) {
        CreateSavingPinViewData.ShowProgress $r6 = new CreateSavingPinViewData.ShowProgress(true);
        publish($r6);
        ConfirmOtp $r7 = this.confirmOtp;
        AbstractC11688p $r8 = $r7.requestOtp();
        FavoritesArrayAdapter $r10 = $r8.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingPinViewModel $r2 = CreateSavingPinViewModel.this;
                CreateSavingsModel $r3 = createSavingsModel;
                UpdateSavingPlanRequest $r4 = updateSavingPlanRequest;
                WithdrawRequest $r5 = withdrawRequest;
                String $r62 = str;
                RequestPinResetOtpResponse $r72 = (RequestPinResetOtpResponse) obj;
                CreateSavingPinViewModel.m40608sendOtp$lambda8($r2, $r3, $r4, $r5, $r62, $r72);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingPinViewModel $r1 = CreateSavingPinViewModel.this;
                Throwable $r3 = (Throwable) obj;
                CreateSavingPinViewModel.m40609sendOtp$lambda9($r1, $r3);
            }
        });
        Log_OC.loadImage($r10, "confirmOtp.requestOtp().subscribe(\n            { otpResponse ->\n                publish(CreateSavingPinViewData.ShowProgress(false))\n                model?.let {\n                    navigateToConfirmOtp(otpResponse.phoneNumber, pin, model)\n                }\n                updateSavingPlanRequest?.let {\n                    navigateToConfirmOtp(otpResponse.phoneNumber, pin, it)\n                }\n                withdrawRequest?.let {\n                    navigateToConfirmOtp(otpResponse.phoneNumber, pin, it)\n                }\n            },\n            {\n                publish(CreateSavingPinViewData.ShowProgress(false))\n                publish(CreateSavingPinViewData.Error(error = parseHttpError2()(it)))\n            }\n        )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void sendOtp$default(CreateSavingPinViewModel createSavingPinViewModel, String str, CreateSavingsModel $r2, UpdateSavingPlanRequest $r3, WithdrawRequest $r4, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r2 = null;
        }
        int $i12 = i & 4;
        if ($i12 != 0) {
            $r3 = null;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r4 = null;
        }
        createSavingPinViewModel.sendOtp(str, $r2, $r3, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtp$lambda-8  reason: not valid java name */
    public static final void m40608sendOtp$lambda8(CreateSavingPinViewModel createSavingPinViewModel, CreateSavingsModel createSavingsModel, UpdateSavingPlanRequest updateSavingPlanRequest, WithdrawRequest withdrawRequest, String str, RequestPinResetOtpResponse requestPinResetOtpResponse) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        Log_OC.getArray(str, "$pin");
        CreateSavingPinViewData.ShowProgress $r6 = new CreateSavingPinViewData.ShowProgress(false);
        createSavingPinViewModel.publish($r6);
        if (createSavingsModel != null) {
            String $r7 = requestPinResetOtpResponse.getPhoneNumber();
            createSavingPinViewModel.navigateToConfirmOtp($r7, str, createSavingsModel);
        }
        if (updateSavingPlanRequest != null) {
            String $r72 = requestPinResetOtpResponse.getPhoneNumber();
            createSavingPinViewModel.navigateToConfirmOtp($r72, str, updateSavingPlanRequest);
        }
        if (withdrawRequest == null) {
            return;
        }
        String $r73 = requestPinResetOtpResponse.getPhoneNumber();
        createSavingPinViewModel.navigateToConfirmOtp($r73, str, withdrawRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtp$lambda-9  reason: not valid java name */
    public static final void m40609sendOtp$lambda9(CreateSavingPinViewModel createSavingPinViewModel, Throwable th) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        CreateSavingPinViewData.ShowProgress $r2 = new CreateSavingPinViewData.ShowProgress(false);
        createSavingPinViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        CreateSavingPinViewData.Error $r3 = new CreateSavingPinViewData.Error((String) $r5, null, null, 6, null);
        createSavingPinViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateSavingCategory() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.viewmodel.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CreateSavingPinViewModel $r12 = CreateSavingPinViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = CreateSavingPinViewModel.m40610updateSavingCategory$lambda12($r12, $r42);
                return $r22;
            }
        });
        Token $r5 = Token.BOOL;
        Function $r6 = Function.LEN;
        FavoritesArrayAdapter $r7 = $r4.e0($r5, $r6);
        Log_OC.loadImage($r7, "fetchCurrentUser.execute().flatMapObservable {\n            val updatedUser = it.toBuilder()\n                .setSavingsCategory(SavingsPlanAdapter.UserCategory.EXISTING_USER.name)\n                .build()\n            userRepository.updateUser(updatedUser)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())\n        }.subscribe(\n            {},\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateSavingCategory$lambda-12  reason: not valid java name */
    public static final InterfaceC11692s m40610updateSavingCategory$lambda12(CreateSavingPinViewModel createSavingPinViewModel, User user) {
        Log_OC.getArray(createSavingPinViewModel, "this$0");
        Log_OC.getArray(user, "it");
        User.Builder $r2 = user.toBuilder();
        SavingsPlanAdapter.UserCategory $r3 = SavingsPlanAdapter.UserCategory.EXISTING_USER;
        String $r4 = $r3.name();
        User $r1 = $r2.setSavingsCategory($r4).build();
        UserRepository $r5 = createSavingPinViewModel.userRepository;
        Log_OC.loadImage($r1, "updatedUser");
        AbstractC11688p $r6 = $r5.updateUser($r1);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r62 = $r6.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        return $r62.R($r72);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSavingCategory$lambda-13  reason: not valid java name */
    public static final void m40611updateSavingCategory$lambda13(User user) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void validateInput$default(CreateSavingPinViewModel createSavingPinViewModel, String str, String str2, CreateSavingsModel $r5, WithdrawRequest $r3, UpdateSavingPlanRequest $r4, int i, Object obj) {
        int $i1 = i & 4;
        if ($i1 != 0) {
            $r5 = null;
        }
        int $i12 = i & 8;
        if ($i12 != 0) {
            $r3 = null;
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            $r4 = null;
        }
        createSavingPinViewModel.validateInput(str, str2, $r5, $r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createPin(CreateSavingsPinRequest createSavingsPinRequest) {
        Log_OC.getArray(createSavingsPinRequest, TransactionRequest.TYPE_REQUEST);
        CreateSavingPinViewData.ShowProgress $r2 = new CreateSavingPinViewData.ShowProgress(true);
        publish($r2);
        CreateSavingPin $r3 = this.createSavingPin;
        AbstractC11688p $r4 = $r3.createPin(createSavingsPinRequest);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.MultiUserChat$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingPinViewModel $r1 = CreateSavingPinViewModel.this;
                CreateSavingsPinResponse $r32 = (CreateSavingsPinResponse) obj;
                CreateSavingPinViewModel.m40602createPin$lambda3($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingPinViewModel $r1 = CreateSavingPinViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CreateSavingPinViewModel.m40603createPin$lambda4($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "createSavingPin.createPin(request).subscribe(\n            {\n                publish(CreateSavingPinViewData.ShowProgress(false))\n                updateSavingCategory()\n                publish(CreateSavingPinViewData.Success)\n            },\n            {\n                publish(CreateSavingPinViewData.ShowProgress(false))\n                publish(CreateSavingPinViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createSavings(SavingsRequest savingsRequest) {
        Log_OC.getArray(savingsRequest, "savingsRequest");
        CreateSavingPinViewData.ShowProgress $r2 = new CreateSavingPinViewData.ShowProgress(true);
        publish($r2);
        CreateSavings $r3 = this.createSavings;
        AbstractC11688p $r4 = $r3.createSavingGoal(savingsRequest);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingPinViewModel $r1 = CreateSavingPinViewModel.this;
                SavingResponse $r32 = (SavingResponse) obj;
                CreateSavingPinViewModel.m40604createSavings$lambda10($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingPinViewModel $r1 = CreateSavingPinViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CreateSavingPinViewModel.m40605createSavings$lambda11($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "createSavings.createSavingGoal(savingsRequest).subscribe(\n            {\n                publish(CreateSavingPinViewData.ShowProgress(visibility = false))\n                publish(CreateSavingPinViewData.SavingsCreatedSuccess(it))\n            },\n            {\n                publish(CreateSavingPinViewData.ShowProgress(visibility = false))\n                publish(CreateSavingPinViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CreateSavingPinViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CreateSavingPinViewData.Initial initialData() {
        CreateSavingPinViewData.Initial r1 = CreateSavingPinViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSavingSuccessDialog() {
        SavingsNavigator $r1 = this.savingsNavigator;
        $r1.navigateToSavingsSuccess();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void validateInput(String str, String str2, CreateSavingsModel createSavingsModel, WithdrawRequest withdrawRequest, UpdateSavingPlanRequest updateSavingPlanRequest) {
        boolean $z0;
        boolean $z02;
        Log_OC.getArray(str, "pin");
        Log_OC.getArray(str2, "confirmPin");
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            CreateSavingPinViewData.Error $r6 = new CreateSavingPinViewData.Error(null, "Please enter your new pin", null, 5, null);
            publish($r6);
            return;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            CreateSavingPinViewData.Error $r62 = new CreateSavingPinViewData.Error(null, null, "Please confirm your new pin", 3, null);
            publish($r62);
            return;
        }
        boolean $z03 = Log_OC.append(str, str2);
        if (!$z03) {
            CreateSavingPinViewData.Error $r63 = new CreateSavingPinViewData.Error(null, "Both pins must be the same", null, 5, null);
            publish($r63);
            return;
        }
        String $r2 = this.isNewUser;
        SavingsPlanAdapter.UserCategory $r7 = SavingsPlanAdapter.UserCategory.NEW_USER;
        String $r8 = $r7.name();
        boolean $z04 = Log_OC.append($r2, $r8);
        if ($z04) {
            CreateSavingsPinRequest $r9 = new CreateSavingsPinRequest(str);
            createPin($r9);
            return;
        }
        if (createSavingsModel != null) {
            sendOtp$default(this, str, createSavingsModel, null, null, 12, null);
        }
        if (withdrawRequest != null) {
            sendOtp$default(this, str, null, null, withdrawRequest, 6, null);
        }
        if (updateSavingPlanRequest == null) {
            return;
        }
        sendOtp$default(this, str, null, updateSavingPlanRequest, null, 10, null);
    }
}
