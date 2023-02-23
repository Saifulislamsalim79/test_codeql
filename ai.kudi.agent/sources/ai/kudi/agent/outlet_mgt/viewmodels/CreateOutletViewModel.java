package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.outlet_mgt.domain.repositories.ChildOutletInformationRepository;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.outlet_mgt.viewdata.CreateOutletError;
import ai.kudi.agent.outlet_mgt.viewdata.CreateOutletViewData;
import ai.kudi.agent.outlet_mgt.viewdata.StateAndLgaData;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.data.models.OtpFragmentRes;
import ai.kudi.agent.register.domain.usecases.ResendOtp;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: CreateOutletViewModel.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0019J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0019J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0012J\u0014\u0010%\u001a\u00020\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010'\u001a\u00020\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/CreateOutletViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewdata/CreateOutletViewData;", "repository", "Lai/kudi/agent/outlet_mgt/domain/repositories/ChildOutletInformationRepository;", "outletMgtNavigator", "Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "resendOtp", "Lai/kudi/agent/register/domain/usecases/ResendOtp;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/outlet_mgt/domain/repositories/ChildOutletInformationRepository;Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/register/domain/usecases/ResendOtp;Lai/kudi/agent/core/analytics/Analytics;)V", "isStateSelection", "", "Ljava/lang/Boolean;", "selectedLga", "", "selectedState", "initialData", "isInputParamsValid", "createOutletData", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "logCreateOutletClicked", "", "user", "Lai/kudi/agent/users/domain/dto/User;", TransactionField.STATUS, "onItemSelected", AttributeType.TEXT, "onLgaFieldClicked", "onLgaSelected", "lga", "onStateFieldClicked", "onStateSelected", SendReceiptToTerminalConfirmationBottomSheet.STATE, "openLgaSelector", "altToastMsg", "openStateSelector", "otpFragmentRes", "Lai/kudi/agent/register/data/models/OtpFragmentRes;", "submitData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateOutletViewModel extends BaseViewModel<CreateOutletViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private Boolean isStateSelection;
    private final OutletMgtNavigator outletMgtNavigator;
    private final ChildOutletInformationRepository repository;
    private final ResendOtp resendOtp;
    private String selectedLga;
    private String selectedState;

    public CreateOutletViewModel(ChildOutletInformationRepository childOutletInformationRepository, OutletMgtNavigator outletMgtNavigator, FetchCurrentUser fetchCurrentUser, ResendOtp resendOtp, Analytics analytics) {
        Log_OC.getArray(childOutletInformationRepository, "repository");
        Log_OC.getArray(outletMgtNavigator, "outletMgtNavigator");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(resendOtp, "resendOtp");
        Log_OC.getArray(analytics, "analytics");
        this.repository = childOutletInformationRepository;
        this.outletMgtNavigator = outletMgtNavigator;
        this.fetchCurrentUser = fetchCurrentUser;
        this.resendOtp = resendOtp;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isInputParamsValid(ai.kudi.agent.outlet_mgt.data.CreateOutletRequest r33) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel.isInputParamsValid(ai.kudi.agent.outlet_mgt.data.CreateOutletRequest):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logCreateOutletClicked(User user, CreateOutletRequest createOutletRequest, boolean z) {
        if (user == null) {
            return;
        }
        String $r4 = createOutletRequest.getPhoneNumber();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        String $r42 = user.getPhoneNumber();
        Analytics $r1 = this.analytics;
        Log_OC.loadImage($r42, "phoneNumber");
        $r1.onCreateOutletClicked($r42, $r5, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openLgaSelector(final String str) {
        Boolean $r2 = Boolean.FALSE;
        this.isStateSelection = $r2;
        ChildOutletInformationRepository $r3 = this.repository;
        String $r4 = this.selectedState;
        Log_OC.append($r4);
        AbstractC11688p $r5 = $r3.getLgaFor($r4);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.m10609c();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        FavoritesArrayAdapter $r9 = $r52.R($r62).e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.StandardShowcaseDrawer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateOutletViewModel $r1 = CreateOutletViewModel.this;
                String $r22 = str;
                List $r42 = (List) obj;
                CreateOutletViewModel.m39919openLgaSelector$lambda6($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateOutletViewModel $r1 = CreateOutletViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CreateOutletViewModel.m39920openLgaSelector$lambda7($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "repository.getLgaFor(selectedState!!).subscribeOn(Schedulers.computation())\n            .observeOn(AndroidSchedulers.mainThread()).subscribe(\n                {\n                    publish(\n                        state.copy(\n                            stateAndLgaData =\n                                StateAndLgaData(\n                                    errorViewId = -1,\n                                    errorText = null,\n                                    openSelector = true,\n                                    selectorList = it,\n                                    stateText = selectedState,\n                                    lgaText = selectedLga,\n                                    toastText = if (it.isEmpty()) \"Location data is empty\" else altToastMsg\n                                )\n                        )\n                    )\n                },\n                {\n                    it.printStackTrace()\n                    publish(\n                        state.copy(\n                            stateAndLgaData =\n                                StateAndLgaData(\n                                    errorViewId = -1,\n                                    errorText = null,\n                                    openSelector = false,\n                                    selectorList = emptyList(),\n                                    stateText = selectedState,\n                                    lgaText = selectedLga,\n                                    toastText = \"Location data is empty\"\n                                )\n                        )\n                    )\n                }\n            )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void openLgaSelector$default(CreateOutletViewModel createOutletViewModel, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        createOutletViewModel.openLgaSelector($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openLgaSelector$lambda-6  reason: not valid java name */
    public static final void m39919openLgaSelector$lambda6(CreateOutletViewModel createOutletViewModel, String $r3, List list) {
        Log_OC.getArray(createOutletViewModel, "this$0");
        ViewData $r4 = createOutletViewModel.getState();
        CreateOutletViewData $r5 = (CreateOutletViewData) $r4;
        Log_OC.loadImage(list, "it");
        String $r7 = createOutletViewModel.selectedState;
        String $r2 = createOutletViewModel.selectedLga;
        boolean $z0 = list.isEmpty();
        if ($z0) {
            $r3 = "Location data is empty";
        }
        StateAndLgaData $r6 = new StateAndLgaData(-1, null, true, list, $r7, $r2, $r3);
        createOutletViewModel.publish(CreateOutletViewData.copy$default($r5, false, null, $r6, null, 11, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openLgaSelector$lambda-7  reason: not valid java name */
    public static final void m39920openLgaSelector$lambda7(CreateOutletViewModel createOutletViewModel, Throwable th) {
        List $r6;
        Log_OC.getArray(createOutletViewModel, "this$0");
        th.printStackTrace();
        ViewData $r3 = createOutletViewModel.getState();
        CreateOutletViewData $r4 = (CreateOutletViewData) $r3;
        $r6 = C13726r.m3891e();
        String $r7 = createOutletViewModel.selectedState;
        String $r1 = createOutletViewModel.selectedLga;
        StateAndLgaData $r5 = new StateAndLgaData(-1, null, false, $r6, $r7, $r1, "Location data is empty");
        createOutletViewModel.publish(CreateOutletViewData.copy$default($r4, false, null, $r5, null, 11, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openStateSelector(final String str) {
        Boolean $r2 = Boolean.TRUE;
        this.isStateSelection = $r2;
        ChildOutletInformationRepository $r3 = this.repository;
        AbstractC11688p $r4 = $r3.getStateList();
        p425j.p444e.Item $r5 = p425j.p444e.p470j0.ClassWriter.m10609c();
        AbstractC11688p $r42 = $r4.h0($r5);
        p425j.p444e.Item $r52 = ContextUtils.LogError();
        FavoritesArrayAdapter $r8 = $r42.R($r52).e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateOutletViewModel $r1 = CreateOutletViewModel.this;
                String $r22 = str;
                List $r43 = (List) obj;
                CreateOutletViewModel.m39921openStateSelector$lambda4($r1, $r22, $r43);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateOutletViewModel $r1 = CreateOutletViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CreateOutletViewModel.m39922openStateSelector$lambda5($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "repository.getStateList().subscribeOn(Schedulers.computation())\n            .observeOn(AndroidSchedulers.mainThread()).subscribe(\n                {\n                    publish(\n                        state.copy(\n                            stateAndLgaData =\n                                StateAndLgaData(\n                                    errorViewId = -1,\n                                    errorText = null,\n                                    openSelector = true,\n                                    selectorList = it,\n                                    stateText = selectedState,\n                                    lgaText = selectedLga,\n                                    toastText = if (it.isEmpty()) \"Location data is empty\" else altToastMsg\n                                )\n                        )\n                    )\n                },\n                {\n                    it.printStackTrace()\n                    publish(\n                        state.copy(\n                            stateAndLgaData =\n                                StateAndLgaData(\n                                    errorViewId = -1,\n                                    errorText = null,\n                                    openSelector = false,\n                                    selectorList = emptyList(),\n                                    stateText = selectedState,\n                                    lgaText = selectedLga,\n                                    toastText = \"Location data is empty\"\n                                )\n                        )\n                    )\n                }\n            )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void openStateSelector$default(CreateOutletViewModel createOutletViewModel, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        createOutletViewModel.openStateSelector($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openStateSelector$lambda-4  reason: not valid java name */
    public static final void m39921openStateSelector$lambda4(CreateOutletViewModel createOutletViewModel, String $r3, List list) {
        Log_OC.getArray(createOutletViewModel, "this$0");
        ViewData $r4 = createOutletViewModel.getState();
        CreateOutletViewData $r5 = (CreateOutletViewData) $r4;
        Log_OC.loadImage(list, "it");
        String $r7 = createOutletViewModel.selectedState;
        String $r2 = createOutletViewModel.selectedLga;
        boolean $z0 = list.isEmpty();
        if ($z0) {
            $r3 = "Location data is empty";
        }
        StateAndLgaData $r6 = new StateAndLgaData(-1, null, true, list, $r7, $r2, $r3);
        createOutletViewModel.publish(CreateOutletViewData.copy$default($r5, false, null, $r6, null, 11, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: openStateSelector$lambda-5  reason: not valid java name */
    public static final void m39922openStateSelector$lambda5(CreateOutletViewModel createOutletViewModel, Throwable th) {
        List $r6;
        Log_OC.getArray(createOutletViewModel, "this$0");
        th.printStackTrace();
        ViewData $r3 = createOutletViewModel.getState();
        CreateOutletViewData $r4 = (CreateOutletViewData) $r3;
        $r6 = C13726r.m3891e();
        String $r7 = createOutletViewModel.selectedState;
        String $r1 = createOutletViewModel.selectedLga;
        StateAndLgaData $r5 = new StateAndLgaData(-1, null, false, $r6, $r7, $r1, "Location data is empty");
        createOutletViewModel.publish(CreateOutletViewData.copy$default($r4, false, null, $r5, null, 11, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final OtpFragmentRes otpFragmentRes() {
        OtpFragmentRes $r1 = new OtpFragmentRes(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: submitData$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39923submitData$lambda0(C11812w c11812w, CreateOutletViewModel createOutletViewModel, CreateOutletRequest createOutletRequest, User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(createOutletViewModel, "this$0");
        Log_OC.getArray(createOutletRequest, "$createOutletData");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        ResendOtp $r4 = createOutletViewModel.resendOtp;
        String $r6 = createOutletRequest.getPhoneNumber();
        String $r7 = $r6;
        if ($r6 == null) {
            $r7 = "";
        }
        OtpVerificationModel $r5 = new OtpVerificationModel($r7, null, null, 0L, 0L, false, null, null, null, null, null, false, null, 8190, null);
        String $r62 = user.getSessionId();
        Log_OC.loadImage($r62, "it.sessionId");
        AbstractC11688p $r8 = $r4.executeSecondaryVerificationOtp($r5, $r62);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitData$lambda-1  reason: not valid java name */
    public static final void m39924submitData$lambda1(CreateOutletViewModel createOutletViewModel, C11812w c11812w, CreateOutletRequest createOutletRequest, OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(createOutletViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(createOutletRequest, "$createOutletData");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        createOutletViewModel.logCreateOutletClicked($r5, createOutletRequest, true);
        ViewData $r6 = createOutletViewModel.getState();
        CreateOutletViewData $r7 = CreateOutletViewData.copy$default((CreateOutletViewData) $r6, false, null, null, null, 14, null);
        createOutletViewModel.publish($r7);
        OutletMgtNavigator $r8 = createOutletViewModel.outletMgtNavigator;
        OtpFragmentRes $r9 = createOutletViewModel.otpFragmentRes();
        String $r11 = createOutletRequest.getPhoneNumber();
        String $r12 = $r11;
        if ($r11 == null) {
            $r12 = "";
        }
        long $l0 = otpVerificationModel.getExpiresInSeconds();
        OtpData $r10 = new OtpData($r12, $l0, otpVerificationModel.getRegistrationId(), null, 8, null);
        OtpFragmentData $r13 = new OtpFragmentData(null, false, $r10, null, null, false, false, $r9, false, 283, null);
        $r8.toEnterOtpView($r13, createOutletRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitData$lambda-2  reason: not valid java name */
    public static final void m39925submitData$lambda2(CreateOutletViewModel createOutletViewModel, C11812w c11812w, CreateOutletRequest createOutletRequest, Throwable th) {
        Log_OC.getArray(createOutletViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(createOutletRequest, "$createOutletData");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        createOutletViewModel.logCreateOutletClicked($r5, createOutletRequest, false);
        ViewData $r6 = createOutletViewModel.getState();
        InterfaceC11767l $r9 = KudiErrorParserKt.parseHttpError2$default("Error sending otp", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r42 = $r9.invoke(th);
        String $r10 = (String) $r42;
        CreateOutletError $r8 = new CreateOutletError(null, null, null, null, null, null, $r10, 63, null);
        CreateOutletViewData $r7 = CreateOutletViewData.copy$default((CreateOutletViewData) $r6, false, $r8, null, null, 12, null);
        createOutletViewModel.publish($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CreateOutletViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CreateOutletViewData initialData() {
        CreateOutletViewData $r1 = new CreateOutletViewData(false, null, null, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel.onItemSelected(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLgaFieldClicked() {
        /*
            r6 = this;
            java.lang.String r0 = r6.selectedState
            if (r0 == 0) goto Ld
            int r1 = r0.length()
            if (r1 != 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            if (r2 == 0) goto L17
            r3 = 0
            r4 = 1
            r5 = 0
            openStateSelector$default(r6, r3, r4, r5)
            return
        L17:
            r3 = 0
            r4 = 1
            r5 = 0
            openLgaSelector$default(r6, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel.onLgaFieldClicked():void");
    }

    public final void onLgaSelected(String str) {
        Log_OC.getArray(str, "lga");
        this.selectedLga = str;
    }

    public final void onStateFieldClicked() {
        openStateSelector$default(this, null, 1, null);
    }

    public final void onStateSelected(String str) {
        Log_OC.getArray(str, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        this.selectedState = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitData(final CreateOutletRequest createOutletRequest) {
        Log_OC.getArray(createOutletRequest, "createOutletData");
        final C11812w $r2 = new C11812w();
        ViewData $r3 = getState();
        CreateOutletViewData $r4 = (CreateOutletViewData) $r3;
        publish(CreateOutletViewData.copy$default($r4, true, null, null, null, 12, null));
        boolean $z0 = isInputParamsValid(createOutletRequest);
        if ($z0) {
            FetchCurrentUser $r5 = this.fetchCurrentUser;
            AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
            AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    C11812w $r1 = C11812w.this;
                    CreateOutletViewModel $r22 = this;
                    CreateOutletRequest $r32 = createOutletRequest;
                    User $r62 = (User) obj;
                    InterfaceC11692s $r42 = CreateOutletViewModel.m39923submitData$lambda0($r1, $r22, $r32, $r62);
                    return $r42;
                }
            });
            FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Widget
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreateOutletViewModel $r1 = CreateOutletViewModel.this;
                    C11812w $r22 = $r2;
                    CreateOutletRequest $r32 = createOutletRequest;
                    OtpVerificationModel $r52 = (OtpVerificationModel) obj;
                    CreateOutletViewModel.m39924submitData$lambda1($r1, $r22, $r32, $r52);
                }
            }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreateOutletViewModel $r1 = CreateOutletViewModel.this;
                    C11812w $r22 = $r2;
                    CreateOutletRequest $r32 = createOutletRequest;
                    Throwable $r52 = (Throwable) obj;
                    CreateOutletViewModel.m39925submitData$lambda2($r1, $r22, $r32, $r52);
                }
            });
            Log_OC.loadImage($r11, "fetchCurrentUser.execute().flatMapObservable {\n            user = it\n            resendOtp.executeSecondaryVerificationOtp(\n                OtpVerificationModel(\n                    phoneNumber = createOutletData.phoneNumber\n                        ?: \"\"\n                ),\n                sessionId = it.sessionId\n            )\n        }.subscribe(\n            {\n                logCreateOutletClicked(user, createOutletData, true)\n                publish(state.copy(isLoading = false))\n                outletMgtNavigator.toEnterOtpView(\n                    OtpFragmentData(\n                        showBottomView = false,\n                        otpFragmentRes = otpFragmentRes(),\n                        shouldShowHeader = false,\n                        otpData = OtpData(\n                            phoneNumber = createOutletData.phoneNumber ?: \"\",\n                            expiryInSeconds = it.expiresInSeconds,\n                            otpRequestId = it.registrationId\n                        )\n                    ),\n                    createOutletData\n                )\n            },\n            {\n                logCreateOutletClicked(user, createOutletData, false)\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        createOutletError = CreateOutletError(\n                            message = parseHttpError2(\"Error sending otp\")(\n                                it\n                            )\n                        )\n                    )\n                )\n            }\n        )");
            C11280b $r12 = getCompositeDisposable();
            RxExtKt.addTo($r11, $r12);
        }
    }
}
