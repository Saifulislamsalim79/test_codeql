package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.CustomerApi;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: CreateCustomerRequest.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0015\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/CreateCustomerRequest;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "getUserRepository", "()Lai/kudi/agent/users/data/repositories/UserRepository;", "assignCustomerToTrx", "Lio/reactivex/Observable;", "", "customerId", "reference", "Lai/kudi/agent/transactions/domain/usecases/AssignCustomerToTrxBody;", "createCustomer", "Lai/kudi/agent/transactions/domain/usecases/Customer;", "customer", "lookupCustomer", "phoneNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateCustomerRequest {
    private final NetworkService networkService;
    private final UserRepository userRepository;

    public CreateCustomerRequest(NetworkService networkService, UserRepository userRepository) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(userRepository, "userRepository");
        this.networkService = networkService;
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: assignCustomerToTrx$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m41095assignCustomerToTrx$lambda5(CreateCustomerRequest createCustomerRequest, String str, AssignCustomerToTrxBody assignCustomerToTrxBody, User user) {
        Log_OC.getArray(createCustomerRequest, "this$0");
        Log_OC.getArray(str, "$customerId");
        Log_OC.getArray(assignCustomerToTrxBody, "$reference");
        Log_OC.getArray(user, "it");
        NetworkService $r4 = createCustomerRequest.getNetworkService();
        CustomerApi $r5 = $r4.getCustomerApi();
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "it.sessionId");
        AbstractC11688p $r7 = $r5.assignCustomerToTransaction($r6, str, assignCustomerToTrxBody);
        Direction $r8 = Direction.f1627NW;
        return $r7.m10531O($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: assignCustomerToTrx$lambda-5$lambda-4  reason: not valid java name */
    public static final String m41096assignCustomerToTrx$lambda5$lambda4(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "customer");
        Object $r1 = aPIResponse.data;
        String $r2 = (String) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createCustomer$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m41097createCustomer$lambda3(CreateCustomerRequest createCustomerRequest, Customer customer, User user) {
        Log_OC.getArray(createCustomerRequest, "this$0");
        Log_OC.getArray(customer, "$customer");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = createCustomerRequest.getNetworkService();
        CustomerApi $r4 = $r3.getCustomerApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.createCustomer($r5, customer);
        C0608f $r7 = C0608f.f1643o;
        return $r6.m10531O($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createCustomer$lambda-3$lambda-2  reason: not valid java name */
    public static final Customer m41098createCustomer$lambda3$lambda2(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "customer");
        Object $r1 = aPIResponse.data;
        Customer $r2 = (Customer) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41099lookupCustomer$lambda1(CreateCustomerRequest createCustomerRequest, String str, User user) {
        Log_OC.getArray(createCustomerRequest, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = createCustomerRequest.getNetworkService();
        CustomerApi $r4 = $r3.getCustomerApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.lookupCustomer($r5, str);
        C0606c $r7 = C0606c.f1640d;
        return $r6.m10531O($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-1$lambda-0  reason: not valid java name */
    public static final Customer m41100lookupCustomer$lambda1$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "customer");
        Object $r1 = aPIResponse.data;
        Customer $r2 = (Customer) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p assignCustomerToTrx(final String str, final AssignCustomerToTrxBody assignCustomerToTrxBody) {
        Log_OC.getArray(str, "customerId");
        Log_OC.getArray(assignCustomerToTrxBody, "reference");
        UserRepository $r4 = this.userRepository;
        AbstractC11696w $r5 = $r4.getCurrentUser();
        AbstractC11688p $r6 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.domain.usecases.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CreateCustomerRequest $r1 = CreateCustomerRequest.this;
                String $r2 = str;
                AssignCustomerToTrxBody $r3 = assignCustomerToTrxBody;
                User $r62 = (User) obj;
                InterfaceC11692s $r42 = CreateCustomerRequest.m41095assignCustomerToTrx$lambda5($r1, $r2, $r3, $r62);
                return $r42;
            }
        });
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r62 = $r6.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r63 = $r62.R($r72);
        Log_OC.loadImage($r63, "userRepository.currentUser.flatMapObservable {\n            networkService.customerApi.assignCustomerToTransaction(it.sessionId, customerId,\n                    reference)\n                    .map { customer -> customer.data }\n        }.subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r63;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p createCustomer(final Customer customer) {
        Log_OC.getArray(customer, "customer");
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.domain.usecases.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CreateCustomerRequest $r1 = CreateCustomerRequest.this;
                Customer $r2 = customer;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = CreateCustomerRequest.m41097createCustomer$lambda3($r1, $r2, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "userRepository.currentUser.flatMapObservable {\n            networkService.customerApi.createCustomer(it.sessionId, customer)\n                    .map { customer -> customer.data }\n        }.subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserRepository getUserRepository() {
        UserRepository r1 = this.userRepository;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p lookupCustomer(final String str) {
        Log_OC.getArray(str, "phoneNumber");
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.domain.usecases.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CreateCustomerRequest $r1 = CreateCustomerRequest.this;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = CreateCustomerRequest.m41099lookupCustomer$lambda1($r1, $r2, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "userRepository.currentUser.flatMapObservable {\n            networkService.customerApi.lookupCustomer(it.sessionId, phoneNumber)\n                    .map { customer -> customer.data }\n        }.subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }
}
