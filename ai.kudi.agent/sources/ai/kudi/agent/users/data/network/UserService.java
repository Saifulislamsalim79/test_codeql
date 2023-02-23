package ai.kudi.agent.users.data.network;

import ai.kudi.agent.login.domain.wiki.LoginRequest;
import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.SavingPinValidationRequest;
import ai.kudi.agent.users.domain.package_1.UpdateSourceInfoRequest;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: UserService.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0006H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H'J \u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f0\u0003H'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0019H'J(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u001cH'¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/users/data/network/UserService;", "", "checkEmail", "Lio/reactivex/Observable;", "Lai/kudi/agent/users/domain/dto/User;", "email", "", "checkPhone", AttributeType.PHONE, "checkUsername", CacheDataSource.PREF_USERNAME, "getLocation", "Lretrofit2/Response;", "Lai/kudi/agent/core/network/response/APIResponse;", "", "Lai/kudi/agent/register/data/models/LocationModel;", "getUserProfile", "Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "sessionId", "secureLogin", "Lai/kudi/agent/login/domain/dto/LoginResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/login/domain/dto/LoginRequest;", "updateSourceInfo", "Lai/kudi/agent/users/domain/dto/UpdateSourceInfoResponse;", "Lai/kudi/agent/users/domain/dto/UpdateSourceInfoRequest;", "validatePin", "Lai/kudi/agent/users/domain/dto/SavingPinValidationResponse;", "Lai/kudi/agent/users/domain/dto/SavingPinValidationRequest;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface UserService {
    AbstractC11688p checkEmail(String str);

    AbstractC11688p checkPhone(String str);

    AbstractC11688p checkUsername(String str);

    AbstractC11688p getLocation();

    AbstractC11688p getUserProfile(String str);

    AbstractC11688p secureLogin(LoginRequest loginRequest);

    AbstractC11688p updateSourceInfo(String str, UpdateSourceInfoRequest updateSourceInfoRequest);

    AbstractC11688p validatePin(String str, SavingPinValidationRequest savingPinValidationRequest);
}
