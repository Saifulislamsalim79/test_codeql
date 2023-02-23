package ai.kudi.agent.register.navigators;

import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import kotlin.Metadata;
/* compiled from: EmailVerificationNavigator.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/register/navigators/EmailVerificationNavigator;", "", "toEnterOtpView", "", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "emailAddress", "", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface EmailVerificationNavigator {
    void toEnterOtpView(OtpFragmentData otpFragmentData, String str, CompleteRegistrationData completeRegistrationData);
}
