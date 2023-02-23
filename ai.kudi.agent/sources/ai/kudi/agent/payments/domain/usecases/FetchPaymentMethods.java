package ai.kudi.agent.payments.domain.usecases;

import ai.kudi.agent.core.usecases.NoInputUseCase;
import ai.kudi.agent.payments.data.repositories.PaymentMethodRepository;
import ai.kudi.agent.payments.domain.dto.PaymentMethod;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: FetchPaymentMethods.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/payments/domain/usecases/FetchPaymentMethods;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "paymentMethodRepo", "Lai/kudi/agent/payments/data/repositories/PaymentMethodRepository;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/payments/data/repositories/PaymentMethodRepository;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "getPaymentMethodRepo", "()Lai/kudi/agent/payments/data/repositories/PaymentMethodRepository;", "getUserRepo", "()Lai/kudi/agent/users/data/repositories/UserRepository;", "execute", "Lio/reactivex/Observable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPaymentMethods implements NoInputUseCase<List<? extends PaymentMethod>> {
    private final PaymentMethodRepository paymentMethodRepo;
    private final UserRepository userRepo;

    public FetchPaymentMethods(PaymentMethodRepository paymentMethodRepository, UserRepository userRepository) {
        Log_OC.getArray(paymentMethodRepository, "paymentMethodRepo");
        Log_OC.getArray(userRepository, "userRepo");
        this.paymentMethodRepo = paymentMethodRepository;
        this.userRepo = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40006execute$lambda0(FetchPaymentMethods fetchPaymentMethods, User user) {
        Log_OC.getArray(fetchPaymentMethods, "this$0");
        Log_OC.getArray(user, "it");
        PaymentMethodRepository $r2 = fetchPaymentMethods.getPaymentMethodRepo();
        AbstractC11688p $r3 = $r2.fetchAll(user);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        UserRepository $r1 = this.userRepo;
        AbstractC11696w $r2 = $r1.getCurrentUser();
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.payments.domain.usecases.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                FetchPaymentMethods $r12 = FetchPaymentMethods.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = FetchPaymentMethods.m40006execute$lambda0($r12, $r42);
                return $r22;
            }
        });
        Item $r5 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r42 = $r4.h0($r5);
        Item $r52 = ContextUtils.LogError();
        AbstractC11688p $r43 = $r42.R($r52);
        Log_OC.loadImage($r43, "userRepo.currentUser.flatMapObservable { paymentMethodRepo.fetchAll(it) }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PaymentMethodRepository getPaymentMethodRepo() {
        PaymentMethodRepository r1 = this.paymentMethodRepo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserRepository getUserRepo() {
        UserRepository r1 = this.userRepo;
        return r1;
    }
}
