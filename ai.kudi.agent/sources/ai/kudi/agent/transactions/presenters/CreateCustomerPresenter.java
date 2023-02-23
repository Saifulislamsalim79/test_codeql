package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.domain.usecases.AssignCustomerToTrxBody;
import ai.kudi.agent.transactions.domain.usecases.CreateCustomerRequest;
import ai.kudi.agent.transactions.domain.usecases.Customer;
import ai.kudi.agent.transactions.views.CreateCustomerView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
import retrofit2.HttpException;
/* compiled from: CreateCustomerPresenter.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\tH\u0016J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/CreateCustomerPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactions/views/CreateCustomerView;", "createCustomerRequest", "Lai/kudi/agent/transactions/domain/usecases/CreateCustomerRequest;", "(Lai/kudi/agent/transactions/domain/usecases/CreateCustomerRequest;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "assignCustomerToTransaction", "", "customerId", "", "customerName", "reference", "assignCustomerToTransactionRx", "Lio/reactivex/Observable;", "createCustomer", "phoneNumber", "fullName", "transactionRef", "destroy", "lookupCustomer", "validateFields", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateCustomerPresenter extends C9410b<CreateCustomerView> {
    private final C11280b compositeDisposable;
    private final CreateCustomerRequest createCustomerRequest;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateCustomerPresenter(CreateCustomerRequest createCustomerRequest) {
        Log_OC.getArray(createCustomerRequest, "createCustomerRequest");
        this.createCustomerRequest = createCustomerRequest;
        C11280b $r2 = new C11280b();
        this.compositeDisposable = $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assignCustomerToTransaction$lambda-15  reason: not valid java name */
    public static final void m41126assignCustomerToTransaction$lambda15(CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "it");
        createCustomerView.showAddCustomerLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: assignCustomerToTransaction$lambda-17  reason: not valid java name */
    public static final void m41127assignCustomerToTransaction$lambda17(CreateCustomerPresenter createCustomerPresenter, final String str, String str2) {
        Log_OC.getArray(createCustomerPresenter, "this$0");
        Log_OC.getArray(str, "$customerName");
        createCustomerPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: f */
            public final void m38274f(Object obj) {
                String $r1 = str;
                CreateCustomerView $r3 = (CreateCustomerView) obj;
                CreateCustomerPresenter.m41128assignCustomerToTransaction$lambda17$lambda16($r1, $r3);
            }
        });
        String $r1 = Log_OC.m10359a("Success ", (Object) str2);
        Object[] $r4 = new Object[0];
        Timber.m1627e($r1, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assignCustomerToTransaction$lambda-17$lambda-16  reason: not valid java name */
    public static final void m41128assignCustomerToTransaction$lambda17$lambda16(String str, CreateCustomerView createCustomerView) {
        Log_OC.getArray(str, "$customerName");
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.hideAddCustomerLoader();
        createCustomerView.showAddCustomerSuccessful(false, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: assignCustomerToTransaction$lambda-19  reason: not valid java name */
    public static final void m41129assignCustomerToTransaction$lambda19(CreateCustomerPresenter createCustomerPresenter, final Throwable th) {
        Log_OC.getArray(createCustomerPresenter, "this$0");
        createCustomerPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Sequence
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTarget(Object obj) {
                Throwable $r1 = th;
                CreateCustomerView $r3 = (CreateCustomerView) obj;
                CreateCustomerPresenter.m41130assignCustomerToTransaction$lambda19$lambda18($r1, $r3);
            }
        });
        String $r0 = Log_OC.m10359a("Error ", th);
        Object[] $r4 = new Object[0];
        Timber.m1627e($r0, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: assignCustomerToTransaction$lambda-19$lambda-18  reason: not valid java name */
    public static final void m41130assignCustomerToTransaction$lambda19$lambda18(Throwable th, CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.hideAddCustomerLoader();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = Log_OC.m10359a("Assigning error ", $r3);
        createCustomerView.showError($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p assignCustomerToTransactionRx(String str, String str2) {
        CreateCustomerRequest $r2 = this.createCustomerRequest;
        AssignCustomerToTrxBody $r3 = new AssignCustomerToTrxBody(str2);
        AbstractC11688p $r4 = $r2.assignCustomerToTrx(str, $r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createCustomer$lambda-11  reason: not valid java name */
    public static final void m41131createCustomer$lambda11(CreateCustomerPresenter createCustomerPresenter, final Throwable th) {
        Log_OC.getArray(createCustomerPresenter, "this$0");
        createCustomerPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.NavigationMenuPresenter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38273e(Object obj) {
                Throwable $r1 = th;
                CreateCustomerView $r3 = (CreateCustomerView) obj;
                CreateCustomerPresenter.m41132createCustomer$lambda11$lambda10($r1, $r3);
            }
        });
        String $r0 = Log_OC.m10359a("Error ", th);
        Object[] $r4 = new Object[0];
        Timber.m1627e($r0, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createCustomer$lambda-11$lambda-10  reason: not valid java name */
    public static final void m41132createCustomer$lambda11$lambda10(Throwable th, CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.hideAddCustomerLoader();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Creating error Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        createCustomerView.showError($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createCustomer$lambda-6  reason: not valid java name */
    public static final void m41133createCustomer$lambda6(CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "it");
        createCustomerView.showAddCustomerLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createCustomer$lambda-7  reason: not valid java name */
    public static final InterfaceC11692s m41134createCustomer$lambda7(CreateCustomerPresenter createCustomerPresenter, String str, Customer customer) {
        Log_OC.getArray(createCustomerPresenter, "this$0");
        Log_OC.getArray(str, "$transactionRef");
        Log_OC.getArray(customer, "it");
        String $r3 = customer.getId();
        Log_OC.append($r3);
        AbstractC11688p $r4 = createCustomerPresenter.assignCustomerToTransactionRx($r3, str);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createCustomer$lambda-9  reason: not valid java name */
    public static final void m41135createCustomer$lambda9(CreateCustomerPresenter createCustomerPresenter, final String str, String str2) {
        Log_OC.getArray(createCustomerPresenter, "this$0");
        Log_OC.getArray(str, "$fullName");
        createCustomerPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Score
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void calculate(Object obj) {
                String $r1 = str;
                CreateCustomerView $r3 = (CreateCustomerView) obj;
                CreateCustomerPresenter.m41136createCustomer$lambda9$lambda8($r1, $r3);
            }
        });
        String $r1 = Log_OC.m10359a("Success ", (Object) str2);
        Object[] $r4 = new Object[0];
        Timber.m1627e($r1, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createCustomer$lambda-9$lambda-8  reason: not valid java name */
    public static final void m41136createCustomer$lambda9$lambda8(String str, CreateCustomerView createCustomerView) {
        Log_OC.getArray(str, "$fullName");
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.hideAddCustomerLoader();
        createCustomerView.showAddCustomerSuccessful(true, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lookupCustomer$lambda-0  reason: not valid java name */
    public static final void m41137lookupCustomer$lambda0(CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.showPhoneNumberError("Phone number is invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lookupCustomer$lambda-1  reason: not valid java name */
    public static final void m41138lookupCustomer$lambda1(CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "it");
        createCustomerView.showLookupLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-3  reason: not valid java name */
    public static final void m41139lookupCustomer$lambda3(CreateCustomerPresenter createCustomerPresenter, final Customer customer) {
        Log_OC.getArray(createCustomerPresenter, "this$0");
        createCustomerPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.MapOverlay
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onStop(Object obj) {
                Customer $r1 = Customer.this;
                CreateCustomerView $r3 = (CreateCustomerView) obj;
                CreateCustomerPresenter.m41140lookupCustomer$lambda3$lambda2($r1, $r3);
            }
        });
        String $r0 = Log_OC.m10359a("Success ", customer);
        Object[] $r4 = new Object[0];
        Timber.m1627e($r0, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41140lookupCustomer$lambda3$lambda2(Customer customer, CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.hideLookupLoader();
        String $r2 = customer.getId();
        String $r3 = customer.getName();
        createCustomerView.showCustomerName($r2, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-5  reason: not valid java name */
    public static final void m41141lookupCustomer$lambda5(CreateCustomerPresenter createCustomerPresenter, final Throwable th) {
        Log_OC.getArray(createCustomerPresenter, "this$0");
        createCustomerPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.UnitTest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void check(Object obj) {
                Throwable $r1 = th;
                CreateCustomerView $r3 = (CreateCustomerView) obj;
                CreateCustomerPresenter.m41142lookupCustomer$lambda5$lambda4($r1, $r3);
            }
        });
        String $r0 = Log_OC.m10359a("Error ", th);
        Object[] $r4 = new Object[0];
        Timber.m1627e($r0, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41142lookupCustomer$lambda5$lambda4(Throwable th, CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.hideLookupLoader();
        if (th == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type retrofit2.HttpException");
            throw $r6;
        }
        HttpException $r2 = (HttpException) th;
        int $i0 = $r2.m352a();
        if ($i0 == 404) {
            createCustomerView.showCustomerName(null, null);
            return;
        }
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Object $r4 = $r3.invoke(th);
        String $r5 = Log_OC.m10359a("Look up error ", $r4);
        createCustomerView.showError($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean validateFields(String str, String str2) {
        int $i0 = str.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            C0613b $r3 = C0613b.f1691c;
            ifViewAttached($r3);
            return false;
        }
        boolean $z02 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z02) {
            RuleMemberValidator $r4 = RuleMemberValidator.RULE_VALIDATOR;
            ifViewAttached($r4);
            return false;
        }
        int $i02 = str2.length();
        boolean $z03 = $i02 == 0;
        if ($z03) {
            UnsignedInteger $r5 = UnsignedInteger.ONE;
            ifViewAttached($r5);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-12  reason: not valid java name */
    public static final void m41143validateFields$lambda12(CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.showPhoneNumberError("Phone number cannot be blank");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-13  reason: not valid java name */
    public static final void m41144validateFields$lambda13(CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.showPhoneNumberError("Phone number is invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-14  reason: not valid java name */
    public static final void m41145validateFields$lambda14(CreateCustomerView createCustomerView) {
        Log_OC.getArray(createCustomerView, "view");
        createCustomerView.showNameError("Name cannot be blank");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void assignCustomerToTransaction(String str, final String str2, String str3) {
        Log_OC.getArray(str, "customerId");
        Log_OC.getArray(str2, "customerName");
        Log_OC.getArray(str3, "reference");
        State $r5 = State.completed;
        ifViewAttached($r5);
        CreateCustomerRequest $r6 = this.createCustomerRequest;
        AssignCustomerToTrxBody $r1 = new AssignCustomerToTrxBody(str3);
        AbstractC11688p $r7 = $r6.assignCustomerToTrx(str, $r1);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.ThreadFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateCustomerPresenter $r12 = CreateCustomerPresenter.this;
                String $r2 = str2;
                String $r4 = (String) obj;
                CreateCustomerPresenter.m41127assignCustomerToTransaction$lambda17($r12, $r2, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateCustomerPresenter $r12 = CreateCustomerPresenter.this;
                Throwable $r3 = (Throwable) obj;
                CreateCustomerPresenter.m41129assignCustomerToTransaction$lambda19($r12, $r3);
            }
        });
        Log_OC.loadImage($r10, "createCustomerRequest.assignCustomerToTrx(\n            customerId,\n            AssignCustomerToTrxBody(\n                transactionRef = reference\n            )\n        )\n            .subscribe(\n                {\n                    ifViewAttached { view ->\n                        view.hideAddCustomerLoader()\n                        view.showAddCustomerSuccessful(false, customerName)\n                    }\n                    Timber.e(\"Success $it\")\n                },\n                {\n                    ifViewAttached { view ->\n                        view.hideAddCustomerLoader()\n                        view.showError(\n                            \"Assigning error \" + parseHttpError2(\n                                \"Something went wrong\"\n                            )(it)\n                        )\n                    }\n                    Timber.e(\"Error $it\")\n                })");
        C11280b $r11 = this.compositeDisposable;
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createCustomer(String str, final String str2, final String str3) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "fullName");
        Log_OC.getArray(str3, "transactionRef");
        boolean $z0 = validateFields(str, str2);
        if ($z0) {
            C0616f $r5 = C0616f.f1695o;
            ifViewAttached($r5);
            CreateCustomerRequest $r6 = this.createCustomerRequest;
            Customer $r1 = new Customer(null, str, str2, 1, null);
            AbstractC11688p $r7 = $r6.createCustomer($r1);
            FavoritesArrayAdapter $r11 = $r7.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.presenters.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    CreateCustomerPresenter $r12 = CreateCustomerPresenter.this;
                    String $r2 = str3;
                    Customer $r52 = (Customer) obj;
                    InterfaceC11692s $r3 = CreateCustomerPresenter.m41134createCustomer$lambda7($r12, $r2, $r52);
                    return $r3;
                }
            }).e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.SimpleXYSeries
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreateCustomerPresenter $r12 = CreateCustomerPresenter.this;
                    String $r2 = str2;
                    String $r4 = (String) obj;
                    CreateCustomerPresenter.m41135createCustomer$lambda9($r12, $r2, $r4);
                }
            }, new Object() { // from class: ai.kudi.agent.transactions.presenters.OrFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreateCustomerPresenter $r12 = CreateCustomerPresenter.this;
                    Throwable $r3 = (Throwable) obj;
                    CreateCustomerPresenter.m41131createCustomer$lambda11($r12, $r3);
                }
            });
            Log_OC.loadImage($r11, "createCustomerRequest.createCustomer(\n                Customer(\n                    phoneNumber = phoneNumber,\n                    name = fullName\n                )\n            ).flatMap {\n                assignCustomerToTransactionRx(it.id!!, transactionRef)\n            }.subscribe(\n                {\n                    ifViewAttached { view ->\n                        view.hideAddCustomerLoader()\n                        view.showAddCustomerSuccessful(true, fullName)\n                    }\n                    Timber.e(\"Success $it\")\n                },\n                {\n                    ifViewAttached { view ->\n                        view.hideAddCustomerLoader()\n                        view.showError(\n                            parseHttpError2(\"Creating error \" + \"Something went wrong\")(it)\n                        )\n                    }\n                    Timber.e(\"Error $it\")\n                }\n            )");
            C11280b $r12 = this.compositeDisposable;
            RxExtKt.addTo($r11, $r12);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void lookupCustomer(String str) {
        Log_OC.getArray(str, "phoneNumber");
        boolean $z0 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z0) {
            MediaType $r3 = MediaType.BZIP2;
            ifViewAttached($r3);
            return;
        }
        Type $r4 = Type.ROW;
        ifViewAttached($r4);
        CreateCustomerRequest $r5 = this.createCustomerRequest;
        AbstractC11688p $r6 = $r5.lookupCustomer(str);
        FavoritesArrayAdapter $r8 = $r6.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateCustomerPresenter $r1 = CreateCustomerPresenter.this;
                Customer $r32 = (Customer) obj;
                CreateCustomerPresenter.m41139lookupCustomer$lambda3($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateCustomerPresenter $r1 = CreateCustomerPresenter.this;
                Throwable $r32 = (Throwable) obj;
                CreateCustomerPresenter.m41141lookupCustomer$lambda5($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "createCustomerRequest.lookupCustomer(phoneNumber).subscribe(\n                {\n                    ifViewAttached { view ->\n                        view.hideLookupLoader()\n                        view.showCustomerName(it.id, it.name)\n                    }\n                    Timber.e(\"Success $it\")\n                }, {\n\n                    ifViewAttached { view ->\n                        view.hideLookupLoader()\n                        if ((it as HttpException).code() == 404) {\n                            view.showCustomerName(null, null)\n                        } else {\n                            view.showError(\n                                \"Look up error \" + parseHttpError2(\"Something went wrong\")(\n                                    it\n                                )\n                            )\n                        }\n\n                    }\n                    Timber.e(\"Error $it\")\n                })");
        C11280b $r9 = this.compositeDisposable;
        RxExtKt.addTo($r8, $r9);
    }
}
