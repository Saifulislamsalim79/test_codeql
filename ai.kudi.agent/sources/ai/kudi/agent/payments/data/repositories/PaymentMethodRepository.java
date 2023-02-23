package ai.kudi.agent.payments.data.repositories;

import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: PaymentMethodRepository.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/payments/data/repositories/PaymentMethodRepository;", "", "fetchAll", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PaymentMethodRepository {
    AbstractC11688p fetchAll(User user);
}
