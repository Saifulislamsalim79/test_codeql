package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.FirebaseAnalyticsImpl;
import ai.kudi.agent.core.analytics.contracts.InsuranceAnalytics;
import ai.kudi.agent.core.domain.room_entities.InsuranceStatusModel;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.account.p025ui.viewModel.InsuranceSignUpState;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.settings.domain.useCases.InsuranceSignUpRequest;
import ai.kudi.agent.settings.domain.useCases.InsuranceStatus;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
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
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: InsuranceSignupViewModel.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\u001e\u0010\u0019\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/viewModel/InsuranceSignupViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/account/ui/viewModel/InsuranceSignUpState;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "insuranceRequests", "Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;", "application", "Landroid/app/Application;", "(Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;Landroid/app/Application;)V", "phoneNo", "", "getPhoneNo", "()Ljava/lang/String;", "setPhoneNo", "(Ljava/lang/String;)V", "getUser", "", "initialData", "isInputParamsValid", "", "contactPhoneNumber", "onCleared", "signUp", "employees", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.InsuranceSignupViewModel */
/* loaded from: classes.dex */
public final class InsuranceSignupViewModel extends BaseViewModel<InsuranceSignUpState> {
    private final Analytics analytics;
    private final Application application;
    private final FetchCurrentUser currentUser;
    private final InsuranceRequests insuranceRequests;
    private String phoneNo;

    public InsuranceSignupViewModel(Analytics analytics, FetchCurrentUser fetchCurrentUser, InsuranceRequests insuranceRequests, Application application) {
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(insuranceRequests, "insuranceRequests");
        Log_OC.getArray(application, "application");
        this.analytics = analytics;
        this.currentUser = fetchCurrentUser;
        this.insuranceRequests = insuranceRequests;
        this.application = application;
        this.phoneNo = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getUser$lambda-0  reason: not valid java name */
    public static final void m40713getUser$lambda0(InsuranceSignupViewModel insuranceSignupViewModel, User user) {
        Log_OC.getArray(insuranceSignupViewModel, "this$0");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        insuranceSignupViewModel.setPhoneNo($r2);
        String $r22 = user.getPhoneNumber();
        Log_OC.loadImage($r22, "it.phoneNumber");
        InsuranceSignUpState.AgentPhoneNumber $r3 = new InsuranceSignUpState.AgentPhoneNumber($r22);
        insuranceSignupViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isInputParamsValid(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto Lb
            int r0 = r6.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            if (r1 == 0) goto L21
            ai.kudi.agent.settings.account.ui.viewModel.InsuranceSignUpState$Error r2 = new ai.kudi.agent.settings.account.ui.viewModel.InsuranceSignUpState$Error
            android.app.Application r3 = r5.application
            r4 = 2131886546(0x7f1201d2, float:1.9407674E38)
            java.lang.String r6 = r3.getString(r4)
            r2.<init>(r6)
            r5.publish(r2)
        L1f:
            r4 = 0
            return r4
        L21:
            boolean r1 = ai.kudi.agent.core.util.StringExtKt.isNigerianPhoneNumber(r6)
            if (r1 != 0) goto L39
            ai.kudi.agent.settings.account.ui.viewModel.InsuranceSignUpState$Error r2 = new ai.kudi.agent.settings.account.ui.viewModel.InsuranceSignUpState$Error
            android.app.Application r3 = r5.application
            r4 = 2131886546(0x7f1201d2, float:1.9407674E38)
            java.lang.String r6 = r3.getString(r4)
            r2.<init>(r6)
            r5.publish(r2)
            goto L1f
        L39:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.account.p025ui.viewModel.InsuranceSignupViewModel.isInputParamsValid(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: signUp$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40715signUp$lambda2(InsuranceSignupViewModel insuranceSignupViewModel, String str, List list, User user) {
        Log_OC.getArray(insuranceSignupViewModel, "this$0");
        Log_OC.getArray(list, "$employees");
        Log_OC.getArray(user, "it");
        InsuranceRequests $r4 = insuranceSignupViewModel.insuranceRequests;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        InsuranceSignUpRequest $r6 = new InsuranceSignUpRequest(str, list);
        AbstractC11688p $r7 = $r4.signUpForInsurance($r5, $r6);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: signUp$lambda-3  reason: not valid java name */
    public static final void m40716signUp$lambda3(InsuranceSignupViewModel insuranceSignupViewModel, InsuranceStatusModel insuranceStatusModel) {
        Log_OC.getArray(insuranceSignupViewModel, "this$0");
        String $r2 = insuranceStatusModel.getStatus();
        InsuranceStatus $r3 = InsuranceStatus.ACTIVE;
        String $r4 = $r3.toString();
        boolean $z0 = Log_OC.append($r2, $r4);
        if ($z0) {
            Analytics $r5 = insuranceSignupViewModel.analytics;
            String $r22 = insuranceStatusModel.getPhoneNumber();
            InsuranceAnalytics.Actions.DefaultImpls.onSuccessfulInsuranceSignUp$default($r5, $r22, "success", null, 4, null);
            InsuranceSignUpState.Success $r6 = InsuranceSignUpState.Success.INSTANCE;
            insuranceSignupViewModel.publish($r6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: signUp$lambda-4  reason: not valid java name */
    public static final void m40717signUp$lambda4(InsuranceSignupViewModel insuranceSignupViewModel, Throwable th) {
        Log_OC.getArray(insuranceSignupViewModel, "this$0");
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again in a bit.", null, 2, null);
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        InsuranceSignUpState.Error $r5 = new InsuranceSignUpState.Error($r4);
        insuranceSignupViewModel.publish($r5);
        th.printStackTrace();
        Analytics $r6 = insuranceSignupViewModel.analytics;
        String $r42 = insuranceSignupViewModel.getPhoneNo();
        String $r7 = th.getMessage();
        $r6.onSuccessfulInsuranceSignUp($r42, FirebaseAnalyticsImpl.STATUS_FAILURE, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNo() {
        String r1 = this.phoneNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getUser() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InsuranceSignupViewModel $r12 = InsuranceSignupViewModel.this;
                User $r3 = (User) obj;
                InsuranceSignupViewModel.m40713getUser$lambda0($r12, $r3);
            }
        };
        Resource $r4 = Resource.f1356id;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                phoneNo = it.phoneNumber\n                publish(InsuranceSignUpState.AgentPhoneNumber(it.phoneNumber))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        InsuranceSignUpState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public InsuranceSignUpState initialData() {
        InsuranceSignUpState.Initial r1 = InsuranceSignUpState.Initial.INSTANCE;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        C11280b $r1 = getCompositeDisposable();
        $r1.m11212i();
    }

    public final void setPhoneNo(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNo = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void signUp(final String str, final List list) {
        Log_OC.getArray(list, "employees");
        boolean $z0 = isInputParamsValid(str);
        if ($z0) {
            Analytics $r3 = this.analytics;
            String $r4 = this.phoneNo;
            $r3.onSubmitInsuranceButtonClicked($r4);
            boolean $z02 = list.isEmpty();
            if (!$z02) {
                Analytics $r32 = this.analytics;
                String $r42 = this.phoneNo;
                $r32.onAddEmployeeButtonClicked($r42);
            }
            String $r43 = this.phoneNo;
            boolean $z03 = Log_OC.append($r43, str);
            if (!$z03) {
                Analytics $r33 = this.analytics;
                String $r44 = this.phoneNo;
                $r33.onEditPhoneNumberClicked($r44);
            }
            InsuranceSignUpState.Loading $r5 = InsuranceSignUpState.Loading.INSTANCE;
            publish($r5);
            FetchCurrentUser $r6 = this.currentUser;
            AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
            AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.account.ui.viewModel.b
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    InsuranceSignupViewModel $r1 = InsuranceSignupViewModel.this;
                    String $r2 = str;
                    List $r34 = list;
                    User $r62 = (User) obj;
                    InterfaceC11692s $r45 = InsuranceSignupViewModel.m40715signUp$lambda2($r1, $r2, $r34, $r62);
                    return $r45;
                }
            });
            FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.NotFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    InsuranceSignupViewModel $r1 = InsuranceSignupViewModel.this;
                    InsuranceStatusModel $r34 = (InsuranceStatusModel) obj;
                    InsuranceSignupViewModel.m40716signUp$lambda3($r1, $r34);
                }
            }, new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.IOUtils$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    InsuranceSignupViewModel $r1 = InsuranceSignupViewModel.this;
                    Throwable $r34 = (Throwable) obj;
                    InsuranceSignupViewModel.m40717signUp$lambda4($r1, $r34);
                }
            });
            C11280b $r13 = getCompositeDisposable();
            $r13.b($r12);
        }
    }
}
