package ai.kudi.agent.register.data.models;

import kotlin.Metadata;
/* compiled from: OtpFragmentData.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/register/data/models/OtpCallBacks;", "", "onBottomViewActionClicked", "", "onOtpEntered", "otpData", "Lai/kudi/agent/register/data/models/OtpData;", "onResendOtpClicked", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OtpCallBacks {
    void onBottomViewActionClicked();

    void onOtpEntered(OtpData otpData);

    void onResendOtpClicked(OtpData otpData);
}
