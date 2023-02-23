package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.domain.package_3.RegistrationRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.RegistrationResponseBody;
import ai.kudi.agent.p036v2.common.domain.package_3.VerificationRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.VerificationResponseBody;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.streaming.CustomerOnboardingResponse;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases.CustomerRegistrationUseCase;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases.CustomerVerificationUseCase;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: ProductCustomerRegistrationSummaryViewModel.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J2\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u001a\u0010\u0018\u001a\u00020\u00112\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016J \u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewModel/ProductCustomerRegistrationSummaryViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewData/ProductCustomerRegistrationSummaryViewData;", "registerCustomer", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/useCases/CustomerRegistrationUseCase;", "verifyCustomerRegistration", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/useCases/CustomerVerificationUseCase;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/v2/productCustomerRegistrationSummary/useCases/CustomerRegistrationUseCase;Lai/kudi/agent/v2/productCustomerRegistrationSummary/useCases/CustomerVerificationUseCase;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "mapOfRegistrationData", "", "", "", "registrationId", "", "initialData", "", "latitude", "", "longitude", "onBoardingData", "", "productCode", "setProductSummary", "mapOfSummary", "verifyCustomer", "token", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel */
/* loaded from: classes.dex */
public final class ProductCustomerRegistrationSummaryViewModel extends BaseViewModel<ProductCustomerRegistrationSummaryViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private Map<String, Object> mapOfRegistrationData;
    private final CustomerRegistrationUseCase registerCustomer;
    private int registrationId;
    private final CustomerVerificationUseCase verifyCustomerRegistration;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductCustomerRegistrationSummaryViewModel(CustomerRegistrationUseCase customerRegistrationUseCase, CustomerVerificationUseCase customerVerificationUseCase, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(customerRegistrationUseCase, "registerCustomer");
        Log_OC.getArray(customerVerificationUseCase, "verifyCustomerRegistration");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.registerCustomer = customerRegistrationUseCase;
        this.verifyCustomerRegistration = customerVerificationUseCase;
        this.fetchCurrentUser = fetchCurrentUser;
        LinkedHashMap $r4 = new LinkedHashMap();
        this.mapOfRegistrationData = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: registerCustomer$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41610registerCustomer$lambda0(ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel, double d, double d2, String str, User user) {
        Log_OC.getArray(productCustomerRegistrationSummaryViewModel, "this$0");
        Log_OC.getArray(str, "$productCode");
        Log_OC.getArray(user, "it");
        CustomerRegistrationUseCase $r5 = productCustomerRegistrationSummaryViewModel.registerCustomer;
        String $r6 = user.getId();
        Log_OC.loadImage($r6, "it.id");
        Map $r3 = productCustomerRegistrationSummaryViewModel.mapOfRegistrationData;
        RegistrationRequestBody $r4 = new RegistrationRequestBody($r6, d, d2, $r3, str);
        AbstractC11688p $r7 = $r5.execute($r4);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: registerCustomer$lambda-1  reason: not valid java name */
    public static final void m41611registerCustomer$lambda1(ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel, CustomerOnboardingResponse customerOnboardingResponse) {
        Log_OC.getArray(productCustomerRegistrationSummaryViewModel, "this$0");
        if (customerOnboardingResponse.getRegistrationResponseBody() != null) {
            boolean $z0 = customerOnboardingResponse.getRegistrationResponseBody().getRequiresVerification();
            ViewData $r3 = productCustomerRegistrationSummaryViewModel.getState();
            Boolean $r5 = Boolean.valueOf($z0);
            ProductCustomerRegistrationSummaryViewData $r4 = ProductCustomerRegistrationSummaryViewData.copy$default((ProductCustomerRegistrationSummaryViewData) $r3, false, false, null, null, $r5, null, null, false, null, false, 495, null);
            productCustomerRegistrationSummaryViewModel.publish($r4);
        }
        String $r6 = customerOnboardingResponse.getMessage();
        Integer $r7 = null;
        if ($r6 != null) {
            String $r62 = customerOnboardingResponse.getMessage();
            Error $r8 = new Error($r62, false, 2, null);
            ViewData $r32 = productCustomerRegistrationSummaryViewModel.getState();
            ProductCustomerRegistrationSummaryViewData $r42 = (ProductCustomerRegistrationSummaryViewData) $r32;
            productCustomerRegistrationSummaryViewModel.publish(ProductCustomerRegistrationSummaryViewData.copy$default($r42, false, false, null, null, null, null, $r8, false, null, false, 447, null));
        }
        RegistrationResponseBody $r2 = customerOnboardingResponse.getRegistrationResponseBody();
        if ($r2 != null) {
            int $i0 = $r2.getRegistrationId();
            $r7 = Integer.valueOf($i0);
        }
        if ($r7 != null) {
            int $i02 = customerOnboardingResponse.getRegistrationResponseBody().getRegistrationId();
            productCustomerRegistrationSummaryViewModel.registrationId = $i02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: registerCustomer$lambda-2  reason: not valid java name */
    public static final void m41612registerCustomer$lambda2(ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel, Throwable th) {
        Log_OC.getArray(productCustomerRegistrationSummaryViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error registering customer", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r1 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = productCustomerRegistrationSummaryViewModel.getState();
        ProductCustomerRegistrationSummaryViewData $r7 = ProductCustomerRegistrationSummaryViewData.copy$default((ProductCustomerRegistrationSummaryViewData) $r6, false, false, null, null, null, null, $r1, false, null, false, 447, null);
        productCustomerRegistrationSummaryViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyCustomer$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m41613verifyCustomer$lambda3(ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel, double d, double d2, String str, User user) {
        Log_OC.getArray(productCustomerRegistrationSummaryViewModel, "this$0");
        Log_OC.getArray(user, "it");
        CustomerVerificationUseCase $r4 = productCustomerRegistrationSummaryViewModel.verifyCustomerRegistration;
        String $r5 = user.getId();
        Log_OC.loadImage($r5, "it.id");
        int $i0 = productCustomerRegistrationSummaryViewModel.registrationId;
        Log_OC.append(str);
        VerificationRequestBody $r3 = new VerificationRequestBody($r5, d, d2, $i0, str);
        AbstractC11688p $r6 = $r4.execute($r3);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyCustomer$lambda-4  reason: not valid java name */
    public static final void m41614verifyCustomer$lambda4(ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel, VerificationResponseBody verificationResponseBody) {
        Log_OC.getArray(productCustomerRegistrationSummaryViewModel, "this$0");
        boolean $z0 = verificationResponseBody.getSuccess();
        ViewData $r2 = productCustomerRegistrationSummaryViewModel.getState();
        Boolean $r4 = Boolean.valueOf($z0);
        ProductCustomerRegistrationSummaryViewData $r3 = ProductCustomerRegistrationSummaryViewData.copy$default((ProductCustomerRegistrationSummaryViewData) $r2, false, false, null, null, null, $r4, null, false, null, false, 863, null);
        productCustomerRegistrationSummaryViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyCustomer$lambda-5  reason: not valid java name */
    public static final void m41615verifyCustomer$lambda5(ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel, Throwable th) {
        Log_OC.getArray(productCustomerRegistrationSummaryViewModel, "this$0");
        ViewData $r3 = productCustomerRegistrationSummaryViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError("Error verifying Customer");
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r1 = new Error((String) $r6, false, 2, null);
        ProductCustomerRegistrationSummaryViewData $r4 = ProductCustomerRegistrationSummaryViewData.copy$default((ProductCustomerRegistrationSummaryViewData) $r3, false, false, null, null, null, null, null, false, $r1, false, 639, null);
        productCustomerRegistrationSummaryViewModel.publish($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ProductCustomerRegistrationSummaryViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ProductCustomerRegistrationSummaryViewData initialData() {
        ProductCustomerRegistrationSummaryViewData $r1 = new ProductCustomerRegistrationSummaryViewData(false, false, null, null, null, null, null, false, null, false, 1023, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void registerCustomer(final double d, final double d2, Map map, final String str) {
        Log_OC.getArray(map, "onBoardingData");
        Log_OC.getArray(str, "productCode");
        ViewData $r3 = getState();
        ProductCustomerRegistrationSummaryViewData $r4 = ProductCustomerRegistrationSummaryViewData.copy$default((ProductCustomerRegistrationSummaryViewData) $r3, false, false, null, null, null, null, null, false, null, true, 511, null);
        publish($r4);
        Map $r5 = this.mapOfRegistrationData;
        $r5.putAll(map);
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ProductCustomerRegistrationSummaryViewModel $r1 = ProductCustomerRegistrationSummaryViewModel.this;
                double $d0 = d;
                double $d1 = d2;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = ProductCustomerRegistrationSummaryViewModel.m41610registerCustomer$lambda0($r1, $d0, $d1, $r2, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductCustomerRegistrationSummaryViewModel $r1 = ProductCustomerRegistrationSummaryViewModel.this;
                CustomerOnboardingResponse $r32 = (CustomerOnboardingResponse) obj;
                ProductCustomerRegistrationSummaryViewModel.m41611registerCustomer$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductCustomerRegistrationSummaryViewModel $r1 = ProductCustomerRegistrationSummaryViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductCustomerRegistrationSummaryViewModel.m41612registerCustomer$lambda2($r1, $r32);
            }
        });
        C11280b $r13 = getCompositeDisposable();
        $r13.b($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setProductSummary(Map map) {
        Log_OC.getArray(map, "mapOfSummary");
        ViewData $r2 = getState();
        ProductCustomerRegistrationSummaryViewData $r3 = ProductCustomerRegistrationSummaryViewData.copy$default((ProductCustomerRegistrationSummaryViewData) $r2, true, false, null, null, null, null, null, false, null, false, 1022, null);
        publish($r3);
        ViewData $r22 = getState();
        ProductCustomerRegistrationSummaryViewData $r32 = (ProductCustomerRegistrationSummaryViewData) $r22;
        publish(ProductCustomerRegistrationSummaryViewData.copy$default($r32, false, false, map, null, null, null, null, false, null, false, 1018, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void verifyCustomer(final double r39, final double r41, final java.lang.String r43) {
        /*
            r38 = this;
            r0 = r38
            int r13 = r0.registrationId
            if (r13 != 0) goto L17
            if (r43 == 0) goto L13
            r0 = r43
            int r13 = r0.length()
            if (r13 != 0) goto L11
            goto L13
        L11:
            r14 = 0
            goto L14
        L13:
            r14 = 1
        L14:
            if (r14 == 0) goto L17
            return
        L17:
            r0 = r38
            ai.kudi.agent.core.mvvm.ViewData r15 = r0.getState()
            r17 = r15
            ai.kudi.agent.v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData r17 = (ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData) r17
            r16 = r17
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 895(0x37f, float:1.254E-42)
            r29 = 0
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            ai.kudi.agent.v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData r16 = ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r38
            r1 = r16
            r0.publish(r1)
            r0 = r38
            ai.kudi.agent.users.domain.usecases.FetchCurrentUser r0 = r0.fetchCurrentUser
            r30 = r0
            r20 = 0
            r21 = 0
            r18 = 3
            r22 = 0
            r0 = r30
            r1 = r20
            r2 = r21
            r3 = r18
            r4 = r22
            j.e.w r31 = ai.kudi.agent.users.domain.usecases.FetchCurrentUser.execute$default(r0, r1, r2, r3, r4)
            ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.ClassWriter r32 = new ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.ClassWriter
            r0 = r32
            r1 = r38
            r2 = r39
            r4 = r41
            r6 = r43
            r0.<init>()
            r0 = r31
            r1 = r32
            j.e.p r33 = r0.m10440j(r1)
            ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.Chunk r34 = new ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.Chunk
            r0 = r34
            r1 = r38
            r0.<init>()
            ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.MultiDexExtractor$1 r35 = new ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.MultiDexExtractor$1
            r0 = r35
            r1 = r38
            r0.<init>()
            r0 = r33
            r1 = r34
            r2 = r35
            j.e.c0.FavoritesArrayAdapter r36 = r0.e0(r1, r2)
            r0 = r38
            j.e.c0.b r37 = r0.getCompositeDisposable()
            r0 = r37
            r1 = r36
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel.verifyCustomer(double, double, java.lang.String):void");
    }
}
