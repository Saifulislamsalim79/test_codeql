package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: SettingsDetailsViewModel.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/settings/ui/viewModels/SettingsDetailsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/ContainerViewData;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "baseOtpUtil", "Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "(Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;)V", "initialData", "sendOtpEmailVerification", "", "phoneNumber", "", "verifyOtpSecondaryVerification", "email", AttributeType.PHONE, "otp", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.viewModels.SettingsDetailsViewModel */
/* loaded from: classes.dex */
public final class SettingsDetailsViewModel extends BaseViewModel<ContainerViewData> {
    private final Analytics analytics;
    private final BaseOtpUtil baseOtpUtil;

    public SettingsDetailsViewModel(Analytics analytics, BaseOtpUtil baseOtpUtil) {
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(baseOtpUtil, "baseOtpUtil");
        this.analytics = analytics;
        this.baseOtpUtil = baseOtpUtil;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ ContainerViewData access$getState(SettingsDetailsViewModel settingsDetailsViewModel) {
        ViewData $r0 = settingsDetailsViewModel.getState();
        ContainerViewData $r2 = (ContainerViewData) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ContainerViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ContainerViewData initialData() {
        ContainerViewData $r1 = new ContainerViewData(false, null, false, null, null, null, false, false, 255, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendOtpEmailVerification(String str) {
        Log_OC.getArray(str, "phoneNumber");
        ViewData $r2 = getState();
        ContainerViewData $r3 = (ContainerViewData) $r2;
        publish(ContainerViewData.copy$default($r3, false, null, true, null, null, null, false, false, 251, null));
        BaseOtpUtil $r4 = this.baseOtpUtil;
        SettingsDetailsViewModel$sendOtpEmailVerification$1 $r5 = new SettingsDetailsViewModel$sendOtpEmailVerification$1(this, str);
        SettingsDetailsViewModel$sendOtpEmailVerification$2 $r6 = new SettingsDetailsViewModel$sendOtpEmailVerification$2(this);
        FavoritesArrayAdapter $r7 = $r4.sendOtpForSecondaryDetailsVerification(str, $r5, $r6);
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtpSecondaryVerification(String str, String str2, String str3) {
        boolean $z0;
        Log_OC.getArray(str, "email");
        Log_OC.getArray(str2, AttributeType.PHONE);
        Log_OC.getArray(str3, "otp");
        $z0 = C13276s.m5440u(str3);
        if ($z0) {
            ViewData $r4 = getState();
            ContainerViewData $r5 = (ContainerViewData) $r4;
            publish(ContainerViewData.copy$default($r5, false, null, false, null, null, "Enter the OTP you received", false, false, 223, null));
            return;
        }
        ViewData $r42 = getState();
        ContainerViewData $r52 = (ContainerViewData) $r42;
        publish(ContainerViewData.copy$default($r52, true, null, false, null, null, null, false, false, 156, null));
        BaseOtpUtil $r6 = this.baseOtpUtil;
        SettingsDetailsViewModel$verifyOtpSecondaryVerification$1 $r7 = new SettingsDetailsViewModel$verifyOtpSecondaryVerification$1(this);
        SettingsDetailsViewModel$verifyOtpSecondaryVerification$2 $r8 = new SettingsDetailsViewModel$verifyOtpSecondaryVerification$2(this);
        FavoritesArrayAdapter $r9 = $r6.verifySecondaryDetails(str, str2, str3, $r7, $r8);
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }
}
