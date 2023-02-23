package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.settings.domain.useCases.UpgradeKycRequest;
import ai.kudi.agent.settings.domain.useCases.UpgradeKycResponse;
import ai.kudi.agent.settings.domain.useCases.UpgradeUserKyc;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.UpgradeViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import android.app.Application;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
import p425j.p444e.p471k0.C11680b;
/* compiled from: UpgradeViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0002H\u0016J8\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015J\b\u0010$\u001a\u00020\u001dH\u0007JF\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010JH\u0010(\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/UpgradeViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/UpgradeViewData;", "app", "Landroid/app/Application;", "upgradeUserKyc", "Lai/kudi/agent/settings/domain/useCases/UpgradeUserKyc;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "updateUser", "Lai/kudi/agent/users/domain/usecases/UpdateUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Landroid/app/Application;Lai/kudi/agent/settings/domain/useCases/UpgradeUserKyc;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/UpdateUser;Lai/kudi/agent/core/analytics/Analytics;)V", "toastMessages", "Lio/reactivex/subjects/PublishSubject;", "", "getToastMessages", "()Lio/reactivex/subjects/PublishSubject;", "initialData", "inputParamsValid", "", "residentialAddress", "nextOfKinPhoneNo", "nextOfKinName", "idType", "idNo", "billUrl", "publishIsIdCardNumberEmpty", "", "isNoEmpty", "publishIsPicUrlEmpty", "isUrlEmpty", "publishNextOfKinNameEmpty", "isNameEmpty", "publishNextOfKinPhonNumberEmpty", "publishVerificationNumberType", "submitInfo", "verificationNumber", "initialKycLevel", "upgradeUser", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.UpgradeViewModel */
/* loaded from: classes.dex */
public final class UpgradeViewModel extends BaseViewModel<UpgradeViewData> {
    private final Analytics analytics;
    private final Application application;
    private final FetchCurrentUser fetchCurrentUser;
    private final C11680b<String> toastMessages;
    private final UpdateUser updateUser;
    private final UpgradeUserKyc upgradeUserKyc;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UpgradeViewModel(Application application, UpgradeUserKyc upgradeUserKyc, FetchCurrentUser fetchCurrentUser, UpdateUser updateUser, Analytics analytics) {
        Log_OC.getArray(application, "app");
        Log_OC.getArray(upgradeUserKyc, "upgradeUserKyc");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(updateUser, "updateUser");
        Log_OC.getArray(analytics, "analytics");
        this.application = application;
        this.upgradeUserKyc = upgradeUserKyc;
        this.fetchCurrentUser = fetchCurrentUser;
        this.updateUser = updateUser;
        this.analytics = analytics;
        C11680b $r4 = C11680b.m10564v0();
        Log_OC.loadImage($r4, "create()");
        this.toastMessages = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str, String str2, String str3, String str4, String str5, String str6) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        boolean $z06;
        $z0 = C13276s.m5440u(str2);
        if ($z0) {
            ViewData $r7 = getState();
            UpgradeViewData $r8 = (UpgradeViewData) $r7;
            UpgradeViewData.Error $r9 = new UpgradeViewData.Error("Phone Number of Next of Kin is required", null, null, null, null, null, null, null, 254, null);
            publish(UpgradeViewData.copy$default($r8, false, null, $r9, null, false, false, false, false, 251, null));
            return false;
        }
        boolean $z07 = StringExtKt.isNigerianPhoneNumber(str2);
        if (!$z07) {
            ViewData $r72 = getState();
            UpgradeViewData $r82 = (UpgradeViewData) $r72;
            UpgradeViewData.Error $r92 = new UpgradeViewData.Error("Phone Number of Next of Kin is invalid", null, null, null, null, null, null, null, 254, null);
            publish(UpgradeViewData.copy$default($r82, false, null, $r92, null, false, false, false, false, 251, null));
            return false;
        }
        $z02 = C13276s.m5440u(str3);
        if ($z02) {
            ViewData $r73 = getState();
            UpgradeViewData $r83 = (UpgradeViewData) $r73;
            UpgradeViewData.Error $r93 = new UpgradeViewData.Error(null, null, null, "Name of Next of Kin is required", null, null, null, null, 247, null);
            publish(UpgradeViewData.copy$default($r83, false, null, $r93, null, false, false, false, false, 251, null));
            return false;
        }
        $z03 = C13276s.m5440u(str4);
        if ($z03) {
            ViewData $r74 = getState();
            UpgradeViewData $r84 = (UpgradeViewData) $r74;
            UpgradeViewData.Error $r94 = new UpgradeViewData.Error(null, null, null, null, "Id Card is required", null, null, null, 239, null);
            publish(UpgradeViewData.copy$default($r84, false, null, $r94, null, false, false, false, false, 251, null));
            return false;
        }
        $z04 = C13276s.m5440u(str5);
        if ($z04) {
            ViewData $r75 = getState();
            UpgradeViewData $r85 = (UpgradeViewData) $r75;
            UpgradeViewData.Error $r95 = new UpgradeViewData.Error(null, null, null, null, null, "Id Number is required", null, null, 223, null);
            publish(UpgradeViewData.copy$default($r85, false, null, $r95, null, false, false, false, false, 251, null));
            return false;
        }
        $z05 = C13276s.m5440u(str);
        if ($z05) {
            ViewData $r76 = getState();
            UpgradeViewData $r86 = (UpgradeViewData) $r76;
            UpgradeViewData.Error $r96 = new UpgradeViewData.Error(null, null, "Residential address is required", null, null, null, null, null, 251, null);
            publish(UpgradeViewData.copy$default($r86, false, null, $r96, null, false, false, false, false, 251, null));
            return false;
        }
        boolean $z08 = StringExtKt.isValidIdType(str5, str4);
        if (!$z08) {
            $z06 = C13276s.m5440u(str6);
            if ($z06) {
                ViewData $r77 = getState();
                UpgradeViewData $r87 = (UpgradeViewData) $r77;
                UpgradeViewData.Error $r97 = new UpgradeViewData.Error(null, null, null, null, null, null, "please upload your Utility bill", null, 191, null);
                publish(UpgradeViewData.copy$default($r87, false, null, $r97, null, false, false, false, false, 251, null));
                return false;
            }
            return true;
        }
        ViewData $r78 = getState();
        UpgradeViewData $r88 = (UpgradeViewData) $r78;
        String $r1 = "Please provide a valid " + str4 + " number";
        UpgradeViewData.Error $r98 = new UpgradeViewData.Error(null, null, null, null, null, $r1, null, null, 223, null);
        publish(UpgradeViewData.copy$default($r88, false, null, $r98, null, false, false, false, false, 251, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: publishVerificationNumberType$lambda-0  reason: not valid java name */
    public static final void m40863publishVerificationNumberType$lambda0(UpgradeViewModel upgradeViewModel, User user) {
        Log_OC.getArray(upgradeViewModel, "this$0");
        ViewData $r3 = upgradeViewModel.getState();
        UpgradeViewData $r4 = (UpgradeViewData) $r3;
        String $r1 = user.identityNumberType;
        upgradeViewModel.publish(UpgradeViewData.copy$default($r4, false, null, null, $r1, false, false, false, false, 247, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void upgradeUser(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        final C11812w $r9 = new C11812w();
        FetchCurrentUser $r11 = this.fetchCurrentUser;
        AbstractC11696w $r12 = FetchCurrentUser.execute$default($r11, null, null, 3, null);
        AbstractC11688p $r13 = $r12.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                String $r2 = str;
                String $r3 = str2;
                String $r4 = str3;
                String $r5 = str4;
                String $r6 = str5;
                String $r7 = str6;
                String $r8 = str7;
                UpgradeViewModel $r92 = this;
                User $r122 = (User) obj;
                InterfaceC11692s $r10 = UpgradeViewModel.m40865upgradeUser$lambda2($r1, $r2, $r3, $r4, $r5, $r6, $r7, $r8, $r92, $r122);
                return $r10;
            }
        });
        FavoritesArrayAdapter $r16 = $r13.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeViewModel $r2 = UpgradeViewModel.this;
                C11812w $r3 = $r9;
                String $r4 = str4;
                String $r5 = str3;
                String $r6 = str5;
                String $r7 = str6;
                String $r8 = str7;
                String $r92 = str8;
                UpgradeKycResponse $r10 = (UpgradeKycResponse) obj;
                UpgradeViewModel.m40866upgradeUser$lambda3($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r92, $r10);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeViewModel $r1 = UpgradeViewModel.this;
                String $r2 = str3;
                Throwable $r4 = (Throwable) obj;
                UpgradeViewModel.m40867upgradeUser$lambda4($r1, $r2, $r4);
            }
        });
        Log_OC.loadImage($r16, "fetchCurrentUser.execute().flatMapObservable {\n            user = it\n            val request = UpgradeKycRequest(\n                bvn = verificationNumber,\n                residentialAddress = residentialAddress,\n                imageId = it.profilePictureId,\n                idNumber = idNo, idType = idType, nextOfKinName = nextOfKinName,\n                nextOfKinPhoneNumber = nextOfKinPhoneNo,\n                userId = it.id, utilityBillImageUrl = billUrl\n            )\n            upgradeUserKyc.upgradeOneToTwo(upgradeKycRequest = request, sessionId = it.sessionId)\n        }.subscribe(\n            {\n                analytics.onUpgradeAccountButtonClick(\n                    user!!.phoneNumber, idType, idNo, nextOfKinName, nextOfKinPhoneNo,\n                    billUrl, initialKycLevel\n                )\n                publish(state.copy(isUpgrading = false, upgradeResponse = it))\n\n            },\n            {\n                // for response code 500, verification server is unavailable and\n                // the core server will automatically keep retrying the verification\n                // so we close the form and tell user we're retrying\n                var error: UpgradeViewData.Error? = null\n                if (it is HttpException && it.code() == 500) {\n                    UpgradeViewData.Error(upgradeError = app.getString(R.string.something_went_wrong_please_retry))\n                }\n                Timber.d(\"It is http exception: ${it is HttpException}\")\n\n                if (it is HttpException) {\n                    if (it.code() == 406) {\n                        error =\n                            UpgradeViewData.Error(upgradeError = \"This ID doesn't belong to you\")\n                    } else if (it.code() == 404) {\n                        error = UpgradeViewData.Error(upgradeError = \"ID Number $idNo is invalid\")\n                    }\n                }\n\n                if (error == null) {\n                    val message =\n                        parseHttpError2(app.getString(R.string.something_went_wrong_please_retry))(\n                            it\n                        )\n                    error = UpgradeViewData.Error(upgradeError = message)\n                }\n                publish(state.copy(isUpgrading = false, error = error))\n            }\n        )");
        C11280b $r17 = getCompositeDisposable();
        RxExtKt.addTo($r16, $r17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: upgradeUser$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40865upgradeUser$lambda2(C11812w c11812w, String str, String str2, String str3, String str4, String str5, String str6, String str7, UpgradeViewModel upgradeViewModel, User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(str, "$verificationNumber");
        Log_OC.getArray(str2, "$residentialAddress");
        Log_OC.getArray(str3, "$idNo");
        Log_OC.getArray(str4, "$idType");
        Log_OC.getArray(str5, "$nextOfKinName");
        Log_OC.getArray(str6, "$nextOfKinPhoneNo");
        Log_OC.getArray(str7, "$billUrl");
        Log_OC.getArray(upgradeViewModel, "this$0");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        String $r10 = user.profilePictureId;
        String $r11 = user.getId();
        Log_OC.loadImage($r11, "id");
        UpgradeKycRequest $r12 = new UpgradeKycRequest($r10, str, str2, str3, str4, str5, str6, $r11, str7);
        UpgradeUserKyc $r13 = upgradeViewModel.upgradeUserKyc;
        String $r1 = user.getSessionId();
        Log_OC.loadImage($r1, "it.sessionId");
        AbstractC11688p $r14 = $r13.upgradeOneToTwo($r12, $r1);
        return $r14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: upgradeUser$lambda-3  reason: not valid java name */
    public static final void m40866upgradeUser$lambda3(UpgradeViewModel upgradeViewModel, C11812w c11812w, String str, String str2, String str3, String str4, String str5, String str6, UpgradeKycResponse upgradeKycResponse) {
        Log_OC.getArray(upgradeViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(str, "$idType");
        Log_OC.getArray(str2, "$idNo");
        Log_OC.getArray(str3, "$nextOfKinName");
        Log_OC.getArray(str4, "$nextOfKinPhoneNo");
        Log_OC.getArray(str5, "$billUrl");
        Log_OC.getArray(str6, "$initialKycLevel");
        Analytics $r9 = upgradeViewModel.analytics;
        Object $r10 = c11812w.f26499c;
        Log_OC.append($r10);
        User $r11 = (User) $r10;
        String $r12 = $r11.getPhoneNumber();
        Log_OC.loadImage($r12, "user!!.phoneNumber");
        $r9.onUpgradeAccountButtonClick($r12, str, str2, str3, str4, str5, str6);
        ViewData $r13 = upgradeViewModel.getState();
        UpgradeViewData $r14 = (UpgradeViewData) $r13;
        upgradeViewModel.publish(UpgradeViewData.copy$default($r14, false, upgradeKycResponse, null, null, false, false, false, false, 252, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011b  */
    /* renamed from: upgradeUser$lambda-4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40867upgradeUser$lambda4(ai.kudi.agent.settings.personal.p027ui.viewModels.UpgradeViewModel r43, java.lang.String r44, java.lang.Throwable r45) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.UpgradeViewModel.m40867upgradeUser$lambda4(ai.kudi.agent.settings.personal.ui.viewModels.UpgradeViewModel, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getToastMessages() {
        C11680b r1 = this.toastMessages;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        UpgradeViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public UpgradeViewData initialData() {
        UpgradeViewData $r1 = new UpgradeViewData(false, null, null, null, false, false, false, false, 248, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void publishIsIdCardNumberEmpty(boolean z) {
        ViewData $r1 = getState();
        UpgradeViewData $r2 = (UpgradeViewData) $r1;
        publish(UpgradeViewData.copy$default($r2, false, null, null, null, false, z, false, false, 223, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void publishIsPicUrlEmpty(boolean z) {
        ViewData $r1 = getState();
        UpgradeViewData $r2 = (UpgradeViewData) $r1;
        publish(UpgradeViewData.copy$default($r2, false, null, null, null, false, false, false, z, 127, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void publishNextOfKinNameEmpty(boolean z) {
        ViewData $r1 = getState();
        UpgradeViewData $r2 = (UpgradeViewData) $r1;
        publish(UpgradeViewData.copy$default($r2, false, null, null, null, false, false, z, false, 191, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void publishNextOfKinPhonNumberEmpty(boolean z) {
        ViewData $r1 = getState();
        UpgradeViewData $r2 = (UpgradeViewData) $r1;
        publish(UpgradeViewData.copy$default($r2, false, null, null, null, z, false, false, false, 239, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void publishVerificationNumberType() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Item $r3 = ClassWriter.LogError();
        AbstractC11696w $r22 = $r2.u($r3);
        Item $r32 = ContextUtils.LogError();
        AbstractC11696w $r23 = $r22.n($r32);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeViewModel $r12 = UpgradeViewModel.this;
                User $r33 = (User) obj;
                UpgradeViewModel.m40863publishVerificationNumberType$lambda0($r12, $r33);
            }
        };
        Token $r5 = Token.FUNCTION;
        $r23.s(object, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Log_OC.getArray(str, "verificationNumber");
        Log_OC.getArray(str2, "residentialAddress");
        Log_OC.getArray(str3, "nextOfKinPhoneNo");
        Log_OC.getArray(str4, "nextOfKinName");
        Log_OC.getArray(str5, "idType");
        Log_OC.getArray(str6, "idNo");
        Log_OC.getArray(str7, "billUrl");
        Log_OC.getArray(str8, "initialKycLevel");
        boolean $z0 = inputParamsValid(str2, str3, str4, str5, str6, str7);
        if ($z0) {
            ViewData $r9 = getState();
            UpgradeViewData $r10 = (UpgradeViewData) $r9;
            publish(UpgradeViewData.copy$default($r10, true, null, null, null, false, false, false, false, 250, null));
            upgradeUser(str, str2, str6, str5, str4, str3, str7, str8);
        }
    }
}
