package ai.kudi.agent.outlet_mgt.navigator;

import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import kotlin.Metadata;
/* compiled from: OutletMgtNavigator.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;", "", "toCreatePinView", "", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "toEnterOtpView", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "toOutletRegistrationSuccessful", "firstName", "", "phoneNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OutletMgtNavigator {
    void toCreatePinView(CreateOutletRequest createOutletRequest);

    void toEnterOtpView(OtpFragmentData otpFragmentData, CreateOutletRequest createOutletRequest);

    void toOutletRegistrationSuccessful(String str, String str2);
}
