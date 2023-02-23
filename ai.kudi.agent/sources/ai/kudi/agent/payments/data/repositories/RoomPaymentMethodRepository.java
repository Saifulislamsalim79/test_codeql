package ai.kudi.agent.payments.data.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao;
import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.payments.domain.wiki.SessionPaymentMethod;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RoomPaymentMethodRepository.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/payments/data/repositories/RoomPaymentMethodRepository;", "Lai/kudi/agent/payments/data/repositories/PaymentMethodRepository;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "appRoomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "fetchAll", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RoomPaymentMethodRepository implements PaymentMethodRepository {
    private final CoreAppDatabase appRoomDatabase;
    private final NetworkService networkService;

    public RoomPaymentMethodRepository(NetworkService networkService, CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        this.networkService = networkService;
        this.appRoomDatabase = coreAppDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0046 */
    /* renamed from: fetchAll$lambda-2  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m40004fetchAll$lambda2(ai.kudi.agent.payments.data.repositories.RoomPaymentMethodRepository r32, ai.kudi.agent.payments.domain.wiki.SessionPaymentMethod r33) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.payments.data.repositories.RoomPaymentMethodRepository.m40004fetchAll$lambda2(ai.kudi.agent.payments.data.repositories.RoomPaymentMethodRepository, ai.kudi.agent.payments.domain.wiki.SessionPaymentMethod):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.payments.data.repositories.PaymentMethodRepository
    public AbstractC11688p fetchAll(User user) {
        Log_OC.getArray(user, "user");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        PaymentMethodDao $r3 = $r2.getPaymentMethodDao();
        Object $r4 = $r3.getAllPaymentMethods();
        NetworkService $r5 = this.networkService;
        AddNoteCommand $r6 = $r5.getApi();
        String $r7 = user.getSessionId();
        Log_OC.loadImage($r7, "user.sessionId");
        AbstractC11688p $r8 = $r6.getPaymentMethods($r7);
        Object[] $r10 = {$r4, $r8.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.payments.data.repositories.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RoomPaymentMethodRepository $r1 = RoomPaymentMethodRepository.this;
                SessionPaymentMethod $r42 = (SessionPaymentMethod) obj;
                List $r22 = RoomPaymentMethodRepository.m40004fetchAll$lambda2($r1, $r42);
                return $r22;
            }
        })};
        InterfaceC11692s[] r12 = (InterfaceC11692s[]) $r10;
        AbstractC11688p $r42 = AbstractC11688p.m10500n(r12);
        Log_OC.loadImage($r42, "concatArrayEager(localSource, remoteSource)");
        return $r42;
    }
}
