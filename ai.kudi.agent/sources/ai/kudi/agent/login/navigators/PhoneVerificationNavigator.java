package ai.kudi.agent.login.navigators;

import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import kotlin.Metadata;
/* compiled from: PhoneVerificationNavigator.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/login/navigators/PhoneVerificationNavigator;", "", "toEnterOtpView", "", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "toPerformLoginView", "phoneNumber", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PhoneVerificationNavigator {
    void toEnterOtpView(OtpFragmentData otpFragmentData, OtpVerificationModel otpVerificationModel);

    void toPerformLoginView(String str);
}
